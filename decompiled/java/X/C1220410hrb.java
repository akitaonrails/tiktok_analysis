package X;

import com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsActivity;
import com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0hrb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsActivity$goToInvitePage$1", f = "ManageOrgPermissionsActivity.kt", l = {131}, m = "invokeSuspend")
public final class C1220410hrb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ManageOrgPermissionsActivity LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1220410hrb(ManageOrgPermissionsActivity manageOrgPermissionsActivity, Function0<Unit> function0, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C1220410hrb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = manageOrgPermissionsActivity;
        this.LLILLL = function0;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1220410hrb(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ManageOrgPermissionsActivity@10ee.goToInvitePage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ManageOrgPermissionsApi manageOrgPermissionsApi = ManageOrgPermissionsApi.LIZ;
            this.LL = 1;
            obj = manageOrgPermissionsApi.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ManageOrgPermissionsActivity@10ee.goToInvitePage$1");
                return objLJFF;
            }
        }
        ManageOrgPermissionsApi.DefaultResponse defaultResponse = (ManageOrgPermissionsApi.DefaultResponse) obj;
        C0FNV.LIZ(this.LLILLJJLI.LLLLZI());
        if (Intrinsics.LJFF(defaultResponse.message, "success")) {
            this.LLILLL.invoke();
        } else {
            this.LLILZ.invoke(ManageOrgPermissionsApi.LIZLLL(defaultResponse.data));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ManageOrgPermissionsActivity@10ee.goToInvitePage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
