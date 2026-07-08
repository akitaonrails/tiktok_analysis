package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i87, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230650i87 {
    public static EnumC1230500i7s LIZ(String str) {
        for (EnumC1230500i7s enumC1230500i7s : EnumC1230500i7s.values()) {
            if (Intrinsics.LJFF(enumC1230500i7s.getValue(), str)) {
                return enumC1230500i7s;
            }
        }
        return EnumC1230500i7s.UNKNOWN;
    }
}
