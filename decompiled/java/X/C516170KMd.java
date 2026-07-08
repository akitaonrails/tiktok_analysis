package X;

import Y.AfS176S0100000_7;
import Y.AfS9S2000000_7;
import Y.AkS52S0210000_7;
import com.ss.android.ugc.aweme.subscription.pgc.data.model.PgcCheckSubOrderResultStruct;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0KMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.payment.v2.implement.pay.QueryOrderRepo$pollingCheckOrder$pollResult$1", f = "QueryOrderRepo.kt", l = {124}, m = "invokeSuspend")
public final class C516170KMd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0KNR>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C516180KMe LLILZ;
    public final /* synthetic */ C0KFM LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ C118300cf LLIZLLLIL;
    public final /* synthetic */ C118300cf LLJ;
    public final /* synthetic */ long[] LLJI;
    public final /* synthetic */ boolean LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C516170KMd(C516180KMe c516180KMe, C0KFM c0kfm, String str, long j, C118300cf c118300cf, C118300cf c118300cf2, long[] jArr, boolean z, InterfaceC1364105Vn<? super C516170KMd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c516180KMe;
        this.LLILZIL = c0kfm;
        this.LLILZLL = str;
        this.LLIZ = j;
        this.LLIZLLLIL = c118300cf;
        this.LLJ = c118300cf2;
        this.LLJI = jArr;
        this.LLJIJIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C516170KMd c516170KMd = new C516170KMd(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c516170KMd.LLILLL = obj;
        return c516170KMd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        Integer numValueOf;
        C11JN c11jnCheckSubOrder;
        C11NZ<R> c11nzLJIILIIL;
        C11NZ c11nzLJJJ;
        Object objLIZ = obj;
        C1C7U.LIZ("QueryOrderRepo@a26c.pollingCheckOrder$pollResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            final InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            final C516180KMe c516180KMe = this.LLILZ;
            final C0KFM c0kfm = this.LLILZIL;
            final String str2 = this.LLILZLL;
            final long j = this.LLIZ;
            final C118300cf c118300cf = this.LLIZLLLIL;
            final C118300cf c118300cf2 = this.LLJ;
            final long[] jArr = this.LLJI;
            boolean z2 = this.LLJIJIL;
            this.LLILLL = interfaceC497601wk;
            this.LL = str2;
            this.LLILLJJLI = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C0KO1 c0ko1 = c516180KMe.LJ;
            String str3 = c0kfm.LJIIIZ;
            c0ko1.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QueryOrderRepo.requestContractStatusApi start, endpoint=/tiktok/sub/contract/status/, secAnchorUid=");
            sbLIZ.append(str3);
            sbLIZ.append(", contractId=");
            sbLIZ.append(str2);
            sbLIZ.append(", orderId=");
            sbLIZ.append(str2);
            sbLIZ.append(", payloadNull=");
            if (c0ko1.LIZIZ.LIZ == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(", sourceParam=");
            C0KFM c0kfm2 = c0ko1.LIZIZ.LIZ;
            if (c0kfm2 != null) {
                str = c0kfm2.LIZLLL;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(", createContractIntent=");
            C0KFM c0kfm3 = c0ko1.LIZIZ.LIZ;
            if (c0kfm3 != null) {
                numValueOf = Integer.valueOf(c0kfm3.LJIIZILJ);
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            if (c0ko1.LIZIZ.LIZ != null && (c11jnCheckSubOrder = C0KLQ.LIZ().checkSubOrder(str3, str2)) != null && (c11nzLJIILIIL = C0JCK.LIZ(c11jnCheckSubOrder.LJJIJIL(new C516901zr(12)).LJJIJIIJIL(new AfS9S2000000_7(str3, str2, 2)).LJJIJIIJI(new C516901zr(13)), EnumC499440JiI.GENERAL, c0ko1.LIZIZ.LIZ.LIZLLL, "sub/contract/status", null, 8).LJIILIIL(new C0UJ2())) != 0 && (c11nzLJJJ = c11nzLJIILIIL.LJJJ(new InterfaceC1487280oo2() { // from class: X.0KMq
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj2) throws JSONException {
                    Integer numValueOf2;
                    DataResponse dataResponse = (DataResponse) obj2;
                    long jCurrentTimeMillis = System.currentTimeMillis() - j;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("QueryOrderRepo.pollingCheckOrder responseReceived, contractId=");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(", orderId=");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(", currentAttempt=");
                    sbLIZ2.append(c118300cf.element + 1);
                    sbLIZ2.append(", elapsedMs=");
                    sbLIZ2.append(jCurrentTimeMillis);
                    sbLIZ2.append(", httpStatusCode=");
                    sbLIZ2.append(dataResponse.status_code);
                    sbLIZ2.append(", businessErrorCode=");
                    sbLIZ2.append(dataResponse.status_code);
                    sbLIZ2.append(", logId=");
                    sbLIZ2.append(dataResponse.getLogId());
                    sbLIZ2.append(", dataStatus=");
                    PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct = (PgcCheckSubOrderResultStruct) dataResponse.data;
                    String str4 = null;
                    if (pgcCheckSubOrderResultStruct != null) {
                        numValueOf2 = Integer.valueOf(pgcCheckSubOrderResultStruct.status);
                    } else {
                        numValueOf2 = null;
                    }
                    sbLIZ2.append(numValueOf2);
                    sbLIZ2.append(", toast=");
                    PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct2 = (PgcCheckSubOrderResultStruct) dataResponse.data;
                    if (pgcCheckSubOrderResultStruct2 != null) {
                        str4 = pgcCheckSubOrderResultStruct2.toast;
                    }
                    sbLIZ2.append(str4);
                    sbLIZ2.append(", fullResponse=");
                    sbLIZ2.append(dataResponse);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct3 = (PgcCheckSubOrderResultStruct) dataResponse.data;
                    if (pgcCheckSubOrderResultStruct3 == null) {
                        return C11NZ.LJJIJLIJ(new Exception("retry"));
                    }
                    if (pgcCheckSubOrderResultStruct3.status != 1) {
                        c118300cf2.element = dataResponse.status_code;
                        if (c118300cf.element < jArr.length) {
                            C0KN8 c0kn8LIZJ = C516180KMe.LIZJ(c516180KMe, c0kfm, str2, System.currentTimeMillis() - j, c118300cf.element, null, "retry", false, 80);
                            c516180KMe.LJ.getClass();
                            C0KN9.LIZ(c0kn8LIZJ);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("QueryOrderRepo.pollingCheckOrder logApiFailForRetry, contractId=");
                            sbLIZ3.append(str2);
                            sbLIZ3.append(", orderId=");
                            sbLIZ3.append(str2);
                            sbLIZ3.append(", retryCount=");
                            sbLIZ3.append(c118300cf.element);
                            sbLIZ3.append(", dataStatus=");
                            sbLIZ3.append(pgcCheckSubOrderResultStruct3.status);
                            sbLIZ3.append(", durationMs=");
                            sbLIZ3.append(System.currentTimeMillis() - j);
                            C2188811AlT.LIZIZ(sbLIZ3);
                        }
                        return C11NZ.LJJIJLIJ(new Exception("retry"));
                    }
                    return C11NZ.LJJJJZ(pgcCheckSubOrderResultStruct3);
                }
            }, false)) != null) {
                c11nzLJJJ.LJJLIIIJLJLI(new AkS52S0210000_7(str2, c118300cf, jArr, z2, c118300cf2, 2)).LJJLL(new AfS176S0100000_7(c23260099m, 131), new AfS176S0100000_7(c23260099m, 132));
            }
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("QueryOrderRepo@a26c.pollingCheckOrder$pollResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("QueryOrderRepo@a26c.pollingCheckOrder$pollResult$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0KNR> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
