package X;

/* JADX INFO: renamed from: X.0Oc5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.repository.BulletinRepository$_operator$1", f = "BulletinRepository.kt", l = {306}, m = "pollVote")
public final class C622990Oc5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C622900Obw LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C622990Oc5(C622900Obw c622900Obw, InterfaceC1364105Vn<? super C622990Oc5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c622900Obw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinRepository@27da._operator$1$pollVote$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objPollVote = this.LLILLJJLI.pollVote(0, 0L, 0L, 0L, 0L, 0, this);
        C1C7U.LIZIZ("BulletinRepository@27da._operator$1$pollVote$1");
        return objPollVote;
    }
}
