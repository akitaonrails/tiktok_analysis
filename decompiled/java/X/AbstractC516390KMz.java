package X;

import android.app.Activity;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;

/* JADX INFO: renamed from: X.0KMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC516390KMz<RESPONSE_TYPE> {
    public static void LIZ(C516470KNh c516470KNh) {
        int iLIZIZ;
        C0KM7 c0km7;
        Throwable th;
        ISubscribeService iSubscribeService;
        C516010KLn c516010KLn = C516010KLn.LIZ;
        boolean zLIZ = c516470KNh.LIZ.LIZ();
        String str = c516470KNh.LIZJ;
        long j = c516470KNh.LIZIZ;
        int i = c516470KNh.LIZLLL;
        Throwable th2 = c516470KNh.LJI;
        if (th2 != null) {
            iLIZIZ = C512300K7g.LIZIZ(th2);
        } else {
            iLIZIZ = -999;
        }
        C0KNX c0knx = c516470KNh.LIZ;
        String str2 = c0knx.LIZLLL;
        String str3 = c0knx.LIZIZ;
        Activity activity = c0knx.LIZJ.get();
        if (activity == null || (iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)) == null || iSubscribeService.Ae() == null || (c0km7 = C0KBB.LIZ(activity)) == null) {
            c0km7 = new C0KM7();
        }
        String strLIZJ = c516470KNh.LJFF;
        if (strLIZJ == null && ((th = c516470KNh.LJI) == null || (strLIZJ = C512300K7g.LIZJ(th)) == null)) {
            strLIZJ = "";
        }
        C516010KLn.LJIILLIIL(c516010KLn, zLIZ, str, j, i, iLIZIZ, str2, str3, c0km7, strLIZJ, c516470KNh.LJII, c516470KNh.LIZ, c516470KNh.LJI, c516470KNh.LJIIIIZZ, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
    }

    public static void LIZIZ(C516470KNh c516470KNh) {
        C0KM7 c0km7;
        ISubscribeService iSubscribeService;
        C516010KLn c516010KLn = C516010KLn.LIZ;
        boolean zLIZ = c516470KNh.LIZ.LIZ();
        String str = c516470KNh.LIZJ;
        C0KNX c0knx = c516470KNh.LIZ;
        String str2 = c0knx.LIZLLL;
        String str3 = c0knx.LIZIZ;
        Activity activity = c0knx.LIZJ.get();
        if (activity == null || (iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)) == null || iSubscribeService.Ae() == null || (c0km7 = C0KBB.LIZ(activity)) == null) {
            c0km7 = new C0KM7();
        }
        C0KNX c0knx2 = c516470KNh.LIZ;
        Map<String, String> map = c0knx2.LJFF;
        c516010KLn.getClass();
        C516010KLn.LJIIZILJ(zLIZ, str, str2, str3, c0km7, map, c0knx2);
    }

    public final void LIZJ(C516470KNh c516470KNh) {
        C0KM7 c0km7;
        ISubscribeService iSubscribeService;
        C516010KLn c516010KLn = C516010KLn.LIZ;
        boolean zLIZ = c516470KNh.LIZ.LIZ();
        String str = c516470KNh.LIZJ;
        long j = c516470KNh.LIZIZ;
        int i = c516470KNh.LIZLLL;
        C0KNX c0knx = c516470KNh.LIZ;
        String str2 = c0knx.LIZLLL;
        String str3 = c0knx.LIZIZ;
        Activity activity = c0knx.LIZJ.get();
        if (activity == null || (iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)) == null || iSubscribeService.Ae() == null || (c0km7 = C0KBB.LIZ(activity)) == null) {
            c0km7 = new C0KM7();
        }
        String strLIZLLL = LIZLLL(c516470KNh.LIZ, c516470KNh);
        C0KNX c0knx2 = c516470KNh.LIZ;
        c516010KLn.LJIJ(zLIZ, str, j, i, str2, str3, c0km7, strLIZLLL, c0knx2.LJFF, c0knx2);
    }

    public String LIZLLL(C0KNX c0knx, C516470KNh c516470KNh) {
        return c516470KNh.LJ;
    }
}
