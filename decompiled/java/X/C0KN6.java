package X;

import android.app.Activity;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.wallet.model.CreateSubOrderResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KN6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KN6 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C516580KNs LL;
    public final /* synthetic */ C0KJK LLILLJJLI;
    public final /* synthetic */ C1791720wj4 LLILLL;
    public final /* synthetic */ CreateSubOrderResult LLILZ;
    public final /* synthetic */ Function1<C518080KTm, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KN6(C516580KNs c516580KNs, C0KJK c0kjk, C1791720wj4 c1791720wj4, CreateSubOrderResult createSubOrderResult, C516520KNm c516520KNm) {
        super(0);
        this.LL = c516580KNs;
        this.LLILLJJLI = c0kjk;
        this.LLILLL = c1791720wj4;
        this.LLILZ = createSubOrderResult;
        this.LLILZIL = c516520KNm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        IapService iapService = this.LL.LIZJ;
        Activity activity = this.LLILLJJLI.LIZJ.get();
        C1791720wj4 c1791720wj4 = this.LLILLL;
        final C516580KNs c516580KNs = this.LL;
        final String str = this.LLILZ.contractId;
        final C0KJK c0kjk = this.LLILLJJLI;
        final Function1<C518080KTm, Unit> function1 = this.LLILZIL;
        c516580KNs.getClass();
        final C0KO6 c0ko6 = new C0KO6(str, System.currentTimeMillis());
        C0KMK c0kmk = C0KMK.LIZ;
        Integer numValueOf = Integer.valueOf(c0kjk.LJIILL);
        C0KMJ c0kmj = C0KMJ.IAP_STARTED;
        c0kmk.getClass();
        C0KMK.LIZJ(str, numValueOf, c0kmj);
        iapService.LJIILL(activity, c1791720wj4, new C0KN7(c0ko6, str, c516580KNs, function1) { // from class: X.0KN5
            public final /* synthetic */ String LJFF;
            public final /* synthetic */ C516580KNs LJI;
            public final /* synthetic */ Function1<C518080KTm, Unit> LJII;

            @Override // X.InterfaceC1791700wj2
            public final void LIZIZ(C518140KTs c518140KTs) {
                Map<String, String> mapLIZ;
                long jLongValue;
                int i;
                String str2;
                Long lLJIILIIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSuccess");
                sbLIZ.append(c518140KTs.LJIIJJI);
                sbLIZ.append(':');
                sbLIZ.append(c518140KTs.LJIIJ);
                C20441214yg.LIZIZ("SubscribePaymentV2", C2188811AlT.LIZIZ(sbLIZ));
                C0KN4 c0kn4 = this.LIZ.LIZ;
                if (c0kn4 != null) {
                    mapLIZ = c0kn4.LIZ(c518140KTs.LJI);
                } else {
                    mapLIZ = null;
                }
                C516010KLn c516010KLn = C516010KLn.LIZ;
                long jCurrentTimeMillis = 0;
                if (this.LIZ.LIZ != null && (str2 = (String) ((LinkedHashMap) c518140KTs.LJI).get("upload_receipt_end_timestamp")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                c516010KLn.getClass();
                C516010KLn.LIZIZ = jLongValue;
                long jLIZIZ = C516010KLn.LIZIZ();
                if (C516010KLn.LIZLLL != 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() - C516010KLn.LIZLLL;
                }
                if (mapLIZ != null) {
                    this.LIZLLL.putAll(mapLIZ);
                }
                boolean zLIZ = this.LIZ.LIZ();
                String str3 = this.LIZIZ.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LIZJ;
                C0KNX c0knx = this.LIZ;
                String str4 = c0knx.LIZLLL;
                String str5 = c0knx.LIZIZ;
                Map<String, String> map = this.LIZLLL;
                C0KM7 c0km7LIZLLL = C0KN7.LIZLLL();
                C0KNX c0knx2 = this.LIZ;
                C0KN4 c0kn42 = c0knx2.LIZ;
                if (c0kn42 != null) {
                    i = c0kn42.LLIZLLLIL;
                } else {
                    i = 0;
                }
                C516010KLn.LJIIJ(Boolean.valueOf(zLIZ), str3, jCurrentTimeMillis2, jLIZIZ, jCurrentTimeMillis, str4, str5, map, c0km7LIZLLL, i, c0knx2);
                C0KN4 c0kn43 = this.LIZ.LIZ;
                if (c0kn43 != null) {
                    c0kn43.LIZJ();
                }
                C0KNX c0knx3 = this.LIZ;
                if (c0knx3 instanceof C0KJK) {
                    c0knx3.LJFF.put("trigger_from", "normal_iap_finish");
                }
                C0KMK c0kmk2 = C0KMK.LIZ;
                String str6 = this.LJFF;
                Integer numValueOf2 = Integer.valueOf(this.LJ.LJIILL);
                C0KMJ c0kmj2 = C0KMJ.IAP_SUCCEED;
                c0kmk2.getClass();
                C0KMK.LIZJ(str6, numValueOf2, c0kmj2);
                this.LJI.LIZ.LIZIZ(this.LJFF);
            }

            @Override // X.InterfaceC1791700wj2
            public final void LIZJ(C518140KTs c518140KTs) {
                int i;
                C0KMQ c0kmq;
                Map<String, String> mapLIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFailure, ");
                sbLIZ.append(c518140KTs.LIZIZ);
                sbLIZ.append(' ');
                sbLIZ.append(c518140KTs.LIZJ);
                sbLIZ.append(' ');
                sbLIZ.append(c518140KTs.LJFF);
                C20441214yg.LIZIZ("SubscribePaymentV2", C2188811AlT.LIZIZ(sbLIZ));
                C0KN4 c0kn4 = this.LIZ.LIZ;
                if (c0kn4 != null && (mapLIZ = c0kn4.LIZ(c518140KTs.LJI)) != null) {
                    this.LIZLLL.putAll(mapLIZ);
                }
                C516010KLn c516010KLn = C516010KLn.LIZ;
                Boolean boolValueOf = Boolean.valueOf(this.LIZ.LIZ());
                String str2 = this.LIZIZ.LIZ;
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZIZ.LIZIZ;
                int i2 = c518140KTs.LIZIZ;
                int i3 = c518140KTs.LIZJ;
                String str3 = c518140KTs.LIZLLL;
                String str4 = c518140KTs.LJ;
                C0KNX c0knx = this.LIZ;
                String str5 = c0knx.LIZLLL;
                String str6 = c0knx.LIZIZ;
                Map<String, String> map = this.LIZLLL;
                C0KM7 c0km7LIZLLL = C0KN7.LIZLLL();
                C0KNX c0knx2 = this.LIZ;
                C0KN4 c0kn42 = c0knx2.LIZ;
                if (c0kn42 != null) {
                    i = c0kn42.LLIZLLLIL;
                } else {
                    i = 0;
                }
                c516010KLn.getClass();
                C516010KLn.LJII(boolValueOf, str2, jCurrentTimeMillis, i2, i3, str3, str4, str5, str6, map, c0km7LIZLLL, i, c0knx2);
                C0KN4 c0kn43 = this.LIZ.LIZ;
                if (c0kn43 != null) {
                    c0kn43.LIZJ();
                }
                C0KNX c0knx3 = this.LIZ;
                if ((c0knx3 instanceof C0KJK) && (c0kmq = ((C0KJK) c0knx3).LJJI) != null) {
                    c0kmq.onFail(c518140KTs.LIZIZ, c518140KTs.LJFF);
                }
                C0KMQ c0kmq2 = this.LJ.LJJI;
                if (c0kmq2 != null) {
                    c0kmq2.onFail(c518140KTs.LIZIZ, c518140KTs.LJFF);
                }
                C0KMK c0kmk2 = C0KMK.LIZ;
                String str7 = this.LJFF;
                Integer numValueOf2 = Integer.valueOf(this.LJ.LJIILL);
                C0KMJ c0kmj2 = C0KMJ.IAP_FAIL;
                c0kmk2.getClass();
                C0KMK.LIZJ(str7, numValueOf2, c0kmj2);
                this.LJII.invoke(c518140KTs);
                this.LJI.LIZ.LIZ();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(this.LJ, c0ko6);
                this.LJFF = str;
                this.LJI = c516580KNs;
                this.LJII = function1;
            }
        }, this.LLILLJJLI.LJIJI);
        return Unit.LIZ;
    }
}
