package X;

import android.os.Looper;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0g0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149270g0r {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        Boolean boolValueOf;
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            boolValueOf = Boolean.valueOf(iHostAppContext.isOffline());
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
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
            AtomicBoolean atomicBoolean = C20520215Rg.LIZ;
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
}
