package X;

import java.util.HashMap;
import kotlin.text.u;

/* JADX INFO: renamed from: X.00px, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C200700px {
    public static final HashMap<String, String> LIZ = new HashMap<>();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(453));

    public static String LIZ(String str) {
        for (Object obj : ((HashMap) LIZIZ.getValue()).keySet()) {
            if (u.LJIIZILJ(str, (String) obj, false)) {
                if (obj == null) {
                    return null;
                }
                return (String) ((HashMap) LIZIZ.getValue()).get(obj);
            }
        }
        return null;
    }
}
