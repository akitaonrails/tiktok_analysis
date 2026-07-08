package X;

import X.C429710Gt7;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0H71, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public abstract class C0H71<D, VH extends C429710Gt7> extends AbstractC21673619ry<VH> {
    public List<? extends D> LL = C13BV.INSTANCE;
    public final HashMap<D, C0H73> LLILLJJLI = new HashMap<>();

    @Override // X.AbstractC21673619ry
    public int getItemCount() {
        return this.LL.size();
    }

    public final void setData(List<? extends D> list) {
        this.LL = list;
        this.LLILLJJLI.clear();
        Iterator<? extends D> it2 = list.iterator();
        while (it2.hasNext()) {
            this.LLILLJJLI.put(it2.next(), C0H73.Normal);
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLFZ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(VH vh, int i, List<Object> list) {
        int i2;
        if (i >= this.LL.size()) {
            return;
        }
        C0H73 c0h73 = this.LLILLJJLI.get(ListProtector.get(this.LL, i));
        if (c0h73 == null) {
            i2 = -1;
        } else {
            i2 = C0H72.LIZ[c0h73.ordinal()];
        }
        if (i2 != 1) {
            if (i2 != 2) {
                vh.LJJJJL();
                vh.I5(false);
            } else {
                vh.LJJJJL();
                vh.I5(true);
            }
        } else {
            vh.I5(false);
            vh.LJLJLJ();
        }
        if (!list.contains(1)) {
            super.onBindViewHolder(vh, i, list);
        }
    }
}
