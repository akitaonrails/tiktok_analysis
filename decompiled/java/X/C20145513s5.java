package X;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13s5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20145513s5 {
    public static String LIZ(Uri uri) {
        String authority = uri.getAuthority();
        if (Intrinsics.LJFF(authority, "com.android.calendar")) {
            return "calendar";
        }
        if (Intrinsics.LJFF(authority, "com.android.contacts")) {
            return "contact";
        }
        return "contentProvider";
    }
}
