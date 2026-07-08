package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.experiment.AlternativeChannel;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: X.10e0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19293810e0 {
    public static final Set<String> LIZ = new HashSet(Arrays.asList("AL", "AD", "AT", "BE", "BG", "HR", "CZ", "DK", "EE", "FO", "FI", "FR", "DE", "GI", "GR", "GG", "VA", "HU", "IS", "IE", "IM", "IT", "JE", "LV", "LI", "LT", "LU", "MT", "MC", "NL", "MK", "NO", "PL", "PT", "RO", "SM", "RS", "SK", "SI", "ES", "SJ", "SE", "CH", "GB", "AX"));
    public static final Set<String> LIZIZ = new HashSet(Arrays.asList("US", "AS", "GU", "MP", "PR", "VI", "UM"));

    public static Typeface LJ() {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(82);
        return c444890HcV.getTypeface();
    }

    public static int LJFF() {
        IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi(IPNSChangeRegionService.class);
        boolean z = iPNSChangeRegionService != null && iPNSChangeRegionService.LJIIJJI();
        return LJIIIZ() ? z ? 2131845935 : 2131829452 : LJIIIIZZ().equals("CO") ? z ? 2131845934 : 2131829333 : (LJIIJJI() && z) ? 2131845936 : 2131829460;
    }

    public static boolean LJIIIZ() {
        return ((HashSet) LIZ).contains(LJIIIIZZ());
    }

    public static boolean LJIIJ() {
        IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi(IPNSChangeRegionService.class);
        return "HU".equalsIgnoreCase(iPNSChangeRegionService != null ? iPNSChangeRegionService.LIZLLL() : null);
    }

    public static boolean LJIIJJI() {
        return !((HashSet) LIZIZ).contains(LJIIIIZZ());
    }

    public static String LJIIIIZZ() {
        String strLIZ = C2222691Bz1.LIZ();
        IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi(IPNSChangeRegionService.class);
        if (iPNSChangeRegionService != null && iPNSChangeRegionService.LJIIJJI()) {
            strLIZ = iPNSChangeRegionService.getStoreRegion();
        }
        return strLIZ.toUpperCase(Locale.getDefault());
    }

    public static boolean LJIIL() {
        return LJIIIIZZ().equals("TR");
    }

    public static void LJIILIIL(String str, String str2) {
        ComplianceServiceProvider.LJIIIIZZ().LIZLLL();
    }

    public static void LIZIZ(Context context, TuxTextView tuxTextView, SpannableString spannableString) {
        try {
            tuxTextView.setHighlightColor(C446980Hfs.LIZ(context, R.color.dr));
            tuxTextView.setText(spannableString);
            tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1k, context));
            tuxTextView.setMovementMethod(C431300Gvg.LIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static SpannableString LJII(Context context, Integer num, View.OnClickListener onClickListener) {
        SpannableStringBuilder spannableStringBuilderAppend;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ");
        sbLIZ.append(context.getString(2131839766));
        sbLIZ.append(" ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z = false;
        switch (num.intValue()) {
            case 1:
                String strLIZ = C1237280iIo.LIZ((AlternativeChannel) C1237260iIm.LIZJ.getValue());
                if (TextUtils.isEmpty(strLIZ)) {
                    strLIZ = C1237280iIo.LIZ((AlternativeChannel) C1237270iIn.LIZJ.getValue());
                }
                if (TextUtils.isEmpty(strLIZ)) {
                    spannableStringBuilderAppend = new SpannableStringBuilder(context.getString(2131848249)).append((CharSequence) strLIZIZ);
                } else {
                    if (TextUtils.isEmpty(strLIZ)) {
                        strLIZ = "";
                    } else {
                        String lowerCase = strLIZ.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        switch (lowerCase.hashCode()) {
                            case -1360467711:
                                if (lowerCase.equals("telegram")) {
                                    strLIZ = context.getString(2131826468);
                                }
                                break;
                            case 3731178:
                                if (lowerCase.equals("zalo")) {
                                    strLIZ = context.getString(2131826471);
                                }
                                break;
                            case 112200956:
                                if (lowerCase.equals("viber")) {
                                    strLIZ = context.getString(2131826469);
                                }
                                break;
                            case 1934780818:
                                if (lowerCase.equals("whatsapp")) {
                                    strLIZ = context.getString(2131826470);
                                }
                                break;
                        }
                    }
                    spannableStringBuilderAppend = new SpannableStringBuilder(context.getString(2131826472, strLIZ, "")).append((CharSequence) strLIZIZ);
                }
                break;
            case 2:
            default:
                spannableStringBuilderAppend = new SpannableStringBuilder(context.getString(2131847785)).append((CharSequence) strLIZIZ);
                break;
            case 3:
                spannableStringBuilderAppend = new SpannableStringBuilder(context.getString(2131823025, "")).append((CharSequence) strLIZIZ);
                break;
            case 4:
                spannableStringBuilderAppend = new SpannableStringBuilder(context.getString(2131857361, context.getString(2131857362)));
                break;
            case 5:
                spannableStringBuilderAppend = new SpannableStringBuilder(context.getString(2131838793)).append((CharSequence) strLIZIZ);
                break;
            case 6:
                spannableStringBuilderAppend = new SpannableStringBuilder(context.getString(2131838787)).append((CharSequence) strLIZIZ);
                break;
            case 7:
                spannableStringBuilderAppend = new SpannableStringBuilder(context.getString(2131838792)).append((CharSequence) strLIZIZ);
                break;
            case 8:
                spannableStringBuilderAppend = new SpannableStringBuilder(context.getString(2131838788)).append((CharSequence) strLIZIZ);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                spannableStringBuilderAppend = new SpannableStringBuilder(context.getString(2131830562, strLIZIZ));
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                spannableStringBuilderAppend = new SpannableStringBuilder(context.getString(2131824504, strLIZIZ));
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                spannableStringBuilderAppend = new SpannableStringBuilder(context.getString(2131848289, "")).append((CharSequence) strLIZIZ);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                spannableStringBuilderAppend = new SpannableStringBuilder(context.getString(2131848287, "")).append((CharSequence) strLIZIZ);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                spannableStringBuilderAppend = new SpannableStringBuilder(context.getString(2131823024, "")).append((CharSequence) strLIZIZ);
                break;
        }
        if (num.intValue() == 4) {
            z = true;
        }
        return LJI(context, spannableStringBuilderAppend, z, onClickListener);
    }

    public static void LIZJ(Context context, TuxTextView tuxTextView, Integer num, View.OnClickListener onClickListener) {
        try {
            LIZIZ(context, tuxTextView, LJII(context, num, onClickListener));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static SpannableString LJI(final Context context, SpannableStringBuilder spannableStringBuilder, final boolean z, final View.OnClickListener onClickListener) {
        final int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        final int i = iIntValue;
        AbstractC431340Gvk abstractC431340Gvk = new AbstractC431340Gvk(iIntValue, i) { // from class: X.0iLa
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                if (z) {
                    Context context2 = context;
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context2, "aweme://webview");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("https://support.tiktok.com/");
                    sbLIZ.append(C2273291DyR.LIZ());
                    sbLIZ.append("/account-and-privacy/personalized-ads-and-data/how-your-phone-number-is-used-on-tiktok#2");
                    smartRouteBuildRoute.withParam("url", C2188811AlT.LIZIZ(sbLIZ));
                    smartRouteBuildRoute.withParam("title", context2.getString(2131827212));
                    smartRouteBuildRoute.withParam("show_separate_line", true);
                    smartRouteBuildRoute.withParam("use_spark", true);
                    smartRouteBuildRoute.open();
                } else {
                    C0FNV.LIZJ(DialogC20224814Bq.LJJLIIIJLLLLLLLZ(context));
                }
                View.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }
        };
        String string = context.getString(2131839766);
        int iIndexOf = spannableStringBuilder.toString().toLowerCase(Locale.getDefault()).indexOf(string.toLowerCase(Locale.getDefault()));
        C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk, iIndexOf, string.length() + iIndexOf, 33);
        return SpannableString.valueOf(spannableStringBuilder);
    }

    public static void LIZLLL(final Context context, TextView textView, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2, String str, boolean z) {
        String string;
        String strLJFF;
        boolean z2;
        int i;
        SpannableStringBuilder spannableStringBuilder;
        int i2;
        final boolean z3;
        int i3;
        int iIndexOf;
        try {
            String string2 = context.getString(2131829455);
            if (LJIIL()) {
                string = context.getString(2131848237);
            } else {
                string = context.getString(2131829454);
            }
            String string3 = context.getString(2131833476);
            String string4 = context.getString(2131833488);
            IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi(IPNSChangeRegionService.class);
            if (iPNSChangeRegionService != null) {
                strLJFF = iPNSChangeRegionService.LJFF();
            } else {
                strLJFF = null;
            }
            String[] strArr = {strLJFF};
            if (iPNSChangeRegionService != null && iPNSChangeRegionService.LJIIJJI() && LJIIJJI() && !LJIIL()) {
                z2 = true;
                i = 2131833474;
            } else {
                z2 = false;
                i = 2131833473;
            }
            if (z2) {
                spannableStringBuilder = new SpannableStringBuilder(context.getString(i, strArr[0], string2, string, string3, string4));
            } else {
                spannableStringBuilder = new SpannableStringBuilder(context.getString(i, string2, string, string3, string4));
            }
            if (z) {
                i2 = R.attr.a1j;
            } else {
                i2 = R.attr.a1h;
            }
            final int iLIZ = C960203pA.LIZ(i2, context);
            EnumC1913590ztd enumC1913590ztd = EnumC1913590ztd.ACCOUNT_SIGNUP_OR_LOGIN;
            if (Objects.equals(str, enumC1913590ztd.getValue())) {
                iLIZ = C960203pA.LIZ(R.attr.a1n, context);
            }
            if (!Objects.equals(str, enumC1913590ztd.getValue())) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC431340Gvk abstractC431340Gvk = new AbstractC431340Gvk(iLIZ, iLIZ) { // from class: X.10e3
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    View.OnClickListener onClickListener3 = onClickListener;
                    if (onClickListener3 != null) {
                        onClickListener3.onClick(view);
                    }
                }

                @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    if (z3) {
                        textPaint.setTypeface(C19293810e0.LJ());
                    }
                    textPaint.setUnderlineText(false);
                }
            };
            AbstractC431340Gvk abstractC431340Gvk2 = new AbstractC431340Gvk(iLIZ, iLIZ) { // from class: X.10e4
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    View.OnClickListener onClickListener3 = onClickListener2;
                    if (onClickListener3 != null) {
                        onClickListener3.onClick(view);
                    }
                }

                @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    if (z3) {
                        textPaint.setTypeface(C19293810e0.LJ());
                    }
                    textPaint.setUnderlineText(false);
                }
            };
            AbstractC431340Gvk abstractC431340Gvk3 = new AbstractC431340Gvk(iLIZ, iLIZ) { // from class: X.10e5
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    C19295210eE.LIZIZ(context);
                }

                @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    if (z3) {
                        textPaint.setTypeface(C19293810e0.LJ());
                    }
                    textPaint.setUnderlineText(false);
                }
            };
            AbstractC431340Gvk abstractC431340Gvk4 = new AbstractC431340Gvk(iLIZ, iLIZ) { // from class: X.10e2
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//webview/");
                    smartRouteBuildRoute.withParam("url", "https://www.tiktok.com/support/faq_detail?id=7543897457344928262&lang=en-GB");
                    smartRouteBuildRoute.open();
                }

                @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    if (z3) {
                        textPaint.setTypeface(C19293810e0.LJ());
                    }
                    textPaint.setUnderlineText(false);
                }
            };
            String lowerCase = spannableStringBuilder.toString().toLowerCase(Locale.getDefault());
            int iIndexOf2 = lowerCase.indexOf(string2.toLowerCase(Locale.getDefault()));
            int iIndexOf3 = lowerCase.indexOf(string.toLowerCase(Locale.getDefault()));
            int iIndexOf4 = lowerCase.indexOf(string3.toLowerCase(Locale.getDefault()));
            int iIndexOf5 = lowerCase.indexOf(string4.toLowerCase(Locale.getDefault()));
            if (iIndexOf2 < 0 || iIndexOf3 < 0) {
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("enter_from", "login");
                C794240VDq.LIZIZ("text_highlight_not_match", "", c2241008qG.LJ());
            }
            if (iIndexOf2 >= 0) {
                C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk, iIndexOf2, string2.length() + iIndexOf2, 34);
                LJIILIIL(str, "terms-of-service");
            }
            if (iIndexOf3 >= 0) {
                C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk2, iIndexOf3, string.length() + iIndexOf3, 34);
                LJIILIIL(str, "privacy-policy");
            }
            if (iIndexOf4 >= 0) {
                C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk3, iIndexOf4, string3.length() + iIndexOf4, 34);
            }
            if (iIndexOf5 >= 0) {
                C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk4, iIndexOf5, iIndexOf5 + string4.length(), 34);
            }
            if (z2 && (iIndexOf = new SpannableStringBuilder(context.getString(i, "%1$s", string2, string, string3, string4)).toString().toLowerCase(Locale.getDefault()).indexOf("%1$s".toLowerCase(Locale.getDefault()))) >= 0 && strArr[0] != null) {
                i3 = 0;
                C786410Ut5.q2(spannableStringBuilder, new C19294610e8(iLIZ, iLIZ, iPNSChangeRegionService, textView, strArr, context, i, string2, string, string3, string4, spannableStringBuilder), iIndexOf, strArr[0].length() + iIndexOf, 34);
                if (z3) {
                    C786410Ut5.q2(spannableStringBuilder, new C444920HcY(12, true), iIndexOf, strArr[0].length() + iIndexOf, 33);
                }
                C2241008qG c2241008qG2 = new C2241008qG();
                c2241008qG2.LIZ.put("enter_from", "signup_login_page");
                c2241008qG2.LIZ.put("is_client_value", Integer.valueOf(iPNSChangeRegionService.LJIIL()));
                C20684815ws.LJIJ("account_region_status_show", c2241008qG2.LJ());
            } else {
                i3 = 0;
            }
            textView.setHighlightColor(i3);
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(C431300Gvg.LIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(Context context, TextView textView, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2, final View.OnClickListener onClickListener3, int i, final String str, boolean z, String str2) {
        String string;
        String strLJFF;
        SpannableStringBuilder spannableStringBuilder;
        int i2;
        boolean z2;
        int iIndexOf;
        try {
            C853700XeK.LIZ.getClass();
            if (C853700XeK.LIZ()) {
                LIZLLL(context, textView, onClickListener, onClickListener2, str, z);
                return;
            }
            String string2 = context.getString(2131829455);
            if (LJIIL()) {
                string = context.getString(2131848237);
            } else {
                string = context.getString(2131829454);
            }
            String string3 = context.getString(2131829453);
            IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi(IPNSChangeRegionService.class);
            if (iPNSChangeRegionService != null) {
                strLJFF = iPNSChangeRegionService.LJFF();
            } else {
                strLJFF = null;
            }
            String[] strArr = {strLJFF};
            if (iPNSChangeRegionService != null && iPNSChangeRegionService.LJIIJJI() && LJIIJJI() && !LJIIL()) {
                spannableStringBuilder = new SpannableStringBuilder(context.getString(i, strArr[0], string2, string, string3));
            } else {
                spannableStringBuilder = new SpannableStringBuilder(context.getString(i, string2, string, string3));
            }
            if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) str2);
            }
            int i3 = R.attr.a1j;
            if (z) {
                i2 = R.attr.a1j;
            } else {
                i2 = R.attr.a1h;
            }
            final int iLIZ = C960203pA.LIZ(i2, context);
            if (!z) {
                i3 = R.attr.a1h;
            }
            final int iLIZ2 = C960203pA.LIZ(i3, context);
            EnumC1913590ztd enumC1913590ztd = EnumC1913590ztd.ACCOUNT_SIGNUP_OR_LOGIN;
            if (Objects.equals(str, enumC1913590ztd.getValue())) {
                iLIZ = C960203pA.LIZ(R.attr.a1n, context);
                iLIZ2 = iLIZ;
            }
            AbstractC431340Gvk abstractC431340Gvk = new AbstractC431340Gvk(iLIZ, iLIZ2) { // from class: X.10dy
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    View.OnClickListener onClickListener4 = onClickListener;
                    if (onClickListener4 != null) {
                        onClickListener4.onClick(view);
                    }
                }

                @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    if (!Objects.equals(str, EnumC1913590ztd.ACCOUNT_SIGNUP_OR_LOGIN.getValue())) {
                        textPaint.setTypeface(C19293810e0.LJ());
                    }
                    textPaint.setUnderlineText(false);
                }
            };
            AbstractC431340Gvk abstractC431340Gvk2 = new AbstractC431340Gvk(iLIZ, iLIZ2) { // from class: X.10dz
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    View.OnClickListener onClickListener4 = onClickListener2;
                    if (onClickListener4 != null) {
                        onClickListener4.onClick(view);
                    }
                }

                @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    if (!Objects.equals(str, EnumC1913590ztd.ACCOUNT_SIGNUP_OR_LOGIN.getValue())) {
                        textPaint.setTypeface(C19293810e0.LJ());
                    }
                    textPaint.setUnderlineText(false);
                }
            };
            AbstractC431340Gvk abstractC431340Gvk3 = new AbstractC431340Gvk(iLIZ, iLIZ2) { // from class: X.10dx
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    View.OnClickListener onClickListener4 = onClickListener3;
                    if (onClickListener4 != null) {
                        onClickListener4.onClick(view);
                    }
                }

                @Override // X.AbstractC431340Gvk, android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    if (!Objects.equals(str, EnumC1913590ztd.ACCOUNT_SIGNUP_OR_LOGIN.getValue())) {
                        textPaint.setTypeface(C19293810e0.LJ());
                    }
                    textPaint.setUnderlineText(false);
                }
            };
            C19294710e9 c19294710e9 = new C19294710e9(iLIZ, iLIZ2, iPNSChangeRegionService, textView, strArr, context, i, string2, string, string3, spannableStringBuilder);
            String lowerCase = spannableStringBuilder.toString().toLowerCase(Locale.getDefault());
            int iIndexOf2 = lowerCase.indexOf(string2.toLowerCase(Locale.getDefault()));
            int iIndexOf3 = lowerCase.indexOf(string.toLowerCase(Locale.getDefault()));
            int iIndexOf4 = lowerCase.indexOf(string3.toLowerCase(Locale.getDefault()));
            if (iPNSChangeRegionService != null && iPNSChangeRegionService.LJIIJJI() && LJIIJJI()) {
                z2 = true;
                iIndexOf = new SpannableStringBuilder(context.getString(i, "%1$s", string2, string, string3)).toString().toLowerCase(Locale.getDefault()).indexOf("%1$s".toLowerCase(Locale.getDefault()));
            } else {
                z2 = true;
                iIndexOf = -1;
            }
            if (iIndexOf2 < 0 || iIndexOf3 < 0) {
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("enter_from", "login");
                C794240VDq.LIZIZ("text_highlight_not_match", "", c2241008qG.LJ());
            }
            C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk, iIndexOf2, string2.length() + iIndexOf2, 34);
            C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk2, iIndexOf3, string.length() + iIndexOf3, 34);
            LJIILIIL(str, "terms-of-service");
            LJIILIIL(str, "privacy-policy");
            if (iIndexOf4 >= 0) {
                C786410Ut5.q2(spannableStringBuilder, abstractC431340Gvk3, iIndexOf4, string3.length() + iIndexOf4, 34);
                LJIILIIL(str, "cookie-policy");
            }
            if (iPNSChangeRegionService != null && iIndexOf >= 0) {
                C786410Ut5.q2(spannableStringBuilder, c19294710e9, iIndexOf, strArr[0].length() + iIndexOf, 34);
                if (!Objects.equals(str, enumC1913590ztd.getValue())) {
                    C786410Ut5.q2(spannableStringBuilder, new C444920HcY(12, z2), iIndexOf, strArr[0].length() + iIndexOf, 33);
                }
                C2241008qG c2241008qG2 = new C2241008qG();
                c2241008qG2.LIZ.put("enter_from", "signup_login_page");
                c2241008qG2.LIZ.put("is_client_value", Integer.valueOf(iPNSChangeRegionService.LJIIL()));
                C20684815ws.LJIJ("account_region_status_show", c2241008qG2.LJ());
            }
            textView.setHighlightColor(C446980Hfs.LIZ(context, R.color.dr));
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(C431300Gvg.LIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
