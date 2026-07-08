package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FakeDataInfo;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Pq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C657150Pq5 {
    public static final C657150Pq5 LIZ = new C657150Pq5();

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.base.model.UrlModel LIZ(com.ss.android.ugc.aweme.profile.model.User r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L2c
            java.lang.String r0 = r3.getUid()
        L7:
            boolean r0 = LIZLLL(r0)
            if (r0 != 0) goto L25
            if (r3 == 0) goto L24
            com.ss.android.ugc.aweme.profile.model.FakeDataInfo r0 = r3.fakeDataInfo
            if (r0 == 0) goto L27
            java.lang.Boolean r1 = r0.isFakeAvatar()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L25
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r2.<init>()
        L24:
            return r2
        L25:
            if (r3 == 0) goto L24
        L27:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r3.getAvatarThumb()
            return r2
        L2c:
            r0 = r2
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C657150Pq5.LIZ(com.ss.android.ugc.aweme.profile.model.User):com.ss.android.ugc.aweme.base.model.UrlModel");
    }

    public static String LIZIZ(User user) {
        String str;
        if (LIZLLL(user.getUid())) {
            return user.getNickname();
        }
        FakeDataInfo fakeDataInfo = user.fakeDataInfo;
        if (fakeDataInfo != null && (str = fakeDataInfo.fakeNickname) != null && str.length() != 0) {
            return str;
        }
        return user.getNickname();
    }

    public static String LIZJ(User user) {
        String str;
        if (LIZLLL(user.getUid())) {
            return user.getUniqueId();
        }
        FakeDataInfo fakeDataInfo = user.fakeDataInfo;
        if (fakeDataInfo != null && (str = fakeDataInfo.fakeUsername) != null && str.length() != 0) {
            return str;
        }
        return user.getUniqueId();
    }

    public static boolean LIZLLL(String str) {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            return TextUtils.equals(iUserService.getCurrentUserID(), str);
        }
        return false;
    }
}
