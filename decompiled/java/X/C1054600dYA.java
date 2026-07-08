package X;

import android.hardware.SensorManager;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0dYA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1054600dYA extends AbstractC1063090dlr implements InterfaceC1054580dY8 {
    public boolean LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;

    @Override // X.AbstractC1063090dlr
    public final void LIZLLL() {
        this.LJI = true;
    }

    @Override // X.AbstractC1063090dlr
    public final void LJ() {
        this.LJI = false;
    }

    @Override // X.AbstractC1063090dlr
    public final void LIZJ() {
        InteractiveBrandedEffectInfo interactiveBrandedEffectInfo = this.LIZIZ;
        if (interactiveBrandedEffectInfo == null || !interactiveBrandedEffectInfo.getEnableShake()) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.LJIIIIZZ.getValue();
            if (sensorManager != null) {
                C1300690jx5.LJ(sensorManager, (C1054570dY7) this.LJII.getValue(), CertProviderManagerKt.findCert("bpea-commerce_ibe_unregister_sensor", 1476415492));
            }
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJFF() {
        InteractiveBrandedEffectInfo interactiveBrandedEffectInfo = this.LIZIZ;
        if (interactiveBrandedEffectInfo == null || !interactiveBrandedEffectInfo.getEnableShake()) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.LJIIIIZZ.getValue();
            if (sensorManager != null) {
                C1054570dY7 c1054570dY7 = (C1054570dY7) this.LJII.getValue();
                SensorManager sensorManager2 = (SensorManager) this.LJIIIIZZ.getValue();
                C1300690jx5.LIZJ(sensorManager, c1054570dY7, sensorManager2 != null ? C2204961BRm.LJJL(sensorManager2, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOusLZnL2TZRZUsQDoGwfpyVvhHPcxOzEA0M8Xvt79LSpg==", null)) : null, 2, CertProviderManagerKt.findCert("bpea-commerce_ibe_register_sensor", 1476415492));
            }
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1054580dY8
    public final boolean LIZIZ() {
        return this.LJI;
    }

    public C1054600dYA(String str, InteractiveBrandedEffectInfo interactiveBrandedEffectInfo) {
        super(str, interactiveBrandedEffectInfo, 0, 56);
        this.LJII = C452501pT.LIZIZ(new AwS560S0100000_16(this, 615));
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(399));
    }
}
