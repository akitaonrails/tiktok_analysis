package X;

import Y.AObserverS234S0100000_32;
import android.view.ViewGroup;
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
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import g1c.AjS46S0200000_32;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.18NT, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NT implements InterfaceC21275218Nq {
    public final ViewGroup LIZ;
    public final ECommerceAnchorPanelViewModel LIZIZ;
    public final AnchorCommonViewModel LIZJ;
    public C18NS LIZLLL;

    @Override // X.InterfaceC21275218Nq
    public final String LJFF() {
        return "click_list";
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZ() {
        C18NS c18ns = this.LIZLLL;
        if (c18ns != null) {
            c18ns.LIZJ();
        }
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZIZ;
        eCommerceAnchorPanelViewModel.LLJI = null;
        C18NF c18nf = C18NF.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO = eCommerceAnchorPanelViewModel.LL;
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO != null ? interfaceC1392640mLO.LJJLIIIJJIZ() : null;
        C18NS c18ns2 = this.LIZLLL;
        c18nf.getClass();
        C18NF.LJ(awemeLJJLIIIJJIZ, c18ns2);
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZIZ() {
        C18NS c18ns;
        C18NS c18ns2 = new C18NS(this.LIZ.getContext());
        this.LIZLLL = c18ns2;
        this.LIZ.addView(c18ns2);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LL;
        if ((interfaceC1392640mLO == null || !interfaceC1392640mLO.LJIIIIZZ()) && (c18ns = this.LIZLLL) != null) {
            c18ns.LJ();
        }
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZLLL() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LL;
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO != null ? interfaceC1392640mLO.LJJLIIIJJIZ() : null;
        C21272618Mq.LIZ.getClass();
        if (C21272618Mq.LJ(awemeLJJLIIIJJIZ)) {
            C18NS c18ns = this.LIZLLL;
            if (c18ns != null) {
                c18ns.LIZLLL();
            }
            if (awemeLJJLIIIJJIZ != null && awemeLJJLIIIJJIZ.isAd()) {
                C18NF c18nf = C18NF.LIZ;
                C18NS c18ns2 = this.LIZLLL;
                ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZIZ;
                c18nf.getClass();
                C18NF.LJFF(awemeLJJLIIIJJIZ, c18ns2, eCommerceAnchorPanelViewModel);
            }
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel2 = this.LIZIZ;
            C18NS c18ns3 = this.LIZLLL;
            String promotionStyleInfo = c18ns3 != null ? c18ns3.getPromotionStyleInfo() : null;
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            C18NS c18ns4 = this.LIZLLL;
            Boolean bool = c18ns4 != null ? c18ns4.LLJJIJIL : null;
            anchorBizUtils.getClass();
            eCommerceAnchorPanelViewModel2.UQ2(0, Intrinsics.LJFF(bool, Boolean.TRUE) ? 2 : 1, promotionStyleInfo, false);
        }
    }

    public final LifecycleOwner LJI() {
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
        return new HashMap<>();
    }

    @Override // X.InterfaceC21275218Nq
    public final void onInit() {
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZIZ;
        C18NS c18ns = this.LIZLLL;
        TuxIconView iconView = c18ns != null ? c18ns.getIconView() : null;
        C18NS c18ns2 = this.LIZLLL;
        eCommerceAnchorPanelViewModel.BQ2(iconView, c18ns2 != null ? c18ns2.getBubbleIconView() : null);
        C18NS c18ns3 = this.LIZLLL;
        if (c18ns3 != null) {
            c18ns3.LIZIZ(this.LIZIZ.WQ2(), null);
        }
        C18NS c18ns4 = this.LIZLLL;
        if (c18ns4 != null) {
            c18ns4.setSuffix(this.LIZIZ.LLILZ);
        }
        if (Intrinsics.LJFF(((EcShouldEnablePrefixInMultiAnchorAB.Config) EcShouldEnablePrefixInMultiAnchorAB.LIZIZ.getValue()).multiAnchor, Boolean.TRUE)) {
            this.LIZIZ.CQ2(this.LIZLLL);
        }
        InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LL;
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO != null ? interfaceC1392640mLO.LJJLIIIJJIZ() : null;
        C21272618Mq.LIZ.getClass();
        if (C21272618Mq.LJIIL(awemeLJJLIIIJJIZ)) {
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel2 = this.LIZIZ;
            C18NS c18ns5 = this.LIZLLL;
            eCommerceAnchorPanelViewModel2.PQ2(c18ns5 != null ? c18ns5.getImgCoverIconView$ecommerce_video_release() : null);
            this.LIZIZ.LLJILJILJ.observe(LJI(), new AObserverS234S0100000_32(this, 50));
        }
        if (C21272618Mq.LIZLLL(awemeLJJLIIIJJIZ)) {
            this.LIZIZ.AQ2(2);
            this.LIZIZ.LLILZLL.observe(LJI(), new AObserverS234S0100000_32(this, 51));
        } else {
            if (awemeLJJLIIIJJIZ == null || !awemeLJJLIIIJJIZ.isAd()) {
                return;
            }
            C18NF.LJI(awemeLJJLIIIJJIZ, this.LIZLLL, this.LIZIZ);
        }
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZJ(C2344009Gk c2344009Gk) throws JSONException {
        Aweme awemeLJJLIIIJJIZ;
        if (this.LIZ.isShown()) {
            ViewGroup viewGroup = this.LIZ;
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZIZ;
            c2344009Gk.LJII(C1104190eq9.LIZ(viewGroup, "c5134.d0"));
            C21272618Mq c21272618Mq = C21272618Mq.LIZ;
            InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LL;
            Aweme awemeLJJLIIIJJIZ2 = null;
            if (interfaceC1392640mLO != null) {
                awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
            } else {
                awemeLJJLIIIJJIZ = null;
            }
            List<AnchorProductInfoModel> list = this.LIZIZ.LLILZIL;
            c21272618Mq.getClass();
            ECommerceAnchorPanelViewModel.xQ2(eCommerceAnchorPanelViewModel, c2344009Gk, null, Boolean.valueOf(C21272618Mq.LJIIIZ(awemeLJJLIIIJJIZ, list, false)), 46);
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            InterfaceC1392640mLO interfaceC1392640mLO2 = this.LIZIZ.LL;
            if (interfaceC1392640mLO2 != null) {
                awemeLJJLIIIJJIZ2 = interfaceC1392640mLO2.LJJLIIIJJIZ();
            }
            AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(this, 884);
            anchorBizUtils.getClass();
            AnchorBizUtils.LJIILIIL(awemeLJJLIIIJJIZ2, awS576S0100000_32);
            return;
        }
        ECommerceAnchorPanelViewModel.yQ2(3, this.LIZIZ);
    }

    @Override // X.InterfaceC21275218Nq
    public final void LJ(Function0<Unit> function0) {
        C18NS c18ns = this.LIZLLL;
        if (c18ns != null) {
            C786410Ut5.I7(new AjS46S0200000_32(this, function0, 7), c18ns);
        }
    }

    public C18NT(ViewGroup viewGroup, ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel, AnchorCommonViewModel anchorCommonViewModel) {
        this.LIZ = viewGroup;
        this.LIZIZ = eCommerceAnchorPanelViewModel;
        this.LIZJ = anchorCommonViewModel;
    }
}
