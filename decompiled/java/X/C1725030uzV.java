package X;

import com.ss.android.ugc.aweme.pipo.errorsdk.api.ClientVisualExpressionResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uzV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.errorsdk.ErrorCodeHandler$triggerClientErrorMappingFetch$1$1$1", f = "ErrorCodeSdkImpl.kt", l = {}, m = "invokeSuspend")
public final class C1725030uzV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0X52<ClientVisualExpressionResponse> LL;
    public final /* synthetic */ ClientVisualExpressionResponse LLILLJJLI;
    public final /* synthetic */ C1725060uzY LLILLL;
    public final /* synthetic */ InterfaceC1725120uze LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1725030uzV(C0X52<ClientVisualExpressionResponse> c0x52, ClientVisualExpressionResponse clientVisualExpressionResponse, C1725060uzY c1725060uzY, InterfaceC1725120uze interfaceC1725120uze, long j, InterfaceC1364105Vn<? super C1725030uzV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0x52;
        this.LLILLJJLI = clientVisualExpressionResponse;
        this.LLILLL = c1725060uzY;
        this.LLILZ = interfaceC1725120uze;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1725030uzV(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        ClientVisualExpressionResponse clientVisualExpressionResponse;
        C1C7U.LIZ("ErrorCodeHandler@e4e9.triggerClientErrorMappingFetch$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LIZJ() && (clientVisualExpressionResponse = this.LLILLJJLI) != null) {
            Integer num = clientVisualExpressionResponse.errorCode;
            if (num != null && num.intValue() == 0) {
                this.LLILLL.LJFF = this.LLILLJJLI.data;
                InterfaceC1725120uze interfaceC1725120uze = this.LLILZ;
                if (interfaceC1725120uze != null) {
                    interfaceC1725120uze.LIZ(this.LLILLJJLI.data);
                }
                this.LLILLL.LJ().LIZ(C2286608xc.LJFF(System.currentTimeMillis() - this.LLILZIL), "fetch_client_ve", null);
            } else {
                InterfaceC1725120uze interfaceC1725120uze2 = this.LLILZ;
                if (interfaceC1725120uze2 != null) {
                    EnumC1725040uzW enumC1725040uzW = EnumC1725040uzW.FETCH_CLIENT_VE_SERVER_ERROR;
                    String strValueOf = String.valueOf(enumC1725040uzW.getErrorCode());
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(enumC1725040uzW.getMessage());
                    sbLIZ.append(", code=");
                    sbLIZ.append(this.LLILLJJLI.errorCode);
                    sbLIZ.append(", msg=");
                    sbLIZ.append(this.LLILLJJLI.message);
                    interfaceC1725120uze2.onFail(strValueOf, C2188811AlT.LIZIZ(sbLIZ));
                }
                C1725050uzX c1725050uzXLJ = this.LLILLL.LJ();
                EnumC1725040uzW enumC1725040uzW2 = EnumC1725040uzW.FETCH_CLIENT_VE_SERVER_ERROR;
                JSONObject jSONObject = new JSONObject();
                ClientVisualExpressionResponse clientVisualExpressionResponse2 = this.LLILLJJLI;
                jSONObject.put("err_code", clientVisualExpressionResponse2.errorCode);
                jSONObject.put("err_msg", clientVisualExpressionResponse2.message);
                c1725050uzXLJ.LIZIZ("fetch_client_ve", enumC1725040uzW2, jSONObject);
            }
        } else {
            InterfaceC1725120uze interfaceC1725120uze3 = this.LLILZ;
            if (interfaceC1725120uze3 != null) {
                EnumC1725040uzW enumC1725040uzW3 = EnumC1725040uzW.FETCH_CLIENT_VE_HTTP_ERROR;
                String strValueOf2 = String.valueOf(enumC1725040uzW3.getErrorCode());
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(enumC1725040uzW3.getMessage());
                sbLIZ2.append(", statusCode=");
                sbLIZ2.append(this.LL.LIZ.LIZIZ);
                interfaceC1725120uze3.onFail(strValueOf2, C2188811AlT.LIZIZ(sbLIZ2));
            }
            C1725050uzX c1725050uzXLJ2 = this.LLILLL.LJ();
            EnumC1725040uzW enumC1725040uzW4 = EnumC1725040uzW.FETCH_CLIENT_VE_HTTP_ERROR;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("status_code", this.LL.LIZ.LIZIZ);
            c1725050uzXLJ2.LIZIZ("fetch_client_ve", enumC1725040uzW4, jSONObject2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ErrorCodeHandler@e4e9.triggerClientErrorMappingFetch$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
