package X;

/* JADX INFO: renamed from: X.12PE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12PE {
    public final C375830EoP<Boolean> LIZ;
    public final C375830EoP<Boolean> LIZIZ;
    public final C375830EoP<Integer> LIZJ;

    public C12PE() {
        this(0);
    }

    public /* synthetic */ C12PE(int i) {
        this(new C375830EoP(Boolean.FALSE), new C375830EoP(Boolean.TRUE), new C375830EoP(0));
    }

    public C12PE(C375830EoP<Boolean> c375830EoP, C375830EoP<Boolean> c375830EoP2, C375830EoP<Integer> c375830EoP3) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = c375830EoP3;
    }

    public static C12PE LIZ(C12PE c12pe, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, int i) {
        if ((i & 1) != 0) {
            c375830EoP = c12pe.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP2 = c12pe.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP3 = c12pe.LIZJ;
        }
        c12pe.getClass();
        return new C12PE(c375830EoP, c375830EoP2, c375830EoP3);
    }
}
