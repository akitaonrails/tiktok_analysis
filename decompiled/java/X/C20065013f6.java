package X;

/* JADX INFO: renamed from: X.13f6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {219}, m = "textInputSession")
public final class C20065013f6 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C20065113f7 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20065013f6(C20065113f7 c20065113f7, InterfaceC1364105Vn<? super C20065013f6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c20065113f7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.LIZ(null, null, this);
    }
}
