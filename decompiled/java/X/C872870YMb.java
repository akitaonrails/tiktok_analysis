package X;

/* JADX INFO: renamed from: X.0YMb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.removemember.RemoveMembersUseCase", f = "RemoveMembersUseCase.kt", l = {76}, m = "remove")
public final class C872870YMb extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C867350Y0v LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0YMY LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872870YMb(C0YMY c0ymy, InterfaceC1364105Vn<? super C872870YMb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0ymy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RemoveMembersUseCase@c292.remove$2");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, null, null, this);
        C1C7U.LIZIZ("RemoveMembersUseCase@c292.remove$2");
        return objLIZIZ;
    }
}
