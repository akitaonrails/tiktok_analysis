package X;

import android.view.View;

/* JADX INFO: renamed from: X.1A5P, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A5P {
    public static final View LIZ(View view, Class<?> cls) {
        if (view != null) {
            if (!cls.isInstance(view)) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return LIZ((View) parent, cls);
                }
                return null;
            }
            return view;
        }
        return null;
    }
}
