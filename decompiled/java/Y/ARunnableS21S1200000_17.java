package Y;

import X.AbstractC1143290frD;
import X.C0IJT;
import X.C0K04;
import X.C1085000eLC;
import X.C1095140ebY;
import X.C1096410edb;
import X.C1118340fCy;
import X.C1161920gLG;
import X.C1C7U;
import X.C20441214yg;
import X.C474500IjA;
import X.C766270U4b;
import X.C786410Ut5;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftRankingExclusiveTabSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS21S1200000_17 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C766270U4b.LJIIJJI(this.s0);
        C1096410edb c1096410edb = (C1096410edb) this.l1;
        int i = c1096410edb.LIZ;
        Room room = c1096410edb.LJ;
        C1095140ebY c1095140ebYUw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).uw0();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_team_points_contribute_toast");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(i), "contribute_amount");
        c474500IjALIZ.LJJII(Long.valueOf(room != null ? room.getId() : 0L), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(room != null ? room.getOwnerUserId() : 0L), "anchor_id");
        long jIb1 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Ib1();
        JSONObject jSONObject = new JSONObject();
        C0K04.LIZLLL(c1095140ebYUw0 != null ? c1095140ebYUw0.LJ : 0, "fans_club_relation_status", jSONObject);
        C0K04.LJ("fans_club_level", c1095140ebYUw0 != null ? c1095140ebYUw0.LIZ : 0L, jSONObject);
        C0K04.LJ("scores_to_next_level", jIb1, jSONObject);
        c474500IjALIZ.LJJII(jSONObject, "fans_club_relation_info");
        long jCurrentTimeMillis = System.currentTimeMillis();
        w.LIZ.getClass();
        long jLJFF = jCurrentTimeMillis - w.LJFF();
        c474500IjALIZ.LJJII(Long.valueOf(jLJFF >= 0 ? jLJFF : 0L), "duration_after_watch");
        c474500IjALIZ.LIZ();
        C1118340fCy c1118340fCy = (C1118340fCy) this.l2;
        Handler handler = c1118340fCy.LJIIJ;
        if (handler != null) {
            C786410Ut5.LJLIIL(LiveGiftRankingExclusiveTabSetting.INSTANCE.getToastDisplayDuration() * 1000, handler, new ARunnableS117S0100000_17(c1118340fCy, 243));
        }
    }

    public static final void run$0(ARunnableS21S1200000_17 aRunnableS21S1200000_17) {
        CommentWidget commentWidget = (CommentWidget) aRunnableS21S1200000_17.l1;
        String str = aRunnableS21S1200000_17.s0;
        C1085000eLC c1085000eLC = (C1085000eLC) aRunnableS21S1200000_17.l2;
        commentWidget.getClass();
        C1C7U.LIZ("CommentWidget@f00c.showRethinkDialog$1L");
        commentWidget.LLLFF = true;
        commentWidget.I1(str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_rethink_cg_ck");
        c474500IjALIZ.LJIJJLI(commentWidget.dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(c1085000eLC.LJIIJ, "comment");
        c474500IjALIZ.LJJII(Integer.valueOf(TextUtils.equals(c1085000eLC.LJIIIZ, c1085000eLC.LJIIJ) ? 1 : 0), "resend_same_cmt");
        c474500IjALIZ.LIZ();
        C1C7U.LIZIZ("CommentWidget@f00c.showRethinkDialog$1L");
    }

    public static final void run$1(ARunnableS21S1200000_17 aRunnableS21S1200000_17) {
        AbstractC1143290frD abstractC1143290frD = (AbstractC1143290frD) aRunnableS21S1200000_17.l1;
        String str = aRunnableS21S1200000_17.s0;
        Map map = (Map) aRunnableS21S1200000_17.l2;
        abstractC1143290frD.getClass();
        C1C7U.LIZ("TraceLogger@e3a7.d$3L");
        C20441214yg.LIZIZ(str, abstractC1143290frD.LJFF(str, AbstractC1143290frD.LJIIIZ(map)));
        C1C7U.LIZIZ("TraceLogger@e3a7.d$3L");
    }

    public static final void run$2(ARunnableS21S1200000_17 aRunnableS21S1200000_17) {
        AbstractC1143290frD abstractC1143290frD = (AbstractC1143290frD) aRunnableS21S1200000_17.l1;
        String str = aRunnableS21S1200000_17.s0;
        Map map = (Map) aRunnableS21S1200000_17.l2;
        abstractC1143290frD.getClass();
        C1C7U.LIZ("TraceLogger@e3a7.i$1L");
        C20441214yg.LJIIIZ(str, abstractC1143290frD.LJFF(str, AbstractC1143290frD.LJIIIZ(map)));
        C1C7U.LIZIZ("TraceLogger@e3a7.i$1L");
    }

    public static final void run$3(ARunnableS21S1200000_17 aRunnableS21S1200000_17) {
        AbstractC1143290frD abstractC1143290frD = (AbstractC1143290frD) aRunnableS21S1200000_17.l1;
        String str = aRunnableS21S1200000_17.s0;
        Map map = (Map) aRunnableS21S1200000_17.l2;
        abstractC1143290frD.getClass();
        C1C7U.LIZ("TraceLogger@e3a7.e$3L");
        C20441214yg.LJ(str, abstractC1143290frD.LJFF(str, AbstractC1143290frD.LJIIIZ(map)));
        C1C7U.LIZIZ("TraceLogger@e3a7.e$3L");
    }

    public static final void run$4(ARunnableS21S1200000_17 aRunnableS21S1200000_17) {
        AbstractC1143290frD abstractC1143290frD = (AbstractC1143290frD) aRunnableS21S1200000_17.l1;
        String str = aRunnableS21S1200000_17.s0;
        JSONObject jSONObject = (JSONObject) aRunnableS21S1200000_17.l2;
        abstractC1143290frD.getClass();
        C1C7U.LIZ("TraceLogger@e3a7.d$2L");
        C20441214yg.LIZIZ(str, abstractC1143290frD.LJFF(str, jSONObject));
        C1C7U.LIZIZ("TraceLogger@e3a7.d$2L");
    }

    public static final void run$5(ARunnableS21S1200000_17 aRunnableS21S1200000_17) {
        boolean zLIZ;
        C1C7U.LIZ("TeamRankManager@da65.consumeToast$1");
        try {
            aRunnableS21S1200000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TeamRankManager@da65.consumeToast$1");
    }

    public ARunnableS21S1200000_17(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
