package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0wcD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1787470wcD implements InterfaceC560980LzM<Unit, InterfaceC346201Wa<? extends C1788080wdC>> {
    public final InterfaceC1786800wb8 LIZ;
    public final InterfaceC1787390wc5 LIZIZ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "listen_pending_purchase_update";
    }

    public C1787470wcD(InterfaceC1786800wb8 interfaceC1786800wb8, InterfaceC1787390wc5 interfaceC1787390wc5) {
        this.LIZ = interfaceC1786800wb8;
        this.LIZIZ = interfaceC1787390wc5;
    }

    @Override // X.InterfaceC560980LzM
    public final Object LIZ(Unit unit, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends C1788080wdC>> interfaceC1364105Vn) {
        return new C05RH(new C1864860yd2(new C1864860yd2(new C1864870yd3(new C1864860yd2(this.LIZ.getPurchaseUpdate(), this, 3), 10), this, 4), this, 5));
    }
}
