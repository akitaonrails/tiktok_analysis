package X;

import com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi;

/* JADX INFO: renamed from: X.0iTB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi", f = "ManageOrgPermissionsApi.kt", l = {57}, m = "getRolesAndInvites")
public final class C1243710iTB extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ManageOrgPermissionsApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243710iTB(ManageOrgPermissionsApi manageOrgPermissionsApi, InterfaceC1364105Vn<? super C1243710iTB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = manageOrgPermissionsApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ManageOrgPermissionsApi@a2ce.getRolesAndInvites$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(this);
        C1C7U.LIZIZ("ManageOrgPermissionsApi@a2ce.getRolesAndInvites$1");
        return objLJ;
    }
}
