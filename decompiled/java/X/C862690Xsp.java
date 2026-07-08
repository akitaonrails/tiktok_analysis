package X;

/* JADX INFO: renamed from: X.0Xsp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.markconversationread.MarkConversationReadUseCase", f = "MarkConversationReadUseCase.kt", l = {140}, m = "markConversationReadWithoutLocalUpdate")
public final class C862690Xsp extends AbstractC23140094w {
    public Object LL;
    public C0Y8T LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C864350XvV LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862690Xsp(C864350XvV c864350XvV, InterfaceC1364105Vn<? super C862690Xsp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c864350XvV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MarkConversationReadUseCase@1841.markConversationReadWithoutLocalUpdate$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(null, this);
        C1C7U.LIZIZ("MarkConversationReadUseCase@1841.markConversationReadWithoutLocalUpdate$1");
        return objLIZIZ;
    }
}
