package X;

/* JADX INFO: renamed from: X.0YNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.addmember.AddMembersUseCase", f = "AddMembersUseCase.kt", l = {169}, m = "doNetworkRequest")
public final class C873290YNr extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C873220YNk LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C873290YNr(C873220YNk c873220YNk, InterfaceC1364105Vn<? super C873290YNr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c873220YNk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddMembersUseCase@665e.doNetworkRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, this);
        C1C7U.LIZIZ("AddMembersUseCase@665e.doNetworkRequest$1");
        return objLIZLLL;
    }
}
