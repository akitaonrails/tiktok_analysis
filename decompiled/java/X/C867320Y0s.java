package X;

/* JADX INFO: renamed from: X.0Y0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.updatemember.UpdateMemberUseCase", f = "UpdateMemberUseCase.kt", l = {186}, m = "doNetworkRequest")
public final class C867320Y0s extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C867340Y0u LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C867320Y0s(C867340Y0u c867340Y0u, InterfaceC1364105Vn<? super C867320Y0s> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c867340Y0u;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UpdateMemberUseCase@2628.doNetworkRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("UpdateMemberUseCase@2628.doNetworkRequest$1");
        return objLIZ;
    }
}
