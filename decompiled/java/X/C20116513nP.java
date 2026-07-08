package X;

import android.net.Uri;

/* JADX INFO: renamed from: X.13nP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20116513nP {
    public static Uri LIZ(String str) {
        return new Uri.Builder().scheme("local_file").authority("relative").path(str).build();
    }
}
