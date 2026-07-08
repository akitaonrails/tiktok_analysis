package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderDisplayImageOpt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.HeaderSlideEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS4S2201000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vxo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762420vxo extends AbstractC1762740vyK {
    public static final /* synthetic */ int LLJZIJLIL = 0;
    public final C21600219g8 LLILZ;
    public final String LLILZIL;
    public final SeaPdpViewModel LLILZLL;
    public final Lifecycle LLIZ;
    public final InterfaceC1320380kSq LLIZLLLIL;
    public final C1508390pM5 LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public boolean LLJILJIL;
    public AwS640S0100000_26 LLJILJILJ;
    public AwS640S0100000_26 LLJILLL;
    public AwS570S0100000_26 LLJJ;
    public final List<MediaItem> LLJJI;
    public final List<ProductBannerLabel> LLJJIII;
    public Video LLJJIJI;
    public HeaderSlideEntrance LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public HeaderDisplayImageOpt LLJJJ;
    public C1765590w2v LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final Set<String> LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public AwS640S0100000_26 LLJLILLLLZIIL;
    public AwS675S0100000_26 LLJLL;
    public boolean LLJLLIL;
    public int LLJLLL;
    public final C1752260vhQ LLJZ;

    public final C1765300w2S LJJIZ() {
        C1763240vz8 c1763240vz8;
        SeaPdpViewModel seaPdpViewModel = this.LLILZLL;
        if (seaPdpViewModel == null || (c1763240vz8 = (C1763240vz8) seaPdpViewModel.LLLLILI.getValue()) == null) {
            return null;
        }
        return c1763240vz8.LIZ;
    }

    public final int LJJJ() {
        Iterator it2 = ((ArrayList) this.LLJJI).iterator();
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
        return ((ArrayList) this.LLJJI).size();
    }

    public static void LJJJIL(ImageView imageView) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        Drawable drawableLIZ = c384050F3z.LIZ(imageView.getContext());
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zq);
        imageView.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c384050F3z2.LIZ(imageView.getContext())));
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
        HeaderSlideEntrance headerSlideEntrance = this.LLJJIJIIJIL;
        c1753770vjr.getClass();
        if (C1753770vjr.LIZ(headerSlideEntrance) && this.LLJJIJIL && i == getCount() - 1) {
            return 0.3f;
        }
        return 1.0f;
    }

    public static void LJJJJI(SmartImageView smartImageView, String str) {
        Context context;
        Integer numLIZJ;
        if (smartImageView != null && Intrinsics.LJFF(str, "size_guide") && (context = smartImageView.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zi, context)) != null) {
            smartImageView.setBackgroundColor(numLIZJ.intValue());
        }
    }

    @Override // X.AbstractC1762740vyK, androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return Intrinsics.LJFF(view, obj);
    }

    public final String LJJIL(int i, String str) {
        if (str == null) {
            return null;
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(i);
        return btmSDK.createJumpSourceBtmToken(C2188811AlT.LIZIZ(sbLIZ), PageFinder.via((View) this.LLILZ), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ(X.C1331670kl3 r4, int r5) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel r0 = r3.LLILZLL
            if (r0 == 0) goto L5a
            java.lang.String r2 = r0.getProductId()
            if (r2 == 0) goto L5a
            boolean r0 = kotlin.text.a0.LJJJIL(r2)
            if (r0 != 0) goto L5a
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem> r0 = r3.LLJJI
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r5, r0)
            com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.common.model.MediaItem) r0
            if (r0 == 0) goto L32
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r0.image
            if (r0 == 0) goto L32
            java.lang.String r1 = r0.getUri()
            if (r1 == 0) goto L32
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            if (r0 != 0) goto L32
            X.01GW r0 = X.C1066190dqr.LIZ
            android.graphics.drawable.Drawable r1 = X.C1066190dqr.LJIIIIZZ(r2, r1)
            if (r1 != 0) goto L54
        L32:
            kotlin.jvm.internal.AwS570S0100000_26 r0 = r3.LLJJ
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r0.invoke()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo) r0
            if (r0 == 0) goto L5a
            java.lang.String r1 = r0.cover
            if (r1 == 0) goto L5a
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            if (r0 != 0) goto L5a
            java.lang.String r1 = X.C1759110vsT.LIZIZ(r1)
            X.01GW r0 = X.C1066190dqr.LIZ
            android.graphics.drawable.Drawable r1 = X.C1066190dqr.LJIIIIZZ(r2, r1)
            if (r1 == 0) goto L5a
        L54:
            X.0kve r0 = X.EnumC1338240kve.FIT_CENTER
            r4.LJIILL = r1
            r4.LJIILLIIL = r0
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1762420vxo.LJJJJ(X.0kl3, int):void");
    }

    @Override // X.AbstractC1762740vyK, androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        super.LJIIZILJ(viewGroup, i, obj);
        C1753770vjr c1753770vjr = C1753770vjr.LIZ;
        HeaderSlideEntrance headerSlideEntrance = this.LLJJIJIIJIL;
        c1753770vjr.getClass();
        if (C1753770vjr.LIZ(headerSlideEntrance) && this.LLJJIJIL && i >= getCount() - 1) {
            this.LLILLJJLI.removeLast();
        }
        if (this.LLJLLIL && i == LJJJ()) {
            this.LLILLJJLI.removeLast();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0391  */
    /* JADX WARN: Type inference failed for: r3v15, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r3v27, types: [T, com.ss.android.ugc.aweme.ecommerce.service.vo.Image] */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, com.ss.android.ugc.aweme.ecommerce.service.vo.Image] */
    @Override // X.AbstractC1762740vyK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJJIJIL(final int r32, android.view.View r33, android.view.ViewGroup r34) {
        /*
            Method dump skipped, instruction units count: 1343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1762420vxo.LJJIJIL(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0156  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.List<X.0vyr>] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0vwA, X.0vyo] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.0vw3, X.0vw5, android.app.Dialog] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJLIJ(final int r20, android.content.Context r21, android.view.ViewGroup r22) {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1762420vxo.LJJIJLIJ(int, android.content.Context, android.view.ViewGroup):void");
    }

    public final void LJJJI(List<MediaItem> list, boolean z, Boolean bool, Integer num) {
        int iIntValue;
        ((ArrayList) this.LLJJI).clear();
        ((ArrayList) this.LLJJI).addAll(list);
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C1753770vjr c1753770vjr = C1753770vjr.LIZ;
            HeaderSlideEntrance headerSlideEntrance = this.LLJJIJIIJIL;
            c1753770vjr.getClass();
            if (C1753770vjr.LIZ(headerSlideEntrance)) {
                ((ArrayList) this.LLJJI).add(new MediaItem(true));
            }
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJLLL = iIntValue;
        if (z) {
            notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0vhQ] */
    public C1762420vxo(C1763710vzt c1763710vzt, SeaPdpViewModel seaPdpViewModel, LifecycleRegistry lifecycleRegistry, C1320310kSj c1320310kSj, C1508390pM5 c1508390pM5) {
        super(C786410Ut5.ne(c1763710vzt.getContext()));
        c1763710vzt.getContext();
        this.LLILZ = c1763710vzt;
        this.LLILZIL = "pdp_head";
        this.LLILZLL = seaPdpViewModel;
        this.LLIZ = lifecycleRegistry;
        this.LLIZLLLIL = c1320310kSj;
        this.LLJ = c1508390pM5;
        this.LLJI = true;
        this.LLJIJIL = true;
        this.LLJILJIL = true;
        this.LLJJI = new ArrayList();
        this.LLJJIII = new ArrayList();
        this.LLJJJJ = true;
        this.LLJJJJLIIL = new LinkedHashSet();
        this.LLJJL = true;
        this.LLJL = true;
        this.LLJLIL = true;
        this.LLJZ = new InterfaceC1763420vzQ() { // from class: X.0vhQ
            @Override // X.InterfaceC1763420vzQ
            public final void LIZIZ() {
                Video video;
                Aweme awemeLIZ;
                com.ss.android.ugc.aweme.feed.model.Video video2;
                C1762420vxo c1762420vxo;
                SeaPdpViewModel seaPdpViewModel2;
                C1054104Ah c1054104Ah;
                C1762420vxo c1762420vxo2 = this.LIZ;
                MediaItem mediaItem = (MediaItem) C13LP.LJJJLZIJ(c1762420vxo2.LJJJ(), c1762420vxo2.LLJJI);
                if (mediaItem == null || (video = mediaItem.video) == null || (video2 = (awemeLIZ = video.LIZ()).getVideo()) == null || (seaPdpViewModel2 = (c1762420vxo = this.LIZ).LLILZLL) == null || (c1054104Ah = seaPdpViewModel2.LLJLIL) == null) {
                    return;
                }
                String aid = awemeLIZ.getAid();
                int videoLength = video2.getVideoLength() * LSPassThroughRecordSizeConfig.DEFAULT;
                Integer numValueOf = Integer.valueOf(c1762420vxo.LJJJ());
                InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ();
                if (interfaceC1748810vbrLJJIZ != null) {
                    C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C04BN(), new AwS4S2201000_26(c1054104Ah, "head_pic", aid, videoLength, numValueOf, 0));
                }
            }
        };
    }
}
