package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586610Mzb {
    public static final boolean LIZ(String str) {
        if (!Intrinsics.LJFF(str, EnumC586600Mza.ID_NEW_VERSION.getValue()) && !Intrinsics.LJFF(str, EnumC586600Mza.EU_NEW_VERSION.getValue())) {
            return false;
        }
        return true;
    }
}
