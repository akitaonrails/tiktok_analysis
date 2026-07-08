package X;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.AnchorCommonViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonfeed.CommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import g1c.AjS72S0100000_32;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import org.json.JSONException;

/* JADX INFO: renamed from: X.18NU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NU implements InterfaceC21275218Nq {
    public final ViewGroup LIZ;
    public final ECommerceAnchorPanelViewModel LIZIZ;
    public final AnchorCommonViewModel LIZJ;
    public C18NX LIZLLL;

    @Override // X.InterfaceC21275218Nq
    public final void LIZ() {
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC21275218Nq
    public final void LJ(Function0<Unit> function0) {
    }

    @Override // X.InterfaceC21275218Nq
    public final String LJFF() {
        return "click_list";
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZIZ() {
        C18NX c18nx;
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        C18NX c18nx2 = new C18NX(this.LIZ.getContext());
        this.LIZLLL = c18nx2;
        this.LIZ.addView(c18nx2);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LL;
        if ((interfaceC1392640mLO == null || !interfaceC1392640mLO.LJIIIIZZ()) && (c18nx = this.LIZLLL) != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, ICommonFeedDependService.class.getName(), anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null ? anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
            }
            ((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).tryUnifyECommerceAnchorBackground(c18nx.getAnchorContentFromXml());
        }
    }

    @Override // X.InterfaceC21275218Nq
    public final HashMap<String, String> getShowContentInfo() {
        Pair<Boolean, Integer> titleShowStateInfo$ecommerce_video_release;
        HashMap<String, String> map = new HashMap<>();
        C18NX c18nx = this.LIZLLL;
        if (c18nx != null && (titleShowStateInfo$ecommerce_video_release = c18nx.getTitleShowStateInfo$ecommerce_video_release()) != null) {
            map.put("is_content_truncate", titleShowStateInfo$ecommerce_video_release.getFirst().booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT);
            map.put("anchor_content_size", String.valueOf(titleShowStateInfo$ecommerce_video_release.getSecond().intValue()));
        }
        return map;
    }

    @Override // X.InterfaceC21275218Nq
    public final void onInit() {
        C18NX c18nx;
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZIZ;
        C18NX c18nx2 = this.LIZLLL;
        TuxIconView iconView = c18nx2 != null ? c18nx2.getIconView() : null;
        C18NX c18nx3 = this.LIZLLL;
        eCommerceAnchorPanelViewModel.BQ2(iconView, c18nx3 != null ? c18nx3.getBubbleIconView() : null);
        C18NX c18nx4 = this.LIZLLL;
        if (c18nx4 != null) {
            String strWQ2 = this.LIZIZ.WQ2();
            AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
            InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LL;
            Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO != null ? interfaceC1392640mLO.LJJLIIIJJIZ() : null;
            anchorBizUtils.getClass();
            c18nx4.LIZIZ(strWQ2, AnchorBizUtils.LJJIFFI(awemeLJJLIIIJJIZ));
        }
        AnchorBizUtils anchorBizUtils2 = AnchorBizUtils.LIZ;
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LIZIZ.LL;
        Aweme awemeLJJLIIIJJIZ2 = interfaceC1392640mLO2 != null ? interfaceC1392640mLO2.LJJLIIIJJIZ() : null;
        anchorBizUtils2.getClass();
        C18LI.LIZ.getClass();
        if (!C18LI.LJ(awemeLJJLIIIJJIZ2) || (c18nx = this.LIZLLL) == null) {
            return;
        }
        C786410Ut5.I7(new AjS72S0100000_32(this, 23), c18nx);
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZJ(C2344009Gk c2344009Gk) throws JSONException {
        Pair<Boolean, Integer> titleShowStateInfo$ecommerce_video_release;
        HashMap map;
        Aweme awemeLJJLIIIJJIZ;
        if (this.LIZ.isShown()) {
            C18NX c18nx = this.LIZLLL;
            Aweme awemeLJJLIIIJJIZ2 = null;
            if (c18nx != null) {
                titleShowStateInfo$ecommerce_video_release = c18nx.getTitleShowStateInfo$ecommerce_video_release();
            } else {
                titleShowStateInfo$ecommerce_video_release = null;
            }
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZIZ;
            if (titleShowStateInfo$ecommerce_video_release != null) {
                map = new HashMap();
                map.put("is_content_truncate", Integer.valueOf(titleShowStateInfo$ecommerce_video_release.getFirst().booleanValue() ? 1 : 0));
                map.put("anchor_content_size", titleShowStateInfo$ecommerce_video_release.getSecond());
            } else {
                map = null;
            }
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
                AnchorBizUtils.LJIILIIL(awemeLJJLIIIJJIZ2, new AwS576S0100000_32(this, 887));
                return;
            }
            return;
        }
        ECommerceAnchorPanelViewModel.yQ2(7, this.LIZIZ);
    }

    public C18NU(ViewGroup viewGroup, ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel, AnchorCommonViewModel anchorCommonViewModel) {
        this.LIZ = viewGroup;
        this.LIZIZ = eCommerceAnchorPanelViewModel;
        this.LIZJ = anchorCommonViewModel;
    }
}
