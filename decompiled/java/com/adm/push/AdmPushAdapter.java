package com.adm.push;

import X.C2188811AlT;
import X.C786410Ut5;
import X.C809030VoT;
import X.C809150Vof;
import X.C809190Voj;
import X.C809360Vp0;
import X.C809470VpB;
import X.C809560VpK;
import X.C809600VpO;
import X.C809610VpP;
import X.C809650VpT;
import X.C809660VpU;
import X.InterfaceC808910VoH;
import X.InterfaceC809680VpW;
import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class AdmPushAdapter implements InterfaceC808910VoH {
    public static int ADM_PUSH = -1;
    public static boolean sSupport;

    @Override // X.InterfaceC808910VoH
    public boolean requestNotificationPermission(int i) {
        return false;
    }

    static {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            sSupport = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ADM not found");
            sbLIZ.append(th.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            c809150Vof.getClass();
        }
    }

    public static int getAdmPush() {
        if (ADM_PUSH == -1) {
            ADM_PUSH = C809470VpB.LJIIIIZZ(C809360Vp0.LIZ).LIZIZ(AdmPushAdapter.class.getName());
        }
        return ADM_PUSH;
    }

    private boolean isSupport(Context context) {
        try {
            if (!sSupport) {
                return false;
            }
            if (!C809660VpU.LIZ(context).LIZIZ()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC808910VoH
    public boolean checkThirdPushConfig(String str, Context context) {
        boolean z;
        boolean z2;
        C809650VpT c809650VpT;
        String[] strArr;
        boolean z3 = false;
        try {
            try {
                InputStream inputStreamOpen = context.getAssets().open("api_key.txt");
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C809030VoT.LJIIJ.LIZ.getClass();
                    }
                }
                z = true;
            } finally {
            }
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C809030VoT.LJIIJ.LIZ.getClass();
            z = false;
            C809030VoT.LJIIJ.LIZ.getClass();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(context.getPackageName());
        sbLIZ.append(".permission.RECEIVE_ADM_MESSAGE");
        List listAsList = Arrays.asList(C2188811AlT.LIZIZ(sbLIZ), "com.amazon.device.messaging.permission.RECEIVE", "android.permission.WAKE_LOCK");
        if (C809560VpK.LIZ == null) {
            synchronized (C809560VpK.class) {
                try {
                    if (C809560VpK.LIZ == null && (strArr = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), SpeechEngineDefines.TTS_WORK_MODE_BOTH).requestedPermissions) != null) {
                        C809560VpK.LIZ = Arrays.asList(strArr);
                    }
                } finally {
                }
            }
        }
        List<String> list = C809560VpK.LIZ;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listAsList) {
                if (!list.contains(obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AdmPush error");
                sbLIZ2.append(".You need to declare permission(s) {");
                sbLIZ2.append(arrayList);
                sbLIZ2.append("} in AndroidManifest.xml");
                C2188811AlT.LIZIZ(sbLIZ2);
                c809150Vof.getClass();
            } else {
                z2 = true;
                boolean z4 = z & z2;
                C809650VpT c809650VpT2 = new C809650VpT("com.adm.push.ADMMessageHandler");
                String packageName = context.getPackageName();
                C809600VpO c809600VpO = c809650VpT2.LIZ;
                c809600VpO.LIZJ = packageName;
                C809650VpT c809650VpT3 = new C809650VpT("com.adm.push.ADMMessageHandlerJob");
                String packageName2 = context.getPackageName();
                C809600VpO c809600VpO2 = c809650VpT3.LIZ;
                c809600VpO2.LIZJ = packageName2;
                c809600VpO2.LIZLLL = "android.permission.BIND_JOB_SERVICE";
                boolean zLIZIZ = C809560VpK.LIZIZ(context, "Adm push AndroidManifest.xml configure error", Arrays.asList(c809600VpO, c809600VpO2));
                c809650VpT = new C809650VpT("com.adm.push.ADMMessageHandler$Receiver");
                String packageName3 = context.getPackageName();
                C809600VpO c809600VpO3 = c809650VpT.LIZ;
                c809600VpO3.LIZJ = packageName3;
                c809600VpO3.LIZLLL = "com.amazon.device.messaging.permission.SEND";
                c809650VpT.LIZ(new C809610VpP(Arrays.asList("com.amazon.device.messaging.intent.REGISTRATION", "com.amazon.device.messaging.intent.RECEIVE"), Collections.singletonList(context.getPackageName())));
                if (C809560VpK.LIZ(context, "Adm push AndroidManifest.xml configure error", Collections.singletonList(c809650VpT.LIZ)) && zLIZIZ) {
                    z3 = true;
                }
                return z3 & z4;
            }
        } else {
            C809150Vof c809150Vof2 = C809030VoT.LJIIJ.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("AdmPush error");
            sbLIZ3.append(".You need to declare permission(s) {");
            sbLIZ3.append(listAsList);
            sbLIZ3.append("} in AndroidManifest.xml");
            C2188811AlT.LIZIZ(sbLIZ3);
            c809150Vof2.getClass();
        }
        z2 = false;
        boolean z42 = z & z2;
        C809650VpT c809650VpT22 = new C809650VpT("com.adm.push.ADMMessageHandler");
        String packageName4 = context.getPackageName();
        C809600VpO c809600VpO4 = c809650VpT22.LIZ;
        c809600VpO4.LIZJ = packageName4;
        C809650VpT c809650VpT32 = new C809650VpT("com.adm.push.ADMMessageHandlerJob");
        String packageName22 = context.getPackageName();
        C809600VpO c809600VpO22 = c809650VpT32.LIZ;
        c809600VpO22.LIZJ = packageName22;
        c809600VpO22.LIZLLL = "android.permission.BIND_JOB_SERVICE";
        boolean zLIZIZ2 = C809560VpK.LIZIZ(context, "Adm push AndroidManifest.xml configure error", Arrays.asList(c809600VpO4, c809600VpO22));
        c809650VpT = new C809650VpT("com.adm.push.ADMMessageHandler$Receiver");
        String packageName32 = context.getPackageName();
        C809600VpO c809600VpO32 = c809650VpT.LIZ;
        c809600VpO32.LIZJ = packageName32;
        c809600VpO32.LIZLLL = "com.amazon.device.messaging.permission.SEND";
        c809650VpT.LIZ(new C809610VpP(Arrays.asList("com.amazon.device.messaging.intent.REGISTRATION", "com.amazon.device.messaging.intent.RECEIVE"), Collections.singletonList(context.getPackageName())));
        if (C809560VpK.LIZ(context, "Adm push AndroidManifest.xml configure error", Collections.singletonList(c809650VpT.LIZ))) {
            z3 = true;
        }
        return z3 & z42;
    }

    @Override // X.InterfaceC808910VoH
    public boolean isPushAvailable(Context context, int i) {
        C809030VoT c809030VoT = C809030VoT.LJIIJ;
        c809030VoT.LIZ.getClass();
        if (C809190Voj.LIZ()) {
            C809150Vof c809150Vof = c809030VoT.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isPushAvailable: ");
            sbLIZ.append(isSupport(context));
            C2188811AlT.LIZIZ(sbLIZ);
            c809150Vof.getClass();
        }
        return isSupport(context);
    }

    @Override // X.InterfaceC808910VoH
    public void registerPush(Context context, int i) {
        String str;
        if (context != null) {
            if (i == getAdmPush() && isSupport(context)) {
                C809030VoT c809030VoT = C809030VoT.LJIIJ;
                c809030VoT.LIZJ("registerPush_adm");
                c809030VoT.LIZ("registerPush_adm");
                C809150Vof c809150Vof = c809030VoT.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("registerPush: ");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
                c809150Vof.getClass();
                C809660VpU.LIZ(context).LIZJ();
                return;
            }
            if (i != getAdmPush()) {
                str = "register sender error";
            } else if (!isSupport(context)) {
                str = "this device does not support adm sender";
            } else {
                str = null;
            }
        } else {
            str = "context is empty";
        }
        C809030VoT.LJIIJJI().LJIIIIZZ(i, 101, CardStruct.IStatusCode.DEFAULT, str);
    }

    @Override // X.InterfaceC808910VoH
    public void unregisterPush(Context context, int i) {
        if (context != null && i == getAdmPush() && isSupport(context)) {
            C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unregisterPush: ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            c809150Vof.getClass();
            C809660VpU.LIZ(context).LIZLLL();
        }
    }

    @Override // X.InterfaceC808910VoH
    public boolean requestSystemNotificationPermission(String str, int i, InterfaceC809680VpW interfaceC809680VpW) {
        if (interfaceC809680VpW != null) {
            try {
                interfaceC809680VpW.LIZJ("adm is not supported", false);
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }

    @Override // X.InterfaceC808910VoH
    public void setAlias(Context context, String str, int i) {
        if (context != null && i == getAdmPush() && isSupport(context)) {
            C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setAlias: ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            c809150Vof.getClass();
        }
    }

    @Override // X.InterfaceC808910VoH
    public void trackPush(Context context, int i, Object obj) {
        if (context != null && i == getAdmPush() && isSupport(context)) {
            C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trackPush: ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            c809150Vof.getClass();
        }
    }
}
