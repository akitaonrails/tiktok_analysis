package X;

/* JADX INFO: renamed from: X.0YxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.actions.AlertTonesActionKt$updateEnableState$1$invokeSuspend$$inlined$map$1$2", f = "AlertTonesAction.kt", l = {223}, m = "emit")
public final class C891000YxO extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C891010YxP LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C891000YxO(C891010YxP c891010YxP, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c891010YxP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AlertTonesActionKt@ca19.updateEnableState$1$invokeSuspend$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("AlertTonesActionKt@ca19.updateEnableState$1$invokeSuspend$$inlined$map$1$2$1");
        return objEmit;
    }
}
