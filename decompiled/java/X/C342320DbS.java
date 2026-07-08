package X;

/* JADX INFO: renamed from: X.0DbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.onboarding.repository.CreationChatLandingMsgRepository", f = "AiChatLandingMsgRepository.kt", l = {96}, m = "getFromApi")
public final class C342320DbS extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C342330DbT LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C342320DbS(C342330DbT c342330DbT, InterfaceC1364105Vn<? super C342320DbS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c342330DbT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationChatLandingMsgRepository@1e05.getFromApi$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0, null, this);
        C1C7U.LIZIZ("CreationChatLandingMsgRepository@1e05.getFromApi$1");
        return objLIZ;
    }
}
