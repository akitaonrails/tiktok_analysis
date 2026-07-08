package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18ex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21338118ex {
    public static int LIZ(Object obj) {
        if (Intrinsics.LJFF(obj, "always")) {
            return 1;
        }
        if (Intrinsics.LJFF(obj, "ifneeded")) {
            return 2;
        }
        return 0;
    }
}
