package X;

import Y.AObserverS234S0100000_32;
import Y.ARunnableS85S0200000_16;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.anchor.settings.EcShouldEnablePrefixInMultiAnchorAB;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.AnchorCommonViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import g1c.AjS46S0200000_32;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.18NP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NP implements InterfaceC21275218Nq {
    public final ViewGroup LIZ;
    public final ECommerceAnchorPanelViewModel LIZIZ;
    public final AnchorCommonViewModel LIZJ;
    public C18NR LIZLLL;

    @Override // X.InterfaceC21275218Nq
    public final void LIZ() {
        C18NR c18nr = this.LIZLLL;
        if (c18nr != null) {
            c18nr.LIZJ();
        }
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZIZ;
        eCommerceAnchorPanelViewModel.LLJI = null;
        C18NF c18nf = C18NF.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = eCommerceAnchorPanelViewModel.LL;
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO != null ? interfaceC1392640mLO.LJJLIIIJJIZ() : null;
        C18NR c18nr2 = this.LIZLLL;
        c18nf.getClass();
        C18NF.LJ(awemeLJJLIIIJJIZ, c18nr2);
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZIZ() {
        C18NR c18nr;
        C18NR c18nr2 = new C18NR(this.LIZ.getContext());
        this.LIZLLL = c18nr2;
        this.LIZ.addView(c18nr2);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LL;
        if ((interfaceC1392640mLO == null || !interfaceC1392640mLO.LJIIIIZZ()) && (c18nr = this.LIZLLL) != null) {
            c18nr.LIZLLL();
        }
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZLLL() {
        String privilegeText$ecommerce_video_release;
        String privilegeText$ecommerce_video_release2;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LL;
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO != null ? interfaceC1392640mLO.LJJLIIIJJIZ() : null;
        C21272618Mq.LIZ.getClass();
        if (C21272618Mq.LJ(awemeLJJLIIIJJIZ)) {
            C18NR c18nr = this.LIZLLL;
            if (c18nr != null && (((privilegeText$ecommerce_video_release = c18nr.getAnchorPrivilegeFirstFromXml().getPrivilegeText$ecommerce_video_release()) != null && privilegeText$ecommerce_video_release.length() != 0) || ((privilegeText$ecommerce_video_release2 = c18nr.getAnchorPrivilegeSecondFromXml().getPrivilegeText$ecommerce_video_release()) != null && privilegeText$ecommerce_video_release2.length() != 0))) {
                c18nr.setPivotX(0.0f);
                c18nr.setPivotY(c18nr.getHeight());
                ConstraintLayout anchorPromotionFlowFromXml = c18nr.getAnchorPromotionFlowFromXml();
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(anchorPromotionFlowFromXml, new ARunnableS85S0200000_16(anchorPromotionFlowFromXml, c18nr, 79));
            }
            if (awemeLJJLIIIJJIZ != null && awemeLJJLIIIJJIZ.isAd()) {
                C18NF c18nf = C18NF.LIZ;
                C18NR c18nr2 = this.LIZLLL;
                ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZIZ;
                c18nf.getClass();
                C18NF.LJFF(awemeLJJLIIIJJIZ, c18nr2, eCommerceAnchorPanelViewModel);
            }
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel2 = this.LIZIZ;
            C18NR c18nr3 = this.LIZLLL;
            String promotionStyleInfo = c18nr3 != null ? c18nr3.getPromotionStyleInfo() : null;
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            C18NR c18nr4 = this.LIZLLL;
            Boolean bool = c18nr4 != null ? c18nr4.LLJJJJ : null;
            anchorBizUtils.getClass();
            eCommerceAnchorPanelViewModel2.UQ2(1, Intrinsics.LJFF(bool, Boolean.TRUE) ? 2 : 1, promotionStyleInfo, false);
        }
    }

    @Override // X.InterfaceC21275218Nq
    public final String LJFF() {
        C18NR c18nr = this.LIZLLL;
        return (c18nr == null || !c18nr.LLJJJIL) ? "click_list" : "click_anchor";
    }

    public final Map<String, Object> LJI() {
        Pair<Boolean, Integer> titleShowStateInfo$ecommerce_video_release;
        HashMap map = new HashMap();
        C18NR c18nr = this.LIZLLL;
        if (c18nr != null) {
            map.put("is_prefix_shown", Integer.valueOf(c18nr.getIsPrefixShown$ecommerce_video_release() ? 1 : 0));
        }
        int length = this.LIZIZ.XQ2().length();
        C18NR c18nr2 = this.LIZLLL;
        if (c18nr2 != null && (titleShowStateInfo$ecommerce_video_release = c18nr2.getTitleShowStateInfo$ecommerce_video_release()) != null) {
            map.put("title_num_chars_total", Integer.valueOf(this.LIZIZ.XQ2().length()));
            map.put("title_num_chars_shown", titleShowStateInfo$ecommerce_video_release.getSecond());
            map.put("is_title_truncated", Integer.valueOf(titleShowStateInfo$ecommerce_video_release.getFirst().booleanValue() ? 1 : 0));
            map.put("title_visible_text", this.LIZIZ.XQ2().substring(0, C13LZ.LJ(titleShowStateInfo$ecommerce_video_release.getSecond().intValue(), 0, length)));
        }
        C18NR c18nr3 = this.LIZLLL;
        if (c18nr3 != null) {
            map.put("is_suffix_shown", Integer.valueOf(c18nr3.getIsSuftitleShown$ecommerce_video_release() ? 1 : 0));
        }
        return map;
    }

    public final LifecycleOwner LJII() {
        IECommerceFYPPlayerService iECommerceFYPPlayerService = (IECommerceFYPPlayerService) PluggableExtentionKt.pluggableSpi$default(IECommerceFYPPlayerService.class, false, false, false, 14, null);
        Fragment detailSafRootFragment = iECommerceFYPPlayerService != null ? iECommerceFYPPlayerService.getDetailSafRootFragment(this.LIZ) : null;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ.getContext());
        if (c19egLIZIZ != null) {
            return detailSafRootFragment == null ? c19egLIZIZ : detailSafRootFragment;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC21275218Nq
    public final HashMap<String, String> getShowContentInfo() {
        Pair<Boolean, Integer> titleShowStateInfo$ecommerce_video_release;
        HashMap<String, String> map = new HashMap<>();
        C18NR c18nr = this.LIZLLL;
        if (c18nr != null && (titleShowStateInfo$ecommerce_video_release = c18nr.getTitleShowStateInfo$ecommerce_video_release()) != null) {
            map.put("is_content_truncate", titleShowStateInfo$ecommerce_video_release.getFirst().booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT);
            map.put("anchor_content_size", String.valueOf(titleShowStateInfo$ecommerce_video_release.getSecond().intValue()));
        }
        return map;
    }

    @Override // X.InterfaceC21275218Nq
    public final void onInit() {
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZIZ;
        C18NR c18nr = this.LIZLLL;
        TuxIconView iconView = c18nr != null ? c18nr.getIconView() : null;
        C18NR c18nr2 = this.LIZLLL;
        eCommerceAnchorPanelViewModel.BQ2(iconView, c18nr2 != null ? c18nr2.getBubbleIconView() : null);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LL;
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO != null ? interfaceC1392640mLO.LJJLIIIJJIZ() : null;
        C21272618Mq.LIZ.getClass();
        if (C21272618Mq.LJIIL(awemeLJJLIIIJJIZ)) {
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel2 = this.LIZIZ;
            C18NR c18nr3 = this.LIZLLL;
            eCommerceAnchorPanelViewModel2.PQ2(c18nr3 != null ? c18nr3.getImgCoverIconView$ecommerce_video_release() : null);
            this.LIZIZ.LLJILJILJ.observe(LJII(), new AObserverS234S0100000_32(this, 52));
        }
        C18NR c18nr4 = this.LIZLLL;
        if (c18nr4 != null) {
            c18nr4.setSufTitle(this.LIZIZ.VQ2());
        }
        C18NR c18nr5 = this.LIZLLL;
        if (c18nr5 != null) {
            AnchorBizUtils.LIZ.getClass();
            c18nr5.setPrefixSuffixPriority(AnchorBizUtils.LJJI(awemeLJJLIIIJJIZ));
        }
        C18NR c18nr6 = this.LIZLLL;
        if (c18nr6 != null) {
            String strXQ2 = this.LIZIZ.XQ2();
            AnchorBizUtils.LIZ.getClass();
            c18nr6.LIZIZ(strXQ2, AnchorBizUtils.LJJIJL(awemeLJJLIIIJJIZ));
        }
        if (Intrinsics.LJFF(((EcShouldEnablePrefixInMultiAnchorAB.Config) EcShouldEnablePrefixInMultiAnchorAB.LIZIZ.getValue()).mainAnchor, Boolean.TRUE)) {
            this.LIZIZ.CQ2(this.LIZLLL);
        }
        C18NR c18nr7 = this.LIZLLL;
        if (c18nr7 != null) {
            c18nr7.setSuffix(this.LIZIZ.LLILZ);
        }
        if (C21272618Mq.LIZLLL(awemeLJJLIIIJJIZ)) {
            this.LIZIZ.AQ2(3);
            this.LIZIZ.LLILZLL.observe(LJII(), new AObserverS234S0100000_32(this, 53));
        } else {
            if (awemeLJJLIIIJJIZ == null || !awemeLJJLIIIJJIZ.isAd()) {
                return;
            }
            C18NF.LJI(awemeLJJLIIIJJIZ, this.LIZLLL, this.LIZIZ);
        }
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZJ(C2344009Gk c2344009Gk) throws JSONException {
        Pair<Boolean, Integer> titleShowStateInfo$ecommerce_video_release;
        Aweme awemeLJJLIIIJJIZ;
        if (this.LIZ.isShown()) {
            C18NR c18nr = this.LIZLLL;
            Aweme awemeLJJLIIIJJIZ2 = null;
            if (c18nr != null) {
                titleShowStateInfo$ecommerce_video_release = c18nr.getTitleShowStateInfo$ecommerce_video_release();
            } else {
                titleShowStateInfo$ecommerce_video_release = null;
            }
            ViewGroup viewGroup = this.LIZ;
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZIZ;
            c2344009Gk.LJII(C1104190eq9.LIZ(viewGroup, "c5134.d0"));
            HashMap map = new HashMap();
            if (titleShowStateInfo$ecommerce_video_release != null) {
                map.put("is_content_truncate", titleShowStateInfo$ecommerce_video_release.getFirst());
                map.put("anchor_content_size", titleShowStateInfo$ecommerce_video_release.getSecond());
            }
            map.putAll(LJI());
            C21272618Mq c21272618Mq = C21272618Mq.LIZ;
            InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LL;
            if (interfaceC1392640mLO != null) {
                awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
            } else {
                awemeLJJLIIIJJIZ = null;
            }
            List<AnchorProductInfoModel> list = this.LIZIZ.LLILZIL;
            c21272618Mq.getClass();
            ECommerceAnchorPanelViewModel.xQ2(eCommerceAnchorPanelViewModel, c2344009Gk, map, Boolean.valueOf(C21272618Mq.LJIIIZ(awemeLJJLIIIJJIZ, list, false)), 14);
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LIZIZ.LL;
            if (interfaceC1392640mLO2 != null) {
                awemeLJJLIIIJJIZ2 = interfaceC1392640mLO2.LJJLIIIJJIZ();
            }
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 885);
            anchorBizUtils.getClass();
            AnchorBizUtils.LJIILIIL(awemeLJJLIIIJJIZ2, awS576S0100000_32);
            return;
        }
        ECommerceAnchorPanelViewModel.yQ2(3, this.LIZIZ);
    }

    @Override // X.InterfaceC21275218Nq
    public final void LJ(Function0<Unit> function0) {
        C18NR c18nr = this.LIZLLL;
        if (c18nr != null) {
            C786410Ut5.I7(new AjS46S0200000_32(this, function0, 8), c18nr);
        }
    }

    public C18NP(ViewGroup viewGroup, ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel, AnchorCommonViewModel anchorCommonViewModel) {
        this.LIZ = viewGroup;
        this.LIZIZ = eCommerceAnchorPanelViewModel;
        this.LIZJ = anchorCommonViewModel;
    }
}
