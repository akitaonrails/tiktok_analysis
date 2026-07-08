package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl;
import com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0sGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620350sGf implements IChallengeDetailService {
    public static final C1620350sGf LIZJ = new C1620350sGf();
    public final /* synthetic */ IChallengeDetailService LIZIZ = ChallengeDetailServiceImpl.LJFF();

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final void LIZ(AbstractC1255880imo<Aweme, ?> abstractC1255880imo, List<? extends Aweme> list) {
        this.LIZIZ.LIZ(abstractC1255880imo, list);
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final boolean LIZIZ() {
        return this.LIZIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final AbstractC1255880imo<Aweme, ?> LIZJ() {
        return this.LIZIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final Fragment LIZLLL(Intent intent) {
        return this.LIZIZ.LIZLLL(intent);
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final boolean LJ() {
        return this.LIZIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService
    public final void clearCache() {
        this.LIZIZ.clearCache();
    }
}
