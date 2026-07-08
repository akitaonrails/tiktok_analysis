package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.message.CompetitionMessage;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.scene.Scene;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0bT4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C974560bT4 extends AbstractC963310bAv {
    public static final /* synthetic */ int LJII = 0;
    public final String LJI = "ttlive_client_anchor_take_stage_monitor";

    @Override // X.AbstractC962030b8r
    public int LJIJ() {
        return 1;
    }

    @Override // X.AbstractC962030b8r
    public boolean LJIJJ() {
        return true;
    }

    @Override // X.AbstractC963310bAv, X.AbstractC962030b8r
    public final void LJIILLIIL() {
        String string;
        C981550beL c981550beL;
        C981550beL c981550beL2;
        Object next;
        super.LJIILLIIL();
        List listLIZLLL = C973890bRz.LIZLLL();
        Boolean boolValueOf = null;
        if (listLIZLLL != null) {
            Iterator it2 = listLIZLLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (((GiftMode) next).giftId == C973890bRz.LJII) {
                        break;
                    }
                }
            }
            GiftMode giftMode = (GiftMode) next;
            if (giftMode != null) {
                long j = giftMode.giftId;
                if (j > 0) {
                    AbstractC962030b8r.LJIIJ(this.LIZLLL, "gift_id", Long.valueOf(j), true);
                }
            }
        }
        EnumC919170a1j enumC919170a1jLIZIZ = C962910bAH.LIZIZ();
        EnumC919170a1j.Companion.getClass();
        LJIIL(C917350Zyn.LIZ(enumC919170a1jLIZIZ), "match_type", true);
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 == null || (string = Long.valueOf(c981480beEM91.LJIIIZ).toString()) == null) {
            string = "";
        }
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "battle_id", string, true);
        C981480beE c981480beEM912 = C915980Zwa.LIZIZ().M91(false);
        if (C500260Jjc.LJJJI((c981480beEM912 == null || (c981550beL2 = c981480beEM912.LJJIJ) == null) ? null : Boolean.valueOf(c981550beL2.LIZJ))) {
            LJIIL("inviter", "role_type", false);
        } else {
            LJIIL("invitee", "role_type", false);
        }
        C981480beE c981480beEM913 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM913 != null && (c981550beL = c981480beEM913.LJJIJ) != null) {
            boolValueOf = Boolean.valueOf(c981550beL.LIZLLL);
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            LJIIL("rematch", "invite_type", true);
        } else {
            LJIIL("normal", "invite_type", true);
        }
        if (C973930bS3.LJ()) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "performer_uid", Long.valueOf(C973930bS3.LIZLLL()), true);
        }
    }

    public final void LJJIII() {
        C981550beL c981550beL;
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "rematch_count", (c981480beEM91 == null || (c981550beL = c981480beEM91.LJJIJ) == null) ? null : Long.valueOf(c981550beL.LJIILL), true);
    }

    @Override // X.AbstractC962030b8r
    public String LJIJI() {
        return this.LJI;
    }

    public final void LJJIFFI(AbstractC982800bgM abstractC982800bgM) {
        LJIL(abstractC982800bgM);
        Object obj = abstractC982800bgM.LIZIZ;
        if (!(obj instanceof CompetitionMessage)) {
            obj = null;
        }
        if (obj != null) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "accept_message_fetch_cost", Long.valueOf(AbstractC963310bAv.LJJI(abstractC982800bgM)), true);
        }
        if (abstractC982800bgM instanceof C982450bfn) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "action_by_userId", Long.valueOf(((C982450bfn) abstractC982800bgM).LJII), true);
        }
        LJJIII();
        LJIJJLI("accept_message");
    }

    public final void LJJJJ(AbstractC982800bgM abstractC982800bgM) {
        LJIL(abstractC982800bgM);
        if (abstractC982800bgM instanceof C982870bgT) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "action_by_userId", Long.valueOf(((C982870bgT) abstractC982800bgM).LJFF), true);
        }
        LJIJJLI("reject_message");
    }

    public final void LJJII(C982590bg1 c982590bg1, boolean z) {
        LJIILIIL();
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "log_id", c982590bg1.LIZ, true);
        LJIIL(Integer.valueOf(z ? 1 : 0), "is_last_accept", true);
        LJJIII();
        LJIJJLI("accept_succeed");
    }

    public final void LJJIIJZLJL(EnumC962960bAM enumC962960bAM, String str) {
        LJIIL("inviter", "role_type", true);
        AbstractC963310bAv.LJJ(this, enumC962960bAM);
        LJIILIIL();
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "log_id", str, true);
        LJIJJLI("cancel_succeed");
    }

    public final void LJJIIZ(int i, long j) {
        LJIIL(Long.valueOf(j), "match_duration", true);
        LJIIL(Integer.valueOf(i), "reason", true);
        LJIIL(Boolean.FALSE, "cut_short", true);
        LJIJJLI("battle_finish_request");
    }

    public final void LJJIIZI(String str, boolean z) {
        LJIILIIL();
        LJIIL(Boolean.valueOf(z), "cut_short", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "log_id", str, true);
        LJIJJLI("battle_finish_succeed");
    }

    public final void LJJIJIL(EnumC962960bAM enumC962960bAM, boolean z) {
        C981550beL c981550beL;
        long j;
        LJIIL("inviter", "role_type", true);
        AbstractC963310bAv.LJJ(this, enumC962960bAM);
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 != null && (c981550beL = c981480beEM91.LJJIJ) != null) {
            if (z) {
                j = c981550beL.LJIILL + 1;
            } else {
                j = 0;
            }
            c981550beL.LJIILL = j;
        }
        LJJIII();
        LJIJJLI("invite_request");
    }

    public final void LJJIJL(C982610bg3 c982610bg3, EnumC962960bAM enumC962960bAM) {
        BaseResponse baseResponse;
        R r;
        LJIIL("inviter", "role_type", true);
        AbstractC963310bAv.LJJ(this, enumC962960bAM);
        LJIILIIL();
        Object obj = c982610bg3.LIZIZ;
        if ((obj instanceof C470590Icr) && (baseResponse = (BaseResponse) obj) != null && (r = baseResponse.extra) != 0) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "invite_message_create_cost", Long.valueOf(r.now - this.LIZ), true);
        }
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "log_id", c982610bg3.LIZ, true);
        LJJIII();
        LJIJJLI("invite_succeed");
    }

    public final void LJJJ(EnumC962960bAM enumC962960bAM, String str) {
        LJIIL(str, "reason", true);
        AbstractC963310bAv.LJJ(this, enumC962960bAM);
        LJIIL("invitee", "role_type", true);
        LJIJJLI("receive_panel_dismiss");
    }

    public static void LJJIIJ(C974560bT4 c974560bT4, String str, EnumC962960bAM enumC962960bAM) {
        c974560bT4.LJIIL("inviter", "role_type", true);
        AbstractC963310bAv.LJJ(c974560bT4, enumC962960bAM);
        c974560bT4.LJIIL(str, "reason", true);
        c974560bT4.LJIJJLI("cancel_request");
    }

    public static void LJJJJI(C974560bT4 c974560bT4, String str, EnumC962960bAM enumC962960bAM) {
        c974560bT4.LJIIL(str, "reason", true);
        c974560bT4.LJIIL("invitee", "role_type", true);
        AbstractC963310bAv.LJJ(c974560bT4, enumC962960bAM);
        c974560bT4.LJIJJLI("reject_request");
    }

    public final void LJJIJ(Throwable th, long j, EnumC962960bAM enumC962960bAM) {
        LJIIL("inviter", "role_type", true);
        AbstractC963310bAv.LJJ(this, enumC962960bAM);
        LJIIJJI(th);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "cost", Long.valueOf(j), true);
        LJJIII();
        LJIJJLI("invite_failed");
    }

    public final void LJJIJIIJI(boolean z, EnumC962960bAM enumC962960bAM, long j) {
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "rematch_stauts", Boolean.valueOf(z), true);
        AbstractC963310bAv.LJJ(this, enumC962960bAM);
        LJIIL("inviter", "role_type", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "prepare_invite_duration", Long.valueOf(j), true);
        LJIJJLI("invite_panel_show");
    }

    public final void LJJIJIIJIL(String str, boolean z, EnumC962960bAM enumC962960bAM) {
        LJIIL(Boolean.valueOf(z), "isRematch", true);
        LJIIL(str, "reason", true);
        AbstractC963310bAv.LJJ(this, enumC962960bAM);
        LJIIL("inviter", "role_type", true);
        LJIJJLI("invite_panel_show_failed");
    }

    public final void LJJIJLIJ(long j, String str, boolean z) {
        LJIIL(Long.valueOf(j), "match_duration", true);
        LJIIL(str, "reason", true);
        LJIIL(Boolean.valueOf(z), "cut_short", true);
        LJIJJLI("leave_linkmic_request");
    }

    public final void LJJIL(long j, String str, boolean z) {
        LJIIL(Boolean.valueOf(z), "cut_short", true);
        LJIIL(str, "reason", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "punish_duration", Long.valueOf(j), true);
        LJIJJLI("punish_finish_request");
    }

    public final void LJJIZ(int i, long j, EnumC962960bAM enumC962960bAM) {
        LJIIL(Integer.valueOf(i), "selection", true);
        LJIIL("normal", Scene.SCENE_SERVICE, true);
        AbstractC962030b8r.LJIIJ(this.LIZJ, "show_to_decide_dur", Long.valueOf(j), true);
        AbstractC963310bAv.LJJ(this, enumC962960bAM);
        LJIIL("invitee", "role_type", true);
        LJJIII();
        LJIJJLI("receive_panel_click");
    }

    public final void LJJJIL(Throwable th, EnumC962960bAM enumC962960bAM, String str) {
        LJIIJJI(th);
        LJIIL("invitee", "role_type", true);
        AbstractC963310bAv.LJJ(this, enumC962960bAM);
        LJIIL(str, "reason", true);
        LJIJJLI("reject_failed");
    }

    public final void LJJJJIZL(C982590bg1 c982590bg1, EnumC962960bAM enumC962960bAM, String str) {
        LJIILIIL();
        AbstractC963310bAv.LJJ(this, enumC962960bAM);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "log_id", c982590bg1.LIZ, true);
        LJIIL(str, "reason", true);
        LJIIL("invitee", "role_type", true);
        LJIJJLI("reject_succeed");
    }

    public final void LJJJI(boolean z, boolean z2, EnumC962960bAM enumC962960bAM, long j) {
        String str;
        if (z2) {
            str = "invite_each_other";
        } else if (z) {
            str = "normal";
        } else {
            str = "match_icon";
        }
        LJIIL(str, Scene.SCENE_SERVICE, true);
        LJIIL("invite", "message_type", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "prepare_duration", Long.valueOf(j), true);
        LJIIL("invitee", "role_type", true);
        AbstractC963310bAv.LJJ(this, enumC962960bAM);
        LJJIII();
        LJIJJLI("receive_panel_show");
    }
}
