package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0t16, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649140t16 {
    public static EnumC1285050jXr LIZ(String str) {
        if (Intrinsics.LJFF(str, EnumC1647570syZ.RECORD_NOW.getTag())) {
            return EnumC1285050jXr.NOWS;
        }
        if (Intrinsics.LJFF(str, EnumC1647570syZ.LIVE.getTag())) {
            return EnumC1285050jXr.LIVE;
        }
        return EnumC1285050jXr.NORMAL;
    }
}
