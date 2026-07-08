package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.im.service.service.QuickDMEventParam;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0SY3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SY3 {
    public static final C0SY3 LIZ = new C0SY3();

    public static void LIZ(Context context, Fragment fragment, InterfaceC1361270lWn interfaceC1361270lWn, User user, FriendsV3PlayerAbility friendsV3PlayerAbility) {
        C19EG c19egLIZIZ;
        String strLIZIZ;
        C0RJN c0rjnLIZIZ;
        C0RJN c0rjnLIZIZ2;
        String aid;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            if (((Boolean) C136200fY.LIZ.getValue()).booleanValue() && (supportFragmentManager.LJLJJI() || supportFragmentManager.LJL())) {
                return;
            }
            IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
            String authorUid = null;
            if (C289040BUo.LIZ()) {
                C1243240iSQ.LIZ.getClass();
                strLIZIZ = C1710306mr.LIZIZ(2131830719, C1243240iSQ.LIZ(user, true));
            } else {
                strLIZIZ = null;
            }
            Aweme aweme = interfaceC1361270lWn.getAweme();
            if (fragment != null) {
                c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment);
            } else {
                c0rjnLIZIZ = null;
            }
            String strLIZ = C1389300mG0.LIZ(c0rjnLIZIZ);
            EnumC896890ZGl enumC896890ZGl = EnumC896890ZGl.TYPE_MUF_QUICK_ENTRANCE;
            if (fragment != null) {
                c0rjnLIZIZ2 = C1578630rBN.LIZIZ(fragment);
            } else {
                c0rjnLIZIZ2 = null;
            }
            String strLIZ2 = C1389300mG0.LIZ(c0rjnLIZIZ2);
            Aweme aweme2 = interfaceC1361270lWn.getAweme();
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            Aweme aweme3 = interfaceC1361270lWn.getAweme();
            if (aweme3 != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme3);
            }
            C1351870lHd c1351870lHd = CommentSharePackage.Companion;
            User userLLILLL = interfaceC1361270lWn.LLILLL();
            c1351870lHd.getClass();
            imChatService.LIZIZ(c19egLIZIZ, supportFragmentManager, user, aweme, strLIZ, null, null, null, false, false, enumC896890ZGl, strLIZIZ, null, "", new QuickDMEventParam("feed", strLIZ2, aid, authorUid, String.valueOf(C1351870lHd.LIZIZ(userLLILLL)), null, null, null, false, false, C1389300mG0.LIZIZ(fragment), false, 12256), null, null, null, null, null, true, new AwS590S0100000_11(friendsV3PlayerAbility, 532), new AwS555S0100000_11(friendsV3PlayerAbility, 1601));
        }
    }
}
