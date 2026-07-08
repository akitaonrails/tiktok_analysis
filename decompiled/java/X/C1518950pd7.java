package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0pd7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518950pd7 {
    public static final C1518950pd7 LIZ = new C1518950pd7();
    public static final CopyOnWriteArrayList<InterfaceC1519000pdC> LIZIZ = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<InterfaceC1519000pdC> LIZJ = new CopyOnWriteArrayList<>();

    public static void LIZ(InterfaceC1519000pdC interfaceC1519000pdC) {
        int i = C1518960pd8.LIZ[interfaceC1519000pdC.getLevel().ordinal()];
        if (i != 1) {
            if (i == 2) {
                LIZJ.add(interfaceC1519000pdC);
                return;
            }
            throw new C1954807lC();
        }
        LIZIZ.add(interfaceC1519000pdC);
    }

    public static InterfaceC1519000pdC LIZIZ(C1518830pcv c1518830pcv) {
        for (InterfaceC1519000pdC interfaceC1519000pdC : LIZJ) {
            if (interfaceC1519000pdC.LIZIZ(c1518830pcv)) {
                C100C.LIZ.LIZJ().LIZJ("GeoBlocking_strategy_shouldHandel", C2097608Jq.LJ(), null, null);
                if (interfaceC1519000pdC.LIZJ()) {
                    return interfaceC1519000pdC;
                }
            }
        }
        for (InterfaceC1519000pdC interfaceC1519000pdC2 : LIZIZ) {
            if (interfaceC1519000pdC2.LIZIZ(c1518830pcv)) {
                C100C.LIZ.LIZJ().LIZJ("GeoBlocking_strategy_shouldHandel", C2097608Jq.LJ(), null, null);
                if (interfaceC1519000pdC2.LIZJ()) {
                    return interfaceC1519000pdC2;
                }
            }
        }
        return null;
    }
}
