package X;

import Y.AgS308S0100000_28;

/* JADX INFO: renamed from: X.0zGU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.followerv2.FollowerUserCardWidgetContainer$observeNoticeState$1$1$invokeSuspend$$inlined$filter$1$2", f = "FollowerUserCardWidgetContainer.kt", l = {223}, m = "emit")
public final class C1889320zGU extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS308S0100000_28 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1889320zGU(AgS308S0100000_28 agS308S0100000_28, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS308S0100000_28;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowerUserCardWidgetContainer@5711.observeNoticeState$1$1$invokeSuspend$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("FollowerUserCardWidgetContainer@5711.observeNoticeState$1$1$invokeSuspend$$inlined$filter$1$2$1");
        return objEmit;
    }
}
