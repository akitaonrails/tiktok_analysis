package androidx.compose.foundation.text.modifiers;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1680210tpD;
import X.C1683130ttv;
import X.C1691710u7l;
import X.C1691760u7q;
import X.C1691850u7z;
import X.C1692150u8T;
import X.C1692220u8a;
import X.C1692270u8f;
import X.C1693430uAX;
import X.C786410Ut5;
import X.InterfaceC1691620u7c;
import X.InterfaceC1691630u7d;
import X.InterfaceC594710NUf;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class TextAnnotatedStringElement extends AbstractC1685820tyG<C1691760u7q> {
    public final C1692220u8a LIZIZ;
    public final C1693430uAX LIZJ;
    public final InterfaceC594710NUf LIZLLL;
    public final Function1<C1692150u8T, Unit> LJ;
    public final int LJFF;
    public final boolean LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final List<C1692270u8f<C1680210tpD>> LJIIIZ;
    public final Function1<List<C1683130ttv>, Unit> LJIIJ;
    public final C1691850u7z LJIIJJI;
    public final InterfaceC1691620u7c LJIIL;
    public final InterfaceC1691630u7d LJIILIIL;
    public final Function1<C1691710u7l, Unit> LJIILJJIL;

    public TextAnnotatedStringElement() {
        throw null;
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1691760u7q(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        Function1<C1692150u8T, Unit> function1 = this.LJ;
        int iHashCode2 = (((((((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + this.LJFF) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31;
        List<C1692270u8f<C1680210tpD>> list = this.LJIIIZ;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Function1<List<C1683130ttv>, Unit> function12 = this.LJIIJ;
        int iHashCode4 = (iHashCode3 + (function12 != null ? function12.hashCode() : 0)) * 31;
        C1691850u7z c1691850u7z = this.LJIIJJI;
        int iHashCode5 = (iHashCode4 + (c1691850u7z != null ? c1691850u7z.hashCode() : 0)) * 31;
        InterfaceC1691620u7c interfaceC1691620u7c = this.LJIIL;
        int iHashCode6 = (iHashCode5 + (interfaceC1691620u7c != null ? interfaceC1691620u7c.hashCode() : 0)) * 31;
        Function1<C1691710u7l, Unit> function13 = this.LJIILJJIL;
        return iHashCode6 + (function13 != null ? function13.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    @Override // X.AbstractC1685820tyG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(X.AbstractC20055413dY r17) {
        /*
            r16 = this;
            r7 = r17
            X.0u7q r7 = (X.C1691760u7q) r7
            r0 = r16
            X.0u7c r3 = r0.LJIIL
            X.0uAX r2 = r0.LIZJ
            X.0u7c r1 = r7.LLJJL
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r1)
            r1 = r1 ^ 1
            r7.LLJJL = r3
            if (r1 != 0) goto L53
            X.0uAX r1 = r7.LLJJI
            if (r2 == r1) goto L4f
            X.0uAZ r2 = r2.LIZ
            X.0uAZ r1 = r1.LIZ
            boolean r1 = r2.LJFF(r1)
            if (r1 == 0) goto L53
        L24:
            r5 = 0
        L25:
            X.0u8a r1 = r0.LIZIZ
            boolean r4 = r7.LLJJJ(r1)
            X.0uAX r8 = r0.LIZJ
            java.util.List<X.0u8f<X.0tpD>> r9 = r0.LJIIIZ
            int r10 = r0.LJIIIIZZ
            int r11 = r0.LJII
            boolean r12 = r0.LJI
            X.0NUf r13 = r0.LIZLLL
            int r14 = r0.LJFF
            X.0u7d r15 = r0.LJIILIIL
            boolean r6 = r7.LLJJIJIL(r8, r9, r10, r11, r12, r13, r14, r15)
            kotlin.jvm.functions.Function1<X.0u8T, kotlin.Unit> r3 = r0.LJ
            kotlin.jvm.functions.Function1<java.util.List<X.0ttv>, kotlin.Unit> r2 = r0.LJIIJ
            X.0u7z r1 = r0.LJIIJJI
            kotlin.jvm.functions.Function1<X.0u7l, kotlin.Unit> r0 = r0.LJIILJJIL
            boolean r0 = r7.LLJJIJIIJIL(r3, r2, r1, r0)
            r7.LLJJI(r5, r4, r6, r0)
            return
        L4f:
            r2.getClass()
            goto L24
        L53:
            r5 = 1
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.LJIJJ(X.13dY):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        if (Intrinsics.LJFF(this.LJIIL, textAnnotatedStringElement.LJIIL) && Intrinsics.LJFF(this.LIZIZ, textAnnotatedStringElement.LIZIZ) && Intrinsics.LJFF(this.LIZJ, textAnnotatedStringElement.LIZJ) && Intrinsics.LJFF(this.LJIIIZ, textAnnotatedStringElement.LJIIIZ) && Intrinsics.LJFF(this.LIZLLL, textAnnotatedStringElement.LIZLLL) && this.LJ == textAnnotatedStringElement.LJ && this.LJIILJJIL == textAnnotatedStringElement.LJIILJJIL && this.LJFF == textAnnotatedStringElement.LJFF && this.LJI == textAnnotatedStringElement.LJI && this.LJII == textAnnotatedStringElement.LJII && this.LJIIIIZZ == textAnnotatedStringElement.LJIIIIZZ && this.LJIIJ == textAnnotatedStringElement.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, textAnnotatedStringElement.LJIIJJI)) {
            return true;
        }
        return false;
    }

    public TextAnnotatedStringElement(C1692220u8a c1692220u8a, C1693430uAX c1693430uAX, InterfaceC594710NUf interfaceC594710NUf, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, InterfaceC1691620u7c interfaceC1691620u7c, InterfaceC1691630u7d interfaceC1691630u7d, Function1 function13) {
        this.LIZIZ = c1692220u8a;
        this.LIZJ = c1693430uAX;
        this.LIZLLL = interfaceC594710NUf;
        this.LJ = function1;
        this.LJFF = i;
        this.LJI = z;
        this.LJII = i2;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = list;
        this.LJIIJ = function12;
        this.LJIIJJI = null;
        this.LJIIL = interfaceC1691620u7c;
        this.LJIILIIL = interfaceC1691630u7d;
        this.LJIILJJIL = function13;
    }
}
