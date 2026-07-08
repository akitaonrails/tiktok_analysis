package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.profilerec.ProfileRecommendationService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565500qqC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ ProfileRecommendationService LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1565500qqC(C19EG c19eg, ProfileRecommendationService profileRecommendationService) {
        super(0);
        this.LL = c19eg;
        this.LLILLJJLI = profileRecommendationService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Hox.LLJILJIL.LIZ(this.LL).KQ2("For You");
        ProfileRecommendationService profileRecommendationService = this.LLILLJJLI;
        if (profileRecommendationService.LJFF && !profileRecommendationService.LIZLLL.getAndSet(true)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), C0PEM.LIZJ, null, new C1303040k0s(this.LLILLJJLI, this.LL, null), 2);
        }
        return Unit.LIZ;
    }
}
