package X;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744390vUj extends AbstractC1744400vUk<C1744380vUi> {
    public RecyclerView LLIZ;
    public Function1<? super String, Unit> LLIZLLLIL;
    public int LLJ;

    public C1744390vUj() {
        super((AwS617S0100000_3) null, 3);
        this.LLJ = -1;
    }

    @Override // X.AbstractC1744400vUk, X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return R.layout.amb;
    }

    @Override // X.AbstractC1744400vUk, X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public final void LLLIL(String str) {
        ArrayList arrayList = new ArrayList();
        int size = -1;
        for (T t : this.LL.LJFF) {
            if (Intrinsics.LJFF(t.LIZ, str)) {
                arrayList.add(new C1744380vUi(t.LIZ, true));
                size = arrayList.size() - 1;
            } else {
                arrayList.add(new C1744380vUi(t.LIZ, false));
            }
        }
        LLLI(arrayList);
        if (this.LLJ != size && size >= 0) {
            RecyclerView recyclerView = this.LLIZ;
            if (recyclerView != null) {
                if (size == 0) {
                    recyclerView.smoothScrollBy(0, 0);
                } else {
                    recyclerView.smoothScrollToPosition(size);
                }
            }
            this.LLJ = size;
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        ViewGroup viewGroup = (ViewGroup) recyclerView.getParent();
        this.LLIZ = recyclerView;
        for (Object obj : new C2500209qy(viewGroup, 25)) {
            if ((obj instanceof RecyclerView) && !Intrinsics.LJFF(obj, recyclerView)) {
                return;
            }
        }
    }

    @Override // X.AbstractC1744400vUk
    /* JADX INFO: renamed from: LLLIIIIL */
    public final void onBindViewHolder(C1744440vUo c1744440vUo, int i) {
        C1744380vUi c1744380vUiLLLFZ = LLLFZ(i);
        ((TextView) c1744440vUo.itemView.findViewById(R.id.kkw)).setText(c1744380vUiLLLFZ.LIZ);
        if (c1744380vUiLLLFZ.LIZIZ) {
            c1744440vUo.itemView.setBackgroundResource(R.drawable.b0z);
            ((TextView) c1744440vUo.itemView.findViewById(R.id.kkw)).setTextColor(C960203pA.LIZ(R.attr.ee, c1744440vUo.itemView.getContext()));
        } else {
            c1744440vUo.itemView.setBackgroundResource(0);
            ((TextView) c1744440vUo.itemView.findViewById(R.id.kkw)).setTextColor(C960203pA.LIZ(R.attr.a1k, c1744440vUo.itemView.getContext()));
        }
        C786410Ut5.I7(new AjS44S0200000_26(this, c1744380vUiLLLFZ, 40), c1744440vUo.itemView);
    }

    @Override // X.AbstractC1744400vUk, X.AbstractC21673619ry
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((C1744440vUo) viewHolder, i);
    }
}
