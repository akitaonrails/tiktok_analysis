package X;

/* JADX INFO: renamed from: X.19ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21686019ty extends AbstractC21685919tx {
    public int LJIIJJI;
    public boolean LJIIL;

    public C21686019ty(int i, int i2) {
        this.LJI = i2;
        this.LJIIJJI = i < 0 ? 0 : i;
    }

    @Override // X.AbstractC21686119tz
    public final void LJIIZILJ(C21673919s1 c21673919s1, C21686719u5 c21686719u5, InterfaceC21686919u7 interfaceC21686919u7) {
        this.LJIIL = true;
    }

    @Override // X.AbstractC21686119tz
    public final int LIZJ(int i, boolean z, boolean z2, InterfaceC21686919u7 interfaceC21686919u7) {
        boolean z3;
        int i2;
        int i3;
        if (interfaceC21686919u7.getOrientation() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            if (i != this.LJI - 1) {
                return 0;
            }
            if (z3) {
                i3 = this.LJ;
            } else {
                i3 = this.LIZJ;
            }
            return 0 + i3;
        }
        if (i != 0) {
            return 0;
        }
        if (z3) {
            i2 = this.LIZLLL;
        } else {
            i2 = this.LIZIZ;
        }
        return 0 - i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[PHI: r1
      0x0064: PHI (r1v48 boolean) = (r1v2 boolean), (r1v49 boolean) binds: [B:78:0x0205, B:22:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0209 A[PHI: r1
      0x0209: PHI (r1v3 boolean) = (r1v2 boolean), (r1v49 boolean) binds: [B:78:0x0205, B:22:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC21685919tx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(X.C21673319rv r19, X.C21673919s1 r20, X.C21686319u1 r21, X.C21687819uG r22, X.InterfaceC21686919u7 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21686019ty.LJIJI(X.19rv, X.19s1, X.19u1, X.19uG, X.19u7):void");
    }
}
