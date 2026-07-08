package X;

import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bnq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987440bnq extends C09AY implements Function0<InterfaceC987370bnj> {
    public final /* synthetic */ CommerceVideoDelegateKt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C987440bnq(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        super(0);
        this.LL = commerceVideoDelegateKt;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC987370bnj invoke() {
        IFeedAdService iFeedAdServiceLLLLJ = this.LL.LLLLJ();
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LL;
        return iFeedAdServiceLLLLJ.LJJIJIIJI(commerceVideoDelegateKt.view, C1558520qew.LJIILIIL(commerceVideoDelegateKt.baseHolder), this.LL.playTaskManager);
    }
}
