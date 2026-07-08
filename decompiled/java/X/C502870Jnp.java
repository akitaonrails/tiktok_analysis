package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Jnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502870Jnp {
    public boolean LIZIZ;
    public AbstractC502430Jn7 LIZJ;
    public InterfaceC503850JpP LIZLLL;
    public final C502800Jni LIZ = new AbstractC503810JpL() { // from class: X.0Jni
        @Override // X.AbstractC503810JpL
        public final EnumC503250JoR LIZJ() {
            return EnumC503250JoR.LOAD_MORE;
        }
    };
    public final C503830JpN LJ = new AbstractC1585810rMx() { // from class: X.0JpN
        @Override // X.AbstractC1585810rMx
        public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager.getItemCount() <= linearLayoutManager.findLastVisibleItemPosition() + 5) {
                C502870Jnp c502870Jnp = this.LL;
                C503870JpR c503870JpR = new C503870JpR();
                C503840JpO c503840JpO = new C503840JpO(recyclerView);
                if (!c502870Jnp.LIZIZ) {
                    InterfaceC503850JpP interfaceC503850JpP = c502870Jnp.LIZLLL;
                    if (interfaceC503850JpP != null && C500260Jjc.LJJIJIIJIL(Boolean.valueOf(interfaceC503850JpP.LJIIJJI()))) {
                        return;
                    }
                    c502870Jnp.LIZIZ = true;
                    InterfaceC503850JpP interfaceC503850JpP2 = c502870Jnp.LIZLLL;
                    if (interfaceC503850JpP2 == null) {
                        return;
                    }
                    interfaceC503850JpP2.e4(new C503860JpQ(c503870JpR, c502870Jnp), new C503820JpM(c503840JpO, c502870Jnp));
                }
            }
        }
    };

    public final void LIZIZ() {
        ArrayList<AbstractC503810JpL> arrayList;
        int iIndexOf;
        AbstractC502430Jn7 abstractC502430Jn7 = this.LIZJ;
        if (abstractC502430Jn7 == null || (arrayList = abstractC502430Jn7.LL) == null || (iIndexOf = arrayList.indexOf(this.LIZ)) <= 0) {
            return;
        }
        ListProtector.remove(arrayList, iIndexOf);
        AbstractC502430Jn7 abstractC502430Jn72 = this.LIZJ;
        if (abstractC502430Jn72 != null) {
            abstractC502430Jn72.notifyItemRemoved(iIndexOf);
        }
    }

    public final void LIZ(RecyclerView recyclerView) {
        AbstractC502430Jn7 abstractC502430Jn7;
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter instanceof AbstractC502430Jn7) {
            abstractC502430Jn7 = (AbstractC502430Jn7) adapter;
        } else {
            abstractC502430Jn7 = null;
        }
        this.LIZJ = abstractC502430Jn7;
        recyclerView.addOnScrollListener(this.LJ);
    }
}
