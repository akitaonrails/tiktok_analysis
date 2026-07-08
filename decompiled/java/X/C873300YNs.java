package X;

/* JADX INFO: renamed from: X.0YNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getcheckinfo.GetConversationCheckInfoUseCase", f = "GetConversationCheckInfoUseCase.kt", l = {39}, m = "fetchConversationCompletenessInfo")
public final class C873300YNs extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C873230YNl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C873300YNs(C873230YNl c873230YNl, InterfaceC1364105Vn<? super C873300YNs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c873230YNl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetConversationCheckInfoUseCase@d0a7.fetchConversationCompletenessInfo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(0, 0, this);
        C1C7U.LIZIZ("GetConversationCheckInfoUseCase@d0a7.fetchConversationCompletenessInfo$1");
        return objLIZIZ;
    }
}
