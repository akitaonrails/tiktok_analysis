package X;

import android.os.Bundle;
import com.ss.android.ugc.profile.business.profile.tab.ProfileLikesAwemeListFragment;

/* JADX INFO: renamed from: X.0ipH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257410ipH {
    public static ProfileLikesAwemeListFragment LIZ(int i, String str, String str2, String str3, boolean z, Bundle bundle) {
        ProfileLikesAwemeListFragment profileLikesAwemeListFragment = new ProfileLikesAwemeListFragment();
        bundle.putInt("type", 1);
        C786410Ut5.LJJJI("uid", str, bundle);
        C786410Ut5.LJJJI("sec_user_id", str2, bundle);
        C786410Ut5.LJJJI("user_unique_id", str3, bundle);
        bundle.putBoolean("is_my_profile", z);
        bundle.putInt("bottom_bar_height", i);
        profileLikesAwemeListFragment.setArguments(bundle);
        return profileLikesAwemeListFragment;
    }
}
