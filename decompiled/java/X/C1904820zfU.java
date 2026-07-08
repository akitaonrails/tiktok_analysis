package X;

import Y.AObjectS78S0000000_28;
import android.os.Looper;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.count.IFeedPlayNumService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import com.ss.android.ugc.aweme.service.INewUserFeedSignalService;
import com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904820zfU {
    public static long LIZIZ;
    public static int LIZJ;
    public static final C1904820zfU LIZ = new C1904820zfU();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new AObjectS78S0000000_28(6));
    public static final C01GW LJ = C452501pT.LIZIZ(new AObjectS78S0000000_28(7));
    public static final C01GW LJFF = C452501pT.LIZIZ(new AObjectS78S0000000_28(8));

    public static int LIZ() {
        return ((Number) LJ.getValue()).intValue();
    }

    public static C10VH LIZIZ() {
        return (C10VH) LIZLLL.getValue();
    }

    public static void LIZJ(int i, String str) {
        final int iC4;
        int iLIZLLL;
        INewUserDebugService iNewUserDebugServiceLIZIZ;
        INewUserDebugService iNewUserDebugServiceLIZIZ2;
        INewUserDebugService iNewUserDebugServiceLIZIZ3;
        INewUserDebugService iNewUserDebugServiceLIZIZ4;
        INewUserDebugService iNewUserDebugServiceLIZIZ5;
        INewUserDebugService iNewUserDebugServiceLIZIZ6;
        INewUserDebugService iNewUserDebugServiceLIZIZ7;
        INewUserDebugService iNewUserDebugServiceLIZIZ8;
        INewUserDebugService iNewUserDebugServiceLIZIZ9;
        C1904810zfT.LIZ.getClass();
        IFeedPlayNumService iFeedPlayNumService = (IFeedPlayNumService) PluggableExtentionKt.pluggableSpi$default(IFeedPlayNumService.class, false, false, false, 14, null);
        if (iFeedPlayNumService != null) {
            iC4 = iFeedPlayNumService.c4();
        } else {
            iC4 = 0;
        }
        if (iC4 < 16) {
            C1865740yeS.LIZ.getClass();
            if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ9 = C1865740yeS.LIZIZ()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("commonCheck: reject by vvNum=");
                sbLIZ.append(iC4);
                sbLIZ.append(" < 16");
                iNewUserDebugServiceLIZIZ9.LJI("ShortcutRefreshEntryManager", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        if (LIZ() == 0) {
            C1865740yeS.LIZ.getClass();
            if (!C1865740yeS.LIZ() || (iNewUserDebugServiceLIZIZ8 = C1865740yeS.LIZIZ()) == null) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("commonCheck: reject by abValue=GROUP_CLOSE， abValue=");
            LIZ.getClass();
            sbLIZ2.append(LIZ());
            iNewUserDebugServiceLIZIZ8.LJI("ShortcutRefreshEntryManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (LIZIZ().LIZ == 0) {
            return;
        }
        INewUserFeedSignalService iNewUserFeedSignalService = (INewUserFeedSignalService) PluggableExtentionKt.pluggableSpi$default(INewUserFeedSignalService.class, false, false, false, 14, null);
        if (iNewUserFeedSignalService != null) {
            iLIZLLL = iNewUserFeedSignalService.LIZLLL();
        } else {
            iLIZLLL = 0;
        }
        LIZJ = iLIZLLL;
        if (iLIZLLL != 0 && iLIZLLL % LIZIZ().LIZ == 0) {
            C1865740yeS c1865740yeS = C1865740yeS.LIZ;
            Function0 function0 = new Function0() { // from class: X.0zfV
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = iC4;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("commonCheck: pass (vvNum=");
                    sbLIZ3.append(i2);
                    sbLIZ3.append(", skipNum=");
                    sbLIZ3.append(C1904820zfU.LIZJ);
                    sbLIZ3.append(", settingsSkipNum=");
                    C1904820zfU.LIZ.getClass();
                    sbLIZ3.append(C1904820zfU.LIZIZ().LIZ);
                    sbLIZ3.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ3);
                }
            };
            c1865740yeS.getClass();
            C1865740yeS.LIZLLL("ShortcutRefreshEntryManager", function0);
            if (LIZ() == 1) {
                C1865740yeS.LIZ.getClass();
                if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ7 = C1865740yeS.LIZIZ()) != null) {
                    iNewUserDebugServiceLIZIZ7.LJI("ShortcutRefreshEntryManager", "onPageSelected: tryShowRefreshTooltip");
                }
                if (i == 0) {
                    int i2 = ((Keva) ((C1904840zfW) LJFF.getValue()).LIZIZ.getValue()).getInt("tooltip_show_times", 0);
                    if (i2 >= LIZIZ().LIZLLL) {
                        if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ6 = C1865740yeS.LIZIZ()) != null) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("tryShowRefreshTooltip: blocked by frequency, times=");
                            sbLIZ3.append(i2);
                            sbLIZ3.append(", max=");
                            LIZ.getClass();
                            sbLIZ3.append(LIZIZ().LIZLLL);
                            iNewUserDebugServiceLIZIZ6.LJI("ShortcutRefreshEntryManager", C2188811AlT.LIZIZ(sbLIZ3));
                            return;
                        }
                        return;
                    }
                    IEarlyFeedbackService iEarlyFeedbackService = (IEarlyFeedbackService) PluggableExtentionKt.pluggableSpi$default(IEarlyFeedbackService.class, false, false, false, 14, null);
                    if (iEarlyFeedbackService != null && iEarlyFeedbackService.LJII(str)) {
                        if (!C1865740yeS.LIZ() || (iNewUserDebugServiceLIZIZ5 = C1865740yeS.LIZIZ()) == null) {
                            return;
                        }
                        iNewUserDebugServiceLIZIZ5.LJI("ShortcutRefreshEntryManager", "tryShowRefreshTooltip: blocked by bottom survey");
                        return;
                    }
                    if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ4 = C1865740yeS.LIZIZ()) != null) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("tryShowRefreshTooltip: show (times=");
                        sbLIZ4.append(i2);
                        sbLIZ4.append(", max=");
                        LIZ.getClass();
                        sbLIZ4.append(LIZIZ().LIZLLL);
                        sbLIZ4.append(')');
                        iNewUserDebugServiceLIZIZ4.LJI("ShortcutRefreshEntryManager", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1904780zfQ(iC4, null), 3);
                    return;
                }
                return;
            }
            if (LIZ() != 2) {
                return;
            }
            C1865740yeS.LIZ.getClass();
            if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ3 = C1865740yeS.LIZIZ()) != null) {
                iNewUserDebugServiceLIZIZ3.LJI("ShortcutRefreshEntryManager", "onPageSelected: trySilentRefreshFeed");
            }
            if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ2 = C1865740yeS.LIZIZ()) != null) {
                iNewUserDebugServiceLIZIZ2.LJI("ShortcutRefreshEntryManager", "trySilentRefreshFeed: start");
            }
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                C1570230qxp.LIZ.setValue("ug_feed_bubble_8_skip");
                return;
            } else {
                C1570230qxp.LIZ.postValue("ug_feed_bubble_8_skip");
                return;
            }
        }
        C1865740yeS.LIZ.getClass();
        if (!C1865740yeS.LIZ() || (iNewUserDebugServiceLIZIZ = C1865740yeS.LIZIZ()) == null) {
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("commonCheck: reject by skipNum=");
        sbLIZ5.append(LIZJ);
        sbLIZ5.append(" % settingsSkipNum=");
        LIZ.getClass();
        sbLIZ5.append(LIZIZ().LIZ);
        sbLIZ5.append(" != 0");
        iNewUserDebugServiceLIZIZ.LJI("ShortcutRefreshEntryManager", C2188811AlT.LIZIZ(sbLIZ5));
    }
}
