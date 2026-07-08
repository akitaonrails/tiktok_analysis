package X;

import com.ss.android.ugc.aweme.im.assem.BasePanelContainerAssem;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0IDC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDC extends AbstractC2173821A5s {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC2173821A5s
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C0IDC c0idc) {
        ((BasePanelContainerAssem) c0idc.l0).So();
    }

    public static final void LIZIZ$1(C0IDC c0idc) {
        if (((SocialAvatarReviewFragment) c0idc.l0).VR() && !((SocialAvatarReviewFragment) c0idc.l0).LLJLIL.get()) {
            ((SocialAvatarReviewFragment) c0idc.l0).UR().AQ2("close", new AwS585S0100000_6((SocialAvatarReviewFragment) c0idc.l0, 231));
            SocialAvatarReviewFragment socialAvatarReviewFragment = (SocialAvatarReviewFragment) c0idc.l0;
            socialAvatarReviewFragment.gS("swipe_back", new AwS550S0100000_6(socialAvatarReviewFragment, 952));
        } else {
            ((SocialAvatarReviewFragment) c0idc.l0).UR().AQ2("back_press", null);
            C19EG activity = ((SocialAvatarReviewFragment) c0idc.l0).getActivity();
            if (activity == null) {
                return;
            }
            activity.finish();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IDC(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }
}
