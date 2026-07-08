package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.IconModel;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.RightsInfo;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.TextConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.0w5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767360w5m extends FrameLayout {
    public final LinearLayout LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;

    public C1767360w5m(Context context) {
        super(context, null, 0);
        View viewLIZIZ = C21146717pB.LIZIZ(context, R.layout.bp2, this, false);
        addView(viewLIZIZ);
        this.LL = (LinearLayout) C435210H4t.LIZ(R.id.eqx, viewLIZIZ);
        this.LLILLJJLI = (SmartImageView) C435210H4t.LIZ(R.id.ld6, viewLIZIZ);
        this.LLILLL = (TuxTextView) C435210H4t.LIZ(R.id.zhr, viewLIZIZ);
    }

    public final void LIZ(RightsInfo rightsInfo) {
        Object objLJJJLZIJ;
        int iIntValue;
        int iIntValue2;
        Integer num;
        IconModel iconModel;
        Integer num2;
        Integer num3;
        Integer num4;
        List<String> list;
        String str;
        LinearLayout linearLayout;
        int color;
        int i;
        Integer num5;
        Object objLJJJLZIJ2;
        int iIntValue3;
        int iIntValue4;
        Integer num6;
        IconModel iconModel2;
        Integer num7;
        Integer num8;
        Integer num9;
        List<String> list2;
        String str2;
        LinearLayout linearLayout2;
        String str3 = "";
        String str4 = null;
        int i2 = 0;
        if (C467860IWi.LIZ(getContext())) {
            TextConfig textConfig = rightsInfo.textConfig;
            if (textConfig != null && (str2 = textConfig.bgDarkColor) != null && str2.length() > 0 && (linearLayout2 = this.LL) != null) {
                linearLayout2.setBackgroundColor(ColorProtector.parseColor(str2));
            }
            IconModel iconModel3 = rightsInfo.darkIcon;
            if (iconModel3 == null || (list2 = iconModel3.urlList) == null || (objLJJJLZIJ2 = C13LP.LJJJLZIJ(0, list2)) == null) {
                objLJJJLZIJ2 = "";
            }
            IconModel iconModel4 = rightsInfo.darkIcon;
            if (iconModel4 != null && (num9 = iconModel4.height) != null) {
                iIntValue3 = num9.intValue();
            } else {
                iIntValue3 = 1;
            }
            IconModel iconModel5 = rightsInfo.darkIcon;
            if (iconModel5 != null && (num8 = iconModel5.width) != null) {
                iIntValue4 = num8.intValue();
            } else {
                iIntValue4 = 1;
            }
            int i3 = iIntValue3 / iIntValue4;
            IconModel iconModel6 = rightsInfo.darkIcon;
            if (iconModel6 != null && (num6 = iconModel6.height) != null && num6.intValue() > 0 && (iconModel2 = rightsInfo.darkIcon) != null && (num7 = iconModel2.width) != null && num7.intValue() > 0) {
                int iLIZIZ = C0H9H.LIZIZ(16) * i3;
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(objLJJJLZIJ2);
                c1331670kl3LIZLLL.LJJ(this.LLILLJJLI);
                C786410Ut5.h3(c1331670kl3LIZLLL);
                SmartImageView smartImageView = this.LLILLJJLI;
                if (smartImageView != null) {
                    ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                    layoutParams.width = C0H9H.LIZIZ(16);
                    layoutParams.height = iLIZIZ;
                    C786410Ut5.G6(smartImageView, layoutParams);
                }
            } else {
                SmartImageView smartImageView2 = this.LLILLJJLI;
                if (smartImageView2 != null) {
                    C786410Ut5.LLFF(8, smartImageView2);
                }
            }
        } else {
            TextConfig textConfig2 = rightsInfo.textConfig;
            if (textConfig2 != null && (str = textConfig2.bgColor) != null && str.length() > 0 && (linearLayout = this.LL) != null) {
                linearLayout.setBackgroundColor(ColorProtector.parseColor(str));
            }
            IconModel iconModel7 = rightsInfo.lightIcon;
            if (iconModel7 == null || (list = iconModel7.urlList) == null || (objLJJJLZIJ = C13LP.LJJJLZIJ(0, list)) == null) {
                objLJJJLZIJ = "";
            }
            IconModel iconModel8 = rightsInfo.darkIcon;
            if (iconModel8 != null && (num4 = iconModel8.height) != null) {
                iIntValue = num4.intValue();
            } else {
                iIntValue = 1;
            }
            IconModel iconModel9 = rightsInfo.darkIcon;
            if (iconModel9 != null && (num3 = iconModel9.width) != null) {
                iIntValue2 = num3.intValue();
            } else {
                iIntValue2 = 1;
            }
            int i4 = iIntValue / iIntValue2;
            IconModel iconModel10 = rightsInfo.darkIcon;
            if (iconModel10 != null && (num = iconModel10.height) != null && num.intValue() > 0 && (iconModel = rightsInfo.darkIcon) != null && (num2 = iconModel.width) != null && num2.intValue() > 0) {
                int iLIZIZ2 = C0H9H.LIZIZ(16) * i4;
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL2 = C1326790kdB.LIZLLL(objLJJJLZIJ);
                c1331670kl3LIZLLL2.LJJ(this.LLILLJJLI);
                C786410Ut5.h3(c1331670kl3LIZLLL2);
                SmartImageView smartImageView3 = this.LLILLJJLI;
                if (smartImageView3 != null) {
                    ViewGroup.LayoutParams layoutParams2 = smartImageView3.getLayoutParams();
                    layoutParams2.width = C0H9H.LIZIZ(16);
                    layoutParams2.height = iLIZIZ2;
                    C786410Ut5.G6(smartImageView3, layoutParams2);
                }
            } else {
                SmartImageView smartImageView4 = this.LLILLJJLI;
                if (smartImageView4 != null) {
                    C786410Ut5.LLFF(8, smartImageView4);
                }
            }
        }
        if (C467860IWi.LIZ(getContext())) {
            TextConfig textConfig3 = rightsInfo.textConfig;
            if (textConfig3 != null) {
                str4 = textConfig3.highLightDarkColor;
            }
            color = ColorProtector.parseColor(str4);
        } else {
            TextConfig textConfig4 = rightsInfo.textConfig;
            if (textConfig4 != null) {
                str4 = textConfig4.highLightColor;
            }
            color = ColorProtector.parseColor(str4);
        }
        TuxTextView tuxTextView = this.LLILLL;
        String str5 = rightsInfo.text;
        if (str5 != null) {
            str3 = str5;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = PatternProtector.compile("\\[\\[(.*?)\\]\\]").matcher(str3);
        while (true) {
            i = 33;
            if (!matcher.find()) {
                break;
            }
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(1);
            spannableStringBuilder.append((CharSequence) str3.substring(i2, iStart));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) strGroup);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(color), length, spannableStringBuilder.length(), 33);
            i2 = iEnd;
        }
        if (i2 < str3.length()) {
            spannableStringBuilder.append((CharSequence) str3.substring(i2));
        }
        if (tuxTextView != null) {
            tuxTextView.setText(spannableStringBuilder);
        }
        TextConfig textConfig5 = rightsInfo.textConfig;
        if (textConfig5 != null && (num5 = textConfig5.textWeight) != null) {
            int iIntValue5 = num5.intValue();
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 != null) {
                if (iIntValue5 < 700) {
                    if (iIntValue5 >= 500) {
                        i = 32;
                    } else {
                        i = 31;
                    }
                }
                tuxTextView2.setTuxFont(i);
            }
        }
    }
}
