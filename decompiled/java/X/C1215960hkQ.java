package X;

import android.os.Bundle;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditNicknameFragment;

/* JADX INFO: renamed from: X.0hkQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215960hkQ {
    public static ProfileEditNicknameFragment LIZ(Bundle bundle, String str) {
        ProfileEditNicknameFragment profileEditNicknameFragment = new ProfileEditNicknameFragment();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("current_nickname", str, bundle2);
        C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        profileEditNicknameFragment.setArguments(bundle2);
        return profileEditNicknameFragment;
    }
}
