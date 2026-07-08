package X;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.ShowcaseContent;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS146S1100000_32;

/* JADX INFO: renamed from: X.18NM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NM extends AbstractC1351650lHH {
    public final ShowcaseContent LIZJ;
    public final AnchorCommonStruct LIZLLL;
    public final C2252321DDq LJ;

    @Override // X.AbstractC1351650lHH
    public final void LIZJ() {
    }

    @Override // X.AbstractC1351650lHH
    public final void LJ() {
    }

    @Override // X.AbstractC1351650lHH
    public final C1351660lHI LIZ() {
        C18NJ c18nj = C18NJ.LIZ;
        int iLIZLLL = C21274118Nf.LIZLLL(this.LIZ);
        c18nj.getClass();
        return new C1351660lHI(null, Integer.valueOf(C18NJ.LIZ(iLIZLLL)), 1);
    }

    @Override // X.AbstractC1351650lHH
    public final C2252321DDq LIZIZ() {
        return this.LJ;
    }

    @Override // X.AbstractC1351650lHH
    public final void LJFF(Fragment fragment) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        String str;
        boolean z;
        String name;
        boolean z2;
        String name2;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = ILogDependencyService.class.getName();
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        ILogDependencyService iLogDependencyService = (ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = AnchorDependencyService.createIAnchorDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name4 = IAnchorDependencyService.class.getName();
            if (anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAnchorDependencyService.class);
        }
        IAnchorDependencyService iAnchorDependencyService = (IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        if (iAnchorDependencyService.getAnchorMobRefactorExpEnable()) {
            str = "comment_top_anchor";
        } else {
            str = "comment_anchor";
        }
        C18NZ c18nz = C18NZ.LIZ;
        String str2 = this.LIZIZ;
        Aweme aweme = this.LIZ;
        ShowcaseContent showcaseContent = this.LIZJ;
        c18nz.getClass();
        C2344009Gk c2344009GkLIZ = C18NZ.LIZ(str2, aweme, showcaseContent, str);
        if (iAnchorDependencyService.getAnchorMobRefactorExpEnable()) {
            iLogDependencyService.onEventV3("multi_anchor_entrance_show", iAnchorDependencyService.mobParamsParserGetJSONObject(iAnchorDependencyService.appendCommentLogParams(c2344009GkLIZ, this.LIZ, this.LIZLLL, false)));
        }
        C1018703yb.LIZLLL("tiktok_video_anchor_view", new AwS146S1100000_32((C2344009Gk) null, "video_comment_shop_showwindow_anchor", 18));
        C1018703yb.LIZLLL("tiktokec_shop_entrance_show", new AwS146S1100000_32((C2344009Gk) null, "video_comment_shop_showwindow_anchor", 20));
    }

    public C18NM(Aweme aweme, String str) {
        AnchorCommonStruct anchorCommonStruct;
        AnchorCommonStruct next;
        super(aweme, str);
        C18NJ c18nj = C18NJ.LIZ;
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        AnchorCommonStruct anchorCommonStruct2 = null;
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    AnchorBizUtils.LIZ.getClass();
                    if (AnchorBizUtils.LJIIZILJ().contains(Integer.valueOf(next.getType()))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            anchorCommonStruct = next;
        } else {
            anchorCommonStruct = null;
        }
        c18nj.getClass();
        this.LIZJ = C18NJ.LIZIZ(anchorCommonStruct);
        List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
        if (anchors2 != null) {
            Iterator<AnchorCommonStruct> it3 = anchors2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                AnchorCommonStruct next2 = it3.next();
                AnchorBizUtils.LIZ.getClass();
                if (AnchorBizUtils.LJIIZILJ().contains(Integer.valueOf(next2.getType()))) {
                    anchorCommonStruct2 = next2;
                    break;
                }
            }
            anchorCommonStruct2 = anchorCommonStruct2;
        }
        this.LIZLLL = anchorCommonStruct2;
        this.LJ = C1BNE.LIZ("");
    }

    @Override // X.AbstractC1351650lHH
    public final void LIZLLL(Fragment fragment, C19EG c19eg) {
        C18NJ.LIZJ(C18NJ.LIZ, c19eg, this.LIZJ, this.LIZ, this.LIZIZ, true);
        C18NZ.LIZ.getClass();
        C1018703yb.LIZLLL("tiktok_video_anchor_click", new AwS146S1100000_32((C2344009Gk) null, "video_comment_shop_showwindow_anchor", 17));
        C1018703yb.LIZLLL("tiktokec_shop_entrance_click", new AwS146S1100000_32((C2344009Gk) null, "video_comment_shop_showwindow_anchor", 19));
    }
}
