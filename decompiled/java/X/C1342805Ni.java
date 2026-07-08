package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05Ni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1342805Ni {
    public static final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public static final ConcurrentHashMap<String, C09AE> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(InterfaceC1105930esx interfaceC1105930esx, Function0 function0) {
        int iHashCode;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cancelling cleanup for fetched view: ");
        int iHashCode2 = 0;
        if (interfaceC1105930esx != null) {
            iHashCode = interfaceC1105930esx.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, C09AE> concurrentHashMap = LIZIZ;
        if (interfaceC1105930esx != null) {
            iHashCode2 = interfaceC1105930esx.hashCode();
        }
        C09AE c09aeRemove = concurrentHashMap.remove(String.valueOf(iHashCode2));
        if (c09aeRemove != null) {
            c09aeRemove.LIZIZ(null);
            if (function0 != null) {
                function0.invoke();
            }
        }
    }
}
