package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zZ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900830zZ3 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str, List list) {
        if (Intrinsics.LJFF(str, "filter_vh")) {
            if (list != null && !list.isEmpty() && !C890290YwF.LIZIZ.LIZJ(false)) {
                return false;
            }
        } else {
            if (Intrinsics.LJFF(str, "filter_button")) {
                if (list == null || list.isEmpty()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
