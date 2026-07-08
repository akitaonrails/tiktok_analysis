package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0H90, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H90 extends FrameLayout implements C0MO1 {
    public C427660Gpo LL;
    public C21415018rM LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxIconView LLILZ;
    public ConstraintLayout LLILZIL;
    public LinearLayout LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final C01GW LLJ;
    public int LLJI;
    public Integer LLJIJIL;

    public C0H90(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final C444830HcP getContentLayoutBuilder() {
        return (C444830HcP) this.LLJ.getValue();
    }

    public final C427660Gpo getAuthorAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bbz);
            this.LL = (C427660Gpo) callbackFindViewById;
        }
        return (C427660Gpo) callbackFindViewById;
    }

    public final TuxTextView getAuthorNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bc6);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getAuthorViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bcf);
            this.LLILZLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C21415018rM getCommentContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ea4);
            this.LLILLJJLI = (C21415018rM) callbackFindViewById;
        }
        return (C21415018rM) callbackFindViewById;
    }

    public final TuxIconView getQuotationFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sos);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final ConstraintLayout getStickerViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.w7q);
            this.LLILZIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    @Override // X.C0MO1
    public Rect getStickerViewRect() {
        Rect rect = new Rect();
        getStickerViewFromXml().getHitRect(rect);
        return rect;
    }

    @Override // X.C0MO1
    public int getActualCommentAreaHeight() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Layout textLayout = getCommentContentFromXml().getTextLayout();
        if (textLayout == null) {
            return getStickerViewFromXml().getMeasuredHeight();
        }
        int measuredHeight = getAuthorViewFromXml().getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getStickerViewFromXml().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = 0;
        int i2 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = getQuotationFromXml().getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i = marginLayoutParams.topMargin;
        }
        return measuredHeight + (i2 - i) + textLayout.getHeight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    }

    @Override // X.C0MO1
    public int getAreaHeight() {
        return getAuthorViewFromXml().getHeight() + getCommentContentFromXml().getHeight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    }

    public View getStickerView() {
        return getStickerViewFromXml();
    }

    public final void setAuthorAvatarFromXml(C427660Gpo c427660Gpo) {
        this.LL = c427660Gpo;
    }

    public final void setAuthorNameFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    @Override // X.C0MO1
    public void setAuthorNameMaxWidth(int i) {
        this.LLIZ = i;
    }

    @Override // X.C0MO1
    public void setAuthorNameTuxFont(int i) {
        getAuthorNameFromXml().setTuxFont(i);
    }

    public final void setAuthorViewFromXml(LinearLayout linearLayout) {
        this.LLILZLL = linearLayout;
    }

    @Override // X.C0MO1
    public void setAvatarVisible(boolean z) {
        int i;
        C427660Gpo authorAvatarFromXml = getAuthorAvatarFromXml();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, authorAvatarFromXml);
        if (!z) {
            C0H9H.LJFF(0, getAuthorNameFromXml());
        }
    }

    public final void setCommentContentFromXml(C21415018rM c21415018rM) {
        this.LLILLJJLI = c21415018rM;
    }

    @Override // X.C0MO1
    public void setCommentMaxWidth(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setQuotationFromXml(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setStickerViewFromXml(ConstraintLayout constraintLayout) {
        this.LLILZIL = constraintLayout;
    }

    public final void LIZ(Comment comment, Function1<? super Boolean, Unit> function1) {
        int iIntValue;
        int measuredWidth;
        if (comment == null) {
            return;
        }
        C444830HcP contentLayoutBuilder = getContentLayoutBuilder();
        contentLayoutBuilder.LJIILIIL(comment.getText());
        int i = this.LLIZLLLIL;
        C444840HcQ c444840HcQ = contentLayoutBuilder.LIZIZ;
        c444840HcQ.LIZLLL = i;
        c444840HcQ.LIZJ = 1073741824;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ef, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        contentLayoutBuilder.LJIILJJIL(iIntValue);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        C444840HcQ c444840HcQ2 = contentLayoutBuilder.LIZIZ;
        c444840HcQ2.LJII = truncateAt;
        c444840HcQ2.LJIIIZ = TextDirectionHeuristics.LOCALE;
        boolean z = C444830HcP.LJIIJJI;
        Layout layoutLIZJ = C444830HcP.LIZJ(contentLayoutBuilder, 0.0f, false, C431830GwX.LIZ(getContentLayoutBuilder(), this.LLJIJIL, Integer.valueOf(this.LLJI)), 27);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("comment demo height = ");
        sbLIZ.append(layoutLIZJ.getHeight());
        C2188811AlT.LIZIZ(sbLIZ);
        getCommentContentFromXml().setTextLayout(layoutLIZJ);
        User user = comment.getUser();
        if (user != null) {
            if (function1 == null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(user.getAvatarThumb()));
                c1331670kl3LJIIIIZZ.LJJ(getAuthorAvatarFromXml());
                c1331670kl3LJIIIIZZ.LJIIJJI();
            } else {
                C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(user.getAvatarThumb()));
                c1331670kl3LJIIIIZZ2.LIZLLL("load_comment_post_avatar");
                c1331670kl3LJIIIIZZ2.LJJIIJ(new C0ID4(this, function1, 0));
            }
            TuxTextView authorNameFromXml = getAuthorNameFromXml();
            String nickname = user.getNickname();
            if (nickname == null && (nickname = user.getUniqueId()) == null) {
                nickname = "";
            }
            Integer numValueOf = Integer.valueOf(this.LLIZ);
            if (numValueOf != null) {
                measuredWidth = numValueOf.intValue();
            } else {
                measuredWidth = authorNameFromXml.getMeasuredWidth();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("width = ");
            sbLIZ2.append(measuredWidth);
            C2188811AlT.LIZIZ(sbLIZ2);
            String string = authorNameFromXml.getContext().getString(2131824808, nickname);
            float f = measuredWidth;
            if (authorNameFromXml.getPaint().measureText(string) > f) {
                float fMeasureText = authorNameFromXml.getPaint().measureText(authorNameFromXml.getContext().getString(2131824808, "..."));
                int i2 = 0;
                int i3 = 0;
                while (i2 < nickname.length()) {
                    nickname.charAt(i2);
                    int i4 = i3 + 1;
                    if (authorNameFromXml.getPaint().measureText(nickname.substring(0, i3)) + fMeasureText > f) {
                        C1360520lVa c1360520lVa = new C1360520lVa();
                        Context context = authorNameFromXml.getContext();
                        Object[] objArr = new Object[1];
                        C1360520lVa c1360520lVa2 = new C1360520lVa();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        int i5 = i3 - 1;
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        sbLIZ3.append(nickname.substring(0, i5));
                        sbLIZ3.append("...");
                        c1360520lVa2.LIZLLL(C2188811AlT.LIZIZ(sbLIZ3));
                        objArr[0] = c1360520lVa2.LIZ;
                        c1360520lVa.LIZ.append((CharSequence) context.getString(2131824808, objArr));
                        authorNameFromXml.setText(c1360520lVa.LIZ);
                        return;
                    }
                    i2++;
                    i3 = i4;
                }
                return;
            }
            C1360520lVa c1360520lVa3 = new C1360520lVa();
            c1360520lVa3.LIZ.append((CharSequence) string);
            authorNameFromXml.setText(c1360520lVa3.LIZ);
        }
    }

    public final void LIZJ(int i, int i2) {
        TuxIconView quotationFromXml = getQuotationFromXml();
        if (!C426750GoL.LIZLLL(getContext())) {
            i = -i;
        }
        C786410Ut5.Uc(quotationFromXml, i);
        if (C426750GoL.LIZLLL(getContext())) {
            C786410Ut5.Fb(getQuotationFromXml(), 180.0f);
        }
        C0H9H.LJI(i2, getQuotationFromXml());
    }

    public final void LIZLLL(int i, int i2) {
        TuxIconView quotationFromXml = getQuotationFromXml();
        quotationFromXml.setIconWidth(i);
        quotationFromXml.setIconHeight(i2);
    }

    public C0H90(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLIZ = (int) (((((C418440Gaw.LIZLLL(context) * 0.54f) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) * 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))) - 1);
        this.LLIZLLLIL = (int) ((C418440Gaw.LIZLLL(context) * 0.54f) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) * 2));
        this.LLJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(29));
        this.LLJI = 12;
        C786410Ut5.LJLLJ(context, R.layout.a19, this);
        getAuthorAvatarFromXml().setForeground(null);
    }

    public final void LIZIZ(int i, int i2, int i3) {
        C427660Gpo authorAvatarFromXml = getAuthorAvatarFromXml();
        C1351950lHl.LJIL(authorAvatarFromXml, i);
        C1351950lHl.LJIJI(i2, authorAvatarFromXml);
        C0H9H.LJFF(i3, getAuthorNameFromXml());
    }

    public final void LJ(int i, int i2, int i3) {
        C0H9H.LJI(i2, getStickerViewFromXml());
        C0H9H.LJFF(i, getStickerViewFromXml());
        C0H9H.LIZLLL(i3, getStickerViewFromXml());
    }

    public final void LJFF(int i, int i2, int i3, Integer num) {
        C444830HcP contentLayoutBuilder = getContentLayoutBuilder();
        contentLayoutBuilder.LJII(i);
        contentLayoutBuilder.LJIIIZ(i2);
        this.LLJI = i3;
        this.LLJIJIL = num;
    }
}
