package X;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: renamed from: X.19fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21597219fe implements Comparator<View> {
    @Override // java.util.Comparator
    public final int compare(View view, View view2) {
        C21597119fd c21597119fd = (C21597119fd) view.getLayoutParams();
        C21597119fd c21597119fd2 = (C21597119fd) view2.getLayoutParams();
        boolean z = c21597119fd.LIZ;
        if (z != c21597119fd2.LIZ) {
            if (z) {
                return 1;
            }
            return -1;
        }
        return c21597119fd.LJ - c21597119fd2.LJ;
    }
}
