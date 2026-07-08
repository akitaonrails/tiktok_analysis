package X;

/* JADX INFO: renamed from: X.0YNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.addmember.AddMembersUseCase", f = "AddMembersUseCase.kt", l = {58, 59}, m = "add")
public final class C873280YNq extends AbstractC23140094w {
    public InterfaceC867020Xzo LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C873220YNk LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C873280YNq(C873220YNk c873220YNk, InterfaceC1364105Vn<? super C873280YNq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c873220YNk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddMembersUseCase@665e.add$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, null, this);
        C1C7U.LIZIZ("AddMembersUseCase@665e.add$1");
        return objLIZIZ;
    }
}
