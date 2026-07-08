package X;

import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS38S0301000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EJO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0EJO<VH extends RecyclerView.ViewHolder> extends AbstractC21673619ry<VH> {
    public static long LLILZIL;
    public final ArrayList<C361980EHc> LL = new ArrayList<>();
    public final BPEAHandler LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
    public boolean LLILLL = true;
    public C0EH8 LLILZ;

    public abstract void LLLFZ(int i, VH vh, C361980EHc c361980EHc);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public final void LLLI(C361980EHc c361980EHc) {
        ArrayList<C361980EHc> arrayList = this.LL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<C361980EHc> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().LJI);
        }
        if (arrayList2.contains(c361980EHc.LJI)) {
            int iIndexOf = arrayList2.indexOf(c361980EHc.LJI);
            this.LL.remove(c361980EHc);
            notifyItemRemoved(iIndexOf);
        }
    }

    public final void LLLIIIIL(List list) {
        if (!list.isEmpty()) {
            this.LL.clear();
            this.LL.addAll(list);
        }
    }

    public final int LLLIILIL(C361980EHc c361980EHc) {
        ArrayList<C361980EHc> arrayList = this.LL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<C361980EHc> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().LJI);
        }
        if (arrayList2.contains(c361980EHc.LJI)) {
            int iIndexOf = arrayList2.indexOf(c361980EHc.LJI);
            ListProtector.remove(this.LL, iIndexOf);
            ListProtector.add(this.LL, iIndexOf, c361980EHc);
            notifyItemChanged(iIndexOf);
            return iIndexOf;
        }
        return -1;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(VH vh) {
        C370330EfX c370330EfX;
        AwS406S0200000_5 awS406S0200000_5;
        super.onViewDetachedFromWindow(vh);
        if ((vh instanceof C370330EfX) && (c370330EfX = (C370330EfX) vh) != null && (awS406S0200000_5 = c370330EfX.LLJI) != null) {
            awS406S0200000_5.invoke();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(VH vh, int i) {
        C370330EfX c370330EfX;
        C361980EHc c361980EHc = (C361980EHc) ListProtector.get(this.LL, i);
        LLLFZ(i, vh, c361980EHc);
        vh.itemView.setTag(c361980EHc.LJI);
        C473601ss.LIZ(c361980EHc.LJIIJ, vh.itemView, new AwS38S0301000_5((C0EJO) this, (C0EJO<int>) c361980EHc, (C361980EHc) i, (int) vh, 0));
        if ((vh instanceof C370330EfX) && (c370330EfX = (C370330EfX) vh) != null) {
            c370330EfX.LLJI = new AwS406S0200000_5(c361980EHc, (C361980EHc) this, 2);
        }
    }

    public final void LLLII(String str, C361980EHc c361980EHc, boolean z) {
        for (C361980EHc c361980EHc2 : this.LL) {
            if (Intrinsics.LJFF(c361980EHc2.LJI, str)) {
                if (c361980EHc2 != null) {
                    int iIndexOf = this.LL.indexOf(c361980EHc2);
                    ListProtector.remove(this.LL, iIndexOf);
                    ListProtector.add(this.LL, iIndexOf, c361980EHc);
                    if (z) {
                        notifyItemChanged(iIndexOf);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
