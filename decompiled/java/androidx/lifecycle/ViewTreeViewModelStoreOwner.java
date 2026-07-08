package androidx.lifecycle;

import X.C1688570u2h;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes26.dex */
public final class ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner get(View view) {
        ViewModelStoreOwner viewModelStoreOwner;
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            if ((tag instanceof ViewModelStoreOwner) && (viewModelStoreOwner = (ViewModelStoreOwner) tag) != null) {
                return viewModelStoreOwner;
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

    public static final void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
