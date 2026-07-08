package X;

import android.view.View;
import android.view.ViewParent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0u2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688570u2h {
    public static final ViewParent LIZ(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }
}
