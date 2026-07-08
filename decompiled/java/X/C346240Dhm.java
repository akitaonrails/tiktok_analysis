package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.thankyou.ThankYouActivity;
import com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftFragment;
import com.ss.android.ugc.aweme.story.note.draft.StoryThoughtDraftViewModel;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcIntroFragment;

/* JADX INFO: renamed from: X.0Dhm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346240Dhm extends AbstractC2173821A5s {
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
            case 2:
                LIZIZ$2(this);
                break;
            case 3:
                LIZIZ$3(this);
                break;
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C346240Dhm c346240Dhm) {
        int i;
        String str;
        ((ThankYouActivity) c346240Dhm.l0).LLLZIL("on_back_pressed_callback", "dispatcher callback triggered");
        ThankYouActivity thankYouActivity = (ThankYouActivity) c346240Dhm.l0;
        if (thankYouActivity.LLILZIL) {
            i = 4;
        } else {
            i = 1;
        }
        thankYouActivity.LLLLZLLIL(i);
        ThankYouActivity thankYouActivity2 = (ThankYouActivity) c346240Dhm.l0;
        if (thankYouActivity2.LLILZIL) {
            str = "resolved as physical back";
        } else {
            str = "resolved as system gesture or close button";
        }
        thankYouActivity2.LLLZIL("on_back_pressed_callback_after_set_exit_method", str);
        ((ThankYouActivity) c346240Dhm.l0).LLLZLZ();
        ((ThankYouActivity) c346240Dhm.l0).LLLZZIL();
    }

    public static final void LIZIZ$1(C346240Dhm c346240Dhm) {
        if (((StoryThoughtDraftFragment) c346240Dhm.l0).MR().LLILZ.getValue().booleanValue()) {
            StoryThoughtDraftViewModel storyThoughtDraftViewModelMR = ((StoryThoughtDraftFragment) c346240Dhm.l0).MR();
            storyThoughtDraftViewModelMR.LLILZIL.setValue(C13BV.INSTANCE);
            storyThoughtDraftViewModelMR.LLILZ.setValue(Boolean.FALSE);
        } else {
            c346240Dhm.LJFF(false);
            ((StoryThoughtDraftFragment) c346240Dhm.l0).requireActivity().getOnBackPressedDispatcher().LJ();
        }
    }

    public static final void LIZIZ$2(C346240Dhm c346240Dhm) {
        ProfileAigcIntroFragment profileAigcIntroFragment = (ProfileAigcIntroFragment) c346240Dhm.l0;
        if (!profileAigcIntroFragment.LLJILJILJ) {
            C19EG activity = profileAigcIntroFragment.getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        TuxSheet tuxSheet = profileAigcIntroFragment.LLJILLL;
        if (tuxSheet == null) {
            return;
        }
        tuxSheet.dismiss();
    }

    public static final void LIZIZ$3(C346240Dhm c346240Dhm) {
        int i;
        C0DET c0det = (C0DET) c346240Dhm.l0;
        if (c0det.LLILLL == 0) {
            if (c0det.LLILZIL) {
                i = 4;
            } else {
                i = 1;
            }
            c0det.LLILLL = i;
        }
        c346240Dhm.LJFF(false);
        ((C0DET) c346240Dhm.l0).getOnBackPressedDispatcher().LJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C346240Dhm(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }
}
