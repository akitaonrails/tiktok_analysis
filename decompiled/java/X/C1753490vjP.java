package X;

import Y.AAListenerS274S0200000_26;
import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitItem;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS9S0220000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vjP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753490vjP {
    public final Context LIZ;
    public final C1053804Ae LIZIZ;
    public Function0<? extends Map<String, ? extends Object>> LIZJ;
    public C1753590vjZ LIZLLL;
    public ViewGroup LJFF;
    public View LJI;
    public C7938038e LJII;
    public CardView LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public boolean LJIIJJI;
    public PDPBenefitInfo LJIIL;
    public boolean LJIILIIL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(469));
    public boolean LJIILJJIL = true;
    public final C1753560vjW LJIILL = new C1753560vjW(this);
    public final ARunnableS126S0100000_26 LJIILLIIL = new ARunnableS126S0100000_26(this, 86);

    public final void LIZLLL() {
        ((Handler) this.LJ.getValue()).removeCallbacks(this.LJIILLIIL);
        C0NC7.LIZ(this.LJFF);
        C0NC7.LIZ(this.LJI);
        C0NC7.LIZ(this.LJII);
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        C1753590vjZ c1753590vjZ = this.LIZLLL;
        if (c1753590vjZ != null) {
            c1753590vjZ.LIZ(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitItem r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitStyleInfo r1 = r7.styleInfo
            r4 = 0
            if (r1 == 0) goto L92
            android.content.Context r0 = r6.LIZ
            boolean r0 = X.C1744700vVE.LJ(r0, r4)
            if (r0 == 0) goto L8d
            java.lang.String r2 = r1.descColorDark
            java.lang.String r0 = r1.bgColorDark
        L14:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitThemeData r1 = new com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitThemeData
            r1.<init>(r2, r0)
        L19:
            X.038e r5 = r6.LJII
            if (r5 == 0) goto L86
            if (r1 == 0) goto L8b
            java.lang.String r0 = r1.bgColor
        L21:
            r5.setBackgroundColor(r0)
            if (r1 == 0) goto L89
            java.lang.String r0 = r1.descColor
        L28:
            r5.setContentColor(r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitContentInfo r0 = r7.contentInfo
            if (r0 == 0) goto L87
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon r1 = r0.icon
            if (r1 == 0) goto L87
            android.content.Context r0 = r5.getContext()
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r1 = r1.requireImageForEcDarkMode(r0)
        L3b:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitContentInfo r0 = r7.contentInfo
            if (r0 == 0) goto L41
            java.lang.String r4 = r0.desc
        L41:
            if (r1 == 0) goto L78
            com.bytedance.lighten.loader.SmartImageView r0 = r5.getIvIconFromXml()
            X.C03DZ.LIZJ(r0)
            com.bytedance.lighten.loader.SmartImageView r3 = r5.getIvIconFromXml()
            if (r3 == 0) goto L78
            X.0kdB r0 = X.C1326790kdB.LIZ
            r0.getClass()
            X.0kl3 r2 = X.C1326790kdB.LIZLLL(r1)
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            int r1 = r0.height
            if (r1 <= 0) goto L69
            int r0 = r0.width
            if (r0 <= 0) goto L69
            r2.LJIIIIZZ = r0
            r2.LJIIIZ = r1
        L69:
            r0 = 1
            r2.LIZLLL = r0
            r2.LJJLIIIJJI = r0
            r2.LJJ(r3)
            X.C786410Ut5.h3(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L7f
        L78:
            com.bytedance.lighten.loader.SmartImageView r0 = r5.getIvIconFromXml()
            X.C03DZ.LIZ(r0)
        L7f:
            com.bytedance.tux.input.TuxTextView r0 = r5.getTvContentFromXml()
            r0.setText(r4)
        L86:
            return
        L87:
            r1 = r4
            goto L3b
        L89:
            r0 = r4
            goto L28
        L8b:
            r0 = r4
            goto L21
        L8d:
            java.lang.String r2 = r1.descColor
            java.lang.String r0 = r1.bgColor
            goto L14
        L92:
            r1 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1753490vjP.LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitItem):void");
    }

    public final void LIZIZ(boolean z) {
        C7938038e c7938038e = this.LJII;
        if (c7938038e != null) {
            AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(this, 1393);
            if (z) {
                CardView cardView = this.LJIIIIZZ;
                if (cardView != null) {
                    cardView.setBackground(null);
                }
                c7938038e.animate().alpha(0.0f).setDuration(300L).setListener(new AAListenerS274S0200000_26(awS570S0100000_26, this, 1)).start();
                return;
            }
            awS570S0100000_26.invoke();
        }
    }

    public C1753490vjP(C19EG c19eg, C1053804Ae c1053804Ae) {
        this.LIZ = c19eg;
        this.LIZIZ = c1053804Ae;
    }

    public final void LIZJ(PDPBenefitInfo pDPBenefitInfo, boolean z) {
        Integer num = pDPBenefitInfo.style;
        int value = EnumC1753450vjL.TAG.getValue();
        if (num != null && num.intValue() == value) {
            LJI(pDPBenefitInfo, z);
        } else {
            int value2 = EnumC1753450vjL.BUBBLE.getValue();
            if (num != null && num.intValue() == value2) {
                LJFF(pDPBenefitInfo, false, z);
            } else {
                int value3 = EnumC1753450vjL.DYNAMIC_TAG.getValue();
                if (num != null && num.intValue() == value3) {
                    LJFF(pDPBenefitInfo, true, z);
                }
            }
        }
        if (!Intrinsics.LJFF(pDPBenefitInfo, this.LJIIL)) {
            this.LJIIL = pDPBenefitInfo;
        }
    }

    public final void LJI(PDPBenefitInfo pDPBenefitInfo, boolean z) {
        this.LJIILIIL = true;
        C7938038e c7938038e = this.LJII;
        if (c7938038e != null) {
            C786410Ut5.G(c7938038e, 4);
        }
        CardView cardView = this.LJIIIIZZ;
        if (cardView != null) {
            C786410Ut5.LLILLL(cardView, 8);
        }
        PDPBenefitItem pDPBenefitItem = pDPBenefitInfo.staticItem;
        if (pDPBenefitItem == null) {
            return;
        }
        LIZ(pDPBenefitItem);
        View view = this.LJI;
        if (view != null) {
            C0NC7.LIZIZ(view, true, new AwS605S0100000_26(this, 600));
        }
        LJ(EnumC1753520vjS.TAG_SHOW, pDPBenefitInfo, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b A[Catch: Exception -> 0x0085, TryCatch #0 {Exception -> 0x0085, blocks: (B:4:0x0003, B:6:0x000c, B:7:0x0015, B:10:0x002c, B:12:0x0030, B:17:0x003b, B:19:0x0048, B:20:0x0056, B:22:0x005c, B:23:0x0072, B:27:0x007f, B:13:0x0033, B:15:0x0037), top: B:32:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.EnumC1753520vjS r7, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitInfo r8, boolean r9) {
        /*
            r6 = this;
            if (r9 != 0) goto L3
            return
        L3:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L85
            r4.<init>()     // Catch: java.lang.Exception -> L85
            kotlin.jvm.functions.Function0<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r0 = r6.LIZJ     // Catch: java.lang.Exception -> L85
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Exception -> L85
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L85
            r4.putAll(r0)     // Catch: java.lang.Exception -> L85
        L15:
            java.lang.String r0 = r8.daInfo     // Catch: java.lang.Exception -> L85
            java.util.Map r0 = X.C1010603xI.LIZ(r0)     // Catch: java.lang.Exception -> L85
            r4.putAll(r0)     // Catch: java.lang.Exception -> L85
            int[] r1 = X.C1753510vjR.LIZ     // Catch: java.lang.Exception -> L85
            int r0 = r7.ordinal()     // Catch: java.lang.Exception -> L85
            r0 = r1[r0]     // Catch: java.lang.Exception -> L85
            r5 = 2
            r3 = 1
            if (r0 == r3) goto L33
            if (r0 != r5) goto L72
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitItem r0 = r8.staticItem     // Catch: java.lang.Exception -> L85
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitContentInfo r1 = r0.contentInfo     // Catch: java.lang.Exception -> L85
            goto L39
        L33:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitItem r0 = r8.dynamicItem     // Catch: java.lang.Exception -> L85
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitContentInfo r1 = r0.contentInfo     // Catch: java.lang.Exception -> L85
        L39:
            if (r1 == 0) goto L72
            java.lang.String r0 = r1.daInfo     // Catch: java.lang.Exception -> L85
            java.util.Map r0 = X.C1010603xI.LIZ(r0)     // Catch: java.lang.Exception -> L85
            r4.putAll(r0)     // Catch: java.lang.Exception -> L85
            java.lang.String r1 = r1.btm     // Catch: java.lang.Exception -> L85
            if (r1 == 0) goto L72
            X.04Ae r0 = r6.LIZIZ     // Catch: java.lang.Exception -> L85
            java.util.Map r0 = r0.LJ(r1)     // Catch: java.lang.Exception -> L85
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Exception -> L85
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L85
        L56:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L85
            if (r0 == 0) goto L72
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> L85
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> L85
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Exception -> L85
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L85
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L85
            r4.put(r1, r0)     // Catch: java.lang.Exception -> L85
            goto L56
        L72:
            int[] r1 = X.C1753510vjR.LIZ     // Catch: java.lang.Exception -> L85
            int r0 = r7.ordinal()     // Catch: java.lang.Exception -> L85
            r0 = r1[r0]     // Catch: java.lang.Exception -> L85
            if (r0 == r3) goto L7f
            if (r0 == r5) goto L7f
            return
        L7f:
            java.lang.String r0 = "tiktokec_bubble_show"
            X.C1018703yb.LJ(r0, r4)     // Catch: java.lang.Exception -> L85
            return
        L85:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1753490vjP.LJ(X.0vjS, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitInfo, boolean):void");
    }

    public final void LJFF(PDPBenefitInfo pDPBenefitInfo, boolean z, boolean z2) {
        C7938038e c7938038e;
        C1753590vjZ c1753590vjZ = this.LIZLLL;
        if (c1753590vjZ != null && c1753590vjZ.LIZIZ()) {
            return;
        }
        if (this.LJIIJJI) {
            if (z) {
                LJI(pDPBenefitInfo, false);
                return;
            }
            return;
        }
        if (this.LJIIIIZZ == null && (c7938038e = this.LJII) != null) {
            C786410Ut5.G(c7938038e, 4);
        }
        CardView cardView = this.LJIIIIZZ;
        if (cardView != null) {
            C786410Ut5.LLILLL(cardView, 8);
        }
        View view = this.LJI;
        if (view != null) {
            C0NC7.LIZIZ(view, true, new AwS9S0220000_26(this, z, pDPBenefitInfo, z2, 0));
        }
    }
}
