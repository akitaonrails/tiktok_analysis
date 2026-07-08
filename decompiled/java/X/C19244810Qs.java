package X;

import Y.AfS53S1100000_28;
import Y.AfS9S1110000_28;
import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.10Qs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19244810Qs {
    public static final C19244810Qs LIZ = new C19244810Qs();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C19247110Rp());
    public static boolean LIZJ;
    public static InterfaceC420801kM LIZLLL;

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [T, X.01kM] */
    public static void LIZIZ(String str, boolean z) {
        if (!LIZ().getBoolean("data_recorded", false)) {
            return;
        }
        if (C1514430pVp.LIZLLL().booleanValue()) {
            if (!LIZ().getBoolean("upload_failed", false)) {
                return;
            }
        } else if (LIZ().getBoolean("upload_success", false)) {
            return;
        }
        if (((Boolean) C19246310Rh.LIZ.getValue()).booleanValue()) {
            C259800zU c259800zU = new C259800zU();
            C1800250wwp.LIZ.getClass();
            c259800zU.element = C1800250wwp.LIZIZ.LIZ(LIZ().getString("category_data", ""), null, LIZ().getString("topics", ""), false).LJL(C11S5.LIZ()).LJJLL(new AfS53S1100000_28(c259800zU, str, 11), new AfS9S1110000_28(c259800zU, z, str, 1));
        }
    }
}
