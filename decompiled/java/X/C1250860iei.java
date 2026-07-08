package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250860iei {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(BaseSharePackage baseSharePackage) {
        boolean zLJFF = false;
        if (baseSharePackage == null) {
            return false;
        }
        String string = baseSharePackage.extras.getString("enter_method");
        if (!Intrinsics.LJFF(baseSharePackage.extras.getString("enter_from"), "live_merge")) {
            zLJFF = Intrinsics.LJFF(string, "long_press");
        }
        return !zLJFF;
    }
}
