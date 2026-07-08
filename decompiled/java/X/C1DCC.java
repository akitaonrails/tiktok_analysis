package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.features.SessionUnconsumptionItem;
import com.ss.android.ugc.aweme.feed.features.SessionUnconsumptionItemList;
import com.ss.android.ugc.aweme.feed.features.model.SessionFeatureItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.EcommerceInfo;
import com.ss.android.ugc.aweme.feed.model.live.HotReloadFeedParams;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.service.ILocalServicePoiRealTimeFeatureService;
import com.ss.android.ugc.aweme.service.INewUserFeedSignalService;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DCC, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCC {
    public static C1D9U LIZ() {
        C1D9V c1d9v = new C1D9V();
        C1D9S c1d9s = new C1D9S();
        C590410NDr.LIZ.getClass();
        c1d9s.LIZLLL = Integer.valueOf(C590440NDu.LJIIIIZZ ? 1 : 0);
        c1d9s.LJ = Integer.valueOf(C590410NDr.LIZJ + C590410NDr.LIZLLL + 1);
        c1d9v.LJFF = c1d9s.build();
        return c1d9v.build();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1DCI LIZJ() {
        /*
            Method dump skipped, instruction units count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DCC.LIZJ():X.1DCI");
    }

    public static Boolean LIZLLL(String str) {
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_performance", 0, 2, null);
        if (producer$default == null) {
            return null;
        }
        return FeatureProducer.getBooleanFeature$default(producer$default, str, null, "feed_carry", null, 10, null);
    }

    public static Number LJ(String str) {
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_performance", 0, 2, null);
        if (producer$default == null) {
            return null;
        }
        return FeatureProducer.getNumericFeature$default(producer$default, str, (JSONObject) null, "feed_carry", (ReturnCode) null, 10, (Object) null);
    }

    public static Number LJFF(String str) {
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "static", 0, 2, null);
        if (producer$default == null) {
            return null;
        }
        return FeatureProducer.getNumericFeature$default(producer$default, str, (JSONObject) null, "feed_carry", (ReturnCode) null, 10, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, X.1DCW] */
    public static C1DC3 LJI(String str) {
        C21313218aw c21313218awLIZ;
        try {
            ILocalServicePoiRealTimeFeatureService iLocalServicePoiRealTimeFeatureService = (ILocalServicePoiRealTimeFeatureService) PluggableExtentionKt.pluggableSpi$default(ILocalServicePoiRealTimeFeatureService.class, false, false, false, 14, null);
            if (iLocalServicePoiRealTimeFeatureService == null || (c21313218awLIZ = iLocalServicePoiRealTimeFeatureService.LIZ(str)) == null) {
                return null;
            }
            C259800zU c259800zU = new C259800zU();
            C21313018au c21313018au = c21313218awLIZ.LIZJ;
            if (c21313018au != null) {
                C1DCX c1dcx = new C1DCX();
                Boolean boolValueOf = Boolean.valueOf(c21313018au.LIZ);
                if (boolValueOf.booleanValue()) {
                    boolValueOf.booleanValue();
                    c1dcx.LIZLLL = Boolean.TRUE;
                }
                Boolean boolValueOf2 = Boolean.valueOf(c21313018au.LIZIZ);
                if (boolValueOf2.booleanValue()) {
                    boolValueOf2.booleanValue();
                    c1dcx.LJ = Boolean.TRUE;
                }
                Boolean boolValueOf3 = Boolean.valueOf(c21313018au.LIZJ);
                if (boolValueOf3.booleanValue()) {
                    boolValueOf3.booleanValue();
                    c1dcx.LJFF = Boolean.TRUE;
                }
                Boolean boolValueOf4 = Boolean.valueOf(c21313018au.LIZLLL);
                if (boolValueOf4.booleanValue()) {
                    boolValueOf4.booleanValue();
                    c1dcx.LJI = Boolean.TRUE;
                }
                Boolean boolValueOf5 = Boolean.valueOf(c21313018au.LJ);
                if (boolValueOf5.booleanValue()) {
                    boolValueOf5.booleanValue();
                    c1dcx.LJII = Boolean.TRUE;
                }
                Boolean boolValueOf6 = Boolean.valueOf(c21313018au.LJFF);
                if (boolValueOf6.booleanValue()) {
                    boolValueOf6.booleanValue();
                    c1dcx.LJIIIIZZ = Boolean.TRUE;
                }
                Boolean boolValueOf7 = Boolean.valueOf(c21313018au.LJI);
                if (boolValueOf7.booleanValue()) {
                    boolValueOf7.booleanValue();
                    c1dcx.LJIIIZ = Boolean.TRUE;
                }
                Long lValueOf = Long.valueOf(c21313018au.LJII);
                if (lValueOf.longValue() > 0) {
                    c1dcx.LJIIJ = Long.valueOf(lValueOf.longValue());
                }
                Long lValueOf2 = Long.valueOf(c21313018au.LJIIIIZZ);
                if (lValueOf2.longValue() > 0) {
                    c1dcx.LJIIJJI = Long.valueOf(lValueOf2.longValue());
                }
                c259800zU.element = c1dcx.build();
            }
            C1DC4 c1dc4 = new C1DC4();
            c1dc4.LIZLLL = c21313218awLIZ.LIZ;
            String str2 = c21313218awLIZ.LIZIZ;
            if (str2 != null && str2.length() > 0) {
                c1dc4.LJ = str2;
            }
            C1DCW c1dcw = (C1DCW) c259800zU.element;
            if (c1dcw != null) {
                c1dc4.LJFF = c1dcw;
            }
            return c1dc4.build();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DC5.LIZIZ.getValue().LJIIZILJ("fillPoiFeature failed", e);
            return null;
        }
    }

    public static C1DCB LIZIZ(C1601460rmC c1601460rmC, C1DC9 c1dc9) {
        ArrayList<String> arrayList;
        boolean z;
        SessionUnconsumptionItemList sessionUnconsumptionItemListLIZ;
        Pair<String, String> pairLIZJ;
        boolean z2;
        Long adId;
        Long creativeId;
        AwemeRawAd awemeRawAd;
        EcommerceInfo ecommerceInfo;
        HotReloadFeedParams hotReloadFeedParams;
        int iLongValue;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        String str;
        if (((Number) C270640Aj8.LIZ.getValue()).intValue() > 0) {
            c1dc9.LJIJ = Long.valueOf(System.currentTimeMillis());
        }
        synchronized (C2252031DCn.LIZ) {
            arrayList = C2252031DCn.LJFF;
        }
        C1516540pZE.LIZ(arrayList);
        c1dc9.LJFF = arrayList;
        c1dc9.LJ = Integer.valueOf((int) C2183861AdU.LIZ.LIZLLL().getLong("key_day_view_time", 0L));
        ArrayList arrayList2 = new ArrayList();
        int i = c1601460rmC.LIZIZ;
        if (((Number) C300580BqK.LIZ.getValue()).intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ArrayList<SessionFeatureItem> arrayList3 = new ArrayList();
            if (C0BPM.LIZ() && i == 0) {
                int i2 = C1DCM.LJ;
                C1DCM c1dcm = C2183851AdT.LIZ;
                c1dcm.getClass();
                try {
                    String string = ((InterfaceC625970Ogt) c1dcm.LIZJ.getValue()).getString("feature_cache_key", null);
                    if (string != null && string.length() != 0) {
                        Type type = new TypeToken<ArrayList<SessionFeatureItem>>() { // from class: X.1D1b
                        }.getType();
                        C1227904rF.LIZ.getClass();
                        arrayList3.addAll((ArrayList) C1227904rF.LIZJ(string, type));
                        ((InterfaceC625970Ogt) c1dcm.LIZJ.getValue()).LIZ("feature_cache_key");
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            } else {
                int i3 = C1DCM.LJ;
                C2183851AdT.LIZ.LIZIZ(arrayList3);
            }
            for (SessionFeatureItem sessionFeatureItem : arrayList3) {
                C1DCF c1dcf = new C1DCF();
                if (((Number) C270640Aj8.LIZ.getValue()).intValue() > 0) {
                    c1dcf.LJJI = Long.valueOf(sessionFeatureItem.timestamp);
                }
                c1dcf.LIZLLL = sessionFeatureItem.awemeId;
                c1dcf.LJIILIIL = sessionFeatureItem.LIZ;
                c1dcf.LJJIJIL = sessionFeatureItem.isAd;
                c1dcf.LJJIJIIJIL = sessionFeatureItem.isEcom;
                c1dcf.LJJIJ = sessionFeatureItem.isDisliked;
                c1dcf.LJJIII = sessionFeatureItem.isFollow;
                c1dcf.LJIJJ = sessionFeatureItem.isBytevc1;
                c1dcf.LJJIIJ = Boolean.valueOf(sessionFeatureItem.isEnterUserProfile);
                c1dcf.LJIIIIZZ = Integer.valueOf(sessionFeatureItem.vv);
                c1dcf.LJ = sessionFeatureItem.awemeType;
                c1dcf.LJJIIZI = sessionFeatureItem.isShare;
                c1dcf.LJII = sessionFeatureItem.videoDuration;
                c1dcf.LJJIIZ = sessionFeatureItem.isFavorite;
                c1dcf.LJJII = Boolean.valueOf(sessionFeatureItem.isPlayFinished);
                c1dcf.LJIILLIIL = sessionFeatureItem.blockCount;
                c1dcf.LJIIZILJ = sessionFeatureItem.blockDuration;
                c1dcf.LJIILL = sessionFeatureItem.firstFrameDuration;
                c1dcf.LJJIJIIJI = sessionFeatureItem.isReported;
                c1dcf.LJJIIJZLJL = sessionFeatureItem.isLike;
                c1dcf.LJIIL = Integer.valueOf(sessionFeatureItem.dayRNum);
                c1dcf.LJIIJJI = Integer.valueOf(sessionFeatureItem.dayVNum);
                c1dcf.LJIIJ = Integer.valueOf(sessionFeatureItem.sessionRNum);
                c1dcf.LJIIIZ = Integer.valueOf(sessionFeatureItem.sessionVNum);
                c1dcf.LJFF = Integer.valueOf((int) sessionFeatureItem.playTimeSum);
                c1dcf.LJIJ = Long.valueOf(sessionFeatureItem.videoBitrate);
                c1dcf.LJIJI = sessionFeatureItem.videoResolution;
                c1dcf.LJIILJJIL = sessionFeatureItem.videoStartTimestamp;
                c1dcf.LJI = Integer.valueOf((int) sessionFeatureItem.playTimeLiveRoom);
                c1dcf.LJJIZ = sessionFeatureItem.isCommentted;
                c1dcf.LJJJ = sessionFeatureItem.isClickComment;
                c1dcf.LJJJI = sessionFeatureItem.isEnterMusic;
                Long l = sessionFeatureItem.playTimeMax;
                if (l != null) {
                    iLongValue = (int) l.longValue();
                } else {
                    iLongValue = 0;
                }
                c1dcf.LJIJJLI = Integer.valueOf(iLongValue);
                c1dcf.LJJJIL = Boolean.valueOf(sessionFeatureItem.isAdClick);
                if (C0BTE.LIZ()) {
                    c1dcf.LJJJJJ = sessionFeatureItem.isLive;
                    HotReloadFeedParams hotReloadFeedParams2 = sessionFeatureItem.LIZJ;
                    if (hotReloadFeedParams2 != null) {
                        c1dcf.LJJJJJL = new C1518290pc3(hotReloadFeedParams2.isHotRefresh(), hotReloadFeedParams2.getSlateGroupType(), hotReloadFeedParams2.getDeletedCardId());
                    }
                }
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("ec_feature_gating_add_ecom_item_logid", true) && Intrinsics.LJFF(sessionFeatureItem.isEcom, Boolean.TRUE) && (str = sessionFeatureItem.logId) != null && str.length() != 0) {
                    c1dcf.LJJIJLIJ = sessionFeatureItem.logId;
                }
                C275630ArB.LIZ.getClass();
                if (((Boolean) C275630ArB.LIZIZ.getValue()).booleanValue() && Intrinsics.LJFF(sessionFeatureItem.isAd, Boolean.TRUE)) {
                    c1dcf.LJJIJL = String.valueOf(sessionFeatureItem.adId);
                    String str2 = sessionFeatureItem.logId;
                    if (str2 == null) {
                        str2 = "";
                    }
                    c1dcf.LJJIJLIJ = str2;
                    c1dcf.LJJIL = String.valueOf(sessionFeatureItem.creativeId);
                }
                C1DC3 c1dc3LJI = LJI(sessionFeatureItem.awemeId);
                if (c1dc3LJI != null) {
                    c1dcf.LJIL = c1dc3LJI;
                }
                if (C21141917oP.LIZ() && (!sessionFeatureItem.LIZIZ.isEmpty())) {
                    List<C558502Fr> list = sessionFeatureItem.LIZIZ;
                    C1516540pZE.LIZ(list);
                    c1dcf.LJJ = list;
                }
                if (C0BPM.LIZ()) {
                    c1dcf.LJJIJLIJ = sessionFeatureItem.logId;
                }
                if (C0BPK.LIZ()) {
                    Boolean bool = sessionFeatureItem.isSurveyShowed;
                    Boolean bool2 = sessionFeatureItem.isSurveyLiked;
                    Boolean bool3 = sessionFeatureItem.isSurveyNotLiked;
                    if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                        if (bool2 != null) {
                            zBooleanValue = bool2.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                        if (bool3 != null) {
                            zBooleanValue2 = bool3.booleanValue();
                        } else {
                            zBooleanValue2 = false;
                        }
                        c1dcf.LJJLI = new C1C1H(bool, boolValueOf, Boolean.valueOf(zBooleanValue2));
                    }
                }
                if (!sessionFeatureItem.dynamicFeatures.isEmpty()) {
                    try {
                        c1dcf.LJJL = C786410Ut5.J3(new JSONObject(sessionFeatureItem.dynamicFeatures));
                        C189200o6.m2constructorimpl(c1dcf);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                }
                arrayList2.add(c1dcf.build());
            }
        }
        C1516540pZE.LIZ(arrayList2);
        c1dc9.LIZLLL = arrayList2;
        C286020BIy.LIZ.getClass();
        if (C286020BIy.LIZ()) {
            ArrayList arrayList4 = new ArrayList();
            List<? extends Aweme> list2 = c1601460rmC.LJJIJ;
            if (list2 != null && C286020BIy.LIZ() && ((Number) C300580BqK.LIZ.getValue()).intValue() != 2) {
                for (Aweme aweme : list2) {
                    C1DCV c1dcv = new C1DCV();
                    c1dcv.LIZLLL = aweme.getAid();
                    c1dcv.LJ = Integer.valueOf(aweme.getAwemeType());
                    c1dcv.LJFF = Boolean.valueOf(aweme.isAd());
                    if (C0BTE.LIZ()) {
                        c1dcv.LJIIJJI = Boolean.valueOf(AwemeSaaSExtKt.isLive(aweme));
                        LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI(aweme);
                        if (liveRoomStructLJI != null && (hotReloadFeedParams = liveRoomStructLJI.hotReloadFeedParams) != null) {
                            c1dcv.LJIIL = new C1518290pc3(hotReloadFeedParams.isHotRefresh(), hotReloadFeedParams.getSlateGroupType(), hotReloadFeedParams.getDeletedCardId());
                        }
                    }
                    if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJJJZ(aweme) || ((awemeRawAd = aweme.getAwemeRawAd()) != null && (ecommerceInfo = awemeRawAd.getEcommerceInfo()) != null && Intrinsics.LJFF(ecommerceInfo.isEcom(), Boolean.TRUE))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c1dcv.LJI = Boolean.valueOf(z2);
                    if (aweme.isAd()) {
                        AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
                        if (awemeRawAdLJJIJLIJ != null) {
                            adId = awemeRawAdLJJIJLIJ.getAdId();
                        } else {
                            adId = null;
                        }
                        c1dcv.LJII = String.valueOf(adId);
                        AwemeRawAd awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme);
                        if (awemeRawAdLJJIJLIJ2 != null) {
                            creativeId = awemeRawAdLJJIJLIJ2.getCreativeId();
                        } else {
                            creativeId = null;
                        }
                        c1dcv.LJIIIIZZ = String.valueOf(creativeId);
                    }
                    arrayList4.add(c1dcv.build());
                }
            }
            if (C866950Xzh.LIZIZ(arrayList4)) {
                C2251491DAl c2251491DAl = new C2251491DAl();
                C1516540pZE.LIZ(arrayList4);
                c2251491DAl.LIZLLL = arrayList4;
                c2251491DAl.LJ = Long.valueOf(System.currentTimeMillis());
                c1dc9.LJIILJJIL = c2251491DAl.build();
            }
        }
        C1393430mMf.LIZ.getClass();
        ArrayList<Pair> arrayList5 = new ArrayList(C1393430mMf.LIZIZ);
        INewUserFeedSignalService iNewUserFeedSignalService = (INewUserFeedSignalService) ServiceManager.get().getService(INewUserFeedSignalService.class);
        if (iNewUserFeedSignalService != null && (pairLIZJ = iNewUserFeedSignalService.LIZJ()) != null) {
            arrayList5.add(new Pair("current_skip_cnt", pairLIZJ.getFirst()));
            arrayList5.add(new Pair("history_skip_cnt", pairLIZJ.getSecond()));
        }
        if (!arrayList5.isEmpty()) {
            C1DC5.LIZ.getClass();
            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
            for (Pair pair : arrayList5) {
                C2251361D9y c2251361D9y = new C2251361D9y();
                c2251361D9y.LIZLLL = (String) pair.getFirst();
                c2251361D9y.LJ = (String) pair.getSecond();
                arrayList6.add(c2251361D9y.build());
            }
            C1516540pZE.LIZ(arrayList6);
            c1dc9.LJIILL = arrayList6;
        }
        int i4 = c1601460rmC.LIZIZ;
        if (C295980Biu.LIZ() && ((i4 == 0 || i4 == 1 || i4 == 2 || i4 == 4) && (sessionUnconsumptionItemListLIZ = C1347505Pd.LIZ(c1601460rmC.LIZIZ)) != null && (!sessionUnconsumptionItemListLIZ.items.isEmpty()))) {
            C1DC5.LIZ.getClass();
            if (((Number) C300580BqK.LIZ.getValue()).intValue() != 2) {
                ArrayList arrayList7 = new ArrayList(sessionUnconsumptionItemListLIZ.items.size());
                for (SessionUnconsumptionItem sessionUnconsumptionItem : sessionUnconsumptionItemListLIZ.items) {
                    C1DCV c1dcv2 = new C1DCV();
                    c1dcv2.LIZLLL = sessionUnconsumptionItem.aid;
                    c1dcv2.LJ = Integer.valueOf(sessionUnconsumptionItem.awemeType);
                    c1dcv2.LJFF = Boolean.valueOf(sessionUnconsumptionItem.isAd);
                    c1dcv2.LJI = Boolean.valueOf(sessionUnconsumptionItem.isEcom);
                    c1dcv2.LJIIIZ = Long.valueOf(sessionUnconsumptionItem.ts);
                    c1dcv2.LJIIJ = Boolean.valueOf(sessionUnconsumptionItem.isCache);
                    if (((Number) C270580Aj2.LIZ.getValue()).intValue() > 0 && sessionUnconsumptionItem.isAd) {
                        c1dcv2.LJII = sessionUnconsumptionItem.adId;
                        c1dcv2.LJIIIIZZ = sessionUnconsumptionItem.creativeId;
                    }
                    arrayList7.add(c1dcv2.build());
                }
                C2251491DAl c2251491DAl2 = new C2251491DAl();
                C1516540pZE.LIZ(arrayList7);
                c2251491DAl2.LIZLLL = arrayList7;
                c2251491DAl2.LJ = Long.valueOf(sessionUnconsumptionItemListLIZ.timestamp);
                c1dc9.LJIILIIL = c2251491DAl2.build();
            }
        }
        if (c1601460rmC.LIZIZ == 14) {
            List list3 = c1601460rmC.LJJIJIL;
            if (list3 == null) {
                list3 = C13BV.INSTANCE;
            }
            c1dc9.LJIIZILJ = new C1517790pbF(c1601460rmC.LJJIJIIJIL, list3);
        }
        return c1dc9.build();
    }
}
