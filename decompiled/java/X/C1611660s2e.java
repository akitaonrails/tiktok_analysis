package X;

import android.util.LruCache;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.service.IDramaDiscoverService;
import com.ss.android.ugc.aweme.service.ISeriesAdsETService;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import com.ss.android.ugc.aweme.service.MiniDramaTouchPointService;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0s2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1611660s2e extends C1612480s3y {
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(976));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(494));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(496));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(495));
    public final LruCache<String, Boolean> LJFF = new LruCache<>(10);

    public final ISeriesCommonETService LJJIJIIJIL() {
        return (ISeriesCommonETService) this.LIZLLL.getValue();
    }

    public static void LJJIIZI(C2344009Gk c2344009Gk) {
        IDramaDiscoverService.LIZ.getClass();
        for (Map.Entry<String, String> entry : C1573420r2y.LIZ().LIZ().entrySet()) {
            c2344009Gk.LJFF(entry.getKey(), entry.getValue());
        }
    }

    public static String LJJIJIIJI(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 49) {
                if (iHashCode == 48626 && str.equals("101")) {
                    return "trending";
                }
            } else {
                if (!str.equals("1")) {
                    return str;
                }
                return "trending";
            }
        } else if (str.equals(CardStruct.IStatusCode.DEFAULT)) {
            return "all";
        }
        return str;
    }

    public static final void LJJJJIZL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1612480s3y.LJIIL(c2344009Gk, str, false);
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("series_upgrade_popup_show", c2344009Gk.LIZ);
        }
    }

    public final void LJJIIJ(C2344009Gk c2344009Gk) {
        Integer numValueOf;
        EnumC1612540s44 playVideoType;
        ISeriesCommonETService iSeriesCommonETServiceLJJIJIIJIL = LJJIJIIJIL();
        if (iSeriesCommonETServiceLJJIJIIJIL != null && (playVideoType = iSeriesCommonETServiceLJJIJIIJIL.getPlayVideoType()) != null) {
            numValueOf = Integer.valueOf(playVideoType.getValue());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("play_video_type", String.valueOf(numValueOf));
    }

    public static void LJJ(C1611660s2e c1611660s2e, C2344009Gk c2344009Gk) {
        Object objLJIJJ;
        EnumC1611690s2h enumC1611690s2h = EnumC1611690s2h.DETAIL;
        MiniDramaTouchPointService miniDramaTouchPointService = (MiniDramaTouchPointService) c1611660s2e.LJ.getValue();
        if (miniDramaTouchPointService != null) {
            objLJIJJ = C1612480s3y.LJIJJ(miniDramaTouchPointService.LIZ(enumC1611690s2h));
        } else {
            objLJIJJ = 0;
        }
        c2344009Gk.LJ(objLJIJJ, "is_coin_timer_show");
    }

    public static void LJJI(C2344009Gk c2344009Gk, CollectionDetailModel collectionDetailModel) {
        String str;
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null && miniDramaETInjectServiceLIZ.LIZIZ(Long.valueOf(collectionDetailModel.collectionId))) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("has_intro_video", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJII(X.C2344009Gk r3, com.ss.android.ugc.aweme.model.CollectionDetailModel r4) {
        /*
            X.0s2T r0 = com.ss.android.ugc.aweme.service.MiniDramaETInjectService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.service.MiniDramaETInjectService r2 = X.C1611550s2T.LIZ()
            if (r2 == 0) goto L1e
            long r0 = r4.collectionId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r2.LIZ(r0)
            r1 = 1
            if (r0 != r1) goto L1e
        L18:
            java.lang.String r0 = "has_preview_video"
            r3.LIZJ(r1, r0)
            return
        L1e:
            r1 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1611660s2e.LJJII(X.09Gk, com.ss.android.ugc.aweme.model.CollectionDetailModel):void");
    }

    public final void LJJIFFI(C2344009Gk c2344009Gk, DramaExtraTrackingParams dramaExtraTrackingParams) {
        ISeriesCommonETService iSeriesCommonETServiceLJJIJIIJIL;
        boolean z;
        C1612610s4B currentContext;
        C1612510s41 c1612510s41;
        DramaExtraTrackingParams dramaExtraTrackingParams2;
        ISeriesCommonETService iSeriesCommonETServiceLJJIJIIJIL2;
        C1612610s4B currentContext2;
        C1612510s41 c1612510s412;
        DramaExtraTrackingParams dramaExtraTrackingParams3;
        boolean z2 = false;
        if ((dramaExtraTrackingParams != null && Intrinsics.LJFF(dramaExtraTrackingParams.isFromSeriesDiscover(), Boolean.TRUE)) || ((iSeriesCommonETServiceLJJIJIIJIL = LJJIJIIJIL()) != null && (currentContext = iSeriesCommonETServiceLJJIJIIJIL.getCurrentContext()) != null && (c1612510s41 = currentContext.LIZIZ) != null && (dramaExtraTrackingParams2 = c1612510s41.LJIILIIL) != null && Intrinsics.LJFF(dramaExtraTrackingParams2.isFromSeriesDiscover(), Boolean.TRUE))) {
            z = true;
        } else {
            z = false;
        }
        c2344009Gk.LJFF("is_from_series_discover", C1612480s3y.LJIJJ(z));
        if ((dramaExtraTrackingParams != null && Intrinsics.LJFF(dramaExtraTrackingParams.isAutoProcceedToInnerfeed(), Boolean.TRUE)) || ((iSeriesCommonETServiceLJJIJIIJIL2 = LJJIJIIJIL()) != null && (currentContext2 = iSeriesCommonETServiceLJJIJIIJIL2.getCurrentContext()) != null && (c1612510s412 = currentContext2.LIZIZ) != null && (dramaExtraTrackingParams3 = c1612510s412.LJIILIIL) != null && Intrinsics.LJFF(dramaExtraTrackingParams3.isAutoProcceedToInnerfeed(), Boolean.TRUE))) {
            z2 = true;
        }
        c2344009Gk.LJFF("is_auto_procceed_to_innerfeed", C1612480s3y.LJIJJ(z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(X.C2344009Gk r4, java.lang.Boolean r5) {
        /*
            r3 = this;
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r2)
            if (r0 != 0) goto L21
            com.ss.android.ugc.aweme.service.ISeriesCommonETService r0 = r3.LJJIJIIJIL()
            r1 = 0
            if (r0 == 0) goto L22
            X.0s4B r0 = r0.getCurrentContext()
            if (r0 == 0) goto L22
            X.0s41 r0 = r0.LIZIZ
            if (r0 == 0) goto L22
            java.lang.Boolean r0 = r0.LJIIIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L22
        L21:
            r1 = 1
        L22:
            java.lang.String r1 = X.C1612480s3y.LJIJJ(r1)
            java.lang.String r0 = "is_from_hot_zone"
            r4.LJFF(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1611660s2e.LJJIII(X.09Gk, java.lang.Boolean):void");
    }

    public final void LJJIIZ(C2344009Gk c2344009Gk, String str) {
        ISeriesCommonETService iSeriesCommonETServiceLJJIJIIJIL;
        C1612610s4B currentContext;
        C1612510s41 c1612510s41;
        if ((str == null || str.length() == 0) && ((iSeriesCommonETServiceLJJIJIIJIL = LJJIJIIJIL()) == null || (currentContext = iSeriesCommonETServiceLJJIJIIJIL.getCurrentContext()) == null || (c1612510s41 = currentContext.LIZIZ) == null || (str = c1612510s41.LJIIJ) == null)) {
            str = "";
        }
        c2344009Gk.LJFF("source_card", str);
    }

    public final void LJIJJLI(C2344009Gk c2344009Gk, CollectionDetailModel collectionDetailModel, boolean z) {
        String str;
        String str2;
        String strValueOf = String.valueOf(collectionDetailModel.collectionId);
        PriceInfo priceInfo = collectionDetailModel.priceInfo;
        String str3 = "";
        if (priceInfo == null || (str = priceInfo.priceInUsd) == null) {
            str = "";
        }
        PriceInfo priceInfo2 = collectionDetailModel.discountedPriceInfo;
        if (priceInfo2 != null && (str2 = priceInfo2.priceInUsd) != null) {
            str3 = str2;
        }
        LJIL(c2344009Gk, strValueOf, str, str3, z);
    }

    public final void LJJIIJZLJL(C2344009Gk c2344009Gk, Boolean bool, String str) {
        String str2;
        if (str != null && str.length() != 0) {
            ISeriesLimitedFreeService iSeriesLimitedFreeService = (ISeriesLimitedFreeService) this.LIZJ.getValue();
            if ((iSeriesLimitedFreeService != null && iSeriesLimitedFreeService.LJIIIIZZ(str)) || Intrinsics.LJFF(bool, Boolean.TRUE)) {
                str2 = "limited_free_series";
            } else {
                str2 = "paid_series";
            }
            c2344009Gk.LJFF("series_state", str2);
        }
    }

    public static final void LJJJJI(String str, String str2, String str3, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1612480s3y.LJIIL(c2344009Gk, "homepage_series", false);
        c2344009Gk.LJFF("previous_page", str);
        c2344009Gk.LJFF("series_session_id", str2);
        c2344009Gk.LJFF("show_type", str3);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_from_infeed_discover");
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("series_tab_window_show", c2344009Gk.LIZ);
        }
    }

    public final void LJJIJL(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1612480s3y.LJIIL(c2344009Gk, str, false);
        c2344009Gk.LJFF("collection_id", str2);
        LJJIIJZLJL(c2344009Gk, null, str2);
        c2344009Gk.LJFF("click_video_id", str3);
        c2344009Gk.LJFF("click_content", str4);
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("personal_series_tab_item_click", c2344009Gk.LIZ);
        }
    }

    public static void LJJIJ(C2344009Gk c2344009Gk, String str, String str2, Boolean bool, DramaExtraTrackingParams dramaExtraTrackingParams) {
        String str3;
        Boolean bool2 = Boolean.TRUE;
        String str4 = "1";
        if (Intrinsics.LJFF(bool, bool2)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_forced_insertion", str3);
        boolean z = false;
        if (!Intrinsics.LJFF(bool, bool2) && dramaExtraTrackingParams != null && (Intrinsics.LJFF(dramaExtraTrackingParams.isFromUnderTakeForcedInsert(), bool2) || (dramaExtraTrackingParams != null && Intrinsics.LJFF(dramaExtraTrackingParams.isFromForcedInsertInfo(), bool2)))) {
            z = true;
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_source_item_forced_insertion", str4);
        if (Intrinsics.LJFF(bool, bool2) || z) {
            IDramaDiscoverService.LIZ.getClass();
            C1573420r2y.LIZ().LIZLLL();
            String str5 = null;
            c2344009Gk.LJFF("forced_insertion_from", null);
            if (dramaExtraTrackingParams != null) {
                str5 = dramaExtraTrackingParams.forcedInsertScene;
            }
            c2344009Gk.LJFF("forced_insertion_scene", str5);
            LJJIIZI(c2344009Gk);
        }
        if (C123100dR.LIZ(str)) {
            c2344009Gk.LJFF("is_from_outfeed_series_continuation_play", str);
        }
        if (C123100dR.LIZ(str2)) {
            c2344009Gk.LJFF("source_continue_video_id", str2);
        }
    }

    public final void LJIL(C2344009Gk c2344009Gk, String str, String str2, String str3, boolean z) {
        String currentUserId;
        Map<String, Object> mapLIZ;
        if (z) {
            ISeriesAdsETService iSeriesAdsETService = (ISeriesAdsETService) this.LIZIZ.getValue();
            if (iSeriesAdsETService != null && (mapLIZ = iSeriesAdsETService.LIZ(str)) != null) {
                for (Map.Entry<String, Object> entry : mapLIZ.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        c2344009Gk.LJFF(key, (String) value);
                    } else {
                        c2344009Gk.LJ(value, key);
                    }
                }
            }
            ISeriesAdsETService iSeriesAdsETService2 = (ISeriesAdsETService) this.LIZIZ.getValue();
            if (iSeriesAdsETService2 != null) {
                currentUserId = iSeriesAdsETService2.getCurrentUserId();
            } else {
                currentUserId = null;
            }
            c2344009Gk.LJFF("user_id", currentUserId);
            c2344009Gk.LJFF("collection_price", str2);
            c2344009Gk.LJFF("discount_price", str3);
        }
    }

    public static final void LJJIJLIJ(int i, String str, String str2, String str3, String str4, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1612480s3y.LJIIL(c2344009Gk, str, false);
        c2344009Gk.LJFF("series_session_id", str2);
        c2344009Gk.LJFF("tab_name", str3);
        c2344009Gk.LIZJ(i, "tab_position");
        c2344009Gk.LJFF("series_center_filter_dict", str4);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_from_infeed_discover");
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("series_category_click", c2344009Gk.LIZ);
        }
    }

    public static final void LJJJJ(String str, String str2, String str3, String str4, String str5, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1612480s3y.LJIIL(c2344009Gk, "homepage_series", false);
        c2344009Gk.LJFF("click_collection_id", str);
        c2344009Gk.LJFF("click_content", str2);
        c2344009Gk.LJFF("previous_page", str3);
        c2344009Gk.LJFF("card_name", str4);
        c2344009Gk.LJFF("series_session_id", str5);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_from_infeed_discover");
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("series_tab_card_click", c2344009Gk.LIZ);
        }
    }

    public static final void LJJJI(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1612480s3y.LJIIL(c2344009Gk, str, false);
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("enter_method", str2);
        c2344009Gk.LJFF("previous_page", str3);
        c2344009Gk.LJFF("previous_category", str4);
        c2344009Gk.LJFF("select_category", str5);
        if (str6 != null) {
            c2344009Gk.LJFF("series_discover_tab_session_id", str6);
        }
        if (str7 != null) {
            c2344009Gk.LJFF("page_version", str7);
        }
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("series_center_tab_switch", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.09Gk] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static void LJJJ(C1581520rG2 c1581520rG2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        ?? r9 = z;
        if ((i & 128) != 0) {
            r9 = 0;
        }
        c1581520rG2.getClass();
        ?? c2344009Gk = new C2344009Gk();
        C1612480s3y.LJIIL(c2344009Gk, "series_center", false);
        c2344009Gk.LJFF("enter_from", "series_center");
        c2344009Gk.LJFF("previous_page", str);
        c2344009Gk.LJFF("series_session_id", str2);
        if (str3 != null) {
            c2344009Gk.LJFF("series_discover_tab_session_id", str3);
        }
        c2344009Gk.LJFF("show_category", str4);
        c2344009Gk.LJFF("select_category", str5);
        c2344009Gk.LJFF("series_center_filter_dict", str6);
        c2344009Gk.LIZJ(r9, "is_from_infeed_discover");
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("series_center_page_show", c2344009Gk.LIZ);
        }
    }

    public final void LJJIJIL(CollectionDetailModel collectionDetailModel, String str, Boolean bool, Boolean bool2, Boolean bool3, C1612600s4A c1612600s4A, Boolean bool4, String str2, C1612570s47 c1612570s47, String str3, DramaExtraTrackingParams dramaExtraTrackingParams) {
        boolean zBooleanValue;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1612480s3y.LJIIJ(c2344009Gk, collectionDetailModel);
        C1612480s3y.LJII(c2344009Gk, collectionDetailModel);
        LJJI(c2344009Gk, collectionDetailModel);
        String strLJIJJ = null;
        LJJIIJZLJL(c2344009Gk, null, String.valueOf(collectionDetailModel.collectionId));
        C1612480s3y.LJIJI(c2344009Gk, collectionDetailModel.category);
        boolean zBooleanValue2 = false;
        C1612480s3y.LJIIL(c2344009Gk, str, false);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C1612480s3y.LJIILL(c2344009Gk, zBooleanValue);
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        }
        c2344009Gk.LJIIIIZZ("is_from_bottom_banner", C1612480s3y.LJIJJ(zBooleanValue2));
        if (bool3 != null) {
            strLJIJJ = C1612480s3y.LJIJJ(bool3.booleanValue());
        }
        c2344009Gk.LJFF("is_from_drama_component", strLJIJJ);
        C1612480s3y.LJIIZILJ(c2344009Gk, c1612600s4A);
        LJJIIJZLJL(c2344009Gk, Boolean.valueOf(collectionDetailModel.isLimitedFree()), String.valueOf(collectionDetailModel.collectionId));
        LJJIII(c2344009Gk, bool4);
        LJJIIZ(c2344009Gk, str2);
        LJJ(this, c2344009Gk);
        C1612480s3y.LJIJ(c2344009Gk, c1612570s47);
        LJJIFFI(c2344009Gk, dramaExtraTrackingParams);
        if (str3 != null) {
            c2344009Gk.LJIIIIZZ("group_id", str3);
        }
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("click_add_to_favorite", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.09Gk] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0rG2, X.0s2e, java.lang.Object] */
    public static void LJJIZ(C1581520rG2 c1581520rG2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, SeriesCategory seriesCategory, String str8, Boolean bool, boolean z, Boolean bool2, String str9, Map map, int i2) {
        String string;
        Boolean bool3 = bool;
        String str10 = str8;
        String str11 = str9;
        ?? r2 = z;
        Map map2 = null;
        if ((i2 & 8) != 0) {
            str4 = null;
        }
        if ((i2 & 512) != 0) {
            str10 = null;
        }
        if ((i2 & 1024) != 0) {
            bool3 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            r2 = 0;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            bool2 = null;
        }
        if ((i2 & 8192) != 0) {
            str11 = null;
        }
        if ((i2 & 16384) == 0) {
            map2 = map;
        }
        c1581520rG2.getClass();
        ?? c2344009Gk = new C2344009Gk();
        C1612480s3y.LJIIL(c2344009Gk, str, false);
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("previous_page", str2);
        c2344009Gk.LJFF("series_session_id", str3);
        if (str4 != null) {
            c2344009Gk.LJFF("series_discover_tab_session_id", str4);
        }
        c2344009Gk.LJFF("show_category", str6);
        c2344009Gk.LJFF("select_category_id", str7);
        c2344009Gk.LJFF("select_categoty_id", str7);
        c2344009Gk.LJFF("select_category", LJJIJIIJI(str7));
        c2344009Gk.LIZJ(i, "rank_num");
        c2344009Gk.LJFF("collection_id", str5);
        c1581520rG2.LJJIIJZLJL(c2344009Gk, bool3, str5);
        C1612480s3y.LJIJI(c2344009Gk, seriesCategory);
        c2344009Gk.LJFF("series_center_filter_dict", str10);
        c2344009Gk.LIZJ(r2, "is_from_infeed_discover");
        if (bool2 != null) {
            c2344009Gk.LIZJ(bool2.booleanValue() ? 1 : 0, "is_forced_insertion");
        }
        if (str11 != null) {
            c2344009Gk.LJFF("forced_insertion_from", str11);
        }
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                String str12 = (String) entry.getKey();
                Object value = entry.getValue();
                if (!a0.LJJJIL(str12)) {
                    if (value instanceof String) {
                        string = (String) value;
                    } else if ((value instanceof Number) || (value instanceof Boolean)) {
                        string = value.toString();
                    }
                    if (string != null && string.length() != 0) {
                        c2344009Gk.LJFF(str12, string);
                    }
                }
            }
        }
        LJJIIZI(c2344009Gk);
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("series_center_mylist_collection_card_click", c2344009Gk.LIZ);
        }
    }

    public final void LJJJIL(long j, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, C1612600s4A c1612600s4A, String str3, String str4, String str5, SeriesCategory seriesCategory, Boolean bool4, Boolean bool5, String str6, C1612570s47 c1612570s47, String str7, DramaExtraTrackingParams dramaExtraTrackingParams) {
        String strLJIJJ;
        boolean zBooleanValue;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1612480s3y.LJFF(c2344009Gk, String.valueOf(j));
        c2344009Gk.LJFF("collection_user_id", str);
        boolean zBooleanValue2 = false;
        C1612480s3y.LJIIL(c2344009Gk, str2, false);
        if (bool3 != null) {
            strLJIJJ = C1612480s3y.LJIJJ(bool3.booleanValue());
        } else {
            strLJIJJ = null;
        }
        c2344009Gk.LJFF("is_from_drama_component", strLJIJJ);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c2344009Gk.LJFF("is_from_bottom_banner", C1612480s3y.LJIJJ(zBooleanValue));
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        }
        c2344009Gk.LJFF("is_from_anchor", C1612480s3y.LJIJJ(zBooleanValue2));
        C1612480s3y.LJIIZILJ(c2344009Gk, c1612600s4A);
        c2344009Gk.LJFF("click_content", str3);
        c2344009Gk.LJFF("click_position", str4);
        c2344009Gk.LJFF("click_collection_id", str5);
        LJJIII(c2344009Gk, bool5);
        LJJIIZ(c2344009Gk, str6);
        LJJIIJZLJL(c2344009Gk, bool4, String.valueOf(j));
        C1612480s3y.LJIJI(c2344009Gk, seriesCategory);
        LJJ(this, c2344009Gk);
        C1612480s3y.LJIJ(c2344009Gk, c1612570s47);
        LJJIFFI(c2344009Gk, dramaExtraTrackingParams);
        if (str7 != null) {
            c2344009Gk.LJIIIIZZ("group_id", str7);
        }
        MiniDramaETInjectService.LIZ.getClass();
        MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
        if (miniDramaETInjectServiceLIZ != null) {
            miniDramaETInjectServiceLIZ.onEventV3("series_episode_panel_click", c2344009Gk.LIZ);
        }
    }
}
