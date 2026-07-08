package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0HCK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HCK {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(User user) {
        if (user.getNickname() != null) {
            return user.getNickname();
        }
        if (!TextUtils.isEmpty(user.getUniqueId())) {
            return user.getUniqueId();
        }
        if (!TextUtils.isEmpty(user.getShortId())) {
            return user.getShortId();
        }
        return "";
    }
}
