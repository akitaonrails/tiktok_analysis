package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.0ZO8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZO8 {
    public static final String LIZ(String str) {
        String lowerCase;
        if (str != null && (lowerCase = str.toLowerCase(Locale.ROOT)) != null) {
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != 3446944) {
                if (iHashCode != 112202875) {
                    if (iHashCode == 950398559 && lowerCase.equals("comment")) {
                        return "";
                    }
                    return str;
                }
                if (!lowerCase.equals("video")) {
                    return str;
                }
                return "video_mode";
            }
            if (!lowerCase.equals("post")) {
                return str;
            }
            return "photo_mode";
        }
        return str;
    }

    public static final String LIZIZ(String str) {
        String lowerCase;
        if (str != null && (lowerCase = str.toLowerCase(Locale.ROOT)) != null) {
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != 3446944) {
                if (iHashCode != 112202875) {
                    if (iHashCode == 950398559 && lowerCase.equals("comment")) {
                        return "share_comment";
                    }
                    return str;
                }
                if (!lowerCase.equals("video")) {
                    return str;
                }
                return "share_video";
            }
            if (!lowerCase.equals("post")) {
                return str;
            }
            return "share_video";
        }
        return str;
    }
}
