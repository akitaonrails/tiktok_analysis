package X;

/* JADX INFO: renamed from: X.03jo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C927003jo {
    public static final /* synthetic */ int LJ = 0;
    public final C927303jr LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C927003jo(C927303jr c927303jr, boolean z, boolean z2, int i) {
        boolean z3;
        c927303jr = (i & 1) != 0 ? null : c927303jr;
        z = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z2 = (i & 8) != 0 ? false : z2;
        this.LIZ = c927303jr;
        this.LIZIZ = z;
        this.LIZJ = z3;
        this.LIZLLL = z2;
    }
}
