package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OKU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OKU {
    public static final C0OKU LIZ = new C0OKU();
    public static String LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;

    public static void LIZIZ() {
        if (Intrinsics.LJFF(LIZIZ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bulletin_experiment");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        boolean z = true;
        if (!Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ)).getBoolean("is_created", false) && !C0C64.LJIILLIIL().LJIIIZ(31744, "is_bulletin_channel_created", true, true)) {
            z = false;
        }
        LIZJ = z;
        LIZLLL = false;
        LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    }

    public static boolean LIZ() {
        LIZIZ();
        return LIZLLL ? LJ : C0C64.LJIILLIIL().LJIIIZ(31744, "is_bulletin_channel_active", true, false);
    }
}
