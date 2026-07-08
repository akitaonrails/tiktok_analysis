package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.pet.BaseStreakResponse;
import com.ss.android.ugc.aweme.im.streak.api.pet.LogPb;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetInfoUpdateResponse;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetValue;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreaksPetUpdateResponse;
import com.ss.android.ugc.aweme.im.streak.impl.api.StreakPetApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06CB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.datasource.StreakPetDataSource$updateStreaksPetInfo$1", f = "StreakPetDataSource.kt", l = {305}, m = "invokeSuspend")
public final class C06CB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ C1569106Cj LLIZ;
    public final /* synthetic */ C06CH LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06CB(int i, String str, String str2, int i2, C1569106Cj c1569106Cj, C06CH c06ch, InterfaceC1364105Vn<? super C06CB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = i2;
        this.LLIZ = c1569106Cj;
        this.LLIZLLLIL = c06ch;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06CB c06cb = new C06CB(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c06cb.LLILLJJLI = obj;
        return c06cb;
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
        String str4;
        Integer numLJ3;
        String str5;
        LogPb logPb2;
        Long l;
        Object objUpdateStreakPetInfo = obj;
        C1C7U.LIZ("StreakPetDataSource@55af.updateStreaksPetInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objUpdateStreakPetInfo);
            } else {
                C155000ia.LIZIZ(objUpdateStreakPetInfo);
                int i2 = this.LLILLL;
                String str6 = this.LLILZ;
                String str7 = this.LLILZIL;
                int i3 = this.LLILZLL;
                StreakPetApi streakPetApi = StreakPetApi.LIZIZ;
                this.LL = 1;
                objUpdateStreakPetInfo = streakPetApi.updateStreakPetInfo(i2, str6, str7, i3, this);
                if (objUpdateStreakPetInfo == objLJFF) {
                    C1C7U.LIZIZ("StreakPetDataSource@55af.updateStreaksPetInfo$1");
                    return objLJFF;
                }
            }
            c098200Yq = (StreakPetInfoUpdateResponse) objUpdateStreakPetInfo;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str8 = this.LLILZIL;
        C1569106Cj c1569106Cj = this.LLIZ;
        C06CH c06ch = this.LLIZLLLIL;
        String str9 = "";
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            StreakPetInfoUpdateResponse streakPetInfoUpdateResponse = (StreakPetInfoUpdateResponse) c098200Yq;
            if (streakPetInfoUpdateResponse != null) {
                streakPetValue = streakPetInfoUpdateResponse.petValue;
            } else {
                streakPetValue = null;
            }
            if (streakPetInfoUpdateResponse != null && (l = streakPetInfoUpdateResponse.timestampMillis) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (streakPetInfoUpdateResponse == null || (str2 = streakPetInfoUpdateResponse.sceneResponseBody) == null) {
                str2 = "";
            }
            StreakPetData streakPetDataLJIIIZ = C1571306Df.LJIIIZ(streakPetValue, str8, jLongValue);
            if (streakPetInfoUpdateResponse != null) {
                str3 = streakPetInfoUpdateResponse.petFeUserData;
            } else {
                str3 = null;
            }
            C06CF c06cf = C06CF.LJIIIIZZ;
            if (streakPetInfoUpdateResponse != null && (logPb2 = streakPetInfoUpdateResponse.logPb) != null) {
                str4 = logPb2.imprId;
            } else {
                str4 = null;
            }
            c1569106Cj.LIZ(streakPetDataLJIIIZ, str3, null, jLongValue, true, c06cf, str4);
            C1569106Cj.LIZLLL(str8);
            if (streakPetInfoUpdateResponse != null) {
                numLJ3 = C2286608xc.LJ(streakPetInfoUpdateResponse.status_code);
            } else {
                numLJ3 = null;
            }
            if (streakPetInfoUpdateResponse == null || (str5 = streakPetInfoUpdateResponse.status_msg) == null) {
                str5 = "";
            }
            c06ch.LIZIZ(streakPetDataLJIIIZ, numLJ3, str5, str2);
        }
        C06CH c06ch2 = this.LLIZLLLIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof C0XIR) {
                c0xir = (C0XIR) thM5exceptionOrNullimpl;
            } else {
                c0xir = null;
            }
            C06CF c06cf2 = C06CF.LJIIIIZZ;
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
            boolean z = C1590806Ks.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateStreaksPetInfo in failure, errorCode=");
            if (c0xir != null) {
                numLJ = C2286608xc.LJ(c0xir.getErrorCode());
            } else {
                numLJ = null;
            }
            sbLIZ.append(numLJ);
            sbLIZ.append(", errorMsg=");
            if (c0xir != null) {
                errorMsg = c0xir.getErrorMsg();
            } else {
                errorMsg = null;
            }
            sbLIZ.append(errorMsg);
            sbLIZ.append(", response=");
            if (c0xir != null) {
                response = c0xir.getResponse();
            } else {
                response = null;
            }
            sbLIZ.append(response);
            sbLIZ.append(", message=");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            C1590806Ks.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (c0xir != null) {
                numLJ2 = C2286608xc.LJ(c0xir.getErrorCode());
            } else {
                numLJ2 = null;
            }
            if (c0xir != null && (errorMsg2 = c0xir.getErrorMsg()) != null) {
                str9 = errorMsg2;
            }
            c06ch2.LIZ(numLJ2, str9);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetDataSource@55af.updateStreaksPetInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
