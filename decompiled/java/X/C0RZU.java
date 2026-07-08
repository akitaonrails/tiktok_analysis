package X;

import com.ss.android.ugc.aweme.subscription.mainactivityassem.PGCSubsMainActivityAssem;
import com.ss.android.ugc.aweme.subscription.service.ISubscriptionCommonService;
import com.ss.android.ugc.aweme.subscription.urllessaweme.service.PaidContentCommonServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RZU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RZU extends C09AY implements Function1<C0RUS, Unit> {
    public C0RZU() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUS c0rus) {
        PGCSubsMainActivityAssem pGCSubsMainActivityAssemLIZJ;
        C0RUS c0rus2 = c0rus;
        ISubscriptionCommonService iSubscriptionCommonServiceLIZ = PaidContentCommonServiceImpl.LIZ();
        if (iSubscriptionCommonServiceLIZ != null) {
            pGCSubsMainActivityAssemLIZJ = iSubscriptionCommonServiceLIZ.LIZJ();
        } else {
            pGCSubsMainActivityAssemLIZJ = null;
        }
        c0rus2.LLILZIL = pGCSubsMainActivityAssemLIZJ;
        return Unit.LIZ;
    }
}
