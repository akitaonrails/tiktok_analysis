package X;

import Y.ARunnableS82S0200000_13;
import com.bytedance.crash.monitor.f;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802010Vd9 extends RunnableC802050VdD implements InterfaceC792030V5d {
    public volatile int LLJIJIL;
    public IConfigManager LLJILJIL;
    public final RunnableC802040VdC LLJILJILJ;
    public volatile boolean LLJILLL;

    @Override // X.InterfaceC792030V5d
    public final void LIZ() {
    }

    @Override // X.RunnableC802050VdD
    public final void LIZJ() {
        if (!C802270VdZ.LJ()) {
            super.LIZJ();
            return;
        }
        try {
            IConfigManager iConfigManager = (IConfigManager) C792600V7i.LIZ(IConfigManager.class);
            this.LLJILJIL = iConfigManager;
            if (iConfigManager != null) {
                iConfigManager.registerConfigListener(this);
            }
            C0VXF.postDelayed(this.LLJILJILJ, 2000L);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.LIZJ();
        }
    }

    public final void LJIIJJI() {
        boolean zLJI = MethodIDManager.LJI(137904);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryGetConfigFromApm isReady:");
        sbLIZ.append(this.LLJILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJILLL) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tryGetConfigFromApm mTryCount:");
        sbLIZ2.append(this.LLJIJIL);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (this.LLJIJIL >= 30) {
            C0VXF.removeCallbacks(this.LLJILJILJ);
            super.LIZJ();
        } else {
            if (this.LLJILJIL == null) {
                IConfigManager iConfigManager = (IConfigManager) C792600V7i.LIZ(IConfigManager.class);
                this.LLJILJIL = iConfigManager;
                if (iConfigManager != null) {
                    iConfigManager.registerConfigListener(this);
                }
            }
            C0VXF.removeCallbacks(this.LLJILJILJ);
            C0VXF.postDelayed(this.LLJILJILJ, 2000L);
        }
        this.LLJIJIL++;
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0VdC] */
    public C802010Vd9(f fVar) {
        super(fVar);
        this.LLJILJILJ = new Runnable() { // from class: X.0VdC
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("InnerConfigManager@18d6.<init>$1");
                try {
                    this.LL.LJIIJJI();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("InnerConfigManager@18d6.<init>$1");
            }
        };
    }

    @Override // X.InterfaceC792030V5d
    public final void LJFF(JSONObject jSONObject, boolean z) {
        this.LLJILLL = true;
        C0VXF.removeCallbacks(this);
        C0VXF.post(new ARunnableS82S0200000_13(this, jSONObject, 45));
    }
}
