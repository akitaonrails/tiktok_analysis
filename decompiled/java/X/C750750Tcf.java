package X;

/* JADX INFO: renamed from: X.0Tcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.usermanage.model.AdminUser", f = "AdminUser.kt", l = {63}, m = "checkAdminECommercePermission")
public final class C750750Tcf extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C750740Tce LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750750Tcf(C750740Tce c750740Tce, InterfaceC1364105Vn<? super C750750Tcf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c750740Tce;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdminUser@8c01.checkAdminECommercePermission$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("AdminUser@8c01.checkAdminECommercePermission$1");
        return objLIZ;
    }
}
