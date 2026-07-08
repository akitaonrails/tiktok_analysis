package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03n0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C946803n0 {
    public static final Fragment LIZ(View view) {
        Fragment fragment;
        while (view != null) {
            Object tag = view.getTag(R.id.en4);
            if ((tag instanceof Fragment) && (fragment = (Fragment) tag) != null) {
                return fragment;
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
