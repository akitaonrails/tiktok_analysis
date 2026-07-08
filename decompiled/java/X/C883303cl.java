package X;

import Y.ACListenerS38S0210000_1;
import Y.AComparatorS20S0000000_1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommonRetainDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ContentBlock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.FrequencyLimit;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.HeaderBlock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayloadTemplate;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RetainInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.VoucherRetainDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.TimeStampRecorder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.TimeStampStore;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S1600000_1;
import kotlin.jvm.internal.AwS20S1400000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C883303cl implements InterfaceC866403a2 {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static boolean LIZIZ;
    public static boolean LIZJ;

    public static boolean LJIIJ() {
        IECommerceHostService iECommerceHostService;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            return Keva.getRepo("pipo_tts_cashier_debug").getBoolean("enable_payment_retention_frequency_limit", true);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public static boolean LIZLLL(List list) {
        FrequencyLimit frequencyLimit;
        ?? arrayList;
        TimeStampRecorder next;
        int size;
        List<Long> list2;
        Type type;
        RetainInfo retainInfoLJFF = LJFF(list);
        if (retainInfoLJFF == null) {
            return false;
        }
        try {
            if (LIZJ) {
                return false;
            }
            List<FrequencyLimit> list3 = retainInfoLJFF.frequencyLimitList;
            if (list3 != null) {
                frequencyLimit = (FrequencyLimit) C13LP.LJJJLL(list3);
            } else {
                frequencyLimit = null;
            }
            boolean z = true;
            if (frequencyLimit == null) {
                return true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            List<FrequencyLimit> list4 = retainInfoLJFF.frequencyLimitList;
            if (list4 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list4, 10));
                Iterator<FrequencyLimit> it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new TimeStampRecorder(it2.next().windowSec, C13BV.INSTANCE, null, 4, null));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            TimeStampStore timeStampStore = new TimeStampStore(arrayList);
            String string = C1257480ipO.LIZ.getString("ec_add_card_retention_promotion", C1741890vQh.LJIIIIZZ(timeStampStore));
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(TimeStampStore.class));
                } else {
                    type = new TypeToken<TimeStampStore>() { // from class: X.03cp
                    }.getType();
                }
                Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(string, type);
                if (!(objLJIIIIZZ instanceof TimeStampStore)) {
                    objLJIIIIZZ = null;
                }
                TimeStampStore timeStampStore2 = (TimeStampStore) objLJIIIIZZ;
                if (timeStampStore2 != null) {
                    timeStampStore = timeStampStore2;
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            List<FrequencyLimit> list5 = retainInfoLJFF.frequencyLimitList;
            if (list5 != null) {
                loop1: while (true) {
                    z = true;
                    for (FrequencyLimit frequencyLimit2 : list5) {
                        int i = frequencyLimit2.windowSec;
                        long j = jCurrentTimeMillis - ((long) i);
                        Iterator<TimeStampRecorder> it3 = timeStampStore.recorders.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (next.window == i) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        TimeStampRecorder timeStampRecorder = next;
                        if (timeStampRecorder != null && (list2 = timeStampRecorder.records) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Long l : list2) {
                                if (l.longValue() >= j) {
                                    arrayList2.add(l);
                                }
                            }
                            size = arrayList2.size();
                        } else {
                            size = 0;
                        }
                        if (!z || size >= frequencyLimit2.limit) {
                            z = false;
                        }
                    }
                }
            }
            return z;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LIZIZ();
            return false;
        }
    }

    public static RetainInfo LJFF(List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((RetainInfo) next).type, "retain_type_save_card")) {
                obj = next;
                break;
            }
        }
        return (RetainInfo) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    public static void LJIIIZ(RetainInfo retainInfo) {
        ?? arrayList;
        TimeStampStore timeStampStore;
        TimeStampRecorder next;
        ArrayList arrayList2;
        List<Long> list;
        Type type;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        List<FrequencyLimit> list2 = retainInfo.frequencyLimitList;
        if (list2 != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<FrequencyLimit> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new TimeStampRecorder(it2.next().windowSec, C13BV.INSTANCE, null, 4, null));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        TimeStampStore timeStampStore2 = new TimeStampStore(arrayList);
        String string = C1257480ipO.LIZ.getString("ec_add_card_retention_promotion", C1741890vQh.LJIIIIZZ(timeStampStore2));
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(TimeStampStore.class));
            } else {
                type = new TypeToken<TimeStampStore>() { // from class: X.03co
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string, type);
            if (!(objFromJson instanceof TimeStampStore)) {
                objFromJson = null;
            }
            timeStampStore = (TimeStampStore) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (timeStampStore == null) {
            timeStampStore = timeStampStore2;
        }
        List<TimeStampRecorder> list3 = timeStampStore2.recorders;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        for (TimeStampRecorder timeStampRecorder : list3) {
            Iterator<TimeStampRecorder> it3 = timeStampStore.recorders.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (next.window == timeStampRecorder.window) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TimeStampRecorder timeStampRecorder2 = next;
            if (timeStampRecorder2 != null && (list = timeStampRecorder2.records) != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Long l : list) {
                    if (l.longValue() >= jCurrentTimeMillis - ((long) timeStampRecorder.window)) {
                        arrayList4.add(l);
                    }
                }
                arrayList2 = new ArrayList(arrayList4);
            } else {
                arrayList2 = new ArrayList();
            }
            arrayList2.add(Long.valueOf(jCurrentTimeMillis));
            arrayList3.add(new TimeStampRecorder(timeStampRecorder.window, C13LP.LLIIII(arrayList2), null, 4, null));
        }
        C1257480ipO.LIZ.storeString("ec_add_card_retention_promotion", C1741890vQh.LJIIIIZZ(new TimeStampStore(arrayList3)));
        LIZJ = true;
    }

    public static List LJ(String str, List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                RetainInfo retainInfo = (RetainInfo) obj;
                if (Intrinsics.LJFF(retainInfo.scene, "switch_payment_method") && Intrinsics.LJFF(retainInfo.type, str)) {
                    arrayList.add(obj);
                }
            }
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS20S0000000_1(1), arrayList);
            if (listLJLLLL != null) {
                return listLJLLLL;
            }
        }
        return C13BV.INSTANCE;
    }

    public static boolean LJI(PaymentMethod paymentMethod, RetainInfo retainInfo) {
        String str;
        TimeStampStore timeStampStore;
        Type type;
        try {
            List<String> list = retainInfo.paymentMethodsList;
            boolean z = true;
            if (list != null) {
                if (paymentMethod == null) {
                    str = null;
                } else {
                    str = paymentMethod.id;
                }
                if (C13LP.LJJJJ(str, list)) {
                    if (!LJIIJ()) {
                        return true;
                    }
                    if (LIZIZ) {
                        return false;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    String string = C1257480ipO.LIZ.getString("ec_switch_payment_promotion", C1741890vQh.LJIIIIZZ(new TimeStampStore(null, 1, null)));
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type = C2371409Qy.LIZJ(C13LE.LJII(TimeStampStore.class));
                        } else {
                            type = new TypeToken<TimeStampStore>() { // from class: X.03cn
                            }.getType();
                        }
                        Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(string, type);
                        if (!(objLJIIIIZZ instanceof TimeStampStore)) {
                            objLJIIIIZZ = null;
                        }
                        timeStampStore = (TimeStampStore) objLJIIIIZZ;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (timeStampStore == null) {
                        timeStampStore = new TimeStampStore(null, 1, null);
                    }
                    String str2 = retainInfo.group;
                    if (str2 == null) {
                        str2 = "";
                    }
                    List<FrequencyLimit> list2 = retainInfo.frequencyLimitList;
                    if (list2 != null) {
                        z = true;
                        for (FrequencyLimit frequencyLimit : list2) {
                            int i = frequencyLimit.windowSec;
                            long j = jCurrentTimeMillis - ((long) i);
                            List<TimeStampRecorder> list3 = timeStampStore.recorders;
                            ArrayList arrayList = new ArrayList();
                            for (TimeStampRecorder timeStampRecorder : list3) {
                                TimeStampRecorder timeStampRecorder2 = timeStampRecorder;
                                if (timeStampRecorder2.window == i) {
                                    String str3 = timeStampRecorder2.group;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    if (Intrinsics.LJFF(str3, str2)) {
                                        arrayList.add(timeStampRecorder);
                                    }
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                C19719612Di.LJJI(((TimeStampRecorder) it2.next()).records, arrayList2);
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : arrayList2) {
                                if (((Number) obj).longValue() >= j) {
                                    arrayList3.add(obj);
                                }
                            }
                            int size = arrayList3.size();
                            if (z && size < frequencyLimit.limit) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                    }
                    return z;
                }
            }
            return false;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1AF0.LIZIZ();
            return false;
        }
    }

    public final void LJIIJJI(Context context, List<RetainInfo> list, Function1<? super EnumC884003cs, Unit> function1) {
        Object c098200Yq;
        C19EG c19eg;
        CommonRetainDisplayInfo commonRetainDisplayInfo;
        AwS367S0200000_1 awS367S0200000_1 = new AwS367S0200000_1(new AtomicBoolean(false), (AtomicBoolean) function1, (Function1<? super EnumC884003cs, Unit>) 108);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null) {
            RetainInfo retainInfoLJFF = LJFF(list);
            if (retainInfoLJFF == null) {
                awS367S0200000_1.invoke(EnumC884003cs.CLICK_CLOSE);
                return;
            }
            PayloadTemplate payloadTemplate = retainInfoLJFF.payloadTemplate;
            if (payloadTemplate != null && (commonRetainDisplayInfo = payloadTemplate.commonRetainDisplayInfo) != null) {
                HeaderBlock headerBlock = commonRetainDisplayInfo.header;
                List list2 = commonRetainDisplayInfo.dialogButtons;
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                View viewLIZJ = LIZJ(context, headerBlock, commonRetainDisplayInfo, list2, awS367S0200000_1);
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LJIIIIZZ(1);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJIIJIL = true;
                tuxSheet.LLJJIII = viewLIZJ;
                tuxSheet.LLJLILLLLZIIL = false;
                tuxSheet.LLJLLL = false;
                tuxSheet.LLILLL = true;
                tuxSheet.LLJLLIL = true;
                tuxSheet.LL = new C04JN(awS367S0200000_1, 2);
                tuxSheet.LLILLJJLI = new C04JS(awS367S0200000_1, 3);
                int iLIZJ = (int) (((double) C958103op.LIZJ()) * 0.73d);
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLJJL = iLIZJ;
                LJIIIZ(retainInfoLJFF);
                tuxSheet2.show(c19eg.getSupportFragmentManager(), "save_common_retain");
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C1AF0.LJ(thM5exceptionOrNullimpl);
                    awS367S0200000_1.invoke(EnumC884003cs.CLICK_CLOSE);
                    return;
                }
                return;
            }
            awS367S0200000_1.invoke(EnumC884003cs.CLICK_CLOSE);
            return;
        }
        awS367S0200000_1.invoke(EnumC884003cs.CLICK_CLOSE);
    }

    public static void LJII(Context context, HeaderBlock headerBlock, CommonRetainDisplayInfo commonRetainDisplayInfo, LinearLayout linearLayout, Integer num) {
        Icon icon;
        Image imageRequireImage;
        Image imageRequireImage2;
        int iIntValue;
        String str;
        if (headerBlock != null) {
            icon = headerBlock.icon;
        } else {
            icon = null;
        }
        SmartImageView smartImageView = new SmartImageView(context);
        C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(147))));
        smartImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.r_;
        Drawable drawableLIZ = c0hti.LIZ(context);
        if (icon != null) {
            imageRequireImage = icon.requireImage(context);
        } else {
            imageRequireImage = null;
        }
        if (imageRequireImage != null) {
            String uri = imageRequireImage.getUri();
            if (uri == null || uri.length() == 0) {
                uri = " ";
            }
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(uri);
            Drawable drawableLJ = C1308910kAL.LJ(R.attr.c7, context);
            EnumC1338240kve enumC1338240kve = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LIZLLL.LJIILL = drawableLJ;
            c1331670kl3LIZLLL.LJIILLIIL = enumC1338240kve;
            c1331670kl3LIZLLL.LJJ = enumC1338240kve;
            c1331670kl3LIZLLL.LJJ(smartImageView);
            c1331670kl3LIZLLL.LJIIJ(new C04J2(smartImageView, 0));
        } else {
            smartImageView.setImageDrawable(drawableLIZ);
        }
        linearLayout.addView(smartImageView);
        int i = -2;
        if (headerBlock != null && (str = headerBlock.title) != null && (!a0.LJJJIL(str))) {
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            C786410Ut5.R6(tuxTextView, layoutParams);
            tuxTextView.setTuxFont(123);
            tuxTextView.setTextColorRes(R.attr.a1h);
            tuxTextView.LJJJJI(28.0f);
            tuxTextView.setText(C933003km.LIZ(str));
            tuxTextView.setGravity(1);
            linearLayout.addView(tuxTextView);
        }
        List<ContentBlock> list = commonRetainDisplayInfo.content;
        if (list != null) {
            for (ContentBlock contentBlock : list) {
                String str2 = contentBlock.text;
                if (str2 != null && (!a0.LJJJIL(str2))) {
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i);
                    layoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    C786410Ut5.d6(linearLayout2, layoutParams2);
                    linearLayout2.setOrientation(0);
                    linearLayout2.setGravity(48);
                    Icon icon2 = contentBlock.prefixIcon;
                    if (icon2 != null && (imageRequireImage2 = icon2.requireImage(context)) != null) {
                        int iLIZIZ = C0H9H.LIZIZ(24);
                        int iLIZIZ2 = C0H9H.LIZIZ(24);
                        SmartImageView smartImageView2 = new SmartImageView(context);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iLIZIZ, iLIZIZ2);
                        layoutParams3.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                        C786410Ut5.G6(smartImageView2, layoutParams3);
                        if (num != null) {
                            Integer numLIZ = C1308910kAL.LIZ(num.intValue(), context);
                            if (numLIZ != null) {
                                iIntValue = numLIZ.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            smartImageView2.setColorFilter(iIntValue);
                        }
                        String uri2 = imageRequireImage2.getUri();
                        if (uri2 == null || uri2.length() == 0) {
                            uri2 = " ";
                        }
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(uri2);
                        Drawable drawableLJ2 = C1308910kAL.LJ(R.attr.c7, context);
                        EnumC1338240kve enumC1338240kve2 = EnumC1338240kve.FIT_CENTER;
                        c1331670kl3LIZLLL2.LJIILL = drawableLJ2;
                        c1331670kl3LIZLLL2.LJIILLIIL = enumC1338240kve2;
                        c1331670kl3LIZLLL2.LJJ = enumC1338240kve2;
                        c1331670kl3LIZLLL2.LJJ(smartImageView2);
                        C786410Ut5.h3(c1331670kl3LIZLLL2);
                        linearLayout2.addView(smartImageView2);
                    }
                    TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
                    C786410Ut5.R6(tuxTextView2, new LinearLayout.LayoutParams(-1, -2));
                    tuxTextView2.setTuxFont(41);
                    tuxTextView2.setTextColorRes(R.attr.a1j);
                    tuxTextView2.setText(C933003km.LIZ(str2));
                    linearLayout2.addView(tuxTextView2);
                    linearLayout.addView(linearLayout2);
                }
                i = -2;
            }
        }
    }

    public final View LIZJ(Context context, HeaderBlock headerBlock, CommonRetainDisplayInfo commonRetainDisplayInfo, List list, AwS367S0200000_1 awS367S0200000_1) {
        int i;
        int i2;
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        C21578619ce c21578619ce = new C21578619ce(context);
        C786410Ut5.o6(c21578619ce, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        c21578619ce.setFillViewport(true);
        LinearLayout linearLayout2 = new LinearLayout(context);
        C786410Ut5.d6(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setOrientation(1);
        LJII(context, headerBlock, commonRetainDisplayInfo, linearLayout2, null);
        if (linearLayout2.getChildCount() != 0) {
            c21578619ce.addView(linearLayout2);
            linearLayout.addView(c21578619ce);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C786410Ut5.d6(linearLayout3, layoutParams);
        Integer num = commonRetainDisplayInfo.buttonDirection;
        if (num != null && num.intValue() == 1) {
            i = 0;
        } else {
            i = 1;
        }
        linearLayout3.setOrientation(i);
        DialogButton dialogButton = (DialogButton) C13LP.LJJJLZIJ(0, list);
        DialogButton dialogButton2 = (DialogButton) C13LP.LJJJLZIJ(1, list);
        TuxTextView tuxTextViewLIZIZ = LIZIZ(this, context, dialogButton, 0, linearLayout, new AwS545S0100000_1(awS367S0200000_1, 1230), false, 96);
        TuxTextView tuxTextViewLIZIZ2 = LIZIZ(this, context, dialogButton2, -1, linearLayout, new AwS545S0100000_1(awS367S0200000_1, 1231), false, 96);
        Integer num2 = commonRetainDisplayInfo.buttonDirection;
        if (num2 != null && num2.intValue() == 1) {
            if (tuxTextViewLIZIZ != null) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), 1.0f);
                layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                C786410Ut5.W5(tuxTextViewLIZIZ, layoutParams2);
                linearLayout3.addView(tuxTextViewLIZIZ);
            }
            if (tuxTextViewLIZIZ2 != null) {
                C786410Ut5.W5(tuxTextViewLIZIZ2, new LinearLayout.LayoutParams(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), 1.0f));
                linearLayout3.addView(tuxTextViewLIZIZ2);
            }
        } else {
            if (tuxTextViewLIZIZ != null) {
                i2 = -1;
                C786410Ut5.W5(tuxTextViewLIZIZ, new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))));
                linearLayout3.addView(tuxTextViewLIZIZ);
            } else {
                i2 = -1;
            }
            if (tuxTextViewLIZIZ2 != null) {
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
                layoutParams3.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                C786410Ut5.W5(tuxTextViewLIZIZ2, layoutParams3);
                linearLayout3.addView(tuxTextViewLIZIZ2);
            }
        }
        linearLayout.addView(linearLayout3);
        return linearLayout;
    }

    public final void LJIIIIZZ(Context context, RetainInfo retainInfo, Function0<Unit> function0, Function0<Unit> function02, InterfaceC883403cm interfaceC883403cm, Function0<Unit> function03, PaymentMethod paymentMethod) {
        VoucherRetainDisplayInfo voucherRetainDisplayInfo;
        String strLJJIIZ;
        PayloadTemplate payloadTemplate = retainInfo.payloadTemplate;
        if (payloadTemplate != null && (voucherRetainDisplayInfo = payloadTemplate.displayInfo) != null) {
            if (paymentMethod != null) {
                strLJJIIZ = paymentMethod.LJJIIZ();
            } else {
                strLJJIIZ = null;
            }
            Map<String, String> map = retainInfo.params;
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            String str = voucherRetainDisplayInfo.iconUrl;
            ConstraintLayout constraintLayout = new ConstraintLayout(context);
            C786410Ut5.m6(constraintLayout, new C19ME(-1, -2));
            constraintLayout.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            SmartImageView smartImageView = new SmartImageView(context);
            C19ME c19me = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(278)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(119)));
            c19me.topToTop = 0;
            c19me.bottomToBottom = 0;
            c19me.startToStart = 0;
            c19me.endToEnd = 0;
            C786410Ut5.G6(smartImageView, c19me);
            if (str == null) {
                str = " ";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            Drawable drawableLJ = C1308910kAL.LJ(R.attr.c7, context);
            EnumC1338240kve enumC1338240kve = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LJIIIZ.LJIILL = drawableLJ;
            c1331670kl3LJIIIZ.LJIILLIIL = enumC1338240kve;
            c1331670kl3LJIIIZ.LJJ = enumC1338240kve;
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            constraintLayout.addView(smartImageView);
            C340180DVg.LIZ(c1397580mTM, constraintLayout, 0, 6);
            c1397580mTM.LJI(voucherRetainDisplayInfo.title);
            c1397580mTM.LIZIZ(voucherRetainDisplayInfo.text);
            C1238130iKB.LIZ(c1397580mTM, new AwS0S1600000_1(voucherRetainDisplayInfo, (VoucherRetainDisplayInfo) interfaceC883403cm, (InterfaceC883403cm) strLJJIIZ, (String) map, (Map<String, String>) this, (C883303cl) function0, function02, (Function0<Unit>) 0));
            c1397580mTM.LJ(new AwS20S1400000_1(this, (C883303cl) retainInfo, (RetainInfo) interfaceC883403cm, (InterfaceC883403cm) strLJJIIZ, (String) map, (Map<String, String>) 5));
            c1397580mTM.LIZLLL(new AwS580S0100000_1(interfaceC883403cm, 190));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        if (function03 == null) {
            return;
        }
        function03.invoke();
    }

    public static TuxTextView LIZIZ(C883303cl c883303cl, Context context, DialogButton dialogButton, int i, View view, Function0 function0, boolean z, int i2) {
        boolean z2;
        String str;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2 = null;
        tuxTextView2 = null;
        tuxTextView2 = null;
        if ((i2 & 16) != 0) {
            function0 = null;
        }
        if ((i2 & 32) != 0) {
            z = false;
        }
        if ((i2 & 64) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        c883303cl.getClass();
        if (dialogButton != null && (str = dialogButton.text) != null && (!a0.LJJJIL(str))) {
            Integer num = dialogButton.dialogButtonStyle;
            if (num != null) {
                if (num.intValue() == 1) {
                    i = 1;
                } else if (num.intValue() == 2) {
                    i = 5;
                } else if (num.intValue() == 0) {
                    i = 0;
                }
            }
            if (z) {
                TuxTextView tuxTextView3 = new TuxTextView(context, null, 6, 0);
                tuxTextView3.setTuxFont(102);
                if (i != 0) {
                    if (i != 5) {
                        tuxTextView3.setTextColorRes(R.attr.a1h);
                        tuxTextView = tuxTextView3;
                    } else {
                        tuxTextView3.setTextColorRes(R.attr.a1l);
                        tuxTextView = tuxTextView3;
                    }
                } else {
                    tuxTextView3.setTextColorRes(R.attr.a04);
                    tuxTextView = tuxTextView3;
                }
            } else {
                C197039127h c197039127h = new C197039127h(context, null, 6, 0);
                c197039127h.setButtonSize(3);
                c197039127h.setButtonVariant(i);
                tuxTextView = c197039127h;
            }
            TuxTextView tuxTextView4 = tuxTextView;
            tuxTextView.setText(str);
            tuxTextView2 = tuxTextView4;
            if (function0 != null) {
                C786410Ut5.h9(tuxTextView, new ACListenerS38S0210000_1(view, function0, z2, 0));
                tuxTextView2 = tuxTextView4;
            }
        }
        return tuxTextView2;
    }

    @Override // X.InterfaceC866403a2
    public final void LIZ(Context context, PaymentMethod paymentMethod, PaymentMethod paymentMethod2, List<RetainInfo> list, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, InterfaceC883403cm interfaceC883403cm) {
        Object obj;
        Object next;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("ec_payment_bnpl_switch_promotion", false)) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        List listLJ = LJ("retain_type_voucher", list);
        List listLJ2 = LJ("reverse_retain_with_discount", list);
        if (listLJ.isEmpty() && listLJ2.isEmpty()) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Iterator it2 = listLJ.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (LJI(paymentMethod, (RetainInfo) next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        RetainInfo retainInfo = (RetainInfo) next;
        if (retainInfo != null) {
            LJIIIIZZ(context, retainInfo, function02, function0, interfaceC883403cm, function0, paymentMethod);
            return;
        }
        if (function03 != null) {
            Iterator it3 = listLJ2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (LJI(paymentMethod2, (RetainInfo) next2)) {
                    obj = next2;
                    break;
                }
            }
            RetainInfo retainInfo2 = (RetainInfo) obj;
            if (retainInfo2 != null) {
                LJIIIIZZ(context, retainInfo2, function03, function0, interfaceC883403cm, function0, paymentMethod2);
                return;
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }
}
