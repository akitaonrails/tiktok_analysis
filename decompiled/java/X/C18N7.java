package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.ShowcaseContent;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;

/* JADX INFO: renamed from: X.18N7, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18N7 {
    public static final C18N7 LIZ = new C18N7();

    public static String LIZIZ(Aweme aweme) {
        C18NJ.LIZ.getClass();
        if (C18NJ.LIZLLL(aweme)) {
            return "video_shop_showwindow_single_anchor";
        }
        return "video_shop_showwindow_multi_anchor";
    }

    public static C2344009Gk LIZ(String str, Aweme aweme, ShowcaseContent showcaseContent, String str2) {
        List<AnchorCommonStruct> anchors;
        AwemeRawAd awemeRawAd;
        String authorUid;
        String aid;
        String requestId;
        String str3;
        String str4;
        String str5;
        String str6;
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        String componentKey;
        String name;
        String componentKey2 = null;
        if (aweme != null) {
            anchors = aweme.getAnchors();
        } else {
            anchors = null;
        }
        AnchorBizUtils.LIZ.getClass();
        AnchorCommonStruct anchorCommonStructLJJIIZ = AnchorBizUtils.LJJIIZ(anchors);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        c2344009Gk.LJ(awemeRawAd, "ad_id");
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LJIIIIZZ("music_id", C586930N0h.LIZ(aweme));
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            requestId = aweme.getRequestId();
        } else {
            requestId = null;
        }
        c2344009Gk.LJIIIIZZ("request_id", requestId);
        if (showcaseContent != null) {
            str3 = showcaseContent.groupId;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("anchor_id", str3);
        if (showcaseContent != null) {
            str4 = showcaseContent.groupTitle;
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("anchor_name", str4);
        EnumC1430380nKG enumC1430380nKG = EnumC1430380nKG.ANCHOR_SHOWCASE;
        c2344009Gk.LJIIIIZZ("anchor_type", enumC1430380nKG.getTYPENAME());
        if (showcaseContent != null) {
            str5 = showcaseContent.groupId;
        } else {
            str5 = null;
        }
        c2344009Gk.LJIIIIZZ("main_anchor_id", str5);
        if (showcaseContent != null) {
            str6 = showcaseContent.groupTitle;
        } else {
            str6 = null;
        }
        c2344009Gk.LJIIIIZZ("main_anchor_name", str6);
        c2344009Gk.LJIIIIZZ("main_anchor_type", enumC1430380nKG.getTYPENAME());
        boolean z = false;
        c2344009Gk.LIZJ(0, "multi_anchor");
        C21272018Mk.LIZ.getClass();
        c2344009Gk.LIZJ(C21272018Mk.LJJI(anchors), "anchor_number");
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IAnchorDependencyService.class.getName();
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        if (((IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin).getAnchorMobRefactorExpEnable()) {
            if (anchorCommonStructLJJIIZ != null) {
                componentKey = anchorCommonStructLJJIIZ.getComponentKey();
            } else {
                componentKey = null;
            }
            c2344009Gk.LJIIIIZZ("component_key", componentKey);
            if (anchorCommonStructLJJIIZ != null) {
                componentKey2 = anchorCommonStructLJJIIZ.getComponentKey();
            }
            c2344009Gk.LJFF("main_component_key", componentKey2);
        }
        return c2344009Gk;
    }
}
