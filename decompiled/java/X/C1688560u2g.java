package X;

import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0u2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688560u2g {
    public static final C128Y LIZ(View view) {
        C128Y c128y;
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            if ((tag instanceof C128Y) && (c128y = (C128Y) tag) != null) {
                return c128y;
            }
            Object objLIZ = C1688570u2h.LIZ(view);
            if (objLIZ instanceof View) {
                view = (View) objLIZ;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final void LIZIZ(View view, C128Y c128y) {
        view.setTag(R.id.view_tree_saved_state_registry_owner, c128y);
    }
}
