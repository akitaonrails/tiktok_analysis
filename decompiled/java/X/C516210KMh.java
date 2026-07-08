package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.data.model.PgcCheckSubOrderResultStruct;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0KMh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.payment.v2.implement.pay.QueryOrderRepo$pollingCheckOrder$3", f = "QueryOrderRepo.kt", l = {}, m = "invokeSuspend")
public final class C516210KMh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0KNR>, Object> {
    public final /* synthetic */ C0KNR LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C516180KMe LLILZIL;
    public final /* synthetic */ C0KFM LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ HashMap<String, Object> LLIZLLLIL;
    public final /* synthetic */ C118300cf LLJ;
    public final /* synthetic */ Function2<Integer, Throwable, Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C516210KMh(C0KNR c0knr, String str, C118300cf c118300cf, long j, C516180KMe c516180KMe, C0KFM c0kfm, String str2, HashMap<String, Object> map, C118300cf c118300cf2, Function2<? super Integer, ? super Throwable, Unit> function2, InterfaceC1364105Vn<? super C516210KMh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0knr;
        this.LLILLJJLI = str;
        this.LLILLL = c118300cf;
        this.LLILZ = j;
        this.LLILZIL = c516180KMe;
        this.LLILZLL = c0kfm;
        this.LLIZ = str2;
        this.LLIZLLLIL = map;
        this.LLJ = c118300cf2;
        this.LLJI = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C516210KMh(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String simpleName;
        String message;
        String simpleName2;
        String message2;
        String message3;
        String message4;
        String simpleName3;
        String message5;
        Unit unit;
        String message6;
        String simpleName4;
        String message7;
        String simpleName5;
        String message8;
        Integer numLJ;
        Integer numValueOf;
        Integer numValueOf2;
        String strLIZ;
        C0KFM c0kfm;
        Integer numValueOf3;
        Unit unit2;
        C1C7U.LIZ("QueryOrderRepo@a26c.pollingCheckOrder$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("QueryOrderRepo.pollingCheckOrder dispatchResult, finalPath=onPollingSuccess, contractId=");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", orderId=");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", retryCount=");
            sbLIZ.append(this.LLILLL.element);
            sbLIZ.append(", dataStatus=");
            PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct = this.LL.LIZIZ;
            if (pgcCheckSubOrderResultStruct != null) {
                numLJ = C2286608xc.LJ(pgcCheckSubOrderResultStruct.status);
            } else {
                numLJ = null;
            }
            sbLIZ.append(numLJ);
            sbLIZ.append(", elapsedMs=");
            sbLIZ.append(System.currentTimeMillis() - this.LLILZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C516180KMe c516180KMe = this.LLILZIL;
            PgcCheckSubOrderResultStruct pgcCheckSubOrderResultStruct2 = this.LL.LIZIZ;
            String str = this.LLILLJJLI;
            int i = this.LLILLL.element;
            C0KFM c0kfm2 = this.LLILZLL;
            String strLIZ2 = this.LLIZ;
            HashMap<String, Object> map = this.LLIZLLLIL;
            long j = this.LLILZ;
            c516180KMe.getClass();
            if (pgcCheckSubOrderResultStruct2 != null) {
                pgcCheckSubOrderResultStruct2.setOrderID(str);
                pgcCheckSubOrderResultStruct2.setRetryCount(i);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("QueryOrderRepo.onPollingSuccess start, contractId=");
            sbLIZ2.append(str);
            sbLIZ2.append(", orderId=");
            sbLIZ2.append(str);
            sbLIZ2.append(", retryCount=");
            sbLIZ2.append(i);
            sbLIZ2.append(", dataStatus=");
            if (pgcCheckSubOrderResultStruct2 != null) {
                numValueOf = Integer.valueOf(pgcCheckSubOrderResultStruct2.status);
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            sbLIZ2.append(", iapStatus=");
            sbLIZ2.append(strLIZ2);
            sbLIZ2.append(", elapsedMs=");
            sbLIZ2.append(System.currentTimeMillis() - j);
            sbLIZ2.append(", data=");
            sbLIZ2.append(pgcCheckSubOrderResultStruct2);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (!((ArrayList) c516180KMe.LIZIZ).contains(str)) {
                c516180KMe.LIZIZ(pgcCheckSubOrderResultStruct2, c0kfm2);
                C516000KLm c516000KLm = C516000KLm.LIZ;
                c516000KLm.getClass();
                long jCurrentTimeMillis = 0;
                if (C516000KLm.LIZIZ > 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() - C516000KLm.LIZIZ;
                }
                String str2 = "unknown";
                if (strLIZ2 == null) {
                    C516050KLr c516050KLr = C516050KLr.LIZ;
                    Integer numValueOf4 = Integer.valueOf(c0kfm2.LJIIZILJ);
                    c516050KLr.getClass();
                    C0KM2 c0km2LIZIZ = C516050KLr.LIZIZ(numValueOf4, str);
                    if (c0km2LIZIZ == null || (strLIZ2 = c0km2LIZIZ.LIZ()) == null) {
                        strLIZ2 = "unknown";
                    }
                }
                C0KN8 c0kn8LIZJ = C516180KMe.LIZJ(c516180KMe, c0kfm2, str, jCurrentTimeMillis, i, strLIZ2, null, true, 96);
                C0KO1 c0ko1 = c516180KMe.LJ;
                c0ko1.getClass();
                boolean zLIZ = c0kn8LIZJ.LIZ.LIZ();
                String str3 = c0kn8LIZJ.LIZJ;
                long j2 = c0kn8LIZJ.LIZIZ;
                int i2 = c0kn8LIZJ.LIZLLL;
                C0KNY c0kny = c0kn8LIZJ.LIZ;
                String str4 = c0kny.LIZLLL;
                String str5 = c0kny.LIZIZ;
                c0kny.LIZJ.get();
                C516100KLw c516100KLwLIZ = C0KM8.LIZ();
                String str6 = c0kn8LIZJ.LJ;
                if (str6.length() > 0) {
                    str2 = str6;
                } else {
                    Object value = c0ko1.LIZ.getValue();
                    String str7 = c0kn8LIZJ.LIZJ;
                    C0KNY c0kny2 = c0kn8LIZJ.LIZ;
                    if ((c0kny2 instanceof C0KFM) && (c0kfm = (C0KFM) c0kny2) != null) {
                        numValueOf2 = Integer.valueOf(c0kfm.LJIIZILJ);
                    } else {
                        numValueOf2 = null;
                    }
                    value.getClass();
                    C0KM2 c0km2LIZIZ2 = C516050KLr.LIZIZ(numValueOf2, str7);
                    if (c0km2LIZIZ2 != null && (strLIZ = c0km2LIZIZ2.LIZ()) != null) {
                        str2 = strLIZ;
                    }
                }
                C0KNY c0kny3 = c0kn8LIZJ.LIZ;
                c516000KLm.LJIILLIIL(zLIZ, str3, j2, i2, str4, str5, c516100KLwLIZ, str2, c0kny3.LJFF, c0kny3);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("QueryOrderRepo.onPollingSuccess logApiSuccess, contractId=");
                sbLIZ3.append(str);
                sbLIZ3.append(", orderId=");
                sbLIZ3.append(str);
                sbLIZ3.append(", retryCount=");
                sbLIZ3.append(i);
                sbLIZ3.append(", duration=");
                sbLIZ3.append(jCurrentTimeMillis);
                sbLIZ3.append(", dataStatus=");
                if (pgcCheckSubOrderResultStruct2 != null) {
                    numValueOf3 = Integer.valueOf(pgcCheckSubOrderResultStruct2.status);
                } else {
                    numValueOf3 = null;
                }
                sbLIZ3.append(numValueOf3);
                C2188811AlT.LIZIZ(sbLIZ3);
                C0KNS.LIZ("ttlive_check_subscription", map);
                C0KOJ c0koj = c0kfm2.LJJIII;
                if (c0koj != null) {
                    c0koj.onSuccess(2, 1);
                }
                HashMap<String, Object> map2 = new HashMap<>();
                map2.put("duration", Long.valueOf(System.currentTimeMillis() - j));
                map2.put("orderId", str);
                map2.put("is_subscription", 1);
                C516410KNb.LIZ.getClass();
                try {
                    C0K77 c0k77LIZ = C516410KNb.LIZ();
                    if (c0k77LIZ != null) {
                        c0k77LIZ.LIZLLL(map2);
                        unit2 = Unit.LIZ;
                    } else {
                        unit2 = null;
                    }
                    C189200o6.m2constructorimpl(unit2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("QueryOrderRepo.pollingCheckOrder dispatchResult, finalPath=onPollingFailed, contractId=");
            sbLIZ4.append(this.LLILLJJLI);
            sbLIZ4.append(", orderId=");
            sbLIZ4.append(this.LLILLJJLI);
            sbLIZ4.append(", retryCount=");
            sbLIZ4.append(this.LLILLL.element);
            sbLIZ4.append(", detailCode=");
            sbLIZ4.append(this.LLJ.element);
            sbLIZ4.append(", throwable=");
            Throwable th2 = this.LL.LIZJ;
            if (th2 != null) {
                simpleName = th2.getClass().getSimpleName();
            } else {
                simpleName = null;
            }
            sbLIZ4.append(simpleName);
            sbLIZ4.append(", message=");
            Throwable th3 = this.LL.LIZJ;
            if (th3 != null) {
                message = th3.getMessage();
            } else {
                message = null;
            }
            sbLIZ4.append(message);
            sbLIZ4.append(", elapsedMs=");
            sbLIZ4.append(System.currentTimeMillis() - this.LLILZ);
            C2188811AlT.LIZIZ(sbLIZ4);
            C516180KMe c516180KMe2 = this.LLILZIL;
            C0KFM c0kfm3 = this.LLILZLL;
            int i3 = this.LLJ.element;
            Throwable th4 = this.LL.LIZJ;
            HashMap<String, Object> map3 = this.LLIZLLLIL;
            Function2<Integer, Throwable, Unit> function2 = this.LLJI;
            long j3 = this.LLILZ;
            String str8 = this.LLILLJJLI;
            int i4 = this.LLILLL.element;
            if (((ArrayList) c516180KMe2.LIZIZ).contains(str8)) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("QueryOrderRepo.onPollingFailed skip, reason=order_already_finished, contractId=");
                sbLIZ5.append(str8);
                sbLIZ5.append(", orderId=");
                sbLIZ5.append(str8);
                sbLIZ5.append(", detailCode=");
                sbLIZ5.append(i3);
                sbLIZ5.append(", retryCount=");
                sbLIZ5.append(i4);
                sbLIZ5.append(", throwable=");
                if (th4 != null) {
                    simpleName5 = th4.getClass().getSimpleName();
                } else {
                    simpleName5 = null;
                }
                sbLIZ5.append(simpleName5);
                sbLIZ5.append(", message=");
                if (th4 != null) {
                    message8 = th4.getMessage();
                } else {
                    message8 = null;
                }
                sbLIZ5.append(message8);
                C2188811AlT.LIZIZ(sbLIZ5);
            } else {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("QueryOrderRepo.onPollingFailed start, branch=check_order_fail, contractId=");
                sbLIZ6.append(str8);
                sbLIZ6.append(", orderId=");
                sbLIZ6.append(str8);
                sbLIZ6.append(", detailCode=");
                sbLIZ6.append(i3);
                sbLIZ6.append(", retryCount=");
                sbLIZ6.append(i4);
                sbLIZ6.append(", throwable=");
                if (th4 != null) {
                    simpleName2 = th4.getClass().getSimpleName();
                } else {
                    simpleName2 = null;
                }
                sbLIZ6.append(simpleName2);
                sbLIZ6.append(", message=");
                if (th4 != null) {
                    message2 = th4.getMessage();
                } else {
                    message2 = null;
                }
                sbLIZ6.append(message2);
                sbLIZ6.append(", elapsedMs=");
                sbLIZ6.append(System.currentTimeMillis() - j3);
                sbLIZ6.append(", logMap=");
                sbLIZ6.append(map3);
                C2188811AlT.LIZIZ(sbLIZ6);
                if (i3 == 41) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("QueryOrderRepo.onPollingFailed error_code_41, contractId=");
                    sbLIZ7.append(str8);
                    sbLIZ7.append(", orderId=");
                    sbLIZ7.append(str8);
                    sbLIZ7.append(", detailCode=");
                    sbLIZ7.append(i3);
                    sbLIZ7.append(", throwable=");
                    if (th4 != null) {
                        simpleName4 = th4.getClass().getSimpleName();
                    } else {
                        simpleName4 = null;
                    }
                    sbLIZ7.append(simpleName4);
                    sbLIZ7.append(", message=");
                    if (th4 != null) {
                        message7 = th4.getMessage();
                    } else {
                        message7 = null;
                    }
                    sbLIZ7.append(message7);
                    C2188811AlT.LIZIZ(sbLIZ7);
                }
                if (th4 != null) {
                    message3 = th4.getMessage();
                } else {
                    message3 = null;
                }
                Intrinsics.LJFF(message3, "retry reaches maximum");
                C0KN8 c0kn8LIZJ2 = C516180KMe.LIZJ(c516180KMe2, c0kfm3, str8, System.currentTimeMillis() - j3, i4, null, null, true, 112);
                c516180KMe2.LJ.getClass();
                C0KN9.LIZ(c0kn8LIZJ2);
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("QueryOrderRepo.onPollingFailed beforePayCallbackOnFail, contractId=");
                sbLIZ8.append(str8);
                sbLIZ8.append(", orderId=");
                sbLIZ8.append(str8);
                sbLIZ8.append(", detailCode=");
                sbLIZ8.append(i3);
                sbLIZ8.append(", payMessage=");
                String str9 = "unknown error in polling";
                if (th4 == null || (message4 = th4.getMessage()) == null) {
                    message4 = "unknown error in polling";
                }
                sbLIZ8.append(message4);
                C2188811AlT.LIZIZ(sbLIZ8);
                C0KLW c0klw = c0kfm3.LJJII;
                if (c0klw != null) {
                    if (th4 != null && (message6 = th4.getMessage()) != null) {
                        str9 = message6;
                    }
                    c0klw.onFail(i3, str9);
                }
                C0KNS.LIZIZ("ttlive_check_subscription", 41, i3, "check order fail", map3);
                function2.invoke(Integer.valueOf(i3), th4);
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("QueryOrderRepo.onPollingFailed afterOnCheckOrderFailed, contractId=");
                sbLIZ9.append(str8);
                sbLIZ9.append(", orderId=");
                sbLIZ9.append(str8);
                sbLIZ9.append(", detailCode=");
                sbLIZ9.append(i3);
                sbLIZ9.append(", throwable=");
                if (th4 != null) {
                    simpleName3 = th4.getClass().getSimpleName();
                } else {
                    simpleName3 = null;
                }
                sbLIZ9.append(simpleName3);
                sbLIZ9.append(", message=");
                if (th4 != null) {
                    message5 = th4.getMessage();
                } else {
                    message5 = null;
                }
                sbLIZ9.append(message5);
                C2188811AlT.LIZIZ(sbLIZ9);
                C516410KNb c516410KNb = C516410KNb.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - j3;
                String strValueOf = String.valueOf(th4);
                c516410KNb.getClass();
                try {
                    C0K77 c0k77LIZ2 = C516410KNb.LIZ();
                    if (c0k77LIZ2 != null) {
                        c0k77LIZ2.LJJIIJ(i3, jCurrentTimeMillis2, str8, strValueOf);
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    C189200o6.m2constructorimpl(new C098200Yq(th5));
                }
                C516050KLr c516050KLr2 = C516050KLr.LIZ;
                Integer numValueOf5 = Integer.valueOf(c0kfm3.LJIIZILJ);
                C0KM4 c0km4 = C0KM4.QUERY_ORDER_FAILED;
                c516050KLr2.getClass();
                C516050KLr.LIZJ(str8, numValueOf5, c0km4);
                C0KOJ c0koj2 = c0kfm3.LJJIII;
                if (c0koj2 != null) {
                    c0koj2.onSuccess(2, 0);
                }
            }
        }
        C0KNR c0knr = this.LL;
        C1C7U.LIZIZ("QueryOrderRepo@a26c.pollingCheckOrder$3");
        return c0knr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0KNR> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
