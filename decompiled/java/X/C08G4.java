package X;

import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08G4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08G4 {
    public static final String LIZ(String str) {
        if (str != null && str.length() != 0) {
            if (TextUtils.isEmpty(C08G3.LIZ)) {
                C08G3.LIZ = C08G3.LIZ("Ynl0ZWRhbmNl");
            }
            return C08G3.LIZJ(Intrinsics.LJIIJJI(C08G3.LIZ, str), "MD5");
        }
        return "";
    }
}
