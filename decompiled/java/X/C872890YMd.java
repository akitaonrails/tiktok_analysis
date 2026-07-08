package X;

/* JADX INFO: renamed from: X.0YMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.removemember.RemoveMembersUseCase", f = "RemoveMembersUseCase.kt", l = {140}, m = "doNetworkRequest")
public final class C872890YMd extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0YMY LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872890YMd(C0YMY c0ymy, InterfaceC1364105Vn<? super C872890YMd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0ymy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RemoveMembersUseCase@c292.doNetworkRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("RemoveMembersUseCase@c292.doNetworkRequest$1");
        return objLIZ;
    }
}
