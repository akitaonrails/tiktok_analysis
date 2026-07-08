package X;

/* JADX INFO: renamed from: X.0YMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.removemember.RemoveMembersUseCase", f = "RemoveMembersUseCase.kt", l = {55, 56}, m = "remove")
public final class C872880YMc extends AbstractC23140094w {
    public InterfaceC867020Xzo LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0YMY LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872880YMc(C0YMY c0ymy, InterfaceC1364105Vn<? super C872880YMc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0ymy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RemoveMembersUseCase@c292.remove$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, null, null, null, this);
        C1C7U.LIZIZ("RemoveMembersUseCase@c292.remove$1");
        return objLIZJ;
    }
}
