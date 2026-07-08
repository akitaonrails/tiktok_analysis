package X;

import android.view.View;

/* JADX INFO: renamed from: X.0mQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1395900mQe {
    public static C1592370rXX LIZ(View view) {
        for (Object parent = view.getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
            if (parent instanceof C1592370rXX) {
                return (C1592370rXX) parent;
            }
        }
        return null;
    }
}
