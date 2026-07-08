package X;

import com.bytedance.pipo.kyc.singpass.PipoMiddleActivity;
import com.bytedance.pipo.kyc.singpass.network.model.PersonInfo;
import com.bytedance.pipo.kyc.singpass.network.model.request.VendorReq;
import com.bytedance.pipo.kyc.singpass.network.model.response.VendorResp;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.kyc.singpass.PipoMiddleActivity$getPersonInfo$1", f = "PipoMiddleActivity.kt", l = {156}, m = "invokeSuspend")
public final class C1739570vMx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PipoMiddleActivity LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739570vMx(PipoMiddleActivity pipoMiddleActivity, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pipoMiddleActivity;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1739570vMx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String str;
        C1739560vMw c1739560vMw;
        Pair pair;
        String strLJIIJJI;
        C1C7U.LIZ("PipoMiddleActivity@45a3.getPersonInfo$1");
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
            if (C1739550vMv.LIZLLL != null && C1739550vMv.LJ != null && (str = C1739550vMv.LJFF) != null && (c1739560vMw = C1739550vMv.LJI) != null) {
                Gson gson = C1739590vMz.LIZ;
                String str2 = C1739550vMv.LIZLLL;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = C1739550vMv.LJ;
                if (str4 != null) {
                    str3 = str4;
                }
                String str5 = this.LLILLL;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("redirect_url", str3);
                jSONObject.put("auth_code", str5);
                jSONObject.put("session_id", str);
                try {
                    VendorReq vendorReq = new VendorReq(202, str2, "singpass_v4", C786410Ut5.J3(jSONObject));
                    InterfaceC1504300pFU interfaceC1504300pFU = c1739560vMw.LIZJ;
                    if (c1739560vMw.LIZ) {
                        strLJIIJJI = Intrinsics.LJIIJJI("/risk/request_vendor", c1739560vMw.LIZIZ);
                    } else {
                        strLJIIJJI = "https://f-p-va.isnssdk.com/risk/request_vendor";
                    }
                    Gson gson2 = C1739590vMz.LIZ;
                    VendorResp vendorResp = (VendorResp) gson2.LJII(interfaceC1504300pFU.LIZ(strLJIIJJI, gson2.LJIILL(vendorReq), null), VendorResp.class);
                    int i2 = vendorResp.baseResp.statusCode;
                    if (i2 != 0) {
                        pair = new Pair(null, new C1739600vN0(Integer.valueOf(i2), vendorResp.baseResp.statusMessage));
                    } else {
                        int i3 = vendorResp.status;
                        if (i3 != 7) {
                            pair = new Pair(null, new C1739600vN0(Integer.valueOf(i3), "status is not STATUS_SUCCESS"));
                        } else {
                            pair = new Pair(gson2.LJII(vendorResp.response, PersonInfo.class), null);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    pair = new Pair(null, new C1739600vN0(null, e.getMessage()));
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C1739540vMu c1739540vMu = new C1739540vMu(pair, null, str, this);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c1739540vMu) == objLJFF) {
                    C1C7U.LIZIZ("PipoMiddleActivity@45a3.getPersonInfo$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PipoMiddleActivity@45a3.getPersonInfo$1");
        return unit;
    }
}
