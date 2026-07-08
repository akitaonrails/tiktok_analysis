package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SubPinResponse;
import webcast.api.sub.Tip;
import webcast.api.sub.TipAction;

/* JADX INFO: renamed from: X.0Jyr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509710Jyr extends C09AY implements Function1<SubPinResponse, Unit> {
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LL;
    public final /* synthetic */ Tip LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C509710Jyr(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment, Tip tip) {
        super(1);
        this.LL = subscriptionPrivilegeDetailFragment;
        this.LLILLJJLI = tip;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SubPinResponse subPinResponse) {
        C197039127h c197039127h = this.LL.LLLLZIL;
        if (c197039127h != null) {
            c197039127h.setButtonVariant(1);
        }
        C197039127h c197039127h2 = this.LL.LLLLZIL;
        if (c197039127h2 != null) {
            c197039127h2.setText(C497740JfY.LJIJI(2131843771));
        }
        TipAction tipAction = this.LLILLJJLI.tipAction;
        if (tipAction != null) {
            tipAction.actionType = 2;
        }
        this.LL.LLILZ.invoke();
        return Unit.LIZ;
    }
}
