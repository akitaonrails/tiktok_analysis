package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

/* JADX INFO: renamed from: X.0igw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252240igw {
    public static final C1252240igw LIZ = new C1252240igw();

    public static void LIZIZ(Context context, User user, String str, String str2, String str3, Map map) {
        IMUser.Companion.getClass();
        IMUser iMUserLIZJ = C2201941BFw.LIZJ(user);
        if (iMUserLIZJ == null) {
            return;
        }
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        EnterChatParams enterChatParams = new EnterChatParams(context, iMUserLIZJ);
        enterChatParams.setEnterFromForMob(str);
        enterChatParams.setEnterFromSubPage(str3);
        C0SDC.LIZ.getClass();
        enterChatParams.setButtonType(C0SDC.LIZ(context, user));
        enterChatParams.setEnterMethodForMob(str2);
        if (map != null) {
            enterChatParams.setExtraMobParams(map);
        }
        imChatService.LJIILLIIL(enterChatParams, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(X.C1252240igw r32, android.content.Context r33, com.ss.android.ugc.aweme.profile.model.User r34, java.lang.String r35, boolean r36, java.util.Map r37, int r38) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1252240igw.LIZ(X.0igw, android.content.Context, com.ss.android.ugc.aweme.profile.model.User, java.lang.String, boolean, java.util.Map, int):boolean");
    }
}
