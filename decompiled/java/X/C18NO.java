package X;

import Y.AObserverS191S0200000_32;
import Y.AObserverS234S0100000_32;
import Y.ARunnableS27S0400000_19;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
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
import kotlin.jvm.internal.AwS241S0300000_32;

/* JADX INFO: renamed from: X.18NO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NO implements InterfaceC21275218Nq {
    public final ViewGroup LIZ;
    public final ECommerceAnchorPanelViewModel LIZIZ;
    public C18NR LIZJ;

    @Override // X.InterfaceC21275218Nq
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZ() {
        C18NR c18nr = this.LIZJ;
        if (c18nr != null) {
            c18nr.LIZJ();
        }
        this.LIZIZ.LLJI = null;
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZIZ() {
        C18NR c18nr;
        C18NR c18nr2 = new C18NR(this.LIZ.getContext());
        this.LIZJ = c18nr2;
        this.LIZ.addView(c18nr2);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LL;
        if ((interfaceC1392640mLO == null || !interfaceC1392640mLO.LJIIIIZZ()) && (c18nr = this.LIZJ) != null) {
            c18nr.LIZLLL();
        }
    }

    @Override // X.InterfaceC21275218Nq
    public final String LJFF() {
        C18NR c18nr = this.LIZJ;
        return (c18nr == null || !c18nr.LLJJJIL) ? "click_list" : "click_anchor";
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
        C18NR c18nr = this.LIZJ;
        if (c18nr != null && (titleShowStateInfo$ecommerce_video_release = c18nr.getTitleShowStateInfo$ecommerce_video_release()) != null) {
            map.put("is_content_truncate", titleShowStateInfo$ecommerce_video_release.getFirst().booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT);
            map.put("anchor_content_size", String.valueOf(titleShowStateInfo$ecommerce_video_release.getSecond().intValue()));
        }
        return map;
    }

    @Override // X.InterfaceC21275218Nq
    public final void onInit() {
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LIZIZ;
        C18NR c18nr = this.LIZJ;
        TuxIconView iconView = c18nr != null ? c18nr.getIconView() : null;
        C18NR c18nr2 = this.LIZJ;
        eCommerceAnchorPanelViewModel.BQ2(iconView, c18nr2 != null ? c18nr2.getBubbleIconView() : null);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LIZIZ.LL;
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO != null ? interfaceC1392640mLO.LJJLIIIJJIZ() : null;
        C21272618Mq.LIZ.getClass();
        if (C21272618Mq.LJIIL(awemeLJJLIIIJJIZ)) {
            ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel2 = this.LIZIZ;
            C18NR c18nr3 = this.LIZJ;
            eCommerceAnchorPanelViewModel2.PQ2(c18nr3 != null ? c18nr3.getImgCoverIconView$ecommerce_video_release() : null);
            this.LIZIZ.LLJILJILJ.observe(LJII(), new AObserverS234S0100000_32(this, 49));
        }
        this.LIZIZ.LLJJIJIL.observe(LJII(), new AObserverS191S0200000_32(this, awemeLJJLIIIJJIZ, 7));
        if (awemeLJJLIIIJJIZ == null || !awemeLJJLIIIJJIZ.isAd()) {
            return;
        }
        C18NF.LJI(awemeLJJLIIIJJIZ, this.LIZJ, this.LIZIZ);
    }

    @Override // X.InterfaceC21275218Nq
    public final void LIZJ(C2344009Gk c2344009Gk) {
        if (this.LIZ.isShown()) {
            HashMap map = new HashMap();
            C18NR c18nr = this.LIZJ;
            if (c18nr != null) {
                AwS241S0300000_32 awS241S0300000_32 = new AwS241S0300000_32(map, (HashMap<String, Object>) this, (C18NO) c2344009Gk, (C2344009Gk) 19);
                TuxTextView anchorTitleFromXml = c18nr.getAnchorTitleFromXml();
                if (anchorTitleFromXml.getLayout() != null && anchorTitleFromXml.getLineCount() > 0) {
                    awS241S0300000_32.invoke(c18nr.getTitleShowStateInfo$ecommerce_video_release());
                    return;
                } else {
                    ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(anchorTitleFromXml, new ARunnableS27S0400000_19(anchorTitleFromXml, anchorTitleFromXml, awS241S0300000_32, c18nr, 8));
                    return;
                }
            }
            return;
        }
        ECommerceAnchorPanelViewModel.yQ2(3, this.LIZIZ);
    }

    @Override // X.InterfaceC21275218Nq
    public final void LJ(Function0<Unit> function0) {
        C18NR c18nr = this.LIZJ;
        if (c18nr != null) {
            C786410Ut5.I7(new AjS72S0100000_32(this, 21), c18nr);
        }
    }

    public C18NO(ViewGroup viewGroup, ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel) {
        this.LIZ = viewGroup;
        this.LIZIZ = eCommerceAnchorPanelViewModel;
    }

    public final Map LJI(int i, boolean z) {
        int i2;
        HashMap map = new HashMap();
        C18NR c18nr = this.LIZJ;
        if (c18nr != null) {
            map.put("is_prefix_shown", Integer.valueOf(c18nr.getIsPrefixShown$ecommerce_video_release() ? 1 : 0));
        }
        int i3 = 1;
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        map.put("is_content_truncate", Integer.valueOf(i2));
        map.put("anchor_content_size", Integer.valueOf(i));
        String strXQ2 = this.LIZIZ.XQ2();
        int length = strXQ2.length();
        int iLJ = C13LZ.LJ(i, 0, length);
        map.put("title_num_chars_total", Integer.valueOf(length));
        map.put("title_num_chars_shown", Integer.valueOf(iLJ));
        if (!z) {
            i3 = 0;
        }
        map.put("is_title_truncated", Integer.valueOf(i3));
        map.put("title_visible_text", strXQ2.substring(0, iLJ));
        C18NR c18nr2 = this.LIZJ;
        if (c18nr2 != null) {
            map.put("is_suffix_shown", Integer.valueOf(c18nr2.getIsSuftitleShown$ecommerce_video_release() ? 1 : 0));
        }
        return map;
    }
}
