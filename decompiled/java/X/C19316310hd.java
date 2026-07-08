package X;

import com.ss.android.ugc.aweme.account.api.AccountLookupPopupConfig;
import com.ss.android.ugc.aweme.account.api.FoundAccountForLogin;
import com.ss.android.ugc.aweme.account.login.LoginByPassportTicketApi;
import com.ss.android.ugc.aweme.account.login.v2.network.LoginResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10hd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.Failed3PService$attemptLoginSafeUser$1", f = "Failed3PService.kt", l = {400, 405}, m = "invokeSuspend")
public final class C19316310hd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1BV2 LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ DialogC1389620mGW LLILZIL;
    public final /* synthetic */ FoundAccountForLogin LLILZLL;
    public final /* synthetic */ AccountLookupPopupConfig LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19316310hd(C1BV2 c1bv2, Map<String, String> map, String str, DialogC1389620mGW dialogC1389620mGW, FoundAccountForLogin foundAccountForLogin, AccountLookupPopupConfig accountLookupPopupConfig, InterfaceC1364105Vn<? super C19316310hd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1bv2;
        this.LLILLL = map;
        this.LLILZ = str;
        this.LLILZIL = dialogC1389620mGW;
        this.LLILZLL = foundAccountForLogin;
        this.LLIZ = accountLookupPopupConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19316310hd(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Failed3PService@8cb2.attemptLoginSafeUser$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("Failed3PService@8cb2.attemptLoginSafeUser$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C852170Xbr c852170Xbr = C852170Xbr.LIZ;
            C1BV9 c1bv9 = this.LLILLJJLI.LIZIZ;
            Map<String, String> map = this.LLILLL;
            c852170Xbr.getClass();
            C852170Xbr.LJIIJ(false, "safe_auto_login", c1bv9, false, map);
            LoginByPassportTicketApi loginByPassportTicketApi = LoginByPassportTicketApi.LIZ;
            String str = this.LLILZ;
            this.LL = 1;
            obj = loginByPassportTicketApi.LIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("Failed3PService@8cb2.attemptLoginSafeUser$1");
                return objLJFF;
            }
        }
        C0X52 c0x52 = (C0X52) obj;
        C0FNV.LIZ(this.LLILZIL);
        if (c0x52.LIZJ()) {
            LoginResponse loginResponse = (LoginResponse) c0x52.LIZIZ;
            if (Intrinsics.LJFF(loginResponse.message, "success")) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C19316210hc c19316210hc = new C19316210hc(loginResponse, this.LLILLJJLI, this.LLILLL, null);
                this.LL = 2;
                if (C23250099c.LJI(this, abstractC2238408pq, c19316210hc) == objLJFF) {
                    C1C7U.LIZIZ("Failed3PService@8cb2.attemptLoginSafeUser$1");
                    return objLJFF;
                }
            } else {
                JSONObject jSONObjectLIZ = C19316410he.LIZ(loginResponse, "failed_3p");
                C852170Xbr c852170Xbr2 = C852170Xbr.LIZ;
                int iOptInt = jSONObjectLIZ.optInt("error_code", 0);
                C1BV9 c1bv92 = this.LLILLJJLI.LIZIZ;
                Map<String, String> map2 = this.LLILLL;
                c852170Xbr2.getClass();
                C852170Xbr.LJIIIIZZ(false, iOptInt, "safe_auto_login", c1bv92, map2);
                this.LLILLJJLI.LJ(this.LLILZLL, this.LLILZ, this.LLIZ);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("Failed3PService@8cb2.attemptLoginSafeUser$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
