package X;

import com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi;
import com.ss.android.ugc.aweme.account.org.permissions.ManagePageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0iSv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.ManagePageViewModel$clickRoleSheetChangeRole$1$1", f = "ManagePageViewModel.kt", l = {154}, m = "invokeSuspend")
public final class C1243550iSv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ManagePageViewModel LLILLJJLI;
    public final /* synthetic */ AbstractC1243540iSu LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243550iSv(ManagePageViewModel managePageViewModel, AbstractC1243540iSu abstractC1243540iSu, InterfaceC1364105Vn<? super C1243550iSv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = managePageViewModel;
        this.LLILLL = abstractC1243540iSu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1243550iSv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ManagePageViewModel@904c.clickRoleSheetChangeRole$1$1");
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
                C1C7U.LIZIZ("ManagePageViewModel@904c.clickRoleSheetChangeRole$1$1");
                return objLJFF;
            }
        }
        ManageOrgPermissionsApi.DefaultResponse defaultResponse = (ManageOrgPermissionsApi.DefaultResponse) obj;
        if (Intrinsics.LJFF(defaultResponse.message, "success")) {
            this.LLILLJJLI.LLILLJJLI.setValue(new C1243620iT2(this.LLILLL));
        } else {
            this.LLILLJJLI.bu(ManageOrgPermissionsApi.LIZLLL(defaultResponse.data));
            this.LLILLJJLI.wQ2(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ManagePageViewModel@904c.clickRoleSheetChangeRole$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
