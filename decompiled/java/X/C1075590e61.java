package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: renamed from: X.0e61, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075590e61 {
    public static ProfileViewModel LIZ(Fragment fragment) {
        ProfileViewModel profileViewModel = (ProfileViewModel) ViewModelProviders.of(fragment, new C1077360e8s(0)).get(ProfileViewModel.class.getName(), ProfileViewModel.class);
        profileViewModel.JQ2(AFwS252S0000000_16.get$arr$(362));
        return profileViewModel;
    }
}
