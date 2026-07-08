package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Tm3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C756570Tm3 extends C2217421BqW implements Function0<Unit> {
    public C756570Tm3(Object obj) {
        super(0, obj, C756560Tm2.class, "navigateLeadsGenByLiveCard", "navigateLeadsGenByLiveCard()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C756560Tm2 c756560Tm2 = (C756560Tm2) this.receiver;
        c756560Tm2.getClass();
        C20684815ws.onEventV3("ttelite_ba_lead_live_card_cta_click");
        c756560Tm2.LJJII("during_live_push_card");
        return Unit.LIZ;
    }
}
