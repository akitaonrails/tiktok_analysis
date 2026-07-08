package X;

/* JADX INFO: renamed from: X.0lGY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351200lGY implements InterfaceC1351220lGa {
    public static final C1351200lGY LIZ = new C1351200lGY();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C321750CjN());

    public static final void LIZIZ() {
        ((C08I7) LIZIZ.getValue()).LIZ();
    }

    @Override // X.InterfaceC1351220lGa
    public final C1351190lGX get(String str) {
        if (str == null) {
            return new C1351190lGX(0);
        }
        C1351190lGX c1351190lGX = (C1351190lGX) ((C08I7) LIZIZ.getValue()).LIZIZ(str);
        if (c1351190lGX != null) {
            return C1351190lGX.LIZ(c1351190lGX, false, false, null, 7);
        }
        return new C1351190lGX(0);
    }

    @Override // X.InterfaceC1351220lGa
    public final void LIZ(String str, C1351190lGX c1351190lGX) {
        if (str == null) {
            return;
        }
        ((C08I7) LIZIZ.getValue()).LIZLLL(str, c1351190lGX);
    }
}
