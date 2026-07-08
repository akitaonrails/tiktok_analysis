package X;

import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.service.IChallengeService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import kotlin.Unit;

/* JADX INFO: renamed from: X.116f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C194463116f implements InterfaceC194468116k {
    public static final AVChallenge LIZJ(String str, boolean z) {
        IChallengeService iChallengeService = (IChallengeService) PluggableExtentionKt.pluggableSpi(IChallengeService.class);
        new C194505117v();
        return C194505117v.LIZ(iChallengeService.LIZJ(0, str, z));
    }

    @Override // X.InterfaceC566530MJv
    public final void LIZIZ(String str, final C092O c092o) {
        new C116M().LIZ(str, new InterfaceC447230HgH() { // from class: X.116h
            @Override // X.InterfaceC447230HgH
            public final void accept(Object obj) {
                Challenge challenge;
                C092O c092o2 = c092o;
                ChallengeDetail challengeDetail = (ChallengeDetail) obj;
                if (challengeDetail != null && (challenge = challengeDetail.challenge) != null) {
                    new C194505117v();
                    c092o2.accept(C194505117v.LIZ(challenge));
                }
            }
        });
    }

    @Override // X.InterfaceC566530MJv
    public final void LIZ(String str, final C092O c092o, final C092O c092o2) {
        new C116M().LIZ(str, new InterfaceC447230HgH() { // from class: X.116g
            @Override // X.InterfaceC447230HgH
            public final void accept(Object obj) {
                Challenge challenge;
                C092O c092o3 = c092o;
                C092O c092o4 = c092o2;
                ChallengeDetail challengeDetail = (ChallengeDetail) obj;
                if (challengeDetail != null && (challenge = challengeDetail.challenge) != null) {
                    new C194505117v();
                    c092o3.accept(C194505117v.LIZ(challenge));
                } else {
                    c092o4.accept(Unit.LIZ);
                }
            }
        });
    }
}
