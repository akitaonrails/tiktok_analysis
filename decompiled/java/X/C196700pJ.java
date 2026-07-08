package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00pJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C196700pJ {
    public static final Set<String> LIZ;

    static {
        Set<String> setLLIIJI;
        try {
            String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "search_image_bsr_white_list", "", true);
            setLLIIJI = (strLJJ == null || a0.LJJJIL(strLJJ)) ? C08CX.INSTANCE : C13LP.LLIIJI(a0.LJJLIIIJ(strLJJ, new char[]{','}, false, 0, 6));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            setLLIIJI = C08CX.INSTANCE;
        }
        LIZ = setLLIIJI;
    }
}
