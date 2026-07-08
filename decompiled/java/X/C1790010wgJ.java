package X;

import Y.AgS210S0200000_27;

/* JADX INFO: renamed from: X.0wgJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.arch.action.ActionFlowExtKt$thenEach$1$perform$$inlined$map$1$2", f = "ActionFlowExt.kt", l = {224, 223}, m = "emit")
public final class C1790010wgJ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public final /* synthetic */ AgS210S0200000_27 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1790010wgJ(AgS210S0200000_27 agS210S0200000_27, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS210S0200000_27;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActionFlowExtKt@5043.thenEach$1$perform$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILZ.emit(null, this);
        C1C7U.LIZIZ("ActionFlowExtKt@5043.thenEach$1$perform$$inlined$map$1$2$1");
        return objEmit;
    }
}
