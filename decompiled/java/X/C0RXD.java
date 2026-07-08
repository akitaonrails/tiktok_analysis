package X;

import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RXD, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RXD extends C09AY implements Function0<List<? extends String>> {
    public final /* synthetic */ FeedBottomButtonContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RXD(FeedBottomButtonContainer feedBottomButtonContainer) {
        super(0);
        this.LL = feedBottomButtonContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        IFcpPolicyAbility iFcpPolicyAbilityZp = this.LL.zp();
        if (iFcpPolicyAbilityZp != null) {
            return iFcpPolicyAbilityZp.If0();
        }
        return null;
    }
}
