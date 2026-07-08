package X;

import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.feed.model.search.SearchAdPromotionAnchorInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cKZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007730cKZ {
    public Aweme LIZ;
    public EnumC1007720cKY LIZIZ = EnumC1007720cKY.IDLE;

    public final void LIZ(Integer num) throws JSONException {
        EnumC1007720cKY enumC1007720cKY;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        SearchAdPromotionAnchorInfo searchAdPromotionAnchorInfo;
        if (num != null && num.intValue() == 0) {
            enumC1007720cKY = EnumC1007720cKY.SUCCESS_WITHOUT_RESULT;
        } else {
            enumC1007720cKY = EnumC1007720cKY.FAILED;
        }
        this.LIZIZ = enumC1007720cKY;
        Aweme aweme = this.LIZ;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (searchAdPromotionAnchorInfo = searchAdInfo.promotionAnchorInfo) != null) {
            searchAdPromotionAnchorInfo.setOptSellingPointText(null);
            searchAdPromotionAnchorInfo.setRequestStatus(this.LIZIZ.getValue());
        }
        LIZIZ(this.LIZIZ);
    }

    public final void LIZIZ(EnumC1007720cKY enumC1007720cKY) throws JSONException {
        C0Q18 c0q18LIZIZ;
        IAnoleManager iAnoleManagerRi;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL != null && (c0q18LIZIZ = interfaceC657510PqfLIZLLL.LIZIZ(this.LIZ, null, false, true)) != null && (iAnoleManagerRi = c0q18LIZIZ.Ri()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("anchor_promotion_info_request_status", enumC1007720cKY.getValue());
            iAnoleManagerRi.LJIIZILJ(new C0SCL(jSONObject));
        }
    }
}
