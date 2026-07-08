package X;

/* JADX INFO: renamed from: X.0ZmB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.processor.preload.task.StrategyPreloadTask", f = "StrategyPreloadTask.kt", l = {113}, m = "fetchStrategyWithUserPortrait")
public final class C909530ZmB extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C909370Zlv LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C909530ZmB(C909370Zlv c909370Zlv, InterfaceC1364105Vn<? super C909530ZmB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c909370Zlv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StrategyPreloadTask@fa8a.fetchStrategyWithUserPortrait$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLL.LJII(this);
        C1C7U.LIZIZ("StrategyPreloadTask@fa8a.fetchStrategyWithUserPortrait$1");
        return objLJII;
    }
}
