package X;

import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeTransform;

/* JADX INFO: renamed from: X.10wA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19406410wA {
    public static boolean LIZ(ChallengeDetail challengeDetail) {
        ChallengeTransform transfrom;
        Challenge challenge = challengeDetail.challenge;
        if (challenge != null && (transfrom = challenge.getTransfrom()) != null && C19406510wB.LIZ(transfrom.text) && C19406510wB.LIZ(transfrom.action)) {
            return true;
        }
        return false;
    }
}
