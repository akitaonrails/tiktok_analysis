package X;

import android.util.SparseArray;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.11DW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11DW extends C11DS {
    public final LifecycleOwner LLILLJJLI;
    public final C19465311Dn LLILLL;
    public final C11DR<Object> LLILZ;

    @Override // X.InterfaceC19464411De
    public final /* bridge */ /* synthetic */ C19465311Dn LIZJ() {
        return this.LLILLL;
    }

    @Override // X.C11DO
    public final C11DR<Object> LLILZIL() {
        return this.LLILZ;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        RecyclerView recyclerView;
        C19464011Da c19464011Da = this.LLILLL.LIZLLL;
        C19464511Df c19464511Df = c19464011Da.LIZJ;
        if (c19464511Df != null && (recyclerView = c19464011Da.LIZIZ.LLILLL) != null) {
            int itemViewType = viewHolder.getItemViewType();
            int iLIZ = C19464311Dd.LIZ(recyclerView, itemViewType);
            int recycledViewCount = recyclerView.getRecycledViewPool().getRecycledViewCount(itemViewType);
            if (iLIZ != -1 && iLIZ <= recycledViewCount) {
                int itemViewType2 = viewHolder.getItemViewType();
                List arrayList = (List) ((SparseArray) c19464511Df.LIZ.getValue()).get(itemViewType2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    ((SparseArray) c19464511Df.LIZ.getValue()).put(itemViewType2, arrayList);
                }
                arrayList.add(viewHolder);
                C19464311Dd.LIZIZ(viewHolder);
            }
        }
    }

    public C11DW(LifecycleOwner lifecycleOwner, C11DU c11du) {
        super(c11du);
        this.LLILLJJLI = lifecycleOwner;
        C19465311Dn c19465311Dn = new C19465311Dn(lifecycleOwner);
        LLLI(c19465311Dn);
        this.LLILLL = c19465311Dn;
        this.LLILZ = new C11DR<>(new C19464711Dh(this, AFwS229S0000000_2.get$arr$(64)), c11du, null);
    }
}
