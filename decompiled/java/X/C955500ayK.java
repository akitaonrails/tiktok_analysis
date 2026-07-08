package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ayK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955500ayK extends AbstractC962030b8r {
    public final String LJI = "ttlive_client_audience_cohost_exception_monitor";

    @Override // X.AbstractC962030b8r
    public final boolean LJIJJ() {
        return false;
    }

    @Override // X.AbstractC962030b8r
    public final void LJIILLIIL() {
        String str;
        Long l;
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
        for (C954460awe c954460awe : listLJIJJ) {
            C954460awe c954460awe2 = c954460awe;
            if (c954460awe2 != null && c954460awe2.LJIIJJI() && c954460awe2.LJJIIZ == EnumC950200apm.INVITED) {
                arrayList.add(c954460awe);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((C954460awe) it2.next()).LJ));
        }
        if (!arrayList2.isEmpty()) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "invited_uid_list", arrayList2.toString(), true);
        }
        ArrayList arrayList3 = new ArrayList();
        for (C954460awe c954460awe3 : listLJIJJ) {
            C954460awe c954460awe4 = c954460awe3;
            if (c954460awe4 != null && c954460awe4.LJIIJJI() && c954460awe4.LJJIIZ == EnumC950200apm.APPLIED) {
                arrayList3.add(c954460awe3);
            }
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Long.valueOf(((C954460awe) it3.next()).LJ));
        }
        if (!arrayList4.isEmpty()) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "applied_uid", arrayList4.toString(), true);
        }
        ArrayList arrayList5 = new ArrayList();
        for (C954460awe c954460awe5 : listLJIJJ) {
            C954460awe c954460awe6 = c954460awe5;
            if (c954460awe6 != null && (c954460awe6.LJI() || c954460awe6.LJJIIZ == EnumC950200apm.LINKED)) {
                arrayList5.add(c954460awe5);
            }
        }
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            arrayList6.add(Long.valueOf(((C954460awe) it4.next()).LJ));
        }
        if (!arrayList6.isEmpty()) {
            AbstractC962030b8r.LJIIJ(this.LIZLLL, "linked_uid_list", arrayList6.toString(), true);
        }
        LJIIL(Integer.valueOf(arrayList6.size()), "linked_count", true);
        LJIIL(Integer.valueOf(C915980Zwa.LJII().LLI().getValue()), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, true);
        LJIIL(Integer.valueOf(C915980Zwa.LJII().LLI().getValue()), "cohost_state", true);
        EnumC955660aya anchorType = C915980Zwa.LJI().LIZ().getAnchorType();
        int[] iArr = C955930az1.LIZ;
        LJIIL(iArr[anchorType.ordinal()] == 1 ? "none" : C915980Zwa.LJI().LIZ().getAnchorType().getLabel(), "anchor_type", true);
        LJIIL(iArr[C915980Zwa.LJI().LIZ().LLI().ordinal()] != 1 ? C915980Zwa.LJI().LIZ().LLI().getLabel() : "none", "real_anchor_type", true);
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
        LJIIL(C954660awy.LJIIJJI, "quick_pair_type", true);
        LJIIL(C954660awy.LJIIL, "channel_create_type", true);
        if (C955640ayY.LIZIZ) {
            LJIIL(0, "link_time_out_strategy", true);
            return;
        }
        if (this.LIZLLL.has("rival_user_id")) {
            Object objOpt = this.LIZLLL.opt("rival_user_id");
            if (!(objOpt instanceof Long) || (l = (Long) objOpt) == null || l.longValue() <= 0 || !C954660awy.LJIILJJIL.contains(l)) {
                LJIIL(0, "link_time_out_strategy", true);
            } else {
                LJIIL(Integer.valueOf(C955640ayY.LIZJ), "link_time_out_strategy", true);
            }
        }
    }

    @Override // X.AbstractC962030b8r
    public final String LJIJI() {
        return this.LJI;
    }
}
