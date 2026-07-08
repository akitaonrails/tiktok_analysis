package X;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: renamed from: X.0vbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748510vbN {
    public static final <V extends View> V LIZ(C11EV<?> c11ev, int i) {
        V v;
        Object obj = ((SparseArray) c11ev.LL.getValue()).get(i);
        if (!(obj instanceof View) || (v = (V) obj) == null) {
            V v2 = (V) c11ev.itemView.findViewById(i);
            ((SparseArray) c11ev.LL.getValue()).put(i, v2);
            return v2;
        }
        return v;
    }
}
