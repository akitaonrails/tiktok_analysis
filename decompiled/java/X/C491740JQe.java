package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0JQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491740JQe {
    public boolean LIZIZ;
    public C0JRZ LIZJ;
    public InterfaceC491820JQm LIZLLL;
    public final C492000JRe LIZ = new AbstractC492010JRf() { // from class: X.0JRe
        @Override // X.AbstractC492010JRf
        public final C0JRX LIZ() {
            return C0JRX.LOAD_MORE;
        }
    };
    public final C491780JQi LJ = new AbstractC1585810rMx() { // from class: X.0JQi
        @Override // X.AbstractC1585810rMx
        public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager.getItemCount() <= linearLayoutManager.findLastVisibleItemPosition() + 5) {
                C491740JQe c491740JQe = this.LL;
                C491850JQp c491850JQp = new C491850JQp();
                C491790JQj c491790JQj = new C491790JQj(recyclerView);
                if (!c491740JQe.LIZIZ) {
                    InterfaceC491820JQm interfaceC491820JQm = c491740JQe.LIZLLL;
                    if (interfaceC491820JQm != null && C500260Jjc.LJJIJIIJIL(Boolean.valueOf(interfaceC491820JQm.LJIIJJI()))) {
                        return;
                    }
                    c491740JQe.LIZIZ = true;
                    InterfaceC491820JQm interfaceC491820JQm2 = c491740JQe.LIZLLL;
                    if (interfaceC491820JQm2 == null) {
                        return;
                    }
                    interfaceC491820JQm2.e4(new C491830JQn(c491850JQp, c491740JQe), new C491800JQk(c491790JQj, c491740JQe));
                }
            }
        }
    };
}
