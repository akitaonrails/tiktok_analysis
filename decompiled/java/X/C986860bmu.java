package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;

/* JADX INFO: renamed from: X.0bmu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C986860bmu extends AbstractC2173821A5s {
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
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C986860bmu c986860bmu) {
        C20441214yg.LIZIZ(MultiGuestPreviewFragment.TAG, "handleOnBackPressed");
        ((MultiGuestPreviewFragment) c986860bmu.l0).gS();
    }

    public static final void LIZIZ$1(C986860bmu c986860bmu) {
        C20441214yg.LIZIZ("MultiGuestUserInfoFragment", "handleOnBackPressed");
        LiveDialogFragment liveDialogFragment = ((MultiGuestUserInfoFragment) c986860bmu.l0).mDialog;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismissAllowingStateLoss();
        }
    }

    public static final void LIZIZ$2(C986860bmu c986860bmu) {
        C20441214yg.LIZIZ("VoiceChatUserInfoFragment", "handleOnBackPressed");
        LiveDialogFragment liveDialogFragment = ((VoiceChatUserInfoFragment) c986860bmu.l0).LLILLL;
        if (liveDialogFragment != null) {
            liveDialogFragment.dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C986860bmu(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }
}
