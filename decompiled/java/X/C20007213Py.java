package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Py, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20007213Py {
    public static final CopyOnWriteArrayList<String> LIZ = new CopyOnWriteArrayList<>();

    public static void LIZ(Effect effect, String str) {
        List<C20012513Rz> listLJIILL = C13SB.LJIILL(str);
        if (listLJIILL != null) {
            for (C20012513Rz c20012513Rz : listLJIILL) {
                String str2 = c20012513Rz.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(effect.getId());
                sbLIZ.append("_trans_");
                if (u.LJJIIJZLJL(str2, C2188811AlT.LIZIZ(sbLIZ), false)) {
                    C13SB.LJIILLIIL(c20012513Rz.LIZIZ);
                }
            }
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(effect.getUnzipPath());
        sbLIZ2.append("_trans_");
        copyOnWriteArrayList.remove(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
