package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.AttributionResponse;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.CmplRespForEncrypt;
import com.ss.android.ugc.aweme.legoImp.task.FirebaseConfigCheckTask;
import com.ss.android.ugc.aweme.legoImp.task.api.FirebaseReportApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10kt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19336510kt implements InterfaceC626120Oh8 {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(C19336510kt c19336510kt) {
    }

    public static final void onComplete$1(C19336510kt c19336510kt) {
    }

    public static final void onComplete$2(C19336510kt c19336510kt) {
    }

    public static final void onComplete$3(C19336510kt c19336510kt) {
    }

    public static final void onComplete$4(C19336510kt c19336510kt) {
    }

    public static final void onComplete$7(C19336510kt c19336510kt) {
    }

    public static final void onComplete$8(C19336510kt c19336510kt) {
    }

    public static final void onError$7(C19336510kt c19336510kt, Throwable th) {
    }

    public static final void onSubscribe$0(C19336510kt c19336510kt, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$1(C19336510kt c19336510kt, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$2(C19336510kt c19336510kt, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$3(C19336510kt c19336510kt, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$4(C19336510kt c19336510kt, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$5(C19336510kt c19336510kt, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$6(C19336510kt c19336510kt, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$7(C19336510kt c19336510kt, InterfaceC420801kM interfaceC420801kM) {
    }

    public static final void onSubscribe$8(C19336510kt c19336510kt, InterfaceC420801kM interfaceC420801kM) {
    }

    @Override // X.InterfaceC626120Oh8
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                break;
            case 1:
                onComplete$1(this);
                break;
            case 2:
                onComplete$2(this);
                break;
            case 3:
                onComplete$3(this);
                break;
            case 4:
                onComplete$4(this);
                break;
            case 5:
                onComplete$5(this);
                break;
            case 6:
                onComplete$6(this);
                break;
            case 7:
                onComplete$7(this);
                break;
            case 8:
                onComplete$8(this);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                break;
            case 1:
                onError$1(this, th);
                break;
            case 2:
                onError$2(this, th);
                break;
            case 3:
                onError$3(this, th);
                break;
            case 4:
                onError$4(this, th);
                break;
            case 5:
                onError$5(this, th);
                break;
            case 6:
                onError$6(this, th);
                break;
            case 7:
                onError$7(this, th);
                break;
            case 8:
                onError$8(this, th);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                break;
            case 1:
                onNext$1(this, obj);
                break;
            case 2:
                onNext$2(this, obj);
                break;
            case 3:
                onNext$3(this, obj);
                break;
            case 4:
                onNext$4(this, obj);
                break;
            case 5:
                onNext$5(this, obj);
                break;
            case 6:
                onNext$6(this, obj);
                break;
            case 7:
                onNext$7(this, obj);
                break;
            case 8:
                onNext$8(this, obj);
                break;
        }
    }

    @Override // X.InterfaceC626120Oh8
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC420801kM);
                break;
            case 1:
                onSubscribe$1(this, interfaceC420801kM);
                break;
            case 2:
                onSubscribe$2(this, interfaceC420801kM);
                break;
            case 3:
                onSubscribe$3(this, interfaceC420801kM);
                break;
            case 4:
                onSubscribe$4(this, interfaceC420801kM);
                break;
            case 5:
                onSubscribe$5(this, interfaceC420801kM);
                break;
            case 6:
                onSubscribe$6(this, interfaceC420801kM);
                break;
            case 7:
                onSubscribe$7(this, interfaceC420801kM);
                break;
            case 8:
                onSubscribe$8(this, interfaceC420801kM);
                break;
        }
    }

    public static final void onComplete$5(C19336510kt c19336510kt) {
        InterfaceC1900110zXt interfaceC1900110zXt = (InterfaceC1900110zXt) c19336510kt.l0;
        if (interfaceC1900110zXt != null) {
            interfaceC1900110zXt.LIZIZ(1);
        }
    }

    public static final void onComplete$6(C19336510kt c19336510kt) {
        InterfaceC1912070zrB interfaceC1912070zrB = (InterfaceC1912070zrB) c19336510kt.l0;
        if (interfaceC1912070zrB != null) {
            interfaceC1912070zrB.onSuccess();
        }
    }

    public C19336510kt(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$0(C19336510kt c19336510kt, Throwable th) {
        String strLIZIZ = "";
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(stackTraceElement);
            sbLIZ.append('\n');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        InterfaceC191808102c interfaceC191808102c = (InterfaceC191808102c) c19336510kt.l0;
        if (interfaceC191808102c != null) {
            interfaceC191808102c.LIZJ();
        }
    }

    public static final void onError$1(C19336510kt c19336510kt, Throwable th) {
        ((FirebaseConfigCheckTask) c19336510kt.l0).getClass();
        FirebaseConfigCheckTask.LJ(false);
    }

    public static final void onError$2(C19336510kt c19336510kt, Throwable th) {
        Function1 function1 = (Function1) c19336510kt.l0;
        if (function1 != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "100000";
            }
            function1.invoke(new C1898920zVy(message, null));
        }
    }

    public static final void onError$3(C19336510kt c19336510kt, Throwable th) {
        ((Function0) c19336510kt.l0).invoke();
    }

    public static final void onError$4(C19336510kt c19336510kt, Throwable th) {
        ((InterfaceC1896270zRh) c19336510kt.l0).onFail();
    }

    public static final void onError$5(C19336510kt c19336510kt, Throwable th) {
        InterfaceC1900110zXt interfaceC1900110zXt = (InterfaceC1900110zXt) c19336510kt.l0;
        if (interfaceC1900110zXt != null) {
            interfaceC1900110zXt.LIZ(th);
        }
    }

    public static final void onError$6(C19336510kt c19336510kt, Throwable th) {
        InterfaceC1912070zrB interfaceC1912070zrB = (InterfaceC1912070zrB) c19336510kt.l0;
        if (interfaceC1912070zrB != null) {
            interfaceC1912070zrB.onFail();
        }
    }

    public static final void onError$8(C19336510kt c19336510kt, Throwable th) {
        InterfaceC19270010aA interfaceC19270010aA = ((C19269910a9) c19336510kt.l0).LIZJ;
        if (interfaceC19270010aA != null) {
            interfaceC19270010aA.Fa2(th);
        }
    }

    public static final void onNext$0(C19336510kt c19336510kt, Object obj) {
        CmplRespForEncrypt cmplRespForEncrypt = (CmplRespForEncrypt) obj;
        if (cmplRespForEncrypt.status_code == 0) {
            C102U c102u = C102U.LIZ;
            String complianceEncrypt = cmplRespForEncrypt.getComplianceEncrypt();
            c102u.getClass();
            C102T c102t = C102U.LIZJ;
            c102t.LJI = complianceEncrypt;
            c102t.LIZIZ.storeString("cmpl_enc", complianceEncrypt);
            InterfaceC191808102c interfaceC191808102c = (InterfaceC191808102c) c19336510kt.l0;
            if (interfaceC191808102c != null) {
                interfaceC191808102c.onSuccess();
                return;
            }
            return;
        }
        InterfaceC191808102c interfaceC191808102c2 = (InterfaceC191808102c) c19336510kt.l0;
        if (interfaceC191808102c2 == null) {
            return;
        }
        interfaceC191808102c2.LIZJ();
    }

    public static final void onNext$1(C19336510kt c19336510kt, Object obj) {
        FirebaseReportApi.ForceLoginConfigResponse forceLoginConfigResponse = (FirebaseReportApi.ForceLoginConfigResponse) obj;
        FirebaseConfigCheckTask firebaseConfigCheckTask = (FirebaseConfigCheckTask) c19336510kt.l0;
        boolean z = forceLoginConfigResponse.data.userInForceLoginCountry;
        firebaseConfigCheckTask.getClass();
        FirebaseConfigCheckTask.LJ(z);
        ((Keva) ((FirebaseConfigCheckTask) c19336510kt.l0).LL.getValue()).storeBoolean("user_in_forced_login", forceLoginConfigResponse.data.userInForceLoginCountry);
        ((Keva) ((FirebaseConfigCheckTask) c19336510kt.l0).LL.getValue()).storeLong("last_request_time", System.currentTimeMillis());
    }

    public static final void onNext$2(C19336510kt c19336510kt, Object obj) {
        Function1 function1 = (Function1) c19336510kt.l0;
        if (function1 != null) {
            function1.invoke(obj);
        }
    }

    public static final void onNext$3(C19336510kt c19336510kt, Object obj) {
        int i = ((AttributionResponse) obj).action;
        if (i == 1) {
            C1895370zQF.LIZIZ(C1895370zQF.LIZ, 11);
        } else if (i != 3 && i != 4) {
            ((Function0) c19336510kt.l0).invoke();
        } else {
            C1895370zQF.LIZIZ(C1895370zQF.LIZ, 11);
            ((Function0) c19336510kt.l0).invoke();
        }
    }

    public static final void onNext$4(C19336510kt c19336510kt, Object obj) {
        AttributionResponse attributionResponse = (AttributionResponse) obj;
        int i = attributionResponse.action;
        if (i == 2) {
            ((InterfaceC1896270zRh) c19336510kt.l0).LIZ(attributionResponse);
        } else if (i == 4) {
            ((InterfaceC1896270zRh) c19336510kt.l0).LIZ(attributionResponse);
            C1895370zQF.LIZIZ(C1895370zQF.LIZ, 11);
        } else {
            ((InterfaceC1896270zRh) c19336510kt.l0).onFail();
        }
    }

    public static final void onNext$5(C19336510kt c19336510kt, Object obj) {
        if (((Number) obj).intValue() > 0) {
            c19336510kt.onComplete();
        } else {
            c19336510kt.onError(new Throwable("UNKNOWN EXCEPTIION"));
        }
    }

    public static final void onNext$6(C19336510kt c19336510kt, Object obj) {
        if (((Number) obj).intValue() > 0) {
            c19336510kt.onComplete();
        } else {
            c19336510kt.onError(new Throwable("UNKNOWN EXCEPTIION"));
        }
    }

    public static final void onNext$7(C19336510kt c19336510kt, Object obj) {
        AbstractC1912190zrN abstractC1912190zrN = (AbstractC1912190zrN) c19336510kt.l0;
        abstractC1912190zrN.LLJILJILJ = true;
        Function0<Unit> function0 = abstractC1912190zrN.LLILZLL.LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onNext$8(C19336510kt c19336510kt, Object obj) {
        InterfaceC19270010aA interfaceC19270010aA;
        if (((BaseResponse) obj).status_code == 0 && (interfaceC19270010aA = ((C19269910a9) c19336510kt.l0).LIZJ) != null) {
            interfaceC19270010aA.A();
        }
    }
}
