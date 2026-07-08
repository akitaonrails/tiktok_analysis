package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.AdFreeSubscriptionSettingsSettings;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TPE, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TPE implements InterfaceC1009590cNZ {
    public static long LJFF;
    public static boolean LJI;
    public static int LJII;
    public static String LJIIIIZZ;
    public static int LJIIIZ;
    public static int LJIIJ;
    public static int LJIIJJI;
    public static final C0TPE LIZ = new C0TPE();
    public static final int LIZIZ = AdFreeSubscriptionSettingsSettings.LIZ().frequencyAdsFastSkippedCount;
    public static final int LIZJ = AdFreeSubscriptionSettingsSettings.LIZ().adsStayTimeCap;
    public static final int LIZLLL = AdFreeSubscriptionSettingsSettings.LIZ().frequencyAdsDislikeCount;
    public static final int LJ = AdFreeSubscriptionSettingsSettings.LIZ().frequencyAdsReportCount;
    public static final Set<String> LJIIL = new LinkedHashSet();
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(507));

    public static void LJ() {
        C1022620cia.LJ("TTPlusFeedCardFreqManager", "CLEAR AD TRACKING");
        LJIIIZ = 0;
        LJIIJ = 0;
        LJIIL.clear();
    }

    public static C0TPF LJFF() {
        return (C0TPF) LJIILIIL.getValue();
    }

    @Override // X.InterfaceC1009590cNZ
    public final void LIZ(String str) {
        if (Intrinsics.LJFF(LJIIIIZZ, str) && LJII == 0 && LJI) {
            LJII = 1;
        }
    }

    @Override // X.InterfaceC1009590cNZ
    public final void LIZIZ(String str) {
        if (LJI) {
            return;
        }
        LJII = 0;
        LJIIIIZZ = str;
        LJI = true;
        LJFF = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1009590cNZ
    public final void LIZJ(int i) {
        LJII = i;
    }

    @Override // X.InterfaceC1009590cNZ
    public final void LIZLLL(String str) {
        if (!LJI) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - LJFF;
        LJI = false;
        LJFF = 0L;
        LJIIIIZZ = null;
        double d = jCurrentTimeMillis / 1000.0d;
        int i = LJII;
        Set<String> set = LJIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fyp");
        sbLIZ.append('_');
        sbLIZ.append(str);
        if (set.contains(C2188811AlT.LIZIZ(sbLIZ))) {
            LJIIJJI = 0;
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fyp");
        sbLIZ2.append('_');
        sbLIZ2.append(str);
        set.add(C2188811AlT.LIZIZ(sbLIZ2));
        if (i == 1) {
            LJIIJJI = 0;
            C1022620cia.LJ("TTPlusFeedCardFreqManager", "POSITIVE_INTERACTION");
            return;
        }
        if (i == 2) {
            LJIIIZ++;
            LJIIJJI = 0;
            C1022620cia.LJ("TTPlusFeedCardFreqManager", "DISLIKE");
            if (LJIIIZ < LIZLLL) {
                return;
            }
            LJ();
            LJFF().LIZJ(2);
            C1022620cia.LJ("TTPlusFeedCardFreqManager", "DISLIKE REACHED");
            return;
        }
        if (i == 3) {
            LJIIJ++;
            LJIIJJI = 0;
            C1022620cia.LJ("TTPlusFeedCardFreqManager", "REPORT");
            if (LJIIJ < LJ) {
                return;
            }
            LJ();
            LJFF().LIZJ(3);
            C1022620cia.LJ("TTPlusFeedCardFreqManager", "REPORT REACHED");
            return;
        }
        if (d < LIZJ) {
            LJIIJJI++;
            C1022620cia.LJ("TTPlusFeedCardFreqManager", "FAST SKIP");
            if (LJIIJJI < LIZIZ) {
                return;
            }
            LJ();
            LJIIJJI = 0;
            C1022620cia.LJ("TTPlusFeedCardFreqManager", "FAST SKIP REACHED");
            LJFF().LIZJ(1);
            return;
        }
        C1022620cia.LJ("TTPlusFeedCardFreqManager", "SLOW SWIPE");
        LJIIJJI = 0;
    }
}
