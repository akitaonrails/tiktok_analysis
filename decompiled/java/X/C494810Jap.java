package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import com.bytedance.android.livesdkapi.host.IHostPgcSubsService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494810Jap extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SubscriptionSpotlightFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494810Jap(Context context, SubscriptionSpotlightFragment subscriptionSpotlightFragment, String str) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = subscriptionSpotlightFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        IHostPgcSubsService iHostPgcSubsService = (IHostPgcSubsService) C1161920gLG.LIZJ(IHostPgcSubsService.class);
        if (iHostPgcSubsService == null || !iHostPgcSubsService.openPgcSpotlightPrivilegePopup(this.LL, this.LLILLJJLI, "spotlight", "", true)) {
            C510180Jzc.LIZIZ(this.LL, true, "spotlight", "", this.LLILLJJLI, null, new C508400Jwk(null, null, 0L, 0L, null, false, null, Boolean.TRUE, null, 3071), new C495050JbD(this.LLILLL), 32);
        }
        return Unit.LIZ;
    }
}
