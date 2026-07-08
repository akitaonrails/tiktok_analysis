package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uu3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721650uu3 {
    public static EnumC1721510utp LIZ(String str) {
        if (Intrinsics.LJFF(str, "SUCCESS")) {
            return EnumC1721510utp.SUCCESS;
        }
        if (Intrinsics.LJFF(str, "FAILED")) {
            return EnumC1721510utp.FAILED;
        }
        return null;
    }
}
