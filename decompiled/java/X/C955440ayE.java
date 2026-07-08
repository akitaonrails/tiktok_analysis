package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionSourceTypeTrackingSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostAllowInviteWithApplySetting;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0ayE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955440ayE extends AbstractC962030b8r {
    public static final HashMap<Long, String> LJII = new HashMap<>();
    public final String LJI = "ttlive_client_anchor_cohost_monitor";

    @Override // X.AbstractC962030b8r
    public final boolean LJIJJ() {
        return true;
    }

    public final void LJIL() {
        int i;
        LJIIL(Integer.valueOf(LiveCoHostAllowInviteWithApplySetting.INSTANCE.enable() ? 1 : 0), "coexist_enable", true);
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        int i2 = 0;
        if ((listLJIJJ instanceof Collection) && listLJIJJ.isEmpty()) {
            i = 0;
        } else {
            for (C954460awe c954460awe : listLJIJJ) {
                if (c954460awe.LJJIIZ.isInviting() && c954460awe.LJIIJJI()) {
                    i = 1;
                    break;
                }
            }
            i = 0;
        }
        LJIIL(Integer.valueOf(i), "is_coexist_attempt", true);
        List<C954460awe> listLJIJJ2 = C915980Zwa.LJII().LJIJJ();
        if (!(listLJIJJ2 instanceof Collection) || !listLJIJJ2.isEmpty()) {
            i2 = 0;
            for (C954460awe c954460awe2 : listLJIJJ2) {
                if (c954460awe2.LJJIIZ.isInviting() && c954460awe2.LJIIJJI() && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        LJIIL(Integer.valueOf(i2), "pending_invite_count", true);
    }

    public final void LJJI() {
        EnumC950200apm enumC950200apm;
        EnumC950200apm enumC950200apm2;
        LJIIL(Integer.valueOf(LiveCoHostAllowInviteWithApplySetting.INSTANCE.enable() ? 1 : 0), "coexist_enable", true);
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(C950220apo.LJFF());
        int i = 0;
        LJIIL(Integer.valueOf((c954460aweLLILL == null || (enumC950200apm2 = c954460aweLLILL.LJJIIZ) == null || !enumC950200apm2.isApplying()) ? 0 : 1), "is_coexist_attempt", true);
        C954460awe c954460aweLLILL2 = C915980Zwa.LJII().LLILL(C950220apo.LJFF());
        if (c954460aweLLILL2 != null && (enumC950200apm = c954460aweLLILL2.LJJIIZ) != null && enumC950200apm.isApplying()) {
            i = 1;
        }
        LJIIL(Integer.valueOf(i), "pending_apply_count", true);
    }

    @Override // X.AbstractC962030b8r
    public final void LJIILLIIL() {
        String str;
        Long l;
        String str2;
        Long l2;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        long currentUserId = interfaceC500940JkiUser != null ? interfaceC500940JkiUser.getCurrentUserId() : 0L;
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "user_id", C501590Jll.LIZ(), true);
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(currentUserId);
        if (c954460aweLLILL == null || (str = c954460aweLLILL.LJIIJJI) == null) {
            str = "";
        }
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "link_mic_id", str, true);
        List<C954460awe> listLJIJJ = C915980Zwa.LJII().LJIJJ();
        ArrayList arrayList = new ArrayList();
        Iterator<C954460awe> it2 = listLJIJJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C954460awe next = it2.next();
            C954460awe c954460awe = next;
            if (c954460awe != null && c954460awe.LJIIJJI() && c954460awe.LJJIIZ == EnumC950200apm.INVITED) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(((C954460awe) it3.next()).LJ));
        }
        if (!arrayList2.isEmpty()) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "invited_uid_list", arrayList2.toString(), true);
        }
        ArrayList arrayList3 = new ArrayList();
        for (C954460awe c954460awe2 : listLJIJJ) {
            C954460awe c954460awe3 = c954460awe2;
            if (c954460awe3 != null && c954460awe3.LJIIJJI() && c954460awe3.LJJIIZ == EnumC950200apm.APPLIED) {
                arrayList3.add(c954460awe2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(Long.valueOf(((C954460awe) it4.next()).LJ));
        }
        if (!arrayList4.isEmpty()) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "applied_uid", arrayList4.toString(), true);
        }
        ArrayList arrayList5 = new ArrayList();
        for (C954460awe c954460awe4 : listLJIJJ) {
            C954460awe c954460awe5 = c954460awe4;
            if (c954460awe5 != null && (c954460awe5.LJI() || c954460awe5.LJJIIZ == EnumC950200apm.LINKED)) {
                arrayList5.add(c954460awe4);
            }
        }
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Long.valueOf(((C954460awe) it5.next()).LJ));
        }
        if (!arrayList6.isEmpty()) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "linked_uid_list", arrayList6.toString(), true);
        }
        LJIIL(Integer.valueOf(arrayList6.size()), "linked_count", true);
        LJIIL(Integer.valueOf(C915980Zwa.LJII().LLI().getValue()), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, true);
        LJIIL(Integer.valueOf(C915980Zwa.LJII().LLI().getValue()), "cohost_state", true);
        LJIIL(C915980Zwa.LJII().LLI().getString(), "cohost_state_str", true);
        EnumC955660aya anchorType = C915980Zwa.LJI().LIZ().getAnchorType();
        int[] iArr = C955710ayf.LIZ;
        LJIIL(iArr[anchorType.ordinal()] == 1 ? "none" : C915980Zwa.LJI().LIZ().getAnchorType().getLabel(), "initial_anchor_type", true);
        LJIIL(iArr[C915980Zwa.LJI().LIZ().LLI().ordinal()] == 1 ? "none" : C915980Zwa.LJI().LIZ().LLI().getLabel(), "real_anchor_type", true);
        LJIIL(iArr[C915980Zwa.LJI().LIZ().LJIIZILJ().ordinal()] != 1 ? C915980Zwa.LJI().LIZ().LJIIZILJ().getLabel() : "none", "anchor_type", true);
        LJIIL(C954660awy.LJIIJ, "apply_type", true);
        LJIIL(Integer.valueOf(C954660awy.LJII), "network_quality", true);
        LJIIL(Integer.valueOf(C954660awy.LJIIIIZZ), "rx_quality", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "is_background", Boolean.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground()), true);
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService.Nt()) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "battle_id", Long.valueOf(iInteractService.getBattleId()), true);
        }
        LJIIL(C957990b2L.LJFF(C915980Zwa.LJI().LIZ().LJIILLIIL()) ? "1" : CardStruct.IStatusCode.DEFAULT, "is_quick_recommend", true);
        LJIIL(Integer.valueOf(C955430ayD.LIZIZ() ? 1 : 0), "is_quick_pair", false);
        LJIIL(0, "quick_linkmic_retry_times", true);
        LJIIL(C915980Zwa.LJIIIZ().k0(), "quick_linkmic_state", true);
        LJIIL(C954660awy.LJIIJJI, "quick_pair_type", false);
        LJIIL(C954660awy.LJIIL, "channel_create_type", true);
        LJIIL(Integer.valueOf(C915980Zwa.LJII().LJJLJ()), "conflict_record_count", true);
        LJIIL(Integer.valueOf(C915980Zwa.LJII().LLLLJ() == EnumC955820ayq.COHOST_MODE_SCREEN_SHARE ? 1 : 0), "cohost_layout_mode", false);
        if (C955640ayY.LIZIZ) {
            LJIIL(0, "link_time_out_strategy", true);
        } else if (this.LIZLLL.has("rival_user_id")) {
            Object objOpt = this.LIZLLL.opt("rival_user_id");
            if (!(objOpt instanceof Long) || (l = (Long) objOpt) == null || l.longValue() <= 0 || !C954660awy.LJIILJJIL.contains(l)) {
                LJIIL(0, "link_time_out_strategy", true);
            } else {
                LJIIL(Integer.valueOf(C955640ayY.LIZJ), "link_time_out_strategy", true);
            }
        }
        C943870afZ enterFrom = C915980Zwa.LJI().LIZ().getEnterFrom();
        if (enterFrom == null || (str2 = enterFrom.LIZ) == null) {
            str2 = "";
        }
        LJIIL(str2, "enter_from", false);
        boolean zLJIIIZ = C917810ZzX.LJIIIZ();
        LJIIL(Boolean.valueOf(zLJIIIZ), "is_in_multi_guest", true);
        C931800aM6.LIZ.getClass();
        LJIIL(Boolean.valueOf(C931800aM6.LIZIZ()), "is_chmg_supported", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "guest_count", Integer.valueOf(zLJIIIZ ? C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ()) : 0), true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "guest_ids", zLJIIIZ ? C921180a4y.LJIILJJIL(C915980Zwa.LJIIIIZZ()) : "", true);
        if (this.LIZLLL.has("rival_user_id")) {
            Object objOpt2 = this.LIZLLL.opt("rival_user_id");
            if (!(objOpt2 instanceof Long) || (l2 = (Long) objOpt2) == null || l2.longValue() <= 0) {
                return;
            }
            long jLongValue = l2.longValue();
            List listLJI = jLongValue == C950220apo.LJFF() ? C955520ayM.LJI() : (List) ((ConcurrentHashMap) C955520ayM.LIZ.getValue()).get(Long.valueOf(jLongValue));
            if (listLJI == null) {
                listLJI = C13BV.INSTANCE;
            }
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "is_opponent_in_multi_guest", Boolean.valueOf(!listLJI.isEmpty()), true);
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "opponent_guest_count", Integer.valueOf(listLJI.size()), true);
        }
    }

    @Override // X.AbstractC962030b8r
    public final String LJIJI() {
        return this.LJI;
    }

    public static String LJJIJ(C955440ayE c955440ayE) {
        String str;
        C943870afZ enterFrom = C915980Zwa.LJI().LIZ().getEnterFrom();
        if (enterFrom == null || (str = enterFrom.LIZ) == null) {
            return "other";
        }
        return str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LJJIJIIJI(String str) {
        switch (str.hashCode()) {
            case -1535331978:
                if (!str.equals("leave_with_user_click_disconnect")) {
                    return -1;
                }
                return 0;
            case -1505150892:
                if (!str.equals("leave_with_microom_start")) {
                    return -1;
                }
                return 3;
            case -700436896:
                if (!str.equals("leave_with_detach_view")) {
                    return -1;
                }
                return 2;
            case -379374338:
                if (!str.equals("leave_with_perception_message")) {
                    return -1;
                }
                return 4;
            case 507470202:
                if (!str.equals("leave_with_sdk_reason")) {
                    return -1;
                }
                return 1;
            case 954170335:
                if (!str.equals("leave_with_mode_switch")) {
                    return -1;
                }
                return 5;
            default:
                return -1;
        }
    }

    public final void LJJ(CapsuleMessage capsuleMessage) {
        long id;
        long j;
        CapsuleBizParamsCohost capsuleBizParamsCohost;
        CapsuleBizParamsCohost capsuleBizParamsCohost2;
        CapsuleBizParamsCohost capsuleBizParamsCohost3;
        User user;
        if (capsuleMessage != null) {
            LJIILL(capsuleMessage);
            CapsuleBizParams capsuleBizParams = capsuleMessage.bizParams;
            long j2 = 0;
            if (capsuleBizParams != null && (capsuleBizParamsCohost3 = capsuleBizParams.cohost) != null && (user = capsuleBizParamsCohost3.inviteeUserInfo) != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "invitee_uid", Long.valueOf(id), true);
            CapsuleBizParams capsuleBizParams2 = capsuleMessage.bizParams;
            if (capsuleBizParams2 != null && (capsuleBizParamsCohost2 = capsuleBizParams2.cohost) != null) {
                j = capsuleBizParamsCohost2.inviteeInnerChannelId;
            } else {
                j = 0;
            }
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "inner_channel_id", Long.valueOf(j), true);
            CapsuleBizParams capsuleBizParams3 = capsuleMessage.bizParams;
            if (capsuleBizParams3 != null && (capsuleBizParamsCohost = capsuleBizParams3.cohost) != null) {
                j2 = capsuleBizParamsCohost.inviteeRoomId;
            }
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "room_id", Long.valueOf(j2), true);
        }
    }

    public final void LJJIFFI(String str) {
        C943870afZ enterFrom;
        if (str == null || str.length() == 0) {
            str = C955410ayB.LIZJ(C915980Zwa.LJI().LIZ().LJIILLIIL());
            if (str.length() <= 0 && ((enterFrom = C915980Zwa.LJI().LIZ().getEnterFrom()) == null || (str = enterFrom.LIZ) == null)) {
                str = "";
            }
        }
        if (str.length() > 0) {
            LJIIL(str, "source", true);
        }
    }

    public final void LJJIJL(int i) {
        long j = C954660awy.LIZLLL;
        LJIIL(Integer.valueOf(i), "reason", true);
        LJIIL(C954660awy.LJIILLIIL.getString(), "cohost_state_str_when_link_finish", true);
        C954660awy.LJIILLIIL = EnumC950120ape.None;
        AbstractC962030b8r.LJIIJ(this.LIZJ, "duration", Long.valueOf(SystemClock.uptimeMillis() - j), true);
        LJIJJLI("link_finish_by_sdk");
    }

    public final void LJJJJJ(int i) {
        String quickPairTypeString;
        LJIIL(Integer.valueOf(C957990b2L.LIZLLL(Integer.valueOf(i)) ? 1 : 0), "is_quick_pair", true);
        if (C957990b2L.LIZ().contains(Integer.valueOf(i))) {
            quickPairTypeString = "quick_match";
        } else if (C957990b2L.LIZJ().contains(Integer.valueOf(i))) {
            quickPairTypeString = "quick_recommend";
        } else if (C957990b2L.LIZIZ().contains(Integer.valueOf(i))) {
            quickPairTypeString = "quick_recommend_during_cohost";
        } else {
            quickPairTypeString = InteractionSourceTypeTrackingSetting.INSTANCE.getQuickPairTypeString(Integer.valueOf(i));
            if (quickPairTypeString == null || quickPairTypeString.length() == 0) {
                quickPairTypeString = "none";
            }
        }
        LJIIL(quickPairTypeString, "quick_pair_type", true);
    }

    public final void LJJIIJ(long j, String str) {
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        LJIIL(str, "source", true);
        LJIJJLI("cross_adapter_check_inner_channel_id");
    }

    public final void LJJIIJZLJL(Throwable th, EnumC952640ati enumC952640ati) {
        LJIILIIL();
        LJIIJJI(th);
        LJIIL(Integer.valueOf(enumC952640ati.getValue()), "rival_type", true);
        LJIJJLI("fetch_rivals_failed");
    }

    public final void LJJIIZ(EnumC952640ati enumC952640ati, String str) {
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "client_log_id", str, true);
        LJIIL(Integer.valueOf(enumC952640ati.getValue()), "rival_type", true);
        LJIJJLI("fetch_rivals_request");
    }

    public final void LJJIJLIJ(long j, boolean z) {
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "is_mute", Boolean.valueOf(z), true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "mute_anchor_id", Long.valueOf(j), true);
        LJIJJLI("mute_audio");
    }

    public final void LJJJI(String str, String str2) {
        LJIIL(str, "origin_stream_id", true);
        LJIIL(str2, "stream_id", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "start_time", Long.valueOf(SystemClock.uptimeMillis()), true);
        LJIJJLI("replace_aux_stream");
    }

    public final void LJJIJIL(int i, int i2, long j) {
        LJIIL(Integer.valueOf(i), "join_type", true);
        LJIIL(1, "join_channel_opt", true);
        AbstractC962030b8r.LJIIJ(this.LIZJ, "post_count", Integer.valueOf(i2), true);
        AbstractC962030b8r.LJIIJ(this.LIZJ, "sum_delayed_time", Long.valueOf(j), true);
        LJIJJLI("join_channel");
    }

    public final void LJJIL(String str, String str2, String str3) {
        LJIIL(str, "source", true);
        if (str2 != null) {
            LJIIL(str2, "sec_source", true);
        }
        LJIIL(str3, "failReason", true);
        LJIJJLI("cohost_icon_click_failed");
    }

    public final void LJJIZ(String str, String str2, String str3) {
        LJIILIIL();
        LJIIL(str, "url", true);
        LJIIL(str2, "section_type", true);
        LJIIL(str3, "error_code", true);
        LJIJJLI("invitee_list_dynamic_section_load_failed");
    }

    public final void LJJJ(long j, int i, AbstractC1136060ffY abstractC1136060ffY) {
        if (abstractC1136060ffY != null) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "message_id", Long.valueOf(abstractC1136060ffY.getMessageId()), true);
        }
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        LJIIL(Integer.valueOf(i), "reply_status", true);
        LJIJJLI("accept_apply_click");
    }

    public final void LJJJIL(long j, int i, AbstractC1136060ffY abstractC1136060ffY) {
        if (abstractC1136060ffY != null) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "message_id", Long.valueOf(abstractC1136060ffY.getMessageId()), true);
        }
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        LJIIL(Integer.valueOf(i), "reply_status", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "is_new_arch", 1, true);
        LJIJJLI("reply_click");
    }

    public final void LJJJJ(EnumC952640ati enumC952640ati, String str, String str2) {
        LJIIL(Integer.valueOf(enumC952640ati.getValue()), "rival_type", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "section_name", enumC952640ati.name(), true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "cache_source", str2, true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "invalid_reason", str, true);
        LJIJJLI("invite_cache_data_invalid");
    }

    public final void LJJJJIZL(int i, int i2, int i3) {
        LJIIL(Integer.valueOf(EnumC952640ati.RECOMMEND.getValue()), "rival_type", true);
        LJIIL(Integer.valueOf(i3), "valid_refresh", true);
        AbstractC962030b8r.LJIIJ(this.LIZJ, "total_count", Integer.valueOf(i), true);
        AbstractC962030b8r.LJIIJ(this.LIZJ, "valid_count", Integer.valueOf(i2), true);
        LJIJJLI("recommend_cache_data_refresh");
    }

    public final void LJJIJIIJIL(long j, String str, String str2, boolean z) {
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        LJIIL(str2, "block_type", true);
        LJIIL(str, "source", true);
        LJIIL(Integer.valueOf(z ? 1 : 0), "is_cross_arc_active", true);
        LJIJJLI("invite_request_block");
    }

    public final void LJJII(long j, String str, String str2, boolean z, EnumC961090b7L enumC961090b7L) {
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        if (enumC961090b7L != null) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "cache_source", C961440b7u.LIZ(enumC961090b7L), true);
        }
        LJIIL(str2, "block_type", true);
        LJIIL(str, "source", true);
        LJIIL(Integer.valueOf(z ? 1 : 0), "is_cross_arc_active", true);
        LJIJJLI("apply_request_block");
    }

    public final void LJJIII(EnumC919210a1n enumC919210a1n, boolean z, boolean z2, Throwable th, int i) {
        String str;
        int i2 = C955710ayf.LIZIZ[enumC919210a1n.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str = "multi-host";
            } else {
                throw new C1954807lC();
            }
        } else {
            str = "none";
        }
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "permission_request_count", Integer.valueOf(i), true);
        LJIIL(str, "permission", true);
        LJIIL(Integer.valueOf(z ? 1 : 0), "is_ban_penalty", true);
        LJIIL(Integer.valueOf(z2 ? 1 : 0), "is_ban_onboard", true);
        LJIILIIL();
        LJIIJJI(th);
        LJIJJLI("check_permission_complete");
    }

    public final void LJJJJI(EnumC952640ati enumC952640ati, int i, int i2, boolean z, long j) {
        LJIIL(Integer.valueOf(enumC952640ati.getValue()), "rival_type", true);
        LJIIL(Integer.valueOf(z ? 1 : 0), "success", true);
        AbstractC962030b8r.LJIIJ(this.LIZJ, "round", Integer.valueOf(i), true);
        AbstractC962030b8r.LJIIJ(this.LIZJ, "total_rounds", Integer.valueOf(i2), true);
        AbstractC962030b8r.LJIIJ(this.LIZJ, "duration", Long.valueOf(j), true);
        LJIJJLI("invite_cache_refresh");
    }

    public final void LJJIIZI(int i, int i2, int i3, String str, String str2, EnumC952640ati enumC952640ati, long j) {
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "log_id", str, true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "followed_item_count", Integer.valueOf(i), true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "recommend_Item_count", Integer.valueOf(i2), true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "you_may_know_item_count", Integer.valueOf(i3), true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "client_log_id", str2, true);
        AbstractC962030b8r.LJIIJ(this.LIZJ, "load_duration", Long.valueOf(j), true);
        LJIIL(Integer.valueOf(enumC952640ati.getValue()), "rival_type", true);
        LJIILIIL();
        LJIJJLI("fetch_rivals_succeed");
    }
}
