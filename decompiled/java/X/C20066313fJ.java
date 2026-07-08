package X;

/* JADX INFO: renamed from: X.13fJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", l = {230}, m = "startInputMethod")
public final class C20066313fJ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C20066213fI LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20066313fJ(C20066213fI c20066213fI, InterfaceC1364105Vn<? super C20066313fJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c20066213fI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.LIZ(null, this);
    }
}
