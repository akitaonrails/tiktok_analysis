package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aZn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940290aZn {
    public static final EnumC939900aZA LIZ(String str) {
        for (EnumC939900aZA enumC939900aZA : EnumC939900aZA.values()) {
            if (Intrinsics.LJFF(enumC939900aZA.getIdentifier(), str)) {
                return enumC939900aZA;
            }
        }
        return null;
    }
}
