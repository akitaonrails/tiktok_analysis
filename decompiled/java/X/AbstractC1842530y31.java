package X;

import Y.ARunnableS127S0100000_27;
import Y.ARunnableS12S1400000_26;
import Y.ARunnableS59S0300000_26;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorRankingEntranceIntegrationSetting;
import com.bytedance.android.livesdk.livesetting.rank.RankEntranceMarqueeInterval;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.android.livesdk.rank.api.RankAnimationType;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y31, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1842530y31 {
    public final CardView LIZ;
    public final C1842430y2r LIZIZ;
    public final CardView LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final CardView LJFF;
    public final LinearLayout LJI;
    public final ImageView LJII;
    public final TextView LJIIIIZZ;
    public final ViewGroup LJIIIZ;
    public final View LJIIJ;
    public final LinearLayout LJIIJJI;
    public final ImageView LJIIL;
    public final TextView LJIILIIL;
    public final LinearLayout LJIILJJIL;
    public final ImageView LJIILL;
    public final C1844320y5u LJIILLIIL;
    public final ViewStub LJIIZILJ;
    public ViewGroup LJIJ;
    public ImageView LJIJI;
    public ViewGroup LJIJJ;
    public TextView LJIJJLI;
    public TextView LJIL;
    public TextView LJJ;
    public TextView LJJI;
    public ViewGroup LJJIFFI;
    public boolean LJJII;
    public AnonymousClass0956 LJJIII;
    public final long LJJIIJ = 4000;
    public final long LJJIIJZLJL = 3000;

    public void LIZ() {
    }

    public void LJIIIZ(C1842470y2v c1842470y2v, C1842470y2v c1842470y2v2) {
    }

    public final void LIZIZ() {
        C1091250eVH c1091250eVHInvoke = this.LIZIZ.LJ.invoke();
        if (c1091250eVHInvoke == null || !c1091250eVHInvoke.getEnableFixedSize()) {
            return;
        }
        c1091250eVHInvoke.LLJ.run();
    }

    public final ViewGroup LIZLLL() {
        ViewGroup viewGroup = this.LJIJ;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    public final TextView LJ() {
        TextView textView = this.LJIJJLI;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    public final TextView LJFF() {
        TextView textView = this.LJIL;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    public final TextView LJI() {
        TextView textView = this.LJJ;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    public final void LJII() {
        ViewStub viewStub = this.LJIIZILJ;
        if ((viewStub != null ? viewStub.getParent() : null) == null) {
            this.LJIJ = (ViewGroup) this.LIZ.findViewById(R.id.pgq);
            this.LJIJI = (ImageView) this.LIZ.findViewById(R.id.pgs);
            this.LJIJJ = (ViewGroup) this.LIZ.findViewById(R.id.xmq);
            this.LJIJJLI = (TextView) this.LIZ.findViewById(R.id.pgv);
            this.LJIL = (TextView) this.LIZ.findViewById(R.id.pgw);
            this.LJJ = (TextView) this.LIZ.findViewById(R.id.ph0);
            this.LJJI = (TextView) this.LIZ.findViewById(R.id.ph1);
            this.LIZ.findViewById(R.id.ltr);
            this.LJJIFFI = (ViewGroup) this.LIZ.findViewById(R.id.i8i);
            return;
        }
        View viewLJLLLL = C786410Ut5.LJLLLL(this.LJIIZILJ);
        this.LJIJ = (ViewGroup) viewLJLLLL.findViewById(R.id.pgq);
        this.LJIJI = (ImageView) viewLJLLLL.findViewById(R.id.pgs);
        this.LJIJJ = (ViewGroup) viewLJLLLL.findViewById(R.id.xmq);
        this.LJIJJLI = (TextView) viewLJLLLL.findViewById(R.id.pgv);
        this.LJIL = (TextView) viewLJLLLL.findViewById(R.id.pgw);
        this.LJJ = (TextView) viewLJLLLL.findViewById(R.id.ph0);
        this.LJJI = (TextView) viewLJLLLL.findViewById(R.id.ph1);
        viewLJLLLL.findViewById(R.id.ltr);
        this.LJJIFFI = (ViewGroup) viewLJLLLL.findViewById(R.id.i8i);
    }

    public void LJIIJJI() {
        C786410Ut5.LJZL(0, this.LJIIJJI);
        C786410Ut5.W4(this.LJIIJJI, 1.0f);
        C786410Ut5.LJZL(8, this.LJIILJJIL);
        C786410Ut5.W4(this.LJIILJJIL, 1.0f);
        C786410Ut5.LLILLL(this.LJFF, 8);
        C786410Ut5.b5(this.LJFF, 1.0f);
        C786410Ut5.W4(this.LJI, 1.0f);
    }

    public final void LJIIZILJ() {
        if (!this.LIZIZ.LIZIZ.d()) {
            C1842430y2r c1842430y2r = this.LIZIZ;
            if (!c1842430y2r.LJIJJLI || c1842430y2r.LJJII) {
                return;
            }
            ARunnableS127S0100000_27 aRunnableS127S0100000_27 = c1842430y2r.LJJIFFI;
            if (aRunnableS127S0100000_27 != null) {
                c1842430y2r.LJJ.removeCallbacks(aRunnableS127S0100000_27);
            }
            C1842470y2v c1842470y2v = c1842430y2r.LJIIZILJ;
            if (c1842470y2v != null) {
                if (c1842430y2r.LJJIFFI == null) {
                    c1842430y2r.LJJIFFI = new ARunnableS127S0100000_27(c1842430y2r, c1842470y2v, 46);
                }
                ARunnableS127S0100000_27 aRunnableS127S0100000_272 = c1842430y2r.LJJIFFI;
                if (aRunnableS127S0100000_272 != null) {
                    C786410Ut5.LJLIIL(RankEntranceMarqueeInterval.INSTANCE.getValue(), c1842430y2r.LJJ, aRunnableS127S0100000_272);
                    return;
                }
                return;
            }
            return;
        }
        C1842430y2r c1842430y2r2 = this.LIZIZ;
        if (c1842430y2r2.LJJII) {
            return;
        }
        ARunnableS127S0100000_27 aRunnableS127S0100000_273 = c1842430y2r2.LJJI;
        if (aRunnableS127S0100000_273 != null) {
            c1842430y2r2.LJJ.removeCallbacks(aRunnableS127S0100000_273);
        }
        if (c1842430y2r2.LJIIZILJ != null) {
            if (c1842430y2r2.LJJI == null) {
                c1842430y2r2.LJJI = new ARunnableS127S0100000_27(c1842430y2r2, 45);
            }
            ARunnableS127S0100000_27 aRunnableS127S0100000_274 = c1842430y2r2.LJJI;
            if (aRunnableS127S0100000_274 != null) {
                BPEAHandler bPEAHandler = c1842430y2r2.LJJ;
                long j = c1842430y2r2.LJI;
                if (j <= 0) {
                    j = LiveCreatorRankingEntranceIntegrationSetting.getValue().loopIntervalMs;
                }
                C786410Ut5.LJLIIL(j, bPEAHandler, aRunnableS127S0100000_274);
            }
        }
    }

    public static void LJIIJ(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void LJIILIIL(boolean z) {
        C1300480jwk c1300480jwkLIZIZ;
        if (z) {
            this.LIZIZ.LJIL = this;
            this.LJJII = false;
            return;
        }
        if (!(this instanceof C1842830y3V) && !(this instanceof C1843220y48) && !(this instanceof C1843210y47)) {
            C1842430y2r c1842430y2r = this.LIZIZ;
            if (c1842430y2r.LJIJJLI) {
                C1842470y2v c1842470y2v = c1842430y2r.LJIIZILJ;
                if (c1842470y2v != null) {
                    this.LJIILIIL.setText(c1842470y2v.LIZIZ);
                    LJIIL(this, this.LJIIL, c1842470y2v, false, false, 12);
                }
                LJIILJJIL(this.LIZ, -2);
                LJIILJJIL(this.LIZJ, -2);
                LJIILJJIL(this.LJFF, -2);
                LJIILJJIL(this.LJIIIZ, -2);
            }
        }
        LJIIJJI();
        C1842430y2r c1842430y2r2 = this.LIZIZ;
        c1842430y2r2.LJIL = null;
        c1842430y2r2.LIZIZ.LIZ();
        if (!(this instanceof C1842550y33) && (c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("rank_anim")) != null) {
            c1300480jwkLIZIZ.stop();
        }
        this.LIZIZ.LIZ.LIZJ().LJJIJIIJI = false;
        LJIIZILJ();
        C1842430y2r c1842430y2r3 = this.LIZIZ;
        c1842430y2r3.LJIJJLI = true;
        c1842430y2r3.LJIJ = null;
        C1842470y2v c1842470y2v2 = c1842430y2r3.LJIIZILJ;
        if (c1842470y2v2 != null) {
            RankAnimationInfo rankAnimationInfo = c1842470y2v2.LJI;
            if (rankAnimationInfo != null) {
                rankAnimationInfo.type = RankAnimationType.LIZLLL.type;
            }
            c1842470y2v2.LJIIIIZZ = null;
        }
        c1842430y2r3.LJIILLIIL = c1842470y2v2;
        c1842430y2r3.LIZJ();
    }

    public AbstractC1842530y31(CardView cardView, C1842430y2r c1842430y2r) {
        this.LIZ = cardView;
        this.LIZIZ = c1842430y2r;
        this.LIZJ = (CardView) cardView.findViewById(R.id.sqp);
        this.LIZLLL = cardView.findViewById(R.id.sqq);
        this.LJ = cardView.findViewById(R.id.sr8);
        this.LJFF = (CardView) cardView.findViewById(R.id.sq_);
        this.LJI = (LinearLayout) cardView.findViewById(R.id.sqd);
        this.LJII = (ImageView) cardView.findViewById(R.id.sqa);
        this.LJIIIIZZ = (TextView) cardView.findViewById(R.id.sqc);
        this.LJIIIZ = (ViewGroup) cardView.findViewById(R.id.sqb);
        this.LJIIJ = cardView.findViewById(R.id.ws5);
        this.LJIIJJI = (LinearLayout) cardView.findViewById(R.id.nd4);
        this.LJIIL = (ImageView) cardView.findViewById(R.id.lss);
        this.LJIILIIL = (TextView) cardView.findViewById(R.id.tv_ranking_entrance_text);
        this.LJIILJJIL = (LinearLayout) cardView.findViewById(R.id.nas);
        this.LJIILL = (ImageView) cardView.findViewById(R.id.lsr);
        this.LJIILLIIL = (C1844320y5u) cardView.findViewById(R.id.tv_ranking_entrance_animation_text);
        this.LJIIZILJ = (ViewStub) cardView.findViewById(R.id.pgu);
    }

    public static EnumC1843060y3s LIZJ(C1842470y2v c1842470y2v, C1842470y2v c1842470y2v2) {
        RankTypeV2 rankTypeV2;
        RankTypeV2 rankTypeV22;
        C1810410xDD c1810410xDD;
        C1810410xDD c1810410xDD2 = c1842470y2v.LJIIIIZZ;
        if (c1810410xDD2 == null || (rankTypeV2 = c1810410xDD2.LIZIZ) == null) {
            rankTypeV2 = c1842470y2v.LIZ.LIZIZ;
        }
        if (c1842470y2v2 != null && (c1810410xDD = c1842470y2v2.LIZ) != null) {
            rankTypeV22 = c1810410xDD.LIZIZ;
        } else {
            rankTypeV22 = null;
        }
        if (Intrinsics.LJFF(rankTypeV2, rankTypeV22)) {
            return EnumC1843060y3s.ANIMATION_FOR_SAME_RANKING_TYPE;
        }
        return EnumC1843060y3s.ANIMATION_FOR_DIFFERENT_RANKING_TYPE;
    }

    public static void LJIILJJIL(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        C786410Ut5.W5(view, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C1842470y2v r15, X.C1842470y2v r16) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1842530y31.LJIIIIZZ(X.0y2v, X.0y2v):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x01ca, code lost:
    
        if (r0 != null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01d1, code lost:
    
        if (r0 != null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01d3, code lost:
    
        r0 = r0.LJFF;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x001e A[PHI: r0
      0x001e: PHI (r0v4 X.0xDD) = (r0v2 X.0xDD), (r0v68 X.0xDD) binds: [B:146:0x01e9, B:16:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030 A[PHI: r0 r5
      0x0030: PHI (r0v6 X.0xDD) = (r0v3 X.0xDD), (r0v66 X.0xDD) binds: [B:141:0x01de, B:25:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r5v5 X.0xEo) = (r5v1 X.0xEo), (r5v11 X.0xEo) binds: [B:141:0x01de, B:25:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIL(X.AbstractC1842530y31 r7, android.widget.ImageView r8, X.C1842470y2v r9, boolean r10, boolean r11, int r12) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1842530y31.LJIIL(X.0y31, android.widget.ImageView, X.0y2v, boolean, boolean, int):void");
    }

    public final void LJIILL(EnumC1842640y3C enumC1842640y3C, TextView textView, String str, long j, InterfaceC1704110uRl interfaceC1704110uRl, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        C20441214yg.LIZIZ("Ranking Entrance Unification", "IAnimationProcessor - startMarqueeForUnifiedEntrance");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stringBuilder: ");
        sbLIZ.append((Object) spannableStringBuilder);
        sbLIZ.append(", duration: ");
        sbLIZ.append(j);
        sbLIZ.append(", isNotFromLoop: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ));
        C20441214yg.LIZIZ("Ranking Entrance Unification", "Marquee START");
        this.LJJII = false;
        int i = C1842630y3B.LIZ[enumC1842640y3C.ordinal()];
        if (i != 1) {
            if (i == 2) {
                String string = spannableStringBuilder.toString();
                textView.setText(spannableStringBuilder);
                textView.postOnAnimation(new ARunnableS12S1400000_26(textView, this, spannableStringBuilder, string, interfaceC1704110uRl, 1));
                return;
            }
            throw new C1954807lC();
        }
        textView.setText(spannableStringBuilder);
        textView.postOnAnimation(new ARunnableS59S0300000_26(textView, this, interfaceC1704110uRl, 4));
    }
}
