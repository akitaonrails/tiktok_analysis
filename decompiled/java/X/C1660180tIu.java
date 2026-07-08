package X;

/* JADX INFO: renamed from: X.0tIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.viewmodel.toolbar.ToolbarComponent$state$lambda$4$lambda$2$$inlined$map$1$2", f = "ToolbarComponent.kt", l = {223}, m = "emit")
public final class C1660180tIu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1660170tIt LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1660180tIu(C1660170tIt c1660170tIt, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1660170tIt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToolbarComponent@20f4.state$lambda$4$lambda$2$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("ToolbarComponent@20f4.state$lambda$4$lambda$2$$inlined$map$1$2$1");
        return objEmit;
    }
}
