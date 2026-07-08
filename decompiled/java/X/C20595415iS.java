package X;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.15iS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20595415iS {
    public static final List<String> LIZ = Arrays.asList("REDMI 6A", "VIVO 1812", "MRD-LX1F", "VIVO 1908", "MRD-LX1", "AMN-LX9", "TECNO ID3K", "TECNO KB2", "TECNO KB3", "KSA-LX9", "INFINIX X627V");
    public static volatile int LIZIZ = 0;

    public static boolean LIZIZ() {
        return C0BIA.LIZ() ? C0BIA.LIZIZ() : LIZIZ == -1 || LIZIZ == 1;
    }

    public static boolean LIZJ() {
        return C0BIA.LIZ() ? C0BIA.LIZIZ() : LIZIZ == -1;
    }

    public static void LIZ(InterfaceC20595515iT interfaceC20595515iT) {
        if (LIZIZ()) {
            interfaceC20595515iT.LIZ();
        } else {
            interfaceC20595515iT.LIZIZ();
        }
    }
}
