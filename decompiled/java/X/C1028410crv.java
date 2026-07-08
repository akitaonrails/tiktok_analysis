package X;

import com.bytedance.scene.Scene;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0crv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028410crv {
    public static final C1028410crv LIZ = new C1028410crv();

    public static final void LIZ(C1029740cu4 c1029740cu4, C1050680dRq c1050680dRq) {
        C1050670dRp c1050670dRp = new C1050670dRp();
        c1050670dRp.LJIIIIZZ(c1050680dRq);
        String[] strArr = {"gecko_channel", Scene.SCENE_SERVICE, "reason"};
        if (c1029740cu4 != null) {
            C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("hybrid_ad", "gecko_preload_status", String.valueOf(c1029740cu4.LIZ), c1029740cu4.LIZIZ, c1029740cu4.LIZJ);
            c1022820ciuLJ.LIZ(c1050670dRp.LJFF((String[]) Arrays.copyOf(strArr, 3)));
            c1022820ciuLJ.LIZIZ(c1050670dRp.LIZLLL("success"), "success");
            c1022820ciuLJ.LIZIZ(c1050670dRp.LIZLLL("stage"), "stage");
            c1022820ciuLJ.LIZIZ(c1050670dRp.LIZLLL("preload_duration"), "preload_duration");
            c1022820ciuLJ.LIZIZ(c1050670dRp.LIZLLL("package_id"), "package_id");
            c1022820ciuLJ.LIZIZ(c1050670dRp.LIZLLL("download_size"), "download_size");
            Object objLIZLLL = c1050670dRp.LIZLLL("is_interact");
            if (!(objLIZLLL instanceof Boolean)) {
                objLIZLLL = null;
            }
            c1022820ciuLJ.LIZIZ(objLIZLLL, "is_interact");
            c1022820ciuLJ.LJII();
        }
        C811103Ev.LIZ("AdHybridEventManager");
    }
}
