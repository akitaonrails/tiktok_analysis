package X;

import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS166S1100000_17;

/* JADX INFO: renamed from: X.0eYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093420eYm {
    public static boolean LIZ;
    public static final C0VMV LIZIZ;
    public static final C1093560eZ0 LIZJ;

    static {
        C0VMO c0vmo = new C0VMO();
        new Object() { // from class: X.0eYn
            {
                new CopyOnWriteArraySet();
            }
        };
        LIZIZ = new C0VMV(c0vmo);
        LIZJ = new C1093560eZ0();
    }

    public static void LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("launchLiveStrategies start, type=");
        sbLIZ.append(str);
        C227400uG.LIZ("LiveTTMStrategyManager", C2188811AlT.LIZIZ(sbLIZ));
        AwS166S1100000_17 awS166S1100000_17 = new AwS166S1100000_17(str, 4);
        if (LIZ) {
            awS166S1100000_17.invoke();
        } else {
            TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new C1093390eYj(awS166S1100000_17));
        }
    }
}
