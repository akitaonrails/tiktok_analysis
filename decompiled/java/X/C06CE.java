package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.pet.BaseStreakResponse;
import com.ss.android.ugc.aweme.im.streak.api.pet.LogPb;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetValue;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreaksPetUpdateResponse;
import com.ss.android.ugc.aweme.im.streak.impl.api.StreakPetApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06CE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.datasource.StreakPetDataSource$updateStreaksPetName$1", f = "StreakPetDataSource.kt", l = {259}, m = "invokeSuspend")
public final class C06CE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1569106Cj LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C06CJ LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06CE(String str, C1569106Cj c1569106Cj, String str2, C06CJ c06cj, InterfaceC1364105Vn<? super C06CE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c1569106Cj;
        this.LLILZIL = str2;
        this.LLILZLL = c06cj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06CE c06ce = new C06CE(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c06ce.LLILLJJLI = obj;
        return c06ce;
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
        String errorMsg2;
        LogPb logPb;
        StreakPetValue streakPetValue;
        long jLongValue;
        String str2;
        String str3;
        String str4;
        Integer numLJ2;
        String str5;
        LogPb logPb2;
        LogPb logPb3;
        Long l;
        Object objUpdateStreaksPet = obj;
        C1C7U.LIZ("StreakPetDataSource@55af.updateStreaksPetName$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objUpdateStreaksPet);
            } else {
                C155000ia.LIZIZ(objUpdateStreaksPet);
                String str6 = this.LLILLL;
                C1569106Cj c1569106Cj = this.LLILZ;
                String str7 = this.LLILZIL;
                int value = C1567806Bw.LIZJ(str6).getValue();
                StreakPetApi streakPetApi = StreakPetApi.LIZIZ;
                c1569106Cj.getClass();
                String strLIZJ = C1569106Cj.LIZJ(str6);
                this.LL = 1;
                objUpdateStreaksPet = streakPetApi.updateStreaksPet(strLIZJ, str7, str6, value, this);
                if (objUpdateStreaksPet == objLJFF) {
                    C1C7U.LIZIZ("StreakPetDataSource@55af.updateStreaksPetName$1");
                    return objLJFF;
                }
            }
            c098200Yq = (StreaksPetUpdateResponse) objUpdateStreaksPet;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str8 = this.LLILLL;
        C1569106Cj c1569106Cj2 = this.LLILZ;
        C06CJ c06cj = this.LLILZLL;
        String str9 = "";
        Integer numLJ3 = null;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            StreaksPetUpdateResponse streaksPetUpdateResponse = (StreaksPetUpdateResponse) c098200Yq;
            if (streaksPetUpdateResponse != null) {
                streakPetValue = streaksPetUpdateResponse.petValue;
            } else {
                streakPetValue = null;
            }
            if (streaksPetUpdateResponse != null && (l = streaksPetUpdateResponse.timestampMillis) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            StreakPetData streakPetDataLJIIIZ = C1571306Df.LJIIIZ(streakPetValue, str8, jLongValue);
            boolean z = C1590806Ks.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateStreaksPetName in success logid=");
            if (streaksPetUpdateResponse != null && (logPb3 = streaksPetUpdateResponse.logPb) != null) {
                str2 = logPb3.imprId;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            sbLIZ.append(" streakPetData=");
            sbLIZ.append(streakPetDataLJIIIZ);
            C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (streaksPetUpdateResponse != null) {
                str3 = streaksPetUpdateResponse.petFeUserData;
            } else {
                str3 = null;
            }
            boolean zBooleanValue = ((Boolean) C124200dc.LIZ.getValue()).booleanValue();
            C06CF c06cf = C06CF.LJII;
            if (streaksPetUpdateResponse != null && (logPb2 = streaksPetUpdateResponse.logPb) != null) {
                str4 = logPb2.imprId;
            } else {
                str4 = null;
            }
            c1569106Cj2.LIZ(streakPetDataLJIIIZ, str3, null, jLongValue, zBooleanValue, c06cf, str4);
            if (streaksPetUpdateResponse != null) {
                numLJ2 = C2286608xc.LJ(streaksPetUpdateResponse.status_code);
            } else {
                numLJ2 = null;
            }
            if (streaksPetUpdateResponse == null || (str5 = streaksPetUpdateResponse.status_msg) == null) {
                str5 = "";
            }
            c06cj.LIZIZ(numLJ2, str5);
        }
        C06CJ c06cj2 = this.LLILZLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof C0XIR) {
                c0xir = (C0XIR) thM5exceptionOrNullimpl;
            } else {
                c0xir = null;
            }
            C06CF c06cf2 = C06CF.LJII;
            if (c0xir != null) {
                rawResponse = c0xir.getRawResponse();
            } else {
                rawResponse = null;
            }
            if (rawResponse instanceof StreaksPetUpdateResponse) {
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
            sbLIZ2.append("updateStreaksPetName in failure, errorCode=");
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
                numLJ3 = C2286608xc.LJ(c0xir.getErrorCode());
            }
            if (c0xir != null && (errorMsg2 = c0xir.getErrorMsg()) != null) {
                str9 = errorMsg2;
            }
            c06cj2.LIZ(numLJ3, str9);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetDataSource@55af.updateStreaksPetName$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
