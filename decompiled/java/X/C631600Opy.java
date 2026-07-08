package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Opy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631600Opy {
    public static final C631600Opy LIZ = new C631600Opy();

    public static boolean LIZ() {
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        return (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || currentUser.getShowArtistPlaylist() != 1) ? false : true;
    }
}
