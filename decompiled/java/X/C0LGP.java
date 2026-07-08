package X;

/* JADX INFO: renamed from: X.0LGP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LGP {
    public final C375830EoP<C539860LFg> LIZ;
    public final C375830EoP<Boolean> LIZIZ;

    public C0LGP() {
        this(null, null);
    }

    public C0LGP(C375830EoP<C539860LFg> c375830EoP, C375830EoP<Boolean> c375830EoP2) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
    }

    public static C0LGP LIZ(C0LGP c0lgp, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        if ((i & 1) != 0) {
            c375830EoP = c0lgp.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP2 = c0lgp.LIZIZ;
        }
        c0lgp.getClass();
        return new C0LGP(c375830EoP, c375830EoP2);
    }
}
