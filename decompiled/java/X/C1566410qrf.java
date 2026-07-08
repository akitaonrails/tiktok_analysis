package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0qrf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566410qrf {
    public final C1255920ims<C1601380rm4> LIZ;
    public int LIZIZ;
    public C1566400qre LIZJ;

    public final boolean LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "opt_use_unreached_data_for_feed_refresh", false) > 0 && ((AbstractC1255880imo) this.LIZ.LL).getItems() != null && this.LIZIZ < ((AbstractC1255880imo) this.LIZ.LL).getItems().size() - 1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0qre, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C1566410qrf(C1601390rm5 c1601390rm5) {
        this.LIZ = c1601390rm5;
        ((C1601380rm4) c1601390rm5.LL).LLILZIL = this;
        if (((Boolean) C300500BqC.LJIIIIZZ.getValue()).booleanValue()) {
            ?? r2 = new InterfaceC1563590qn7() { // from class: X.0qre
                @Override // X.InterfaceC1563590qn7
                public final void LIZ(C1563580qn6 c1563580qn6) {
                    C1566410qrf c1566410qrf = this.LIZ;
                    int i = c1566410qrf.LIZIZ - c1563580qn6.LIZIZ;
                    if (i < 0) {
                        i = 0;
                    }
                    c1566410qrf.LIZIZ = i;
                }
            };
            CopyOnWriteArrayList<InterfaceC1563590qn7> copyOnWriteArrayList = C1564280qoE.LIZIZ;
            if (!copyOnWriteArrayList.contains(r2)) {
                copyOnWriteArrayList.add((InterfaceC1563590qn7) r2);
            }
            this.LIZJ = r2;
        }
    }
}
