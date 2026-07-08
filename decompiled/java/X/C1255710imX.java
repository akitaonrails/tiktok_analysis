package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0imX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255710imX {
    public static final boolean LIZ(String[] strArr, String str, C0HWO... c0hwoArr) {
        if (C13LQ.LJJIJIIJI(str, strArr) >= 0) {
            for (C0HWO c0hwo : c0hwoArr) {
                if (Intrinsics.LJFF(c0hwo.LIZ, str)) {
                    return c0hwo.LIZ();
                }
            }
        }
        return false;
    }
}
