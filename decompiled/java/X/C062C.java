package X;

/* JADX INFO: renamed from: X.062C, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.bot.repo.AIBotStatusChannelDataSource", f = "AIBotStatusChannelDataSource.kt", l = {66, 69}, m = "fetchBotInfo")
public final class C062C extends AbstractC23140094w {
    public long LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C062B LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C062C(C062B c062b, InterfaceC1364105Vn<? super C062C> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c062b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIBotStatusChannelDataSource@12ac.fetchBotInfo$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(0, null, this);
        C1C7U.LIZIZ("AIBotStatusChannelDataSource@12ac.fetchBotInfo$1");
        return objLIZ;
    }
}
