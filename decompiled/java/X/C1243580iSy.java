package X;

import com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi;
import com.ss.android.ugc.aweme.account.org.permissions.ManagePageViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0iSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.ManagePageViewModel$getRolesAndInvites$1", f = "ManagePageViewModel.kt", l = {60}, m = "invokeSuspend")
public final class C1243580iSy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ManagePageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243580iSy(ManagePageViewModel managePageViewModel, InterfaceC1364105Vn<? super C1243580iSy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = managePageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1243580iSy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        boolean z2;
        final boolean z3;
        final String str2;
        Object objLJ = obj;
        C1C7U.LIZ("ManagePageViewModel@904c.getRolesAndInvites$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJ);
            ManageOrgPermissionsApi manageOrgPermissionsApi = ManageOrgPermissionsApi.LIZ;
            this.LL = 1;
            objLJ = manageOrgPermissionsApi.LJ(this);
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("ManagePageViewModel@904c.getRolesAndInvites$1");
                return objLJFF;
            }
        }
        ManageOrgPermissionsApi.GetRoleAndInvitesResponse getRoleAndInvitesResponse = (ManageOrgPermissionsApi.GetRoleAndInvitesResponse) objLJ;
        if (!Intrinsics.LJFF(getRoleAndInvitesResponse.message, "success")) {
            this.LLILLJJLI.LLILLJJLI.setValue(C1243660iT6.LIZ);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ManagePageViewModel@904c.getRolesAndInvites$1");
            return unit;
        }
        ArrayList arrayList = new ArrayList();
        List<ManageOrgPermissionsApi.Role> list = getRoleAndInvitesResponse.data.roles;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        for (ManageOrgPermissionsApi.Role role : list) {
            final String str3 = role.userId;
            if (role.mobile.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (role.mobile.length() > 0) {
                str2 = role.mobile;
            } else {
                str2 = role.email;
            }
            final int i2 = role.role;
            arrayList.add(new AbstractC1243540iSu(i2, str3, str2, z3) { // from class: X.0iSz
                public final String LIZ;
                public final boolean LIZIZ;
                public final String LIZJ;
                public final int LIZLLL;

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C1243590iSz)) {
                        return false;
                    }
                    C1243590iSz c1243590iSz = (C1243590iSz) obj2;
                    return Intrinsics.LJFF(this.LIZ, c1243590iSz.LIZ) && this.LIZIZ == c1243590iSz.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1243590iSz.LIZJ) && this.LIZLLL == c1243590iSz.LIZLLL;
                }

                public final int hashCode() {
                    return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("RolePermissionItem(id=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", isTextPhone=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", displayText=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", role=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.AbstractC1243540iSu
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.AbstractC1243540iSu
                public final String LIZIZ() {
                    return this.LIZ;
                }

                @Override // X.AbstractC1243540iSu
                public final int LIZJ() {
                    return this.LIZLLL;
                }

                @Override // X.AbstractC1243540iSu
                public final boolean LIZLLL() {
                    return this.LIZIZ;
                }

                {
                    this.LIZ = str3;
                    this.LIZIZ = z3;
                    this.LIZJ = str2;
                    this.LIZLLL = i2;
                }
            });
        }
        List<ManageOrgPermissionsApi.Invite> list2 = getRoleAndInvitesResponse.data.invites;
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        for (ManageOrgPermissionsApi.Invite invite : list2) {
            String str4 = invite.inviteId;
            if (invite.mobile.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (invite.mobile.length() > 0) {
                str = invite.mobile;
            } else {
                str = invite.email;
            }
            int i3 = invite.role;
            if (invite.status == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            arrayList.add(new C1243600iT0(str4, i3, str, z, z2));
        }
        ManagePageViewModel managePageViewModel = this.LLILLJJLI;
        if (managePageViewModel.LLIZLLLIL) {
            managePageViewModel.LLIZLLLIL = false;
            C1243440iSk c1243440iSk = C1243440iSk.LIZ;
            int size = arrayList.size();
            c1243440iSk.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(size, "account_cnt");
            C20684815ws.LJIILLIIL("org_permission_page_show", c2344009Gk.LIZ);
        }
        this.LLILLJJLI.LLILZ.setValue(arrayList);
        this.LLILLJJLI.LLILLJJLI.setValue(C1243670iT7.LIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ManagePageViewModel@904c.getRolesAndInvites$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
