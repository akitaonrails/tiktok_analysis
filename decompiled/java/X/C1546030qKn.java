package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;

/* JADX INFO: renamed from: X.0qKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546030qKn implements InterfaceC1542060qEO {
    public final C20590115hb LIZ = new C20590115hb();

    @Override // X.InterfaceC1542060qEO
    public final void LIZ() {
    }

    @Override // X.InterfaceC1542060qEO
    public final InterfaceC1892990zMP LIZJ() {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            return iSparkHostApi.LJLIL();
        }
        return null;
    }

    @Override // X.InterfaceC1542060qEO
    public final InterfaceC1545600qK6 LIZLLL() {
        if (C1540320qBa.LIZ) {
            return new C1546050qKp();
        }
        return null;
    }

    @Override // X.InterfaceC1542060qEO
    public final InterfaceC214902198i LJ() {
        Class<? extends Fragment> clsLJJLJLI;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null && (clsLJJLJLI = iSparkHostApi.LJJLJLI()) != null) {
            try {
                C128Y c128yNewInstance = clsLJJLJLI.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (c128yNewInstance instanceof InterfaceC214902198i) {
                    return (InterfaceC214902198i) c128yNewInstance;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    @Override // X.InterfaceC1542060qEO
    public final C1546120qKw LJFF() {
        C1546120qKw c1546120qKw = new C1546120qKw();
        c1546120qKw.LIZJ = true;
        return c1546120qKw;
    }

    @Override // X.InterfaceC1542060qEO
    public final InterfaceC1163110gNB LJI() {
        return new C21395818oG();
    }

    @Override // X.InterfaceC1542060qEO
    public final InterfaceC1060140dh6 LJII() {
        return new C1058810dex();
    }

    @Override // X.InterfaceC1542060qEO
    public final InterfaceC1542220qEe LJIIIIZZ() {
        return new C1580250rDz();
    }

    @Override // X.InterfaceC1542060qEO
    public final /* bridge */ /* synthetic */ InterfaceC1545990qKj LIZIZ() {
        return this.LIZ;
    }
}
