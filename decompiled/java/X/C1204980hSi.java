package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204980hSi {
    public static EnumC1204690hSF LIZ(String str) {
        for (EnumC1204690hSF enumC1204690hSF : EnumC1204690hSF.values()) {
            if (Intrinsics.LJFF(enumC1204690hSF.getValue(), str)) {
                return enumC1204690hSF;
            }
        }
        return null;
    }
}
