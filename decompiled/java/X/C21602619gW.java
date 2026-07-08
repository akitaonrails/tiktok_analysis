package X;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: renamed from: X.19gW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21602619gW implements Comparator<View> {
    @Override // java.util.Comparator
    public final int compare(View view, View view2) {
        C21601819gO c21601819gO = (C21601819gO) view.getLayoutParams();
        C21601819gO c21601819gO2 = (C21601819gO) view2.getLayoutParams();
        boolean z = c21601819gO.LIZ;
        if (z != c21601819gO2.LIZ) {
            if (z) {
                return 1;
            }
            return -1;
        }
        return c21601819gO.LJ - c21601819gO2.LJ;
    }
}
