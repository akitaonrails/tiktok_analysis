package X;

/* JADX INFO: renamed from: X.0CTC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tools.common.mob.AiChatTrace", f = "AiChatTrace.kt", l = {131}, m = "getFromApi")
public final class C0CTC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0CTD LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CTC(C0CTD c0ctd, InterfaceC1364105Vn<? super C0CTC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0ctd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatTrace@b54b.getFromApi$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("AiChatTrace@b54b.getFromApi$1");
        return objLIZ;
    }
}
