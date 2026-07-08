package X;

import android.animation.Animator;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1858, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1858 extends C185J<LinearLayout, C185V> {
    public C212334187o LIZLLL;
    public TuxTextView LJ;
    public TuxTextView LJFF;
    public C185V LJI;
    public int LJII;
    public SpannableStringBuilder LJIIIIZZ;
    public SpannableStringBuilder LJIIIZ;
    public final String LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public String LJIILIIL;
    public Long LJIILJJIL;
    public AnonymousClass1853 LJIILL;
    public final C19LV LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C01GW LJIJ;

    public final void LJIIJJI() {
        C185V c185v = this.LJI;
        if (c185v != null) {
            FlashSaleAtmosphere flashSaleAtmosphere = c185v.LIZ.flashSaleAtmosphere;
            String str = flashSaleAtmosphere != null ? flashSaleAtmosphere.preheatText : null;
            if (C703302op.LIZ(str)) {
                if (a0.LJJIIZI(str, e3.h, false)) {
                    this.LJIIJJI = a0.LJJJ(str, e3.h, 0, false, 6);
                    this.LJIIL = a0.LJJJ(str, ")", 0, false, 6);
                } else {
                    this.LJIIJJI = a0.LJJJ(str, "（", 0, false, 6);
                    this.LJIIL = a0.LJJJ(str, "）", 0, false, 6);
                }
                int i = this.LJIIJJI;
                if (i >= 0) {
                    i++;
                }
                this.LJIIJJI = i;
            }
            if (C703302op.LIZ(str)) {
                this.LJIIIIZZ = new SpannableStringBuilder(str);
            }
        }
    }

    public final int LJIIL() {
        Integer numLIZJ = C1308910kAL.LIZJ(C0A0F.LIZ() ? R.attr.a1j : R.attr.a1k, this.LIZJ);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }

    public AnonymousClass1858(LinearLayout linearLayout) {
        super(linearLayout);
        this.LJII = -2;
        this.LJIIJ = "888:888";
        this.LJIIJJI = -1;
        this.LJIIL = -1;
        this.LJIILJJIL = 0L;
        this.LJIILLIIL = new C19LV(this, 3);
        this.LJIIZILJ = C452501pT.LIZIZ(new AwS576S0100000_32(linearLayout, 519));
        this.LJIJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 520));
    }

    @Override // X.C185J
    public final boolean LJIIIZ(boolean z) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVisible = ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        return super.LJIIIZ(z);
    }

    public final void LJIIJ(int i) {
        C212334187o c212334187o;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeState newState = ");
        sbLIZ.append(i);
        sbLIZ.append(", origin state = ");
        sbLIZ.append(this.LJII);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (this.LJII == i) {
            return;
        }
        this.LJII = i;
        C185V c185v = this.LJI;
        if (c185v != null) {
            int i2 = 0;
            int i3 = 6;
            AttributeSet attributeSet = null;
            if (i != 1) {
                if (i != 2) {
                    C2341109Fh.LIZJ("changeState but state error");
                    return;
                }
                C786410Ut5.LJJJJJL((LinearLayout) this.LIZ);
                TuxTextView tuxTextView = this.LJFF;
                if (tuxTextView != null) {
                    tuxTextView.removeOnLayoutChangeListener(this.LJIILLIIL);
                }
                this.LJFF = null;
                ((ViewGroup) this.LIZ).addView((View) this.LJIIZILJ.getValue(), -1, -2);
                ((C212252184k) this.LJIJ.getValue()).LJIILL(new C212257184p(c185v.LJ, c185v.LIZJ, c185v.LIZLLL, false, 32));
                C212249184h<ViewGroup> c212249184h = ((AbstractC212248184g) this.LJIJ.getValue()).LJI;
                if (c212249184h != null && (c212334187o = c212249184h.LJIIIZ) != null) {
                    c212334187o.setPromotionTextEllipsize(TextUtils.TruncateAt.END);
                } else {
                    c212334187o = null;
                }
                this.LIZLLL = c212334187o;
                TuxTextView tuxTextView2 = new TuxTextView(this.LIZJ, attributeSet, i3, i2);
                tuxTextView2.setSingleLine(true);
                tuxTextView2.setTuxFont(81);
                tuxTextView2.setTextColorRes(R.attr.a1k);
                ViewGroup viewGroup = (ViewGroup) this.LIZ;
                C19ME c19me = new C19ME(-2, -2);
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = tuxTextView2.getContext().getResources().getDimensionPixelOffset(R.dimen.us);
                viewGroup.addView(tuxTextView2, c19me);
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
                this.LJ = tuxTextView2;
                FlashSaleAtmosphereStock flashSaleAtmosphereStock = c185v.LIZ.flashSaleAtmosphereStock;
                if (flashSaleAtmosphereStock == null) {
                    return;
                }
                LJIILJJIL(flashSaleAtmosphereStock, null);
                return;
            }
            C786410Ut5.LJJJJJL((LinearLayout) this.LIZ);
            this.LIZLLL = null;
            this.LJ = null;
            this.LJIIJJI = -1;
            this.LJIIL = -1;
            this.LJIIIZ = null;
            this.LJIIIIZZ = null;
            TuxTextView tuxTextView3 = new TuxTextView(this.LIZJ, attributeSet, i3, i2);
            tuxTextView3.setTuxFont(71);
            tuxTextView3.setTextColor(LJIIL());
            tuxTextView3.setMaxLines(2);
            LJIIJJI();
            SpannableStringBuilder spannableStringBuilder = this.LJIIIIZZ;
            if (spannableStringBuilder != null) {
                tuxTextView3.setText(spannableStringBuilder);
            }
            ((ViewGroup) this.LIZ).addView(tuxTextView3, -1, -2);
            tuxTextView3.addOnLayoutChangeListener(this.LJIILLIIL);
            TuxTextView tuxTextView4 = this.LJFF;
            if (tuxTextView4 != null) {
                tuxTextView4.removeOnLayoutChangeListener(this.LJIILLIIL);
            }
            this.LJFF = tuxTextView3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:23:0x0069, B:25:0x0071, B:26:0x0075, B:20:0x005e, B:22:0x0064), top: B:40:0x005e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.lang.String r11) {
        /*
            r10 = this;
            r10.LJIILIIL = r11
            android.text.SpannableStringBuilder r8 = r10.LJIIIZ
            if (r8 == 0) goto Lbc
            com.bytedance.tux.input.TuxTextView r5 = r10.LJFF
            if (r5 == 0) goto Lbc
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r8)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r4.append(r0)
            r0.append(r11)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            int r0 = r10.LJIIL()
            r1.<init>(r0)
            int r0 = r4.length()
            r7 = 0
            r6 = 18
            X.C786410Ut5.q2(r4, r1, r7, r0, r6)
            int r1 = r10.LJIIJJI
            int r0 = r8.length()
            r2 = 1
            int r0 = r0 - r2
            int r3 = java.lang.Math.min(r1, r0)
            int r1 = r10.LJIIL
            int r0 = r8.length()
            int r0 = r0 - r2
            int r2 = java.lang.Math.min(r1, r0)
            if (r3 < 0) goto Lb7
            if (r2 < 0) goto Lb7
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            X.185V r0 = r10.LJI
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereInfo r0 = r0.LIZ
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereResource r0 = r0.flashSaleAtmosphereResource
            if (r0 == 0) goto L5c
            java.lang.String r1 = r0.preheatHighlightTextColor
        L56:
            r9 = 2131100452(0x7f060324, float:1.7813286E38)
            if (r1 == 0) goto L69
            goto L5e
        L5c:
            r1 = 0
            goto L56
        L5e:
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L69
            int r0 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Throwable -> L7f
            goto L75
        L69:
            android.content.Context r0 = r10.LIZJ     // Catch: java.lang.Throwable -> L7f
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r9, r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L7d
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L7f
        L75:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L7f
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L7f
            goto L8b
        L7d:
            r0 = 0
            goto L75
        L7f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L8b:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r1)
            if (r0 == 0) goto La1
            android.content.Context r0 = r10.LIZJ
            java.lang.Integer r0 = X.C1308910kAL.LIZJ(r9, r0)
            if (r0 == 0) goto Lbd
            int r0 = r0.intValue()
        L9d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        La1:
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            r8.<init>(r0)
            X.C786410Ut5.q2(r4, r8, r3, r2, r6)
            X.0HcY r1 = new X.0HcY
            r0 = 72
            r1.<init>(r0, r7)
            X.C786410Ut5.q2(r4, r1, r3, r2, r6)
        Lb7:
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r5.setText(r4, r0)
        Lbc:
            return
        Lbd:
            r0 = 0
            goto L9d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1858.LJIILIIL(java.lang.String):void");
    }

    public final void LJIILJJIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock, List<Animator> list) {
        Integer numValueOf;
        AnonymousClass1853 anonymousClass1853;
        C181I popCardViewCallback;
        String string;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        TuxTextView tuxTextView = this.LJ;
        Integer numValueOf2 = null;
        if (tuxTextView != null) {
            numValueOf = Integer.valueOf(tuxTextView.getVisibility());
        } else {
            numValueOf = null;
        }
        if (flashSaleAtmosphereStock != null) {
            numValueOf2 = Integer.valueOf(flashSaleAtmosphereStock.activityStockStatus);
        }
        boolean z = false;
        if (numValueOf2 != null && numValueOf2.intValue() == 2) {
            if (flashSaleAtmosphereStock.activityStock > 0 && !flashSaleAtmosphereStock.LIZ()) {
                TuxTextView tuxTextView2 = this.LJ;
                if (tuxTextView2 != null) {
                    if ((numValueOf == null || numValueOf.intValue() != 0) && (anonymousClass1853 = this.LJIILL) != null && (popCardViewCallback = anonymousClass1853.getPopCardViewCallback()) != null) {
                        popCardViewCallback.LJII(anonymousClass1853.LLLI.LJFF);
                    }
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                    C185V c185v = this.LJI;
                    if (c185v != null && (flashSaleAtmosphereInfo = c185v.LIZ) != null && flashSaleAtmosphereInfo.creatorLimitType == 2) {
                        string = u.LJJIFFI(this.LIZJ.getString(2131832643), "{{number}}", String.valueOf(flashSaleAtmosphereStock.activityStock), false);
                    } else {
                        string = this.LIZJ.getString(2131832646, Integer.valueOf(flashSaleAtmosphereStock.activityStock));
                    }
                    tuxTextView2.setText(string);
                }
            } else {
                TuxTextView tuxTextView3 = this.LJ;
                if (tuxTextView3 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView3, 8);
                    if (numValueOf != null) {
                        numValueOf.intValue();
                    }
                }
            }
        } else {
            TuxTextView tuxTextView4 = this.LJ;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 8);
                if (numValueOf != null) {
                    numValueOf.intValue();
                }
            }
        }
        C212334187o c212334187o = this.LIZLLL;
        if (c212334187o != null) {
            if (flashSaleAtmosphereStock != null && flashSaleAtmosphereStock.LIZ()) {
                z = true;
            }
            c212334187o.LIZ(this.LJIILJJIL, list, z);
        }
    }
}
