package X;

import android.content.Context;
import android.util.Log;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ad.feed.liveshopping.ICommerceLiveShoppingManager;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.ComponentData;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bs7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990090bs7 implements ICommerceLiveShoppingManager {
    public long LIZ;
    public AwemeRawAd LIZIZ;
    public Aweme LIZJ;
    public C0X9S<LiveAdCardModel> LIZLLL;
    public boolean LJ;

    @Override // com.ss.android.ugc.aweme.ad.feed.liveshopping.ICommerceLiveShoppingManager
    public final void bind() {
        this.LJ = true;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.liveshopping.ICommerceLiveShoppingManager
    public final void onPageSelected() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.liveshopping.ICommerceLiveShoppingManager
    public final void unBind() {
        this.LJ = false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.liveshopping.ICommerceLiveShoppingManager
    public final void unPageSelected() {
    }

    public final void LIZIZ(String str) {
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.LIZJ;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
        c1022820ciuLIZLLL.LIZJ("live_product_anchor", "refer");
        c1022820ciuLIZLLL.LIZIZ(str, "fail_reason");
        c1022820ciuLIZLLL.LJII();
    }

    public final void LIZJ(JSONObject jSONObject) throws JSONException {
        Aweme aweme;
        User author;
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1008930cMV interfaceC1008930cMVLJ = null;
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        Object objValueOf = null;
        if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null && (interfaceC1008930cMVLJ = iFeedServiceLIZIZ.LJ()) != null) {
            interfaceC1008930cMVLJ.LJJIJIIJI(jSONObject);
        }
        AwemeRawAd awemeRawAd = this.LIZIZ;
        if (awemeRawAd != null && (aweme = this.LIZJ) != null) {
            AdLiveEnterRoomConfig adLiveEnterRoomConfigLIZJ = C1019100ccu.LIZJ(aweme, awemeRawAd);
            Aweme aweme2 = this.LIZJ;
            if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                objValueOf = Integer.valueOf(author.getFollowStatus());
            }
            adLiveEnterRoomConfigLIZJ.followStatus = String.valueOf(objValueOf);
            objValueOf = adLiveEnterRoomConfigLIZJ;
        }
        jSONObject.put("adLiveJson", C08JS.LIZLLL(objValueOf));
        if (interfaceC1008930cMVLJ != null) {
            interfaceC1008930cMVLJ.LJIILL(new C0SCL(jSONObject));
        }
    }

    public final void LIZ(String str, String str2) throws JSONException {
        Aweme aweme = this.LIZJ;
        if (aweme != null && C1017070cZd.LLLFF(aweme, str2)) {
            LIZIZ(str);
        } else {
            if (str == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("componentFailReason", str);
            LIZJ(jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.liveshopping.ICommerceLiveShoppingManager
    public final void requestLiveProductInfoIfNeeded(Aweme aweme, Context context, final String str) {
        boolean z;
        Long lValueOf;
        String uid;
        String secUid;
        String liveComponentPayload;
        C0X9S c0x9sLJIIJJI;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        User author;
        User author2;
        User author3;
        LiveRoomStruct newLiveRoomDataExt;
        String uid2;
        String secUid2;
        String liveComponentPayload2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        Long creativeId;
        AwemeRawAd awemeRawAd5;
        AwemeRawAd awemeRawAd6;
        if (context == null || aweme == null) {
            return;
        }
        this.LIZJ = aweme;
        AwemeRawAd awemeRawAd7 = aweme.getAwemeRawAd();
        if (awemeRawAd7 == null) {
            return;
        }
        this.LIZIZ = awemeRawAd7;
        int componentType = 0;
        boolean z2 = true;
        if (C1019110ccv.LIZIZ.LJIIZILJ(aweme) != null && (((awemeRawAd6 = aweme.getAwemeRawAd()) != null && awemeRawAd6.getComponentType() == 5 && Intrinsics.LJFF(str, "request_from_anole")) || C1017070cZd.LLLFF(aweme, str))) {
            z = true;
        } else {
            z = false;
        }
        Integer numValueOf = null;
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestType Miss Match return: requestRefer = ");
            sbLIZ.append(str);
            sbLIZ.append(",componentType = ");
            AwemeRawAd awemeRawAd8 = this.LIZIZ;
            if (awemeRawAd8 != null) {
                numValueOf = Integer.valueOf(awemeRawAd8.getComponentType());
            }
            sbLIZ.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        Aweme aweme2 = this.LIZJ;
        if (aweme2 == null || !AwemeSaaSExtKt.isLive(aweme2)) {
            z2 = false;
        }
        long jLongValue = 0;
        if (z2) {
            Aweme aweme3 = this.LIZJ;
            if (aweme3 != null && (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme3)) != null) {
                User user = newLiveRoomDataExt.owner;
                if (user != null) {
                    uid2 = user.getUid();
                } else {
                    uid2 = null;
                }
                User user2 = newLiveRoomDataExt.owner;
                if (user2 != null) {
                    secUid2 = user2.getSecUid();
                } else {
                    secUid2 = null;
                }
                if (uid2 != null && secUid2 != null) {
                    ICommercializeLiveService iCommercializeLiveService = (ICommercializeLiveService) ServiceManager.get().getService(ICommercializeLiveService.class);
                    String strValueOf = String.valueOf(newLiveRoomDataExt.id);
                    Aweme aweme4 = this.LIZJ;
                    if (aweme4 != null && (awemeRawAd5 = aweme4.getAwemeRawAd()) != null) {
                        componentType = awemeRawAd5.getComponentType();
                    }
                    Aweme aweme5 = this.LIZJ;
                    if (aweme5 != null && (awemeRawAd4 = aweme5.getAwemeRawAd()) != null && (creativeId = awemeRawAd4.getCreativeId()) != null) {
                        jLongValue = creativeId.longValue();
                    }
                    Aweme aweme6 = this.LIZJ;
                    if (aweme6 != null && (awemeRawAd3 = aweme6.getAwemeRawAd()) != null) {
                        liveComponentPayload2 = awemeRawAd3.getLiveComponentPayload();
                    } else {
                        liveComponentPayload2 = null;
                    }
                    c0x9sLJIIJJI = iCommercializeLiveService.LJIIJJI(componentType, strValueOf, uid2, jLongValue, secUid2, liveComponentPayload2);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            Aweme aweme7 = this.LIZJ;
            if (aweme7 != null && (author3 = aweme7.getAuthor()) != null) {
                lValueOf = Long.valueOf(author3.roomId);
            } else {
                lValueOf = null;
            }
            String strValueOf2 = String.valueOf(lValueOf);
            Aweme aweme8 = this.LIZJ;
            if (aweme8 != null && (author2 = aweme8.getAuthor()) != null) {
                uid = author2.getUid();
            } else {
                uid = null;
            }
            Aweme aweme9 = this.LIZJ;
            if (aweme9 != null && (author = aweme9.getAuthor()) != null) {
                secUid = author.getSecUid();
            } else {
                secUid = null;
            }
            if (uid != null && secUid != null) {
                Aweme aweme10 = this.LIZJ;
                if (aweme10 != null && (awemeRawAd2 = aweme10.getAwemeRawAd()) != null) {
                    componentType = awemeRawAd2.getComponentType();
                    jLongValue = awemeRawAd2.getCreativeId().longValue();
                }
                ICommercializeLiveService iCommercializeLiveService2 = (ICommercializeLiveService) ServiceManager.get().getService(ICommercializeLiveService.class);
                Aweme aweme11 = this.LIZJ;
                if (aweme11 != null && (awemeRawAd = aweme11.getAwemeRawAd()) != null) {
                    liveComponentPayload = awemeRawAd.getLiveComponentPayload();
                } else {
                    liveComponentPayload = null;
                }
                c0x9sLJIIJJI = iCommercializeLiveService2.LJIIJJI(componentType, strValueOf2, uid, jLongValue, secUid, liveComponentPayload);
            } else {
                return;
            }
        }
        if (c0x9sLJIIJJI != null) {
            this.LIZLLL = c0x9sLJIIJJI;
            this.LIZ = System.currentTimeMillis();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("requestLiveProductInfoIfNeeded: requestRefer = ");
            sbLIZ2.append(str);
            sbLIZ2.append(",componentType = ");
            AwemeRawAd awemeRawAd9 = this.LIZIZ;
            if (awemeRawAd9 != null) {
                numValueOf = Integer.valueOf(awemeRawAd9.getComponentType());
            }
            sbLIZ2.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ2);
            C0X9S<LiveAdCardModel> c0x9s = this.LIZLLL;
            if (c0x9s != null) {
                c0x9s.enqueue(new InterfaceC594300NSq<LiveAdCardModel>() { // from class: X.0bs9
                    @Override // X.InterfaceC594300NSq
                    public final void onFailure(C0X9S<LiveAdCardModel> c0x9s2, Throwable th) throws JSONException {
                        this.LL.LIZ("app_tech_problem", str);
                    }

                    @Override // X.InterfaceC594300NSq
                    public final void onResponse(C0X9S<LiveAdCardModel> c0x9s2, C0X52<LiveAdCardModel> c0x52) throws JSONException {
                        String str2;
                        AwemeRawAd awemeRawAd10;
                        Integer numValueOf2;
                        C990090bs7 c990090bs7 = this.LL;
                        String str3 = str;
                        c990090bs7.getClass();
                        if (!c0x52.LIZJ()) {
                            c990090bs7.LIZ("app_tech_problem", str3);
                            return;
                        }
                        LiveAdCardModel liveAdCardModel = c0x52.LIZIZ;
                        if (liveAdCardModel == null) {
                            c990090bs7.LIZ("app_tech_problem", str3);
                            return;
                        }
                        String componentFailReason = liveAdCardModel.getComponentFailReason();
                        if (componentFailReason != null && componentFailReason.length() != 0) {
                            c990090bs7.LIZ(liveAdCardModel.getComponentFailReason(), str3);
                            return;
                        }
                        Object frontendExtraData = liveAdCardModel.getFrontendExtraData();
                        if (frontendExtraData == null) {
                            c990090bs7.LIZ("no_live_product", str3);
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.putOpt("duration", Long.valueOf(System.currentTimeMillis() - c990090bs7.LIZ));
                            AwemeRawAd awemeRawAd11 = c990090bs7.LIZIZ;
                            if (awemeRawAd11 != null) {
                                numValueOf2 = Integer.valueOf(awemeRawAd11.getComponentType());
                            } else {
                                numValueOf2 = null;
                            }
                            jSONObject.putOpt("component_type", numValueOf2);
                            C20684815ws.LJIJ("ad_live_card_request", jSONObject);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        Aweme aweme12 = c990090bs7.LIZJ;
                        if (aweme12 != null && (awemeRawAd10 = aweme12.getAwemeRawAd()) != null && awemeRawAd10.getComponentType() == 5 && Intrinsics.LJFF(str3, "request_from_anole")) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("frontendExtraData", C08JS.LIZLLL(frontendExtraData));
                            c990090bs7.LIZJ(jSONObject2);
                            return;
                        }
                        Aweme aweme13 = c990090bs7.LIZJ;
                        if (aweme13 == null || !C1017070cZd.LLLFF(aweme13, str3)) {
                            return;
                        }
                        if (c990090bs7.LJ) {
                            Aweme aweme14 = c990090bs7.LIZJ;
                            if (aweme14 != null) {
                                AwemeBizExtKt.setAnchorLiveDataBindSuccess(aweme14, false);
                            }
                            c990090bs7.LIZIZ("load_timeout");
                            return;
                        }
                        try {
                            ComponentData componentData = liveAdCardModel.getComponentData();
                            if (componentData == null || (str2 = componentData.anchorInfo) == null) {
                                return;
                            }
                            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) C293501Bt.LIZ().LJIIIIZZ(str2, new TypeToken<AnchorCommonStruct>() { // from class: X.0c29
                            }.getType());
                            Aweme aweme15 = c990090bs7.LIZJ;
                            if (aweme15 != null) {
                                List<AnchorCommonStruct> anchors = aweme15.getAnchors();
                                if (anchors != null) {
                                    anchors.add(0, anchorCommonStruct);
                                } else {
                                    anchors = C1697810uHb.LJIILJJIL(anchorCommonStruct);
                                }
                                aweme15.setAnchors(anchors);
                            }
                            Aweme aweme16 = c990090bs7.LIZJ;
                            if (aweme16 != null) {
                                AwemeBizExtKt.setAnchorLiveDataBindSuccess(aweme16, true);
                            }
                            C189200o6.m2constructorimpl(Integer.valueOf(Log.d("CommerceLiveShoppingManager", "handleResponse anchor type, data back and ,anchorLiveDataBindSuccess = true")));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                });
            }
        }
    }
}
