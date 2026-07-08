package X;

import android.app.Activity;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;

/* JADX INFO: renamed from: X.0KMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC516340KMu<RESPONSE_TYPE> {
    public static void LIZJ(C516550KNp c516550KNp) {
        C0KM7 c0km7;
        ISubscribeService iSubscribeService;
        C516010KLn c516010KLn = C516010KLn.LIZ;
        boolean zLIZ = c516550KNp.LIZ.LIZ();
        String str = c516550KNp.LIZJ;
        C0KNX c0knx = c516550KNp.LIZ;
        String str2 = c0knx.LIZLLL;
        String str3 = c0knx.LIZIZ;
        Activity activity = c0knx.LIZJ.get();
        if (activity == null || (iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)) == null || iSubscribeService.Ae() == null || (c0km7 = C0KBB.LIZ(activity)) == null) {
            c0km7 = new C0KM7();
        }
        C0KNX c0knx2 = c516550KNp.LIZ;
        c516010KLn.getClass();
        C516010KLn.LJIILIIL(zLIZ, str, str2, str3, c0km7, c0knx2);
    }

    public static void LIZLLL(C516550KNp c516550KNp) {
        C0KM7 c0km7;
        int i;
        ISubscribeService iSubscribeService;
        C516010KLn c516010KLn = C516010KLn.LIZ;
        boolean zLIZ = c516550KNp.LIZ.LIZ();
        String str = c516550KNp.LIZJ;
        long j = c516550KNp.LIZIZ;
        C0KNX c0knx = c516550KNp.LIZ;
        String str2 = c0knx.LIZLLL;
        String str3 = c0knx.LIZIZ;
        Activity activity = c0knx.LIZJ.get();
        if (activity == null || (iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)) == null || iSubscribeService.Ae() == null || (c0km7 = C0KBB.LIZ(activity)) == null) {
            c0km7 = new C0KM7();
        }
        C0KNX c0knx2 = c516550KNp.LIZ;
        C0KN4 c0kn4 = c0knx2.LIZ;
        if (c0kn4 != null) {
            i = c0kn4.LLILZLL;
        } else {
            i = 0;
        }
        c516010KLn.getClass();
        C516010KLn.LJIILJJIL(zLIZ, str, j, str2, str3, c0km7, i, c0knx2);
    }

    public static void LIZIZ(AbstractC516340KMu abstractC516340KMu, C516550KNp c516550KNp) {
        int iIntValue;
        C0KM7 c0km7;
        int i;
        ISubscribeService iSubscribeService;
        abstractC516340KMu.getClass();
        C516010KLn c516010KLn = C516010KLn.LIZ;
        boolean zLIZ = c516550KNp.LIZ.LIZ();
        long j = c516550KNp.LIZIZ;
        Integer num = c516550KNp.LJ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -999;
        }
        C0KNX c0knx = c516550KNp.LIZ;
        String str = c0knx.LIZIZ;
        Activity activity = c0knx.LIZJ.get();
        if (activity == null || (iSubscribeService = (ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)) == null || iSubscribeService.Ae() == null || (c0km7 = C0KBB.LIZ(activity)) == null) {
            c0km7 = new C0KM7();
        }
        C0KNX c0knx2 = c516550KNp.LIZ;
        C0KN4 c0kn4 = c0knx2.LIZ;
        if (c0kn4 != null) {
            i = c0kn4.LLILZLL;
        } else {
            i = 0;
        }
        c516010KLn.LJIIJJI(zLIZ, j, iIntValue, c0knx2.LIZLLL, str, c0km7, i, c516550KNp.LIZLLL, c516550KNp.LJFF, c0knx2);
    }

    public static C516550KNp LIZ(AbstractC516340KMu abstractC516340KMu, C0KNX c0knx, long j, String str, Throwable th, String str2, int i) {
        C501470JlZ c501470JlZ;
        Throwable th2 = th;
        String str3 = str;
        long j2 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        String str4 = "";
        if ((i & 4) != 0) {
            str3 = "";
        }
        Integer numValueOf = null;
        if ((i & 8) != 0) {
            th2 = null;
        }
        if ((i & 16) == 0) {
            str4 = str2;
        }
        abstractC516340KMu.getClass();
        if ((th2 instanceof C501470JlZ) && (c501470JlZ = (C501470JlZ) th2) != null) {
            c501470JlZ.getLogId();
        }
        if (th2 != null) {
            numValueOf = Integer.valueOf(C512300K7g.LIZIZ(th2));
        }
        return new C516550KNp(c0knx, j2, str3, str4, numValueOf, th2);
    }
}
