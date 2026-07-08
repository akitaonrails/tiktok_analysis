package X;

import android.content.res.AssetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0tNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663120tNe {
    public static String LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static boolean LIZLLL;

    public static void LIZIZ() throws Throwable {
        AssetManager assets = C0CHQ.LIZ.getAssets();
        boolean zLJJJIL = C0CHQ.LIZ().LJJIIZI().LJJJIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start tryCopyUlikeBeautyResource hasCopy = ");
        sbLIZ.append(zLJJJIL);
        C201955140j.LIZIZ("FilterConfig", C2188811AlT.LIZIZ(sbLIZ));
        try {
            if (!C2286708xd.LIZJ(LIZIZ) || !zLJJJIL) {
                C08SA.LJ(assets.open("reshape.zip"), LIZIZ);
            }
            if (!C2286708xd.LIZJ(LIZJ) || !zLJJJIL) {
                C08SA.LJ(assets.open("smooth.zip"), LIZJ);
            }
            C0CHQ.LIZ().LJJIIZI().LJJIJLIJ(true);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    static {
        if (C0BW1.LIZ()) {
            return;
        }
        LIZ();
    }

    public static void LIZ() throws Throwable {
        if (C0BW1.LIZ() && LIZLLL) {
            return;
        }
        LIZ = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJLZIJ();
        C0VSJ c0vsj = new C0VSJ(LIZ);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        LIZIZ = new C0VSJ(LIZ, "reshape").getAbsolutePath();
        LIZJ = new C0VSJ(LIZ, "smooth").getAbsolutePath();
        new C0VSJ(LIZ, "contour").getAbsolutePath();
        LIZIZ();
        LIZLLL = true;
    }
}
