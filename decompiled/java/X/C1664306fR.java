package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.strategy.IBusinessConfig;
import com.ss.android.ugc.aweme.im.strategy.IStrategyPlatformService;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.StreakMilestoneConf;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;

/* JADX INFO: renamed from: X.06fR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1664306fR {
    public static final C1664306fR LIZ = new C1664306fR();
    public static StreakMilestoneConf LIZIZ;

    public final void LIZ() {
        synchronized (this) {
            try {
                LIZIZ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final StreakMilestoneConf LIZIZ() {
        StreakMilestoneConf streakMilestoneConfLIZJ;
        synchronized (this) {
            try {
                StreakMilestoneConf streakMilestoneConf = LIZIZ;
                if (streakMilestoneConf != null) {
                    return streakMilestoneConf;
                }
                if (C1603906Pt.LIZIZ().enableSettings) {
                    LIZ.getClass();
                    streakMilestoneConfLIZJ = LIZJ();
                    if (streakMilestoneConfLIZJ == null) {
                        streakMilestoneConfLIZJ = C1603906Pt.LIZ();
                    }
                } else {
                    LIZ.getClass();
                    streakMilestoneConfLIZJ = LIZJ();
                }
                LIZIZ = streakMilestoneConfLIZJ;
                return streakMilestoneConfLIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static StreakMilestoneConf LIZJ() {
        InterfaceC1664506fT interfaceC1664506fTLIZJ;
        IStrategyPlatformService iStrategyPlatformService = (IStrategyPlatformService) PluggableExtentionKt.pluggableSpiForReal(IStrategyPlatformService.class);
        if (iStrategyPlatformService == null) {
            return null;
        }
        C1664406fS c1664406fS = new C1664406fS(0);
        C0ZMZ c0zmzLJIIIZ = iStrategyPlatformService.LJIIIZ();
        IDMResourceLoadService iDMResourceLoadService = (IDMResourceLoadService) PluggableExtentionKt.pluggableSpiForReal(IDMResourceLoadService.class);
        if (iDMResourceLoadService != null && (interfaceC1664506fTLIZJ = iDMResourceLoadService.LIZJ(C0Z3V.DIMENSION_UID, true)) != null) {
            EnumC909380Zlw enumC909380Zlw = EnumC909380Zlw.STREAK_MILESTONE;
            interfaceC1664506fTLIZJ.LIZ(enumC909380Zlw.getKey(), enumC909380Zlw.getKey());
            interfaceC1664506fTLIZJ.LJFF(enumC909380Zlw.getKey());
            interfaceC1664506fTLIZJ.LIZIZ(enumC909380Zlw.getKey(), enumC909380Zlw.getKey(), C0Z38.MODE_FIRST_ONLY, iStrategyPlatformService.LIZ(enumC909380Zlw));
            interfaceC1664506fTLIZJ.LJ(enumC909380Zlw.getKey());
            interfaceC1664506fTLIZJ.LIZJ(enumC909380Zlw.getKey());
        }
        EnumC909380Zlw enumC909380Zlw2 = EnumC909380Zlw.STREAK_MILESTONE;
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        IBusinessConfig iBusinessConfigLJ = iStrategyPlatformService.LJ(enumC909380Zlw2, c1664406fS, c0zmzLJIIIZ, curUserId, false);
        if (iBusinessConfigLJ instanceof StreakMilestoneConf) {
            return (StreakMilestoneConf) iBusinessConfigLJ;
        }
        return null;
    }
}
