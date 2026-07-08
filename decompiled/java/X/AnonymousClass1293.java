package X;

import android.view.View;

/* JADX INFO: renamed from: X.1293, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1293 {
    public static final View LIZ(int i, View view) {
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
