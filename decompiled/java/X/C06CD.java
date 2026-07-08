package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.pet.BaseStreakResponse;
import com.ss.android.ugc.aweme.im.streak.api.pet.LogPb;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetValue;
import com.ss.android.ugc.aweme.im.streak.impl.api.StreakPetApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06CD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.datasource.StreakPetDataSource$deleteStreaksPet$1", f = "StreakPetDataSource.kt", l = {152}, m = "invokeSuspend")
public final class C06CD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1569106Cj LLILZ;
    public final /* synthetic */ C06CJ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06CD(String str, C1569106Cj c1569106Cj, C06CJ c06cj, InterfaceC1364105Vn<? super C06CD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c1569106Cj;
        this.LLILZIL = c06cj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06CD c06cd = new C06CD(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c06cd.LLILLJJLI = obj;
        return c06cd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C0XIR c0xir;
        Object rawResponse;
        BaseStreakResponse baseStreakResponse;
        String str;
        Integer numLJ;
        String errorMsg;
        String response;
        Integer numLJ2;
        String errorMsg2;
        LogPb logPb;
        StreakPetValue streakPetValue;
        long jLongValue;
        String str2;
        String str3;
        Integer numLJ3;
        String str4;
        LogPb logPb2;
        LogPb logPb3;
        Long l;
        Object objDeleteStreaksPet = obj;
        C1C7U.LIZ("StreakPetDataSource@55af.deleteStreaksPet$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objDeleteStreaksPet);
            } else {
                C155000ia.LIZIZ(objDeleteStreaksPet);
                String str5 = this.LLILLL;
                C1569106Cj c1569106Cj = this.LLILZ;
                int value = C1567806Bw.LIZJ(str5).getValue();
                StreakPetApi streakPetApi = StreakPetApi.LIZIZ;
                c1569106Cj.getClass();
                String strLIZJ = C1569106Cj.LIZJ(str5);
                this.LL = 1;
                objDeleteStreaksPet = streakPetApi.deleteStreaksPet(strLIZJ, str5, value, this);
                if (objDeleteStreaksPet == objLJFF) {
                    C1C7U.LIZIZ("StreakPetDataSource@55af.deleteStreaksPet$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C066Z) objDeleteStreaksPet;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str6 = this.LLILLL;
        C1569106Cj c1569106Cj2 = this.LLILZ;
        C06CJ c06cj = this.LLILZIL;
        String str7 = "";
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            BaseStreakResponse baseStreakResponse2 = (BaseStreakResponse) c098200Yq;
            if (baseStreakResponse2 != null) {
                streakPetValue = baseStreakResponse2.petValue;
            } else {
                streakPetValue = null;
            }
            if (baseStreakResponse2 != null && (l = baseStreakResponse2.timestampMillis) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            StreakPetData streakPetDataLJIIIZ = C1571306Df.LJIIIZ(streakPetValue, str6, jLongValue);
            boolean z = C1590806Ks.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deleteStreaksPet in success logid=");
            if (baseStreakResponse2 != null && (logPb3 = baseStreakResponse2.logPb) != null) {
                str2 = logPb3.imprId;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            sbLIZ.append(" streakPetData=");
            sbLIZ.append(streakPetDataLJIIIZ);
            C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            boolean zBooleanValue = ((Boolean) C124200dc.LIZ.getValue()).booleanValue();
            C06CF c06cf = C06CF.LJFF;
            if (baseStreakResponse2 != null && (logPb2 = baseStreakResponse2.logPb) != null) {
                str3 = logPb2.imprId;
            } else {
                str3 = null;
            }
            c1569106Cj2.LIZ(streakPetDataLJIIIZ, null, null, jLongValue, zBooleanValue, c06cf, str3);
            c1569106Cj2.LIZJ.getClass();
            C1572806Du.LL.k9(streakPetDataLJIIIZ);
            if (baseStreakResponse2 != null) {
                numLJ3 = C2286608xc.LJ(baseStreakResponse2.status_code);
            } else {
                numLJ3 = null;
            }
            if (baseStreakResponse2 == null || (str4 = baseStreakResponse2.status_msg) == null) {
                str4 = "";
            }
            c06cj.LIZIZ(numLJ3, str4);
        }
        C06CJ c06cj2 = this.LLILZIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof C0XIR) {
                c0xir = (C0XIR) thM5exceptionOrNullimpl;
            } else {
                c0xir = null;
            }
            C06CF c06cf2 = C06CF.LJFF;
            if (c0xir != null) {
                rawResponse = c0xir.getRawResponse();
            } else {
                rawResponse = null;
            }
            if (rawResponse instanceof C066Z) {
                baseStreakResponse = (BaseStreakResponse) rawResponse;
            } else {
                baseStreakResponse = null;
            }
            if (baseStreakResponse != null && (logPb = baseStreakResponse.logPb) != null) {
                str = logPb.imprId;
            } else {
                str = null;
            }
            C06C6.LIZJ(null, null, 0L, false, c06cf2, str);
            boolean z2 = C1590806Ks.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("deleteStreaksPet in failure, errorCode=");
            if (c0xir != null) {
                numLJ = C2286608xc.LJ(c0xir.getErrorCode());
            } else {
                numLJ = null;
            }
            sbLIZ2.append(numLJ);
            sbLIZ2.append(", errorMsg=");
            if (c0xir != null) {
                errorMsg = c0xir.getErrorMsg();
            } else {
                errorMsg = null;
            }
            sbLIZ2.append(errorMsg);
            sbLIZ2.append(", response=");
            if (c0xir != null) {
                response = c0xir.getResponse();
            } else {
                response = null;
            }
            sbLIZ2.append(response);
            sbLIZ2.append(", message=");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C1590806Ks.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            if (c0xir != null) {
                numLJ2 = C2286608xc.LJ(c0xir.getErrorCode());
            } else {
                numLJ2 = null;
            }
            if (c0xir != null && (errorMsg2 = c0xir.getErrorMsg()) != null) {
                str7 = errorMsg2;
            }
            c06cj2.LIZ(numLJ2, str7);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetDataSource@55af.deleteStreaksPet$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
