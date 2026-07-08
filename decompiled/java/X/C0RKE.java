package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RKE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RKE {
    public static final C0RKE LIZ = new C0RKE();

    public static boolean LIZ(Context context, C690870R8b c690870R8b) {
        if (!C300390Bq1.LIZ()) {
            return false;
        }
        if (context != null && C0SUC.LIZ(context).isFromEffectDiscover()) {
            return false;
        }
        if (!Intrinsics.LJFF(c690870R8b.LIZ(), "cell_photos") && !Intrinsics.LJFF(c690870R8b.LIZ(), "cell_text") && !Intrinsics.LJFF(c690870R8b.LIZ(), "cell_story")) {
            return false;
        }
        return true;
    }
}
