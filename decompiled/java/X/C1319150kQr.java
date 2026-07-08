package X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0kQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1319150kQr implements InterfaceC1319180kQu {
    public final AbstractC1298750jtx LIZ;
    public final RecyclerView LIZIZ;
    public InterfaceC1319180kQu LIZJ;
    public boolean LIZLLL;

    @Override // X.InterfaceC1319180kQu
    public final void LIZIZ() {
        this.LIZJ.LIZIZ();
    }

    @Override // X.InterfaceC1319180kQu
    public final void dispose() {
        InterfaceC1319180kQu interfaceC1319180kQu = this.LIZJ;
        if (interfaceC1319180kQu != null) {
            interfaceC1319180kQu.dispose();
        }
    }

    @Override // X.InterfaceC1319180kQu
    public final void LIZ(C1318570kPv c1318570kPv) {
        this.LIZJ.LIZ(c1318570kPv);
    }

    @Override // X.InterfaceC1319180kQu
    public void LIZJ(C1318570kPv c1318570kPv) {
        this.LIZJ.LIZJ(c1318570kPv);
    }

    @Override // X.InterfaceC1319180kQu
    public final void LIZLLL(C1318570kPv c1318570kPv) {
        this.LIZJ.LIZLLL(c1318570kPv);
    }

    public C1319150kQr(AbstractC1298750jtx abstractC1298750jtx, RecyclerView recyclerView) {
        this.LIZ = abstractC1298750jtx;
        this.LIZIZ = recyclerView;
        this.LIZJ = new C1319140kQq(abstractC1298750jtx);
    }
}
