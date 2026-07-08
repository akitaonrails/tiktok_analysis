package X;

import android.content.Context;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0idw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250380idw {
    public static void LIZ(Context context, User user, String str, OnActivityResultCallback onActivityResultCallback, String str2) {
        String str3;
        MutualStruct mutualStruct;
        List<MutualUser> list;
        if (user != null) {
            C666390QBx.LIZJ = user;
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//profile/follow_relation");
            smartRouteBuildRoute.withParam("uid", user.getUid());
            smartRouteBuildRoute.withParam("sec_uid", user.getSecUid());
            smartRouteBuildRoute.withParam("follow_relation_type", str);
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", str3);
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null && (mutualStruct = matchedFriendStruct.mMutualStruct) != null && (list = mutualStruct.userList) != null) {
                List listLJJJJLI = C13LP.LJJJJLI(list);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
                Iterator it2 = ((ArrayList) listLJJJJLI).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((MutualUser) it2.next()).getUid());
                }
                smartRouteBuildRoute.withParamStringList("mutual_relation_user_list", new ArrayList<>(arrayList));
                List listLJJJJLI2 = C13LP.LJJJJLI(list);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJJJLI2, 10));
                Iterator it3 = ((ArrayList) listLJJJJLI2).iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((MutualUser) it3.next()).getSecUid());
                }
                smartRouteBuildRoute.withParamStringList("mutual_relation_sec_user_list", new ArrayList<>(arrayList2));
            }
            smartRouteBuildRoute.open(3, new C1266040j3C(onActivityResultCallback, 1));
            if (Intrinsics.LJFF(str, "mutual_relation")) {
                C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                if (str2 == null) {
                    str2 = "";
                }
                String uid = user.getUid();
                c1253930ijf.getClass();
                C1253930ijf.LJIIJ(str2, "click_rec_label", uid, null);
            }
        }
    }
}
