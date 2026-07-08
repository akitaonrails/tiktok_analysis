package X;

import com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi;

/* JADX INFO: renamed from: X.0iTA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi", f = "ManageOrgPermissionsApi.kt", l = {69}, m = "checkIDV")
public final class C1243700iTA extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ManageOrgPermissionsApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243700iTA(ManageOrgPermissionsApi manageOrgPermissionsApi, InterfaceC1364105Vn<? super C1243700iTA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = manageOrgPermissionsApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ManageOrgPermissionsApi@a2ce.checkIDV$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("ManageOrgPermissionsApi@a2ce.checkIDV$1");
        return objLIZIZ;
    }
}
