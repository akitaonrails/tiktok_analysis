package X;

import Y.ARunnableS123S0100000_23;
import Y.ARunnableS42S0110000_23;
import android.content.Context;
import com.bytedance.android.monitorV2.hybridSetting.entity.BidInfo;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0pg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520770pg3 implements InterfaceC1520310pfJ {
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public PthreadTimer LJ;
    public C1520430pfV LJFF;
    public final HybridSettingInitConfig LJI;
    public final ScheduledExecutorService LIZLLL = C786410Ut5.f4(1);
    public volatile C1520760pg2 LIZ = new C1520760pg2();

    public final void LIZ() {
        if (this.LJFF == null) {
            try {
                this.LJFF = new C1520430pfV(this.LJI);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1520960pgM.LIZ("startup_handle", th);
                int i = C2187451AjH.LIZ;
                C1521730phb.LIZIZ("HybridSettingRequestService_init", "setting request use default cause by Throwable");
            }
        }
    }

    @Override // X.InterfaceC1520310pfJ
    public final List<C1520780pg4> LJFF() {
        return (this.LIZ == null || this.LIZ.LIZ == null || this.LIZ.LIZ.LIZIZ == null) ? new ArrayList() : this.LIZ.LIZ.LIZIZ;
    }

    @Override // X.InterfaceC1520310pfJ
    public final void LJI() {
        try {
            this.LIZLLL.submit(new ARunnableS123S0100000_23(this, 136));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC1520310pfJ
    public final Map<String, Integer> LJII() {
        return this.LIZ.LIZLLL != null ? this.LIZ.LIZLLL : new HashMap();
    }

    @Override // X.InterfaceC1520310pfJ
    public final BidInfo LJIIIIZZ() {
        return (this.LIZ == null || this.LIZ.LIZ == null) ? new BidInfo() : this.LIZ.LIZ;
    }

    @Override // X.InterfaceC1520310pfJ
    public final Set<String> LJIIIZ() {
        return this.LIZ.LJ != null ? this.LIZ.LJ : new HashSet();
    }

    @Override // X.InterfaceC1520310pfJ
    public final HybridSettingInitConfig LJ() {
        return this.LJI;
    }

    public C1520770pg3(HybridSettingInitConfig hybridSettingInitConfig) {
        this.LJI = hybridSettingInitConfig;
    }

    public final void LIZJ(boolean z) {
        try {
            ARunnableS42S0110000_23 aRunnableS42S0110000_23 = new ARunnableS42S0110000_23(this, z, 8);
            EnumC1520990pgP enumC1520990pgP = EnumC1520990pgP.ENABLE_HYBRID_SETTING_API_REQUEST_DELAY;
            if (z && enumC1520990pgP.isEnabled()) {
                this.LIZLLL.schedule(aRunnableS42S0110000_23, enumC1520990pgP.getIntOption("delay_s", 30), TimeUnit.SECONDS);
            } else {
                this.LIZLLL.submit(aRunnableS42S0110000_23);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1520960pgM.LIZIZ(th);
        }
    }

    public final void LIZLLL(int i) {
        if (i > 0) {
            if (this.LJ == null) {
                this.LJ = new PthreadTimer("HybridSettingManagerImpl");
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("monitor setting update after ");
            sbLIZ.append(i);
            sbLIZ.append(" secs");
            C1521730phb.LJFF("HybridSettingRequestService_update", C2188811AlT.LIZIZ(sbLIZ));
            this.LJ.schedule(new C1554350qYD(this, 1), i * LSPassThroughRecordSizeConfig.DEFAULT);
        }
    }

    public final void LIZIZ(Context context, boolean z) {
        if (context == null) {
            int i = C2187451AjH.LIZ;
            C1521730phb.LIZIZ("HybridSettingRequestService_init", "init error, no context");
        } else {
            if (this.LIZIZ) {
                return;
            }
            this.LIZIZ = true;
            this.LIZJ = z;
            try {
                this.LIZLLL.submit(new ARunnableS123S0100000_23(this, 135));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1520960pgM.LIZIZ(th);
            }
        }
    }
}
