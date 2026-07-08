package X;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: renamed from: X.11Gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19472511Gh {
    public final SparseArray<View> LIZ = new SparseArray<>();

    public final void LIZLLL(int i) {
        int i2;
        int size = this.LIZ.size();
        for (int i3 = 0; i3 < size; i3++) {
            int iKeyAt = this.LIZ.keyAt(i3);
            View viewValueAt = this.LIZ.valueAt(i3);
            if (iKeyAt == i) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, viewValueAt);
        }
    }

    public final <T extends View> T LIZJ(int i, View view) {
        T t;
        View view2 = this.LIZ.get(i);
        if (!(view2 instanceof View) || (t = (T) view2) == null) {
            T t2 = (T) view.findViewById(i);
            this.LIZ.put(i, t2);
            return t2;
        }
        return t;
    }
}
