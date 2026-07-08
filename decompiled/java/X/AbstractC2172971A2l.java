package X;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1A2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC2172971A2l<T, VH extends RecyclerView.ViewHolder> extends AbstractC21673619ry<VH> {
    public final C2172981A2m<T> LL;

    @Override // X.AbstractC21673619ry
    public int getItemCount() {
        return this.LL.LJFF.size();
    }

    public AbstractC2172971A2l(AbstractC339510DSr<T> abstractC339510DSr) {
        InterfaceC2172951A2j<T> interfaceC2172951A2j = new InterfaceC2172951A2j<T>() { // from class: X.1A2k
            @Override // X.InterfaceC2172951A2j
            public final void LIZ() {
                this.LIZ.getClass();
            }
        };
        C2172981A2m<T> c2172981A2m = new C2172981A2m<>(new C2173021A2q(this), new C2172991A2n(abstractC339510DSr).LIZ());
        this.LL = c2172981A2m;
        ((CopyOnWriteArrayList) c2172981A2m.LIZLLL).add(interfaceC2172951A2j);
    }

    public final T LLLFZ(int i) {
        return (T) ListProtector.get(this.LL.LJFF, i);
    }

    public void LLLI(List<T> list) {
        this.LL.LIZIZ(list, null);
    }

    public final void LLLII(List<T> list, Runnable runnable) {
        this.LL.LIZIZ(list, runnable);
    }
}
