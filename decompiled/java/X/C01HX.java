package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import java.util.List;

/* JADX INFO: renamed from: X.01HX, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01HX {
    public final User LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final List<FanTicketRanklistResponse.RanklistUser> LIZLLL;
    public final User LJ;
    public final FanTicketRanklistResponse.ResponseData LJFF;

    public C01HX(User user, long j, long j2, List<FanTicketRanklistResponse.RanklistUser> list, User user2, FanTicketRanklistResponse.ResponseData responseData) {
        this.LIZ = user;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = list;
        this.LJ = user2;
        this.LJFF = responseData;
    }
}
