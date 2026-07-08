package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.android.livesdk.event.UserProfileEvent;

/* JADX INFO: renamed from: X.15C3, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15C3 extends C0J8P<FanTicketRanklistResponse.RanklistUser, C15C5> {
    public final Context LIZLLL;
    public final User LJ;
    public final FanTicketRanklistResponse.ResponseData LJFF;
    public final C11NJ LJI;
    public final int LJII;
    public final boolean LJIIIZ;
    public final boolean LIZIZ = false;
    public final boolean LIZJ = true;
    public final boolean LJIIIIZZ = false;

    public final void LJIIIIZZ(FanTicketRanklistResponse.RanklistUser ranklistUser) {
        User user;
        String str;
        C930480aJy c930480aJy = C930480aJy.LIZ;
        Context context = this.LIZLLL;
        C11NJ c11nj = this.LJI;
        c930480aJy.getClass();
        if (C930480aJy.LJ("openUserProfile", context, c11nj) && (user = ranklistUser.user) != null) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(user, "multi_guest");
            userProfileEvent.mReportType = "report_user";
            userProfileEvent.mSource = "guest_connection";
            userProfileEvent.mClickUserPosition = "profile_card";
            if (this.LIZIZ) {
                str = "guest_ranking_popup";
            } else {
                str = "guest_ranking";
            }
            userProfileEvent.cardEnterFrom = str;
            userProfileEvent.enigmaEnterFrom = "active_user_rank";
            C784440Upu.LIZ().LIZIZ(userProfileEvent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0238  */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.15C7, java.lang.Object] */
    @Override // X.C0J8P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(androidx.recyclerview.widget.RecyclerView.ViewHolder r17, com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse.RanklistUser r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15C3.LIZJ(androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object):void");
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C15C5(viewGroup);
    }

    public C15C3(Context context, User user, FanTicketRanklistResponse.ResponseData responseData, C11NJ c11nj, int i, boolean z) {
        this.LIZLLL = context;
        this.LJ = user;
        this.LJFF = responseData;
        this.LJI = c11nj;
        this.LJII = i;
        this.LJIIIZ = z;
    }
}
