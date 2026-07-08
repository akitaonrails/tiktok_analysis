package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0526, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0526 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String strLIZIZ = C461720I8s.LIZIZ();
        if (!(true ^ Intrinsics.LJFF(strLIZIZ, "-1")) || strLIZIZ == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_say_hi_sticker_seen_count_");
        sbLIZ.append(strLIZIZ);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
