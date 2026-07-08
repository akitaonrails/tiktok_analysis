package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0HjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449260HjY {
    public static final C449260HjY LIZ = new C449260HjY();
    public static final Keva LIZIZ = Keva.getRepo("story_highlights");

    public static String LIZ() {
        User currentUser;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        String uid = (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) ? null : currentUser.getUid();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("STORY_HIGHLIGHTS_CREATE_TOOLTIP_SHOW_");
        sbLIZ.append(uid);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
