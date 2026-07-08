package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0QJO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QJO {
    public final ViewGroup LIZ;
    public final C0QJT LIZIZ;
    public final C0QJQ LJ = new C0QJV() { // from class: X.0QJQ
        @Override // X.C0QJV
        public final RecyclerView.ViewHolder LIZ() {
            C0QJO c0qjo = this.LIZJ;
            return c0qjo.LIZIZ.LLIIIJ(c0qjo.LIZ);
        }
    };
    public final C0QJP LIZJ = new C0QJV() { // from class: X.0QJP
        @Override // X.C0QJV
        public final RecyclerView.ViewHolder LIZ() {
            C0QJO c0qjo = this.LIZJ;
            return c0qjo.LIZIZ.LLJJIJIL(c0qjo.LIZ);
        }
    };
    public final C0QJR LIZLLL = new C0QJV() { // from class: X.0QJR
        @Override // X.C0QJV
        public final RecyclerView.ViewHolder LIZ() {
            C0QJO c0qjo = this.LIZJ;
            return c0qjo.LIZIZ.LLJJLIIIJLLLLLLLZ(c0qjo.LIZ);
        }
    };
    public final C0QJS LJFF = new C0QJV() { // from class: X.0QJS
        @Override // X.C0QJV
        public final RecyclerView.ViewHolder LIZ() {
            C0QJO c0qjo = this.LIZJ;
            return c0qjo.LIZIZ.LLJILLL(c0qjo.LIZ);
        }
    };
    public final C0QJU LJI = new C0QJV() { // from class: X.0QJU
        @Override // X.C0QJV
        public final RecyclerView.ViewHolder LIZ() {
            C0QJO c0qjo = this.LIZJ;
            return c0qjo.LIZIZ.LLJLLL(c0qjo.LIZ);
        }
    };

    public final void LIZIZ() {
        LIZJ(C0QIL.LIZ());
        C0QKL.LIZ.getClass();
        if (C0QKL.LJIIIIZZ()) {
            LIZJ(1);
        }
        if (C293280BeY.LIZ) {
            LIZJ(1);
        } else {
            LIZJ(1);
        }
        if (C0QPQ.LIZIZ()) {
            LIZJ(1);
        }
    }

    public final RecyclerView.ViewHolder LIZ() {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        RecyclerView.ViewHolder viewHolderLIZIZ = LIZIZ();
        if (viewHolderLIZIZ == null) {
            viewHolderLIZIZ = LIZ();
            i = 0;
        } else {
            i = 1;
        }
        C01V2.LIZ(i, "viewholder", System.currentTimeMillis() - jCurrentTimeMillis, "hisViewHolder");
        return viewHolderLIZIZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0QJQ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0QJP] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0QJR] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0QJS] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0QJU] */
    public C0QJO(ViewGroup viewGroup, C0QJT c0qjt) {
        this.LIZ = viewGroup;
        this.LIZIZ = c0qjt;
    }
}
