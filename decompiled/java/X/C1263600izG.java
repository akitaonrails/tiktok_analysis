package X;

import com.ss.android.ugc.aweme.following.ui.BaseRelationFragment;
import com.ss.android.ugc.profile.business.ur.following.ui.FollowingRelationFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0izG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1263600izG extends C2217421BqW implements Function0<Boolean> {
    public C1263600izG(FollowingRelationFragment followingRelationFragment) {
        super(0, followingRelationFragment, FollowingRelationFragment.class, "checkFetchRecommendUser", "checkFetchRecommendUser()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((BaseRelationFragment) this.receiver).RR() && (!C1251110if7.LIZLLL() || C1263590izF.LIZIZ()));
    }
}
