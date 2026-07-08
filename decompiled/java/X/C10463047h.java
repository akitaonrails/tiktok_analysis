package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CombinedSalesVolume;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import g1c.AjS60S0100000_1;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.047h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10463047h extends ConstraintLayout {
    public ConstraintLayout LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public ConstraintLayout LLILZIL;
    public TuxTextView LLILZLL;
    public View LLIZ;
    public TuxIconView LLIZLLLIL;
    public LinearLayout LLJ;
    public TuxTextView LLJI;
    public C10462047g LLJIJIL;

    public final void setListener(InterfaceC10471047p interfaceC10471047p) {
    }

    public final LinearLayout getClGlobalShippingContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dw_);
            this.LLJ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final ConstraintLayout getClRatingReviewContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dy9);
            this.LL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final View getDivideLineFromXml() {
        View view = this.LLIZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.fyx);
        this.LLIZ = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView getRatingNumberFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.srq);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getReviewCountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tgb);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ConstraintLayout getSalesContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tyo);
            this.LLILZIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final TuxIconView getSalesCountInfoIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.typ);
            this.LLIZLLLIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getSalesCountTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tyq);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getStarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vx4);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getTtvGlobalShippingTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.yyb);
            this.LLJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final void setGlobalShipping(LinkRichText linkRichText) {
        if (linkRichText != null) {
            C786410Ut5.LJZL(0, getClGlobalShippingContainerFromXml());
            TuxTextView ttvGlobalShippingTextFromXml = getTtvGlobalShippingTextFromXml();
            C03DZ.LIZJ(ttvGlobalShippingTextFromXml);
            ttvGlobalShippingTextFromXml.setText(RichTextUtil.LJ(RichTextUtil.LIZ, ttvGlobalShippingTextFromXml.getContext(), linkRichText, null, 0, false, null, null, null, null, false, false, null, null, null, 16380));
            ttvGlobalShippingTextFromXml.setTextColor(linkRichText.LIZIZ(ttvGlobalShippingTextFromXml.getContext()));
            if (getRatingNumberFromXml().getVisibility() != 0 && getReviewCountFromXml().getVisibility() != 0 && getSalesContainerFromXml().getVisibility() != 0) {
                getClGlobalShippingContainerFromXml().setGravity(8388611);
                return;
            }
            return;
        }
        C786410Ut5.LJZL(8, getClGlobalShippingContainerFromXml());
        C786410Ut5.LLLLZLL(getTtvGlobalShippingTextFromXml(), 8);
    }

    private final void setGlobalShippingV2(ECRichText eCRichText) {
        if (eCRichText != null) {
            C786410Ut5.LJZL(0, getClGlobalShippingContainerFromXml());
            TuxTextView ttvGlobalShippingTextFromXml = getTtvGlobalShippingTextFromXml();
            C03DZ.LIZJ(ttvGlobalShippingTextFromXml);
            C03C8.LIZJ(ttvGlobalShippingTextFromXml, eCRichText, "PdpExtraInfoViewV2", null);
            if (getRatingNumberFromXml().getVisibility() != 0 && getReviewCountFromXml().getVisibility() != 0 && getSalesContainerFromXml().getVisibility() != 0) {
                getClGlobalShippingContainerFromXml().setGravity(8388611);
                return;
            }
            return;
        }
        C786410Ut5.LJZL(8, getClGlobalShippingContainerFromXml());
        C786410Ut5.LLLLZLL(getTtvGlobalShippingTextFromXml(), 8);
    }

    public final void e0(C10462047g c10462047g) {
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        C1076904Jb c1076904Jb;
        int i6;
        this.LLJIJIL = c10462047g;
        Float f = c10462047g.LIZ;
        Boolean bool = c10462047g.LJ;
        Boolean bool2 = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(bool, bool2);
        TuxTextView ratingNumberFromXml = getRatingNumberFromXml();
        int i7 = 0;
        if (f != null && !Intrinsics.LIZLLL(f, 0.0f) && zLJFF) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, ratingNumberFromXml);
        TuxIconView starFromXml = getStarFromXml();
        if (getRatingNumberFromXml().getVisibility() == 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, starFromXml);
        if (getRatingNumberFromXml().getVisibility() == 0 && f != null) {
            getRatingNumberFromXml().setText(String.valueOf(f.floatValue()));
        }
        getRatingNumberFromXml().setTuxFont(72);
        getRatingNumberFromXml().setTextColorRes(R.attr.a1h);
        C786410Ut5.I7(new AjS60S0100000_1(this, 82), getClRatingReviewContainerFromXml());
        Float f2 = c10462047g.LIZ;
        String str = c10462047g.LIZIZ;
        boolean zLJFF2 = Intrinsics.LJFF(c10462047g.LJ, bool2);
        TuxTextView reviewCountFromXml = getReviewCountFromXml();
        if (f2 != null && !Intrinsics.LIZLLL(f2, 0.0f) && C123100dR.LIZ(str) && zLJFF2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        C786410Ut5.LJLLLLLL(i3, reviewCountFromXml);
        if (getReviewCountFromXml().getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (str != null) {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_rating_replace_dot_with_parentheses", true, false)) {
                    TuxTextView reviewCountFromXml2 = getReviewCountFromXml();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('(');
                    sbLIZ.append(str);
                    sbLIZ.append(')');
                    reviewCountFromXml2.setText(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    TuxTextView reviewCountFromXml3 = getReviewCountFromXml();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("· ");
                    sbLIZ2.append(str);
                    reviewCountFromXml3.setText(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            getReviewCountFromXml().setTuxFont(71);
            getReviewCountFromXml().setTextColorRes(R.attr.a1j);
        }
        ConstraintLayout clRatingReviewContainerFromXml = getClRatingReviewContainerFromXml();
        Float f3 = c10462047g.LIZ;
        if (f3 != null && !Intrinsics.LIZLLL(f3, 0.0f) && C123100dR.LIZ(c10462047g.LIZIZ) && Intrinsics.LJFF(c10462047g.LJ, bool2)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        C786410Ut5.LJLLLLLL(i4, clRatingReviewContainerFromXml);
        CombinedSalesVolume combinedSalesVolume = c10462047g.LIZJ;
        boolean zLJFF3 = Intrinsics.LJFF(c10462047g.LIZLLL, bool2);
        InterfaceC10464047i interfaceC10464047i = c10462047g.LJI;
        PopUpMessage popUpMessage = c10462047g.LJIIJ;
        ConstraintLayout salesContainerFromXml = getSalesContainerFromXml();
        if (combinedSalesVolume != null && ((combinedSalesVolume.salesText != null || (combinedSalesVolume != null && combinedSalesVolume.salesTextECRichText != null)) && zLJFF3)) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        C786410Ut5.LJLLLLLL(i5, salesContainerFromXml);
        if (getSalesContainerFromXml().getVisibility() == 0) {
            if (combinedSalesVolume != null) {
                if (combinedSalesVolume.salesTextECRichText != null) {
                    C03C8.LIZJ(getSalesCountTextFromXml(), combinedSalesVolume.salesTextECRichText, "PdpExtraInfoViewV2", null);
                } else if (combinedSalesVolume != null && combinedSalesVolume.salesText != null) {
                    TuxTextView salesCountTextFromXml = getSalesCountTextFromXml();
                    RichTextUtil richTextUtil = RichTextUtil.LIZ;
                    LogisticLinkRichText logisticLinkRichText = combinedSalesVolume.salesText;
                    AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(379);
                    richTextUtil.getClass();
                    salesCountTextFromXml.setText(RichTextUtil.LIZ(logisticLinkRichText, this, aFwS228S0000000_1));
                }
            }
            getSalesCountTextFromXml().setTuxFont(71);
            getSalesCountTextFromXml().setTextColorRes(R.attr.a1j);
            View divideLineFromXml = getDivideLineFromXml();
            if (getReviewCountFromXml().getVisibility() != 0 && getRatingNumberFromXml().getVisibility() != 0) {
                i6 = 8;
            } else {
                i6 = 0;
            }
            C786410Ut5.LJLLLLLL(i6, divideLineFromXml);
            if (((Boolean) C04H2.LIZ.getValue()).booleanValue()) {
                C03DZ.LIZJ(getSalesCountInfoIconFromXml());
                if (interfaceC10464047i != null) {
                    interfaceC10464047i.LIZ();
                }
                C786410Ut5.I7(new AjS40S0200000_1(interfaceC10464047i, popUpMessage, 53), getSalesCountInfoIconFromXml());
            } else {
                C03DZ.LIZ(getSalesCountInfoIconFromXml());
            }
        }
        ECRichText eCRichText = c10462047g.LJIIIIZZ;
        if (eCRichText != null) {
            setGlobalShippingV2(eCRichText);
        } else {
            setGlobalShipping(c10462047g.LJII);
        }
        Iterable c1076804Ja = new C1076804Ja(this, 16);
        if ((c1076804Ja instanceof Collection) && ((Collection) c1076804Ja).isEmpty()) {
            i7 = 8;
            break;
        }
        Iterator it2 = c1076804Ja.iterator();
        do {
            c1076904Jb = (C1076904Jb) it2;
            if (!c1076904Jb.hasNext()) {
                i7 = 8;
                break;
            }
        } while (((View) c1076904Jb.next()).getVisibility() != 0);
        C786410Ut5.LJLLLLLL(i7, this);
    }

    public final void setClGlobalShippingContainerFromXml(LinearLayout linearLayout) {
        this.LLJ = linearLayout;
    }

    public final void setClRatingReviewContainerFromXml(ConstraintLayout constraintLayout) {
        this.LL = constraintLayout;
    }

    public final void setDivideLineFromXml(View view) {
        this.LLIZ = view;
    }

    public final void setRatingNumberFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setReviewCountFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setSalesContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILZIL = constraintLayout;
    }

    public final void setSalesCountInfoIconFromXml(TuxIconView tuxIconView) {
        this.LLIZLLLIL = tuxIconView;
    }

    public final void setSalesCountTextFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setStarFromXml(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setTtvGlobalShippingTextFromXml(TuxTextView tuxTextView) {
        this.LLJI = tuxTextView;
    }

    public C10463047h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C10463047h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aui, this, true);
        TuxTextView ratingNumberFromXml = getRatingNumberFromXml();
        if (ratingNumberFromXml != null) {
            C1748720vbi.LJFF(ratingNumberFromXml, new C10515049h(), new AwS545S0100000_1(this, 1588), new AwS580S0100000_1(this, 572));
        }
    }
}
