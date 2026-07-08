package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.pet.BaseStreakResponse;
import com.ss.android.ugc.aweme.im.streak.api.pet.LogPb;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetValue;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreaksPetInvitationAcceptResponse;
import com.ss.android.ugc.aweme.im.streak.impl.api.StreakPetApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06CC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.datasource.StreakPetDataSource$acceptStreaksPetInvitation$1", f = "StreakPetDataSource.kt", l = {199}, m = "invokeSuspend")
public final class C06CC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1569106Cj LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C06CI LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06CC(String str, C1569106Cj c1569106Cj, long j, long j2, String str2, C06CI c06ci, InterfaceC1364105Vn<? super C06CC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c1569106Cj;
        this.LLILZIL = j;
        this.LLILZLL = j2;
        this.LLIZ = str2;
        this.LLIZLLLIL = c06ci;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06CC c06cc = new C06CC(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c06cc.LLILLJJLI = obj;
        return c06cc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C0XIR c0xir;
        String errorMsg;
        Object rawResponse;
        BaseStreakResponse baseStreakResponse;
        String str;
        Integer numLJ;
        String errorMsg2;
        String response;
        LogPb logPb;
        StreakPetValue streakPetValue;
        long jLongValue;
        String str2;
        String str3;
        String str4;
        boolean z;
        Integer numLJ2;
        Integer num;
        LogPb logPb2;
        LogPb logPb3;
        Long l;
        Object objAcceptStreaksPetInvitation = obj;
        C1C7U.LIZ("StreakPetDataSource@55af.acceptStreaksPetInvitation$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objAcceptStreaksPetInvitation);
            } else {
                C155000ia.LIZIZ(objAcceptStreaksPetInvitation);
                String str5 = this.LLILLL;
                C1569106Cj c1569106Cj = this.LLILZ;
                int value = C1567806Bw.LIZJ(str5).getValue();
                StreakPetApi streakPetApi = StreakPetApi.LIZIZ;
                c1569106Cj.getClass();
                String strLIZJ = C1569106Cj.LIZJ(str5);
                this.LL = 1;
                objAcceptStreaksPetInvitation = streakPetApi.acceptStreaksPetInvitation(strLIZJ, str5, value, this);
                if (objAcceptStreaksPetInvitation == objLJFF) {
                    C1C7U.LIZIZ("StreakPetDataSource@55af.acceptStreaksPetInvitation$1");
                    return objLJFF;
                }
            }
            c098200Yq = (StreaksPetInvitationAcceptResponse) objAcceptStreaksPetInvitation;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str6 = this.LLILLL;
        C1569106Cj c1569106Cj2 = this.LLILZ;
        long j = this.LLILZIL;
        long j2 = this.LLILZLL;
        String str7 = this.LLIZ;
        C06CI c06ci = this.LLIZLLLIL;
        Integer numLJ3 = null;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            StreaksPetInvitationAcceptResponse streaksPetInvitationAcceptResponse = (StreaksPetInvitationAcceptResponse) c098200Yq;
            if (streaksPetInvitationAcceptResponse != null) {
                streakPetValue = streaksPetInvitationAcceptResponse.petValue;
            } else {
                streakPetValue = null;
            }
            if (streaksPetInvitationAcceptResponse != null && (l = streaksPetInvitationAcceptResponse.timestampMillis) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            StreakPetData streakPetDataLJIIIZ = C1571306Df.LJIIIZ(streakPetValue, str6, jLongValue);
            boolean z2 = C1590806Ks.LIZ;
            StringBuilder sb = new StringBuilder("acceptStreaksPetInvitation in success logid=");
            if (streaksPetInvitationAcceptResponse != null && (logPb3 = streaksPetInvitationAcceptResponse.logPb) != null) {
                str2 = logPb3.imprId;
            } else {
                str2 = null;
            }
            sb.append(str2);
            sb.append(" streakPetData=");
            sb.append(streakPetDataLJIIIZ);
            C1590806Ks.LIZ(sb.toString());
            if (streaksPetInvitationAcceptResponse != null) {
                str3 = streaksPetInvitationAcceptResponse.petFeUserData;
            } else {
                str3 = null;
            }
            boolean zBooleanValue = ((Boolean) C124200dc.LIZ.getValue()).booleanValue();
            C06CF c06cf = C06CF.LJI;
            if (streaksPetInvitationAcceptResponse != null && (logPb2 = streaksPetInvitationAcceptResponse.logPb) != null) {
                str4 = logPb2.imprId;
            } else {
                str4 = null;
            }
            c1569106Cj2.LIZ(streakPetDataLJIIIZ, str3, null, jLongValue, zBooleanValue, c06cf, str4);
            C06C6 c06c6 = c1569106Cj2.LIZJ;
            if (streaksPetInvitationAcceptResponse == null) {
                z = true;
            } else {
                z = false;
            }
            c06c6.getClass();
            C1572806Du.LL.nm(str6, str7, null, z, j, j2);
            if (streaksPetInvitationAcceptResponse != null) {
                numLJ2 = C2286608xc.LJ(streaksPetInvitationAcceptResponse.status_code);
            } else {
                numLJ2 = null;
            }
            if (streaksPetInvitationAcceptResponse != null) {
                num = streaksPetInvitationAcceptResponse.invitationSource;
            } else {
                num = null;
            }
            c06ci.LIZ(numLJ2, num);
        }
        C1569106Cj c1569106Cj3 = this.LLILZ;
        String str8 = this.LLILLL;
        long j3 = this.LLILZIL;
        long j4 = this.LLILZLL;
        String str9 = this.LLIZ;
        C06CI c06ci2 = this.LLIZLLLIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof C0XIR) {
                c0xir = (C0XIR) thM5exceptionOrNullimpl;
            } else {
                c0xir = null;
            }
            C06C6 c06c62 = c1569106Cj3.LIZJ;
            if (c0xir == null || (errorMsg = c0xir.getErrorMsg()) == null) {
                errorMsg = "";
            }
            c06c62.getClass();
            C1572806Du.LL.nm(str8, str9, errorMsg, true, j3, j4);
            C06CF c06cf2 = C06CF.LJI;
            if (c0xir != null) {
                rawResponse = c0xir.getRawResponse();
            } else {
                rawResponse = null;
            }
            if (rawResponse instanceof StreaksPetInvitationAcceptResponse) {
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
            boolean z3 = C1590806Ks.LIZ;
            StringBuilder sb2 = new StringBuilder("acceptStreaksPetInvitation in failure, errorCode=");
            if (c0xir != null) {
                numLJ = C2286608xc.LJ(c0xir.getErrorCode());
            } else {
                numLJ = null;
            }
            sb2.append(numLJ);
            sb2.append(", errorMsg=");
            if (c0xir != null) {
                errorMsg2 = c0xir.getErrorMsg();
            } else {
                errorMsg2 = null;
            }
            sb2.append(errorMsg2);
            sb2.append(", response=");
            if (c0xir != null) {
                response = c0xir.getResponse();
            } else {
                response = null;
            }
            sb2.append(response);
            sb2.append(", message=");
            sb2.append(thM5exceptionOrNullimpl.getMessage());
            C1590806Ks.LIZIZ(sb2.toString());
            if (c0xir != null) {
                numLJ3 = C2286608xc.LJ(c0xir.getErrorCode());
            }
            if (c0xir != null) {
                c0xir.getErrorMsg();
            }
            c06ci2.LIZIZ(numLJ3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetDataSource@55af.acceptStreaksPetInvitation$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
