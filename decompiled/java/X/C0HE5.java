package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.favorites.profile.FavoriteSearchViewModel;

/* JADX INFO: renamed from: X.0HE5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HE5 {
    public static FavoriteSearchViewModel LIZ(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded() && (fragment instanceof C0HE6)) {
                return (FavoriteSearchViewModel) new ViewModelProvider(fragment).get(FavoriteSearchViewModel.class);
            }
            fragment = fragment.getParentFragment();
        }
        return null;
    }
}
