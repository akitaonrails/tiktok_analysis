package X;

/* JADX INFO: renamed from: X.12Pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19750612Pg {
    public final C375830EoP<Boolean> LIZ;
    public final C375830EoP<Boolean> LIZIZ;
    public final C375830EoP<Boolean> LIZJ;

    public C19750612Pg() {
        this(0);
    }

    public /* synthetic */ C19750612Pg(int i) {
        C375830EoP c375830EoP = new C375830EoP(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this(c375830EoP, new C375830EoP(bool), new C375830EoP(bool));
    }

    public C19750612Pg(C375830EoP<Boolean> c375830EoP, C375830EoP<Boolean> c375830EoP2, C375830EoP<Boolean> c375830EoP3) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = c375830EoP3;
    }

    public static C19750612Pg LIZ(C19750612Pg c19750612Pg, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        C375830EoP<Boolean> c375830EoP3;
        if ((i & 1) != 0) {
            c375830EoP = c19750612Pg.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP3 = c19750612Pg.LIZIZ;
        } else {
            c375830EoP3 = null;
        }
        if ((i & 4) != 0) {
            c375830EoP2 = c19750612Pg.LIZJ;
        }
        c19750612Pg.getClass();
        return new C19750612Pg(c375830EoP, c375830EoP3, c375830EoP2);
    }
}
