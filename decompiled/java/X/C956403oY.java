package X;

import android.net.Uri;

/* JADX INFO: renamed from: X.03oY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C956403oY {
    public static final Uri LIZ(Uri uri, String str) {
        return uri.buildUpon().appendQueryParameter("trackParams", str).build();
    }
}
