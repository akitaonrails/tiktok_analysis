package X;

/* JADX INFO: renamed from: X.0Nb1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ccl.impl.ByteSyncCommandReceiver", f = "ByteSyncCommandReceiver.kt", l = {84}, m = "sendResult")
public final class C596850Nb1 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C596870Nb3 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596850Nb1(C596870Nb3 c596870Nb3, InterfaceC1364105Vn<? super C596850Nb1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c596870Nb3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ByteSyncCommandReceiver@801b.sendResult$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objMf = this.LLILLJJLI.Mf(null, this);
        C1C7U.LIZIZ("ByteSyncCommandReceiver@801b.sendResult$1");
        return objMf;
    }
}
