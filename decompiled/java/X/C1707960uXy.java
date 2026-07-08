package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentDetails;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS200S1100000_26;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707960uXy extends C09AY implements InterfaceC1631630sYr<EnumC336190DFx, PayRequestPaymentDetails, String, String, Unit> {
    public final /* synthetic */ Function2<Boolean, String, Unit> LL;
    public final /* synthetic */ C1709570uaZ LLILLJJLI;
    public final /* synthetic */ C1707480uXC LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1707960uXy(AwS200S1100000_26 awS200S1100000_26, C1709570uaZ c1709570uaZ, C1707480uXC c1707480uXC, Context context) {
        super(4);
        this.LL = awS200S1100000_26;
        this.LLILLJJLI = c1709570uaZ;
        this.LLILLL = c1707480uXC;
        this.LLILZ = context;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(EnumC336190DFx enumC336190DFx, PayRequestPaymentDetails payRequestPaymentDetails, String str, String str2) throws JSONException {
        String str3;
        Object c098200Yq;
        String str4;
        String str5 = str2;
        PayRequestPaymentDetails payRequestPaymentDetails2 = payRequestPaymentDetails;
        if (enumC336190DFx == EnumC336190DFx.SUCCESS && payRequestPaymentDetails2 != null) {
            PaymentOption paymentOptionLJJIJIIJI = this.LLILLJJLI.LJJIJIIJI();
            if (paymentOptionLJJIJIIJI == null) {
                paymentOptionLJJIJIIJI = this.LLILLJJLI.LJJIJ();
            }
            if (paymentOptionLJJIJIIJI == null) {
                this.LL.invoke(Boolean.FALSE, "missing_selected_payment_option");
            } else {
                C1707480uXC c1707480uXC = this.LLILLL;
                Context context = this.LLILZ;
                C1709570uaZ c1709570uaZ = this.LLILLJJLI;
                String str6 = payRequestPaymentDetails2.riskInfo;
                final Function2<Boolean, String, Unit> function2 = this.LL;
                c1707480uXC.getClass();
                C1707990uY1 c1707990uY1 = c1709570uaZ.LIZIZ;
                String strLJIL = paymentOptionLJJIJIIJI.LJIL();
                if (strLJIL == null) {
                    strLJIL = "";
                }
                String str7 = c1707480uXC.LIZ.LJFF;
                if (a0.LJJJIL(str7) && (c1707990uY1 == null || (str7 = c1707990uY1.LJ) == null)) {
                    str7 = "";
                }
                C1707840uXm c1707840uXm = c1707480uXC.LIZ;
                String str8 = c1707840uXm.LIZIZ.payRequestId;
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = c1707840uXm.LJIIL;
                if (str9 == null) {
                    str9 = "order_submit";
                }
                String strLIZ = C1949207kI.LIZ(strLJIL, str7);
                C1708220uYO c1708220uYO = new C1708220uYO();
                String str10 = c1707480uXC.LIZ.LIZJ;
                if (a0.LJJJIL(str10) && (c1707990uY1 == null || (str10 = c1707990uY1.LIZ) == null)) {
                    str10 = "";
                }
                String str11 = c1707480uXC.LIZ.LIZLLL;
                if (a0.LJJJIL(str11) && (c1707990uY1 == null || (str11 = c1707990uY1.LIZIZ) == null)) {
                    str11 = "";
                }
                if (c1707990uY1 != null) {
                    str3 = c1707990uY1.LIZJ;
                } else {
                    str3 = null;
                }
                String str12 = c1707480uXC.LIZ.LJ;
                if (a0.LJJJIL(str12) && (c1707990uY1 == null || (str12 = c1707990uY1.LIZLLL) == null)) {
                    str12 = "";
                }
                C1709570uaZ c1709570uaZLJIJJ = C1709570uaZ.LJIJJ(c1709570uaZ, null, new C1707990uY1(str10, str11, str3, str12, str7), null, null, null, null, null, 67108861);
                try {
                    if (str6 == null) {
                        str6 = "{}";
                    }
                    c098200Yq = new JSONObject(str6);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                JSONObject jSONObject = new JSONObject();
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = jSONObject;
                }
                JSONObject jSONObject2 = (JSONObject) c098200Yq;
                jSONObject2.put("verify_request_id", strLIZ);
                jSONObject2.put("scene_tag", "after_payment_bind_retain");
                C1708320uYY c1708320uYY = new C1708320uYY(c1709570uaZLJIJJ, jSONObject2, paymentOptionLJJIJIIJI, str8, str9, c1707480uXC.LIZ.LJII, null, "order_submit", "binding");
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                C1707970uXz.LIZIZ(strLIZ, c1708220uYO);
                C1708220uYO.LIZLLL.getClass();
                Map<String, HashMap<String, String>> map = C1708220uYO.LJII;
                HashMap<String, String> map2 = new HashMap<>();
                map2.put("payment_method_id", strLJIL);
                PODaInfo pODaInfo = paymentOptionLJJIJIIJI.trackInfo;
                if (pODaInfo == null || (str4 = pODaInfo.optionName) == null) {
                    str4 = "";
                }
                map2.put("payment_method", str4);
                map2.put("page_name", str9);
                map2.put("pay_request_id", str8);
                map.put(strLIZ, map2);
                C1708210uYN.LIZLLL(paymentOptionLJJIJIIJI, str9, str8, strLIZ);
                C1708710uZB.LIZ("Cashier").LIZ(4, "TTLSPostPaymentBindRetain, bind_pi start");
                c1708220uYO.LIZJ(context, strLIZ, c1708320uYY, new InterfaceC1708270uYT() { // from class: X.0iTs
                    public boolean LL;

                    @Override // X.InterfaceC1708270uYT
                    public final void LIZIZ() {
                        C1708710uZB.LIZ("Cashier").LIZ(4, "TTLSPostPaymentBindRetain, 3ds complete");
                    }

                    @Override // X.InterfaceC1708270uYT
                    public final void LIZJ() {
                        C1708710uZB.LIZ("Cashier").LIZ(4, "TTLSPostPaymentBindRetain, jump to bind page");
                    }

                    @Override // X.InterfaceC1708270uYT
                    public final void LIZLLL() {
                        C1708710uZB.LIZ("Cashier").LIZ(4, "TTLSPostPaymentBindRetain, start query");
                    }

                    @Override // X.InterfaceC1708270uYT
                    public final boolean getNotified() {
                        return this.LL;
                    }

                    @Override // X.InterfaceC1708270uYT
                    public final void setNotified(boolean z) {
                        this.LL = z;
                    }

                    @Override // X.InterfaceC1708270uYT
                    public final void LIZ(int i, String str13) {
                        boolean z;
                        if (i != 0 && i != 3) {
                            z = false;
                        } else {
                            z = true;
                        }
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        Function2<Boolean, String, Unit> function22 = function2;
                        if (z) {
                            str13 = "bind_success";
                        } else if (str13 == null) {
                            str13 = "bind_failed";
                        }
                        if (atomicBoolean2.compareAndSet(false, true)) {
                            function22.invoke(Boolean.valueOf(z), str13);
                        }
                    }
                }, c1707480uXC.LIZ.LJIIJJI);
            }
        } else {
            Function2<Boolean, String, Unit> function22 = this.LL;
            Boolean bool = Boolean.FALSE;
            if (str5 == null) {
                str5 = "build_payment_details_failed";
            }
            function22.invoke(bool, str5);
        }
        return Unit.LIZ;
    }
}
