package X;

import Y.AgS295S0100000_14;

/* JADX INFO: renamed from: X.0Z1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.actions.BasePinToTopActionKt$bindIsPinned$1$invokeSuspend$$inlined$map$1$2", f = "BasePinToTopAction.kt", l = {223}, m = "emit")
public final class C893010Z1n extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS295S0100000_14 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C893010Z1n(AgS295S0100000_14 agS295S0100000_14, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS295S0100000_14;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BasePinToTopActionKt@e22.bindIsPinned$1$invokeSuspend$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("BasePinToTopActionKt@e22.bindIsPinned$1$invokeSuspend$$inlined$map$1$2$1");
        return objEmit;
    }
}
