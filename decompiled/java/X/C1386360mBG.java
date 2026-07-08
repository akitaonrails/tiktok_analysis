package X;

import android.content.Context;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import xtc.l1;

/* JADX INFO: renamed from: X.0mBG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386360mBG {
    public static IAutoAScrollAbility LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.NONE, new C1386370mBH());
    public static final Map<C19EG, CopyOnWriteArrayList<Function0<Unit>>> LIZJ = Collections.synchronizedMap(new WeakHashMap());

    public static final String LJ() {
        return LJII(false) ? "normal" : "auto";
    }

    public static final AbstractC1604130rqV LIZLLL() {
        return (AbstractC1604130rqV) LIZIZ.getValue();
    }

    public static final Map<String, String> LJFF() {
        Map<String, String> mapLJJIJIIJIL = C1ER1.LIZIZ.LJJIJIIJIL(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : mapLJJIJIIJIL.entrySet()) {
            if (Intrinsics.LJFF(entry.getKey(), "search_id")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final FypAutoScrollService LIZJ() {
        return (FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class);
    }

    public static final List<Aweme> LIZ(FeedItemList feedItemList) {
        EnumC584570MwJ enumC584570MwJXo1;
        List<Aweme> items;
        Iterator<Aweme> it2;
        l1.LIZ.getClass();
        if (!l1.LIZ() || !(C2214201BlK.LJFF() instanceof C19EG)) {
            return null;
        }
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = LIZIZ(null);
        if (iAutoAScrollAbilityLIZIZ == null || (enumC584570MwJXo1 = iAutoAScrollAbilityLIZIZ.xo1()) == null) {
            enumC584570MwJXo1 = EnumC584570MwJ.AUTO_SCROLL_STATE_STOP;
        }
        if (enumC584570MwJXo1 != EnumC584570MwJ.AUTO_SCROLL_STATE_STOP && (items = feedItemList.getItems()) != null && (it2 = items.iterator()) != null) {
            ArrayList arrayList = new ArrayList();
            while (it2.hasNext()) {
                Aweme next = it2.next();
                if (next != null && !LJIIL(next) && !AwemeSaaSExtKt.isLive(next)) {
                    String requestId = feedItemList.getRequestId();
                    C0T5M c0t5m = C0T5M.LIZ;
                    AwemeBizExtKt.setContentDiffType(next, "filter_auto_scroll");
                    C0T5M.LJFF(next, "filter_auto_scroll", requestId);
                    it2.remove();
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility LIZIZ(X.C19EG r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1386360mBG.LIZIZ(X.19EG):com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility");
    }

    public static final boolean LJI(String str) {
        if (!Intrinsics.LJFF(str, "homepage_hot") && !LJIIJ(str)) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(boolean z) {
        Object service;
        if (z) {
            l1.LIZ.getClass();
            if (!l1.LIZ()) {
                return true;
            }
        } else {
            l1.LIZ.getClass();
            if (!l1.LIZ()) {
                if (C1157804fw.LIZ()) {
                    service = ServiceManager.get().getService(ISearchServiceLowEnd.class);
                    if (service == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchAutoScrollUtilPartial");
                    }
                } else {
                    service = ServiceManager.get().getService(ISearchService.class);
                    if (service == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchAutoScrollUtilPartial");
                    }
                }
                if (!((InterfaceC1386380mBI) service).F()) {
                    return true;
                }
            }
        }
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = LIZIZ(null);
        if (iAutoAScrollAbilityLIZIZ == null || iAutoAScrollAbilityLIZIZ.xo1() == EnumC584570MwJ.AUTO_SCROLL_STATE_STOP) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIZ(String str) {
        return Intrinsics.LJFF(str, "paid_series_detail_page");
    }

    public static final boolean LJIIJ(String str) {
        if (!Intrinsics.LJFF(str, "general_search") && !Intrinsics.LJFF(str, "search_result")) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJJI(Aweme aweme) {
        Integer numValueOf;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSpecialCard: type: ");
        Boolean boolValueOf = null;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", meet:");
        if (aweme != null) {
            boolValueOf = Boolean.valueOf(LJIIL(aweme));
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme == null || AwemeSaaSExtKt.isLive(aweme) || (((photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && imageList.size() == 1) || !LJIIL(aweme))) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIL(Aweme aweme) {
        Boolean boolValueOf;
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("meetAutoScrollCondition: isAd: ");
        Integer numValueOf = null;
        if (aweme != null) {
            boolValueOf = Boolean.valueOf(aweme.isAd());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", type: ");
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme != null) {
            C10IT.LIZ.getClass();
            if (!C10IT.LJIILIIL(aweme) && (((aid = aweme.getAid()) == null || !u.LJJIIJZLJL(aid, "ug_referral_sub_", true)) && (aweme.isAd() || aweme.getAwemeType() == 0 || aweme.getAwemeType() == 40 || aweme.getAwemeType() == 152 || aweme.getAwemeType() == 150 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 55 || aweme.getAwemeType() == 58))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIIIIZZ(Context context, boolean z) {
        boolean zLIZIZ;
        boolean zLIZJ;
        boolean z2;
        boolean zLJIILL;
        FypAutoScrollService fypAutoScrollServiceLIZJ;
        boolean zLIZIZ2 = C0SHX.LIZ(context, null).LIZIZ();
        boolean zLJFF = C0SHX.LIZ(context, null).LJFF();
        boolean zLIZ = C0SHX.LIZ(context, null).LIZ("long_press_layer");
        boolean zLIZ2 = C0SHX.LIZ(context, null).LIZ("downloaded_video_share_dialog");
        FypAutoScrollService fypAutoScrollServiceLIZJ2 = LIZJ();
        if (fypAutoScrollServiceLIZJ2 != null) {
            zLIZIZ = fypAutoScrollServiceLIZJ2.LIZIZ();
        } else {
            zLIZIZ = false;
        }
        FypAutoScrollService fypAutoScrollServiceLIZJ3 = LIZJ();
        if (fypAutoScrollServiceLIZJ3 != null) {
            zLIZJ = fypAutoScrollServiceLIZJ3.LIZJ();
        } else {
            zLIZJ = false;
        }
        if (!((Boolean) C283180B8a.LIZ.getValue()).booleanValue() && (fypAutoScrollServiceLIZJ = LIZJ()) != null && fypAutoScrollServiceLIZJ.LJIIIIZZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLIZ3 = C0SHX.LIZ(context, null).LIZ("input_danmaku");
        boolean zLIZ4 = C0SHX.LIZ(context, null).LIZ("show_danmaku_rethink");
        CommentService.LIZ.getClass();
        boolean zLJLIL = C523420Kfs.LIZ().LJLIL();
        IFavoriteService iFavoriteService = (IFavoriteService) PluggableExtentionKt.pluggableSpi$default(IFavoriteService.class, false, false, false, 14, null);
        if (iFavoriteService != null) {
            zLJIILL = iFavoriteService.LJIILL();
        } else {
            zLJIILL = false;
        }
        if (!zLIZIZ2 && !zLJFF && !zLIZ && !zLIZ2 && !zLIZIZ && !zLIZJ && !z2 && !zLIZ3 && !zLIZ4 && !zLJLIL && !zLJIILL) {
            return false;
        }
        if (z) {
            AbstractC1604130rqV abstractC1604130rqVLIZLLL = LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isDialogShowing: diaglog is showing ");
            sbLIZ.append(zLIZIZ2);
            sbLIZ.append(' ');
            sbLIZ.append(zLJFF);
            sbLIZ.append(' ');
            sbLIZ.append(zLIZ);
            sbLIZ.append(' ');
            sbLIZ.append(zLIZ2);
            sbLIZ.append(' ');
            sbLIZ.append(zLIZIZ);
            sbLIZ.append(' ');
            sbLIZ.append(zLIZJ);
            sbLIZ.append(' ');
            sbLIZ.append(z2);
            sbLIZ.append(' ');
            sbLIZ.append(zLIZ3);
            sbLIZ.append(' ');
            sbLIZ.append(zLIZ4);
            sbLIZ.append(' ');
            sbLIZ.append(zLJLIL);
            sbLIZ.append(' ');
            sbLIZ.append(zLJIILL);
            abstractC1604130rqVLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return true;
    }
}
