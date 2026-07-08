package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iRQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1242620iRQ {
    public final String LIZ;
    public final User LIZIZ;
    public final Aweme LIZJ;
    public final String LIZLLL;
    public String LJ = "";
    public Long LJFF;

    public final void LIZ(EnumC1260930iux enumC1260930iux) {
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJIL("share_link");
        c1260910iuv.LJJIJLIJ(this.LIZ);
        c1260910iuv.LJJJJZI(this.LIZIZ);
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.CARD;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJJJIZL("sharer_popup");
        Object objLJIIIZ = c19651011uW.LJIIIZ(this.LIZJ, c1260910iuv);
        Aweme aweme = this.LIZJ;
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, objLJIIIZ);
        C1260910iuv c1260910iuv2 = (C1260910iuv) objLJIIIZ;
        c1260910iuv2.LJZ = C1234220iDs.LJIIIIZZ(C1234220iDs.LJI(this.LIZIZ));
        c1260910iuv2.LJIILJJIL();
    }

    public final void LIZIZ(String str) {
        String str2;
        C1234650iEZ c1234650iEZ;
        String str3;
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("enter_from", this.LIZ);
        pairArr[1] = new Pair("action_type", str);
        pairArr[2] = new Pair("to_user_id", this.LIZIZ.getUid());
        pairArr[3] = new Pair("follow_status", C735370Ssx.LJIJJLI(this.LIZIZ));
        pairArr[4] = new Pair("author_id", AwemeExtKt.getAuthorUid(this.LIZJ));
        pairArr[5] = new Pair("group_id", this.LIZJ.getAid());
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[6] = new Pair("is_login", str2);
        String str4 = this.LIZLLL;
        String str5 = null;
        if (str4 == null) {
            str4 = null;
        }
        pairArr[7] = new Pair("link_id", str4);
        String requestId = this.LIZIZ.getRequestId();
        if (requestId == null) {
            requestId = null;
        }
        pairArr[8] = new Pair("req_id", requestId);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        Map<String, String> mapLJIIIIZZ = C1234220iDs.LJIIIIZZ(C1234220iDs.LJI(this.LIZIZ));
        if (mapLJIIIIZZ == null) {
            mapLJIIIIZZ = C2097608Jq.LJ();
        }
        mapLJIIJ.putAll(mapLJIIIIZZ);
        if (!Intrinsics.LJFF(str, "show")) {
            mapLJIIJ.put("cover_type", this.LJ);
        }
        Long l = this.LJFF;
        if (l != null) {
            mapLJIIJ.put("time_delay_ms", String.valueOf(System.currentTimeMillis() - l.longValue()));
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(GScope.LL, "ug_deeplink_params_key", C1234650iEZ.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            c1234650iEZ = (C1234650iEZ) interfaceC1555100qZQLIZIZ.getSource();
        } else {
            c1234650iEZ = null;
        }
        String aid = this.LIZJ.getAid();
        if (c1234650iEZ != null) {
            str3 = c1234650iEZ.LL;
        } else {
            str3 = null;
        }
        if (Intrinsics.LJFF(aid, str3)) {
            if (c1234650iEZ != null) {
                str5 = c1234650iEZ.LLILLJJLI;
            }
            mapLJIIJ.put("ugdp_id", str5);
        }
        C20684815ws.LJIILLIIL("share_user_info_popup", mapLJIIJ);
    }

    public final void LIZJ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("req_id", this.LIZJ.getRequestId());
        if (Intrinsics.LJFF(str, "show_cover")) {
            c2344009Gk.LJFF("cover_type", this.LJ);
        }
        C20684815ws.LJIILLIIL("show_sharer_popup", c2344009Gk.LIZ);
    }

    public C1242620iRQ(String str, User user, Aweme aweme, String str2) {
        this.LIZ = str;
        this.LIZIZ = user;
        this.LIZJ = aweme;
        this.LIZLLL = str2;
    }
}
