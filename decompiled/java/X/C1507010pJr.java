package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import com.ss.android.ugc.aweme.pipo.register.api.WalletApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.register.PIPOSilentRegisterManager$registerSilent$1$1", f = "PIPOSilentRegisterManager.kt", l = {89, 91}, m = "invokeSuspend")
public final class C1507010pJr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ InterfaceC1506990pJp LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1507010pJr(String str, String str2, String str3, String str4, String str5, InterfaceC1506990pJp interfaceC1506990pJp, InterfaceC1364105Vn<? super C1507010pJr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = interfaceC1506990pJp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1507010pJr(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object registerResponse = obj;
        C1C7U.LIZ("PIPOSilentRegisterManager@999d.registerSilent$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(registerResponse);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PIPOSilentRegisterManager@999d.registerSilent$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(registerResponse);
        } else {
            C155000ia.LIZIZ(registerResponse);
            String currentRegionCode = C1717770unn.LJIIIIZZ().getCurrentRegionCode();
            n nVar = new n();
            String str = this.LLILZIL;
            String str2 = this.LLILZLL;
            String str3 = "";
            if (str == null) {
                str = "";
            }
            JSONObject jSONObjectLIZJ = C1722320uv8.LIZJ(str, null);
            jSONObjectLIZJ.put("register_entrance", str2);
            String strJ3 = C786410Ut5.J3(jSONObjectLIZJ);
            if (strJ3 == null) {
                strJ3 = "";
            }
            nVar.LJJIIJ("risk_info", strJ3);
            nVar.LJJIIJ("country_code", currentRegionCode);
            String string = nVar.toString();
            C1507020pJs c1507020pJs = WalletApi.LIZ;
            String str4 = this.LLILLJJLI;
            c1507020pJs.getClass();
            WalletApi walletApi = (WalletApi) C1717770unn.LJIIJ().createBuilder(str4).build().create(WalletApi.class);
            String str5 = this.LLILLL;
            String str6 = this.LLILZ;
            if (str6 != null) {
                str3 = str6;
            }
            String strValueOf = String.valueOf(System.currentTimeMillis());
            this.LL = 1;
            registerResponse = walletApi.getRegisterResponse(str5, str3, string, currentRegionCode, strValueOf, this);
            if (registerResponse == objLJFF) {
                C1C7U.LIZIZ("PIPOSilentRegisterManager@999d.registerSilent$1$1");
                return objLJFF;
            }
        }
        C0X52 c0x52 = (C0X52) registerResponse;
        BaseResponse baseResponse = (BaseResponse) c0x52.LIZIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1506980pJo c1506980pJo = new C1506980pJo(c0x52, baseResponse, this.LLIZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1506980pJo) == objLJFF) {
            C1C7U.LIZIZ("PIPOSilentRegisterManager@999d.registerSilent$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PIPOSilentRegisterManager@999d.registerSilent$1$1");
        return unit2;
    }
}
