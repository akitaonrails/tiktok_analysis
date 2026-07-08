package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarDownloadShareFragment;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarDownloadArg;
import java.io.File;

/* JADX INFO: renamed from: X.0ly2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378160ly2 {
    public static SocialAvatarDownloadShareFragment LIZ(File file, File file2, File file3, File file4, File file5, File file6, String str, int i, SocialAvatarDownloadArg socialAvatarDownloadArg) {
        SocialAvatarDownloadShareFragment socialAvatarDownloadShareFragment = new SocialAvatarDownloadShareFragment();
        socialAvatarDownloadShareFragment.LLIZ = file;
        socialAvatarDownloadShareFragment.LLIZLLLIL = file2;
        socialAvatarDownloadShareFragment.LLJ = file3;
        socialAvatarDownloadShareFragment.LLJI = file4;
        socialAvatarDownloadShareFragment.LLJIJIL = file5;
        socialAvatarDownloadShareFragment.LLJILJIL = file6;
        socialAvatarDownloadShareFragment.LLJILJILJ = Integer.valueOf(i);
        socialAvatarDownloadShareFragment.LLJJ = socialAvatarDownloadArg.getUserId();
        socialAvatarDownloadShareFragment.LLJJI = socialAvatarDownloadArg.getEnterFrom();
        socialAvatarDownloadShareFragment.LLJJIII = Long.valueOf(socialAvatarDownloadArg.getStartTime());
        socialAvatarDownloadShareFragment.LLJILLL = str;
        return socialAvatarDownloadShareFragment;
    }
}
