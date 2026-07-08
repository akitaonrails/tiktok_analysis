package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805890x5v {
    public static EnumC1805420x5A LIZ(String str) {
        for (EnumC1805420x5A enumC1805420x5A : EnumC1805420x5A.values()) {
            if (Intrinsics.LJFF(enumC1805420x5A.getValue(), str)) {
                return enumC1805420x5A;
            }
        }
        return EnumC1805420x5A.OTHERS;
    }
}
