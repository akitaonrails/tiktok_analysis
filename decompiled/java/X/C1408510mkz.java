package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0mkz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408510mkz {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(355));

    public static final String LIZ(String str) {
        boolean z;
        String string;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (string = ((Keva) LIZ.getValue()).getString(str, null)) == null || string.length() == 0 || !C2286708xd.LIZJ(string)) {
            return null;
        }
        return string;
    }
}
