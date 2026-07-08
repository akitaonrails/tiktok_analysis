package X;

import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.19AL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19AL {
    public final AbstractC214793194d LIZ;
    public final InterfaceC363130ELn LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC21498119Bj<Scene> LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final C199E LJIIIZ;
    public final InterfaceC21495319Ah LJIIJ;
    public final boolean LJIIJJI;
    public final C13X2 LJIIL;
    public final boolean LJIILIIL;

    public final InterfaceC21495319Ah LIZ(Class<?> cls) {
        C199E c199e;
        InterfaceC21495319Ah interfaceC21495319Ah = this.LJIIJ;
        if (interfaceC21495319Ah == null && (c199e = this.LJIIIZ) != null) {
            int i = C199D.LIZ[c199e.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    return new C19AW(cls);
                }
                return interfaceC21495319Ah;
            }
            return new C19AX(cls);
        }
        return interfaceC21495319Ah;
    }

    public C19AL(InterfaceC21498119Bj interfaceC21498119Bj, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC363130ELn interfaceC363130ELn, AbstractC214793194d abstractC214793194d, C199E c199e, InterfaceC21495319Ah interfaceC21495319Ah, boolean z7, C13X2 c13x2, boolean z8) {
        this.LIZLLL = interfaceC21498119Bj;
        this.LIZJ = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = z5;
        this.LJIILIIL = z6;
        this.LIZIZ = interfaceC363130ELn;
        this.LIZ = abstractC214793194d;
        this.LJIIIZ = c199e;
        this.LJIIJ = interfaceC21495319Ah;
        this.LJIIJJI = z7;
        this.LJIIL = c13x2;
        this.LJIIIIZZ = z8;
    }
}
