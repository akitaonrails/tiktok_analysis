package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderDisplayImageOpt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.HeaderSlideEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PromoSticker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vxn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762410vxn extends AbstractC1762740vyK {
    public final C21600219g8 LLILZ;
    public final String LLILZIL;
    public final PdpViewModel LLILZLL;
    public final Lifecycle LLIZ;
    public final InterfaceC1320380kSq LLIZLLLIL;
    public final C1508390pM5 LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public List<? extends InterfaceC1763190vz3> LLJILJIL;
    public boolean LLJILJILJ;
    public AwS640S0100000_26 LLJILLL;
    public AwS235S0300000_26 LLJJ;
    public AwS640S0100000_26 LLJJI;
    public AwS570S0100000_26 LLJJIII;
    public final List<MediaItem> LLJJIJI;
    public final List<ProductBannerLabel> LLJJIJIIJIL;
    public PromoSticker LLJJIJIL;
    public int LLJJJ;
    public Video LLJJJIL;
    public HeaderSlideEntrance LLJJJJ;
    public boolean LLJJJJJIL;
    public HeaderDisplayImageOpt LLJJJJLIIL;
    public C1765590w2v LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final Set<String> LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final boolean LLJLL;
    public final boolean LLJLLIL;
    public int LLJLLL;
    public final Map<Integer, C1066100dqi> LLJZ;
    public boolean LLJZIJLIL;
    public final C1752270vhR LLL;

    public final void LJJIJLIJ() {
        Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (((MediaItem) it2.next()).type == 1) {
                break;
            } else {
                i++;
            }
        }
        this.LLJJJ = i;
    }

    public final void LJJIZ() {
        boolean z = C04J1.LIZ;
        if (C04J1.LIZLLL) {
            return;
        }
        C1765590w2v c1765590w2v = this.LLJJL;
        if (c1765590w2v != null) {
            c1765590w2v.setForceHideCenterControl(true);
        }
        this.LLJL = true;
    }

    public final C1765290w2R LJJJ() {
        C1762260vxY c1762260vxYKR2;
        PdpViewModel pdpViewModel = this.LLILZLL;
        if (pdpViewModel == null || (c1762260vxYKR2 = pdpViewModel.KR2()) == null) {
            return null;
        }
        return c1762260vxYKR2.LIZ;
    }

    public final int LJJJI() {
        Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (((MediaItem) it2.next()).type == 2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLJJIJI).size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        View view;
        Object tag = null;
        if ((obj instanceof View) && (view = (View) obj) != null) {
            tag = view.getTag();
        }
        if (Intrinsics.LJFF(tag, "entry_guide_view")) {
            return -2;
        }
        return -1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIL(int i) {
        C1753770vjr c1753770vjr = C1753770vjr.LIZ;
        HeaderSlideEntrance headerSlideEntrance = this.LLJJJJ;
        c1753770vjr.getClass();
        if (C1753770vjr.LIZ(headerSlideEntrance) && this.LLJJJJJIL && i == getCount() - 1) {
            return 0.3f;
        }
        return 1.0f;
    }

    @Override // X.AbstractC1762740vyK, androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return Intrinsics.LJFF(view, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0172  */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0vwA, X.0vyU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(final int r59, android.view.ViewGroup r60) {
        /*
            Method dump skipped, instruction units count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1762410vxn.LJJIL(int, android.view.ViewGroup):void");
    }

    @Override // X.AbstractC1762740vyK, androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        super.LJIIZILJ(viewGroup, i, obj);
        C1753770vjr c1753770vjr = C1753770vjr.LIZ;
        HeaderSlideEntrance headerSlideEntrance = this.LLJJJJ;
        c1753770vjr.getClass();
        if (C1753770vjr.LIZ(headerSlideEntrance) && this.LLJJJJJIL && i >= getCount() - 1) {
            this.LLILLJJLI.removeLast();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05c1  */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, com.ss.android.ugc.aweme.ecommerce.service.vo.Image] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, com.ss.android.ugc.aweme.ecommerce.service.vo.Image] */
    /* JADX WARN: Type inference failed for: r4v22, types: [T, X.0kVb] */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, X.0n6g] */
    @Override // X.AbstractC1762740vyK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJIJIL(final int r31, android.view.View r32, android.view.ViewGroup r33) {
        /*
            Method dump skipped, instruction units count: 2096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1762410vxn.LJJIJIL(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0vhR] */
    public C1762410vxn(C1763720vzu c1763720vzu, PdpViewModel pdpViewModel, LifecycleRegistry lifecycleRegistry, C1320310kSj c1320310kSj, C1508390pM5 c1508390pM5) {
        super(C786410Ut5.ne(c1763720vzu.getContext()));
        c1763720vzu.getContext();
        this.LLILZ = c1763720vzu;
        this.LLILZIL = "pdp_head";
        this.LLILZLL = pdpViewModel;
        this.LLIZ = lifecycleRegistry;
        this.LLIZLLLIL = c1320310kSj;
        this.LLJ = c1508390pM5;
        this.LLJI = false;
        this.LLJIJIL = false;
        this.LLJILJILJ = true;
        this.LLJJIJI = new ArrayList();
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJJ = -1;
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJLIL = new LinkedHashSet();
        this.LLJLILLLLZIIL = true;
        this.LLJLL = true;
        this.LLJLLIL = true;
        this.LLJZ = new LinkedHashMap();
        this.LLL = new InterfaceC1763420vzQ() { // from class: X.0vhR
            @Override // X.InterfaceC1763420vzQ
            public final void LIZIZ() {
                Video video;
                Aweme awemeLIZ;
                com.ss.android.ugc.aweme.feed.model.Video video2;
                C1762410vxn c1762410vxn;
                PdpViewModel pdpViewModel2;
                C1054004Ag c1054004Ag;
                C1762410vxn c1762410vxn2 = this.LIZ;
                MediaItem mediaItem = (MediaItem) C13LP.LJJJLZIJ(c1762410vxn2.LJJJI(), c1762410vxn2.LLJJIJI);
                if (mediaItem == null || (video = mediaItem.video) == null || (video2 = (awemeLIZ = video.LIZ()).getVideo()) == null || (pdpViewModel2 = (c1762410vxn = this.LIZ).LLILZLL) == null || (c1054004Ag = pdpViewModel2.LLJLILLLLZIIL) == null) {
                    return;
                }
                c1054004Ag.LJJIIJ(video2.getVideoLength() * LSPassThroughRecordSizeConfig.DEFAULT, awemeLIZ.getAid(), Integer.valueOf(c1762410vxn.LJJJI()), "head_pic");
            }
        };
    }

    public static void LJJJIL(C1762410vxn c1762410vxn, List list, boolean z, Boolean bool, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            bool = Boolean.TRUE;
        }
        if (!c1762410vxn.LLJZIJLIL) {
            c1762410vxn.LLJZIJLIL = true;
            c1762410vxn.LLILZ.LIZLLL(new C1776110wJt(c1762410vxn, 1));
        }
        ((ArrayList) c1762410vxn.LLJJIJI).clear();
        ((ArrayList) c1762410vxn.LLJJIJI).addAll(list);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C1753770vjr c1753770vjr = C1753770vjr.LIZ;
            HeaderSlideEntrance headerSlideEntrance = c1762410vxn.LLJJJJ;
            c1753770vjr.getClass();
            if (C1753770vjr.LIZ(headerSlideEntrance)) {
                ((ArrayList) c1762410vxn.LLJJIJI).add(new MediaItem(true));
            }
        }
        c1762410vxn.LLJLLL = 0;
        c1762410vxn.LJJIJLIJ();
        if (z) {
            c1762410vxn.notifyDataSetChanged();
        }
    }
}
