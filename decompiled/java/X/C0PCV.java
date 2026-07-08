package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0PCV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PCV {
    public static final boolean LIZ(RecyclerView.ViewHolder viewHolder) {
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams instanceof C21681919tJ) {
            if (((C21681919tJ) layoutParams).LLILLJJLI <= 1) {
                return false;
            }
            return true;
        }
        if (!(layoutParams instanceof C21681819tI)) {
            return false;
        }
        return ((C21681819tI) layoutParams).LLILLJJLI;
    }
}
