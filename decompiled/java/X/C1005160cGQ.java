package X;

import com.ss.android.ugc.aweme.profile.org.OrgIdentifierBizData;
import com.ss.android.ugc.profile.business.profile.info.identifier.sheet.AccountOrgIdentifierProtocol;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cGQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.sheet.AccountOrgIdentifierProtocol$mob$1", f = "AccountOrgIdentifierProtocol.kt", l = {}, m = "invokeSuspend")
public final class C1005160cGQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ AccountOrgIdentifierProtocol LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005160cGQ(String str, AccountOrgIdentifierProtocol accountOrgIdentifierProtocol, Map<String, String> map, InterfaceC1364105Vn<? super C1005160cGQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = accountOrgIdentifierProtocol;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1005160cGQ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer orgAccountType;
        C1C7U.LIZ("AccountOrgIdentifierProtocol@1e8e.mob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI.LLJJIJIL);
        OrgIdentifierBizData orgIdentifierBizData = (OrgIdentifierBizData) this.LLILLJJLI.LLJILJIL;
        String orgAccountCategory = null;
        if (orgIdentifierBizData != null) {
            orgAccountType = orgIdentifierBizData.getOrgAccountType();
        } else {
            orgAccountType = null;
        }
        c2344009Gk.LJIIIIZZ("tt_account_type", String.valueOf(orgAccountType));
        OrgIdentifierBizData orgIdentifierBizData2 = (OrgIdentifierBizData) this.LLILLJJLI.LLJILJIL;
        if (orgIdentifierBizData2 != null) {
            orgAccountCategory = orgIdentifierBizData2.getOrgAccountCategory();
        }
        c2344009Gk.LJIIIIZZ("business_category", orgAccountCategory);
        c2344009Gk.LJII(this.LLILLL);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AccountOrgIdentifierProtocol@1e8e.mob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
