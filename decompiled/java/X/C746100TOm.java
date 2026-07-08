package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.model.CopyWritingInfo;
import com.ss.android.ugc.aweme.compliance.api.model.UnifiedModeTextData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0TOm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746100TOm {
    public static final C746100TOm LIZ = new C746100TOm();

    public static SpannableStringBuilder LIZJ(Activity activity, CopyWritingInfo copyWritingInfo, UnifiedModeTextData unifiedModeTextData) {
        List<String> list;
        List<String> list2;
        String str;
        boolean z;
        String str2 = null;
        if (copyWritingInfo != null) {
            str2 = copyWritingInfo.subtext;
        } else if (unifiedModeTextData != null) {
            str2 = unifiedModeTextData.description;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (copyWritingInfo != null) {
            list = copyWritingInfo.policyList;
            list2 = copyWritingInfo.policyLinkList;
        } else {
            if (unifiedModeTextData != null) {
                list = unifiedModeTextData.itemList;
                list2 = unifiedModeTextData.itemLinkList;
            }
            return spannableStringBuilder;
        }
        if (list != null && !list.isEmpty()) {
            int i = 0;
            for (String str3 : list) {
                int i2 = i + 1;
                if (list2 == null || (str = (String) ListProtector.get(list2, i)) == null) {
                    str = "";
                }
                if (unifiedModeTextData != null) {
                    z = true;
                } else {
                    z = false;
                }
                spannableStringBuilder = LIZIZ(spannableStringBuilder, str3, str, activity, z, i);
                i = i2;
            }
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder LIZ(Activity activity, String str, List list, List list2) {
        String str2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                int i2 = i + 1;
                String str3 = (String) it2.next();
                if (list2 == null || (str2 = (String) ListProtector.get(list2, i)) == null) {
                    str2 = "";
                }
                spannableStringBuilder = LIZIZ(spannableStringBuilder, str3, str2, activity, false, i);
                i = i2;
            }
        }
        return spannableStringBuilder;
    }

    public static CharSequence LJ(Context context, int i, String str, String str2) {
        Configuration configuration;
        Locale locale;
        Configuration configuration2;
        LocaleList locales;
        BDDateFormat bDDateFormat = new BDDateFormat("LL");
        long j = ((long) i) * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        Resources resources = context.getResources();
        if (Build.VERSION.SDK_INT >= 24) {
            if (resources != null && (configuration2 = resources.getConfiguration()) != null && (locales = configuration2.getLocales()) != null) {
                locale = locales.get(0);
                if (locale == null) {
                }
            }
            locale = Locale.getDefault();
        } else {
            if (resources != null && (configuration = resources.getConfiguration()) != null) {
                locale = configuration.locale;
                if (locale == null) {
                }
            }
            locale = Locale.getDefault();
        }
        return u.LJJIFFI(str, str2, bDDateFormat.LIZIZ(j, locale), false);
    }

    public static SpannableStringBuilder LIZIZ(SpannableStringBuilder spannableStringBuilder, String str, final String str2, final Activity activity, final boolean z, final int i) {
        boolean z2 = false;
        int iLJJJ = a0.LJJJ(spannableStringBuilder, "%s", 0, false, 6);
        if (iLJJJ == -1) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilderReplace = spannableStringBuilder.replace(iLJJJ, iLJJJ + 2, (CharSequence) str);
        if (a0.LJJJIL(str2)) {
            z2 = true;
        }
        if (z2) {
            C786410Ut5.q2(spannableStringBuilderReplace, new StyleSpan(1), iLJJJ, str.length() + iLJJJ, 33);
            return spannableStringBuilderReplace;
        }
        C786410Ut5.q2(spannableStringBuilderReplace, new ClickableSpan() { // from class: X.0DJj
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//webview");
                smartRouteBuildRoute.withParam("url", str2);
                smartRouteBuildRoute.withParam("use_spark", true);
                smartRouteBuildRoute.withParam("use_webview_title", true);
                smartRouteBuildRoute.open();
                if (z) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZJ(i, "pa_hyperlink_click_position");
                    C20684815ws.LJIILLIIL("click_pa_setting_hyper_link", c2344009Gk.LIZ);
                } else {
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LIZJ(i, "hyperlink_val");
                    C20684815ws.LJIILLIIL("click_pa_prompt_hyperlinks_final", c2344009Gk2.LIZ);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, iLJJJ, str.length() + iLJJJ, 33);
        C786410Ut5.q2(spannableStringBuilderReplace, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1h, activity)), iLJJJ, str.length() + iLJJJ, 33);
        C786410Ut5.q2(spannableStringBuilderReplace, new StyleSpan(1), iLJJJ, str.length() + iLJJJ, 33);
        return spannableStringBuilderReplace;
    }

    public static SpannableStringBuilder LIZLLL(final Context context, String str, List list, List list2, Integer num, Boolean bool) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return new SpannableStringBuilder("");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (list2 != null && !list2.isEmpty()) {
            if (list != null && !list.isEmpty()) {
                Iterator it2 = list.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    int i2 = i + 1;
                    String str2 = (String) it2.next();
                    final String str3 = (String) ListProtector.get(list2, i);
                    int iLJJJ = a0.LJJJ(spannableStringBuilder, "{%s}", 0, false, 6);
                    if (iLJJJ != -1) {
                        spannableStringBuilder = spannableStringBuilder.replace(iLJJJ, 4 + iLJJJ, (CharSequence) str2);
                        if (str3 != null && !a0.LJJJIL(str3)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, str2.length() + iLJJJ, 33);
                        } else {
                            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0KV4
                                @Override // android.text.style.ClickableSpan
                                public final void onClick(View view) {
                                    View view2;
                                    if (!u.LJJIIJZLJL(str3, "aweme://", false) && !u.LJJIIJZLJL(str3, "sslocal://", false)) {
                                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webview");
                                        smartRouteBuildRoute.withParam("url", str3);
                                        smartRouteBuildRoute.open();
                                    } else {
                                        SmartRouter.buildRoute(context, str3).open();
                                    }
                                    Object parent = view.getParent();
                                    if ((parent instanceof View) && (view2 = (View) parent) != null) {
                                        view2.performClick();
                                    }
                                }

                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                public final void updateDrawState(TextPaint textPaint) {
                                    textPaint.setUnderlineText(false);
                                }
                            }, iLJJJ, str2.length() + iLJJJ, 33);
                            if (num != null) {
                                num.intValue();
                                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C960203pA.LIZ(num.intValue(), context)), iLJJJ, str2.length() + iLJJJ, 33);
                            }
                            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                                C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, str2.length() + iLJJJ, 33);
                            }
                        }
                    }
                    i = i2;
                }
            }
            return spannableStringBuilder;
        }
        return spannableStringBuilder;
    }
}
