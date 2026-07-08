package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mzd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586630Mzd {
    public static final C586630Mzd LIZ = new C586630Mzd();
    public static final C586640Mze LIZIZ = new C586640Mze("onPlayProgressChange_fyp");

    public static void LIZ(float f, String str, String str2, String str3) {
        if (Intrinsics.LJFF("homepage_hot", str2) && f > 1.0f && f < 3.0f) {
            C586640Mze c586640Mze = LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            sbLIZ.append(" progress: ");
            sbLIZ.append(f);
            sbLIZ.append(", aid: ");
            sbLIZ.append(str);
            c586640Mze.LJIIIIZZ(null, "onPlayProgressChange_fyp", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
