package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775850Uc3 {
    public static EnumC775860Uc4 LIZ(String str) {
        for (EnumC775860Uc4 enumC775860Uc4 : EnumC775860Uc4.values()) {
            if (Intrinsics.LJFF(enumC775860Uc4.getLevelName(), str)) {
                return enumC775860Uc4;
            }
        }
        return EnumC775860Uc4.NONE;
    }
}
