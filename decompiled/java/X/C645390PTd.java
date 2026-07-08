package X;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0PTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645390PTd extends RecyclerView.RecycledViewPool {
    public final SparseArray<C645380PTc> LIZ = new SparseArray<>();

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final synchronized void clear() {
        super.clear();
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            this.LIZ.valueAt(i).LIZIZ.clear();
        }
    }

    public final C645380PTc LIZ(int i) {
        C645380PTc c645380PTc = this.LIZ.get(i);
        if (c645380PTc == null) {
            C645380PTc c645380PTc2 = new C645380PTc(null);
            this.LIZ.put(i, c645380PTc2);
            return c645380PTc2;
        }
        return c645380PTc;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final synchronized RecyclerView.ViewHolder getRecycledView(int i) {
        int size;
        ArrayList<RecyclerView.ViewHolder> arrayList;
        C645380PTc c645380PTc = this.LIZ.get(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecycledView: ");
        sbLIZ.append(i);
        sbLIZ.append(", scrapData: ");
        if (c645380PTc == null || (arrayList = c645380PTc.LIZIZ) == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        sbLIZ.append(size);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c645380PTc != null && (!c645380PTc.LIZIZ.isEmpty())) {
            ListProtector.remove(c645380PTc.LIZIZ, r1.size() - 1);
            return super.getRecycledView(i);
        }
        return super.getRecycledView(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final synchronized void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null) {
            return;
        }
        super.putRecycledView(viewHolder);
        int itemViewType = viewHolder.getItemViewType();
        ArrayList<RecyclerView.ViewHolder> arrayList = LIZ(itemViewType).LIZIZ;
        if (this.LIZ.get(itemViewType).LIZ <= arrayList.size()) {
            return;
        }
        arrayList.add(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final synchronized void setMaxRecycledViews(int i, int i2) {
        super.setMaxRecycledViews(i, i2);
        C645380PTc c645380PTcLIZ = LIZ(i);
        c645380PTcLIZ.LIZ = i2;
        ArrayList<RecyclerView.ViewHolder> arrayList = c645380PTcLIZ.LIZIZ;
        while (arrayList.size() > i2) {
            ListProtector.remove(arrayList, arrayList.size() - 1);
        }
    }
}
