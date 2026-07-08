package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H7Z, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H7Z {
    public static final View LIZ(View view) {
        while (view != null) {
            if (Intrinsics.LJFF(view.getTag(R.id.ua_), Boolean.TRUE)) {
                return view;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }
}
