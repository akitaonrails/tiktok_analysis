package X;

import com.ss.android.ugc.aweme.story.note.StoryThoughtAvatarCreationFragment;
import com.ss.android.ugc.aweme.story.note.StoryThoughtCreationFragment;

/* JADX INFO: renamed from: X.16Gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20748116Gx extends AbstractC2173821A5s {
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

    public static final void LIZIZ$0(C20748116Gx c20748116Gx) {
        ((StoryThoughtAvatarCreationFragment) c20748116Gx.l0).ZR("system_back_button");
    }

    public static final void LIZIZ$1(C20748116Gx c20748116Gx) {
        ((StoryThoughtCreationFragment) c20748116Gx.l0).UR("system_back_button");
        C19EG activity = ((StoryThoughtCreationFragment) c20748116Gx.l0).getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20748116Gx(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }
}
