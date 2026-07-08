package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.08lV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2211508lV {
    public static final C830490Whz<String, Uri> LIZ = new C830490Whz<>();

    public static synchronized Uri LIZ(String str) {
        Uri uri;
        C830490Whz<String, Uri> c830490Whz = LIZ;
        uri = c830490Whz.get(str);
        if (uri == null) {
            uri = UriProtector.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            c830490Whz.put(str, uri);
        }
        return uri;
    }
}
