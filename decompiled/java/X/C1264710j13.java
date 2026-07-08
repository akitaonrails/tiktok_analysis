package X;

import com.ss.android.ugc.profile.business.ur.following.ui.FollowingRelationFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0j13, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1264710j13 extends C2217421BqW implements Function0<Unit> {
    public C1264710j13(FollowingRelationFragment followingRelationFragment) {
        super(0, followingRelationFragment, FollowingRelationFragment.class, "showEmpty", "showEmpty()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1749280vcc c1749280vccGS;
        FollowingRelationFragment followingRelationFragment = (FollowingRelationFragment) this.receiver;
        C1749280vcc c1749280vccGS2 = followingRelationFragment.gS();
        if (c1749280vccGS2 != null) {
            C786410Ut5.LLLZLZ(c1749280vccGS2, 0);
        }
        C1749280vcc c1749280vccGS3 = followingRelationFragment.gS();
        if (c1749280vccGS3 != null) {
            c1749280vccGS3.setStatus((C1722300uv6) followingRelationFragment.LLJ.getValue());
        }
        if (C295390Bhx.LIZJ() && (c1749280vccGS = followingRelationFragment.gS()) != null) {
            c1749280vccGS.setLayoutVariant(0);
        }
        return Unit.LIZ;
    }
}
