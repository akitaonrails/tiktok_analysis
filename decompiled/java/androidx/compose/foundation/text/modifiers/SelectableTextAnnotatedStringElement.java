package androidx.compose.foundation.text.modifiers;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1678110tlp;
import X.C1680210tpD;
import X.C1683130ttv;
import X.C1691720u7m;
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
public final class SelectableTextAnnotatedStringElement extends AbstractC1685820tyG<C1691720u7m> {
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

    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.LIZIZ) + ", style=" + this.LIZJ + ", fontFamilyResolver=" + this.LIZLLL + ", onTextLayout=" + this.LJ + ", overflow=" + ((Object) C1678110tlp.LIZ(this.LJFF)) + ", softWrap=" + this.LJI + ", maxLines=" + this.LJII + ", minLines=" + this.LJIIIIZZ + ", placeholders=" + this.LJIIIZ + ", onPlaceholderLayout=" + this.LJIIJ + ", selectionController=" + this.LJIIJJI + ", color=" + this.LJIIL + ", autoSize=" + this.LJIILIIL + ')';
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1691720u7m(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL);
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
        InterfaceC1691630u7d interfaceC1691630u7d = this.LJIILIIL;
        int iHashCode6 = (iHashCode5 + (interfaceC1691630u7d != null ? interfaceC1691630u7d.hashCode() : 0)) * 31;
        InterfaceC1691620u7c interfaceC1691620u7c = this.LJIIL;
        return iHashCode6 + (interfaceC1691620u7c != null ? interfaceC1691620u7c.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    @Override // X.AbstractC1685820tyG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(X.AbstractC20055413dY r17) {
        /*
            r16 = this;
            r5 = r17
            X.0u7m r5 = (X.C1691720u7m) r5
            r1 = r16
            X.0u8a r7 = r1.LIZIZ
            X.0uAX r8 = r1.LIZJ
            java.util.List<X.0u8f<X.0tpD>> r9 = r1.LJIIIZ
            int r10 = r1.LJIIIIZZ
            int r11 = r1.LJII
            boolean r12 = r1.LJI
            X.0NUf r13 = r1.LIZLLL
            int r14 = r1.LJFF
            kotlin.jvm.functions.Function1<X.0u8T, kotlin.Unit> r6 = r1.LJ
            kotlin.jvm.functions.Function1<java.util.List<X.0ttv>, kotlin.Unit> r0 = r1.LJIIJ
            X.0u7z r4 = r1.LJIIJJI
            X.0u7c r2 = r1.LJIIL
            X.0u7d r15 = r1.LJIILIIL
            X.0u7q r3 = r5.LLJJIJIIJIL
            X.0u7c r1 = r3.LLJJL
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            r1 = r1 ^ 1
            r3.LLJJL = r2
            if (r1 != 0) goto L62
            X.0uAX r1 = r3.LLJJI
            if (r8 == r1) goto L5e
            X.0uAZ r2 = r8.LIZ
            X.0uAZ r1 = r1.LIZ
            boolean r1 = r2.LJFF(r1)
            if (r1 == 0) goto L62
        L3c:
            r2 = 0
        L3d:
            X.0u7q r1 = r5.LLJJIJIIJIL
            boolean r1 = r1.LLJJJ(r7)
            X.0u7q r7 = r5.LLJJIJIIJIL
            boolean r9 = r7.LLJJIJIL(r8, r9, r10, r11, r12, r13, r14, r15)
            X.0u7q r8 = r5.LLJJIJIIJIL
            kotlin.jvm.functions.Function1<? super X.0u7l, kotlin.Unit> r7 = r5.LLJJIJI
            boolean r0 = r8.LLJJIJIIJIL(r6, r0, r4, r7)
            r3.LLJJI(r2, r1, r9, r0)
            r5.LLJJIII = r4
            X.13dH r0 = X.C20052513d5.LJFF(r5)
            r0.LJJJJI()
            return
        L5e:
            r8.getClass()
            goto L3c
        L62:
            r2 = 1
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement.LJIJJ(X.13dY):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        if (Intrinsics.LJFF(this.LJIIL, selectableTextAnnotatedStringElement.LJIIL) && Intrinsics.LJFF(this.LIZIZ, selectableTextAnnotatedStringElement.LIZIZ) && Intrinsics.LJFF(this.LIZJ, selectableTextAnnotatedStringElement.LIZJ) && Intrinsics.LJFF(this.LJIIIZ, selectableTextAnnotatedStringElement.LJIIIZ) && Intrinsics.LJFF(this.LIZLLL, selectableTextAnnotatedStringElement.LIZLLL) && Intrinsics.LJFF(this.LJIILIIL, selectableTextAnnotatedStringElement.LJIILIIL) && this.LJ == selectableTextAnnotatedStringElement.LJ && this.LJFF == selectableTextAnnotatedStringElement.LJFF && this.LJI == selectableTextAnnotatedStringElement.LJI && this.LJII == selectableTextAnnotatedStringElement.LJII && this.LJIIIIZZ == selectableTextAnnotatedStringElement.LJIIIIZZ && this.LJIIJ == selectableTextAnnotatedStringElement.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, selectableTextAnnotatedStringElement.LJIIJJI)) {
            return true;
        }
        return false;
    }

    public SelectableTextAnnotatedStringElement(C1692220u8a c1692220u8a, C1693430uAX c1693430uAX, InterfaceC594710NUf interfaceC594710NUf, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, C1691850u7z c1691850u7z, InterfaceC1691620u7c interfaceC1691620u7c, InterfaceC1691630u7d interfaceC1691630u7d) {
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
        this.LJIIJJI = c1691850u7z;
        this.LJIIL = interfaceC1691620u7c;
        this.LJIILIIL = interfaceC1691630u7d;
    }
}
