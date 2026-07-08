package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;

/* JADX INFO: renamed from: X.0IDS, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IDS implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
        }
    }

    public C0IDS(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C0IDS c0ids, CompoundButton compoundButton, boolean z) {
        if (z) {
            ((SocialAvatarReviewFragment) c0ids.l0).UR().AQ2("post_to_story_select", null);
        } else {
            ((SocialAvatarReviewFragment) c0ids.l0).UR().AQ2("post_to_story_deselect", null);
        }
    }

    public static final void onCheckedChanged$1(C0IDS c0ids, CompoundButton compoundButton, boolean z) {
        ((C447290HgN) c0ids.l0).getListener().LIZ((C447290HgN) c0ids.l0);
    }
}
