package X;

import android.os.Bundle;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditContentFragment;

/* JADX INFO: renamed from: X.0i9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231780i9w {
    public static ProfileEditContentFragment LIZ(String str, String str2, String str3) {
        ProfileEditContentFragment profileEditContentFragment = new ProfileEditContentFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("content_name", str, bundle);
        C786410Ut5.LJJJI("content_value", str2, bundle);
        bundle.putBoolean("is_edit_enabled", true);
        C786410Ut5.LJJJI("edit_hint", str3, bundle);
        bundle.putInt("content_max_length", 0);
        bundle.putBoolean("is_enable_null", true);
        profileEditContentFragment.setArguments(bundle);
        return profileEditContentFragment;
    }
}
