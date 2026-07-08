package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.0y4W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843460y4W {
    public static final C1843460y4W LIZ = new C1843460y4W();

    public static String LIZ(long j, long j2, String str) {
        String string = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        if ('0' == string.charAt(string.length() - 1)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string.substring(0, string.length() - 2));
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(string);
        sbLIZ2.append(str);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static SpannableStringBuilder LIZJ(final Context context, String str, final String str2, boolean z) {
        final int iLJI;
        int i;
        String strLIZ;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null) {
            iLJI = iPrivacySettingsDepService.LJI();
        } else {
            iLJI = 0;
        }
        if (z) {
            i = R.attr.a1k;
        } else {
            i = R.attr.a1p;
        }
        spannableStringBuilder.append((CharSequence) "*");
        C786410Ut5.q2(spannableStringBuilder, new C1843470y4X(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        int length = spannableStringBuilder.length();
        C1843460y4W c1843460y4W = LIZ;
        long j = iLJI;
        if (j < 1000) {
            c1843460y4W.getClass();
            strLIZ = String.valueOf(j);
        } else if (j < 1000000) {
            c1843460y4W.getClass();
            strLIZ = LIZ(j, 1000L, "k");
        } else if (j < 1000000000) {
            c1843460y4W.getClass();
            strLIZ = LIZ(j, 1000000L, "m");
        } else {
            c1843460y4W.getClass();
            strLIZ = LIZ(j, 1000000000L, "b");
        }
        spannableStringBuilder.append((CharSequence) strLIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), length, spannableStringBuilder.length(), 33);
        }
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(101, false), 0, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) "*");
        C786410Ut5.q2(spannableStringBuilder, new C1843470y4X(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_right_slim_ltr;
        c419910GdJ.LJ = Integer.valueOf(i);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
        spannableStringBuilder.append((CharSequence) "*");
        C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        if (z) {
            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0y4Z
                public final /* synthetic */ String LL = null;
                public final /* synthetic */ String LLILZ = "privacy_and_safety_settings";

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    AnonymousClass1072.LIZ(iLJI, this.LL, str2, this.LLILZ);
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//privacy/setting/friends_list");
                    smartRouteBuildRoute.withParam("enter_from", this.LLILZ);
                    smartRouteBuildRoute.withParam("group_id", this.LL);
                    smartRouteBuildRoute.withParam("page_tag", str2);
                    smartRouteBuildRoute.open();
                }
            }, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder LIZIZ(C1843460y4W c1843460y4W, String str, boolean z, final Context context, final String str2) {
        final int iLJI;
        int i;
        c1843460y4W.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null) {
            iLJI = iPrivacySettingsDepService.LJI();
        } else {
            iLJI = 0;
        }
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) C786410Ut5.k4(Locale.ROOT, context.getResources().getQuantityText(2131755625, iLJI).toString(), Arrays.copyOf(new Object[]{Integer.valueOf(iLJI)}, 1)));
        spannableStringBuilder.append((CharSequence) "*");
        C786410Ut5.q2(spannableStringBuilder, new C1843470y4X(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_right_slim_ltr;
        if (z) {
            i = R.attr.a1k;
        } else {
            i = R.attr.a1p;
        }
        c419910GdJ.LJ = Integer.valueOf(i);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
        spannableStringBuilder.append((CharSequence) "*");
        C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        if (z) {
            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0y4Y
                public final /* synthetic */ String LL = null;
                public final /* synthetic */ String LLILZ = "privacy_and_safety_settings";

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    AnonymousClass1072.LIZ(iLJI, this.LL, str2, this.LLILZ);
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//privacy/setting/friends_list");
                    smartRouteBuildRoute.withParam("enter_from", this.LLILZ);
                    smartRouteBuildRoute.withParam("group_id", this.LL);
                    smartRouteBuildRoute.withParam("page_tag", str2);
                    smartRouteBuildRoute.open();
                }
            }, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
