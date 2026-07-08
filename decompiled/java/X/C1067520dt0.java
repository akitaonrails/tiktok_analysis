package X;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.GameAttrInfo;
import com.ss.android.ugc.aweme.feed.model.GameAttrReportThreshold;
import com.ss.android.ugc.aweme.feed.model.GamePartnership;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067520dt0 {
    public final AbstractC1066890drz LIZ;
    public final Function0<String> LIZIZ;
    public boolean LIZJ;
    public AnonymousClass0956 LIZLLL;
    public AnonymousClass0956 LJ;

    public final C1400390mXt LIZIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk);
        Map<String, String> map = c2344009Gk.LIZ;
        return new C1400390mXt(new AwS560S0100000_16(map, (Map<String, String>) 378), new AwS560S0100000_16(map, (Map<String, String>) 379), new AwS560S0100000_16(map, (Map<String, String>) 380), null, null, 24);
    }

    public final Aweme LIZJ() {
        return this.LIZ.LJIIZILJ();
    }

    public final void LIZ(C2344009Gk c2344009Gk) {
        C1067570dt5.LIZ(c2344009Gk, this.LIZ.LLIZ, LIZJ());
    }

    public final void LIZLLL(C2344009Gk c2344009Gk) {
        String schema;
        String string;
        AwemeRawAd awemeRawAdLJJIJL;
        boolean z;
        int iIntValue;
        String extra;
        String str;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        AnchorCommonStruct anchorCommonStruct;
        String dataFromExtra;
        Integer numLJIIJJI;
        String aid;
        C0PSA c0psa = C1067610dt9.LIZ;
        Aweme awemeLIZJ = LIZJ();
        int iType = this.LIZ.type();
        C0PSA c0psa2 = C1067610dt9.LIZ;
        String str2 = "";
        if (c0psa2 != null) {
            if (awemeLIZJ == null || (aid = awemeLIZJ.getAid()) == null) {
                aid = "";
            }
            c0psa2.LJI(iType, aid);
        }
        LIZ(c2344009Gk);
        this.LIZ.LJJII(c2344009Gk, true, true);
        AnchorCommonStruct anchorCommonStruct2 = this.LIZ.LLIZ;
        if (anchorCommonStruct2 == null || (schema = anchorCommonStruct2.getSchema()) == null) {
            schema = "";
        }
        Uri uri = UriProtector.parse(schema);
        boolean zLJIJI = u.LJIJI(uri.getHost(), "webcast_game_detail", false);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LIZ.LL;
        InterfaceC1392640mLO interfaceC1392640mLO2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Activity activityLIZIZ = interfaceC1392640mLO.LIZIZ();
        Uri.Builder builderBuildUpon = uri.buildUpon();
        Aweme awemeLIZJ2 = LIZJ();
        if (awemeLIZJ2 != null) {
            string = Integer.valueOf(AwemeExtKt.getPromoteAdTypeForReport(awemeLIZJ2)).toString();
        } else {
            string = null;
        }
        builderBuildUpon.appendQueryParameter("promote_ad_type", string);
        builderBuildUpon.appendQueryParameter("use_spark", "1");
        builderBuildUpon.appendQueryParameter(Scene.SCENE_SERVICE, "2");
        Aweme awemeLIZJ3 = LIZJ();
        if (AwemeExtKt.isAdTraffic(awemeLIZJ3) || AwemeExtKt.isPseudoAd(awemeLIZJ3)) {
            if (AwemeExtKt.isAdTraffic(awemeLIZJ3)) {
                awemeRawAdLJJIJL = awemeLIZJ3.getAwemeRawAd();
            } else {
                awemeRawAdLJJIJL = C1017070cZd.LJJIJL(awemeLIZJ3);
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "click", awemeRawAdLJJIJL);
            c1022820ciuLIZLLL.LIZJ("game_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
        }
        if (zLJIJI) {
            if (C1017070cZd.LJIL(LIZJ()).length() > 0 && !C1017070cZd.LJJJJZ(LIZJ())) {
                z = true;
            } else {
                z = false;
            }
            if (z && (anchorCommonStruct = this.LIZ.LLIZ) != null && (dataFromExtra = anchorCommonStruct.getDataFromExtra("bc_toggle_style_type", "")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(dataFromExtra)) != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = -1;
            }
            Pair[] pairArr = new Pair[10];
            AnchorCommonStruct anchorCommonStruct3 = this.LIZ.LLIZ;
            if (anchorCommonStruct3 != null) {
                extra = anchorCommonStruct3.getExtra();
            } else {
                extra = null;
            }
            pairArr[0] = new Pair("anchor_extra", String.valueOf(extra));
            String groupId = LIZJ().getGroupId();
            if (groupId != null) {
                str2 = groupId;
            }
            pairArr[1] = new Pair("group_id", str2);
            pairArr[2] = new Pair("anchor_type", String.valueOf(this.LIZ.type()));
            pairArr[3] = new Pair("author_id", AwemeExtKt.getAuthorUid(LIZJ()));
            pairArr[4] = new Pair("request_id", LIZJ().getRequestId());
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LIZ.LL;
            if (interfaceC1392640mLO3 == null) {
                interfaceC1392640mLO3 = null;
            }
            pairArr[5] = new Pair("enter_from", interfaceC1392640mLO3.Cf());
            pairArr[6] = new Pair("bc_label_text", C1017070cZd.LJIL(LIZJ()));
            if (!C1017070cZd.LJJJJZ(LIZJ())) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[7] = new Pair("bc_label_show", str);
            pairArr[8] = new Pair("bc_toggle_style_type", String.valueOf(iIntValue));
            pairArr[9] = new Pair("from_feed", "1");
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            String string2 = builderBuildUpon.toString();
            InterfaceC1392640mLO interfaceC1392640mLO4 = this.LIZ.LL;
            if (interfaceC1392640mLO4 != null) {
                interfaceC1392640mLO2 = interfaceC1392640mLO4;
            }
            C1050980dSK c1050980dSKLIZ = C1050970dSJ.LIZ(interfaceC1392640mLO2.k0(), this.LIZ.LJIILJJIL(), string2, iIntValue);
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
                interfaceC20673515v3K4.pv(this.LIZ.LJIILJJIL(), string2, mapLJIIIIZZ, c1050980dSKLIZ);
                return;
            }
            return;
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(schema);
        c1537900q7g.getClass();
        new C1541950qED(activityLIZIZ, sparkContext).LIZIZ();
    }

    public final void LJ(C2344009Gk c2344009Gk) {
        String schema;
        AwemeRawAd awemeRawAdLJJIJL;
        Aweme awemeLIZJ;
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        GamePartnership gamePartnership;
        GameAttrInfo gameAttrInfo;
        Integer num;
        int iIntValue;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        Integer num2;
        int iIntValue2;
        String schema2;
        InterfaceC20673515v3 interfaceC20673515v3K42;
        StandardBusinessModel standardBusinessModel2;
        GamePartnership gamePartnership2;
        Long lValueOf;
        InterfaceC20673515v3 interfaceC20673515v3K43;
        String schema3;
        ILiveOuterService iLiveOuterService;
        InterfaceC20673515v3 interfaceC20673515v3K44;
        String extra;
        String groupId;
        InterfaceC20673515v3 interfaceC20673515v3K45;
        String aid;
        C0PSA c0psa = C1067610dt9.LIZ;
        Aweme awemeLIZJ2 = LIZJ();
        int iType = this.LIZ.type();
        C0PSA c0psa2 = C1067610dt9.LIZ;
        if (c0psa2 != null) {
            if (awemeLIZJ2 == null || (aid = awemeLIZJ2.getAid()) == null) {
                aid = "";
            }
            c0psa2.LIZLLL(iType, aid);
        }
        LIZ(c2344009Gk);
        AnchorCommonStruct anchorCommonStruct = this.LIZ.LLIZ;
        if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null) {
            schema = "";
        }
        Uri uri = UriProtector.parse(schema);
        int i = 2;
        if (u.LJIJI(uri.getHost(), "webcast_game_detail", false)) {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            builderBuildUpon.appendQueryParameter(Scene.SCENE_SERVICE, "2");
            Pair[] pairArr = new Pair[6];
            AnchorCommonStruct anchorCommonStruct2 = this.LIZ.LLIZ;
            if (anchorCommonStruct2 != null) {
                extra = anchorCommonStruct2.getExtra();
            } else {
                extra = null;
            }
            pairArr[0] = new Pair("anchor_extra", String.valueOf(extra));
            Aweme awemeLIZJ3 = LIZJ();
            if (awemeLIZJ3 != null) {
                groupId = awemeLIZJ3.getGroupId();
            } else {
                groupId = null;
            }
            pairArr[1] = new Pair("group_id", String.valueOf(groupId));
            pairArr[2] = new Pair("anchor_type", String.valueOf(this.LIZ.type()));
            pairArr[3] = new Pair("author_id", AwemeExtKt.getAuthorUid(LIZJ()));
            pairArr[4] = new Pair("request_id", LIZJ().getRequestId());
            InterfaceC1392640mLO interfaceC1392640mLO = this.LIZ.LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            pairArr[5] = new Pair("enter_from", interfaceC1392640mLO.Cf());
            Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            ILiveOuterService iLiveOuterService2 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService2 != null && (interfaceC20673515v3K45 = iLiveOuterService2.k4()) != null) {
                interfaceC20673515v3K45.LJIJJ(builderBuildUpon.build().toString(), mapLJIIIIZZ);
            }
            this.LIZJ = true;
        }
        AnchorCommonStruct anchorCommonStruct3 = this.LIZ.LLIZ;
        if (anchorCommonStruct3 != null && (schema3 = anchorCommonStruct3.getSchema()) != null && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC20673515v3K44 = iLiveOuterService.k4()) != null) {
            interfaceC20673515v3K44.LLIILII(schema3);
        }
        ILiveOuterService iLiveOuterService3 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService3 != null && (interfaceC20673515v3K43 = iLiveOuterService3.k4()) != null) {
            interfaceC20673515v3K43.LJLL();
        }
        Aweme awemeLIZJ4 = LIZJ();
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LIZ.LL;
        if (interfaceC1392640mLO2 == null) {
            interfaceC1392640mLO2 = null;
        }
        if (awemeLIZJ4 != null) {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            String authorUid = AwemeExtKt.getAuthorUid(awemeLIZJ4);
            ContentModel contentModel2 = awemeLIZJ4.getContentModel();
            if (contentModel2 != null && (standardBusinessModel2 = contentModel2.standardBusinessModel) != null && (gamePartnership2 = standardBusinessModel2.getGamePartnership()) != null && (lValueOf = Long.valueOf(gamePartnership2.publisherTaskId)) != null && lValueOf.longValue() > 0 && !Intrinsics.LJFF(curUserId, authorUid)) {
                String aid2 = awemeLIZJ4.getAid();
                C827070WcT.LIZ.getClass();
                String strLIZJ = C827070WcT.LIZJ();
                String strLLIIJI = interfaceC1392640mLO2.LLIIJI();
                int promoteAdTypeForReport = AwemeExtKt.getPromoteAdTypeForReport(awemeLIZJ4);
                long jCurrentTimeMillis = System.currentTimeMillis();
                ILiveOuterService iLiveOuterService4 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                if (iLiveOuterService4 != null) {
                    if (aid2 == null) {
                        aid2 = "";
                    }
                    if (strLLIIJI == null) {
                        strLLIIJI = "";
                    }
                    iLiveOuterService4.u5(Long.valueOf(jCurrentTimeMillis), aid2, curUserId, strLIZJ, strLLIIJI, Integer.valueOf(promoteAdTypeForReport));
                }
            }
        }
        if (C0BT9.LIZ() && (contentModel = (awemeLIZJ = LIZJ()).getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (gamePartnership = standardBusinessModel.getGamePartnership()) != null && (gameAttrInfo = gamePartnership.gameAttrInfo) != null) {
            for (GameAttrReportThreshold gameAttrReportThreshold : gameAttrInfo.reportThreshold) {
                Integer num3 = gameAttrReportThreshold.attrTouchPoint;
                if (num3 != null && num3.intValue() == i) {
                    if (gameAttrReportThreshold.enableViewReport && (num2 = gameAttrReportThreshold.viewThresholdDuration) != null && (iIntValue2 = num2.intValue()) >= 0) {
                        ILiveOuterService iLiveOuterService5 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                        if (iLiveOuterService5 != null && (interfaceC20673515v3K42 = iLiveOuterService5.k4()) != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("type", "vta");
                            jSONObject.put("step", "begin");
                            jSONObject.put("touch_point", 2);
                            jSONObject.put("enter_from", this.LIZ.LJIJJLI());
                            String aid3 = awemeLIZJ.getAid();
                            if (aid3 == null) {
                                aid3 = "";
                            }
                            jSONObject.put("item_id", aid3);
                            jSONObject.put("game_id", String.valueOf(gamePartnership.gameId));
                            jSONObject.put("creator_id", AwemeExtKt.getAuthorUid(awemeLIZJ));
                            jSONObject.put("task_id", String.valueOf(gamePartnership.publisherTaskId));
                            jSONObject.put("threshold_duration", iIntValue2);
                            interfaceC20673515v3K42.LJIL(jSONObject);
                        }
                        int i2 = iIntValue2 * LSPassThroughRecordSizeConfig.DEFAULT;
                        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        AnchorCommonStruct anchorCommonStruct4 = this.LIZ.LLIZ;
                        if (anchorCommonStruct4 == null || (schema2 = anchorCommonStruct4.getSchema()) == null) {
                            schema2 = "";
                        }
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(schema2), "game_id");
                        C1DFH c1dfh = C0PEM.LIZ;
                        this.LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1067540dt2(i2, this, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, gameAttrReportThreshold, gameAttrInfo, null), 3);
                    }
                    if (gameAttrReportThreshold.enableClickReport && (num = gameAttrReportThreshold.clickThresholdDuration) != null && (iIntValue = num.intValue()) >= 0) {
                        ILiveOuterService iLiveOuterService6 = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
                        if (iLiveOuterService6 != null && (interfaceC20673515v3K4 = iLiveOuterService6.k4()) != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("type", "evta");
                            jSONObject2.put("step", "begin");
                            jSONObject2.put("touch_point", 2);
                            jSONObject2.put("enter_from", this.LIZ.LJIJJLI());
                            String aid4 = awemeLIZJ.getAid();
                            if (aid4 == null) {
                                aid4 = "";
                            }
                            jSONObject2.put("item_id", aid4);
                            jSONObject2.put("game_id", String.valueOf(gamePartnership.gameId));
                            jSONObject2.put("creator_id", AwemeExtKt.getAuthorUid(awemeLIZJ));
                            jSONObject2.put("task_id", String.valueOf(gamePartnership.publisherTaskId));
                            jSONObject2.put("threshold_duration", iIntValue);
                            interfaceC20673515v3K4.LJIL(jSONObject2);
                        }
                        int i3 = iIntValue * LSPassThroughRecordSizeConfig.DEFAULT;
                        AnonymousClass0956 anonymousClass09562 = this.LJ;
                        if (anonymousClass09562 != null) {
                            anonymousClass09562.LIZIZ(null);
                        }
                        C1DFH c1dfh2 = C0PEM.LIZ;
                        this.LJ = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1067530dt1(i3, this, gameAttrReportThreshold, null), 3);
                    }
                }
                i = 2;
            }
        }
        Aweme awemeLIZJ5 = LIZJ();
        if (AwemeExtKt.isAdTraffic(awemeLIZJ5) || AwemeExtKt.isPseudoAd(awemeLIZJ5)) {
            if (AwemeExtKt.isAdTraffic(awemeLIZJ5)) {
                awemeRawAdLJJIJL = awemeLIZJ5.getAwemeRawAd();
            } else {
                awemeRawAdLJJIJL = C1017070cZd.LJJIJL(awemeLIZJ5);
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAdLJJIJL);
            c1022820ciuLIZLLL.LIZJ("game_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
        }
    }

    public final void LJFF(Aweme aweme) {
        ILiveOuterService iLiveOuterService;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        if (C0BT9.LIZ()) {
            AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LIZLLL = null;
            AnonymousClass0956 anonymousClass09562 = this.LJ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            this.LJ = null;
        }
        if (aweme != null && this.LIZJ && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            interfaceC20673515v3K4.LJJJJI(aid);
        }
    }

    public final void LJI(List<AnchorCommonStruct> list) {
        try {
            Aweme awemeLIZJ = LIZJ();
            if (awemeLIZJ == null) {
                return;
            }
            int iType = this.LIZ.type();
            ArrayList arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : list) {
                if (anchorCommonStruct.getType() == iType) {
                    arrayList.add(anchorCommonStruct);
                }
            }
            AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) C13LP.LJJJLL(arrayList);
            if (anchorCommonStruct2 == null) {
                return;
            }
            InterfaceC1392640mLO interfaceC1392640mLO = this.LIZ.LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            if (C1067560dt4.LIZ(anchorCommonStruct2, awemeLIZJ, interfaceC1392640mLO)) {
                list.removeAll(arrayList);
            }
            C0PSA c0psa = C1067610dt9.LIZ;
            if (!C1067580dt6.LIZ(awemeLIZJ, anchorCommonStruct2, iType)) {
                list.removeAll(arrayList);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS c13ss = C13SS.LIZ;
            String string = e.toString();
            c13ss.getClass();
            C13SS.LIZIZ("GameLivePartnershipPoiAnchorMaker", string, null);
        }
    }

    public C1067520dt0(AbstractC1066890drz abstractC1066890drz, Function0<String> function0) {
        this.LIZ = abstractC1066890drz;
        this.LIZIZ = function0;
    }
}
