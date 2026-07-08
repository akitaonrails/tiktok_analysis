package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0b3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958830b3h extends AbstractC962030b8r {
    public static final C01GW<C958830b3h> LJII = C1935407i4.LIZ(AFwS203S0000000_15.get$arr$(6));
    public final String LJI = "ttlive_client_anchor_cohost_monitor";

    public static String LJJIII(int i, boolean z) {
        return i == 0 ? z ? "during_cohost" : "single" : i != 2 ? i == 3 ? "team_pair" : "single" : "during_cohost";
    }

    @Override // X.AbstractC962030b8r
    public final boolean LJIJJ() {
        return true;
    }

    @Override // X.AbstractC962030b8r
    public final void LJIILLIIL() {
        String str;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(interfaceC500940JkiUser != null ? interfaceC500940JkiUser.getCurrentUserId() : 0L);
        if (c954460aweLLILL == null || (str = c954460aweLLILL.LJIIJJI) == null) {
            str = "";
        }
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "link_mic_id", str, true);
        LJIIL(Integer.valueOf(C915980Zwa.LJII().LLI().getValue()), "cohost_state", true);
        LJIIL(C915980Zwa.LJIIIZ().k0(), "quick_linkmic_state", true);
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
    }

    public final void LJIL() {
        long jLIZ = C158B.LIZ();
        C959600b4w c959600b4wC0 = C915980Zwa.LJIIIZ().c0();
        AbstractC962030b8r.LJIIJ(this.LIZJ, "cost", Long.valueOf(jLIZ - ((c959600b4wC0 != null ? c959600b4wC0.LJIILJJIL : 0L) * ((long) LSPassThroughRecordSizeConfig.DEFAULT))), true);
    }

    @Override // X.AbstractC962030b8r
    public final String LJIJI() {
        return this.LJI;
    }

    public final void LJJIFFI(int i, String str, boolean z) {
        LJIIL(str, "source", true);
        LJIIL(LJJIII(i, z), "auto_match_request_scene", true);
        LJIJJLI("auto_match_request");
    }

    public final void LJJI(long j, long j2, String str, String str2) {
        LJIIL(Long.valueOf(j), "error_code", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "session_id", str, true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "match_id", str2, true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "rival_user_id", Long.valueOf(j2), true);
        LJIJJLI("auto_match_msg_failed");
    }

    public final void LJJ(String str, long j, long j2, Throwable th, boolean z, int i) {
        LJIL();
        LJIIL(str, "source", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "click_server_timestamp", Long.valueOf(j), true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "request_server_timestamp", Long.valueOf(j2), true);
        LJIIJJI(th);
        LJIIL(LJJIII(i, z), "auto_match_request_scene", true);
        LJIJJLI("auto_match_failed");
    }

    public final void LJJII(int i, String str, boolean z, String str2, long j, long j2) {
        LJIL();
        LJIIL(str, "source", true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "click_server_timestamp", Long.valueOf(j), true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "request_server_timestamp", Long.valueOf(j2), true);
        AbstractC962030b8r.LJIIJ(this.LIZLLL, "session_id", str2, true);
        LJIIL(LJJIII(i, z), "auto_match_request_scene", true);
        LJIJJLI("auto_match_succeed");
    }
}
