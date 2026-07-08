package X;

import Y.ACListenerS117S0200000_14;
import android.content.Context;
import com.bytedance.im.core.proto.GetMessagesRequestBody;
import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Ztb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914130Ztb implements InterfaceC863600XuI {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC863600XuI
    public final void LIZIZ(C0YMW c0ymw) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c0ymw);
                break;
            case 1:
                LIZIZ$1(this, c0ymw);
                break;
            case 2:
                LIZIZ$2(this, c0ymw);
                break;
            case 3:
                LIZIZ$3(this, c0ymw);
                break;
            case 4:
                LIZIZ$4(this, c0ymw);
                break;
            case 5:
                LIZIZ$5(this, c0ymw);
                break;
            case 6:
                LIZIZ$6(this, c0ymw);
                break;
            case 7:
                LIZIZ$7(this, c0ymw);
                break;
            case 8:
                LIZIZ$8(this, c0ymw);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZIZ$9(this, c0ymw);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZIZ$10(this, c0ymw);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZIZ$11(this, c0ymw);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZIZ$12(this, c0ymw);
                break;
        }
    }

    @Override // X.InterfaceC863600XuI
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
            case 2:
                onSuccess$2(this, obj);
                break;
            case 3:
                onSuccess$3(this, obj);
                break;
            case 4:
                onSuccess$4(this, obj);
                break;
            case 5:
                onSuccess$5(this, obj);
                break;
            case 6:
                onSuccess$6(this, obj);
                break;
            case 7:
                onSuccess$7(this, obj);
                break;
            case 8:
                onSuccess$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onSuccess$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onSuccess$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onSuccess$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onSuccess$12(this, obj);
                break;
        }
    }

    public static final void LIZIZ$0(C914130Ztb c914130Ztb, C0YMW c0ymw) {
        ((Function1) c914130Ztb.l0).invoke(Boolean.FALSE);
    }

    public static final void LIZIZ$1(C914130Ztb c914130Ztb, C0YMW c0ymw) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveLastProperty get Conversation onFailure: error={");
        String statusMsg = null;
        if (c0ymw != null) {
            numValueOf = Integer.valueOf(c0ymw.getCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", ");
        if (c0ymw != null) {
            statusMsg = c0ymw.getStatusMsg();
        }
        sbLIZ.append(statusMsg);
        sbLIZ.append('}');
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZIZ$10(C914130Ztb c914130Ztb, C0YMW c0ymw) {
        C0YD9 c0yd9 = (C0YD9) c914130Ztb.l1;
        int i = c0yd9.LIZIZ - 1;
        c0yd9.LIZIZ = i;
        if (i <= 0 && ((List) c914130Ztb.l2).isEmpty()) {
            ((InterfaceC863600XuI) c914130Ztb.l0).LIZIZ(c0ymw);
        }
    }

    public static final void LIZIZ$11(C914130Ztb c914130Ztb, C0YMW c0ymw) {
        String statusMsg;
        InterfaceC1335605Ko interfaceC1335605KoLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Message refresh failed: audioId=");
        sbLIZ.append(((C901670ZYv) c914130Ztb.l1).LIZ);
        sbLIZ.append(", msgId=");
        sbLIZ.append(((C869590Y9l) c914130Ztb.l2).getMsgId());
        sbLIZ.append(", error=");
        Integer numValueOf = null;
        if (c0ymw != null) {
            statusMsg = c0ymw.getStatusMsg();
        } else {
            statusMsg = null;
        }
        sbLIZ.append(statusMsg);
        sbLIZ.append(", errorCode=");
        if (c0ymw != null) {
            numValueOf = Integer.valueOf(c0ymw.getCode());
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
        if (iIMPreloadService != null && (interfaceC1335605KoLIZIZ = iIMPreloadService.LIZIZ()) != null) {
            interfaceC1335605KoLIZIZ.onFailed(((C901670ZYv) c914130Ztb.l1).LIZ);
        }
        ((C901600ZYo) c914130Ztb.l0).LJI(((C901670ZYv) c914130Ztb.l1).LIZ);
    }

    public static final void LIZIZ$12(C914130Ztb c914130Ztb, C0YMW c0ymw) {
        int value;
        if (c0ymw != null) {
            value = c0ymw.getCode();
        } else {
            value = C0YIG.CONV_NOT_FOUND.getValue();
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c914130Ztb.l2;
        C098200Yq c098200Yq = new C098200Yq(new C863940Xuq("recreate conv failed", value));
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
    }

    public static final void LIZIZ$2(C914130Ztb c914130Ztb, C0YMW c0ymw) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failed: ");
        sbLIZ.append(c0ymw);
        C2188811AlT.LIZIZ(sbLIZ);
        ((AbstractC880120Yfq) c914130Ztb.l0).LJIIIIZZ(c0ymw);
    }

    public static final void LIZIZ$3(C914130Ztb c914130Ztb, C0YMW c0ymw) {
        InterfaceC863600XuI interfaceC863600XuI;
        C870500YCy c870500YCy = (C870500YCy) c914130Ztb.l2;
        int i = c870500YCy.LIZ - 1;
        c870500YCy.LIZ = i;
        if (i <= 0 && ((List) c914130Ztb.l1).isEmpty() && (interfaceC863600XuI = (InterfaceC863600XuI) c914130Ztb.l0) != null) {
            interfaceC863600XuI.LIZIZ(c0ymw);
        }
    }

    public static final void LIZIZ$4(C914130Ztb c914130Ztb, C0YMW c0ymw) {
        ((InterfaceC863600XuI) c914130Ztb.l0).LIZIZ(c0ymw);
    }

    public static final void LIZIZ$5(C914130Ztb c914130Ztb, C0YMW c0ymw) {
        C0Y1C c0y1c = (C0Y1C) c914130Ztb.l2;
        C0YIN c0yin = (C0YIN) c914130Ztb.l0;
        Runnable runnable = (Runnable) c914130Ztb.l1;
        c0y1c.LIZ(c0yin);
        runnable.run();
    }

    public static final void LIZIZ$6(C914130Ztb c914130Ztb, C0YMW c0ymw) {
        ((InterfaceC863600XuI) c914130Ztb.l0).LIZIZ(c0ymw);
    }

    public static final void LIZIZ$7(C914130Ztb c914130Ztb, C0YMW c0ymw) {
        ((Function0) c914130Ztb.l2).invoke();
    }

    public static final void LIZIZ$8(C914130Ztb c914130Ztb, C0YMW c0ymw) {
        ((C870180YBs) c914130Ztb.l2).LIZ((Map) c914130Ztb.l0, (InterfaceC863600XuI) c914130Ztb.l1, null);
    }

    public static final void LIZIZ$9(C914130Ztb c914130Ztb, C0YMW c0ymw) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGetModifyPropertyMsg add fail cause:");
        sbLIZ.append(((C869590Y9l) c914130Ztb.l1).getMsgId());
        sbLIZ.append(",error:");
        sbLIZ.append(c0ymw);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onSuccess$0(C914130Ztb c914130Ztb, Object obj) {
        C0Y8T c0y8t = (C0Y8T) obj;
        if (c0y8t != null) {
            Function1 function1 = (Function1) c914130Ztb.l0;
            Context context = (Context) c914130Ztb.l1;
            C1229500i6G c1229500i6G = (C1229500i6G) c914130Ztb.l2;
            function1.invoke(Boolean.TRUE);
            C1230440i7m c1230440i7m = C1230440i7m.LIZJ;
            String conversationId = c0y8t.getConversationId();
            c1230440i7m.getClass();
            C1230440i7m.LJ(context, c1229500i6G, conversationId);
            return;
        }
        ((Function1) c914130Ztb.l0).invoke(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onSuccess$1(X.C914130Ztb r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C914130Ztb.onSuccess$1(X.0Ztb, java.lang.Object):void");
    }

    public static final void onSuccess$10(C914130Ztb c914130Ztb, Object obj) {
        C0YD8 c0yd8 = (C0YD8) obj;
        if (c0yd8.LIZIZ) {
            ((InterfaceC863600XuI) c914130Ztb.l0).onSuccess(c0yd8.LIZ);
            return;
        }
        C0YD9 c0yd9 = (C0YD9) c914130Ztb.l1;
        c0yd9.LIZIZ--;
        ((List) c914130Ztb.l2).addAll(c0yd8.LIZ);
        if (((C0YD9) c914130Ztb.l1).LIZIZ > 0) {
            return;
        }
        ((InterfaceC863600XuI) c914130Ztb.l0).onSuccess((List) c914130Ztb.l2);
    }

    public static final void onSuccess$11(C914130Ztb c914130Ztb, Object obj) {
        Integer numValueOf;
        InterfaceC1335605Ko interfaceC1335605KoLIZIZ;
        Object next;
        List list = (List) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Message refresh API success: audioId=");
        sbLIZ.append(((C901670ZYv) c914130Ztb.l1).LIZ);
        sbLIZ.append(", resultSize=");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (list != null) {
            C869590Y9l c869590Y9l = (C869590Y9l) c914130Ztb.l2;
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((C869590Y9l) next).getMsgId() == c869590Y9l.getMsgId()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C869590Y9l c869590Y9l2 = (C869590Y9l) next;
            if (c869590Y9l2 != null && c869590Y9l2.getMsgType() == 1813) {
                C901600ZYo c901600ZYo = (C901600ZYo) c914130Ztb.l0;
                C23250099c.LIZLLL(c901600ZYo.LJFF, null, null, new C901640ZYs(c869590Y9l2, c901600ZYo, (C901670ZYv) c914130Ztb.l1, null), 3);
                return;
            }
        }
        IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
        if (iIMPreloadService != null && (interfaceC1335605KoLIZIZ = iIMPreloadService.LIZIZ()) != null) {
            interfaceC1335605KoLIZIZ.onFailed(((C901670ZYv) c914130Ztb.l1).LIZ);
        }
        ((C901600ZYo) c914130Ztb.l0).LJI(((C901670ZYv) c914130Ztb.l1).LIZ);
    }

    public static final void onSuccess$12(C914130Ztb c914130Ztb, Object obj) {
        C0Y8T c0y8t = (C0Y8T) obj;
        if (c0y8t != null) {
            ((C0YC5) c914130Ztb.l0).LIZIZ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(14, c0y8t);
            ((C869590Y9l) c914130Ztb.l1).setConversationShortId(c0y8t.getConversationShortId());
        }
        ((C0YC5) c914130Ztb.l0).LIZLLL = true;
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c914130Ztb.l2;
        C869590Y9l c869590Y9l = (C869590Y9l) c914130Ztb.l1;
        C189200o6.m2constructorimpl(c869590Y9l);
        interfaceC1364105Vn.resumeWith(c869590Y9l);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, X.0mGz] */
    public static final void onSuccess$2(C914130Ztb c914130Ztb, Object obj) {
        int iIntValue;
        C259800zU c259800zU = new C259800zU();
        TuxTextView tuxTextView = new TuxTextView(((AbstractC880120Yfq) c914130Ztb.l0).LL, null, 6, 0);
        AbstractC880120Yfq abstractC880120Yfq = (AbstractC880120Yfq) c914130Ztb.l0;
        Function0 function0 = (Function0) c914130Ztb.l2;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, new C1361400lX0(abstractC880120Yfq.LL, R.style.y0));
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setText(2131845371);
        tuxTextView.setTuxFont(42);
        C786410Ut5.h9(tuxTextView, new ACListenerS117S0200000_14(c259800zU, function0, 24));
        ?? c1389910mGz = new C1389910mGz(((AbstractC880120Yfq) c914130Ztb.l0).LL);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LIZ.LIZIZ = 0;
        c1389910mGz.LJIIJ((CharSequence) c914130Ztb.l1);
        c1389910mGz.LIZ.LIZLLL = 3;
        c1389910mGz.LIZ.LJ = new AwS593S0100000_14(tuxTextView, 282);
        c1389910mGz.LJ(3000L);
        c1389910mGz.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)) + ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(((AbstractC880120Yfq) c914130Ztb.l0).LL));
        c1389910mGz.LIZLLL(new AwS558S0100000_14(c259800zU, (C259800zU<List<InterfaceC891770Yyd>>) 1476));
        c259800zU.element = c1389910mGz;
        c1389910mGz.LJIIJJI();
    }

    public static final void onSuccess$3(C914130Ztb c914130Ztb, Object obj) {
        InterfaceC863600XuI interfaceC863600XuI;
        C1885607a2 c1885607a2 = (C1885607a2) obj;
        if (c1885607a2.LIZIZ) {
            ((InterfaceC863600XuI) c914130Ztb.l0).onSuccess(c1885607a2.LIZ);
            return;
        }
        C870500YCy c870500YCy = (C870500YCy) c914130Ztb.l2;
        c870500YCy.LIZ--;
        ((List) c914130Ztb.l1).addAll(c1885607a2.LIZ);
        if (((C870500YCy) c914130Ztb.l2).LIZ > 0 || (interfaceC863600XuI = (InterfaceC863600XuI) c914130Ztb.l0) == null) {
            return;
        }
        interfaceC863600XuI.onSuccess((List) c914130Ztb.l1);
    }

    public static final void onSuccess$4(C914130Ztb c914130Ztb, Object obj) {
        new C0YB5(((C870180YBs) c914130Ztb.l2).LLILLL, (C0Y8T) obj, (InterfaceC863600XuI) c914130Ztb.l0).LJIIJJI((List) c914130Ztb.l1);
    }

    public static final void onSuccess$5(C914130Ztb c914130Ztb, Object obj) {
        C0Y8T c0y8t = (C0Y8T) obj;
        ((C0Y1C) c914130Ztb.l2).LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJL(14, c0y8t);
        ((C0Y1C) c914130Ztb.l2).LJ = true;
        C0Y1C c0y1c = (C0Y1C) c914130Ztb.l2;
        C0YIN c0yin = (C0YIN) c914130Ztb.l0;
        c0y1c.getClass();
        C867980Y3g c867980Y3gNewBuilder = c0yin.LLILZLL.body.set_conversation_setting_info_body.newBuilder();
        c867980Y3gNewBuilder.LJ = Long.valueOf(c0y8t.getConversationShortId());
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBodyBuild = c867980Y3gNewBuilder.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJJJ = setConversationSettingInfoRequestBodyBuild;
        RequestBody requestBodyBuild = c1es0.build();
        HashMap map = new HashMap();
        map.put("retry", "refresh_conv");
        c0y1c.LJIIJ(c0y8t.getInboxType(), requestBodyBuild, c0yin.LLILZ, map, c0yin.LLILZIL);
    }

    public static final void onSuccess$6(C914130Ztb c914130Ztb, Object obj) {
        C0YB6 c0yb6 = new C0YB6(((C870180YBs) c914130Ztb.l2).LLILLL, (C0Y8T) obj, (InterfaceC863600XuI) c914130Ztb.l0);
        List<MessageIDIndexEntry> list = (List) c914130Ztb.l1;
        C870320YCg c870320YCg = new C870320YCg();
        c870320YCg.LIZLLL = c0yb6.LJ.getConversationId();
        c870320YCg.LJ = Integer.valueOf(c0yb6.LJ.getConversationType());
        c870320YCg.LJFF = Long.valueOf(c0yb6.LJ.getConversationShortId());
        C1516540pZE.LIZ(list);
        c870320YCg.LJI = list;
        GetMessagesRequestBody getMessagesRequestBodyBuild = c870320YCg.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJLJL = getMessagesRequestBodyBuild;
        c0yb6.LJIIIZ(c0yb6.LJ.getInboxType(), c1es0.build(), null, new Object[0]);
    }

    public static final void onSuccess$7(C914130Ztb c914130Ztb, Object obj) {
        C0Y8T c0y8t = (C0Y8T) obj;
        ((C868070Y3p) c914130Ztb.l0).LJIIJJI().LJJL(14, c0y8t);
        ((List) c914130Ztb.l1).add(c0y8t);
        ((Function0) c914130Ztb.l2).invoke();
    }

    public static final void onSuccess$8(C914130Ztb c914130Ztb, Object obj) {
        ((C870180YBs) c914130Ztb.l2).LIZ((Map) c914130Ztb.l0, (InterfaceC863600XuI) c914130Ztb.l1, (Map) obj);
    }

    public static final void onSuccess$9(C914130Ztb c914130Ztb, Object obj) {
        List<C0YT7> list;
        C0Y8T c0y8t = (C0Y8T) obj;
        if (c0y8t != null && !c0y8t.isMute() && (list = ((C0YTA) c914130Ztb.l0).LIZ) != null) {
            ArrayList arrayList = new ArrayList();
            for (C0YT7 c0yt7 : list) {
                if (c0yt7.LIZIZ == C0YTC.ADD) {
                    arrayList.add(c0yt7);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C0YT7) it2.next()).LIZ);
            }
            if (!arrayList2.isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onGetModifyPropertyMsg start:");
                sbLIZ.append(((C869590Y9l) c914130Ztb.l1).getMsgId());
                C2188811AlT.LIZIZ(sbLIZ);
                C876800YaU.LIZ(((C876680YaI) c914130Ztb.l2).LIZLLL, "try_enqueue_modify_property", C1906580ziK.LJI());
                if (((C876680YaI) c914130Ztb.l2).LJFF.LIZLLL(false)) {
                    C876800YaU.LIZ(((C876680YaI) c914130Ztb.l2).LIZLLL, "discard_modify_property", C1906580ziK.LJI());
                } else {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C876570Ya7(arrayList2, (C876680YaI) c914130Ztb.l2, (C869590Y9l) c914130Ztb.l1, c0y8t, null), 3);
                }
            }
        }
    }

    public C914130Ztb(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C914130Ztb(AbstractC880120Yfq abstractC880120Yfq, AbstractC880120Yfq abstractC880120Yfq2, CharSequence charSequence, String str, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = abstractC880120Yfq;
        this.l1 = abstractC880120Yfq2;
        this.l2 = str;
    }

    public C914130Ztb(C0Y1C c0y1c, C0YIN c0yin, C0Y1G c0y1g, String str, String str2, int i) {
        this.$t = i;
        this.l2 = c0y1c;
        this.l0 = c0yin;
        this.l1 = c0y1g;
    }
}
