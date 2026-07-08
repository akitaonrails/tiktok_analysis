package X;

/* JADX INFO: renamed from: X.0Y0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.updatemember.UpdateMemberUseCase", f = "UpdateMemberUseCase.kt", l = {86, 87}, m = "updateMemberInfo")
public final class C867310Y0r extends AbstractC23140094w {
    public InterfaceC867020Xzo LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C867340Y0u LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C867310Y0r(C867340Y0u c867340Y0u, InterfaceC1364105Vn<? super C867310Y0r> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c867340Y0u;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UpdateMemberUseCase@2628.updateMemberInfo$3");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, 0L, null, null, this);
        C1C7U.LIZIZ("UpdateMemberUseCase@2628.updateMemberInfo$3");
        return objLIZJ;
    }
}
