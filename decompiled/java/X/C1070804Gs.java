package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: renamed from: X.04Gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1070804Gs extends FrameLayout {
    public static final int LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(13));
    public final ConstraintLayout LL;
    public final TuxTextView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxIconView LLILZ;
    public final View LLILZIL;
    public final C16F2 LLILZLL;
    public final TuxTextView LLIZ;
    public InterfaceC1071504Gz LLIZLLLIL;
    public C04H0 LLJ;

    public final void LIZ() {
        int i = 0;
        if (this.LLILLJJLI.getVisibility() != 0 && this.LLILZ.getVisibility() != 0) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, this);
    }

    public final void setRatingListener(InterfaceC1071504Gz interfaceC1071504Gz) {
        this.LLIZLLLIL = interfaceC1071504Gz;
    }

    public final void setSales(CombinedSalesVolume combinedSalesVolume) {
        String str;
        if (combinedSalesVolume != null) {
            if (combinedSalesVolume.salesText == null && combinedSalesVolume.salesTextECRichText == null) {
                C03DZ.LIZ(this.LL);
                C03DZ.LIZ(this.LLILLJJLI);
                C03DZ.LIZ(this.LLILLL);
            } else {
                C03DZ.LIZJ(this.LL);
                C03DZ.LIZJ(this);
                C03DZ.LIZJ(this.LLILLJJLI);
                ECRichText eCRichText = combinedSalesVolume.salesTextECRichText;
                SpannableStringBuilder spannableStringBuilderLIZ = null;
                if (eCRichText != null) {
                    C03C8.LIZJ(this.LLILLJJLI, eCRichText, "PdpExtraInfoView", null);
                } else {
                    if (C1071004Gu.LIZIZ().LIZ()) {
                        this.LLILLJJLI.setTextColorRes(R.attr.a1j);
                    }
                    TuxTextView tuxTextView = this.LLILLJJLI;
                    LogisticLinkRichText logisticLinkRichText = combinedSalesVolume.salesText;
                    if (logisticLinkRichText != null) {
                        RichTextUtil richTextUtil = RichTextUtil.LIZ;
                        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(378);
                        richTextUtil.getClass();
                        spannableStringBuilderLIZ = RichTextUtil.LIZ(logisticLinkRichText, this, aFwS228S0000000_1);
                    }
                    tuxTextView.setText(spannableStringBuilderLIZ);
                }
                if (!((Boolean) C04H2.LIZ.getValue()).booleanValue() && ((str = combinedSalesVolume.sales_specification_schema) == null || str.length() == 0)) {
                    C03DZ.LIZ(this.LLILLL);
                } else {
                    C03DZ.LIZJ(this.LLILLL);
                    if (C1071004Gu.LIZIZ().LIZ()) {
                        this.LLILLL.setTintColorRes(R.attr.a1j);
                    } else {
                        this.LLILLL.setTintColorRes(R.attr.a1k);
                    }
                    C04H0 c04h0 = this.LLJ;
                    if (c04h0 != null) {
                        c04h0.LIZIZ();
                    }
                    C786410Ut5.I7(new AjS60S0100000_1(this, 36), this.LLILLL);
                }
            }
        }
        LIZ();
    }

    public final void setSalesInfoListener(C04H0 c04h0) {
        this.LLJ = c04h0;
    }

    public C1070804Gs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1755600vmo.LIZ.getClass();
        C1755600vmo.LIZ(R.layout.ass, context, this, true, false);
        this.LL = (ConstraintLayout) findViewById(R.id.tyo);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.tyl);
        this.LLILLL = (TuxIconView) findViewById(R.id.tyr);
        this.LLILZ = (TuxIconView) findViewById(R.id.vx4);
        this.LLILZIL = findViewById(R.id.fzc);
        this.LLILZLL = (C16F2) findViewById(R.id.srq);
        this.LLIZ = (TuxTextView) findViewById(R.id.tgb);
    }
}
