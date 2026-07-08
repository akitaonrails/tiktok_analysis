package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.OptAvatarLargeUseSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0JLW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JLW {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(User user) {
        ImageModel avatarLarge;
        List urls;
        ImageModel avatarThumb;
        List urls2;
        if (OptAvatarLargeUseSetting.INSTANCE.enable()) {
            if (user != null && (avatarThumb = user.getAvatarThumb()) != null && (urls2 = avatarThumb.getUrls()) != null) {
                return (String) C13LP.LJJJLL(urls2);
            }
            return null;
        }
        if (user != null && (avatarLarge = user.getAvatarLarge()) != null && (urls = avatarLarge.getUrls()) != null) {
            return (String) C13LP.LJJJLL(urls);
        }
        return null;
    }

    public static String LIZIZ(SMBPreviewResponse.ResponseData responseData) {
        ImageModel avatarLarge;
        List urls;
        ImageModel avatarThumb;
        List urls2;
        if (OptAvatarLargeUseSetting.INSTANCE.enable()) {
            User user = responseData.anchorData;
            if (user != null && (avatarThumb = user.getAvatarThumb()) != null && (urls2 = avatarThumb.getUrls()) != null) {
                return (String) C13LP.LJJJLL(urls2);
            }
            return null;
        }
        User user2 = responseData.anchorData;
        if (user2 != null && (avatarLarge = user2.getAvatarLarge()) != null && (urls = avatarLarge.getUrls()) != null) {
            return (String) C13LP.LJJJLL(urls);
        }
        return null;
    }

    public static String LIZJ(Room room) {
        if (room != null && room.getOwner() != null) {
            return LIZ(room.getOwner());
        }
        return LIZ(UserService.getInstance().user().LJIJJLI());
    }
}
