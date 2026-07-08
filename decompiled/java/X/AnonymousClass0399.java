package X;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0399, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0399 {
    public static final /* synthetic */ int LIZ = 0;

    public static SpannableStringBuilder LIZ(Activity activity, String str, String str2, final String str3) {
        boolean z = false;
        int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
        if (iLJJJ < 0) {
            return new SpannableStringBuilder(str);
        }
        if (str3 == null || a0.LJJJIL(str3)) {
            z = true;
        }
        if (z) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, str2.length() + iLJJJ, 33);
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
        C786410Ut5.q2(spannableStringBuilder2, new ClickableSpan() { // from class: X.0CeA
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                C844470XAv.LIZ.getClass();
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C844470XAv.LIZ(), "//webview");
                smartRouteBuildRoute.withParam("url", str3);
                smartRouteBuildRoute.withParam("use_spark", true);
                smartRouteBuildRoute.withParam("use_webview_title", true);
                smartRouteBuildRoute.open();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, iLJJJ, str2.length() + iLJJJ, 33);
        C786410Ut5.q2(spannableStringBuilder2, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1h, activity)), iLJJJ, str2.length() + iLJJJ, 33);
        C786410Ut5.q2(spannableStringBuilder2, new StyleSpan(1), iLJJJ, str2.length() + iLJJJ, 33);
        return spannableStringBuilder2;
    }
}
