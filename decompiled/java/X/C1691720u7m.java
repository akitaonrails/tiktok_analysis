package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p2.j1;

/* JADX INFO: renamed from: X.0u7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691720u7m extends AbstractC20055313dX implements InterfaceC20052813d8, InterfaceC1695680uEA, InterfaceC20051913cz {
    public C1691850u7z LLJJIII;
    public final Function1<? super C1691710u7l, Unit> LLJJIJI;
    public final C1691760u7q LLJJIJIIJIL;

    public C1691720u7m() {
        throw null;
    }

    @Override // X.InterfaceC1695680uEA
    public final /* synthetic */ void LJJLIIIJJIZ() {
    }

    @Override // X.AbstractC20055413dY
    public final boolean LLILLJJLI() {
        return false;
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
        this.LLJJIJIIJIL.LJJIFFI(interfaceC1669010tX9);
    }

    @Override // X.InterfaceC20051913cz
    public final void LLIIII(j1 j1Var) {
        C1691850u7z c1691850u7z = this.LLJJIII;
        if (c1691850u7z != null) {
            c1691850u7z.LLILZ = C1691830u7x.LIZ(c1691850u7z.LLILZ, j1Var, null, 2);
            c1691850u7z.LLILLJJLI.LIZLLL();
        }
    }

    @Override // X.InterfaceC20052813d8
    public final int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return this.LLJJIJIIJIL.LIZLLL(interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return this.LLJJIJIIJIL.LJIIL(interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        return this.LLJJIJIIJIL.LJIILL(interfaceC1689940u4u, interfaceC1673370teB, j);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return this.LLJJIJIIJIL.LJIJJLI(interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return this.LLJJIJIIJIL.LJIL(interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    public C1691720u7m(C1692220u8a c1692220u8a, C1693430uAX c1693430uAX, InterfaceC594710NUf interfaceC594710NUf, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, C1691850u7z c1691850u7z, InterfaceC1691620u7c interfaceC1691620u7c, InterfaceC1691630u7d interfaceC1691630u7d) {
        this.LLJJIII = c1691850u7z;
        this.LLJJIJI = null;
        C1691760u7q c1691760u7q = new C1691760u7q(c1692220u8a, c1693430uAX, interfaceC594710NUf, function1, i, z, i2, i3, list, function12, c1691850u7z, interfaceC1691620u7c, interfaceC1691630u7d, null);
        LLJJ(c1691760u7q);
        this.LLJJIJIIJIL = c1691760u7q;
        if (this.LLJJIII != null) {
            return;
        }
        C1691080u6k.LIZIZ("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new C2197108jB();
    }
}
