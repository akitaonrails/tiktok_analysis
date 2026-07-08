package X;

import android.net.Uri;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.paid.content.consumption.PaidContentAnchorExtraModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AwS425S0200000_24;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0s6N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1613970s6N extends AbstractC1066890drz {
    public final C1613960s6M LLJ = new C1613960s6M();
    public final C01GW LLJI = C452501pT.LIZIZ(new C1067120dsM());

    @Override // X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        return new C1400390mXt(new AwS425S0200000_24(awemeLJJLIIIJJIZ, this, 61), new AwS425S0200000_24(awemeLJJLIIIJJIZ, this, 62), new AwS425S0200000_24(awemeLJJLIIIJJIZ, this, 63), null, null, 24);
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1613970s6N();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.PAID_COLLECTION.getTYPE();
    }

    @Override // X.AbstractC1066890drz
    public final void LJJIIJ(C2344009Gk c2344009Gk) {
        LJJIJIIJI(c2344009Gk);
        super.LJJIIJ(c2344009Gk);
    }

    public final void LJJIJIIJI(C2344009Gk c2344009Gk) {
        String dataFromExtra;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        c2344009Gk.LJFF("is_collection_item", C893803eS.LIZ(interfaceC1392640mLO.LJJLIIIJJIZ().isPaidContent));
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        String str = CardStruct.IStatusCode.DEFAULT;
        if (anchorCommonStruct != null && (dataFromExtra = anchorCommonStruct.getDataFromExtra("category", CardStruct.IStatusCode.DEFAULT)) != null) {
            str = dataFromExtra;
        }
        c2344009Gk.LJFF("series_category", str);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) throws JSONException {
        String logExtra;
        String str;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        LJJIJIIJI(c2344009Gk);
        super.p1(c2344009Gk);
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        if (interfaceC1392640mLO2 == null) {
            interfaceC1392640mLO2 = null;
        }
        String strCf = interfaceC1392640mLO2.Cf();
        C2344009Gk c2344009GkLJJ = LJJ();
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null && (logExtra = anchorCommonStruct.getLogExtra()) != null && logExtra.length() != 0) {
            JSONObject jSONObject = new JSONObject(logExtra);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if ((obj instanceof String) && (str = (String) obj) != null) {
                    c2344009GkLJJ.LJFF(next, str);
                }
            }
        }
        c2344009GkLJJ.LJIIIIZZ("enter_from", strCf);
        String authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ);
        String str2 = "";
        if (authorUid == null) {
            authorUid = "";
        }
        c2344009GkLJJ.LJIIIIZZ("author_id", authorUid);
        c2344009GkLJJ.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(awemeLJJLIIIJJIZ));
        String aid = awemeLJJLIIIJJIZ.getAid();
        if (aid != null) {
            str2 = aid;
        }
        c2344009GkLJJ.LJIIIIZZ("group_id", str2);
        C20684815ws.LJIILLIIL("anchor_entrance_show", c2344009GkLJJ.LIZ);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        PaidContentAnchorExtraModel paidContentAnchorExtraModel;
        String schema;
        String uid;
        String str;
        LJJIJIIJI(c2344009Gk);
        LJJII(c2344009Gk, true, true);
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            InterfaceC1392640mLO interfaceC1392640mLO = null;
            try {
                paidContentAnchorExtraModel = (PaidContentAnchorExtraModel) ((Gson) this.LLJI.getValue()).LJII(anchorCommonStruct.getExtra(), PaidContentAnchorExtraModel.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20684815ws.LJIILLIIL("paid_content_anchor_extra_model_failed", new C2344009Gk().LIZ);
                paidContentAnchorExtraModel = null;
            }
            if (paidContentAnchorExtraModel != null && paidContentAnchorExtraModel.isSchemaEncoded) {
                schema = Uri.decode(anchorCommonStruct.getSchema());
            } else {
                schema = anchorCommonStruct.getSchema();
            }
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
            if (interfaceC1392640mLO2 == null) {
                interfaceC1392640mLO2 = null;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(interfaceC1392640mLO2.LIZIZ(), schema);
            smartRouteBuildRoute.withParam("anchor_event_map", (HashMap) LJIJ(c2344009Gk));
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
            if (interfaceC1392640mLO3 == null) {
                interfaceC1392640mLO3 = null;
            }
            smartRouteBuildRoute.withParam("author_id", AwemeExtKt.getAuthorUid(interfaceC1392640mLO3.LJJLIIIJJIZ()));
            InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
            if (interfaceC1392640mLO4 == null) {
                interfaceC1392640mLO4 = null;
            }
            String aid = interfaceC1392640mLO4.LJJLIIIJJIZ().getAid();
            String str2 = "";
            if (aid == null) {
                aid = "";
            }
            smartRouteBuildRoute.withParam("group_id", aid);
            smartRouteBuildRoute.withParam("anchor_id", anchorCommonStruct.getId());
            InterfaceC1392640mLO interfaceC1392640mLO5 = this.LL;
            if (interfaceC1392640mLO5 == null) {
                interfaceC1392640mLO5 = null;
            }
            smartRouteBuildRoute.withParam("anchor_video_id", interfaceC1392640mLO5.LJJLIIIJJIZ().getAid());
            InterfaceC1392640mLO interfaceC1392640mLO6 = this.LL;
            if (interfaceC1392640mLO6 == null) {
                interfaceC1392640mLO6 = null;
            }
            User author = interfaceC1392640mLO6.LJJLIIIJJIZ().getAuthor();
            if (author == null || (uid = author.getUid()) == null) {
                uid = "";
            }
            smartRouteBuildRoute.withParam("anchor_author_id", uid);
            if (paidContentAnchorExtraModel == null || (str = paidContentAnchorExtraModel.seriesAnchorType) == null) {
                str = "default_anchor_type";
            }
            smartRouteBuildRoute.withParam("series_anchor_type", str);
            InterfaceC1392640mLO interfaceC1392640mLO7 = this.LL;
            if (interfaceC1392640mLO7 == null) {
                interfaceC1392640mLO7 = null;
            }
            smartRouteBuildRoute.withParam("anchor_group_id", interfaceC1392640mLO7.LJJLIIIJJIZ().getGroupId());
            smartRouteBuildRoute.withParam("enter_from", LJIJJLI());
            InterfaceC1392640mLO interfaceC1392640mLO8 = this.LL;
            if (interfaceC1392640mLO8 == null) {
                interfaceC1392640mLO8 = null;
            }
            String aid2 = interfaceC1392640mLO8.LJJLIIIJJIZ().getAid();
            if (aid2 != null) {
                str2 = aid2;
            }
            smartRouteBuildRoute.withParam("from_group_id", str2);
            smartRouteBuildRoute.withParam("previous_page", LJIJJLI());
            smartRouteBuildRoute.withParam("detail_aweme_from", LJIJJLI());
            InterfaceC1392640mLO interfaceC1392640mLO9 = this.LL;
            if (interfaceC1392640mLO9 != null) {
                interfaceC1392640mLO = interfaceC1392640mLO9;
            }
            smartRouteBuildRoute.withParam("source_video_type", C718180SFc.LJ(interfaceC1392640mLO.LJJLIIIJJIZ()));
            smartRouteBuildRoute.open();
        }
    }

    @Override // X.AbstractC1066890drz
    public final void LJJII(C2344009Gk c2344009Gk, boolean z, boolean z2) {
        LJJIJIIJI(c2344009Gk);
        super.LJJII(c2344009Gk, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJJJIZL(android.view.ViewGroup r36, android.app.Dialog r37, final X.C2344009Gk r38, int r39) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1613970s6N.LJJJJIZL(android.view.ViewGroup, android.app.Dialog, X.09Gk, int):android.view.View");
    }
}
