package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0W7X, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W7X {
    public static final C0W7X LIZ = new C0W7X();
    public static final Set<String> LIZIZ;
    public static final ArrayList<String> LIZJ;

    static {
        Set<String> hashSet = new HashSet<>();
        LIZIZ = hashSet;
        LIZJ = new ArrayList<>();
        Set<String> stringSet = ((SharedPreferences) C818010W7b.LIZ.getValue()).getStringSet("cookie_url_set_key", hashSet);
        if (stringSet != null) {
            hashSet = stringSet;
        }
        LIZIZ = hashSet;
    }

    public static void LIZIZ(String str) {
        Object c098200Yq;
        try {
            String strLLIZ = C2204961BRm.LLIZ(C786410Ut5.A2(), str, new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNnQrubtpFH+MzfpQjTO2ih6kO3PEIKCCusFFefNP8B1x7zFw==", null));
            if (C1533950q1J.LJ(strLLIZ)) {
                for (String str2 : a0.LJJLIIIJILLIZJL(strLLIZ, new String[]{";"}, 0, 6)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append("; expires=Thu, 01 Jan 1970 00:00:00 GMT");
                    LIZ(C786410Ut5.A2(), str, C2188811AlT.LIZIZ(sbLIZ));
                    C786410Ut5.A2().flush();
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static void LIZ(CookieManager cookieManager, String str, String str2) throws Throwable {
        String strLLIZ;
        C2204961BRm.LLJ(cookieManager, str, str2, new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNnQrubtpFH+MzfpQjTO2ih6kO3PEIKCCusFFefNP8B1x7zFw==", null));
        if (C2162308dZ.LJI(C1BWL.LIZ()) && C0C25.LIZ() && (strLLIZ = C2204961BRm.LLIZ(CookieManager.getInstance(), C818020W7c.LIZIZ(), new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNnQrubtpFH+MzfpQjTO2ih6kO3PEIKCCusFFefNP8B1x7zFw==", null))) != null && !TextUtils.equals(strLLIZ, C818020W7c.LIZ())) {
            C818020W7c.LIZJ(C818020W7c.LIZIZ(), strLLIZ);
        }
    }
}
