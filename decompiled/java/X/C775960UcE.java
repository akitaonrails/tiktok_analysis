package X;

import Y.AgS84S0110000_12;

/* JADX INFO: renamed from: X.0UcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.broadcast.stablemode.LiveAnchorDowngradeBus$subscribeModule$1$invokeSuspend$$inlined$filter$2$2", f = "LiveAnchorDowngradeBus.kt", l = {223}, m = "emit")
public final class C775960UcE extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS84S0110000_12 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C775960UcE(AgS84S0110000_12 agS84S0110000_12, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS84S0110000_12;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveAnchorDowngradeBus@2e07.subscribeModule$1$invokeSuspend$$inlined$filter$2$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("LiveAnchorDowngradeBus@2e07.subscribeModule$1$invokeSuspend$$inlined$filter$2$2$1");
        return objEmit;
    }
}
