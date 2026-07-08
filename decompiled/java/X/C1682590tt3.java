package X;

import com.ss.android.ugc.aweme.account.org.create.OrgAccount;
import com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoApi;
import com.ss.android.ugc.aweme.account.org.create.OrgAccountsInfoResponse;
import com.ss.android.ugc.aweme.account.org.create.OrgAccountsListViewModel;
import com.ss.android.ugc.aweme.account.org.create.OrgInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0tt3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.create.OrgAccountsListViewModel$fetchOrgAccounts$1", f = "OrgAccountsListViewModel.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C1682590tt3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrgAccountsListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1682590tt3(OrgAccountsListViewModel orgAccountsListViewModel, InterfaceC1364105Vn<? super C1682590tt3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orgAccountsListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1682590tt3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrgAccountsListViewModel@f536.fetchOrgAccounts$1");
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
            this.LLILLJJLI.LLILZIL.setValue(C1682600tt4.LIZ);
            OrgAccountsInfoApi orgAccountsInfoApi = OrgAccountsInfoApi.LIZ;
            this.LL = 1;
            obj = orgAccountsInfoApi.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OrgAccountsListViewModel@f536.fetchOrgAccounts$1");
                return objLJFF;
            }
        }
        OrgAccountsInfoResponse orgAccountsInfoResponse = (OrgAccountsInfoResponse) obj;
        if (!Intrinsics.LJFF("success", orgAccountsInfoResponse.message)) {
            this.LLILLJJLI.LLILZIL.setValue(C1682610tt5.LIZ);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OrgAccountsListViewModel@f536.fetchOrgAccounts$1");
            return unit;
        }
        OrgAccountsInfoResponse.Data data = orgAccountsInfoResponse.data;
        OrgInfo orgInfo = data.orgInfo;
        List<OrgAccount> list = data.accounts;
        String str = data.createPageUrl;
        if (orgInfo != null && list != null && str != null) {
            this.LLILLJJLI.LLILZIL.setValue(new C1682570tt1(orgInfo, list));
            this.LLILLJJLI.LLIZ = str;
        } else {
            this.LLILLJJLI.LLILZIL.setValue(C1682610tt5.LIZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OrgAccountsListViewModel@f536.fetchOrgAccounts$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
