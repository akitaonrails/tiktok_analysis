package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13EH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13EH {
    public static final boolean LIZ(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.LJI(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
