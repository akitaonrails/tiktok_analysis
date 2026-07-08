package X;

import Y.AfS193S0100000_24;
import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.spi.IActivityTabService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0rNQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1586100rNQ {
    public final Keva LIZ;
    public final INetwork LIZIZ;
    public volatile long LIZJ;
    public volatile long LIZLLL;
    public volatile boolean LJ;
    public final AtomicBoolean LJFF;
    public boolean LJI;

    public final void LIZ() {
        this.LIZ.storeLong("server_time_key", this.LIZJ);
        this.LIZ.storeLong("server_time_interval_key", this.LIZLLL);
        this.LIZ.storeLong("boot_time_key", System.currentTimeMillis() - SystemClock.elapsedRealtime());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZIZ() {
        /*
            r12 = this;
            long r0 = r12.LIZLLL
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r9 = 1
            if (r2 <= 0) goto L3a
            long r7 = r12.LIZJ
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r10 = r10 + r0
            boolean r0 = r12.LJI
            if (r0 != 0) goto L32
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            com.bytedance.keva.Keva r1 = r12.LIZ
            java.lang.String r0 = "boot_time_key"
            long r0 = r1.getLong(r0, r5)
            long r2 = r2 - r0
            long r3 = java.lang.Math.abs(r2)
            r1 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L3a
            r12.LJI = r9
        L32:
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 < 0) goto L3a
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 > 0) goto L40
        L3a:
            com.ss.android.ugc.aweme.network.INetwork r0 = r12.LIZIZ
            long r10 = r0.LJ()
        L40:
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 > 0) goto L46
            r12.LJ = r9
        L46:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1586100rNQ.LIZIZ():long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0rNP] */
    public AbstractC1586100rNQ() {
        Keva repo = Keva.getRepo("ActivityTimeManager");
        this.LIZ = repo;
        INetwork iNetwork = (INetwork) ServiceManager.get().getService(INetwork.class);
        this.LIZIZ = iNetwork;
        this.LIZJ = repo.getLong("server_time_key", 0L);
        this.LIZLLL = repo.getLong("server_time_interval_key", 0L);
        this.LJFF = new AtomicBoolean(true);
        C1906580ziK.LIZJ().LIZ().LJLLLLLL(new AfS193S0100000_24(this, 29));
        iNetwork.LIZLLL(new C0XK6() { // from class: X.0rNP
            @Override // X.C0XK6
            public final void LIZ(long j) {
                C19EG c19egLIZIZ;
                HomeTabAbility homeTabAbilityLIZIZ;
                AbstractC1586100rNQ abstractC1586100rNQ = this.LIZ;
                abstractC1586100rNQ.getClass();
                if (j > 1000000000000L) {
                    long jElapsedRealtime = j - SystemClock.elapsedRealtime();
                    if (abstractC1586100rNQ.LIZLLL == 0 || abstractC1586100rNQ.LIZJ == 0 || Math.abs(jElapsedRealtime - abstractC1586100rNQ.LIZLLL) > 10000) {
                        abstractC1586100rNQ.LIZJ = j;
                        abstractC1586100rNQ.LIZLLL = jElapsedRealtime;
                    }
                }
                if (this.LIZ.LJFF.compareAndSet(true, false)) {
                    this.LIZ.LIZ();
                    if (this.LIZ.LJ) {
                        if (!this.LIZ.LIZ.getBoolean("key_activity_valid", false) && ((IActivityTabService) ServiceManager.get().getService(IActivityTabService.class)).LJI(EnumC1584360rKc.ACTIVITY)) {
                            AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
                            int length = abstractC1387200mCcArrLJII.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                AbstractC1387200mCc abstractC1387200mCc = abstractC1387200mCcArrLJII[i];
                                if (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) {
                                    Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                                    if (activityLIZIZ != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null && (homeTabAbilityLIZIZ = C0DMM.LIZIZ(C1558360qeg.LJI(c19egLIZIZ, null))) != null) {
                                        homeTabAbilityLIZIZ.g62(EnumC1585090rLn.ACTIVITY_TAB_UPDATE);
                                    }
                                } else {
                                    i++;
                                }
                            }
                            C1586120rNS.LIZ(C1586120rNS.LIZ, "ActivityTimeManager", "ActivityTabConfigHelper onFirstServerTimeCalibrate");
                        }
                        this.LIZ.LJ = false;
                    }
                }
            }
        });
    }
}
