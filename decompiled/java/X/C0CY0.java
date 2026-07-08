package X;

import Y.AgS195S0200000_4;

/* JADX INFO: renamed from: X.0CY0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.AdEventFlow$collectAdEvent$1$invokeSuspend$$inlined$filter$1$2", f = "AdEventFlow.kt", l = {223}, m = "emit")
public final class C0CY0 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS195S0200000_4 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CY0(AgS195S0200000_4 agS195S0200000_4, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS195S0200000_4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdEventFlow@f745.collectAdEvent$1$invokeSuspend$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("AdEventFlow@f745.collectAdEvent$1$invokeSuspend$$inlined$filter$1$2$1");
        return objEmit;
    }
}
