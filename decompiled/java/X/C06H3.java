package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06H3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06H3 {
    public static C06H2 LIZ(String str) {
        for (C06H2 c06h2 : C06H2.values()) {
            if (Intrinsics.LJFF(c06h2.getValue(), str)) {
                return c06h2;
            }
        }
        return C06H2.UNKNOWN;
    }
}
