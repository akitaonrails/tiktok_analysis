package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0OB3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OB3 {
    public static final String LIZ(Aweme aweme) {
        if (aweme != null) {
            int awemeType = aweme.getAwemeType();
            if (awemeType != 41 && awemeType != 150 && awemeType != 152) {
                return "non_photo_mode";
            }
            return "photo_mode";
        }
        return null;
    }
}
