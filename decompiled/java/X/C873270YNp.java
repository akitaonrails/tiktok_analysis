package X;

/* JADX INFO: renamed from: X.0YNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.addmember.AddMembersUseCase", f = "AddMembersUseCase.kt", l = {86}, m = "add")
public final class C873270YNp extends AbstractC23140094w {
    public C873240YNm LL;
    public C867350Y0v LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C873220YNk LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C873270YNp(C873220YNk c873220YNk, InterfaceC1364105Vn<? super C873270YNp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c873220YNk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddMembersUseCase@665e.add$2");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, this);
        C1C7U.LIZIZ("AddMembersUseCase@665e.add$2");
        return objLIZ;
    }
}
