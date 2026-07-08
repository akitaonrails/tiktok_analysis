package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18QS, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C18QS extends TuxTextView {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public double LLJJJJ;
    public boolean LLJJJJJIL;

    public final double getLogoMaxHeight() {
        return this.LLJJJJ;
    }

    public final void setLogoMaxHeight(double d) {
        this.LLJJJJ = d;
    }

    public final void setVerticalCentered(boolean z) {
        this.LLJJJJJIL = z;
    }

    public C18QS(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C18QS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LogoTuxTextView);
        this.LLJJJJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LogoTuxTextView_logoMaxHeight, C0H9I.LIZ(-1.0d));
        this.LLJJJJJIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LogoTuxTextView_isVerticalCentered, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void LJJJJLI(CharSequence charSequence, List<String> list, Float f) {
        int lineHeight;
        Spanned spannedFromHtml;
        Object c416590GVd;
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                sb.append(C786410Ut5.j4("<img src='%s'>", Arrays.copyOf(new Object[]{it2.next()}, 1)));
            }
            sb.append(" ");
            sb.append(charSequence);
            String string = sb.toString();
            double d = this.LLJJJJ;
            if (d > 0.0d) {
                lineHeight = C814420VxA.LIZ(d);
            } else {
                lineHeight = getLineHeight();
            }
            if (Build.VERSION.SDK_INT >= 24) {
                spannedFromHtml = Html.fromHtml(string, 0, new C18QW(this, getContext(), this, lineHeight, f), null);
            } else {
                spannedFromHtml = Html.fromHtml(string, new C18QW(this, getContext(), this, lineHeight, f), null);
            }
            if (spannedFromHtml instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannedFromHtml;
                C089E c089e = new C089E(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ImageSpan.class));
                while (c089e.hasNext()) {
                    ImageSpan imageSpan = (ImageSpan) c089e.next();
                    int spanStart = spannableStringBuilder.getSpanStart(imageSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(imageSpan);
                    if (this.LLJJJJJIL) {
                        c416590GVd = new C416580GVc(imageSpan.getDrawable());
                    } else {
                        c416590GVd = new C416590GVd(imageSpan.getDrawable());
                    }
                    C786410Ut5.q2(spannableStringBuilder, c416590GVd, spanStart, spanEnd, 34);
                    spannableStringBuilder.removeSpan(imageSpan);
                }
            }
            setText(spannedFromHtml);
            return;
        }
        setText(charSequence);
    }

    public static void LJJJJJ(SpannableStringBuilder spannableStringBuilder, String str, int i, Integer num) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(i, false), length, spannableStringBuilder.length(), 17);
        if (num != null) {
            num.intValue();
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(num.intValue()), length, spannableStringBuilder.length(), 17);
        }
    }

    public void LJJJJL(String str, String str2, String str3, Float f) {
        int lineHeight;
        Spanned spannedFromHtml;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
        if (iLJJJ != -1) {
            int length = str2.length() + iLJJJ;
            spannableStringBuilder.append((CharSequence) str);
            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, length, 33);
        } else {
            spannableStringBuilder.append((CharSequence) str);
        }
        if (str3 != null && str3.length() > 0) {
            C03B3 c03b3 = new C03B3();
            c03b3.LIZ = Integer.valueOf(C679280Qkg.LIZ(1));
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "￼");
            C03B9.LIZ(spannableStringBuilder, c03b3, length2, spannableStringBuilder.length());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) C786410Ut5.j4("<img src='%s'>", Arrays.copyOf(new Object[]{str3}, 1)));
            String string = spannableStringBuilder2.toString();
            double d = this.LLJJJJ;
            if (d > 0.0d) {
                lineHeight = C814420VxA.LIZ(d);
            } else {
                lineHeight = getLineHeight();
            }
            if (Build.VERSION.SDK_INT >= 24) {
                spannedFromHtml = Html.fromHtml(string, 0, new C18QW(this, getContext(), this, lineHeight, f), null);
            } else {
                spannedFromHtml = Html.fromHtml(string, new C18QW(this, getContext(), this, lineHeight, f), null);
            }
            if (spannedFromHtml instanceof SpannableStringBuilder) {
                SpannableStringBuilder spannableStringBuilder3 = (SpannableStringBuilder) spannedFromHtml;
                C089E c089e = new C089E(spannableStringBuilder3.getSpans(0, spannableStringBuilder3.length(), ImageSpan.class));
                while (c089e.hasNext()) {
                    ImageSpan imageSpan = (ImageSpan) c089e.next();
                    C786410Ut5.q2(spannableStringBuilder3, new C416580GVc(imageSpan.getDrawable()), spannableStringBuilder3.getSpanStart(imageSpan), spannableStringBuilder3.getSpanEnd(imageSpan), 34);
                    spannableStringBuilder3.removeSpan(imageSpan);
                }
            }
            spannableStringBuilder.append((CharSequence) spannedFromHtml);
        }
        setText(spannableStringBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJJJLL(java.lang.CharSequence r21, java.util.List<com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel> r22, java.lang.Float r23, boolean r24, X.C18QX r25) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18QS.LJJJJLL(java.lang.CharSequence, java.util.List, java.lang.Float, boolean, X.18QX):void");
    }
}
