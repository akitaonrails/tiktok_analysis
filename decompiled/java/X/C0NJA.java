package X;

import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NJA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NJA implements C0NJ1 {
    public final C0NJ9 LIZ = new C0NJ9(0);
    public final C0NJE LIZIZ = new C0NJE();
    public final C0NJE LIZJ = new C0NJE();

    @Override // X.C0NJ1
    public final C0NJE LIZ() {
        return this.LIZIZ;
    }

    @Override // X.C0NJ1
    public final C0NJE LIZJ() {
        return this.LIZJ;
    }

    @Override // X.C0NJ1
    public final C0NJ9 LJ() {
        return this.LIZ;
    }

    @Override // X.C0NJ1
    public final Object LIZIZ(Map<String, ? extends Object> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZJ = this.LIZJ.LIZJ(map, interfaceC1364105Vn);
        if (objLIZJ == C099R.LJFF()) {
            return objLIZJ;
        }
        return Unit.LIZ;
    }

    @Override // X.C0NJ1
    public final Object LIZLLL(Map<String, ? extends Object> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZJ = this.LIZIZ.LIZJ(map, interfaceC1364105Vn);
        if (objLIZJ == C099R.LJFF()) {
            return objLIZJ;
        }
        return Unit.LIZ;
    }

    @Override // X.C0NJ1
    public final Object LJFF(Map<String, ? extends Object> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZJ = this.LIZ.LIZ.LIZJ(map, interfaceC1364105Vn);
        if (objLIZJ == C099R.LJFF()) {
            return objLIZJ;
        }
        return Unit.LIZ;
    }
}
