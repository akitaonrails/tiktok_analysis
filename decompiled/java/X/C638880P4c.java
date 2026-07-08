package X;

import com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0P4c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C638880P4c implements InterfaceC586170Myt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        switch (this.$t) {
            case 0:
                onAccountResult$0(this, i, z, i2, user);
                break;
            case 1:
                onAccountResult$1(this, i, z, i2, user);
                break;
        }
    }

    public C638880P4c(FollowInnerFeedVM followInnerFeedVM, int i) {
        this.$t = i;
        this.l0 = followInnerFeedVM;
    }

    public static final void onAccountResult$0(C638880P4c c638880P4c, int i, boolean z, int i2, User user) {
        FollowInnerFeedVM followInnerFeedVM = (FollowInnerFeedVM) c638880P4c.l0;
        if (!z) {
            followInnerFeedVM.getClass();
            return;
        }
        followInnerFeedVM.BQ2().clear();
        ((CopyOnWriteArraySet) followInnerFeedVM.LLILZLL.getValue()).clear();
        ((CopyOnWriteArraySet) followInnerFeedVM.LLIZ.getValue()).clear();
    }

    public static final void onAccountResult$1(C638880P4c c638880P4c, int i, boolean z, int i2, User user) {
        FollowInnerFeedVM followInnerFeedVM = (FollowInnerFeedVM) c638880P4c.l0;
        if (!z) {
            followInnerFeedVM.getClass();
            return;
        }
        followInnerFeedVM.BQ2().clear();
        ((CopyOnWriteArraySet) followInnerFeedVM.LLILZLL.getValue()).clear();
        ((CopyOnWriteArraySet) followInnerFeedVM.LLIZ.getValue()).clear();
    }
}
