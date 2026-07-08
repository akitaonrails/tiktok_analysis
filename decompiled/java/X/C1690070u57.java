package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u57, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690070u57 implements InterfaceC1564820qp6, InterfaceC1690350u5Z {
    public final C1690020u52 LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;
    public final InterfaceC1690350u5Z LJ;
    public final float LJFF;
    public final boolean LJI;
    public final InterfaceC497601wk LJII;
    public final InterfaceC1690500u5o LJIIIIZZ;
    public final long LJIIIZ;
    public final List<C1690020u52> LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final boolean LJIILJJIL;
    public final EnumC1684030tvN LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;

    public C1690070u57() {
        throw null;
    }

    @Override // X.InterfaceC1690350u5Z
    public final Map<C115T, Integer> LJIILL() {
        return this.LJ.LJIILL();
    }

    @Override // X.InterfaceC1690350u5Z
    public final void LJIILLIIL() {
        this.LJ.LJIILLIIL();
    }

    @Override // X.InterfaceC1690350u5Z
    public final Function1<Object, Unit> LJIIZILJ() {
        return this.LJ.LJIIZILJ();
    }

    @Override // X.InterfaceC1690350u5Z
    public final int getHeight() {
        return this.LJ.getHeight();
    }

    @Override // X.InterfaceC1690350u5Z
    public final int getWidth() {
        return this.LJ.getWidth();
    }

    @Override // X.InterfaceC1564820qp6
    public final int LIZJ() {
        return -this.LJIIJJI;
    }

    @Override // X.InterfaceC1564820qp6
    public final long LIZ() {
        int width = getWidth();
        return (((long) getHeight()) & 4294967295L) | (((long) width) << 32);
    }

    @Override // X.InterfaceC1564820qp6
    public final int LIZIZ() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1564820qp6
    public final int LIZLLL() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1564820qp6
    public final int LJ() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC1564820qp6
    public final int LJFF() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1564820qp6
    public final int LJI() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC1564820qp6
    public final List<C1690020u52> LJII() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1564820qp6
    public final EnumC1684030tvN getOrientation() {
        return this.LJIILL;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1690070u57 LJIIIIZZ(int r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690070u57.LJIIIIZZ(int, boolean):X.0u57");
    }

    public C1690070u57(C1690020u52 c1690020u52, int i, boolean z, float f, InterfaceC1690350u5Z interfaceC1690350u5Z, float f2, boolean z2, InterfaceC497601wk interfaceC497601wk, InterfaceC1690500u5o interfaceC1690500u5o, long j, List list, int i2, int i3, int i4, boolean z3, EnumC1684030tvN enumC1684030tvN, int i5, int i6) {
        this.LIZ = c1690020u52;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = f;
        this.LJ = interfaceC1690350u5Z;
        this.LJFF = f2;
        this.LJI = z2;
        this.LJII = interfaceC497601wk;
        this.LJIIIIZZ = interfaceC1690500u5o;
        this.LJIIIZ = j;
        this.LJIIJ = list;
        this.LJIIJJI = i2;
        this.LJIIL = i3;
        this.LJIILIIL = i4;
        this.LJIILJJIL = z3;
        this.LJIILL = enumC1684030tvN;
        this.LJIILLIIL = i5;
        this.LJIIZILJ = i6;
    }
}
