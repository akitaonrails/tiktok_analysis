package X;

/* JADX INFO: renamed from: X.0Pfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650820Pfs {
    public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150));
    public static final int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(284));
    public static final int LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(350));
    public final EnumC650850Pfv LIZ;
    public final int LIZIZ;
    public final InterfaceC650860Pfw LIZJ;

    public /* synthetic */ C650820Pfs() {
        this(EnumC650850Pfv.TOP_TO_BOTTOM, 0, null);
    }

    public C650820Pfs(EnumC650850Pfv enumC650850Pfv, int i, InterfaceC650860Pfw interfaceC650860Pfw) {
        this.LIZ = enumC650850Pfv;
        this.LIZIZ = i;
        this.LIZJ = interfaceC650860Pfw;
    }

    public static C650820Pfs LIZ(C650820Pfs c650820Pfs, EnumC650850Pfv enumC650850Pfv, int i, int i2) {
        InterfaceC650860Pfw interfaceC650860Pfw;
        if ((i2 & 1) != 0) {
            enumC650850Pfv = c650820Pfs.LIZ;
        }
        if ((i2 & 2) != 0) {
            i = c650820Pfs.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            interfaceC650860Pfw = c650820Pfs.LIZJ;
        } else {
            interfaceC650860Pfw = null;
        }
        c650820Pfs.getClass();
        return new C650820Pfs(enumC650850Pfv, i, interfaceC650860Pfw);
    }
}
