package X;

import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RXJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RXJ extends C09AY implements Function0<InterfaceC699200Rbi<?>> {
    public final /* synthetic */ FeedBottomButtonContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RXJ(FeedBottomButtonContainer feedBottomButtonContainer) {
        super(0);
        this.LL = feedBottomButtonContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC699200Rbi<?> invoke() {
        IFcpPolicyAbility iFcpPolicyAbilityZp = this.LL.zp();
        if (iFcpPolicyAbilityZp != null) {
            return iFcpPolicyAbilityZp.n6();
        }
        return null;
    }
}
