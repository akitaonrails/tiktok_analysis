package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.model.ShowTextInfo;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Gud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430650Gud extends FrameLayout {
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public View LLILLL;
    public TuxIconView LLILZ;
    public TuxTextView LLILZIL;

    public final View getDividerExtraFromXml() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.fzc);
        this.LLILLL = viewFindViewById;
        return viewFindViewById;
    }

    public final TuxTextView getRatingNumberFullFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.srr);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getRatingNumberRealFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.srs);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getSalesFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tyl);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getStarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vx4);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final void LIZJ() {
        int i = (getSalesFromXml().getVisibility() == 0 || getStarFromXml().getVisibility() == 0) ? 0 : 8;
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
    }

    public final void setDividerExtraFromXml(View view) {
        this.LLILLL = view;
    }

    public final void setRatingNumberFullFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setRatingNumberRealFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setSales$ecommerce_video_release(long j) {
        int iLJJJ;
        if (j > 0) {
            C03DZ.LIZJ(this);
            C03DZ.LIZJ(getSalesFromXml());
            if (getRatingNumberRealFromXml().getVisibility() == 0) {
                C03DZ.LIZJ(getDividerExtraFromXml());
            }
            String strLIZ = C1843510y4b.LIZ(j);
            String strJ4 = C786410Ut5.j4(getContext().getResources().getString(2131832578), Arrays.copyOf(new Object[]{strLIZ}, 1));
            if (strJ4 != null && (iLJJJ = a0.LJJJ(strJ4, strLIZ, 0, false, 6)) >= 0) {
                TuxTextView salesFromXml = getSalesFromXml();
                SpannableString spannableString = new SpannableString(strJ4);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
                if (numLIZJ != null) {
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), iLJJJ, strLIZ.length() + iLJJJ, 33);
                }
                C786410Ut5.p2(spannableString, new C444920HcY(52, true), iLJJJ, strLIZ.length() + iLJJJ, 33);
                salesFromXml.setText(spannableString);
            }
        } else {
            C786410Ut5.LLLLZLL(getSalesFromXml(), 8);
            C786410Ut5.LJLLLLLL(8, getDividerExtraFromXml());
        }
        LIZJ();
    }

    public final void setSalesFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setStarFromXml(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public C430650Gud(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.auk, this, true);
    }

    public static void LIZ(C430650Gud c430650Gud, float f) {
        if (f == 0.0f) {
            C786410Ut5.LLLLLLZZ(c430650Gud.getStarFromXml(), 8);
            C786410Ut5.LJLLLLLL(8, c430650Gud.getDividerExtraFromXml());
            C786410Ut5.LLLLZLL(c430650Gud.getRatingNumberRealFromXml(), 8);
            C786410Ut5.LLLLZLL(c430650Gud.getRatingNumberFullFromXml(), 8);
        } else {
            C786410Ut5.LLLLLLZZ(c430650Gud.getStarFromXml(), 0);
            if (c430650Gud.getSalesFromXml().getVisibility() == 0) {
                C786410Ut5.LJLLLLLL(0, c430650Gud.getDividerExtraFromXml());
            }
            C786410Ut5.LLLLZLL(c430650Gud.getRatingNumberRealFromXml(), 0);
            C786410Ut5.LLLLZLL(c430650Gud.getRatingNumberFullFromXml(), 0);
            c430650Gud.getRatingNumberRealFromXml().setText(String.valueOf(f));
            TuxTextView ratingNumberFullFromXml = c430650Gud.getRatingNumberFullFromXml();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("/ ");
            sbLIZ.append(5);
            ratingNumberFullFromXml.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        c430650Gud.LIZJ();
    }

    public final void LIZIZ(ShowTextInfo showTextInfo, long j) {
        String str;
        int length;
        if (showTextInfo != null) {
            String str2 = showTextInfo.formatText;
            String str3 = showTextInfo.highlightText;
            int length2 = 0;
            if (str2 != null && !a0.LJJJIL(str2)) {
                C03DZ.LIZJ(this);
                C03DZ.LIZJ(getSalesFromXml());
                if (getRatingNumberRealFromXml().getVisibility() == 0) {
                    C03DZ.LIZJ(getDividerExtraFromXml());
                }
                if (str3 == null) {
                    str = "";
                } else {
                    str = str3;
                }
                int iLJJJ = a0.LJJJ(str2, str, 0, false, 6);
                if (iLJJJ >= 0) {
                    TuxTextView salesFromXml = getSalesFromXml();
                    SpannableString spannableString = new SpannableString(str2);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
                    if (numLIZJ != null) {
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
                        if (str3 != null) {
                            length = str3.length();
                        } else {
                            length = 0;
                        }
                        C786410Ut5.p2(spannableString, foregroundColorSpan, iLJJJ, length + iLJJJ, 33);
                    }
                    C444920HcY c444920HcY = new C444920HcY(52, true);
                    if (str3 != null) {
                        length2 = str3.length();
                    }
                    C786410Ut5.p2(spannableString, c444920HcY, iLJJJ, length2 + iLJJJ, 33);
                    salesFromXml.setText(spannableString);
                    return;
                }
                return;
            }
        }
        setSales$ecommerce_video_release(j);
    }
}
