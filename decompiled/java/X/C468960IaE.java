package X;

import com.bytedance.android.livesdk.model.Hashtag;

/* JADX INFO: renamed from: X.0IaE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468960IaE {
    public static final boolean LIZ(Hashtag hashtag) {
        String str;
        Long l;
        if (hashtag == null || (str = hashtag.title) == null || str.length() == 0 || (((l = hashtag.id) != null && l.longValue() == 0) || hashtag.id == null)) {
            return false;
        }
        return true;
    }
}
