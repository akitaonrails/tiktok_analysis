package X;

import com.bytedance.scene.Scene;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593850rZv {
    public static final C1593850rZv LIZ = new C1593850rZv();

    public static void LIZIZ(String str) {
        C20684815ws.LJIJI("homepage_return_guide", new Pair("repost_feed", "enter_from"), new Pair(str, "action_type"));
    }

    public static void LIZJ(int i, String str, List list) {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair(Integer.valueOf(i), "count");
        pairArr[1] = new Pair(C08JS.LIZLLL(list), "group_ids");
        if (str == null) {
            str = "";
        }
        pairArr[2] = new Pair(str, "log_id");
        C20684815ws.LJIJI("repost_load_more_as_upvote_empty", pairArr);
    }

    public static void LIZ(int i, int i2, long j, String str) {
        C20684815ws.LJIJI("repost_db_load_time", new Pair(str, "load_type"), new Pair(Long.valueOf(j), "duration"), new Pair(Integer.valueOf(i), "pull_type"), new Pair(Integer.valueOf(i2), Scene.SCENE_SERVICE));
    }
}
