package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.billingclient.api.ProxyBillingActivity;
import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.iap.google.state.GooglePayState;
import com.bytedance.globalpayment.iap.google.state.GooglePaymentHandlerV2;
import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1794670wnp implements InterfaceC1795750wpZ {
    public final C1794660wno LIZ;
    public C1795840wpi LIZIZ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final C1794480wnW LJI;
    public final C1793950wmf LJII;
    public Message LJIIIIZZ;
    public final /* synthetic */ GooglePayState LJIIJ;
    public final GooglePaymentHandlerV2 LJIIIZ = GooglePaymentHandlerV2.LIZ;
    public final C1794680wnq LIZJ = new Application.ActivityLifecycleCallbacks() { // from class: X.0wnq
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (activity.getClass() == ProxyBillingActivity.class) {
                C1794480wnW c1794480wnW = this.LL.LJIIJ.LIZ;
                if (c1794480wnW != null) {
                    c1794480wnW.LJIIZILJ = SystemClock.uptimeMillis();
                }
                C1794660wno c1794660wno = this.LL.LIZ;
                c1794660wno.getClass();
                c1794660wno.LIZJ = SystemClock.uptimeMillis();
                c1794660wno.LJFF("GooglePanelDismiss");
                GooglePaymentHandlerV2 googlePaymentHandlerV2 = this.LL.LJIIIZ;
                EnumC1794760wny enumC1794760wny = EnumC1794760wny.CASHIER_DESTROY;
                googlePaymentHandlerV2.getClass();
                GooglePaymentHandlerV2.LIZ(enumC1794760wny);
                if (((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LIZIZ > 0) {
                    this.LL.LJIIIIZZ = Message.obtain();
                    C1794670wnp c1794670wnp = this.LL;
                    Message message = c1794670wnp.LJIIIIZZ;
                    message.what = 1435;
                    message.obj = c1794670wnp.LJII;
                    c1794670wnp.LJIIJ.LJ.sendMessageDelayed(message, ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LIZIZ);
                }
                RestoreOrderService.getIns(this.LL.LJIIJ.LIZLLL).onGooglePanelDismiss(this.LL.LJI);
                C1794670wnp c1794670wnp2 = this.LL;
                Activity activity2 = c1794670wnp2.LJIIJ.LIZLLL;
                if (activity2 != null) {
                    if (c1794670wnp2.LJFF) {
                        activity2.getApplication().unregisterActivityLifecycleCallbacks(c1794670wnp2.LIZJ);
                        c1794670wnp2.LJFF = false;
                    }
                    c1794670wnp2.LJIIJ.LIZLLL = null;
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            if (activity.getClass() == ProxyBillingActivity.class) {
                GooglePaymentHandlerV2 googlePaymentHandlerV2 = this.LL.LJIIIZ;
                EnumC1794760wny enumC1794760wny = EnumC1794760wny.CASHIER_RESUME;
                googlePaymentHandlerV2.getClass();
                GooglePaymentHandlerV2.LIZ(enumC1794760wny);
                C1794480wnW c1794480wnW = this.LL.LJIIJ.LIZ;
                if (c1794480wnW != null) {
                    c1794480wnW.LJIILLIIL = SystemClock.uptimeMillis();
                }
                C1794660wno c1794660wno = this.LL.LIZ;
                c1794660wno.getClass();
                c1794660wno.LIZIZ = SystemClock.uptimeMillis();
                c1794660wno.LJFF("GooglePanelShow");
                this.LL.LJ = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C1794660wno c1794660wno = this.LL.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("billing_app_lifecycle_on_start_");
            sbLIZ.append(activity.getClass().getSimpleName());
            c1794660wno.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C1794660wno c1794660wno = this.LL.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("billing_app_lifecycle_on_stop_");
            sbLIZ.append(activity.getClass().getSimpleName());
            c1794660wno.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    };

    @Override // X.InterfaceC1795750wpZ
    public final Activity LJI() {
        return this.LJIIJ.LIZLLL;
    }

    @Override // X.InterfaceC1795750wpZ
    public final void LJII() {
        Activity activity = this.LJIIJ.LIZLLL;
        if (activity == null || this.LJFF) {
            return;
        }
        this.LJFF = true;
        activity.getApplication().registerActivityLifecycleCallbacks(this.LIZJ);
    }

    @Override // X.InterfaceC1795750wpZ
    public final void LJIIJ() {
        this.LIZLLL++;
    }

    @Override // X.InterfaceC1795750wpZ
    public final void LJIIL() {
        this.LIZ.getClass();
        InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
        c1794310wnF.getClass();
        C1794940woG.LIZ(c1794310wnF, enumC1794330wnH, "livesdk_iap_retry_attempt_start", null);
    }

    @Override // X.InterfaceC1795750wpZ
    public final int LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1795750wpZ
    public final C1795840wpi LJFF() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1795750wpZ
    public final boolean LJIIIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1795750wpZ
    public final void LIZIZ(C1795840wpi c1795840wpi) {
        this.LIZIZ = c1795840wpi;
        this.LIZLLL = -1;
        this.LJ = false;
    }

    @Override // X.InterfaceC1795750wpZ
    public final void LIZLLL(C19885612rG c19885612rG) {
        boolean z;
        boolean z2;
        this.LIZ.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z3 = true;
            if (c19885612rG == null) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("retry_billing_result_is_null", z);
            jSONObject.put("retry_count", this.LIZLLL);
            jSONObject.put("has_popped_billing_flow", this.LJ);
            if (this.LJIIJ.LIZLLL == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            jSONObject.put("retry_billing_activity_is_null", z2);
            if (this.LIZIZ != null) {
                z3 = false;
            }
            jSONObject.put("retry_billing_flow_params_is_null", z3);
            C1794660wno.LIZLLL(jSONObject);
            InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
            EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
            C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
            c1794310wnF.getClass();
            C1794940woG.LIZ(c1794310wnF, enumC1794330wnH, "livesdk_iap_retry_attempt_fail", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("");
        }
    }

    @Override // X.InterfaceC1795750wpZ
    public final void LJIIJJI(C1794710wnt c1794710wnt) {
        C1792840wks c1792840wks = new C1792840wks(209, 2091, "pay failed because signature is invalid");
        c1792840wks.LJIIL = this.LJI.LJIILIIL;
        C1794480wnW c1794480wnW = this.LJIIJ.LIZ;
        if (c1794480wnW != null) {
            c1794480wnW.LJIJ = SystemClock.uptimeMillis();
        }
        this.LIZ.LJI(c1794710wnt.LJ(), c1794710wnt.LJFF, c1794710wnt.LJI(), 0L, c1792840wks);
        C1794480wnW c1794480wnW2 = this.LJIIJ.LIZ;
        if (c1794480wnW2 != null && c1794480wnW2.LJIIJ == null) {
            c1794480wnW2.LJI(c1794710wnt);
        }
        this.LJIIJ.LIZIZ(c1792840wks);
    }

    @Override // X.InterfaceC1795750wpZ
    public final void LIZJ(C19885612rG c19885612rG, int i) {
        this.LIZ.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result_code", c19885612rG.LIZ);
            jSONObject.put("detail_code", c19885612rG.LIZJ);
            jSONObject.put(Scene.SCENE_SERVICE, i);
            C1794660wno.LIZLLL(jSONObject);
            InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
            EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
            C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
            c1794310wnF.getClass();
            C1794940woG.LIZ(c1794310wnF, enumC1794330wnH, "livesdk_iap_retry_attempt_start_success", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("");
        }
    }

    @Override // X.InterfaceC1795750wpZ
    public final void LJIIIIZZ(C1795840wpi c1795840wpi, C19885612rG c19885612rG) {
        long j;
        String strJ3;
        C1794660wno c1794660wno = this.LIZ;
        c1794660wno.getClass();
        JSONObject jSONObject = new JSONObject();
        C1793980wmi.LIZIZ("payment_attempt_id", c1794660wno.LJIIJJI, jSONObject);
        C1793980wmi.LIZIZ("client_flow", c1794660wno.LJIIL, jSONObject);
        C1793980wmi.LIZIZ("product_id", c1794660wno.LJ, jSONObject);
        C1793980wmi.LIZIZ("request_id", c1794660wno.LJFF, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C1793980wmi.LIZ("pay_type", c1794660wno.LJIIIIZZ, jSONObject2);
        if (c1794660wno.LJII) {
            j = 1;
        } else {
            j = 0;
        }
        C1793980wmi.LIZ("is_subscription", j, jSONObject2);
        C1793980wmi.LIZIZ("payment_method", EnumC1791830wjF.GOOGLE.channelName, jSONObject2);
        C1793980wmi.LIZIZ("channel_api_version", C1792910wkz.LIZ, jSONObject2);
        C1793980wmi.LIZIZ("channel_sdk_version", C1792910wkz.LIZIZ, jSONObject2);
        C1793980wmi.LIZIZ("biz_content", c1794660wno.LJIIJ, jSONObject2);
        C1793980wmi.LIZIZ("merchant_id", c1794660wno.LJI, jSONObject2);
        C1793980wmi.LIZ("result_detail_code", c19885612rG.LIZ, jSONObject2);
        C1793980wmi.LIZIZ("result_message", c19885612rG.LIZJ, jSONObject2);
        try {
            JSONObject jSONObject3 = new JSONObject();
            c1795840wpi.getClass();
            new ArrayList().addAll(c1795840wpi.LJFF);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c1795840wpi.LJFF);
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(c1795840wpi.LJFF);
                if (!arrayList2.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < arrayList2.size(); i++) {
                        if (ListProtector.get(arrayList2, i) instanceof C1795900wpo) {
                            jSONArray.put(C1794660wno.LJII(ListProtector.get(arrayList2, i)));
                        }
                    }
                    jSONObject3.put("product_details_params", jSONArray);
                }
            }
            jSONObject3.put("profile_token", c1795840wpi.LIZJ);
            jSONObject3.put("account_token", c1795840wpi.LIZIZ);
            strJ3 = C786410Ut5.J3(jSONObject3);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            strJ3 = "";
        }
        C1793980wmi.LIZIZ("billing_flow_param", strJ3, jSONObject2);
        HashMap<String, ?> map = c1794660wno.LJIIIZ;
        if (map != null) {
            c1794660wno.LIZJ(map, jSONObject2);
        }
        C1794660wno.LIZLLL(jSONObject2);
        InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
        c1794310wnF.getClass();
        c1794310wnF.LIZ(enumC1794330wnH, "livesdk_iap_launch_billing_flow_result", jSONObject2, null, jSONObject);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0wnq] */
    public C1794670wnp(GooglePayState googlePayState, C1794660wno c1794660wno, C1794480wnW c1794480wnW) {
        this.LJIIJ = googlePayState;
        this.LIZ = c1794660wno;
        this.LJI = c1794480wnW;
        this.LJII = new C1793950wmf(googlePayState.LIZ);
    }

    @Override // X.InterfaceC1795750wpZ
    public final void LJ(C1792840wks c1792840wks, C1794710wnt c1794710wnt, C1792590wkT c1792590wkT) {
        C1792840wks c1792840wks2;
        String str;
        C1792840wks c1792840wks3;
        String str2;
        long jLJFF;
        int i = c1792840wks.LIZ;
        C1794480wnW c1794480wnW = this.LJIIJ.LIZ;
        if (c1794480wnW != null) {
            c1794480wnW.LJIJ = SystemClock.uptimeMillis();
        }
        int iLJ = -1;
        String strLJI = "";
        if (i == 0) {
            if (c1794710wnt != null) {
                if (c1794710wnt.LJIIJJI()) {
                    if (c1792590wkT == null) {
                        if (C1794970woJ.LIZ.LIZ) {
                            int i2 = c1792840wks.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("pay successful in GooglePayPurchasesUpdatedListener but detail is null,resultMessage is ");
                            sbLIZ.append(c1792840wks.LJ);
                            this.LIZ.LJI(c1794710wnt.LJ(), c1794710wnt.LJFF, c1794710wnt.LJI(), 0L, new C1792840wks(-201, i2, C2188811AlT.LIZIZ(sbLIZ)));
                        }
                    }
                    this.LJIIJ.LJ.removeMessages(1435, this.LJIIIIZZ);
                    this.LIZ.LJI(c1794710wnt.LJ(), c1794710wnt.LJFF, c1794710wnt.LJI(), c1794710wnt.LJFF(), null);
                    GooglePayState googlePayState = this.LJIIJ;
                    C1794480wnW c1794480wnW2 = googlePayState.LIZ;
                    c1794480wnW2.LJI(c1794710wnt);
                    c1794480wnW2.LJIIJJI = c1792590wkT;
                    C1794480wnW c1794480wnW3 = googlePayState.LIZ;
                    String str3 = c1794710wnt.LJIILJJIL;
                    if (TextUtils.isEmpty(c1794480wnW3.LJFF)) {
                        c1794480wnW3.LJFF = str3;
                    }
                    AbstractC1794360wnK nextState = PaymentServiceManager.get().getIapExternalService().getNextState(googlePayState);
                    if (nextState != null) {
                        nextState.LIZ(googlePayState.LIZ);
                        return;
                    }
                    return;
                }
                if (!c1794710wnt.LJIIJJI()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("pay successful in GooglePayPurchasesUpdatedListener but isOrderStateSuccess() is false,resultMessage is ");
                    sbLIZ2.append(c1792840wks.LJ);
                    c1792840wks3 = new C1792840wks(-202, i, C2188811AlT.LIZIZ(sbLIZ2));
                    c1792840wks3.LIZJ = c1792840wks.LIZJ;
                } else {
                    if (c1792590wkT != null) {
                        return;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("pay successful in GooglePayPurchasesUpdatedListener but detail is null,resultMessage is ");
                    sbLIZ3.append(c1792840wks.LJ);
                    c1792840wks3 = new C1792840wks(-200, i, C2188811AlT.LIZIZ(sbLIZ3));
                    c1792840wks3.LIZJ = c1792840wks.LIZJ;
                }
                iLJ = c1794710wnt.LJ();
                str2 = c1794710wnt.LJFF;
                strLJI = c1794710wnt.LJI();
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("pay successful in GooglePayPurchasesUpdatedListener but googleIapOrderData is null,resultMessage is ");
                sbLIZ4.append(c1792840wks.LJ);
                c1792840wks3 = new C1792840wks(-203, i, C2188811AlT.LIZIZ(sbLIZ4));
                c1792840wks3.LIZJ = c1792840wks.LIZJ;
                str2 = "";
            }
            c1792840wks3.LJIIIZ = c1792840wks.LJIIIZ;
            C1794660wno c1794660wno = this.LIZ;
            if (c1794710wnt != null) {
                jLJFF = c1794710wnt.LJFF();
            } else {
                jLJFF = 0;
            }
            c1794660wno.LJI(iLJ, str2, strLJI, jLJFF, c1792840wks3);
            if (iLJ == 0) {
                return;
            }
            C1794480wnW c1794480wnW4 = this.LJIIJ.LIZ;
            if (c1794480wnW4 != null && c1794480wnW4.LJIIJ == null) {
                c1794480wnW4.LJI(c1794710wnt);
            }
            this.LJIIJ.LIZIZ(c1792840wks3);
            return;
        }
        if (i == 1) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("pay failed in GooglePayPurchasesUpdatedListener because user canceled,resultMessage is ");
            sbLIZ5.append(c1792840wks.LJ);
            c1792840wks2 = new C1792840wks(206, i, C2188811AlT.LIZIZ(sbLIZ5));
            c1792840wks2.LIZJ = c1792840wks.LIZJ;
        } else {
            int iLIZLLL = C1792840wks.LIZLLL(i, c1792840wks.LJ);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("pay failed in GooglePayPurchasesUpdatedListener,resultMessage is ");
            sbLIZ6.append(c1792840wks.LJ);
            c1792840wks2 = new C1792840wks(203, i, iLIZLLL, C2188811AlT.LIZIZ(sbLIZ6));
            c1792840wks2.LIZJ = c1792840wks.LIZJ;
        }
        c1792840wks2.LJIIIZ = c1792840wks.LJIIIZ;
        C1794660wno c1794660wno2 = this.LIZ;
        if (c1794710wnt != null) {
            iLJ = c1794710wnt.LJ();
        }
        if (c1794710wnt == null) {
            str = "";
        } else {
            str = c1794710wnt.LJFF;
            strLJI = c1794710wnt.LJI();
        }
        c1794660wno2.LJI(iLJ, str, strLJI, 0L, c1792840wks2);
        Application application = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LIZ;
        String strLIZLLL = this.LJI.LIZLLL();
        if (C1794820wo4.LIZ == null) {
            C1794820wo4.LIZ = C810670Vr7.LIZJ(application, 0, "payload_prefs");
        }
        C1794820wo4.LIZ.edit().remove(C2085008Eu.LIZ(strLIZLLL)).apply();
        C1794480wnW c1794480wnW5 = this.LJIIJ.LIZ;
        if (c1794480wnW5 != null && c1794480wnW5.LJIIJ == null) {
            c1794480wnW5.LJI(c1794710wnt);
        }
        this.LJIIJ.LIZIZ(c1792840wks2);
    }
}
