package X;

import com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsApi;
import com.ss.android.ugc.aweme.account.org.permissions.ManagePageViewModel;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0iSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.permissions.ManagePageViewModel$confirmRemoveDialog$1$1", f = "ManagePageViewModel.kt", l = {239}, m = "invokeSuspend")
public final class C1243520iSs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1243540iSu LLILLJJLI;
    public final /* synthetic */ ManagePageViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243520iSs(ManagePageViewModel managePageViewModel, AbstractC1243540iSu abstractC1243540iSu, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1243540iSu;
        this.LLILLL = managePageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1243520iSs(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ManagePageViewModel@904c.confirmRemoveDialog$1$1");
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
            String strLIZIZ = this.LLILLJJLI.LIZIZ();
            this.LL = 1;
            obj = manageOrgPermissionsApi.LJFF(strLIZIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ManagePageViewModel@904c.confirmRemoveDialog$1$1");
                return objLJFF;
            }
        }
        ManageOrgPermissionsApi.DefaultResponse defaultResponse = (ManageOrgPermissionsApi.DefaultResponse) obj;
        this.LLILLL.vQ2();
        if (Intrinsics.LJFF(defaultResponse.message, "success")) {
            ManagePageViewModel managePageViewModel = this.LLILLL;
            managePageViewModel.bu(C786410Ut5.j4(managePageViewModel.getApplication().getString(2131839023), Arrays.copyOf(new Object[]{this.LLILLJJLI.LIZ()}, 1)));
        } else {
            this.LLILLL.bu(ManageOrgPermissionsApi.LIZLLL(defaultResponse.data));
        }
        this.LLILLL.yQ2();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ManagePageViewModel@904c.confirmRemoveDialog$1$1");
        return unit;
    }
}
