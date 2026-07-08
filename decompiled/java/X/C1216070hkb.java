package X;

import android.os.Bundle;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditBioFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0hkb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216070hkb {
    public static ProfileEditBioFragment LIZ(Bundle bundle, String str, List list) {
        ProfileEditBioFragment profileEditBioFragment = new ProfileEditBioFragment();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("content_value", str, bundle2);
        C786410Ut5.LJJIL(bundle2, "content_extra", new ArrayList(list));
        C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        profileEditBioFragment.setArguments(bundle2);
        return profileEditBioFragment;
    }
}
