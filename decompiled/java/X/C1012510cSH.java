package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.model.AnoleCommentBottomBannerModel;
import com.ss.android.ugc.aweme.model.CommentBottomBannerUIModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cSH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012510cSH extends AbstractC1014240cV4 {
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    public final AnoleCommentBottomBannerModel LJJ() {
        return (AnoleCommentBottomBannerModel) this.LLJLIL.getValue();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    public final Context LJJI() {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        return (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) ? this.LLILZ : activityLIZIZ;
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        ViewGroup viewGroup;
        AnoleCommentBottomBannerModel anoleCommentBottomBannerModelLJJ;
        String str;
        String str2;
        CommentBottomBannerUIModel commentBottomBannerUIModel;
        CommentBottomBannerUIModel commentBottomBannerUIModel2;
        String str3;
        CommentBottomBannerUIModel commentBottomBannerUIModel3;
        CommentBottomBannerUIModel commentBottomBannerUIModel4;
        CommentBottomBannerUIModel commentBottomBannerUIModel5;
        super.LJII(anoleComponentAppearModel);
        View view = this.LLJJIJIL;
        CharSequence charSequence = null;
        charSequence = null;
        charSequence = null;
        charSequence = null;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null && (anoleCommentBottomBannerModelLJJ = LJJ()) != null && anoleCommentBottomBannerModelLJJ.uiModel != null) {
            C20515215Pi c20515215Pi = new C20515215Pi(viewGroup);
            c20515215Pi.LJI(new AwS595S0100000_16(this, 82));
            AnoleCommentBottomBannerModel anoleCommentBottomBannerModelLJJ2 = LJJ();
            if (anoleCommentBottomBannerModelLJJ2 != null && (commentBottomBannerUIModel5 = anoleCommentBottomBannerModelLJJ2.uiModel) != null) {
                str = commentBottomBannerUIModel5.title;
            } else {
                str = null;
            }
            c20515215Pi.LIZ.LJ = str;
            AnoleCommentBottomBannerModel anoleCommentBottomBannerModelLJJ3 = LJJ();
            if (anoleCommentBottomBannerModelLJJ3 != null && (commentBottomBannerUIModel4 = anoleCommentBottomBannerModelLJJ3.uiModel) != null) {
                str2 = commentBottomBannerUIModel4.buttonText;
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.a1q, LJJI());
                if (numLIZ != null) {
                    int iIntValue = numLIZ.intValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    AnoleCommentBottomBannerModel anoleCommentBottomBannerModelLJJ4 = LJJ();
                    if (anoleCommentBottomBannerModelLJJ4 == null || (commentBottomBannerUIModel3 = anoleCommentBottomBannerModelLJJ4.uiModel) == null || (str3 = commentBottomBannerUIModel3.information) == null) {
                        str3 = "";
                    }
                    sbLIZ.append(str3);
                    sbLIZ.append(' ');
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(str2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), strLIZIZ.length(), strLIZIZ.length() + str2.length(), 17);
                    C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), strLIZIZ.length(), strLIZIZ.length() + str2.length(), 17);
                    charSequence = spannableStringBuilder;
                } else {
                    AnoleCommentBottomBannerModel anoleCommentBottomBannerModelLJJ5 = LJJ();
                    if (anoleCommentBottomBannerModelLJJ5 != null && (commentBottomBannerUIModel2 = anoleCommentBottomBannerModelLJJ5.uiModel) != null) {
                        charSequence = commentBottomBannerUIModel2.information;
                    }
                }
            } else {
                AnoleCommentBottomBannerModel anoleCommentBottomBannerModelLJJ6 = LJJ();
                if (anoleCommentBottomBannerModelLJJ6 != null && (commentBottomBannerUIModel = anoleCommentBottomBannerModelLJJ6.uiModel) != null) {
                    charSequence = commentBottomBannerUIModel.information;
                }
            }
            C1057450dcl c1057450dcl = c20515215Pi.LIZ;
            c1057450dcl.LJFF = charSequence;
            c1057450dcl.LIZJ = false;
            c1057450dcl.LJIILL = true;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            C1057450dcl c1057450dcl2 = c20515215Pi.LIZ;
            c1057450dcl2.LJIIIZ = iLIZIZ;
            c1057450dcl2.LJIILLIIL = true;
            C1003890cEN c1003890cEN = AbstractViewOnClickListenerC1003880cEM.LLILLL;
            AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16(this, 83);
            c1003890cEN.getClass();
            c20515215Pi.LIZ.LJIIJJI = new C1003560cDq(awS595S0100000_16);
            c20515215Pi.LIZ.LJIILJJIL = new AwS595S0100000_16(this, 84);
            c20515215Pi.LIZLLL();
            C1012500cSG c1012500cSG = (C1012500cSG) this.LLJLILLLLZIIL.getValue();
            if (c1012500cSG != null) {
                c1012500cSG.logAd((InterfaceC1023400cjq) c1012500cSG.LIZLLL.getValue());
            }
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Nk(AnoleComponentAppearModel anoleComponentAppearModel) {
        this.LLJJIJIL = new FrameLayout(LJJI());
        super.Nk(anoleComponentAppearModel);
    }

    public C1012510cSH(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 221));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS260S0300000_16(anoleComponentModel, c1009340cNA, this, 4));
    }
}
