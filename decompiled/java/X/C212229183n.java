package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.183n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212229183n extends AbstractC212220183e<LinearLayout, AnonymousClass1848> {
    public AnonymousClass1848 LJ;
    public TuxTextView LJFF;
    public SpannableStringBuilder LJI;
    public int LJII;
    public int LJIIIIZZ;

    public C212229183n(LinearLayout linearLayout) {
        super(linearLayout, "exclusive_price_preheat_layout");
        this.LJII = -1;
        this.LJIIIIZZ = -1;
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

    public final void LJIIJJI(AnonymousClass1848 anonymousClass1848) {
        TuxTextView tuxTextView;
        int iIntValue;
        C786410Ut5.LJJJJJL((LinearLayout) this.LIZ);
        this.LJII = -1;
        this.LJIIIIZZ = -1;
        String str = null;
        this.LJI = null;
        this.LJ = anonymousClass1848;
        TuxTextView tuxTextView2 = new TuxTextView(this.LIZLLL, null, 6, 0);
        tuxTextView2.setTuxFont(71);
        tuxTextView2.setMaxLines(2);
        tuxTextView2.setTextColorRes(R.attr.a1k);
        ((ViewGroup) this.LIZ).addView(tuxTextView2, -1, -2);
        this.LJFF = tuxTextView2;
        AnonymousClass1848 anonymousClass18482 = this.LJ;
        if (anonymousClass18482 != null) {
            PromotionLabel promotionLabel = anonymousClass18482.LIZ;
            if (promotionLabel != null) {
                str = promotionLabel.extraText;
            }
            if (C703302op.LIZ(str)) {
                if (a0.LJJIIZI(str, e3.h, false)) {
                    this.LJII = a0.LJJJ(str, e3.h, 0, false, 6);
                    this.LJIIIIZZ = a0.LJJJ(str, ")", 0, false, 6);
                } else {
                    this.LJII = a0.LJJJ(str, "（", 0, false, 6);
                    this.LJIIIIZZ = a0.LJJJ(str, "）", 0, false, 6);
                }
                int i = this.LJII;
                if (i >= 0) {
                    i++;
                }
                this.LJII = i;
            }
            if (C703302op.LIZ(str)) {
                this.LJI = new SpannableStringBuilder(str);
            }
        }
        SpannableStringBuilder spannableStringBuilder = this.LJI;
        if (spannableStringBuilder != null && (tuxTextView = this.LJFF) != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            int iMin = Math.min(this.LJII, spannableStringBuilder.length() - 1);
            int iMin2 = Math.min(this.LJIIIIZZ, spannableStringBuilder.length() - 1);
            if (iMin >= 0 && iMin2 >= 0) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ww, this.LIZLLL);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                C786410Ut5.q2(spannableStringBuilder2, new ForegroundColorSpan(iIntValue), iMin, iMin2, 18);
                C786410Ut5.q2(spannableStringBuilder2, new C444920HcY(72, false), iMin, iMin2, 18);
            }
            tuxTextView.setText(spannableStringBuilder2, TextView.BufferType.SPANNABLE);
        }
    }
}
