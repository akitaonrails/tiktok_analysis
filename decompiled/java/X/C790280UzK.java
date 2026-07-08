package X;

import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.0UzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790280UzK {
    public static void LIZ(String str) {
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("APP2APP_DEBUG_");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final String LIZIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("0x");
        CharsKt__CharJVMKt.checkRadix(16);
        sbLIZ.append(Integer.toString(i, 16));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
