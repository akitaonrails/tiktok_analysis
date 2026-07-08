package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.03u5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C990703u5 extends ConstraintLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public SmartImageView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public View LLIZ;
    public TuxIconView LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;

    private final TuxTextView getUsOrderSubmitAggregationOrderLogisticDescriptionChangeLineFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_order_logistic_description_change_line);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final View getUsOrderSubmitAggregationOrderLogisticDescriptionDividerFromXml() {
        View view = this.LLIZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.us_order_submit_aggregation_order_logistic_description_divider);
        this.LLIZ = viewFindViewById;
        return viewFindViewById;
    }

    private final TuxTextView getUsOrderSubmitAggregationOrderLogisticDescriptionFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_order_logistic_description);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final TuxTextView getUsOrderSubmitAggregationOrderLogisticDescriptionWithTitleIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_order_logistic_description_with_title_icon);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final TuxTextView getUsOrderSubmitAggregationOrderLogisticIconTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_order_logistic_icon_title);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final SmartImageView getUsOrderSubmitAggregationOrderLogisticImgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_order_logistic_img);
            this.LLILLL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    private final TuxIconView getUsOrderSubmitAggregationOrderLogisticSelectIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_order_logistic_select_icon);
            this.LLIZLLLIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    private final TuxTextView getUsOrderSubmitAggregationOrderLogisticTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.us_order_submit_aggregation_order_logistic_title);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void h0() {
        TuxTextView usOrderSubmitAggregationOrderLogisticTitleFromXml = getUsOrderSubmitAggregationOrderLogisticTitleFromXml();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(usOrderSubmitAggregationOrderLogisticTitleFromXml.getText());
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1p, usOrderSubmitAggregationOrderLogisticTitleFromXml.getContext())), 0, spannableStringBuilder.length(), 17);
        usOrderSubmitAggregationOrderLogisticTitleFromXml.setText(spannableStringBuilder);
        TuxTextView usOrderSubmitAggregationOrderLogisticIconTitleFromXml = getUsOrderSubmitAggregationOrderLogisticIconTitleFromXml();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(usOrderSubmitAggregationOrderLogisticIconTitleFromXml.getText());
        C786410Ut5.q2(spannableStringBuilder2, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1p, usOrderSubmitAggregationOrderLogisticIconTitleFromXml.getContext())), 0, spannableStringBuilder2.length(), 17);
        usOrderSubmitAggregationOrderLogisticIconTitleFromXml.setText(spannableStringBuilder2);
        TuxTextView usOrderSubmitAggregationOrderLogisticDescriptionFromXml = getUsOrderSubmitAggregationOrderLogisticDescriptionFromXml();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(usOrderSubmitAggregationOrderLogisticDescriptionFromXml.getText());
        C786410Ut5.q2(spannableStringBuilder3, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1p, usOrderSubmitAggregationOrderLogisticDescriptionFromXml.getContext())), 0, spannableStringBuilder3.length(), 17);
        usOrderSubmitAggregationOrderLogisticDescriptionFromXml.setText(spannableStringBuilder3);
        C786410Ut5.LJLLLLLL(8, getUsOrderSubmitAggregationOrderLogisticSelectIconFromXml());
        C21717219z0.LIZIZ(this);
    }

    public final void e0(LogisticPanelModule logisticPanelModule) {
        List<LogisticExpressionArea> list;
        LogisticExpressionArea logisticExpressionArea;
        final ECRichText eCRichText;
        Image icon;
        C03IT thumbFirstImageUrlModel;
        LogisticArea logisticArea = logisticPanelModule.logisticArea;
        if (logisticArea != null && (list = logisticArea.logisticExpressionAreas) != null && (logisticExpressionArea = (LogisticExpressionArea) C13LP.LJJJLL(list)) != null) {
            final SmartImageView usOrderSubmitAggregationOrderLogisticImgFromXml = getUsOrderSubmitAggregationOrderLogisticImgFromXml();
            TuxTextView usOrderSubmitAggregationOrderLogisticIconTitleFromXml = getUsOrderSubmitAggregationOrderLogisticIconTitleFromXml();
            final TuxTextView usOrderSubmitAggregationOrderLogisticTitleFromXml = getUsOrderSubmitAggregationOrderLogisticTitleFromXml();
            final View usOrderSubmitAggregationOrderLogisticDescriptionDividerFromXml = getUsOrderSubmitAggregationOrderLogisticDescriptionDividerFromXml();
            final TuxTextView usOrderSubmitAggregationOrderLogisticDescriptionFromXml = getUsOrderSubmitAggregationOrderLogisticDescriptionFromXml();
            final TuxTextView usOrderSubmitAggregationOrderLogisticDescriptionChangeLineFromXml = getUsOrderSubmitAggregationOrderLogisticDescriptionChangeLineFromXml();
            TuxTextView usOrderSubmitAggregationOrderLogisticDescriptionWithTitleIconFromXml = getUsOrderSubmitAggregationOrderLogisticDescriptionWithTitleIconFromXml();
            Icon icon2 = logisticExpressionArea.titleIcon;
            if (icon2 != null) {
                if (C960203pA.LIZIZ(getContext())) {
                    icon = icon2.getIconDark();
                } else {
                    icon = icon2.getIcon();
                }
                if (icon != null && (thumbFirstImageUrlModel = icon.toThumbFirstImageUrlModel()) != null) {
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(thumbFirstImageUrlModel);
                    c1331670kl3LIZLLL.LJJ(usOrderSubmitAggregationOrderLogisticImgFromXml);
                    C786410Ut5.h3(c1331670kl3LIZLLL);
                }
                C03DZ.LIZJ(usOrderSubmitAggregationOrderLogisticImgFromXml);
                C03DZ.LIZJ(usOrderSubmitAggregationOrderLogisticIconTitleFromXml);
                C03DZ.LIZ(usOrderSubmitAggregationOrderLogisticTitleFromXml);
                C03C8.LIZJ(usOrderSubmitAggregationOrderLogisticIconTitleFromXml, logisticExpressionArea.title, "us_aggregation_logistics_title", null);
            } else {
                C03DZ.LIZ(usOrderSubmitAggregationOrderLogisticImgFromXml);
                C03DZ.LIZ(usOrderSubmitAggregationOrderLogisticIconTitleFromXml);
                C03DZ.LIZJ(usOrderSubmitAggregationOrderLogisticTitleFromXml);
                C03C8.LIZJ(usOrderSubmitAggregationOrderLogisticTitleFromXml, logisticExpressionArea.title, "us_aggregation_logistics_title", null);
            }
            List<ECRichText> list2 = logisticExpressionArea.logisticsDescriptions;
            if (list2 != null && (eCRichText = (ECRichText) C13LP.LJJJLL(list2)) != null) {
                if (logisticExpressionArea.titleIcon != null) {
                    C03DZ.LIZJ(usOrderSubmitAggregationOrderLogisticDescriptionWithTitleIconFromXml);
                    C03DZ.LIZ(usOrderSubmitAggregationOrderLogisticDescriptionFromXml);
                    C03DZ.LIZ(usOrderSubmitAggregationOrderLogisticDescriptionDividerFromXml);
                    C03DZ.LIZ(usOrderSubmitAggregationOrderLogisticDescriptionChangeLineFromXml);
                    C03C8.LIZJ(usOrderSubmitAggregationOrderLogisticDescriptionWithTitleIconFromXml, eCRichText, "us_aggregation_logistics_des", null);
                    return;
                }
                C03DZ.LIZ(usOrderSubmitAggregationOrderLogisticDescriptionWithTitleIconFromXml);
                C786410Ut5.LLLLZLL(usOrderSubmitAggregationOrderLogisticDescriptionFromXml, 4);
                C03C8.LIZJ(usOrderSubmitAggregationOrderLogisticDescriptionFromXml, eCRichText, "us_aggregation_logistics_des", null);
                HandlerHook.viewPost(usOrderSubmitAggregationOrderLogisticDescriptionFromXml, new Runnable() { // from class: X.03u6
                    public final void LIZ() {
                        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("titleViewWidth = ");
                        sbLIZ.append(usOrderSubmitAggregationOrderLogisticTitleFromXml.getWidth());
                        sbLIZ.append(" , descriptionWidth = ");
                        sbLIZ.append(usOrderSubmitAggregationOrderLogisticDescriptionFromXml.getWidth());
                        sbLIZ.append(" , otherWidth = ");
                        sbLIZ.append(this.LLJI);
                        sbLIZ.append(" , screenWidth = ");
                        sbLIZ.append(this.LLJ);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c2341109Fh.getClass();
                        C2341109Fh.LJ(strLIZIZ);
                        if (usOrderSubmitAggregationOrderLogisticImgFromXml.getVisibility() == 8) {
                            int width = usOrderSubmitAggregationOrderLogisticTitleFromXml.getWidth() + usOrderSubmitAggregationOrderLogisticDescriptionFromXml.getWidth();
                            C990703u5 c990703u5 = this;
                            if (width + c990703u5.LLJI < c990703u5.LLJ) {
                                C03DZ.LIZJ(usOrderSubmitAggregationOrderLogisticDescriptionFromXml);
                                C03DZ.LIZJ(usOrderSubmitAggregationOrderLogisticDescriptionDividerFromXml);
                                C03DZ.LIZ(usOrderSubmitAggregationOrderLogisticDescriptionChangeLineFromXml);
                                return;
                            }
                        }
                        C03DZ.LIZJ(usOrderSubmitAggregationOrderLogisticDescriptionChangeLineFromXml);
                        C03DZ.LIZ(usOrderSubmitAggregationOrderLogisticDescriptionFromXml);
                        C03DZ.LIZ(usOrderSubmitAggregationOrderLogisticDescriptionDividerFromXml);
                        C03C8.LIZJ(usOrderSubmitAggregationOrderLogisticDescriptionChangeLineFromXml, eCRichText, "us_aggregation_logistics_des", null);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("USAggretationLogisticView@3abf.initLogistic$1$1$3$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("USAggretationLogisticView@3abf.initLogistic$1$1$3$1");
                    }
                });
                return;
            }
            C03DZ.LIZ(usOrderSubmitAggregationOrderLogisticDescriptionFromXml);
            C03DZ.LIZ(usOrderSubmitAggregationOrderLogisticDescriptionDividerFromXml);
            C03DZ.LIZ(usOrderSubmitAggregationOrderLogisticDescriptionChangeLineFromXml);
            C03DZ.LIZ(usOrderSubmitAggregationOrderLogisticDescriptionWithTitleIconFromXml);
        }
    }

    public final void setSelectIconVisibility(boolean z) {
        int i;
        TuxIconView usOrderSubmitAggregationOrderLogisticSelectIconFromXml = getUsOrderSubmitAggregationOrderLogisticSelectIconFromXml();
        if (usOrderSubmitAggregationOrderLogisticSelectIconFromXml != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, usOrderSubmitAggregationOrderLogisticSelectIconFromXml);
        }
    }

    public C990703u5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C990703u5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJ = C2132808Xe.LJ(context);
        this.LLJI = (int) ((context.getResources().getDisplayMetrics().density * 75.0f) + 0.5f);
        C03XA.LIZ.getClass();
        C03XA.LIZJ(context, R.layout.b1t, this, true);
    }
}
