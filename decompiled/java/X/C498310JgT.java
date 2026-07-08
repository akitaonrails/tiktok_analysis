package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0JgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498310JgT {
    public static boolean LIZ() {
        InterfaceC500940Jki interfaceC500940JkiUser;
        User userLJIJJLI;
        User.EnigmaInfo enigmaInfo;
        UserService userService = UserService.getInstance();
        return (userService == null || (interfaceC500940JkiUser = userService.user()) == null || (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) == null || (enigmaInfo = userLJIJJLI.enigmaInfo) == null || !enigmaInfo.isEnigmaMaskOn) ? false : true;
    }
}
