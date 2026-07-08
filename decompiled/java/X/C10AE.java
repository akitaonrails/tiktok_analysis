package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.10AE, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10AE {
    public static final /* synthetic */ int LIZ = 0;

    public static SpannableStringBuilder LIZIZ(final Context context, String str, final String str2, final String str3, boolean z, final String str4) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        C191819102n.LIZ.getClass();
        final int friendCount = C191819102n.LIZ().getFriendCount();
        if (z) {
            i = R.attr.a1k;
        } else {
            i = R.attr.a1p;
        }
        spannableStringBuilder.append((CharSequence) "*");
        C786410Ut5.q2(spannableStringBuilder, new C19322610ie(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) C1843500y4a.LIZIZ(friendCount));
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), length, spannableStringBuilder.length(), 33);
        }
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(101, false), 0, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((CharSequence) "*");
        C786410Ut5.q2(spannableStringBuilder, new C19322610ie(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_right_slim_ltr;
        c419910GdJ.LJ = Integer.valueOf(i);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
        spannableStringBuilder.append((CharSequence) "*");
        C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        if (z) {
            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.10AF
                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    C10A4 c10a4 = C10A4.LIZ;
                    String str5 = str2;
                    String str6 = str3;
                    int i2 = friendCount;
                    String str7 = str4;
                    c10a4.getClass();
                    C10A4.LJ(i2, str5, str6, str7);
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//privacy/setting/friends_list");
                    smartRouteBuildRoute.withParam("enter_from", str4);
                    smartRouteBuildRoute.withParam("group_id", str2);
                    smartRouteBuildRoute.withParam("page_tag", str3);
                    smartRouteBuildRoute.open();
                }
            }, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder LIZ(String str, boolean z, final Context context, final String str2, final String str3, final String str4, boolean z2) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        C191819102n.LIZ.getClass();
        final int friendCount = C191819102n.LIZ().getFriendCount();
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) C786410Ut5.k4(Locale.ROOT, context.getResources().getQuantityText(2131755625, friendCount).toString(), Arrays.copyOf(new Object[]{Integer.valueOf(friendCount)}, 1)));
        spannableStringBuilder.append((CharSequence) "*");
        C786410Ut5.q2(spannableStringBuilder, new C19322610ie(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        if (z2) {
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
        }
        if (z) {
            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.10AD
                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    C10A4 c10a4 = C10A4.LIZ;
                    String str5 = str2;
                    String str6 = str3;
                    int i2 = friendCount;
                    String str7 = str4;
                    c10a4.getClass();
                    C10A4.LJ(i2, str5, str6, str7);
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//privacy/setting/friends_list");
                    smartRouteBuildRoute.withParam("enter_from", str4);
                    smartRouteBuildRoute.withParam("group_id", str2);
                    smartRouteBuildRoute.withParam("page_tag", str3);
                    smartRouteBuildRoute.open();
                }
            }, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
