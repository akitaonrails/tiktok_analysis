package X;

import android.os.Looper;
import com.ss.android.ugc.aweme.ad.preload.settings.LandPageGeckoOptimizeStrategyModel;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0clI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024300clI {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final Map<String, InterfaceC1024320clK> LIZIZ = Collections.synchronizedMap(new LinkedHashMap());
    public static final Map<String, InterfaceC1024320clK> LIZJ = Collections.synchronizedMap(new LinkedHashMap());
    public static final Map<String, C1551680qTu> LIZLLL = Collections.synchronizedMap(new LinkedHashMap());
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(346));

    public static void LIZIZ() {
        if ((!LIZIZ.isEmpty()) || (!LIZJ.isEmpty()) || (!LIZLLL.isEmpty())) {
            return;
        }
        Map<String, InterfaceC1024370clP> map = C1024330clL.LIZJ;
        map.remove("LandPageGeckoDispatcher");
        if (map.isEmpty()) {
            C1BCA.LJJIJ((InterfaceC1702110uOX) C1024330clL.LIZLLL.getValue());
            C1BCA.LJJIJL((C1BC3) C1024330clL.LJ.getValue());
        }
    }

    public static void LIZJ(Runnable runnable) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C375501d3(runnable, null), 3);
        } else {
            runnable.run();
        }
    }

    public static boolean LIZLLL(String str) {
        Map<String, InterfaceC1024320clK> map = LIZJ;
        InterfaceC1024320clK interfaceC1024320clK = map.get(str);
        LIZIZ.remove(str);
        map.remove(str);
        LJ(str);
        if (interfaceC1024320clK != null) {
            Runnable runnableEs = interfaceC1024320clK.es();
            if (runnableEs != null) {
                LIZJ(runnableEs);
                return true;
            }
            return true;
        }
        return false;
    }

    public static void LJ(String str) {
        InterfaceC1024320clK interfaceC1024320clKRemove = LIZJ.remove(str);
        if (interfaceC1024320clKRemove != null) {
            C1042680dEw.LIZ.getClass();
            LJFF(C1042680dEw.LJIIIZ, interfaceC1024320clKRemove);
        }
        LIZIZ();
        if (((LandPageGeckoOptimizeStrategyModel) C1024360clO.LIZIZ.getValue()).enablePauseAndResumeTask && str != null && str.length() != 0) {
            LIZLLL.remove(str);
            LIZIZ();
        }
    }

    public static void LIZ(String str, InterfaceC1024320clK interfaceC1024320clK) {
        if (((LandPageGeckoOptimizeStrategyModel) C1024360clO.LIZIZ.getValue()).enableDeviceStatusControl) {
            if (interfaceC1024320clK.LIZIZ()) {
                return;
            }
            LIZIZ.put(str, interfaceC1024320clK);
            boolean z = C1024330clL.LIZ;
            C1024330clL.LJ("LandPageGeckoDispatcher", (InterfaceC1024370clP) LJ.getValue());
            return;
        }
        LIZJ(interfaceC1024320clK.es());
    }

    public static void LJFF(C1007810cKh c1007810cKh, InterfaceC1024320clK interfaceC1024320clK) {
        if (interfaceC1024320clK.LIZJ() != null && interfaceC1024320clK.LIZ() != null) {
            new C1001830cB3(new Object[0]).logEvent(c1007810cKh, new AwS595S0100000_16(interfaceC1024320clK, 198));
        }
    }
}
