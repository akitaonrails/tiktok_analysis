package X;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.dependency.anchor.AnchorDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.ShowcaseContent;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ECAnchorInfo;
import g1c.AjS46S0200000_32;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18NL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NL implements InterfaceC1392790mLd {
    public Aweme LIZ;
    public InterfaceC1392640mLO LIZIZ;
    public String LIZJ;
    public ShowcaseContent LIZLLL;
    public String LJ = "video_shop_showwindow_single_anchor";

    @Override // X.InterfaceC1392790mLd
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1392790mLd
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1392790mLd
    public final int LJFF() {
        return 1;
    }

    @Override // X.InterfaceC1392790mLd
    public final void LJI() {
    }

    @Override // X.InterfaceC1392790mLd
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1392790mLd
    public final void LIZ() {
        C18NZ c18nz = C18NZ.LIZ;
        String str = this.LJ;
        c18nz.getClass();
        C1018703yb.LIZLLL("tiktok_video_anchor_view", new AwS146S1100000_32((C2344009Gk) null, str, 18));
        C1018703yb.LIZLLL("tiktokec_shop_entrance_show", new AwS146S1100000_32((C2344009Gk) null, this.LJ, 20));
    }

    @Override // X.InterfaceC1392790mLd
    public final ShowcaseContent LJII() {
        ShowcaseContent showcaseContent = this.LIZLLL;
        return showcaseContent == null ? new ShowcaseContent(null, null, null, null, null, null, null, null, null, null, null, null, null, null) : showcaseContent;
    }

    @Override // X.InterfaceC1392790mLd
    public final String LJIIIZ() {
        String str;
        ShowcaseContent showcaseContent = this.LIZLLL;
        return (showcaseContent == null || (str = showcaseContent.groupId) == null) ? "" : str;
    }

    @Override // X.InterfaceC1392790mLd
    public final String LJIIJ() {
        String str;
        ShowcaseContent showcaseContent = this.LIZLLL;
        return (showcaseContent == null || (str = showcaseContent.shopShowcaseTitle) == null) ? "" : str;
    }

    @Override // X.InterfaceC1392790mLd
    public final int LJIIJJI() {
        C18NJ c18nj = C18NJ.LIZ;
        int iLIZLLL = C21274118Nf.LIZLLL(this.LIZ);
        c18nj.getClass();
        return C18NJ.LIZ(iLIZLLL);
    }

    @Override // X.InterfaceC1392790mLd
    public final String LJIIL() {
        ShowcaseContent showcaseContent = this.LIZLLL;
        if (showcaseContent != null) {
            return showcaseContent.shopShowcaseTitle;
        }
        return null;
    }

    @Override // X.InterfaceC1392790mLd
    public final void LJIILL() {
        C18NJ c18nj = C18NJ.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ;
        C18NJ.LIZJ(c18nj, interfaceC1392640mLO != null ? interfaceC1392640mLO.LIZIZ() : null, this.LIZLLL, this.LIZ, this.LIZJ, false);
        C18NZ.LIZ.getClass();
        C1018703yb.LIZLLL("tiktok_video_anchor_click", new AwS146S1100000_32((C2344009Gk) null, "video_shop_showwindow_photo_detail_single_anchor", 17));
        C1018703yb.LIZLLL("tiktokec_shop_entrance_click", new AwS146S1100000_32((C2344009Gk) null, this.LJ, 19));
    }

    @Override // X.InterfaceC1392790mLd
    public final String LJIIZILJ() {
        return EnumC1430380nKG.ANCHOR_SHOWCASE.getTYPENAME();
    }

    @Override // X.InterfaceC1392790mLd
    public final void LIZJ(C2344009Gk c2344009Gk) {
        Activity activityLIZIZ;
        C18NJ c18nj = C18NJ.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ;
        if (interfaceC1392640mLO != null) {
            activityLIZIZ = interfaceC1392640mLO.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        C18NJ.LIZJ(c18nj, activityLIZIZ, this.LIZLLL, this.LIZ, this.LIZJ, false);
        C18NZ c18nz = C18NZ.LIZ;
        String str = this.LJ;
        c18nz.getClass();
        C1018703yb.LIZLLL("tiktok_video_anchor_click", new AwS146S1100000_32(c2344009Gk, str, 17));
        C1018703yb.LIZLLL("tiktokec_shop_entrance_click", new AwS146S1100000_32(c2344009Gk, this.LJ, 19));
    }

    @Override // X.InterfaceC1392790mLd
    public final void LJ(C2344009Gk c2344009Gk) {
        C18NZ c18nz = C18NZ.LIZ;
        String str = this.LJ;
        c18nz.getClass();
        C1018703yb.LIZLLL("tiktok_video_anchor_view", new AwS146S1100000_32(c2344009Gk, str, 18));
    }

    @Override // X.InterfaceC1392790mLd
    public final void LJIILIIL(int i) {
        String string;
        C18NZ c18nz = C18NZ.LIZ;
        Integer numValueOf = Integer.valueOf(i + 1);
        c18nz.getClass();
        ConcurrentHashMap<String, Object> concurrentHashMap = C18NZ.LIZIZ;
        if (numValueOf == null || (string = numValueOf.toString()) == null) {
            string = "";
        }
        concurrentHashMap.put("rank", string);
        C1018703yb.LIZLLL("tiktok_video_anchor_view", new AwS146S1100000_32((C2344009Gk) null, "video_shop_showwindow_photo_detail_single_anchor", 18));
        C1018703yb.LIZLLL("tiktokec_shop_entrance_show", new AwS146S1100000_32((C2344009Gk) null, "video_shop_showwindow_photo_detail_single_anchor", 20));
    }

    @Override // X.InterfaceC1392790mLd
    public final View LJIILLIIL(ViewGroup viewGroup) {
        AnonymousClass0317 anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
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
        View viewCommonAnchorItemProduceOne = ((IAnchorDependencyService) anonymousClass0317CreateIAnchorDependencyServicebyMonsterPlugin).commonAnchorItemProduceOne(viewGroup, new AwS576S0100000_32(this, 743), new AwS576S0100000_32(this, 744));
        if (viewCommonAnchorItemProduceOne == null) {
            return null;
        }
        C786410Ut5.I7(new AjS46S0200000_32(viewCommonAnchorItemProduceOne, this, 5), viewCommonAnchorItemProduceOne);
        return viewCommonAnchorItemProduceOne;
    }

    @Override // X.InterfaceC1392790mLd
    public final void LJIILJJIL(InterfaceC1392640mLO interfaceC1392640mLO, AnchorCommonStruct anchorCommonStruct) {
        String str;
        String str2;
        ECAnchorInfo eCAnchorInfo;
        String str3;
        this.LIZIZ = interfaceC1392640mLO;
        this.LIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        this.LIZJ = interfaceC1392640mLO.Cf();
        C18NJ.LIZ.getClass();
        ShowcaseContent showcaseContentLIZIZ = C18NJ.LIZIZ(anchorCommonStruct);
        this.LIZLLL = showcaseContentLIZIZ;
        C18NZ.LIZ.getClass();
        ConcurrentHashMap<String, Object> concurrentHashMap = C18NZ.LIZIZ;
        C18N7 c18n7 = C18N7.LIZ;
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        c18n7.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        if (awemeLJJLIIIJJIZ != null) {
            linkedHashMap.putAll(C21272018Mk.LJJIFFI(C21272018Mk.LIZ, awemeLJJLIIIJJIZ, null, 2));
            int i = 0;
            if (AwemeExtKt.isPhotoMode(awemeLJJLIIIJJIZ)) {
                i = 150;
            }
            linkedHashMap.put("aweme_type", Integer.valueOf(i));
            linkedHashMap.putAll(C21272018Mk.LJIILJJIL(awemeLJJLIIIJJIZ));
        }
        String str4 = "";
        if (showcaseContentLIZIZ != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String str5 = showcaseContentLIZIZ.sellerId;
            if (str5 == null) {
                str5 = "";
            }
            linkedHashMap2.put("shop_id", str5);
            linkedHashMap2.put("is_ecom", 1);
            linkedHashMap2.putAll(C1010603xI.LIZ(showcaseContentLIZIZ.daInfo));
            linkedHashMap.putAll(linkedHashMap2);
        }
        if (C18NJ.LIZLLL(awemeLJJLIIIJJIZ)) {
            str = "yes";
        } else {
            str = "no";
        }
        linkedHashMap.put("is_single_anchor", str);
        concurrentHashMap.putAll(linkedHashMap);
        String strCf = interfaceC1392640mLO.Cf();
        if (strCf == null) {
            strCf = "";
        }
        concurrentHashMap.put("enter_from", strCf);
        String strCf2 = interfaceC1392640mLO.Cf();
        if (strCf2 != null) {
            str4 = strCf2;
        }
        concurrentHashMap.put("source_previous_page", str4);
        if (showcaseContentLIZIZ != null && (eCAnchorInfo = showcaseContentLIZIZ.ecAnchorInfo) != null && (str3 = eCAnchorInfo.daAnchorTag) != null) {
            concurrentHashMap.put("anchor_tag", str3);
        }
        if (C18NJ.LIZLLL(this.LIZ)) {
            str2 = "video_shop_showwindow_single_anchor";
        } else {
            str2 = "video_shop_showwindow_multi_anchor";
        }
        this.LJ = str2;
    }
}
