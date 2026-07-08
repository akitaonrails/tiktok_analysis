package X;

import android.util.SparseArray;

/* JADX INFO: renamed from: X.14Gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20237514Gn {
    public static final C20237514Gn LIZIZ = new C20237514Gn();
    public final SparseArray<C20237614Go> LIZ = new SparseArray<>(4);

    public final void LIZIZ() {
        for (int i = 0; i < this.LIZ.size(); i++) {
            C20237614Go c20237614GoValueAt = this.LIZ.valueAt(i);
            if (c20237614GoValueAt != null && System.currentTimeMillis() - c20237614GoValueAt.LIZIZ > 10800000) {
                c20237614GoValueAt.LIZLLL.LIZ();
            }
        }
    }

    public final void LIZ(int i, boolean z) {
        if (this.LIZ.get(i) == null) {
            return;
        }
        this.LIZ.get(i).LIZIZ = System.currentTimeMillis();
        this.LIZ.get(i).LIZ = z;
        if (z) {
            this.LIZ.get(i).LIZJ = 0;
        }
    }
}
