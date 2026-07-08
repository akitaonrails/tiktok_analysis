package X;

import com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0cJK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006960cJK implements IRepetitiveVideoQuestionnaireService {
    public static final C1006960cJK LIZIZ = new C1006960cJK();
    public final /* synthetic */ IRepetitiveVideoQuestionnaireService LIZ;

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final boolean LIZ(long j) {
        return this.LIZ.LIZ(j);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final boolean LIZIZ(long j) {
        return this.LIZ.LIZIZ(j);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final void LIZJ(Aweme aweme) {
        this.LIZ.LIZJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final void LJ() {
        this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final boolean LJFF(String str) {
        return this.LIZ.LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final void LJI(String str) {
        this.LIZ.LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IRepetitiveVideoQuestionnaireService
    public final int LJII() {
        return this.LIZ.LJII();
    }

    public C1006960cJK() {
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IRepetitiveVideoQuestionnaireService.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            this.LIZ = (IRepetitiveVideoQuestionnaireService) objPluggableSpi$default;
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
