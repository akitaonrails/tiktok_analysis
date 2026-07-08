package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarEditViewModel;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarSwipeBackgroundAssem;
import kotlin.jvm.internal.AwS114S0101000_6;

/* JADX INFO: renamed from: X.0HFj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437970HFj {
    public final /* synthetic */ SocialAvatarSwipeBackgroundAssem LIZ;

    public C437970HFj(SocialAvatarSwipeBackgroundAssem socialAvatarSwipeBackgroundAssem) {
        this.LIZ = socialAvatarSwipeBackgroundAssem;
    }

    public final void LIZ(int i) {
        Integer num = this.LIZ.LLJILJIL;
        if (num == null || num.intValue() != i) {
            this.LIZ.LLJILJIL = Integer.valueOf(i);
            SocialAvatarEditViewModel socialAvatarEditViewModelHo = this.LIZ.Ho();
            socialAvatarEditViewModelHo.setState(new AwS114S0101000_6(socialAvatarEditViewModelHo, i, 0));
        }
    }
}
