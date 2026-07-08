package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13uL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20159513uL {
    public static EnumC20159313uJ LIZ(String str) {
        for (EnumC20159313uJ enumC20159313uJ : EnumC20159313uJ.values()) {
            if (Intrinsics.LJFF(enumC20159313uJ.getValue(), str)) {
                return enumC20159313uJ;
            }
        }
        return null;
    }
}
