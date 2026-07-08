package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.settingpage.SubscriptionCommunityFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SubPinResponse;
import webcast.api.sub.Tip;
import webcast.api.sub.TipAction;

/* JADX INFO: renamed from: X.0Jz4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509840Jz4 extends C09AY implements Function1<SubPinResponse, Unit> {
    public final /* synthetic */ SubscriptionCommunityFragment LL;
    public final /* synthetic */ C509770Jyx LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C509840Jz4(SubscriptionCommunityFragment subscriptionCommunityFragment, C509770Jyx c509770Jyx) {
        super(1);
        this.LL = subscriptionCommunityFragment;
        this.LLILLJJLI = c509770Jyx;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SubPinResponse subPinResponse) {
        TipAction tipAction;
        C197039127h c197039127h = this.LL.LLLILZLLLI;
        if (c197039127h != null) {
            c197039127h.setText(C497740JfY.LJIJI(2131843771));
        }
        Tip tip = this.LLILLJJLI.LIZIZ;
        if (tip != null && (tipAction = tip.tipAction) != null) {
            tipAction.actionType = 2;
        }
        return Unit.LIZ;
    }
}
