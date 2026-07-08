package X;

/* JADX INFO: renamed from: X.17ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.tools.service.VPAIChatGenerateServiceProvider", f = "VPAIChatGenerateServiceProvider.kt", l = {51}, m = "ensureConversationReady")
public final class C21163017ro extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C21163117rp LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21163017ro(C21163117rp c21163117rp, InterfaceC1364105Vn<? super C21163017ro> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c21163117rp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VPAIChatGenerateServiceProvider@1551.ensureConversationReady$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("VPAIChatGenerateServiceProvider@1551.ensureConversationReady$1");
        return objLIZ;
    }
}
