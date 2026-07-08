package X;

import com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoApi;
import com.ss.android.ugc.aweme.account.org.create.OrgAccountsListViewModel;
import com.ss.android.ugc.aweme.account.org.create.PrecheckResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Ts1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.create.OrgAccountsListViewModel$clickCreate$1", f = "OrgAccountsListViewModel.kt", l = {74, 78, 80}, m = "invokeSuspend")
public final class C760270Ts1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrgAccountsListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760270Ts1(OrgAccountsListViewModel orgAccountsListViewModel, InterfaceC1364105Vn<? super C760270Ts1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orgAccountsListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760270Ts1(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrgAccountsListViewModel@f536.clickCreate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("OrgAccountsListViewModel@f536.clickCreate$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            OrgAccountsInfoApi orgAccountsInfoApi = OrgAccountsInfoApi.LIZ;
            this.LL = 1;
            obj = orgAccountsInfoApi.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OrgAccountsListViewModel@f536.clickCreate$1");
                return objLJFF;
            }
        }
        PrecheckResponse precheckResponse = (PrecheckResponse) obj;
        this.LLILLJJLI.LLILLL.setValue(false);
        String str = this.LLILLJJLI.LLIZ;
        if (Intrinsics.LJFF("success", precheckResponse.message) && str != null) {
            C1DEK c1dek = this.LLILLJJLI.LL;
            C752270Tf7 c752270Tf7 = new C752270Tf7(str);
            this.LL = 2;
            if (c1dek.LJIJI(c752270Tf7, this) == objLJFF) {
                C1C7U.LIZIZ("OrgAccountsListViewModel@f536.clickCreate$1");
                return objLJFF;
            }
        } else {
            Integer num = precheckResponse.data.errorCode;
            if (num == null || num.intValue() != 2135) {
                C1DEK c1dek2 = this.LLILLJJLI.LL;
                C752280Tf8 c752280Tf8 = new C752280Tf8(precheckResponse.data.description);
                this.LL = 3;
                if (c1dek2.LJIJI(c752280Tf8, this) == objLJFF) {
                    C1C7U.LIZIZ("OrgAccountsListViewModel@f536.clickCreate$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OrgAccountsListViewModel@f536.clickCreate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
