package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.popcard.api.FeedProductResp;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.feed.popcard.data.SeaFeedProduct;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BFFCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.feed.model.live.CommerceStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.182Q, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C182Q {
    public final List<C183E> LIZ = Collections.singletonList(new C183E() { // from class: X.182O
        public final int LIZ = 3;

        @Override // X.C183E
        public final int LIZJ() {
            return this.LIZ;
        }

        @Override // X.C183E
        public final C1155180gAO LIZ(C182P c182p) {
            String str;
            OecInitData oecInitData;
            int iIntValue;
            Object c098200Yq;
            long jLongValue;
            BFFCardConfig bFFCardConfig;
            String str2;
            String str3;
            Type type;
            int iIntValue2;
            BFFCardConfig bFFCardConfig2;
            FeedProductResp feedProductResp = c182p.LIZ;
            LiveRoomStruct liveRoomStruct = c182p.LIZIZ;
            PopupCardBffData popupCardBffData = feedProductResp.bffData;
            String str4 = null;
            if (popupCardBffData == null || (bFFCardConfig2 = popupCardBffData.cardConfig) == null || (str = bFFCardConfig2.cardSchema) == null) {
                LynxCardInfo lynxCardInfo = feedProductResp.lynxCardInfo;
                if (lynxCardInfo != null) {
                    str = lynxCardInfo.lynxCardSchema;
                } else {
                    str = null;
                }
            }
            Product product = feedProductResp.productInfo;
            if (product == null) {
                SeaFeedProduct seaFeedProduct = feedProductResp.product;
                String str5 = "";
                if (seaFeedProduct != null) {
                    String str6 = seaFeedProduct.productId;
                    String str7 = seaFeedProduct.title;
                    ECImage eCImage = seaFeedProduct.cover;
                    int i = seaFeedProduct.bagIndex;
                    String str8 = seaFeedProduct.daInfo;
                    String str9 = seaFeedProduct.schema;
                    if (str9 == null) {
                        str9 = "";
                    }
                    String str10 = seaFeedProduct.source;
                    if (str10 != null) {
                        str5 = str10;
                    }
                    Integer num = seaFeedProduct.platform;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    product = new Product(str6, str7, eCImage, null, "", "", 0, null, iIntValue2, "", str5, str9, 0, "", "", null, null, null, seaFeedProduct.promotionView, null, null, null, seaFeedProduct.sellingView, null, null, null, null, null, null, i, null, null, null, null, null, null, str8, null, null, null, null, null, null, null, seaFeedProduct.componentData, seaFeedProduct.auctionData, seaFeedProduct.productType, seaFeedProduct.bcmStandardTrack, null, null, null, null, null, null);
                } else {
                    if (str != null) {
                        str5 = str;
                    }
                    product = new Product("", "", null, null, "", "", 0, null, 0, "", "", str5, 0, "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null);
                }
            }
            CommerceStruct commerceStruct = liveRoomStruct.commerceStruct;
            if (commerceStruct != null && (str3 = commerceStruct.oecInitDataString) != null) {
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(OecInitData.class));
                    } else {
                        type = new TypeToken<OecInitData>() { // from class: X.17vW
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str3, type);
                    if (!(objFromJson instanceof OecInitData)) {
                        objFromJson = null;
                    }
                    oecInitData = (OecInitData) objFromJson;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    oecInitData = null;
                }
            } else {
                oecInitData = null;
            }
            Integer num2 = feedProductResp.cardType;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
            String str11 = c182p.LIZJ;
            if (str11.length() == 0) {
                str11 = null;
            } else {
                try {
                    Object objOpt = new JSONObject(str11).opt("data");
                    if (objOpt != null) {
                        c098200Yq = objOpt.toString();
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                String str12 = (String) c098200Yq;
                if (str12 == null || str12.length() == 0) {
                    c098200Yq = null;
                }
                String str13 = (String) c098200Yq;
                if (str13 != null) {
                    str11 = str13;
                }
            }
            C182S c182s = PopupCardVO.Companion;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = feedProductResp.serverTime;
            long jLongValue2 = 0;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            Long lValueOf = Long.valueOf(feedProductResp.popCardId);
            if (lValueOf.longValue() > 0 || (oecInitData != null && (lValueOf = Long.valueOf(oecInitData.popCardId)) != null)) {
                jLongValue2 = lValueOf.longValue();
            }
            PopupCardBffData popupCardBffData2 = feedProductResp.bffData;
            LynxCardInfo lynxCardInfo2 = feedProductResp.lynxCardInfo;
            if (popupCardBffData2 != null && (bFFCardConfig = popupCardBffData2.cardConfig) != null && (str2 = bFFCardConfig.cardSchema) != null) {
                str4 = str2;
            } else if (lynxCardInfo2 != null) {
                str4 = lynxCardInfo2.lynxCardSchema;
            }
            PopupCardVO popupCardVOLIZ = C182S.LIZ(c182s, product, jCurrentTimeMillis, jLongValue, null, null, null, 0, null, null, iIntValue, null, null, null, null, null, null, null, null, str4, null, null, null, str11, jLongValue2, popupCardBffData2, lynxCardInfo2, 16252320);
            String uid = c182p.LIZIZ.owner.getUid();
            LiveRoomStruct liveRoomStruct2 = c182p.LIZIZ;
            Map<String, String> map = c182p.LIZLLL;
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("request_id", map.get("request_id"));
            pairArr[1] = new Pair("enter_from_merge", c182p.LJ);
            pairArr[2] = new Pair("enter_method", "live_cell");
            pairArr[3] = new Pair("follow_status", String.valueOf(liveRoomStruct2.owner.getFollowStatus()));
            String str14 = map.get("enter_from");
            if (str14 == null) {
                str14 = "live_preview_card";
            }
            pairArr[4] = new Pair("enter_from", str14);
            return new C1155180gAO(popupCardVOLIZ, uid, C2097608Jq.LJIIIIZZ(pairArr));
        }

        @Override // X.C183E
        public final boolean LIZIZ(FeedProductResp feedProductResp) {
            String str;
            boolean z;
            BFFCardConfig bFFCardConfig;
            PopupCardBffData popupCardBffData = feedProductResp.bffData;
            if (popupCardBffData == null || (bFFCardConfig = popupCardBffData.cardConfig) == null || (str = bFFCardConfig.cardSchema) == null) {
                LynxCardInfo lynxCardInfo = feedProductResp.lynxCardInfo;
                if (lynxCardInfo != null) {
                    str = lynxCardInfo.lynxCardSchema;
                } else {
                    str = null;
                }
            }
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            return true ^ z;
        }
    });

    public C182Q(int i) {
    }
}
