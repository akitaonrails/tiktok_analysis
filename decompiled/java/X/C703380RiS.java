package X;

/* JADX INFO: renamed from: X.0RiS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.tiktok.kmp.fcp.slotstrategy.core.FcpSlotStrategyCore", f = "FcpSlotStrategyCore.kt", l = {573}, m = "countdownDelay")
public final class C703380RiS extends AbstractC23140094w {
    public long LL;
    public long LLILLJJLI;
    public long LLILLL;
    public Object LLILZ;
    public C703410RiV LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C703290RiJ LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C703380RiS(C703290RiJ c703290RiJ, InterfaceC1364105Vn<? super C703380RiS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = c703290RiJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpSlotStrategyCore@e3e2.countdownDelay$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLJ.LIZJ(0L, null, 0, null, 0L, null, this);
        C1C7U.LIZIZ("FcpSlotStrategyCore@e3e2.countdownDelay$1");
        return objLIZJ;
    }
}
