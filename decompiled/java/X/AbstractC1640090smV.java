package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0smV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1640090smV<T> extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<T> LL = new ArrayList();

    public final List<T> getData() {
        return new ArrayList(this.LL);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    public final T LJJLIIIJJI(int i) {
        return (T) ListProtector.get(this.LL, i);
    }

    public final void LLLFZ(List<? extends T> list) {
        ((ArrayList) this.LL).clear();
        if (list != null) {
            ((ArrayList) this.LL).addAll(list);
        }
    }
}
