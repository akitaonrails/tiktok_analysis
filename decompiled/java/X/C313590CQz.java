package X;

import android.content.ContentResolver;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0CQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313590CQz {
    public static String LIZ(ContentResolver contentResolver) {
        if (TextUtils.equals("android_id", "android_id")) {
            if (C10EU.LJIILIIL() && C20123713oZ.LIZ()) {
                return "";
            }
            if (TextUtils.isEmpty(C20123713oZ.LIZ)) {
                C20123713oZ.LIZ = C2204961BRm.LLIIIL(contentResolver, "android_id", new C0WZX("dzBzEgAjS8/YVFkiQFyGYmPHmplJNuk8lSiKE+yeYZ6COQdJnmBCmpvS", null));
            }
            return C20123713oZ.LIZ;
        }
        return C2204961BRm.LLIIIL(contentResolver, "android_id", new C0WZX("dzBzEgAjS8/YVFkiQFyGYmPHmplJNuk8lSiKE+yeYZ6COQdJnmBCmpvS", null));
    }
}
