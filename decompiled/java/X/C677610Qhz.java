package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Qhz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677610Qhz implements InterfaceC677820QiK {
    public final List<InterfaceC677820QiK> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C677610Qhz(List<? extends InterfaceC677820QiK> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC677820QiK
    public final void onFailed(Throwable th) {
        Iterator<InterfaceC677820QiK> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onFailed(th);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    @Override // X.InterfaceC677820QiK
    public final void LJ(int i, n nVar) {
        Iterator<InterfaceC677820QiK> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LJ(i, nVar);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC677820QiK
    public final void LJI(int i, List<String> list) {
        Iterator<InterfaceC677820QiK> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LJI(i, list);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC677820QiK
    public final void LIZ(int i, n nVar, boolean z) {
        Iterator<InterfaceC677820QiK> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZ(i, nVar, z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC677820QiK
    public final void LIZIZ(n nVar, C1422405hW c1422405hW, int i, boolean z) {
        Iterator<InterfaceC677820QiK> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZIZ(nVar, c1422405hW, i, z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC677820QiK
    public final void LIZJ(n nVar, C1422405hW c1422405hW, int i, boolean z, long j, long j2) {
        Iterator<InterfaceC677820QiK> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZJ(nVar, c1422405hW, i, z, j, j2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC677820QiK
    public final void LIZLLL(int i, String str, Integer num, long j, long j2, long j3) {
        Iterator<InterfaceC677820QiK> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LIZLLL(i, str, num, j, j2, j3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC677820QiK
    public final void LJFF(int i, String str, Integer num, long j, long j2, long j3) {
        Iterator<InterfaceC677820QiK> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().LJFF(i, str, num, j, j2, j3);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
