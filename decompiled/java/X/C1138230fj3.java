package X;

import android.os.Looper;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0fj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138230fj3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null && iHostAppContext.isOffline()) {
            C20441214yg.LIZIZ(str, str2);
        }
    }

    public static void LIZIZ(String str, String str2) {
        Boolean boolValueOf;
        boolean z;
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            boolValueOf = Boolean.valueOf(iHostAppContext.isOffline());
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("source=");
            sbLIZ.append(str2);
            sbLIZ.append(", isMainThread = ");
            if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(", currentThread = ");
            sbLIZ.append(C786410Ut5.u3().getName());
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZJ(String str, String str2) {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext == null || !iHostAppContext.isOffline()) {
            C1131800fYg.LIZ.getClass();
            if (C781880Ulm.LIZLLL || C1101370elb.LIZ.LJIILJJIL("live_gift_overload_downgrade_tracking_enable")) {
                return;
            }
        }
        C20441214yg.LIZIZ(str, str2);
    }
}
