package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import java.util.UUID;

/* JADX INFO: renamed from: X.0uJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1699230uJt {
    public static boolean LIZ;
    public static String LIZIZ;
    public static boolean LIZJ;

    static {
        new UUID(-1301668207276963122L, -6645017420763422227L);
        LIZ = false;
        LIZIZ = null;
        LIZJ = false;
    }

    public static boolean LIZ() throws Throwable {
        Keva kevaLIZ;
        if (!LIZJ) {
            LIZJ = true;
            Keva kevaLIZ2 = C1197904mP.LIZ();
            String string = kevaLIZ2 != null ? kevaLIZ2.getString("widevine_security_level", "") : "";
            LIZIZ = string;
            if (TextUtils.isEmpty(string)) {
                LIZ = C1699240uJu.LIZ();
                C1699240uJu.LIZ();
                LIZIZ = C1699240uJu.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("drm store securityLevel=");
                sbLIZ.append(LIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
                if (!TextUtils.isEmpty(LIZIZ)) {
                    String str = LIZIZ;
                    if (!TextUtils.isEmpty(str) && (kevaLIZ = C1197904mP.LIZ()) != null) {
                        kevaLIZ.storeString("widevine_security_level", str);
                    }
                }
            }
            LIZ = true ^ TextUtils.isEmpty(LIZIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("drm widevine securityLevel=");
            sbLIZ2.append(LIZIZ);
            sbLIZ2.append(", isWidevineSupported=");
            sbLIZ2.append(LIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LIZJ();
        }
        return LIZ;
    }
}
