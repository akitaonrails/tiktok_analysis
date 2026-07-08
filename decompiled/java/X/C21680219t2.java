package X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19t2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21680219t2 {
    public final InterfaceC21680519t5 LIZ;
    public final InterfaceC21465518zV LIZIZ;
    public final AbstractC21673619ry<RecyclerView.ViewHolder> LIZJ;
    public final InterfaceC21681019tA LIZLLL;
    public int LJ;
    public final C21680119t1 LJFF;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0IeR, X.19t1] */
    public C21680219t2(AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry, InterfaceC21681019tA interfaceC21681019tA, InterfaceC21654919ox interfaceC21654919ox, InterfaceC21465518zV interfaceC21465518zV) {
        ?? r1 = new AbstractC471570IeR() { // from class: X.19t1
            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                C21680219t2 c21680219t2 = this.LIZ;
                c21680219t2.LJ = c21680219t2.LIZJ.getItemCount();
                C21680019t0 c21680019t0 = (C21680019t0) this.LIZ.LIZLLL;
                c21680019t0.LIZ.notifyDataSetChanged();
                c21680019t0.LIZIZ();
            }

            @Override // X.AbstractC471570IeR
            public final void LJI() {
                ((C21680019t0) this.LIZ.LIZLLL).LIZIZ();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZIZ(int i, int i2) {
                C21680219t2 c21680219t2 = this.LIZ;
                C21680019t0 c21680019t0 = (C21680019t0) c21680219t2.LIZLLL;
                c21680019t0.LIZ.notifyItemRangeChanged(i + c21680019t0.LIZJ(c21680219t2), i2, null);
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                C21680219t2 c21680219t2 = this.LIZ;
                c21680219t2.LJ += i2;
                C21680019t0 c21680019t0 = (C21680019t0) c21680219t2.LIZLLL;
                c21680019t0.LIZ.notifyItemRangeInserted(i + c21680019t0.LIZJ(c21680219t2), i2);
                C21680219t2 c21680219t22 = this.LIZ;
                if (c21680219t22.LJ > 0 && c21680219t22.LIZJ.mStateRestorationPolicy == C18QP.PREVENT_WHEN_EMPTY) {
                    ((C21680019t0) c21680219t22.LIZLLL).LIZIZ();
                }
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i, int i2) {
                C21680219t2 c21680219t2 = this.LIZ;
                C21680019t0 c21680019t0 = (C21680019t0) c21680219t2.LIZLLL;
                int iLIZJ = c21680019t0.LIZJ(c21680219t2);
                c21680019t0.LIZ.notifyItemMoved(i + iLIZJ, i2 + iLIZJ);
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i, int i2) {
                C21680219t2 c21680219t2 = this.LIZ;
                c21680219t2.LJ -= i2;
                C21680019t0 c21680019t0 = (C21680019t0) c21680219t2.LIZLLL;
                c21680019t0.LIZ.notifyItemRangeRemoved(i + c21680019t0.LIZJ(c21680219t2), i2);
                C21680219t2 c21680219t22 = this.LIZ;
                if (c21680219t22.LJ < 1 && c21680219t22.LIZJ.mStateRestorationPolicy == C18QP.PREVENT_WHEN_EMPTY) {
                    ((C21680019t0) c21680219t22.LIZLLL).LIZIZ();
                }
            }

            @Override // X.AbstractC471570IeR
            public final void LIZJ(int i, int i2, Object obj) {
                C21680219t2 c21680219t2 = this.LIZ;
                C21680019t0 c21680019t0 = (C21680019t0) c21680219t2.LIZLLL;
                c21680019t0.LIZ.notifyItemRangeChanged(i + c21680019t0.LIZJ(c21680219t2), i2, obj);
            }
        };
        this.LJFF = r1;
        this.LIZJ = abstractC21673619ry;
        this.LIZLLL = interfaceC21681019tA;
        this.LIZ = interfaceC21654919ox.LIZ(this);
        this.LIZIZ = interfaceC21465518zV;
        this.LJ = abstractC21673619ry.getItemCount();
        abstractC21673619ry.registerAdapterDataObserver(r1);
    }
}
