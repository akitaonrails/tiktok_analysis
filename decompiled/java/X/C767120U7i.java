package X;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767120U7i implements InterfaceC767160U7m {
    public static C767140U7k LIZIZ;
    public static C767140U7k LIZJ;
    public static boolean LJ;
    public static Boolean LJFF;
    public static boolean LJIIIIZZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static String LJIIL;
    public static final C767120U7i LIZ = new C767120U7i();
    public static final C01GW LIZLLL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(215));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(216));
    public static String LJII = "normal_video_live";
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(217));
    public static String LJIILIIL = InterfaceC766480U4w.LIZJ.LIZIZ();

    static {
        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
        AFwS199S0000000_12 aFwS199S0000000_12 = AFwS199S0000000_12.get$arr$(213);
        c1276840jKc.getClass();
        C1276840jKc.LJJJJIZL = aFwS199S0000000_12;
        AFwS199S0000000_12 aFwS199S0000000_122 = AFwS199S0000000_12.get$arr$(214);
        c1276840jKc.getClass();
        C1276840jKc.LJJJJL = aFwS199S0000000_122;
    }

    public static RunnableC767130U7j LIZIZ() {
        return (RunnableC767130U7j) LIZLLL.getValue();
    }

    public static void LJIIIZ() {
        C767140U7k c767140U7k;
        String str;
        C767140U7k c767140U7k2 = LIZJ;
        String str2 = "";
        if (c767140U7k2 == null) {
            C1276840jKc.LIZ.getClass();
            C1276840jKc.LJIILIIL.put("filter_resource_id", "");
            return;
        }
        LiveEffect liveEffect = c767140U7k2.LJI;
        if ((liveEffect == null || !liveEffect.LJJIJIIJI()) && (c767140U7k = LIZJ) != null && (str = c767140U7k.LIZ) != null) {
            str2 = str;
        }
        C1276840jKc.LIZ.getClass();
        C1276840jKc.LJIILIIL.put("filter_resource_id", str2);
    }

    public static final void LIZ(String str) {
        String str2;
        String str3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finishLog: enter from ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveFilterLogManager", C2188811AlT.LIZIZ(sbLIZ));
        C767140U7k c767140U7k = LIZJ;
        if (c767140U7k != null) {
            str2 = c767140U7k.LIZ;
        } else {
            str2 = null;
        }
        C760080Tri.LJFF = str2;
        C767140U7k c767140U7k2 = LIZJ;
        if (c767140U7k2 != null) {
            str3 = c767140U7k2.LIZIZ;
        } else {
            str3 = null;
        }
        C760080Tri.LJI = str3;
        LIZIZ = LIZJ;
        LJIIIIZZ = false;
        LJIIJJI = LJIIJ;
        LIZJ = null;
    }

    public static final void LIZLLL(boolean z) {
        C20441214yg.LIZIZ("LiveFilterLogManager", "release: remove filterEffectUseRunnable");
        ((Handler) LJI.getValue()).removeCallbacks(LIZIZ());
        C768300UBw.LIZIZ(3L);
        LIZIZ = null;
        LIZJ = null;
        LJ = false;
        RunnableC767130U7j runnableC767130U7jLIZIZ = LIZIZ();
        runnableC767130U7jLIZIZ.LL = null;
        runnableC767130U7jLIZIZ.LLILLJJLI = false;
        runnableC767130U7jLIZIZ.LLILLL = false;
        runnableC767130U7jLIZIZ.LLILZ = null;
        if (z) {
            LJFF = null;
            LJIIIIZZ = false;
            LJIILIIL = InterfaceC766480U4w.LIZJ.LIZIZ();
        }
    }

    public static final void LJII(DataChannel dataChannel) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("pm_live_filter_use");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (LJ) {
            str = "use";
        } else {
            str = "unused";
        }
        c474500IjALIZ.LJJII(str, "use_status");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZJ(String str, boolean z) {
        int i;
        int i2;
        int i3;
        int iLJZ;
        C767140U7k c767140U7k = null;
        if (z) {
            LIZJ = null;
            return;
        }
        Integer numLIZIZ = InterfaceC766480U4w.LIZ.LIZIZ();
        C01GW c01gw = LJIIIZ;
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLZIJ(numLIZIZ.intValue(), ((InterfaceC767150U7l) c01gw.getValue()).LIZ());
        LJII = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareLogData: enter from ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveFilterLogManager", C2188811AlT.LIZIZ(sbLIZ));
        if (liveEffect != null && !TextUtils.isEmpty(liveEffect.LLJLL()) && !Intrinsics.LJFF(liveEffect.LLJLL(), CardStruct.IStatusCode.DEFAULT) && liveEffect.getEffectId() != 0 && !liveEffect.LJJIJIIJI()) {
            float fLIZIZ = ((InterfaceC767150U7l) c01gw.getValue()).LIZIZ(numLIZIZ.intValue());
            String strValueOf = String.valueOf(liveEffect.getEffectId());
            LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect);
            if (composerConfigLJIIJ != null) {
                i = composerConfigLJIIJ.maxValue;
            } else {
                i = 0;
            }
            LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(liveEffect);
            if (composerConfigLJIIJ2 != null) {
                i2 = composerConfigLJIIJ2.LIZLLL;
            } else {
                i2 = 0;
            }
            LiveEffect.ComposerConfig composerConfigLJIIJ3 = C0U7C.LJIIJ(liveEffect);
            if (composerConfigLJIIJ3 != null) {
                i3 = composerConfigLJIIJ3.defaultValue;
            } else {
                i3 = 0;
            }
            if (fLIZIZ == 0.0f) {
                iLJZ = 0;
            } else {
                iLJZ = C500260Jjc.LJZ((i - i2) * fLIZIZ);
            }
            c767140U7k = new C767140U7k(strValueOf, liveEffect.getResourceId(), fLIZIZ, iLJZ, i3, numLIZIZ.intValue() + 1, liveEffect, C158B.LIZ(), LJIIJ, LJII, LJIILIIL, liveEffect.LLJI());
        }
        LIZJ = c767140U7k;
        if (Intrinsics.LJFF(c767140U7k, LIZIZ)) {
            LIZJ = LIZIZ;
        }
    }

    public static final void LJIIIIZZ(DataChannel dataChannel, String str) {
        String str2;
        String str3;
        Float fValueOf;
        String str4;
        Integer numValueOf;
        long j;
        Integer numValueOf2;
        if (C500260Jjc.LJJIJLIJ() || C500260Jjc.LJJIFFI(InterfaceC766480U4w.LJJIFFI.LIZIZ()) || LIZIZ == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportFilterUseTime: enter from ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveFilterLogManager", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(LIZIZ, LIZJ)) {
            C20441214yg.LIZIZ("LiveFilterLogManager", "reportFilterUseTime: current filter is the same as previous");
            return;
        }
        long jLIZ = C158B.LIZ();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_filter_use_time");
        c474500IjALIZ.LJIJJLI(dataChannel);
        C767140U7k c767140U7k = LIZIZ;
        if (c767140U7k == null || (str2 = c767140U7k.LJIIJ) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJ(str2);
        C767140U7k c767140U7k2 = LIZIZ;
        Integer numValueOf3 = null;
        if (c767140U7k2 != null) {
            str3 = c767140U7k2.LIZ;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "filter_id");
        C767140U7k c767140U7k3 = LIZIZ;
        if (c767140U7k3 != null) {
            fValueOf = Float.valueOf(c767140U7k3.LIZJ);
        } else {
            fValueOf = null;
        }
        c474500IjALIZ.LJJIFFI(fValueOf, "filter_value");
        C767140U7k c767140U7k4 = LIZIZ;
        if (c767140U7k4 != null) {
            str4 = c767140U7k4.LIZIZ;
        } else {
            str4 = null;
        }
        c474500IjALIZ.LJJII(str4, "resource_id");
        C767140U7k c767140U7k5 = LIZIZ;
        if (c767140U7k5 != null) {
            numValueOf = Integer.valueOf(c767140U7k5.LJFF);
        } else {
            numValueOf = null;
        }
        c474500IjALIZ.LJJII(numValueOf, "impr_position");
        C767140U7k c767140U7k6 = LIZIZ;
        if (c767140U7k6 != null) {
            j = c767140U7k6.LJII;
        } else {
            j = jLIZ;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLIZ - j), "use_time");
        c474500IjALIZ.LJJII(Integer.valueOf(LJIIJJI ? 1 : 0), "is_live_take_default");
        C767140U7k c767140U7k7 = LIZIZ;
        if (c767140U7k7 != null) {
            numValueOf2 = Integer.valueOf(c767140U7k7.LIZLLL);
        } else {
            numValueOf2 = null;
        }
        C767140U7k c767140U7k8 = LIZIZ;
        if (c767140U7k8 != null) {
            numValueOf3 = Integer.valueOf(c767140U7k8.LJ);
        }
        c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(numValueOf2, numValueOf3) ? 1 : 0), "is_default_value");
        c474500IjALIZ.LIZ();
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(LJIIIIZZ))) {
            C768300UBw.LIZIZ(3L);
            C768300UBw.LJFF(LIZIZ, true);
            C768300UBw.LJIILIIL(3L);
        }
    }

    public static void LJ(DataChannel dataChannel, String str, boolean z, boolean z2) {
        Boolean bool;
        if (C500260Jjc.LJJIJLIJ() || C500260Jjc.LJJIFFI(InterfaceC766480U4w.LJJIFFI.LIZIZ())) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportFilterEffectUse: enter from ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("LiveFilterLogManager", C2188811AlT.LIZIZ(sbLIZ));
        C767140U7k c767140U7k = LIZJ;
        if (c767140U7k == null) {
            ((Handler) LJI.getValue()).removeCallbacks(LIZIZ());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("reportFilterEffectUse: previous runnable canceled ");
            sbLIZ2.append(str);
            C20441214yg.LIZIZ("LiveFilterLogManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (Intrinsics.LJFF(LIZIZ, c767140U7k)) {
            C20441214yg.LIZIZ("LiveFilterLogManager", "reportFilterEffectUse: current filter is the same as previous");
            return;
        }
        String str2 = null;
        if (z && (bool = LJFF) != null) {
            z2 = bool.booleanValue();
            LJFF = null;
        }
        C767140U7k c767140U7k2 = LIZJ;
        if (c767140U7k2 != null && c767140U7k2.LJIIJ != null) {
            if (c767140U7k2 != null) {
                str2 = c767140U7k2.LJIIJ;
            }
            z2 = Intrinsics.LJFF(str2, "click");
        }
        C01GW c01gw = LJI;
        ((Handler) c01gw.getValue()).removeCallbacks(LIZIZ());
        RunnableC767130U7j runnableC767130U7jLIZIZ = LIZIZ();
        C767140U7k c767140U7k3 = LIZJ;
        runnableC767130U7jLIZIZ.LL = dataChannel;
        runnableC767130U7jLIZIZ.LLILLJJLI = z;
        runnableC767130U7jLIZIZ.LLILLL = z2;
        runnableC767130U7jLIZIZ.LLILZ = c767140U7k3;
        C786410Ut5.LJLIIL(30000L, (Handler) c01gw.getValue(), LIZIZ());
    }

    public static void LJFF(int i, long j, String str, boolean z) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_filter_panel_download");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - j), "duration");
        if (z) {
            str2 = "done";
        } else {
            str2 = "failed";
        }
        c474500IjALIZ.LJJII(str2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(str, "error_description");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(com.bytedance.ies.sdk.datachannel.DataChannel r24, java.lang.String r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C767120U7i.LJI(com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, boolean, boolean):void");
    }
}
