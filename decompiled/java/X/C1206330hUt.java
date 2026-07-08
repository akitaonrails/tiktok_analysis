package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.favorites.profile.FavoriteInvalidVideosSharedVM;

/* JADX INFO: renamed from: X.0hUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206330hUt {
    public static FavoriteInvalidVideosSharedVM LIZ(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded() && (fragment instanceof C0HE6)) {
                return (FavoriteInvalidVideosSharedVM) new ViewModelProvider(fragment).get(FavoriteInvalidVideosSharedVM.class);
            }
            fragment = fragment.getParentFragment();
        }
        return null;
    }
}
