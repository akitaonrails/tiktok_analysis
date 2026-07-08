package X;

/* JADX INFO: renamed from: X.19tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21686119tz {
    public static final C136N<Integer> LJFF;
    public C136N<Integer> LIZ = LJFF;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;

    public void LIZ(int i, InterfaceC21686919u7 interfaceC21686919u7) {
    }

    public void LIZIZ(int i, InterfaceC21686919u7 interfaceC21686919u7) {
    }

    public int LIZJ(int i, boolean z, boolean z2, InterfaceC21686919u7 interfaceC21686919u7) {
        return 0;
    }

    public void LIZLLL(int i, InterfaceC21686919u7 interfaceC21686919u7, boolean z) {
    }

    public abstract void LJ(InterfaceC21686919u7 interfaceC21686919u7);

    public abstract void LJFF(C21673319rv c21673319rv, C21673919s1 c21673919s1, int i, int i2, int i3, InterfaceC21686919u7 interfaceC21686919u7);

    public abstract int LJI();

    public void LJII() {
    }

    public void LJIIIIZZ(C21686719u5 c21686719u5) {
    }

    public void LJIIIZ(int i, int i2) {
    }

    public void LJIIJ(int i, int i2, int i3) {
    }

    public abstract boolean LJIIL();

    public abstract void LJIILIIL(C21673319rv c21673319rv, C21673919s1 c21673919s1, C21686319u1 c21686319u1, C21687819uG c21687819uG, InterfaceC21686919u7 interfaceC21686919u7);

    public abstract void LJIILJJIL(C21673319rv c21673319rv, C21673919s1 c21673919s1, InterfaceC21686919u7 interfaceC21686919u7);

    public abstract void LJIILL(int i);

    public void LJIIZILJ(C21673919s1 c21673919s1, C21686719u5 c21686719u5, InterfaceC21686919u7 interfaceC21686919u7) {
    }

    static {
        new C136N(Integer.MIN_VALUE, Integer.MAX_VALUE);
        LJFF = new C136N<>(-1, -1);
    }

    public boolean LJIIJJI(int i) {
        return !this.LIZ.LIZ(Integer.valueOf(i));
    }

    public final void LJIILLIIL(int i, int i2) {
        if (i2 >= i) {
            if (i == -1 && i2 == -1) {
                this.LIZ = LJFF;
                LJIIIZ(i, i2);
                return;
            }
            if ((i2 - i) + 1 == LJI()) {
                if (i == ((Integer) this.LIZ.LIZIZ).intValue() && i2 == ((Integer) this.LIZ.LIZ).intValue()) {
                    return;
                }
                this.LIZ = new C136N<>(Integer.valueOf(i), Integer.valueOf(i2));
                LJIIIZ(i, i2);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Item count mismatch - range: ");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(", count: ");
            sbLIZ.append(LJI());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        throw new IllegalArgumentException("End position must be >= start position");
    }
}
