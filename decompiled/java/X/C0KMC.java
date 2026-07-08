package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS237S0000000_7;
import njp.a;
import org.json.JSONObject;
import webcast.api.sub.RecoverContractInAppResponse;

/* JADX INFO: renamed from: X.0KMC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.payment.v2.implement.productfetch.ResubscribeStrategy$resubscribe$1$recoverContract$1", f = "ResubscribeStrategy.kt", l = {116}, m = "invokeSuspend")
public final class C0KMC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<RecoverContractInAppResponse.RecoverContractInAppResult>>, Object> {
    public int LL;
    public final /* synthetic */ C0KMN LLILLJJLI;
    public final /* synthetic */ C0KJX LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KMC(C0KMN c0kmn, C0KJX c0kjx, String str, InterfaceC1364105Vn<? super C0KMC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0kmn;
        this.LLILLL = c0kjx;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KMC(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("ResubscribeStrategy@84ad.resubscribe$1$recoverContract$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            final C0KMN c0kmn = this.LLILLJJLI;
            final C0KJX c0kjx = this.LLILLL;
            String str = c0kmn.LIZIZ;
            String str2 = this.LLILZ;
            this.LL = 1;
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C480460Ism.LIZ().getClass();
            C510380Jzw.LJIILJJIL(((IapApi) C480460Ism.LIZLLL(IapApi.class)).resubscribeOrder(c0kjx.LIZ, str, str2), EnumC510330Jzr.GENERAL, C0KMN.class.getSimpleName(), "/webcast/sub/contract/recover_in_app/", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0KMD
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    String strOptString;
                    C1C7U.LIZ("ResubscribeStrategy@84ad.tryRecoverContract$2$1");
                    BaseResponse baseResponse = (BaseResponse) obj2;
                    InterfaceC1364105Vn<C470590Icr<RecoverContractInAppResponse.RecoverContractInAppResult>> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(baseResponse);
                    interfaceC1364105Vn.resumeWith(baseResponse);
                    try {
                        strOptString = new JSONObject(((RecoverContractInAppResponse.RecoverContractInAppResult) baseResponse.data).inAppRequest).optString("order_id");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (strOptString == null) {
                        strOptString = "";
                    }
                    C0KM7 c0km7LIZ = C0W0R.LIZ(c0kjx.LJIIIZ);
                    C516010KLn c516010KLn = C516010KLn.LIZ;
                    String str3 = c0kmn.LIZ;
                    c516010KLn.getClass();
                    String str4 = strOptString;
                    C516010KLn.LJIILIIL(true, str4, "recover_sub", str3, c0km7LIZ, null);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    String str5 = c0kmn.LIZ;
                    c516010KLn.getClass();
                    C516010KLn.LJIILJJIL(true, str4, jCurrentTimeMillis2, "recover_sub", str5, c0km7LIZ, 0, null);
                    C516010KLn.LJIIIZ(true, str4, "recover_sub", c0kmn.LIZ, c0km7LIZ, null);
                    C1C7U.LIZIZ("ResubscribeStrategy@84ad.tryRecoverContract$2$1");
                }
            }, new C09JN() { // from class: X.0KMB
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    String logId;
                    C501470JlZ c501470JlZ;
                    C1C7U.LIZ("ResubscribeStrategy@84ad.tryRecoverContract$2$2");
                    Throwable th = (Throwable) obj2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("recover_in_app failed, throwable=");
                    sbLIZ.append(th);
                    sbLIZ.append(" logid=");
                    if ((th instanceof C477520Io2) && (c501470JlZ = (C501470JlZ) th) != null) {
                        logId = c501470JlZ.getLogId();
                    } else {
                        logId = null;
                    }
                    sbLIZ.append(logId);
                    C20441214yg.LIZIZ("ResubscribeStrategy", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1364105Vn<C470590Icr<RecoverContractInAppResponse.RecoverContractInAppResult>> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn.resumeWith(null);
                    C501540Jlg.LIZJ(c0kjx.LJIIIZ, th);
                    C0KM7 c0km7LIZ = C0W0R.LIZ(c0kjx.LJIIIZ);
                    C516010KLn c516010KLn = C516010KLn.LIZ;
                    String str3 = c0kmn.LIZ;
                    c516010KLn.getClass();
                    C516010KLn.LJIILIIL(true, "", "recover_sub", str3, c0km7LIZ, null);
                    c516010KLn.LJIIJJI(true, System.currentTimeMillis(), C512300K7g.LIZIZ(th), "recover_sub", c0kmn.LIZ, c0km7LIZ, 0, C512300K7g.LIZJ(th), th, null);
                    C1C7U.LIZIZ("ResubscribeStrategy@84ad.tryRecoverContract$2$2");
                }
            });
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("ResubscribeStrategy@84ad.resubscribe$1$recoverContract$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ResubscribeStrategy@84ad.resubscribe$1$recoverContract$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C470590Icr<RecoverContractInAppResponse.RecoverContractInAppResult>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
