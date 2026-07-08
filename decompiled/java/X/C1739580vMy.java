package X;

import com.bytedance.pipo.kyc.singpass.network.model.CodeChallengeParams;
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

/* JADX INFO: renamed from: X.0vMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.kyc.singpass.PIPOKYCSingPassCompat$startVerify$1", f = "PIPOKYCSingPassCompat.kt", l = {57}, m = "invokeSuspend")
public final class C1739580vMy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1739490vMp LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C0WWF LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739580vMy(C1739490vMp c1739490vMp, String str, String str2, C0WWF c0wwf, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1739490vMp;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c0wwf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1739580vMy(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Pair pair;
        String strLJIIJJI;
        C1C7U.LIZ("PIPOKYCSingPassCompat@caf1.startVerify$1");
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
            Gson gson = C1739590vMz.LIZ;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            C1739560vMw c1739560vMw = this.LLILLJJLI.LIZIZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("redirect_url", str2);
            jSONObject.put("request_id", str);
            try {
                VendorReq vendorReq = new VendorReq(201, "", "singpass_v4", C786410Ut5.J3(jSONObject));
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
                        pair = new Pair(gson2.LJII(vendorResp.response, CodeChallengeParams.class), null);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                pair = new Pair(null, new C1739600vN0(null, e.getMessage()));
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1739610vN1 c1739610vN1 = new C1739610vN1(this, pair, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1739610vN1) == objLJFF) {
                C1C7U.LIZIZ("PIPOKYCSingPassCompat@caf1.startVerify$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PIPOKYCSingPassCompat@caf1.startVerify$1");
        return unit;
    }
}
