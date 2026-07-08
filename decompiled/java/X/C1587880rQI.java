package X;

import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedModel;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0rQI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587880rQI {
    public long LIZIZ;
    public long LIZ = -1;
    public final ConcurrentHashMap<String, C1588160rQk> LIZJ = new ConcurrentHashMap<>();

    public final void LIZ(String str, int i, int i2, int i3, FriendsV3FeedResponse friendsV3FeedResponse, EnumC1587000rOs enumC1587000rOs, EnumC1586970rOp enumC1586970rOp) {
        if (friendsV3FeedResponse != null) {
            LIZIZ(str, true, i, i2, i3, friendsV3FeedResponse, null, enumC1587000rOs, enumC1586970rOp);
        } else {
            LIZIZ(str, false, i, i2, i3, null, null, enumC1587000rOs, enumC1586970rOp);
        }
    }

    public final void LIZIZ(String str, boolean z, int i, int i2, int i3, FriendsV3FeedResponse friendsV3FeedResponse, Throwable th, EnumC1587000rOs enumC1587000rOs, EnumC1586970rOp enumC1586970rOp) {
        Integer numValueOf;
        String message;
        int size;
        boolean zBooleanValue;
        Boolean bool;
        List<FriendsV3FeedModel> list;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1588160rQk c1588160rQk = this.LIZJ.get(str);
        if (c1588160rQk == null) {
            return;
        }
        if (!c1588160rQk.LIZ) {
            this.LIZJ.remove(str);
        }
        long j = jCurrentTimeMillis - c1588160rQk.LIZJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LJIIIIZZ("is_success", C1529305yl.LIZ(Boolean.valueOf(z)));
        String scene = null;
        if (friendsV3FeedResponse != null) {
            numValueOf = Integer.valueOf(friendsV3FeedResponse.status_code);
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "status_code");
        if (friendsV3FeedResponse == null || (message = friendsV3FeedResponse.status_msg) == null) {
            if (th != null) {
                message = th.getMessage();
            } else {
                message = null;
            }
        }
        c2344009Gk.LJIIIIZZ("status_msg", message);
        c2344009Gk.LIZJ(i, "pull_type");
        if (friendsV3FeedResponse != null && (list = friendsV3FeedResponse.friendsV3Feeds) != null) {
            size = list.size();
        } else {
            size = -1;
        }
        c2344009Gk.LIZJ(size, "aweme_count");
        c2344009Gk.LIZJ(i2, "preload");
        if (friendsV3FeedResponse != null && (bool = friendsV3FeedResponse.hasMore) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c2344009Gk.LJIIIIZZ("has_more", C1529305yl.LIZ(Boolean.valueOf(zBooleanValue)));
        c2344009Gk.LIZJ(i3, "retry_count");
        if (enumC1587000rOs != null) {
            scene = enumC1587000rOs.getScene();
        }
        c2344009Gk.LJIIIIZZ("preload_scene", scene);
        c2344009Gk.LJIIIIZZ("red_dot_source", C1586540rO8.LIZ(enumC1586970rOp));
        c2344009Gk.LJIIIIZZ("is_background_request", C1529305yl.LIZ(Boolean.valueOf(C1906580ziK.LJI())));
        Long l = c1588160rQk.LIZLLL;
        if (l != null) {
            c2344009Gk.LIZLLL(jCurrentTimeMillis - l.longValue(), "retry_chain_duration");
        }
        long j2 = c1588160rQk.LIZIZ;
        if (j2 != -1) {
            c2344009Gk.LIZLLL(c1588160rQk.LIZJ - j2, "to_last_request_internal");
        }
        C20684815ws.LJIILLIIL("friends3_page_data_request", c2344009Gk.LIZ);
    }
}
