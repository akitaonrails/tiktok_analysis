package X;

import com.ss.android.ugc.aweme.following.ui.BaseRelationFragment;
import com.ss.android.ugc.profile.business.ur.following.ui.FollowingRelationFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0j14, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1264720j14 extends C2217421BqW implements Function2<C1749280vcc, Exception, Unit> {
    public C1264720j14(FollowingRelationFragment followingRelationFragment) {
        super(2, followingRelationFragment, FollowingRelationFragment.class, "updateErrorViewIfNeeded", "updateErrorViewIfNeeded(Lcom/bytedance/tux/status/TuxStatusView;Ljava/lang/Exception;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1749280vcc c1749280vcc, Exception exc) {
        ((BaseRelationFragment) this.receiver).WR(c1749280vcc, exc);
        return Unit.LIZ;
    }
}
