package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0J4u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486180J4u {
    public static final long LIZ(User user) {
        Long lLJIILIIL;
        String str = user.roomIdStr;
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            return lLJIILIIL.longValue();
        }
        return user.roomId;
    }
}
