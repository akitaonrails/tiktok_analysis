package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0QU1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QU1 {
    public final ViewGroup LIZ;
    public final C0QU5 LIZIZ;
    public final C0QU2 LIZJ = new C0QU0() { // from class: X.0QU2
        @Override // X.C0QU0
        public final RecyclerView.ViewHolder LIZ() {
            C0QU1 c0qu1 = this.LIZJ;
            return c0qu1.LIZIZ.LLIIIZ(c0qu1.LIZ);
        }
    };
    public final C0QU3 LIZLLL = new C0QU0() { // from class: X.0QU3
        @Override // X.C0QU0
        public final RecyclerView.ViewHolder LIZ() {
            C0QU1 c0qu1 = this.LIZJ;
            return c0qu1.LIZIZ.LLIILZL(c0qu1.LIZ);
        }
    };
    public final C0QU4 LJ = new C0QU0() { // from class: X.0QU4
        @Override // X.C0QU0
        public final RecyclerView.ViewHolder LIZ() {
            C0QU1 c0qu1 = this.LIZJ;
            return c0qu1.LIZIZ.LJLLLL(c0qu1.LIZ);
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0QU2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0QU3] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0QU4] */
    public C0QU1(RecyclerView recyclerView, C671020QTs c671020QTs) {
        this.LIZ = recyclerView;
        this.LIZIZ = c671020QTs;
    }
}
