package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0glC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178000glC {
    public static EnumC1177980glA LIZ(String str) {
        for (EnumC1177980glA enumC1177980glA : EnumC1177980glA.values()) {
            if (Intrinsics.LJFF(enumC1177980glA.getCategory(), str)) {
                return enumC1177980glA;
            }
        }
        return null;
    }
}
