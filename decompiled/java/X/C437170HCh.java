package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HCh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437170HCh {
    public static final void LIZ(View view, Fragment fragment) {
        if (view != null && (fragment.getActivity() instanceof C19GS)) {
            ViewTreeLifecycleOwner.set(view, fragment.getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(view, fragment);
            view.setTag(R.id.view_tree_saved_state_registry_owner, fragment);
            C19EG activity = fragment.getActivity();
            ViewTreeLifecycleOwner.set(activity.getWindow().getDecorView(), activity);
            ViewTreeViewModelStoreOwner.set(activity.getWindow().getDecorView(), activity);
            view.setTag(R.id.view_tree_saved_state_registry_owner, activity);
        }
    }
}
