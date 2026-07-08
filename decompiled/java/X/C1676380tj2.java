package X;

/* JADX INFO: renamed from: X.0tj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676380tj2 extends AbstractC20055413dY implements InterfaceC20052813d8 {
    public InterfaceC1631620sYq<? super InterfaceC1689940u4u, ? super InterfaceC1673370teB, ? super C1682380tsi, ? extends InterfaceC1690350u5Z> LLJJ;

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZJ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZLLL(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZIZ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutModifierImpl(measureBlock=");
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1676380tj2(InterfaceC1631620sYq<? super InterfaceC1689940u4u, ? super InterfaceC1673370teB, ? super C1682380tsi, ? extends InterfaceC1690350u5Z> interfaceC1631620sYq) {
        this.LLJJ = interfaceC1631620sYq;
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        return this.LLJJ.invoke(interfaceC1689940u4u, interfaceC1673370teB, new C1682380tsi(j));
    }
}
