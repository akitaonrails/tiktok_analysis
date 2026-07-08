package X;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC761920Tug<VH extends RecyclerView.ViewHolder, Effect> extends AbstractC21673619ry<VH> {
    public final List<Effect> LL = new ArrayList();

    public void LLLJL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
    }

    public void LLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
    }

    public void LLLLII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
    }

    public void LLLLIIIILLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
    }

    public void LLLLIIL(RecyclerView.ViewHolder viewHolder, Object obj, int i) {
    }

    public void LLLLIILL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
    }

    public void LLLLIILLL(RecyclerView.ViewHolder viewHolder, Object obj) {
    }

    public void LLLLIL(RecyclerView.ViewHolder viewHolder, Object obj) {
    }

    public void LLLLILI(RecyclerView.ViewHolder viewHolder, Object obj) {
    }

    public void LLLLJ(RecyclerView.ViewHolder viewHolder, Object obj) {
    }

    public void LLLLJI(RecyclerView.ViewHolder viewHolder, Object obj) {
    }

    public abstract void LLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj);

    public void LLLLLIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
    }

    public abstract void LLLLLJIL(int i, RecyclerView.ViewHolder viewHolder, Object obj);

    public void LLLLLJLJLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
    }

    public abstract void LLLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj);

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(VH vh, int i) {
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    public final void LLLFZ(int i) {
        if (i >= 0 && i < ((ArrayList) this.LL).size()) {
            notifyItemChanged(i, "item_deleted");
        }
    }

    public final void LLLI(Effect effect) {
        int iIndexOf = ((ArrayList) this.LL).indexOf(effect);
        if (iIndexOf >= 0 && iIndexOf < ((ArrayList) this.LL).size()) {
            notifyItemChanged(iIndexOf, "item_download_fail");
        }
    }

    public final void LLLII(Effect effect) {
        int iIndexOf = ((ArrayList) this.LL).indexOf(effect);
        if (iIndexOf >= 0 && iIndexOf < ((ArrayList) this.LL).size()) {
            notifyItemChanged(iIndexOf, "item_download_start");
        }
    }

    public void LLLIIIIL(int i) {
        if (i >= 0 && i < ((ArrayList) this.LL).size()) {
            notifyItemChanged(i, "item_download_success");
        }
    }

    public final void LLLIILIL(Effect effect) {
        LLLIIIIL(((ArrayList) this.LL).indexOf(effect));
    }

    public void LLLILZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select effect pos: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("sfx-live", C2188811AlT.LIZIZ(sbLIZ));
        if (i >= 0 && i < ((ArrayList) this.LL).size()) {
            notifyItemChanged(i, "item_select");
        }
    }

    public final void LLLILZLLLI(Effect effect) {
        LLLILZ(((ArrayList) this.LL).indexOf(effect));
    }

    public final void LLLJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unselect effect pos: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("sfx-live", C2188811AlT.LIZIZ(sbLIZ));
        if (i >= 0 && i < ((ArrayList) this.LL).size()) {
            notifyItemChanged(i, "item_unselect");
        }
    }

    public final void LLLJIL(Effect effect) {
        LLLJ(((ArrayList) this.LL).indexOf(effect));
    }

    public final void LLLIL(int i, Object obj) {
        int iIndexOf = ((ArrayList) this.LL).indexOf(obj);
        if (iIndexOf >= 0 && iIndexOf < ((ArrayList) this.LL).size()) {
            notifyItemChanged(iIndexOf, Integer.valueOf(i));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(VH vh, int i, List<Object> list) {
        Object obj = ListProtector.get(this.LL, i);
        if (!list.isEmpty()) {
            if (!list.isEmpty()) {
                Iterator<Object> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next(), "item_deleted")) {
                    }
                }
            }
            for (Object obj2 : list) {
                if (Intrinsics.LJFF(obj2, "item_select")) {
                    LLLLL(i, vh, obj);
                } else if (Intrinsics.LJFF(obj2, "item_unselect")) {
                    LLLLLJIL(i, vh, obj);
                } else if (Intrinsics.LJFF(obj2, "item_download_start")) {
                    LLLLII(i, vh, obj);
                } else if (Intrinsics.LJFF(obj2, "item_download_success")) {
                    LLLLIIIILLL(i, vh, obj);
                } else if (Intrinsics.LJFF(obj2, "item_download_fail")) {
                    LLLL(i, vh, obj);
                } else if (Intrinsics.LJFF(obj2, "item_update_white_dot")) {
                    LLLLLJLJLL(i, vh, obj);
                } else if (Intrinsics.LJFF(obj2, "item_lock")) {
                    LLLJL(i, vh, obj);
                } else if (Intrinsics.LJFF(obj2, "item_unlock")) {
                    LLLLLIL(i, vh, obj);
                } else if (Intrinsics.LJFF(obj2, "item_edit_changed")) {
                    LLLLIILL(i, vh, obj);
                } else if (Intrinsics.LJFF(obj2, "item_mutate")) {
                    LLLLIL(vh, obj);
                } else if (Intrinsics.LJFF(obj2, "item_normal")) {
                    LLLLILI(vh, obj);
                } else if (Intrinsics.LJFF(obj2, "long_item_select")) {
                    LLLLJ(vh, obj);
                } else if (Intrinsics.LJFF(obj2, "long_item_unselect")) {
                    LLLLJI(vh, obj);
                } else if (Intrinsics.LJFF(obj2, "item_hide_red_dot")) {
                    LLLLIILLL(vh, obj);
                } else if (obj2 instanceof Integer) {
                    LLLLIIL(vh, obj, ((Number) obj2).intValue());
                }
            }
            return;
        }
        LLLLLL(i, vh, obj);
    }
}
