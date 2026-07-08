package X;

/* JADX INFO: renamed from: X.0Y7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.messageinconversation.RepairFirstPageMsgInConvUseCase", f = "RepairFirstPageMsgInConvUseCase.kt", l = {262}, m = "pullLatest")
public final class C869170Y7v extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C869080Y7m LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C869170Y7v(C869080Y7m c869080Y7m, InterfaceC1364105Vn<? super C869170Y7v> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c869080Y7m;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepairFirstPageMsgInConvUseCase@41a2.pullLatest$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("RepairFirstPageMsgInConvUseCase@41a2.pullLatest$1");
        return objLIZIZ;
    }
}
