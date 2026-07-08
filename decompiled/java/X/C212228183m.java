package X;

import android.animation.Animator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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

/* JADX INFO: renamed from: X.183m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212228183m extends AbstractC212220183e<ViewGroup, C212235183t> {
    public C212334187o LJ;
    public TuxTextView LJFF;
    public TuxTextView LJI;
    public C212235183t LJII;
    public int LJIIIIZZ;
    public SpannableStringBuilder LJIIIZ;
    public SpannableStringBuilder LJIIJ;
    public final String LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public String LJIILJJIL;
    public Long LJIILL;
    public C212219183d LJIILLIIL;
    public int LJIIZILJ;
    public final C19LV LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public final C01GW LJIL;

    public final C184W LJIIL() {
        return (C184W) this.LJIJJ.getValue();
    }

    public final C184W LJIILIIL() {
        return (C184W) this.LJIL.getValue();
    }

    public C212228183m(ViewGroup viewGroup) {
        super(viewGroup, "live_exclusive_layout");
        this.LJIIIIZZ = -2;
        this.LJIIJJI = "888:888";
        this.LJIIL = -1;
        this.LJIILIIL = -1;
        this.LJIILL = 0L;
        this.LJIJ = new C19LV(this, 5);
        this.LJIJI = C452501pT.LIZIZ(new AwS576S0100000_32(viewGroup, 649));
        this.LJIJJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 650));
        this.LJIJJLI = C452501pT.LIZIZ(new AwS576S0100000_32(viewGroup, 651));
        this.LJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 652));
    }

    @Override // X.AbstractC212220183e
    public final boolean LJIIJ(boolean z) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setVisible = ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        return super.LJIIJ(z);
    }

    public final void LJIIJJI(int i) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeState newState = ");
        sbLIZ.append(i);
        sbLIZ.append(", origin state = ");
        sbLIZ.append(this.LJIIIIZZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (this.LJIIIIZZ == i) {
            return;
        }
        this.LJIIIIZZ = i;
        C212235183t c212235183t = this.LJII;
        if (c212235183t != null) {
            LJIILJJIL(c212235183t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    public final void LJIILJJIL(C212235183t c212235183t) {
        C212334187o c212334187o;
        this.LJII = c212235183t;
        int i = this.LJIIIIZZ;
        String str = null;
        if (i != 1) {
            if (i != 2) {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LIZJ("changeState but state error");
                return;
            }
            TuxTextView tuxTextView = this.LJI;
            if (tuxTextView != null) {
                tuxTextView.removeOnLayoutChangeListener(this.LJIJ);
            }
            this.LJI = null;
            C786410Ut5.LJJJJI((ViewGroup) this.LIZ);
            if (C288750BTl.LIZ()) {
                ViewGroup viewGroup = (ViewGroup) this.LIZ;
                View view = (View) this.LJIJI.getValue();
                C14L8 c14l8 = new C14L8(-1);
                c14l8.LIZ = 10;
                viewGroup.addView(view, c14l8);
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.LIZ;
                C18L9 c18l9 = (C18L9) this.LJIJI.getValue();
                c18l9.setChildHorizontalMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                viewGroup2.addView(c18l9, -1, -2);
            }
            LJIIL().LJIIZILJ(new C212244184c(c212235183t.LJFF, c212235183t.LIZLLL, c212235183t.LJ, 40));
            C184X<ViewGroup> c184x = LJIIL().LJII;
            if (c184x != null && (c212334187o = c184x.LJIIJ) != null) {
                c212334187o.setPromotionTextEllipsize(TextUtils.TruncateAt.END);
            } else {
                c212334187o = null;
            }
            this.LJ = c212334187o;
            ?? LJI = LJIIL().LJI();
            ?? r6 = LJI;
            if (LJI < c212235183t.LIZ) {
                if (C288750BTl.LIZ()) {
                    ViewGroup viewGroup3 = (ViewGroup) this.LIZ;
                    View view2 = (View) this.LJIJJLI.getValue();
                    C14L8 c14l82 = new C14L8(-1);
                    c14l82.LIZ = 20;
                    viewGroup3.addView(view2, c14l82);
                } else {
                    ViewGroup viewGroup4 = (ViewGroup) this.LIZ;
                    C18L9 c18l92 = (C18L9) this.LJIJJLI.getValue();
                    c18l92.setChildHorizontalMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    C19ME c19me = new C19ME(-1, -2);
                    ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
                    viewGroup4.addView(c18l92, c19me);
                }
                LJIILIIL().LJIIZILJ(new C212244184c(c212235183t.LJI, c212235183t.LIZLLL, c212235183t.LJ, 56));
                r6 = LJI;
                if (LJIILIIL().LJI()) {
                    r6 = LJI + 1;
                }
            }
            if (r6 >= c212235183t.LIZ) {
                return;
            }
            TuxTextView tuxTextView2 = new TuxTextView(this.LIZLLL, null, 6, 0);
            tuxTextView2.setSingleLine(true);
            tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView2.setTuxFont(81);
            tuxTextView2.setTextColorRes(R.attr.a1k);
            ViewGroup viewGroup5 = (ViewGroup) this.LIZ;
            C19ME c19me2 = new C19ME(-2, -2);
            ((ViewGroup.MarginLayoutParams) c19me2).topMargin = tuxTextView2.getContext().getResources().getDimensionPixelOffset(R.dimen.uo);
            viewGroup5.addView(tuxTextView2, c19me2);
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
            this.LJFF = tuxTextView2;
            FlashSaleAtmosphereStock flashSaleAtmosphereStock = c212235183t.LIZIZ.flashSaleAtmosphereStock;
            if (flashSaleAtmosphereStock == null) {
                return;
            }
            LJIILLIIL(flashSaleAtmosphereStock, null);
            return;
        }
        C786410Ut5.LJJJJI((ViewGroup) this.LIZ);
        this.LJ = null;
        this.LJFF = null;
        this.LJIIL = -1;
        this.LJIILIIL = -1;
        this.LJIIJ = null;
        this.LJIIIZ = null;
        TuxTextView tuxTextView3 = new TuxTextView(this.LIZLLL, null, 6, 0);
        tuxTextView3.setTuxFont(81);
        tuxTextView3.setMaxLines(2);
        C212235183t c212235183t2 = this.LJII;
        if (c212235183t2 != null) {
            FlashSaleAtmosphere flashSaleAtmosphere = c212235183t2.LIZIZ.flashSaleAtmosphere;
            if (flashSaleAtmosphere != null) {
                str = flashSaleAtmosphere.preheatText;
            }
            if (C703302op.LIZ(str)) {
                if (a0.LJJIIZI(str, e3.h, false)) {
                    this.LJIIL = a0.LJJJ(str, e3.h, 0, false, 6);
                    this.LJIILIIL = a0.LJJJ(str, ")", 0, false, 6);
                } else {
                    this.LJIIL = a0.LJJJ(str, "（", 0, false, 6);
                    this.LJIILIIL = a0.LJJJ(str, "）", 0, false, 6);
                }
                int i2 = this.LJIIL;
                if (i2 >= 0) {
                    i2++;
                }
                this.LJIIL = i2;
            }
            if (C703302op.LIZ(str)) {
                this.LJIIIZ = new SpannableStringBuilder(str);
            }
        }
        SpannableStringBuilder spannableStringBuilder = this.LJIIIZ;
        if (spannableStringBuilder != null) {
            tuxTextView3.setText(spannableStringBuilder);
        }
        if (C288750BTl.LIZ()) {
            ViewGroup viewGroup6 = (ViewGroup) this.LIZ;
            C14L8 c14l83 = new C14L8(-1);
            c14l83.LIZ = 40;
            viewGroup6.addView(tuxTextView3, c14l83);
        } else {
            ((ViewGroup) this.LIZ).addView(tuxTextView3, -1, -2);
        }
        tuxTextView3.addOnLayoutChangeListener(this.LJIJ);
        TuxTextView tuxTextView4 = this.LJI;
        if (tuxTextView4 != null) {
            tuxTextView4.removeOnLayoutChangeListener(this.LJIJ);
        }
        this.LJI = tuxTextView3;
    }

    public final void LJIILL(String str) {
        TuxTextView tuxTextView;
        int iIntValue;
        int i;
        int iIntValue2;
        this.LJIILJJIL = str;
        SpannableStringBuilder spannableStringBuilder = this.LJIIJ;
        if (spannableStringBuilder != null && (tuxTextView = this.LJI) != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) str);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, this.LIZLLL);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            C786410Ut5.q2(spannableStringBuilder2, new ForegroundColorSpan(iIntValue), 0, spannableStringBuilder2.length(), 18);
            int iMin = Math.min(this.LJIIL, spannableStringBuilder.length() - 1);
            int iMin2 = Math.min(this.LJIILIIL, spannableStringBuilder.length() - 1);
            if (iMin >= 0 && iMin2 >= 0) {
                Context context = this.LIZLLL;
                if (this.LJIIZILJ == 1) {
                    i = R.attr.a1q;
                } else {
                    i = R.attr.ww;
                }
                Integer numLIZJ2 = C1308910kAL.LIZJ(i, context);
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                C786410Ut5.q2(spannableStringBuilder2, new ForegroundColorSpan(iIntValue2), iMin, iMin2, 18);
                C786410Ut5.q2(spannableStringBuilder2, new C444920HcY(82, false), iMin, iMin2, 18);
            }
            tuxTextView.setText(spannableStringBuilder2, TextView.BufferType.SPANNABLE);
        }
    }

    public final void LJIILLIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock, List<Animator> list) {
        Integer numValueOf;
        C212219183d c212219183d;
        InterfaceC212166181c popCardViewCallback;
        String string;
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo;
        C212235183t c212235183t;
        TuxTextView tuxTextView = this.LJFF;
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
            if (flashSaleAtmosphereStock.activityStock > 0 && (!flashSaleAtmosphereStock.LIZ() || ((c212235183t = this.LJII) != null && c212235183t.LJII == 1))) {
                TuxTextView tuxTextView2 = this.LJFF;
                if (tuxTextView2 != null) {
                    if ((numValueOf == null || numValueOf.intValue() != 0) && (c212219183d = this.LJIILLIIL) != null && (popCardViewCallback = c212219183d.getPopCardViewCallback()) != null) {
                        popCardViewCallback.LJII(c212219183d.LLJZ.LJFF);
                    }
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                    C212235183t c212235183t2 = this.LJII;
                    if (c212235183t2 != null && (flashSaleAtmosphereInfo = c212235183t2.LIZIZ) != null && flashSaleAtmosphereInfo.creatorLimitType == 2) {
                        string = u.LJJIFFI(this.LIZLLL.getString(2131832643), "{{number}}", String.valueOf(flashSaleAtmosphereStock.activityStock), false);
                    } else {
                        string = this.LIZLLL.getString(2131832646, Integer.valueOf(flashSaleAtmosphereStock.activityStock));
                    }
                    tuxTextView2.setText(string);
                }
            } else {
                TuxTextView tuxTextView3 = this.LJFF;
                if (tuxTextView3 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView3, 8);
                    if (numValueOf != null) {
                        numValueOf.intValue();
                    }
                }
            }
        } else {
            TuxTextView tuxTextView4 = this.LJFF;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 8);
                if (numValueOf != null) {
                    numValueOf.intValue();
                }
            }
        }
        C212334187o c212334187o = this.LJ;
        if (c212334187o != null) {
            if (flashSaleAtmosphereStock != null && flashSaleAtmosphereStock.LIZ()) {
                z = true;
            }
            c212334187o.LIZ(this.LJIILL, list, z);
        }
    }
}
