package X;

import Y.AgS287S0100000_6;

/* JADX INFO: renamed from: X.0Hv3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.ui.assem.IMQuickMessageInputVM$onPrepared$2$invokeSuspend$$inlined$map$2$2", f = "IMQuickMessageInputVM.kt", l = {223}, m = "emit")
public final class C456390Hv3 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS287S0100000_6 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456390Hv3(AgS287S0100000_6 agS287S0100000_6, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS287S0100000_6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMQuickMessageInputVM@b1e6.onPrepared$2$invokeSuspend$$inlined$map$2$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("IMQuickMessageInputVM@b1e6.onPrepared$2$invokeSuspend$$inlined$map$2$2$1");
        return objEmit;
    }
}
