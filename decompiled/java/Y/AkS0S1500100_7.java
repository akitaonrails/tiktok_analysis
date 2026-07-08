package Y;

import X.AbstractC516390KMz;
import X.C0KFM;
import X.C0KM8;
import X.C0KMZ;
import X.C0KP3;
import X.C0KP7;
import X.C118300cf;
import X.C11NZ;
import X.C2188811AlT;
import X.C516000KLm;
import X.C516470KNh;
import X.InterfaceC1487280oo2;
import com.bytedance.android.live.network.response.BaseResponse;
import com.ss.android.ugc.aweme.subscription.pgc.data.model.PgcCheckSubOrderResultStruct;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import org.json.JSONException;
import tikcast.api.fans.PolingSuperFanContractStatusResult;

/* JADX INFO: loaded from: classes8.dex */
public class AkS0S1500100_7 implements InterfaceC1487280oo2 {
    public final int $t;
    public long j6;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$0(AkS0S1500100_7 akS0S1500100_7, Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        T t = baseResponse.data;
        PolingSuperFanContractStatusResult polingSuperFanContractStatusResult = (PolingSuperFanContractStatusResult) t;
        if (polingSuperFanContractStatusResult != null && polingSuperFanContractStatusResult.status == 1) {
            return C11NZ.LJJJJZ(t);
        }
        ((C118300cf) akS0S1500100_7.l1).element = baseResponse.statusCode;
        if (((C118300cf) akS0S1500100_7.l2).element < ((long[]) akS0S1500100_7.l3).length) {
            C516470KNh c516470KNhLIZ = C0KP7.LIZ((C0KP7) akS0S1500100_7.l4, (C0KP3) akS0S1500100_7.l5, akS0S1500100_7.s0, System.currentTimeMillis() - akS0S1500100_7.j6, ((C118300cf) akS0S1500100_7.l2).element, null, "retry", false, baseResponse.LIZIZ, 80);
            ((C0KP7) akS0S1500100_7.l4).LIZIZ.getClass();
            AbstractC516390KMz.LIZ(c516470KNhLIZ);
        }
        return C11NZ.LJJIJLIJ(new Exception("retry"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$1(AkS0S1500100_7 akS0S1500100_7, Object obj) throws JSONException {
        Integer numValueOf;
        DataResponse dataResponse = (DataResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResubscribeStrategy.queryResubscribeStatus flatMap responseReceived, contractId=");
        sbLIZ.append(akS0S1500100_7.s0);
        sbLIZ.append(", orderId=");
        sbLIZ.append(akS0S1500100_7.s0);
        sbLIZ.append(", currentAttempt=");
        sbLIZ.append(((C118300cf) akS0S1500100_7.l1).element + 1);
        sbLIZ.append(", elapsedMs=");
        sbLIZ.append(System.currentTimeMillis() - akS0S1500100_7.j6);
        sbLIZ.append(", httpStatusCode=");
        sbLIZ.append(dataResponse.status_code);
        sbLIZ.append(", businessErrorCode=");
        sbLIZ.append(dataResponse.status_code);
        sbLIZ.append(", dataStatus=");
        PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct = (PgcCheckSubOrderResultStruct) dataResponse.data;
        if (pgcCheckSubOrderResultStruct != null) {
            numValueOf = Integer.valueOf(pgcCheckSubOrderResultStruct.status);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", response=");
        sbLIZ.append(dataResponse);
        C2188811AlT.LIZIZ(sbLIZ);
        PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct2 = (PgcCheckSubOrderResultStruct) dataResponse.data;
        if (pgcCheckSubOrderResultStruct2 == null) {
            return C11NZ.LJJIJLIJ(new Exception("retry"));
        }
        if (pgcCheckSubOrderResultStruct2.status != 1) {
            ((C118300cf) akS0S1500100_7.l3).element = dataResponse.status_code;
            if (((C118300cf) akS0S1500100_7.l1).element < ((long[]) akS0S1500100_7.l4).length) {
                C516000KLm c516000KLm = C516000KLm.LIZ;
                long jCurrentTimeMillis = System.currentTimeMillis() - akS0S1500100_7.j6;
                int i = ((C118300cf) akS0S1500100_7.l1).element;
                int i2 = dataResponse.status_code;
                C0KFM c0kfm = (C0KFM) akS0S1500100_7.l5;
                String str = c0kfm.LIZLLL;
                String str2 = ((C0KMZ) akS0S1500100_7.l2).LIZ;
                c0kfm.LIZJ.get();
                C516000KLm.LJIILJJIL(c516000KLm, true, akS0S1500100_7.s0, jCurrentTimeMillis, i, i2, str, str2, C0KM8.LIZ(), "retry", false, (C0KFM) akS0S1500100_7.l5);
            }
            return C11NZ.LJJIJLIJ(new Exception("retry"));
        }
        return C11NZ.LJJJJZ(pgcCheckSubOrderResultStruct2);
    }

    public AkS0S1500100_7(String str, Object obj, long j, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
        this.j6 = j;
        this.l2 = obj2;
        this.l3 = obj3;
        this.l4 = obj4;
        this.l5 = obj5;
    }
}
