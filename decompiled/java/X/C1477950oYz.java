package X;

/* JADX INFO: renamed from: X.0oYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1477950oYz implements InterfaceC1477240oXq {
    @Override // X.InterfaceC1477240oXq
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC1477240oXq
    public final String getName() {
        return "DefaultVideoUrlHook";
    }

    @Override // X.InterfaceC1477240oXq
    public final /* synthetic */ boolean isValid() {
        return true;
    }

    @Override // X.InterfaceC1477240oXq
    public final C1477210oXn LIZ(C1477250oXr c1477250oXr) {
        String[] strArr = c1477250oXr.LIZJ.LIZJ;
        if (strArr.length == 0) {
            return null;
        }
        return new C1477210oXn(strArr[0], this);
    }

    @Override // X.InterfaceC1477240oXq
    public final C1477210oXn LIZJ(InterfaceC1477990oZ3 interfaceC1477990oZ3) {
        String[] strArr = interfaceC1477990oZ3.LIZ().LIZJ;
        if (strArr.length == 0) {
            return null;
        }
        return new C1477210oXn(strArr[0], this);
    }

    @Override // X.InterfaceC1477240oXq
    public final C1477210oXn LIZLLL(C1477250oXr c1477250oXr) {
        String[] strArr = c1477250oXr.LIZIZ.LIZJ;
        if (strArr.length == 0) {
            return null;
        }
        return new C1477210oXn(strArr[0], this);
    }
}
