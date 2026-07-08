package X;

import android.content.ComponentCallbacks;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0UtJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786550UtJ {
    public static final C786480UtC LIZ = new C786480UtC();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(273));

    public static void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatch foreground:");
        sbLIZ.append(false);
        sbLIZ.append(" level:");
        sbLIZ.append("null");
        C2188811AlT.LIZIZ(sbLIZ);
        C786480UtC c786480UtC = LIZ;
        synchronized (c786480UtC.LIZIZ) {
            try {
                List<ComponentCallbacks> list = c786480UtC.LIZ;
                if (list == null || ((ArrayList) list).isEmpty()) {
                    return;
                }
                int size = ((ArrayList) c786480UtC.LIZ).size();
                ComponentCallbacks[] componentCallbacksArr = new ComponentCallbacks[size];
                ((ArrayList) c786480UtC.LIZ).toArray(componentCallbacksArr);
                for (int i = 0; i < size; i++) {
                    componentCallbacksArr[i].onLowMemory();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void LIZIZ(ComponentCallbacks componentCallbacks) {
        C786480UtC c786480UtC = LIZ;
        synchronized (c786480UtC.LIZIZ) {
            try {
                if (c786480UtC.LIZ == null) {
                    c786480UtC.LIZ = new ArrayList();
                }
                ((ArrayList) c786480UtC.LIZ).add(componentCallbacks);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
