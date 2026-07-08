package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.11rH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19630911rH {
    public static final String LIZ(User user) {
        if (user != null && user.getNickname() != null) {
            return user.getNickname();
        }
        return "";
    }

    public static final String LIZIZ(User user) {
        String shortId;
        String remarkName;
        if (user == null) {
            return "";
        }
        String uniqueId = user.getUniqueId();
        if (uniqueId != null && uniqueId.length() != 0) {
            shortId = user.getUniqueId();
        } else {
            shortId = user.getShortId();
        }
        if (shortId != null && shortId.length() != 0) {
            return shortId;
        }
        if (TextUtils.isEmpty(user.getRemarkName())) {
            remarkName = user.getNickname();
            if (remarkName == null) {
                return "";
            }
        } else {
            remarkName = user.getRemarkName();
            if (remarkName == null) {
                return "";
            }
        }
        return remarkName;
    }
}
