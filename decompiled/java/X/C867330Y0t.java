package X;

/* JADX INFO: renamed from: X.0Y0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.updatemember.UpdateMemberUseCase", f = "UpdateMemberUseCase.kt", l = {112}, m = "updateMemberInfo")
public final class C867330Y0t extends AbstractC23140094w {
    public Object LL;
    public C867350Y0v LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C867340Y0u LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C867330Y0t(C867340Y0u c867340Y0u, InterfaceC1364105Vn<? super C867330Y0t> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c867340Y0u;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UpdateMemberUseCase@2628.updateMemberInfo$4");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(null, 0L, null, this);
        C1C7U.LIZIZ("UpdateMemberUseCase@2628.updateMemberInfo$4");
        return objLIZIZ;
    }
}
