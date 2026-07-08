package Y;

import X.C013C;
import X.C05P0;
import X.C098200Yq;
import X.C09JN;
import X.C1159930gI3;
import X.C1159940gI4;
import X.C1159960gI6;
import X.C1161140gK0;
import X.C1165690gRL;
import X.C1169160gWw;
import X.C1173300gdc;
import X.C1174430gfR;
import X.C1175020ggO;
import X.C1176430gif;
import X.C1177630gkb;
import X.C1180170goh;
import X.C1180920gpu;
import X.C1181120gqE;
import X.C1181930grX;
import X.C1185450gxD;
import X.C1185600gxS;
import X.C11JF;
import X.C11NZ;
import X.C11RO;
import X.C11S5;
import X.C1203930hR1;
import X.C1203960hR4;
import X.C1204060hRE;
import X.C1205170hT1;
import X.C1205180hT2;
import X.C1205760hTy;
import X.C1205780hU0;
import X.C1206260hUm;
import X.C1206280hUo;
import X.C1206420hV2;
import X.C1206700hVU;
import X.C1227904rF;
import X.C123100dR;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1507790pL7;
import X.C1537720q7O;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1618830sED;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C1720106oR;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C1954807lC;
import X.C197039127h;
import X.C19768212Wa;
import X.C19EG;
import X.C19Y3;
import X.C20600815jK;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2189821An6;
import X.C23250099c;
import X.C296270BjN;
import X.C419910GdJ;
import X.C5182020e;
import X.C629740Omy;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC1160870gJZ;
import X.EnumC1204030hRB;
import X.InterfaceC1161890gLD;
import X.InterfaceC1173970geh;
import X.InterfaceC1181010gq3;
import X.InterfaceC1181150gqH;
import X.InterfaceC1206270hUn;
import X.InterfaceC1206370hUx;
import X.InterfaceC1733780vDc;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.tiktok.homepage.mainfragment.NonPersonalizedVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchAssem;
import com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2;
import com.ss.android.ugc.aweme.favorites.profile.FavoriteSearchViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistActivity;
import com.ss.android.ugc.aweme.mix.mixdetail.MixFeedManagerActivity;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.ss.android.ugc.aweme.music.v2.panel.MusicListPanelFragment;
import com.ss.android.ugc.aweme.music.v2.panel.MusicListPanelViewModel;
import com.ss.android.ugc.aweme.ogc.news.managetopics.ManageTopicsContentVM;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiDetailTagStyle;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiContentComponent;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageFragment;
import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;
import com.ss.android.ugc.aweme.poi.detail.postcard.component.BasePoiPostNonPersonalizedComponent;
import com.ss.android.ugc.aweme.poi.detail.postcard.component.INonPersonalizedShowToast;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailCommonHorizontalCardAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailMapAssem;
import com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeHorizontalCardAssem;
import com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeMapAssem;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitMapAssem;
import com.ss.android.ugc.aweme.series.payment.viewmodel.SeriesPurchaseSummaryViewModel;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.data.SlashParam;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.preview.PreviewRangeSelectorFragment;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.nearby.component.NearbyFeedNonPersonalizedComponent;
import com.ss.android.ugc.nearby.container.NearbyContentAssem;
import com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel;
import com.ss.android.ugc.nearby.roaming.RoamingLocationInfo;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS29S0102000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class AObserverS222S0100000_18 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onChanged$20(this, obj);
                break;
            case 21:
                onChanged$21(this, obj);
                break;
            case 22:
                onChanged$22(this, obj);
                break;
            case 23:
                onChanged$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onChanged$24(this, obj);
                break;
            case 25:
                onChanged$25(this, obj);
                break;
            case 26:
                onChanged$26(this, obj);
                break;
            case 27:
                onChanged$27(this, obj);
                break;
            case 28:
                onChanged$28(this, obj);
                break;
            case 29:
                onChanged$29(this, obj);
                break;
            case 30:
                onChanged$30(this, obj);
                break;
            case 31:
                onChanged$31(this, obj);
                break;
            case 32:
                onChanged$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onChanged$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onChanged$34(this, obj);
                break;
            case 35:
                onChanged$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onChanged$36(this, obj);
                break;
            case 37:
                onChanged$37(this, obj);
                break;
            case 38:
                onChanged$38(this, obj);
                break;
        }
    }

    public AObserverS222S0100000_18(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        ((PoiMapDetailMapAssem) aObserverS222S0100000_18.l0).Oo().setState(new AwS597S0100000_18((C1176430gif) obj, 850));
    }

    public static final void onChanged$1(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        String str;
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        C1176430gif c1176430gif = (C1176430gif) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("card_view observe target poi id: ");
        if (c1176430gif != null) {
            str = c1176430gif.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((PoiMapDetailCommonHorizontalCardAssem) aObserverS222S0100000_18.l0).LLJJIJI;
        if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null && state.LJIIIIZZ() > 0) {
            ((PoiMapDetailCommonHorizontalCardAssem) aObserverS222S0100000_18.l0).kp(c1176430gif);
        } else {
            ((PoiMapDetailCommonHorizontalCardAssem) aObserverS222S0100000_18.l0).LLJJJJ = true;
        }
    }

    public static final void onChanged$10(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) obj;
        ((PoiDetailBaseUiContentComponent) aObserverS222S0100000_18.l0).getClass();
        if (!Intrinsics.LJFF(poiDetailResponse.getDataFromAnchor(), Boolean.TRUE)) {
            ((PoiDetailBaseUiContentComponent) aObserverS222S0100000_18.l0).Jo(poiDetailResponse);
        }
    }

    public static final void onChanged$11(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) obj;
        if (((PoiDetailBaseUiSlotComponent) aObserverS222S0100000_18.l0).lp(poiDetailResponse)) {
            ((PoiDetailBaseUiSlotComponent) aObserverS222S0100000_18.l0).op(poiDetailResponse);
        }
    }

    public static final void onChanged$12(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) obj;
        if (((PoiDetailBaseAssem) aObserverS222S0100000_18.l0).op(poiDetailResponse)) {
            ((PoiDetailBaseAssem) aObserverS222S0100000_18.l0).tp(poiDetailResponse);
        }
    }

    public static final void onChanged$13(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        String sessionId;
        InterfaceC1181010gq3 interfaceC1181010gq3LJFF;
        String str;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        final PoiPostPageFragment poiPostPageFragment = (PoiPostPageFragment) aObserverS222S0100000_18.l0;
        if (!poiPostPageFragment.LLJILJILJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestForPersonalizedStatusChanged nonPersonalized=");
            sbLIZ.append(zBooleanValue);
            C2188811AlT.LIZIZ(sbLIZ);
            C1185450gxD c1185450gxD = poiPostPageFragment.UR().poiDetailSessionModel;
            List<SlashParam> listSingletonList = null;
            if (c1185450gxD != null && (sessionId = c1185450gxD.getSessionId()) != null && sessionId.length() != 0 && (interfaceC1181010gq3LJFF = C1180170goh.LJFF(sessionId)) != null && (str = poiPostPageFragment.UR().sourceInstanceId) != null && str.length() != 0) {
                SlashParam slashParamLIZJ = C1180170goh.LIZJ(sessionId, str);
                C1181930grX c1181930grXPu2 = interfaceC1181010gq3LJFF.Pu2();
                String str2 = c1181930grXPu2.LIZ;
                String str3 = c1181930grXPu2.LIZIZ;
                C1227904rF.LIZ.getClass();
                SlashRequestParam slashRequestParam = new SlashRequestParam(str2, str3, C1227904rF.LJI(slashParamLIZJ), C2097608Jq.LJ(), null, null);
                PoiPostPageShareVM poiPostPageShareVMVR = poiPostPageFragment.VR();
                poiPostPageShareVMVR.getClass();
                poiPostPageShareVMVR.setStateImmediate(AFwS256S0000000_18.get$arr$(1059));
                final C013C c013c = new C013C();
                if (slashParamLIZJ != null) {
                    listSingletonList = Collections.singletonList(slashParamLIZJ);
                }
                interfaceC1181010gq3LJFF.ex2(slashRequestParam, str, listSingletonList, new InterfaceC1181150gqH() { // from class: X.0h1j
                    @Override // X.InterfaceC1181150gqH
                    public final void LIZ(BaseComponentData baseComponentData) {
                        PoiListApi.PoiMergedListResponse poiMergedListResponse;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onSuccess data=");
                        sbLIZ2.append(baseComponentData);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (c013c.element) {
                            return;
                        }
                        PoiPostPageShareVM poiPostPageShareVMVR2 = poiPostPageFragment.VR();
                        if (baseComponentData instanceof PoiListApi.PoiMergedListResponse) {
                            poiMergedListResponse = (PoiListApi.PoiMergedListResponse) baseComponentData;
                        } else {
                            poiMergedListResponse = null;
                        }
                        poiPostPageShareVMVR2.NQ2(poiMergedListResponse);
                        c013c.element = true;
                    }

                    @Override // X.InterfaceC1181150gqH
                    public final void onError(Throwable th) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onError throwable=");
                        sbLIZ2.append(th);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        PoiPostPageShareVM poiPostPageShareVMVR2 = poiPostPageFragment.VR();
                        poiPostPageShareVMVR2.getClass();
                        poiPostPageShareVMVR2.setStateImmediate(new AwS597S0100000_18(th, 1133));
                    }
                }, new C1181120gqE(false, false));
            }
        }
        ((PoiPostPageFragment) aObserverS222S0100000_18.l0).LLJILJILJ = false;
    }

    public static final void onChanged$14(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        ((C05P0) aObserverS222S0100000_18.l0).setValue(C2097608Jq.LJIIZILJ((Map) obj));
    }

    public static final void onChanged$15(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        Object c098200Yq;
        try {
            ((InterfaceC1173970geh) aObserverS222S0100000_18.l0).CG1((BaseComponentData) obj);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1180170goh.LIZLLL().LIZIZ("slash_assem_component", new C5182020e(thM5exceptionOrNullimpl, 152));
        }
    }

    public static final void onChanged$16(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        ((InterfaceC1173970geh) aObserverS222S0100000_18.l0).Jr2((C1180920gpu) obj);
    }

    public static final void onChanged$17(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        ((PoiRevisitMapAssem) aObserverS222S0100000_18.l0).Ho().setState(new AwS597S0100000_18((C1177630gkb) obj, 659));
    }

    public static final void onChanged$18(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        ((InterfaceC1161890gLD) aObserverS222S0100000_18.l0).Ab1((com.bytedance.hybrid.spark.raven.component.BaseComponentData) obj);
    }

    public static final void onChanged$19(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        ((InterfaceC1161890gLD) aObserverS222S0100000_18.l0).getClass();
    }

    public static final void onChanged$2(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) throws JSONException {
        Map map;
        C1205760hTy c1205760hTy = (C1205760hTy) obj;
        C1205780hU0 c1205780hU0 = ((EcAISearchAssem) aObserverS222S0100000_18.l0).LLJI;
        if (c1205780hU0 != null) {
            c1205780hU0.LIZIZ.put(c1205760hTy.LIZ, Long.valueOf(c1205760hTy.LIZIZ));
            Map<String, Object> map2 = c1205760hTy.LIZJ;
            if (!map2.isEmpty()) {
                c1205780hU0.LIZJ.putAll(map2);
            }
            Map<String, Long> map3 = c1205760hTy.LIZLLL;
            if (!map3.isEmpty()) {
                c1205780hU0.LIZLLL.putAll(map3);
            }
            if (Intrinsics.LJFF(c1205760hTy.LIZ, "net_request_failure") || Intrinsics.LJFF(c1205760hTy.LIZ, "net_request_complete")) {
                EcAISearchAssem ecAISearchAssem = (EcAISearchAssem) aObserverS222S0100000_18.l0;
                ecAISearchAssem.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Scene.SCENE_SERVICE, "android_inner_perf");
                try {
                    C1205780hU0 c1205780hU02 = ecAISearchAssem.LLJI;
                    if (c1205780hU02 != null) {
                        for (Map.Entry<String, Object> entry : c1205780hU02.LIZJ().entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (!Intrinsics.LJFF(key, "points_ms") && !Intrinsics.LJFF(key, "durations_ms")) {
                                Object objWrap = JSONObject.wrap(value);
                                if (objWrap == null) {
                                    objWrap = JSONObject.NULL;
                                }
                                jSONObject.put(key, objWrap);
                            } else if ((value instanceof Map) && (map = (Map) value) != null) {
                                for (Map.Entry entry2 : map.entrySet()) {
                                    Object key2 = entry2.getKey();
                                    Object value2 = entry2.getValue();
                                    String strValueOf = String.valueOf(key2);
                                    Object objWrap2 = JSONObject.wrap(value2);
                                    if (objWrap2 == null) {
                                        objWrap2 = JSONObject.NULL;
                                    }
                                    jSONObject.put(strValueOf, objWrap2);
                                }
                            } else {
                                Object objWrap3 = JSONObject.wrap(value);
                                if (objWrap3 == null) {
                                    objWrap3 = JSONObject.NULL;
                                }
                                jSONObject.put(key, objWrap3);
                            }
                        }
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                C1507790pL7.LIZ.getClass();
                C1507790pL7.LIZLLL("rd_tiktokec_ai_search_trace", jSONObject);
            }
        }
    }

    public static final void onChanged$20(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        String str;
        C19EG c19egLIZIZ;
        String str2;
        C19EG c19egLIZIZ2;
        ITabStrip iTabStrip;
        RoamingLocationInfo roamingLocationInfo = (RoamingLocationInfo) obj;
        C1205170hT1.LIZ.getClass();
        if (!C1205170hT1.LIZJ()) {
            ((C1205180hT2) aObserverS222S0100000_18.l0).LIZJ();
        }
        C1205180hT2 c1205180hT2 = (C1205180hT2) aObserverS222S0100000_18.l0;
        TextView textView = c1205180hT2.LLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyTabView updateTextView: ");
        if (roamingLocationInfo != null) {
            str = roamingLocationInfo.manualRegionName;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", context: ");
        Context context = c1205180hT2.LL.getContext();
        if (context != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(context);
        } else {
            c19egLIZIZ = null;
        }
        sbLIZ.append(c19egLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (roamingLocationInfo != null) {
            str2 = roamingLocationInfo.manualRegionName;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str2, textView.getText().toString())) {
            textView.setText(C1205170hT1.LJ(str2));
            Context context2 = c1205180hT2.LL.getContext();
            if (context2 != null && (c19egLIZIZ2 = C1388190mED.LIZIZ(context2)) != null && (iTabStrip = (ITabStrip) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZIZ2, null), ITabStrip.class, null)) != null) {
                iTabStrip.jz1();
            }
        }
        C1205170hT1.LIZLLL = ((C1205180hT2) aObserverS222S0100000_18.l0).LLIZ.getText().toString();
    }

    public static final void onChanged$21(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        Map<String, String> extra;
        Map<String, String> extra2;
        String str;
        InterfaceC1181010gq3 interfaceC1181010gq3LJFF;
        C2189821An6 c2189821An6;
        Map<String, String> extra3;
        String str2;
        List<SlashParam> listSingletonList;
        Boolean bool = (Boolean) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observe feedsNonPersonalizedLiveData value=");
        sbLIZ.append(bool);
        C2188811AlT.LIZIZ(sbLIZ);
        final BasePoiPostNonPersonalizedComponent basePoiPostNonPersonalizedComponent = (BasePoiPostNonPersonalizedComponent) aObserverS222S0100000_18.l0;
        if (!basePoiPostNonPersonalizedComponent.LLILLJJLI) {
            boolean zBooleanValue = bool.booleanValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("requestForPersonalizedStatusChanged nonPersonalized=");
            sbLIZ2.append(zBooleanValue);
            sbLIZ2.append(",extras:");
            C2189821An6 c2189821An62 = basePoiPostNonPersonalizedComponent.getPanelContext().LIZJ;
            if (c2189821An62 != null) {
                extra = c2189821An62.getExtra();
            } else {
                extra = null;
            }
            sbLIZ2.append(extra);
            C2188811AlT.LIZIZ(sbLIZ2);
            C2189821An6 c2189821An63 = basePoiPostNonPersonalizedComponent.getPanelContext().LIZJ;
            if (c2189821An63 != null && (extra2 = c2189821An63.getExtra()) != null && (str = extra2.get("poi_session_id")) != null && str.length() != 0 && (interfaceC1181010gq3LJFF = C1180170goh.LJFF(str)) != null && (c2189821An6 = basePoiPostNonPersonalizedComponent.getPanelContext().LIZJ) != null && (extra3 = c2189821An6.getExtra()) != null && (str2 = extra3.get("source_instance_id")) != null && str2.length() != 0) {
                SlashParam slashParamLIZJ = C1180170goh.LIZJ(str, str2);
                C1181930grX c1181930grXPu2 = interfaceC1181010gq3LJFF.Pu2();
                String str3 = c1181930grXPu2.LIZ;
                String str4 = c1181930grXPu2.LIZIZ;
                C1227904rF.LIZ.getClass();
                SlashRequestParam slashRequestParam = new SlashRequestParam(str3, str4, C1227904rF.LJI(slashParamLIZJ), C2097608Jq.LJ(), null, null);
                IPageStateAbility iPageStateAbility = (IPageStateAbility) basePoiPostNonPersonalizedComponent.LLILLL.getValue();
                if (iPageStateAbility != null) {
                    iPageStateAbility.Tq(true, true);
                }
                final C013C c013c = new C013C();
                if (slashParamLIZJ != null) {
                    listSingletonList = Collections.singletonList(slashParamLIZJ);
                } else {
                    listSingletonList = null;
                }
                interfaceC1181010gq3LJFF.ex2(slashRequestParam, str2, listSingletonList, new InterfaceC1181150gqH() { // from class: X.0h1w
                    @Override // X.InterfaceC1181150gqH
                    public final void LIZ(BaseComponentData baseComponentData) {
                        C0SR4 c0sr4Zv0;
                        Aweme aweme;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onSuccess data=");
                        sbLIZ3.append(baseComponentData);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        if (c013c.element) {
                            return;
                        }
                        BasePoiPostNonPersonalizedComponent basePoiPostNonPersonalizedComponent2 = basePoiPostNonPersonalizedComponent;
                        basePoiPostNonPersonalizedComponent2.getClass();
                        if (baseComponentData != null && (baseComponentData instanceof PoiListApi.PoiMergedListResponse)) {
                            C2189821An6 c2189821An64 = basePoiPostNonPersonalizedComponent2.getPanelContext().LIZJ;
                            if (c2189821An64 != null) {
                                c2189821An64.setAid(null);
                            }
                            PoiListApi.PoiMergedListResponse poiMergedListResponse = (PoiListApi.PoiMergedListResponse) baseComponentData;
                            List<PoiListApi.PoiMergedListItem> mergedListItems = poiMergedListResponse.getMergedListItems();
                            if (mergedListItems != null) {
                                ArrayList arrayList = new ArrayList();
                                for (PoiListApi.PoiMergedListItem poiMergedListItem : mergedListItems) {
                                    if (poiMergedListItem != null && (aweme = poiMergedListItem.getAweme()) != null) {
                                        arrayList.add(aweme);
                                    }
                                }
                                IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) basePoiPostNonPersonalizedComponent2.LL.getValue();
                                if (iFeedPanelPlatformAbility != null && (c0sr4Zv0 = iFeedPanelPlatformAbility.Zv0()) != null) {
                                    c0sr4Zv0.LJJLJLI(arrayList, true);
                                }
                            }
                            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) basePoiPostNonPersonalizedComponent2.LLILZ.getValue();
                            if (iViewPagerComponentAbility != null) {
                                iViewPagerComponentAbility.CL2(0, false);
                            }
                            basePoiPostNonPersonalizedComponent2.bo(poiMergedListResponse);
                        }
                        IPageStateAbility iPageStateAbility2 = (IPageStateAbility) basePoiPostNonPersonalizedComponent.LLILLL.getValue();
                        if (iPageStateAbility2 != null) {
                            iPageStateAbility2.R();
                        }
                        INonPersonalizedShowToast iNonPersonalizedShowToast = (INonPersonalizedShowToast) C1558520qew.LIZ(C1558520qew.LJIIL(basePoiPostNonPersonalizedComponent), INonPersonalizedShowToast.class, null);
                        if (iNonPersonalizedShowToast != null) {
                            iNonPersonalizedShowToast.Sh();
                        }
                        c013c.element = true;
                    }

                    @Override // X.InterfaceC1181150gqH
                    public final void onError(Throwable th) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("onError throwable=");
                        sbLIZ3.append(th);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        IPageStateAbility iPageStateAbility2 = (IPageStateAbility) basePoiPostNonPersonalizedComponent.LLILLL.getValue();
                        if (iPageStateAbility2 != null) {
                            iPageStateAbility2.R();
                        }
                    }
                }, new C1181120gqE(false, false));
            }
        }
        ((BasePoiPostNonPersonalizedComponent) aObserverS222S0100000_18.l0).LLILLJJLI = false;
    }

    public static final void onChanged$22(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        if (!(((AddMultiVideoFragment) aObserverS222S0100000_18.l0).getActivity() instanceof MixFeedManagerActivity) && !(((AddMultiVideoFragment) aObserverS222S0100000_18.l0).getActivity() instanceof EditPlaylistActivity)) {
            C197039127h c197039127hSR = ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).SR();
            if (iIntValue >= 1) {
                z = true;
            } else {
                z = false;
            }
            c197039127hSR.setEnabled(z);
        }
        if (((AddMultiVideoFragment) aObserverS222S0100000_18.l0).getActivity() instanceof EditPlaylistActivity) {
            C736680Sv4.LJIJJ(((AddMultiVideoFragment) aObserverS222S0100000_18.l0).PR(), new AwS29S0102000_18((AddMultiVideoFragment) aObserverS222S0100000_18.l0, 100, iIntValue, 1));
        } else if (iIntValue >= 100) {
            if (((AddMultiVideoFragment) aObserverS222S0100000_18.l0).VR().LLIZLLLIL) {
                return;
            }
            AddMultiVideoFragment addMultiVideoFragment = (AddMultiVideoFragment) aObserverS222S0100000_18.l0;
            addMultiVideoFragment.LLJI = true;
            addMultiVideoFragment.VR().LLIZLLLIL = true;
            int i = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).UR().getState().LJII()) {
                int i2 = i + 1;
                if (interfaceC1891350zJl instanceof C1165690gRL) {
                    C1165690gRL c1165690gRL = (C1165690gRL) interfaceC1891350zJl;
                    if (!c1165690gRL.LLILLJJLI) {
                        ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).UR().getState().LJIILJJIL(i, C1165690gRL.LIZ(c1165690gRL, true));
                    }
                }
                i = i2;
            }
            String strJ4 = C786410Ut5.j4(((AddMultiVideoFragment) aObserverS222S0100000_18.l0).getResources().getString(2131850530), Arrays.copyOf(new Object[]{100}, 1));
            C1389890mGx c1389890mGx = new C1389890mGx((AddMultiVideoFragment) aObserverS222S0100000_18.l0);
            c1389890mGx.LJIIJ(strJ4);
            c1389890mGx.LJIIJJI();
            ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).VR().LLIZ = false;
            if (((AddMultiVideoFragment) aObserverS222S0100000_18.l0).getActivity() instanceof MixFeedManagerActivity) {
                C1169160gWw c1169160gWw = C1169160gWw.LIZ;
                String str = ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).RR().LLILLJJLI;
                String str2 = ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).RR().LL;
                c1169160gWw.getClass();
                C1169160gWw.LIZ(str, str2, "manage_video");
            } else {
                C1169160gWw c1169160gWw2 = C1169160gWw.LIZ;
                String str3 = ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).NR().LL;
                String str4 = ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).NR().LLILLJJLI;
                c1169160gWw2.getClass();
                C1169160gWw.LIZ(str3, str4, "create_playlist");
            }
        } else {
            AddMultiVideoFragment addMultiVideoFragment2 = (AddMultiVideoFragment) aObserverS222S0100000_18.l0;
            if (addMultiVideoFragment2.LLJI) {
                addMultiVideoFragment2.LLJI = false;
                int i3 = 0;
                for (InterfaceC1891350zJl interfaceC1891350zJl2 : (ArrayList) addMultiVideoFragment2.UR().getState().LJII()) {
                    int i4 = i3 + 1;
                    if (interfaceC1891350zJl2 instanceof C1165690gRL) {
                        C1165690gRL c1165690gRL2 = (C1165690gRL) interfaceC1891350zJl2;
                        if (!c1165690gRL2.LLILZ && !c1165690gRL2.LLILLJJLI) {
                            ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).UR().getState().LJIILJJIL(i3, C1165690gRL.LIZ(c1165690gRL2, false));
                        }
                    }
                    i3 = i4;
                }
                ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).VR().LLIZ = true;
            }
            ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).VR().LLIZLLLIL = false;
        }
        if (!(((AddMultiVideoFragment) aObserverS222S0100000_18.l0).getActivity() instanceof MixFeedManagerActivity) && !(((AddMultiVideoFragment) aObserverS222S0100000_18.l0).getActivity() instanceof EditPlaylistActivity)) {
            ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).SR().setText(C786410Ut5.j4(((AddMultiVideoFragment) aObserverS222S0100000_18.l0).getString(2131840536), Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue)}, 1)));
        }
    }

    public static final void onChanged$23(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        Boolean bool = (Boolean) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observe feedsNonPersonalizedLiveData value=");
        sbLIZ.append(bool);
        C2188811AlT.LIZIZ(sbLIZ);
        NearbyFeedNonPersonalizedComponent nearbyFeedNonPersonalizedComponent = (NearbyFeedNonPersonalizedComponent) aObserverS222S0100000_18.l0;
        if (!nearbyFeedNonPersonalizedComponent.LLILZ) {
            ((NearbyFeedSharedViewModel) nearbyFeedNonPersonalizedComponent.LL.getValue()).LLJJ = true;
            ((NearbyFeedSharedViewModel) ((NearbyFeedNonPersonalizedComponent) aObserverS222S0100000_18.l0).LL.getValue()).LLJJI = true;
            C1203930hR1.LIZ.getClass();
            C1203930hR1.LIZJ();
            NearbyFeedNonPersonalizedComponent nearbyFeedNonPersonalizedComponent2 = (NearbyFeedNonPersonalizedComponent) aObserverS222S0100000_18.l0;
            boolean zBooleanValue = bool.booleanValue();
            nearbyFeedNonPersonalizedComponent2.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("requestForPersonalizedStatusChanged nonPersonalized=");
            sbLIZ2.append(zBooleanValue);
            C2188811AlT.LIZIZ(sbLIZ2);
            C23250099c.LIZLLL(((AssemViewModel) nearbyFeedNonPersonalizedComponent2.LL.getValue()).getAssemVMScope(), null, null, new C1204060hRE(nearbyFeedNonPersonalizedComponent2, null), 3);
        }
        ((NearbyFeedNonPersonalizedComponent) aObserverS222S0100000_18.l0).LLILZ = false;
    }

    public static final void onChanged$24(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        ((Observer) aObserverS222S0100000_18.l0).onChanged(obj);
    }

    public static final void onChanged$25(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        com.bytedance.hybrid.spark.raven.component.BaseComponentData baseComponentData = ((C1161140gK0) obj).LIZLLL;
        if (baseComponentData != null) {
            ((Observer) aObserverS222S0100000_18.l0).onChanged(baseComponentData);
        }
    }

    public static final void onChanged$26(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        int iYQ2;
        FavoritesFragmentV2 favoritesFragmentV2 = (FavoritesFragmentV2) aObserverS222S0100000_18.l0;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (favoritesFragmentV2.LLIZ != null && C296270BjN.LIZ() && (iYQ2 = favoritesFragmentV2.NR().yQ2("video")) >= 0 && favoritesFragmentV2.LLJILJIL == iYQ2) {
            favoritesFragmentV2.UR(!zBooleanValue, true);
        }
    }

    public static final void onChanged$27(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        C19Y3 c19y3;
        int selectedTabPosition;
        C1206420hV2 c1206420hV2 = (C1206420hV2) obj;
        C19Y3 c19y32 = null;
        if (!c1206420hV2.LIZIZ) {
            c1206420hV2.LIZIZ = true;
            if (c1206420hV2.LIZ != 0 && (c19y3 = ((FavoritesFragmentV2) aObserverS222S0100000_18.l0).LLILZ) != null && (selectedTabPosition = c19y3.getSelectedTabPosition()) >= 0) {
                FavoritesFragmentV2 favoritesFragmentV2 = (FavoritesFragmentV2) aObserverS222S0100000_18.l0;
                C19Y3 c19y33 = favoritesFragmentV2.LLILZ;
                if (c19y33 != null) {
                    c19y32 = c19y33;
                }
                HandlerHook.viewPost(c19y32, new ARunnableS29S0101000_18(selectedTabPosition, favoritesFragmentV2, 11));
            }
        }
    }

    public static final void onChanged$28(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyContentAssem observe feedsNonPersonalizedLiveData value=");
        sbLIZ.append(obj);
        C2188811AlT.LIZIZ(sbLIZ);
        NearbyContentAssem nearbyContentAssem = (NearbyContentAssem) aObserverS222S0100000_18.l0;
        if (!nearbyContentAssem.LLJJ) {
            AssemVMLazy assemVMLazy = nearbyContentAssem.LLJJIII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = NearbyContentAssem.LLJJJ;
            ((NonPersonalizedVM) assemVMLazy.getValue()).vQ2();
            ((NonPersonalizedVM) ((NearbyContentAssem) aObserverS222S0100000_18.l0).LLJJIII.getValue()).xQ2(0, null);
            C1203930hR1.LIZ.getClass();
            C1203930hR1.LIZJ();
            ((NearbyContentAssem) aObserverS222S0100000_18.l0).C51(new C1203960hR4(EnumC1204030hRB.PERSONALIZED_CHANGED));
        }
        ((NearbyContentAssem) aObserverS222S0100000_18.l0).LLJJ = false;
    }

    public static final void onChanged$29(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        ((PoiMapModeMapAssem) aObserverS222S0100000_18.l0).Go().setState(new AwS597S0100000_18((C1175020ggO) obj, 1052));
    }

    public static final void onChanged$3(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        k kVar = (k) obj;
        EcAISearchAssem ecAISearchAssem = (EcAISearchAssem) aObserverS222S0100000_18.l0;
        if (!ecAISearchAssem.LLJIJIL) {
            ecAISearchAssem.LLJIJIL = true;
            C1205780hU0 c1205780hU0 = ecAISearchAssem.LLJI;
            if (c1205780hU0 != null) {
                C1205780hU0.LIZ(c1205780hU0, "data_update_to_fe_first");
            }
        }
        C1537720q7O c1537720q7O = ((EcAISearchAssem) aObserverS222S0100000_18.l0).LLJ;
        if (c1537720q7O != null) {
            c1537720q7O.updateData(kVar.toString());
        }
    }

    public static final void onChanged$30(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        String str;
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        String str2;
        String str3;
        String str4;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        String str5;
        C1175020ggO c1175020ggO = (C1175020ggO) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("card_view observe target poi id: ");
        if (c1175020ggO != null) {
            str = c1175020ggO.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = ((PoiMapModeHorizontalCardAssem) aObserverS222S0100000_18.l0).LLJJIJI;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD2.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
            List<InterfaceC1891350zJl> listLJII = state.LJII();
            PoiMapModeHorizontalCardAssem poiMapModeHorizontalCardAssem = (PoiMapModeHorizontalCardAssem) aObserverS222S0100000_18.l0;
            int i = 0;
            for (Object obj2 : (ArrayList) listLJII) {
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj2;
                    if (interfaceC1891350zJl instanceof C1174430gfR) {
                        if (c1175020ggO != null) {
                            str2 = c1175020ggO.LIZ;
                        } else {
                            str2 = null;
                        }
                        if (C123100dR.LIZ(str2)) {
                            PoiDiscoveryCard poiDiscoveryCard = ((C1174430gfR) interfaceC1891350zJl).LL;
                            if (poiDiscoveryCard != null) {
                                str3 = poiDiscoveryCard.poiId;
                            } else {
                                str3 = null;
                            }
                            if (c1175020ggO != null) {
                                str4 = c1175020ggO.LIZ;
                            } else {
                                str4 = null;
                            }
                            if (Intrinsics.LJFF(str3, str4) && ((viewOnAttachStateChangeListenerC20631115oD = poiMapModeHorizontalCardAssem.LLJJIJI) == null || i != viewOnAttachStateChangeListenerC20631115oD.getCurrentItem())) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("card_view observe target poi id: ");
                                if (c1175020ggO != null) {
                                    str5 = c1175020ggO.LIZ;
                                } else {
                                    str5 = null;
                                }
                                sbLIZ2.append(str5);
                                sbLIZ2.append(" index: ");
                                sbLIZ2.append(i);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                poiMapModeHorizontalCardAssem.LLJJIJIL = true;
                                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = poiMapModeHorizontalCardAssem.LLJJIJI;
                                if (viewOnAttachStateChangeListenerC20631115oD3 != null) {
                                    HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD3, new ARunnableS24S0101000_13(i, poiMapModeHorizontalCardAssem, 9));
                                }
                            }
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public static final void onChanged$31(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        ((TextView) ((PreviewRangeSelectorFragment) aObserverS222S0100000_18.l0).LLILZLL.getValue()).setText((String) obj);
    }

    public static final void onChanged$32(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        ((TextView) ((PreviewRangeSelectorFragment) aObserverS222S0100000_18.l0).LLIZ.getValue()).setText((String) obj);
    }

    public static final void onChanged$33(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        if (!(obj instanceof C1159930gI3) && !(obj instanceof C1159940gI4)) {
            if (obj instanceof C1159960gI6) {
                ((C197039127h) ((PreviewRangeSelectorFragment) aObserverS222S0100000_18.l0).LLIZLLLIL.getValue()).setEnabled(true);
                return;
            }
            throw new C1954807lC();
        }
        ((C197039127h) ((PreviewRangeSelectorFragment) aObserverS222S0100000_18.l0).LLIZLLLIL.getValue()).setEnabled(false);
    }

    public static final void onChanged$34(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((C19768212Wa) aObserverS222S0100000_18.l0).LLLIIIIL(), "alpha", 1.0f, 0.0f);
        C19768212Wa c19768212Wa = (C19768212Wa) aObserverS222S0100000_18.l0;
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.addListener(new ALAdapterS14S0100000_18(c19768212Wa, 11));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public static final void onChanged$35(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        ((ManageTopicsContentVM) aObserverS222S0100000_18.l0).disposeOnClear(C11NZ.LJJJJZ(obj).LJL((C11RO) ((ManageTopicsContentVM) aObserverS222S0100000_18.l0).LLIZ.getValue()).LJJLJLI(new AfS187S0100000_18((ManageTopicsContentVM) aObserverS222S0100000_18.l0, 89)));
    }

    public static final void onChanged$36(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        ((SeriesPurchaseSummaryViewModel) aObserverS222S0100000_18.l0).setState(new AwS597S0100000_18((Map) obj, (Map<String, PoiDetailTagStyle>) 1102));
    }

    public static final void onChanged$37(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        C1618830sED c1618830sED = (C1618830sED) aObserverS222S0100000_18.l0;
        if (iIntValue != 0) {
            z = true;
        } else {
            z = false;
        }
        c1618830sED.LLLFF = z;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isViewPagerScrolling ");
        sbLIZ.append(((C1618830sED) aObserverS222S0100000_18.l0).LLLFF);
        C1720106oR.LJI("NCTBPManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onChanged$38(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        C1618830sED c1618830sED = (C1618830sED) aObserverS222S0100000_18.l0;
        if (iIntValue != 0) {
            z = true;
        } else {
            z = false;
        }
        c1618830sED.LLLFF = z;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isViewPagerScrolling ");
        sbLIZ.append(((C1618830sED) aObserverS222S0100000_18.l0).LLLFF);
        C1720106oR.LJI("NCTBPManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onChanged$4(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        List list;
        Integer numOR;
        FavoriteSearchViewModel favoriteSearchViewModelRR;
        InterfaceC1206370hUx interfaceC1206370hUx;
        String str = (String) obj;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = ((FavoritesFragmentV2) aObserverS222S0100000_18.l0).LLJJJ;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = null;
        if (viewOnAttachStateChangeListenerC20631115oD == null) {
            viewOnAttachStateChangeListenerC20631115oD = null;
        }
        List<InterfaceC1891350zJl> listLIZ = viewOnAttachStateChangeListenerC20631115oD.getFragmentItemOperator().LIZ();
        if (listLIZ != null && !listLIZ.isEmpty() && (list = (List) ((FavoritesFragmentV2) aObserverS222S0100000_18.l0).NR().LLILZIL.getValue()) != null && listLIZ.size() == list.size() && (numOR = ((FavoritesFragmentV2) aObserverS222S0100000_18.l0).OR(str)) != null) {
            int iIntValue = numOR.intValue();
            if (C296270BjN.LIZ() && iIntValue == ((FavoritesFragmentV2) aObserverS222S0100000_18.l0).NR().yQ2("video") && (favoriteSearchViewModelRR = ((FavoritesFragmentV2) aObserverS222S0100000_18.l0).RR()) != null && (interfaceC1206370hUx = favoriteSearchViewModelRR.LLJJIJI) != null) {
                interfaceC1206370hUx.LIZIZ();
            }
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = ((FavoritesFragmentV2) aObserverS222S0100000_18.l0).LLJJJ;
            if (viewOnAttachStateChangeListenerC20631115oD3 != null) {
                viewOnAttachStateChangeListenerC20631115oD2 = viewOnAttachStateChangeListenerC20631115oD3;
            }
            viewOnAttachStateChangeListenerC20631115oD2.setCurrentItem(iIntValue, false);
        }
    }

    public static final void onChanged$5(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        C1206700hVU c1206700hVU = (C1206700hVU) obj;
        C1206260hUm c1206260hUm = null;
        if (!c1206700hVU.LIZIZ) {
            c1206700hVU.LIZIZ = true;
            if (c1206700hVU.LIZ != 0) {
                FavoritesFragmentV2 favoritesFragmentV2 = (FavoritesFragmentV2) aObserverS222S0100000_18.l0;
                List list = (List) favoritesFragmentV2.NR().LLILZIL.getValue();
                if (list != null && !list.isEmpty()) {
                    C1206260hUm c1206260hUm2 = favoritesFragmentV2.LLILZLL;
                    if (c1206260hUm2 != null) {
                        c1206260hUm = c1206260hUm2;
                    }
                    AwS597S0100000_18 awS597S0100000_18 = new AwS597S0100000_18(favoritesFragmentV2, 817);
                    C11JF c11jf = c1206260hUm.LIZLLL;
                    if (c11jf != null) {
                        c11jf.dispose();
                    }
                    InterfaceC1206270hUn.LIZ.getClass();
                    InterfaceC1206270hUn interfaceC1206270hUnLIZ = C1206280hUo.LIZ();
                    C844470XAv.LIZ.getClass();
                    String str = C844470XAv.LJIILLIIL;
                    if (str == null) {
                        str = "";
                    }
                    c1206260hUm.LIZLLL = (C11JF) interfaceC1206270hUnLIZ.LIZ(str, C1206260hUm.LIZIZ()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS44S1200000_18(list, awS597S0100000_18, 0), new C09JN() { // from class: X.00O0
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                            C1C7U.LIZ("FavoriteTabCountHelper@8c64.refreshCountFromApi$2");
                            C1C7U.LIZIZ("FavoriteTabCountHelper@8c64.refreshCountFromApi$2");
                        }
                    });
                }
            }
        }
    }

    public static final void onChanged$6(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        Integer num = (Integer) obj;
        int status = EnumC1160870gJZ.EMPTY.getStatus();
        if (num != null && num.intValue() == status) {
            C786410Ut5.LLLZLZ(((AddMultiVideoFragment) aObserverS222S0100000_18.l0).MR(), 0);
            C1749280vcc c1749280vccMR = ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).MR();
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_no_video;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJI = ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).getString(2131838185);
            c1722300uv6.LJIIIIZZ = ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).getString(2131838186);
            c1749280vccMR.setStatus(c1722300uv6);
            return;
        }
        int status2 = EnumC1160870gJZ.ERROR.getStatus();
        if (num != null && num.intValue() == status2) {
            C786410Ut5.LLLZLZ(((AddMultiVideoFragment) aObserverS222S0100000_18.l0).MR(), 0);
            C1749280vcc c1749280vccMR2 = ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).MR();
            C1722300uv6 c1722300uv62 = new C1722300uv6();
            c1722300uv62.LJI = ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).getString(2131848597);
            c1722300uv62.LJIIIIZZ = ((AddMultiVideoFragment) aObserverS222S0100000_18.l0).getString(2131857684);
            c1722300uv62.LJIIIZ = new AwS597S0100000_18((AddMultiVideoFragment) aObserverS222S0100000_18.l0, 763);
            c1749280vccMR2.setStatus(c1722300uv62);
            return;
        }
        int status3 = EnumC1160870gJZ.SUCCESS.getStatus();
        if (num == null || num.intValue() != status3) {
            return;
        }
        C786410Ut5.LLLZLZ(((AddMultiVideoFragment) aObserverS222S0100000_18.l0).MR(), 8);
    }

    public static final void onChanged$7(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        boolean z;
        Long l = (Long) obj;
        MusicListPanelViewModel musicListPanelViewModelWR = ((MusicListPanelFragment) aObserverS222S0100000_18.l0).WR();
        List<C629740Omy> list = musicListPanelViewModelWR.getState().LL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C629740Omy c629740Omy : list) {
            long id = c629740Omy.LL.getId();
            if (l != null && id == l.longValue()) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(C629740Omy.LIZ(c629740Omy, z, false, 11));
        }
        musicListPanelViewModelWR.setState(new AwS597S0100000_18(arrayList, (List<String>) 821));
    }

    public static final void onChanged$8(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        MusicListPanelViewModel musicListPanelViewModelWR = ((MusicListPanelFragment) aObserverS222S0100000_18.l0).WR();
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        List<C629740Omy> list = musicListPanelViewModelWR.getState().LL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C629740Omy> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C629740Omy.LIZ(it2.next(), false, zBooleanValue, 7));
        }
        musicListPanelViewModelWR.setState(new AwS597S0100000_18(arrayList, (List<String>) 822));
    }

    public static final void onChanged$9(AObserverS222S0100000_18 aObserverS222S0100000_18, Object obj) {
        C1185600gxS c1185600gxS;
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) obj;
        C1173300gdc<C1185600gxS> c1173300gdcQr0 = ((PoiDetailSlashFragment) aObserverS222S0100000_18.l0).qr0();
        if (c1173300gdcQr0 != null && (c1185600gxS = c1173300gdcQr0.LIZ) != null) {
            c1185600gxS.LJIIIZ = poiDetailResponse;
        }
    }
}
