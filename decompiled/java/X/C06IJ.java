package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06IJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06IJ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(96));

    public static Keva LIZIZ() {
        return (Keva) LIZ.getValue();
    }

    public static String LIZJ(String str) {
        String string;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
            return string;
        }
        return null;
    }

    public static String LIZ(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
