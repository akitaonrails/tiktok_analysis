package X;

import Y.AObserverS234S0100000_32;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.AnchorCommonViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceFYPPlayerService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import g1c.AjS72S0100000_32;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS147S1200000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.18NQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NQ implements InterfaceC21275218Nq {
    public final ViewGroup LIZ;
    public final ECommerceAnchorPanelViewModel LIZIZ;
    public final AnchorCommonViewModel LIZJ;
    public C18NS LIZLLL;

    @Override // X.InterfaceC21275218Nq
    public final void LJ(Function0<Unit> function0) {
    }

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
            eCommerceAnchorPanelViewModel2.UQ2(0, Intrinsics.LJFF(bool, Boolean.TRUE) ? 2 : 1, promotionStyleInfo, true);
        }
    }

    public final HashMap<String, Object> LJI() {
        Pair<Boolean, Integer> titleShowStateInfo$ecommerce_video_release;
        HashMap<String, Object> map = new HashMap<>();
        C18NS c18ns = this.LIZLLL;
        if (c18ns != null) {
            map.put("is_prefix_shown", Integer.valueOf(c18ns.getIsPrefixShown$ecommerce_video_release() ? 1 : 0));
        }
        int length = this.LIZIZ.WQ2().length();
        C18NS c18ns2 = this.LIZLLL;
        if (c18ns2 != null && (titleShowStateInfo$ecommerce_video_release = c18ns2.getTitleShowStateInfo$ecommerce_video_release()) != null) {
            map.put("title_num_chars_total", Integer.valueOf(this.LIZIZ.WQ2().length()));
            map.put("title_num_chars_shown", titleShowStateInfo$ecommerce_video_release.getSecond());
            map.put("is_title_truncated", Integer.valueOf(titleShowStateInfo$ecommerce_video_release.getFirst().booleanValue() ? 1 : 0));
            map.put("title_visible_text", this.LIZIZ.WQ2().substring(0, C13LZ.LJ(titleShowStateInfo$ecommerce_video_release.getSecond().intValue(), 0, length)));
        }
        C18NS c18ns3 = this.LIZLLL;
        if (c18ns3 != null) {
            map.put("is_suffix_shown", Integer.valueOf(c18ns3.getIsSuftitleShown$ecommerce_video_release() ? 1 : 0));
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
        C18NS c18ns = this.LIZLLL;
        if (c18ns != null && (titleShowStateInfo$ecommerce_video_release = c18ns.getTitleShowStateInfo$ecommerce_video_release()) != null) {
            map.put("is_content_truncate", titleShowStateInfo$ecommerce_video_release.getFirst().booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT);
            map.put("anchor_content_size", String.valueOf(titleShowStateInfo$ecommerce_video_release.getSecond().intValue()));
        }
        for (Map.Entry<String, Object> entry : LJI().entrySet()) {
            map.put(entry.getKey(), entry.getValue().toString());
        }
        return map;
    }

    @Override // X.InterfaceC21275218Nq
    public final void onInit() {
        C18NS c18ns;
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZIZ;
        C18NS c18ns2 = this.LIZLLL;
        TuxIconView iconView = c18ns2 != null ? c18ns2.getIconView() : null;
        C18NS c18ns3 = this.LIZLLL;
        eCommerceAnchorPanelViewModel.BQ2(iconView, c18ns3 != null ? c18ns3.getBubbleIconView() : null);
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel2 = this.LIZIZ;
        C18NS c18ns4 = this.LIZLLL;
        eCommerceAnchorPanelViewModel2.getClass();
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        ProductListModel productListModel = eCommerceAnchorPanelViewModel2.LLILLJJLI;
        Aweme aweme = productListModel != null ? productListModel.aweme : null;
        anchorBizUtils.getClass();
        String strLJJIJL = AnchorBizUtils.LJJIJL(aweme);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_sv_should_enable_prefix_vector_images", true)) {
            C21273718Nb c21273718Nb = C21273718Nb.LIZ;
            ProductListModel productListModel2 = eCommerceAnchorPanelViewModel2.LLILLJJLI;
            Aweme aweme2 = productListModel2 != null ? productListModel2.aweme : null;
            AwS398S0200000_32 awS398S0200000_32 = new AwS398S0200000_32(c18ns4, eCommerceAnchorPanelViewModel2, 0);
            AwS147S1200000_32 awS147S1200000_32 = new AwS147S1200000_32(c18ns4, eCommerceAnchorPanelViewModel2, strLJJIJL, 0);
            AwS147S1200000_32 awS147S1200000_322 = new AwS147S1200000_32(c18ns4, eCommerceAnchorPanelViewModel2, strLJJIJL, 1);
            c21273718Nb.getClass();
            C21273718Nb.LIZJ(aweme2, c18ns4, awS398S0200000_32, awS147S1200000_32, awS147S1200000_322);
        } else if (c18ns4 != null) {
            c18ns4.LIZIZ(eCommerceAnchorPanelViewModel2.WQ2(), strLJJIJL);
        }
        InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LL;
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO != null ? interfaceC1392640mLO.LJJLIIIJJIZ() : null;
        C21272618Mq.LIZ.getClass();
        if (C21272618Mq.LJIIL(awemeLJJLIIIJJIZ)) {
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel3 = this.LIZIZ;
            C18NS c18ns5 = this.LIZLLL;
            eCommerceAnchorPanelViewModel3.PQ2(c18ns5 != null ? c18ns5.getImgCoverIconView$ecommerce_video_release() : null);
            this.LIZIZ.LLJILJILJ.observe(LJII(), new AObserverS234S0100000_32(this, 54));
        }
        C18NS c18ns6 = this.LIZLLL;
        if (c18ns6 != null) {
            c18ns6.setSufTitle(this.LIZIZ.VQ2());
        }
        C18NS c18ns7 = this.LIZLLL;
        if (c18ns7 != null) {
            c18ns7.setPrefixSuffixPriority(AnchorBizUtils.LJJI(awemeLJJLIIIJJIZ));
        }
        if (C21272618Mq.LIZLLL(awemeLJJLIIIJJIZ)) {
            this.LIZIZ.AQ2(1);
            this.LIZIZ.LLILZLL.observe(LJII(), new AObserverS234S0100000_32(this, 55));
        } else if (awemeLJJLIIIJJIZ != null && awemeLJJLIIIJJIZ.isAd()) {
            C18NF.LJI(awemeLJJLIIIJJIZ, this.LIZLLL, this.LIZIZ);
        }
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LIZIZ.LL;
        Aweme awemeLJJLIIIJJIZ2 = interfaceC1392640mLO2 != null ? interfaceC1392640mLO2.LJJLIIIJJIZ() : null;
        C18LI.LIZ.getClass();
        if (!C18LI.LJ(awemeLJJLIIIJJIZ2) || (c18ns = this.LIZLLL) == null) {
            return;
        }
        C786410Ut5.I7(new AjS72S0100000_32(this, 22), c18ns);
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZJ(C2344009Gk c2344009Gk) throws JSONException {
        Pair<Boolean, Integer> titleShowStateInfo$ecommerce_video_release;
        Aweme awemeLJJLIIIJJIZ;
        if (this.LIZ.isShown()) {
            C18NS c18ns = this.LIZLLL;
            Aweme awemeLJJLIIIJJIZ2 = null;
            if (c18ns != null) {
                titleShowStateInfo$ecommerce_video_release = c18ns.getTitleShowStateInfo$ecommerce_video_release();
            } else {
                titleShowStateInfo$ecommerce_video_release = null;
            }
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZIZ;
            HashMap map = new HashMap();
            if (titleShowStateInfo$ecommerce_video_release != null) {
                map.put("is_content_truncate", titleShowStateInfo$ecommerce_video_release.getFirst());
                map.put("anchor_content_size", titleShowStateInfo$ecommerce_video_release.getSecond());
            }
            map.putAll(LJI());
            ECommerceAnchorPanelViewModel.xQ2(eCommerceAnchorPanelViewModel, c2344009Gk, map, Boolean.FALSE, 30);
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LL;
            if (interfaceC1392640mLO != null) {
                awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
            } else {
                awemeLJJLIIIJJIZ = null;
            }
            anchorBizUtils.getClass();
            C18LI.LIZ.getClass();
            if (C18LI.LJ(awemeLJJLIIIJJIZ)) {
                InterfaceC1392640mLO interfaceC1392640mLO2 = this.LIZIZ.LL;
                if (interfaceC1392640mLO2 != null) {
                    awemeLJJLIIIJJIZ2 = interfaceC1392640mLO2.LJJLIIIJJIZ();
                }
                AnchorBizUtils.LJIILIIL(awemeLJJLIIIJJIZ2, new AwS576S0100000_32(this, 886));
                return;
            }
            return;
        }
        ECommerceAnchorPanelViewModel.yQ2(7, this.LIZIZ);
    }

    public C18NQ(ViewGroup viewGroup, ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel, AnchorCommonViewModel anchorCommonViewModel) {
        this.LIZ = viewGroup;
        this.LIZIZ = eCommerceAnchorPanelViewModel;
        this.LIZJ = anchorCommonViewModel;
    }
}
