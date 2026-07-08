package X;

import android.graphics.Bitmap;
import java.util.HashMap;

/* JADX INFO: renamed from: X.09na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2479209na {
    public static final C2479209na LIZ = new C2479209na();
    public static final HashMap<String, Bitmap> LIZIZ = new HashMap<>();
    public static final String LIZJ = "lottie_";

    public static String LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZJ);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final synchronized boolean LIZ(String str) {
        boolean z;
        Bitmap bitmap;
        HashMap<String, Bitmap> map = LIZIZ;
        z = false;
        if (map.containsKey(LIZIZ(str)) && (bitmap = map.get(LIZIZ(str))) != null) {
            if (!bitmap.isRecycled()) {
                z = true;
            }
        }
        return z;
    }
}
