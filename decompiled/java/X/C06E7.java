package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06E7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06E7 {
    public static final long LIZ(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return 1L;
        }
        if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            return 0L;
        }
        return -1L;
    }
}
