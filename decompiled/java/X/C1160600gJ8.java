package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gJ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160600gJ8 {
    public static EnumC1160590gJ7 LIZ(String str) {
        for (EnumC1160590gJ7 enumC1160590gJ7 : EnumC1160590gJ7.values()) {
            if (Intrinsics.LJFF(enumC1160590gJ7.getValue().toLowerCase(Locale.getDefault()), str.toLowerCase(Locale.getDefault()))) {
                return enumC1160590gJ7;
            }
        }
        return null;
    }
}
