package X;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18QT, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C18QT extends C18QS {
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public Spanned LLJLIL;

    public final void LJJJLZIJ() {
        Spanned spanned = this.LLJLIL;
        if (spanned instanceof SpannableStringBuilder) {
            C089E c089e = new C089E(((SpannableStringBuilder) spanned).getSpans(0, spanned.length(), ImageSpan.class));
            while (c089e.hasNext()) {
                ImageSpan imageSpan = (ImageSpan) c089e.next();
                C786410Ut5.q2((SpannableStringBuilder) this.LLJLIL, this.LLJJJJJIL ? new C416580GVc(imageSpan.getDrawable()) : new C416590GVd(imageSpan.getDrawable()), ((SpannableStringBuilder) this.LLJLIL).getSpanStart(imageSpan), ((SpannableStringBuilder) this.LLJLIL).getSpanEnd(imageSpan), 34);
                ((SpannableStringBuilder) this.LLJLIL).removeSpan(imageSpan);
            }
        }
        setText(this.LLJLIL);
    }

    public C18QT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJLIL = new SpannableStringBuilder();
    }

    @Override // X.C18QS
    public final void LJJJJLI(CharSequence charSequence, List<String> list, Float f) {
        int lineHeight;
        Spanned spannedFromHtml;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_live_pop_card_title_use_logotuxtextview_setting", false)) {
            super.LJJJJLI(charSequence, list, f);
            return;
        }
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                sb.append(C786410Ut5.j4("<img src='%s'>", Arrays.copyOf(new Object[]{it2.next()}, 1)));
            }
            sb.append(" ");
            sb.append(charSequence);
            String string = sb.toString();
            if (getLogoMaxHeight() > 0.0d) {
                lineHeight = C814420VxA.LIZ(getLogoMaxHeight());
            } else {
                lineHeight = getLineHeight();
            }
            if (Build.VERSION.SDK_INT >= 24) {
                spannedFromHtml = Html.fromHtml(string, 0, new C18QV(this, getContext(), this, lineHeight, f), null);
            } else {
                spannedFromHtml = Html.fromHtml(string, new C18QV(this, getContext(), this, lineHeight, f), null);
            }
            this.LLJLIL = spannedFromHtml;
            int size = list.size();
            this.LLJJLIIIJLLLLLLLZ = size;
            this.LLJL = 0;
            if (!this.LLJJL) {
                LJJJLZIJ();
                this.LLJJL = true;
                return;
            } else {
                if (size != 0) {
                    return;
                }
                LJJJLZIJ();
                return;
            }
        }
        setText(charSequence);
    }

    @Override // X.C18QS
    public final void LJJJJL(String str, String str2, String str3, Float f) {
        int i;
        int lineHeight;
        Spanned spannedFromHtml;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_live_pop_card_title_use_logotuxtextview_setting", false)) {
            super.LJJJJL(str, str2, str3, f);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        this.LLJJLIIIJLLLLLLLZ = i;
        this.LLJL = 0;
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
            if (getLogoMaxHeight() > 0.0d) {
                lineHeight = C814420VxA.LIZ(getLogoMaxHeight());
            } else {
                lineHeight = getLineHeight();
            }
            if (Build.VERSION.SDK_INT >= 24) {
                spannedFromHtml = Html.fromHtml(string, 0, new C18QV(this, getContext(), this, lineHeight, f), null);
            } else {
                spannedFromHtml = Html.fromHtml(string, new C18QV(this, getContext(), this, lineHeight, f), null);
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
        this.LLJLIL = spannableStringBuilder;
        if (!this.LLJJL) {
            LJJJLZIJ();
            this.LLJJL = true;
        } else {
            if (this.LLJJLIIIJLLLLLLLZ != 0) {
                return;
            }
            LJJJLZIJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    @Override // X.C18QS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLL(java.lang.CharSequence r27, java.util.List<com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel> r28, java.lang.Float r29, boolean r30, X.C18QX r31) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18QT.LJJJJLL(java.lang.CharSequence, java.util.List, java.lang.Float, boolean, X.18QX):void");
    }
}
