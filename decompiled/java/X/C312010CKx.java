package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0CKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312010CKx {
    public static Keva LIZ;

    public static final String LIZ() {
        if (LIZ == null) {
            LIZ = Keva.getRepo("PosterSR");
        }
        Keva keva = LIZ;
        String string = keva != null ? keva.getString("cpu_model", null) : null;
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strLJIIJ = C0WYJ.LJIIJ();
        String string2 = strLJIIJ != null ? a0.LJLIIIL(strLJIIJ).toString() : null;
        if (TextUtils.isEmpty(string2)) {
            string2 = Build.HARDWARE;
        }
        String string3 = string2 != null ? a0.LJLIIIL(string2).toString() : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("not use cacheCpuModel:");
        sbLIZ.append(string3);
        C2344809Gs.LIZLLL(4, "cacheCpuModel", C2188811AlT.LIZIZ(sbLIZ));
        Keva keva2 = LIZ;
        if (keva2 != null) {
            keva2.storeString("cpu_model", string3);
        }
        return string3;
    }
}
