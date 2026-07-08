package X;

import android.content.res.AssetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08Ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2083208Ec {
    public static boolean LIZ;
    public static volatile Method LIZIZ;
    public static volatile boolean LIZJ;
    public static final Map<String, C2083308Ed> LIZLLL = new HashMap();

    public static C2083408Ee LIZ(String str, String str2) {
        C2083308Ed c2083308Ed;
        if (!LIZJ || (c2083308Ed = (C2083308Ed) ((HashMap) LIZLLL).get(str2)) == null) {
            return null;
        }
        return (C2083408Ee) ((HashMap) c2083308Ed.LIZ).get(str);
    }

    public static int LIZIZ(AssetManager assetManager, String str, String str2, String str3) {
        Method declaredMethod = LIZIZ;
        if (declaredMethod == null) {
            try {
                declaredMethod = AssetManager.class.getDeclaredMethod("getResourceIdentifier", String.class, String.class, String.class);
                declaredMethod.setAccessible(true);
                LIZIZ = declaredMethod;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LIZ = false;
                return 0;
            }
        }
        return ((Integer) C2204961BRm.a0(declaredMethod, assetManager, new Object[]{str, str2, str3}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPitcNHo3SHGKN9TdQPDmJEJ1tSeksQCZJv8jQ==", null))).intValue();
    }
}
