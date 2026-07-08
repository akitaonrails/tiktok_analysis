package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Ipk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478580Ipk {
    public static InterfaceC420801kM LIZ;
    public static volatile ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str) {
        InterfaceC420801kM interfaceC420801kM = LIZ;
        if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
            InterfaceC420801kM interfaceC420801kM2 = LIZ;
            if (interfaceC420801kM2 != null) {
                interfaceC420801kM2.dispose();
            }
            LIZ = null;
            LIZIZ.clear();
            C478920IqI.LIZ.getClass();
            C478920IqI.LIZLLL("stopPrefetchTimerIfNeeded");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TopModuleTimerManager Stopped unified RxJava timer, source: ");
            sbLIZ.append(str);
            sbLIZ.append(" - no active modules remaining");
            C20441214yg.LIZIZ("MultiTopLiveTopModuleTimerManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
