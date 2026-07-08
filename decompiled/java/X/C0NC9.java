package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NC9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NC9 {
    public static final View LIZ(View view) {
        while (true) {
            if (view == null) {
                break;
            }
            if (!Intrinsics.LJFF(view.getTag(R.id.el6), Boolean.TRUE)) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            } else if (Intrinsics.LJFF(view.getTag(R.id.el6), Boolean.TRUE)) {
                return view;
            }
        }
        return null;
    }
}
