package X;

import com.ss.android.ugc.aweme.live.livehostimpl.LiveHostInputService;

/* JADX INFO: renamed from: X.0I0P, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.LiveHostInputService", f = "LiveHostInputService.kt", l = {27}, m = "collectPanelState")
public final class C0I0P extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LiveHostInputService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I0P(LiveHostInputService liveHostInputService, InterfaceC1364105Vn<? super C0I0P> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = liveHostInputService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveHostInputService@7e3a.collectPanelState$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objRB0 = this.LLILLJJLI.rB0(null, null, this);
        C1C7U.LIZIZ("LiveHostInputService@7e3a.collectPanelState$1");
        return objRB0;
    }
}
