package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.model.StoryBulletListResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330500CxU {
    public static void LIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (!Intrinsics.LJFF(curUserId, C330530CxX.LJI)) {
            C330530CxX.LIZJ = null;
            C330530CxX.LJII.getValue().clear();
            C330530CxX.LJIIIIZZ.getValue().clear();
            C330530CxX.LJI = curUserId;
        }
        if (C330530CxX.LIZJ == null) {
            C330530CxX.LIZJ = new C330530CxX();
        }
    }

    public static void LIZIZ(String str) {
        StoryBulletListResponse storyBulletListResponse;
        Object obj;
        BaseResponse baseResponse;
        long j;
        int i;
        Map<String, InterfaceC330550CxZ> mapLIZIZ;
        Map map;
        C330530CxX c330530CxX = C330530CxX.LIZJ;
        String uid = null;
        if (c330530CxX != null && (map = (Map) c330530CxX.LIZIZ.getValue()) != null) {
            storyBulletListResponse = (StoryBulletListResponse) map.get(str);
        } else {
            storyBulletListResponse = null;
        }
        C330530CxX c330530CxX2 = C330530CxX.LIZJ;
        if (c330530CxX2 != null && (mapLIZIZ = c330530CxX2.LIZIZ()) != null) {
            obj = (InterfaceC330550CxZ) mapLIZIZ.get(str);
        } else {
            obj = null;
        }
        if (obj instanceof BaseResponse) {
            baseResponse = (BaseResponse) obj;
        } else {
            baseResponse = null;
        }
        if (storyBulletListResponse != null && baseResponse != null) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("item_id", str);
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser != null) {
            uid = curUser.getUid();
        }
        c0lab.LJ("author_id", uid);
        if (storyBulletListResponse != null) {
            j = storyBulletListResponse.LL;
        } else {
            j = -1;
        }
        c0lab.LIZIZ(j, "story_bullet_delay");
        if (baseResponse != null) {
            i = baseResponse.status_code;
        } else {
            i = -1;
        }
        c0lab.LIZ(i, "story_viewer_list_status_code");
        C20684815ws.LJIILLIIL("story_viewer_list_inconsist_with_bullet", c0lab.LIZ);
    }
}
