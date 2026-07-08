package X;

import com.ss.android.ugc.aweme.following.ui.BaseRelationFragment;
import com.ss.android.ugc.profile.business.ur.following.ui.FollowingRelationFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0j17, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1264750j17 extends C2217421BqW implements Function0<String> {
    public C1264750j17(FollowingRelationFragment followingRelationFragment) {
        super(0, followingRelationFragment, FollowingRelationFragment.class, "getEnterFrom", "getEnterFrom()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return ((BaseRelationFragment) this.receiver).getEnterFrom();
    }
}
