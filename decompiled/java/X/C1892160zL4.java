package X;

import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.os.Looper;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonViewModel;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.model.FypCtaButton;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS112S1000000_28;
import kotlin.jvm.internal.AwS41S1400000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zL4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892160zL4 {
    public static final C1892160zL4 LIZ = new C1892160zL4();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(283));

    public static InterfaceC710490Rtv LIZJ() {
        return (InterfaceC710490Rtv) LIZIZ.getValue();
    }

    public static boolean LJ(Aweme aweme) {
        String str;
        String aid;
        String aid2;
        AnchorBizUtils.LIZ.getClass();
        if (!AnchorBizUtils.LJJJJZ() || AnchorBizUtils.LJJJLL(aweme)) {
            return false;
        }
        List listLJJZZI = AnchorBizUtils.LJJZZI(aweme);
        if (((ArrayList) listLJJZZI).size() == 1) {
            AnchorProductInfo anchorProductInfo = (AnchorProductInfo) C13LP.LJJJLL(listLJJZZI);
            Long lLJIILIIL = null;
            if (anchorProductInfo != null && anchorProductInfo.productId != null) {
                InterfaceC710490Rtv interfaceC710490RtvLIZJ = LIZJ();
                if (aweme != null && (aid2 = aweme.getAid()) != null) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(aid2);
                }
                boolean z = !interfaceC710490RtvLIZJ.LJ(lLJIILIIL);
                ConcurrentHashMap<String, Object> concurrentHashMap = C1892170zL5.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PRE_CHECK_FAIL".toLowerCase(Locale.ROOT));
                sbLIZ.append('_');
                if (z) {
                    str = "success";
                } else {
                    str = "fail";
                }
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (aweme == null || (aid = aweme.getAid()) == null) {
                    aid = "";
                }
                C1892170zL5.LIZJ(strLIZIZ, aid);
                return z;
            }
        }
        return false;
    }

    public static String LIZIZ(String str, Long l, String str2, Map map) {
        String string;
        String string2;
        String string3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Object>> it2 = C1892170zL5.LIZ.entrySet().iterator();
        while (true) {
            String string4 = null;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = it2.next();
            String key = next.getKey();
            Object value = next.getValue();
            if (value != null) {
                string4 = value.toString();
            }
            linkedHashMap.put(key, string4);
        }
        if (map != null) {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                Object key2 = entry.getKey();
                Object value2 = entry.getValue();
                if (value2 != null) {
                    string3 = value2.toString();
                } else {
                    string3 = null;
                }
                linkedHashMap.put(key2, string3);
            }
        }
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("product_id", string);
        linkedHashMap.put("enter_from", str2);
        linkedHashMap.put("channel", "fyp_add_product_button");
        linkedHashMap.put("is_from_selection_scenarios", "1");
        C1735020vFc.LIZ.getClass();
        String strLJIIIIZZ = C1735020vFc.LJIIIIZZ(C1735020vFc.LJIIIIZZ(str, "geccParams", linkedHashMap), "geccTeaParams", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry entry2 : ((LinkedHashMap) map).entrySet()) {
                Object key3 = entry2.getKey();
                Object value3 = entry2.getValue();
                if (value3 != null) {
                    string2 = value3.toString();
                } else {
                    string2 = null;
                }
                linkedHashMap2.put(key3, string2);
            }
        }
        C1735020vFc.LIZ.getClass();
        return UriProtector.parse(C1735020vFc.LJIIIIZZ(C1735020vFc.LJIIIIZZ(strLJIIIIZZ, "trackParams", linkedHashMap2), "geccCrossTeaParams", linkedHashMap2)).buildUpon().appendQueryParameter("enter_from", str2).build().toString();
    }

    public static void LIZLLL(Context context, Long l, String str, String str2, Map map) {
        if (str != null && str.length() != 0) {
            SmartRouter.buildRoute(context, LIZIZ(str, l, str2, map)).open();
        }
    }

    public static final void LIZ(int i, final C197039127h c197039127h, FypCtaButton fypCtaButton, FypCtaButton fypCtaButton2, EcProductAddButtonViewModel ecProductAddButtonViewModel, String str, Function1<? super FypCtaButton, Unit> function1) {
        String str2;
        if (i == 2) {
            C1592306Lh c1592306Lh = C1592306Lh.LIZ;
            String str3 = null;
            if (fypCtaButton != null) {
                str2 = fypCtaButton.afterClickText;
            } else {
                str2 = null;
            }
            if (fypCtaButton2 != null) {
                str3 = fypCtaButton2.text;
            }
            final AwS41S1400000_28 awS41S1400000_28 = new AwS41S1400000_28(c197039127h, ecProductAddButtonViewModel, fypCtaButton2, fypCtaButton, function1, str, 2);
            c1592306Lh.getClass();
            if (str2 != null && str2.length() != 0) {
                int[] iArr = new int[2];
                c197039127h.getLocationOnScreen(iArr);
                final int iLIZIZ = (c197039127h.getResources().getDisplayMetrics().heightPixels + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C497270Jen.LIZ(44))))) - (iArr[1] + c197039127h.getHeight());
                try {
                    if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                        C1389910mGz c1389910mGz = new C1389910mGz(c197039127h);
                        c1389910mGz.LIZ.LIZIZ = 0;
                        c1389910mGz.LJIIJ(str2);
                        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
                        c1360890lWB.LIZLLL = 2;
                        c1360890lWB.LJI = str3;
                        c1360890lWB.LJIIIIZZ = new ACListenerS155S0100000_21(awS41S1400000_28, 206);
                        c1389910mGz.LJI(R.style.y0);
                        c1389910mGz.LIZIZ(iLIZIZ);
                        c1389910mGz.LJIIIIZZ(true);
                        c1389910mGz.LJII(true);
                        c1389910mGz.LJ(3000L);
                        c1389910mGz.LIZ(false);
                        c1389910mGz.LJIIJJI();
                        return;
                    }
                    try {
                        final String str4 = str3;
                        final String str5 = str2;
                        ExecutorC1592406Li.LLILLJJLI.execute(new Runnable() { // from class: X.0mEA
                            public final void LIZ() {
                                C1389910mGz c1389910mGz2 = new C1389910mGz(c197039127h);
                                c1389910mGz2.LIZ.LIZIZ = 0;
                                c1389910mGz2.LJIIJ(str5);
                                C1360890lWB c1360890lWB2 = c1389910mGz2.LIZ;
                                c1360890lWB2.LIZLLL = 2;
                                c1360890lWB2.LJI = str4;
                                c1360890lWB2.LJIIIIZZ = new ACListenerS155S0100000_21(awS41S1400000_28, 206);
                                c1389910mGz2.LJI(R.style.y0);
                                c1389910mGz2.LIZIZ(iLIZIZ);
                                c1389910mGz2.LJIIIIZZ(true);
                                c1389910mGz2.LJII(true);
                                c1389910mGz2.LJ(3000L);
                                c1389910mGz2.LIZ(false);
                                c1389910mGz2.LJIIJJI();
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("EcProductAddViewUtils@6d00.showButtonClickedTips$$inlined$runOnMainThreadImmediate$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("EcProductAddViewUtils@6d00.showButtonClickedTips$$inlined$runOnMainThreadImmediate$1");
                            }
                        });
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return;
                }
            }
            return;
        }
        C1592306Lh.LIZ(C1592306Lh.LIZ, c197039127h, new AwS112S1000000_28(str, 16));
        function1.invoke(fypCtaButton);
    }
}
