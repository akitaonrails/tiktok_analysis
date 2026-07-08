package X;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.08Qs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2116008Qs {
    public static final List<String> LIZ = Arrays.asList("c++_shared", "TTMachineCore", "CepEngine", "bytehook", "npth_unw");
    public static final List<String> LIZIZ = Arrays.asList("pns_ttmachine_adapter", "nativeaudio");
    public static int LIZJ = -1;
    public static int LIZLLL = -1;
    public static int LJ = -1;

    public static int LIZ() {
        if (LIZJ == -1) {
            LIZJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "cold_boot_preload_pumbaa_so", true);
        }
        return LIZJ;
    }
}
