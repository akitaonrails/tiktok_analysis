package X;

import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;

/* JADX INFO: renamed from: X.117v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194505117v implements InterfaceC19882712qn<Challenge, AVChallenge> {
    public static final AVChallenge LIZ(Challenge challenge) {
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.cid = challenge.getCid();
        aVChallenge.challengeName = challenge.getChallengeName();
        aVChallenge.stickerId = challenge.getStickerId();
        aVChallenge.type = challenge.getType();
        aVChallenge.viewCount = challenge.getViewCount();
        aVChallenge.userCount = challenge.getUserCount();
        aVChallenge.isCommerce = challenge.isCommerce();
        return aVChallenge;
    }

    @Override // X.InterfaceC19882712qn
    public final /* bridge */ /* synthetic */ AVChallenge apply(Challenge challenge) {
        return LIZ(challenge);
    }
}
