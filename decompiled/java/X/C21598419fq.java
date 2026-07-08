package X;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: renamed from: X.19fq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21598419fq implements Comparator<View> {
    @Override // java.util.Comparator
    public final int compare(View view, View view2) {
        C21598319fp c21598319fp = (C21598319fp) view.getLayoutParams();
        C21598319fp c21598319fp2 = (C21598319fp) view2.getLayoutParams();
        boolean z = c21598319fp.LIZ;
        if (z != c21598319fp2.LIZ) {
            if (z) {
                return 1;
            }
            return -1;
        }
        return c21598319fp.LJ - c21598319fp2.LJ;
    }
}
