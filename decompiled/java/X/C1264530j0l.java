package X;

import com.ss.android.ugc.aweme.following.ui.BaseRelationFragment;
import com.ss.android.ugc.profile.business.ur.following.ui.FollowerRelationFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0j0l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1264530j0l extends C2217421BqW implements Function0<String> {
    public C1264530j0l(FollowerRelationFragment followerRelationFragment) {
        super(0, followerRelationFragment, FollowerRelationFragment.class, "getPreviousPage", "getPreviousPage()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return ((BaseRelationFragment) this.receiver).getPreviousPage();
    }
}
