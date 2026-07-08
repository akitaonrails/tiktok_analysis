package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.GamePartnershipService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yz4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878520yz4 extends C09AY implements Function0<C1884390z8X> {
    public final /* synthetic */ GamePartnershipService LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1878520yz4(GamePartnershipService gamePartnershipService) {
        super(0);
        this.LL = gamePartnershipService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1884390z8X invoke() {
        return new C1884390z8X(this.LL);
    }
}
