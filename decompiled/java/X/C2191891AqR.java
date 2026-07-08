package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191891AqR {
    public static EnumC2191921AqU LIZ(int i) {
        for (EnumC2191921AqU enumC2191921AqU : EnumC2191921AqU.values()) {
            if (enumC2191921AqU.getType() == i) {
                return enumC2191921AqU;
            }
        }
        return EnumC2191921AqU.Unknown;
    }

    public static EnumC2191921AqU LIZIZ(String str) {
        for (EnumC2191921AqU enumC2191921AqU : EnumC2191921AqU.values()) {
            if (Intrinsics.LJFF(enumC2191921AqU.getAlias(), str.toLowerCase(Locale.ROOT))) {
                return enumC2191921AqU;
            }
        }
        return EnumC2191921AqU.Unknown;
    }
}
