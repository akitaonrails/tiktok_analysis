package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.viewmodel.ProfileIdentifierViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08s9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.viewmodel.ProfileIdentifierViewModel$getIdentifierDetails$1$2", f = "ProfileIdentifierViewModel.kt", l = {53}, m = "invokeSuspend")
public final class C2252708s9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ ProfileIdentifierViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2252708s9(ProfileIdentifierViewModel profileIdentifierViewModel, String str, String str2, int i, InterfaceC1364105Vn<? super C2252708s9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = profileIdentifierViewModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2252708s9(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        Object c098200Yq;
        String message;
        Object c098200Yq2;
        String strLIZJ;
        Object c098200Yq3;
        int iIntValue;
        int iLJ;
        C1C7U.LIZ("ProfileIdentifierViewModel@fdc2.getIdentifierDetails$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            ProfileIdentifierViewModel profileIdentifierViewModel = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            int i2 = this.LLILZLL;
            try {
                this.LL = jCurrentTimeMillis;
                this.LLILLJJLI = 1;
                if (profileIdentifierViewModel.vQ2(jCurrentTimeMillis, i2, str, str2, this) == objLJFF) {
                    C1C7U.LIZIZ("ProfileIdentifierViewModel@fdc2.getIdentifierDetails$1$2");
                    return objLJFF;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        ProfileIdentifierViewModel profileIdentifierViewModel2 = this.LLILLL;
        String str3 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            profileIdentifierViewModel2.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getIdentifierDetails fail. e:");
            Throwable cause = thM5exceptionOrNullimpl.getCause();
            Integer numValueOf = null;
            Object obj2 = null;
            if (cause != null) {
                message = cause.getMessage();
            } else {
                message = null;
            }
            sbLIZ.append(message);
            C1720106oR.LIZ("ProfileIdentifierViewModel", C2188811AlT.LIZIZ(sbLIZ));
            profileIdentifierViewModel2.setState(new AwS582S0100000_3(thM5exceptionOrNullimpl, 171));
            boolean z = thM5exceptionOrNullimpl instanceof C0XIR;
            if (!z) {
                strLIZJ = null;
            } else {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(((C0XIR) thM5exceptionOrNullimpl).getResponse()).optJSONObject("log_pb");
                    if (jSONObjectOptJSONObject != null) {
                        c098200Yq2 = JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject, "impr_id");
                    } else {
                        c098200Yq2 = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq2 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = null;
                }
                strLIZJ = (String) c098200Yq2;
            }
            if (strLIZJ == null) {
                strLIZJ = C2252408s6.LIZJ(thM5exceptionOrNullimpl);
            }
            if (z) {
                try {
                    c098200Yq3 = Integer.valueOf(JSONObjectProtectorUtils.getInt(new JSONObject(((C0XIR) thM5exceptionOrNullimpl).getResponse()), "status_code"));
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    c098200Yq3 = new C098200Yq(th4);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq3)) {
                    obj2 = c098200Yq3;
                }
                Integer num = (Integer) obj2;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                numValueOf = Integer.valueOf(iIntValue);
            }
            if (numValueOf != null) {
                iLJ = numValueOf.intValue();
            } else {
                iLJ = C2252408s6.LJ(thM5exceptionOrNullimpl);
            }
            C01XQ.LIZIZ(iLJ, str3, strLIZJ, System.currentTimeMillis() - jCurrentTimeMillis, "fail");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileIdentifierViewModel@fdc2.getIdentifierDetails$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
