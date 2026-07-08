package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Kk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21266818Kk {
    public static EnumC21266618Ki LIZ(String str) {
        for (EnumC21266618Ki enumC21266618Ki : EnumC21266618Ki.values()) {
            if (Intrinsics.LJFF(enumC21266618Ki.getValue(), str)) {
                return enumC21266618Ki;
            }
        }
        return EnumC21266618Ki.UNKNOWN;
    }

    public static boolean LIZIZ(String str) {
        for (EnumC21266618Ki enumC21266618Ki : EnumC21266618Ki.values()) {
            if (Intrinsics.LJFF(enumC21266618Ki.getValue(), str) && enumC21266618Ki != EnumC21266618Ki.UNKNOWN) {
                return true;
            }
        }
        return false;
    }

    public static EnumC21266718Kj LIZJ(String str) {
        if (Intrinsics.LJFF(str, EnumC21266618Ki.EC.getValue())) {
            return EnumC21266718Kj.EC;
        }
        if (Intrinsics.LJFF(str, EnumC21266618Ki.LOCAL_SERVICE.getValue())) {
            return EnumC21266718Kj.LOCAL_SERVICE;
        }
        if (Intrinsics.LJFF(str, EnumC21266618Ki.BUSINESS.getValue())) {
            return EnumC21266718Kj.BUSINESS;
        }
        return EnumC21266718Kj.NONE;
    }
}
