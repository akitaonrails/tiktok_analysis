package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gwM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184920gwM {
    public static EnumC1184730gw3 LIZ(String str, boolean z) {
        EnumC1184730gw3 enumC1184730gw3 = EnumC1184730gw3.REGIONAL;
        if (!Intrinsics.LJFF(str, enumC1184730gw3.getTypeCode$poi_release())) {
            EnumC1184730gw3 enumC1184730gw32 = EnumC1184730gw3.UN_CLAIMED_STORE;
            if (Intrinsics.LJFF(str, enumC1184730gw32.getTypeCode$poi_release())) {
                if (z) {
                    return EnumC1184730gw3.CLAIMED_STORE;
                }
                return enumC1184730gw32;
            }
            EnumC1184730gw3 enumC1184730gw33 = EnumC1184730gw3.INDEPENDENT;
            Intrinsics.LJFF(str, enumC1184730gw33.getTypeCode$poi_release());
            return enumC1184730gw33;
        }
        return enumC1184730gw3;
    }
}
