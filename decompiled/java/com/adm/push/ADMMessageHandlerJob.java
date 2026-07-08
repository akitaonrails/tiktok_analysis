package com.adm.push;

import X.C1C7U;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C808680Vnu;
import X.C808870VoD;
import X.C809030VoT;
import X.C809150Vof;
import X.C809190Voj;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {
    public static long sLastSendTokenTimeStamp;
    public static String sLastToken;
    public Handler mHandler;

    public static class AdmHandler extends BPEAHandler {
        public final Context LL;

        public AdmHandler(Context context) {
            super(Looper.getMainLooper());
            this.LL = C786410Ut5.N3(context);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("ADMMessageHandlerJob$AdmHandler@74dd.handleMessage");
            super.handleMessage(message);
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    try {
                        String str = (String) HandlerHook.getMessageObj(message.obj);
                        C809030VoT.LJIIZILJ();
                        C808870VoD.LIZIZ(AdmPushAdapter.getAdmPush(), str, "");
                        C809030VoT.LJIIJJI().LJIIIIZZ(AdmPushAdapter.getAdmPush(), 102, (String) HandlerHook.getMessageObj(message.obj), "ADMMessageHandlerJob.AdmHandler return ERROR when register");
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("label", "onRegistrationError");
                            jSONObject.put("type", AdmPushAdapter.getAdmPush());
                            jSONObject.put("errorId", str);
                            C809030VoT.LJIIZILJ().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } else {
                try {
                    String str2 = (String) HandlerHook.getMessageObj(message.obj);
                    if (!TextUtils.isEmpty(str2)) {
                        C809030VoT.LJIIZILJ().LIZJ(this.LL, AdmPushAdapter.getAdmPush(), str2);
                    } else {
                        C809030VoT.LJIIJJI().LJIIIIZZ(AdmPushAdapter.getAdmPush(), 102, CardStruct.IStatusCode.DEFAULT, "token is empty");
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C809030VoT c809030VoT = C809030VoT.LJIIJ;
                    c809030VoT.LIZ.getClass();
                    if (C809190Voj.LIZ()) {
                        C809150Vof c809150Vof = c809030VoT.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ADMMessageHandlerJob.AdmHandler handleMessage error = ");
                        sbLIZ.append(th2.getMessage());
                        C2188811AlT.LIZIZ(sbLIZ);
                        c809150Vof.getClass();
                    }
                }
            }
            C1C7U.LIZIZ("ADMMessageHandlerJob$AdmHandler@74dd.handleMessage");
        }
    }

    public static Bundle INVOKEVIRTUAL_com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private Handler getHandler(Context context) {
        if (this.mHandler == null) {
            this.mHandler = new AdmHandler(C786410Ut5.N3(context));
        }
        return this.mHandler;
    }

    private void sendToken(Context context, String str) {
        try {
            C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ADMMessageHandlerJob sendToken = ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            c809150Vof.getClass();
            if (TextUtils.isEmpty(str)) {
                C809030VoT.LJIIJJI().LJIIIIZZ(AdmPushAdapter.getAdmPush(), 102, CardStruct.IStatusCode.DEFAULT, "ADMMessageHandlerJob token is empty");
            } else {
                getHandler(context).obtainMessage(1, str).sendToTarget();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C809030VoT c809030VoT = C809030VoT.LJIIJ;
            c809030VoT.LIZ.getClass();
            if (C809190Voj.LIZ()) {
                C809150Vof c809150Vof2 = c809030VoT.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ADMMessageHandlerJob sendToken error = ");
                sbLIZ2.append(Log.getStackTraceString(th));
                C2188811AlT.LIZIZ(sbLIZ2);
                c809150Vof2.getClass();
            }
        }
    }

    public void onMessage(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        C809030VoT c809030VoT = C809030VoT.LJIIJ;
        c809030VoT.LIZ.getClass();
        if (C809190Voj.LIZ()) {
            C809150Vof c809150Vof = c809030VoT.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ADMMessageHandlerJob onMessage: ");
            sbLIZ.append(intent);
            C2188811AlT.LIZIZ(sbLIZ);
            c809150Vof.getClass();
        }
        Bundle bundleINVOKEVIRTUAL_com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
            return;
        }
        try {
            String string = bundleINVOKEVIRTUAL_com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("payload");
            ((C808680Vnu) C809030VoT.LJIILJJIL()).LJ(AdmPushAdapter.getAdmPush(), string, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C809150Vof c809150Vof2 = C809030VoT.LJIIJ.LIZ;
            e.getMessage();
            c809150Vof2.getClass();
        }
    }

    public void onRegistered(Context context, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - sLastSendTokenTimeStamp < 2000 && C2093608Ic.LIZJ(str, sLastToken)) {
            return;
        }
        sLastSendTokenTimeStamp = jCurrentTimeMillis;
        sLastToken = str;
        C809030VoT c809030VoT = C809030VoT.LJIIJ;
        c809030VoT.LJ("registerPush_adm");
        c809030VoT.LIZLLL("registerPush_adm");
        c809030VoT.LIZIZ("sdk_register_push");
        sendToken(context, str);
    }

    public void onRegistrationError(Context context, String str) {
        C809030VoT c809030VoT = C809030VoT.LJIIJ;
        c809030VoT.LIZ.getClass();
        if (C809190Voj.LIZ()) {
            C809150Vof c809150Vof = c809030VoT.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ADMMessageHandlerJob onRegistrationError: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            c809150Vof.getClass();
        }
        getHandler(context).obtainMessage(2, str).sendToTarget();
    }

    public void onUnregistered(Context context, String str) {
        C809030VoT c809030VoT = C809030VoT.LJIIJ;
        c809030VoT.LIZ.getClass();
        if (C809190Voj.LIZ()) {
            C809150Vof c809150Vof = c809030VoT.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ADMMessageHandlerJob unregisterPush: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            c809150Vof.getClass();
        }
    }
}
