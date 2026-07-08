package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;

/* JADX INFO: renamed from: X.0TrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759810TrH {
    public static final C759810TrH LIZ = new C759810TrH();

    public static void LIZ(Context context, String str, String str2) {
        String strLJIJI = C497740JfY.LJIJI(2131855309);
        IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_is_from_live_replay", true);
        C786410Ut5.LJJJI("default_playlist_name", strLJIJI, bundle);
        iMixFeedService.LJJIIJ(context, bundle, 1, str, str2);
    }

    public static void LIZIZ(Context context, String str, int i, String str2) {
        User user;
        String idStr;
        String secUid;
        User user2;
        User user3;
        User user4;
        InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
        if ((currentUser instanceof User) && (user4 = (User) currentUser) != null) {
            user4.getIdStr();
        }
        InterfaceC2262081DgM currentUser2 = UserService.getInstance().user().getCurrentUser();
        if ((currentUser2 instanceof User) && (user3 = (User) currentUser2) != null) {
            user3.getSecUid();
        }
        IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
        InterfaceC2262081DgM currentUser3 = UserService.getInstance().user().getCurrentUser();
        if (currentUser3 instanceof User) {
            user = (User) currentUser3;
        } else {
            user = null;
        }
        if (user == null || (idStr = user.getIdStr()) == null) {
            idStr = "";
        }
        InterfaceC2262081DgM currentUser4 = UserService.getInstance().user().getCurrentUser();
        if (!(currentUser4 instanceof User) || (user2 = (User) currentUser4) == null || (secUid = user2.getSecUid()) == null) {
            secUid = "";
        }
        iMixFeedService.LJIIZILJ(context, str, idStr, secUid, i, str2, Boolean.TRUE);
    }
}
