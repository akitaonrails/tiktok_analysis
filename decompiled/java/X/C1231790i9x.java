package X;

import android.os.Bundle;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioUrlFragment;

/* JADX INFO: renamed from: X.0i9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231790i9x {
    public static ProfileEditBioUrlFragment LIZ(String str) {
        ProfileEditBioUrlFragment profileEditBioUrlFragment = new ProfileEditBioUrlFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("content_value", str, bundle);
        bundle.putBoolean("is_edit_enabled", true);
        C786410Ut5.LJJJI("edit_hint", "", bundle);
        bundle.putInt("content_max_length", 0);
        bundle.putBoolean("is_enable_null", true);
        profileEditBioUrlFragment.setArguments(bundle);
        return profileEditBioUrlFragment;
    }
}
