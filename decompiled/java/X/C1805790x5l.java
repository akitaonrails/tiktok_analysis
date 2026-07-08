package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0x5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805790x5l {
    public static EnumC1805800x5m LIZ(String str) {
        if (Intrinsics.LJFF(str, "my_profile")) {
            return EnumC1805800x5m.PROFILE;
        }
        if (str != null && a0.LJJIIZI(str, "ug_task", false)) {
            return EnumC1805800x5m.UG_TASK;
        }
        for (EnumC1805800x5m enumC1805800x5m : EnumC1805800x5m.values()) {
            if (Intrinsics.LJFF(enumC1805800x5m.getValue(), str)) {
                return enumC1805800x5m;
            }
        }
        return EnumC1805800x5m.OTHERS;
    }
}
