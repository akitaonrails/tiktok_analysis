package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0j8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269520j8o {
    public static final List<String> LIZ = Arrays.asList("setupSdkParams", "LiveCoreImpl", "setDisplay", "startVideoCapture", "startAudioCapture", "start");
    public static final List<String> LIZIZ = Arrays.asList("LiveCore.stop", "stopVideoCapture", "stopAudioCapture", "release");
    public static final List<String> LIZJ = Arrays.asList("create", "joinChannel", "startPushData", "startInteract");
    public static final List<String> LIZLLL = Arrays.asList("Client.stop", "dispose");
    public static final Map<String, C1269530j8p> LJ = new ConcurrentHashMap();

    static {
        new ArrayList();
    }

    public static synchronized void LIZ(String str) {
        if (((C1269530j8p) ((ConcurrentHashMap) LJ).get(str)) != null) {
            throw null;
        }
    }
}
