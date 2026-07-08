package X;

import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilege;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;
import com.ss.android.ugc.aweme.ecommerce.model.GetAnchorMotionInfoResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.feed.model.search.SearchAdPromotionAnchorInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0cKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.util.SearchAdAnchorPromotionFetcher$fetchPromotionInfo$1$2$1", f = "SearchAdAnchorPromotionFetcher.kt", l = {}, m = "invokeSuspend")
public final class C1007740cKa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1007730cKZ LL;
    public final /* synthetic */ GetAnchorMotionInfoResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007740cKa(C1007730cKZ c1007730cKZ, GetAnchorMotionInfoResponse getAnchorMotionInfoResponse, InterfaceC1364105Vn<? super C1007740cKa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1007730cKZ;
        this.LLILLJJLI = getAnchorMotionInfoResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007740cKa(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String optShowText;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        SearchAdPromotionAnchorInfo searchAdPromotionAnchorInfo;
        AwemeRawAd awemeRawAd2;
        AwemeSearchAdModel searchAdInfo2;
        SearchAdPromotionAnchorInfo searchAdPromotionAnchorInfo2;
        List<AnchorPrivilegeItem> anchorPrivilegeItems;
        AnchorPrivilegeItem anchorPrivilegeItem;
        C1C7U.LIZ("SearchAdAnchorPromotionFetcher@9806.fetchPromotionInfo$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1007730cKZ c1007730cKZ = this.LL;
        GetAnchorMotionInfoResponse getAnchorMotionInfoResponse = this.LLILLJJLI;
        c1007730cKZ.getClass();
        AnchorPrivilege anchorPrivilege = getAnchorMotionInfoResponse.anchorPrivilege;
        String optSellingPointText = null;
        if (anchorPrivilege != null && (anchorPrivilegeItems = anchorPrivilege.getAnchorPrivilegeItems()) != null && (anchorPrivilegeItem = (AnchorPrivilegeItem) C13LP.LJJJLL(anchorPrivilegeItems)) != null) {
            optShowText = anchorPrivilegeItem.getOptShowText();
        } else {
            optShowText = null;
        }
        Aweme aweme = c1007730cKZ.LIZ;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (searchAdInfo2 = awemeRawAd2.getSearchAdInfo()) != null && (searchAdPromotionAnchorInfo2 = searchAdInfo2.promotionAnchorInfo) != null) {
            searchAdPromotionAnchorInfo2.setOptSellingPointText(optShowText);
            searchAdPromotionAnchorInfo2.setRequestStatus(EnumC1007720cKY.SUCCESS.getValue());
        }
        EnumC1007720cKY enumC1007720cKY = EnumC1007720cKY.SUCCESS;
        c1007730cKZ.LIZIZ = enumC1007720cKY;
        c1007730cKZ.LIZIZ(enumC1007720cKY);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onRequestSuccess]， text: ");
        Aweme aweme2 = c1007730cKZ.LIZ;
        if (aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (searchAdPromotionAnchorInfo = searchAdInfo.promotionAnchorInfo) != null) {
            optSellingPointText = searchAdPromotionAnchorInfo.getOptSellingPointText();
        }
        sbLIZ.append(optSellingPointText);
        C2188811AlT.LIZIZ(sbLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdAnchorPromotionFetcher@9806.fetchPromotionInfo$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
