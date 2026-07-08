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

/* JADX INFO: renamed from: X.184L, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C184L extends C185J<LinearLayout, C184N> {
    public C184N LIZLLL;
    public TuxTextView LJ;
    public SpannableStringBuilder LJFF;
    public int LJI;
    public int LJII;

    public C184L(LinearLayout linearLayout) {
        super(linearLayout);
        this.LJI = -1;
        this.LJII = -1;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJ(C184N c184n) {
        TuxTextView tuxTextView;
        int iIntValue;
        C786410Ut5.LJJJJJL((LinearLayout) this.LIZ);
        this.LJI = -1;
        this.LJII = -1;
        String str = null;
        this.LJFF = null;
        this.LIZLLL = c184n;
        TuxTextView tuxTextView2 = new TuxTextView(this.LIZJ, 0 == true ? 1 : 0, 6, 0);
        tuxTextView2.setTuxFont(71);
        tuxTextView2.setMaxLines(2);
        tuxTextView2.setTextColorRes(R.attr.a1k);
        ((ViewGroup) this.LIZ).addView(tuxTextView2, -1, -2);
        this.LJ = tuxTextView2;
        C184N c184n2 = this.LIZLLL;
        if (c184n2 != null) {
            PromotionLabel promotionLabel = c184n2.LIZ;
            if (promotionLabel != null) {
                str = promotionLabel.extraText;
            }
            if (C703302op.LIZ(str)) {
                if (a0.LJJIIZI(str, e3.h, false)) {
                    this.LJI = a0.LJJJ(str, e3.h, 0, false, 6);
                    this.LJII = a0.LJJJ(str, ")", 0, false, 6);
                } else {
                    this.LJI = a0.LJJJ(str, "（", 0, false, 6);
                    this.LJII = a0.LJJJ(str, "）", 0, false, 6);
                }
                int i = this.LJI;
                if (i >= 0) {
                    i++;
                }
                this.LJI = i;
            }
            if (C703302op.LIZ(str)) {
                this.LJFF = new SpannableStringBuilder(str);
            }
        }
        SpannableStringBuilder spannableStringBuilder = this.LJFF;
        if (spannableStringBuilder != null && (tuxTextView = this.LJ) != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            int iMin = Math.min(this.LJI, spannableStringBuilder.length() - 1);
            int iMin2 = Math.min(this.LJII, spannableStringBuilder.length() - 1);
            if (iMin >= 0 && iMin2 >= 0) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ww, this.LIZJ);
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
