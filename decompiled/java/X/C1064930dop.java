package X;

import Y.AfS185S0100000_16;
import com.ss.android.ugc.aweme.ad.feed.dialog.DislikeReasonApi;
import com.ss.android.ugc.aweme.ad.feed.dialog.FeedAdDislikeSubReasonDialog;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1064930dop extends C2217421BqW implements InterfaceC1631620sYq<String, String, Integer, Unit> {
    public C1064930dop(Object obj) {
        super(3, obj, FeedAdDislikeSubReasonDialog.class, "onViewHolderClick", "onViewHolderClick(Ljava/lang/String;Ljava/lang/String;I)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, String str2, Integer num) throws JSONException {
        String aid;
        String adId;
        String creativeId;
        String logExtra;
        String roomId;
        InterfaceC1064920doo callback;
        String str3 = str;
        int iIntValue = num.intValue();
        FeedAdDislikeSubReasonDialog feedAdDislikeSubReasonDialog = (FeedAdDislikeSubReasonDialog) this.receiver;
        feedAdDislikeSubReasonDialog.LLILZ = false;
        feedAdDislikeSubReasonDialog.dismiss();
        C1064970dot c1064970dotMR = feedAdDislikeSubReasonDialog.MR();
        if (c1064970dotMR != null && (callback = c1064970dotMR.getCallback()) != null) {
            callback.onDismiss();
        }
        C19EG activity = feedAdDislikeSubReasonDialog.getActivity();
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(str3);
            c1389890mGx.LJIIJJI();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(iIntValue, "option_id");
        C20684815ws.LJIILLIIL("dislike_subcategory", c2344009Gk.LIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("reasons", str2);
        C11NJ c11nj = feedAdDislikeSubReasonDialog.LLILZIL;
        DislikeReasonApi.LIZ.getClass();
        DislikeReasonApi dislikeReasonApiLIZ = C312900COi.LIZ();
        C1064970dot c1064970dotMR2 = feedAdDislikeSubReasonDialog.MR();
        String str4 = "";
        if (c1064970dotMR2 == null || (aid = c1064970dotMR2.getAid()) == null) {
            aid = "";
        }
        C1064970dot c1064970dotMR3 = feedAdDislikeSubReasonDialog.MR();
        if (c1064970dotMR3 == null || (adId = c1064970dotMR3.getAdId()) == null) {
            adId = "";
        }
        C1064970dot c1064970dotMR4 = feedAdDislikeSubReasonDialog.MR();
        if (c1064970dotMR4 == null || (creativeId = c1064970dotMR4.getCreativeId()) == null) {
            creativeId = "";
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        C1064970dot c1064970dotMR5 = feedAdDislikeSubReasonDialog.MR();
        if (c1064970dotMR5 == null || (logExtra = c1064970dotMR5.getLogExtra()) == null) {
            logExtra = "";
        }
        C1064970dot c1064970dotMR6 = feedAdDislikeSubReasonDialog.MR();
        if (c1064970dotMR6 != null && (roomId = c1064970dotMR6.getRoomId()) != null) {
            str4 = roomId;
        }
        c11nj.LIZ(dislikeReasonApiLIZ.submitReason(aid, adId, creativeId, strJ3, logExtra, str4).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS185S0100000_16(feedAdDislikeSubReasonDialog, 36), new AfS185S0100000_16(feedAdDislikeSubReasonDialog, 37)));
        return Unit.LIZ;
    }
}
