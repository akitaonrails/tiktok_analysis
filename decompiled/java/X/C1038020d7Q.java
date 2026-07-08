package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d7Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038020d7Q {
    public static final C1038020d7Q LIZ = new C1038020d7Q();

    public static CharSequence LIZ(Context context, C1035880d3y c1035880d3y) {
        String title;
        AwemeRawAd awemeRawAd;
        Boolean iabThemeColorUseDarkForeground;
        int i;
        Context contextThemeWrapper;
        Object c098200Yq;
        Object c098200Yq2;
        int i2;
        int i3;
        String title2 = null;
        Object obj = null;
        title2 = null;
        if (Intrinsics.LJFF(C1075220e5Q.LIZ().privacyPolicyEnable, Boolean.TRUE)) {
            String string = context.getString(R.string.dri);
            if (c1035880d3y != null) {
                iabThemeColorUseDarkForeground = c1035880d3y.getIabThemeColorUseDarkForeground();
            } else {
                iabThemeColorUseDarkForeground = null;
            }
            if (C04VO.LIZ()) {
                i = R.attr.a1k;
            } else {
                i = R.attr.a1h;
            }
            if (iabThemeColorUseDarkForeground != null) {
                iabThemeColorUseDarkForeground.booleanValue();
                if (!iabThemeColorUseDarkForeground.booleanValue()) {
                    i3 = R.style.y0;
                } else {
                    i3 = R.style.y3;
                }
                contextThemeWrapper = new ContextThemeWrapper(context, i3);
            } else {
                contextThemeWrapper = context;
            }
            try {
                c098200Yq = C1308910kAL.LIZJ(i, contextThemeWrapper);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Integer num = (Integer) c098200Yq;
            if (num == null) {
                try {
                    c098200Yq2 = C1308910kAL.LIZJ(i, context);
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                    obj = c098200Yq2;
                }
                num = (Integer) obj;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
            if (C04VO.LIZ()) {
                i2 = 10;
            } else {
                i2 = 12;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
            TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context, R.raw.icon_tiktok_logo);
            tuxIconDrawable.setBounds(0, 0, iLIZIZ, iLIZIZ);
            if (num != null) {
                tuxIconDrawable.LJFF(num.intValue());
            }
            C786410Ut5.q2(spannableStringBuilder, new C419890GdH(tuxIconDrawable, 2), 0, 1, 33);
            SpannableString spannableString = new SpannableString(string);
            if (num != null) {
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
            }
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append((CharSequence) spannableString);
            return spannableStringBuilder;
        }
        if (c1035880d3y != null) {
            title = c1035880d3y.getTitle();
        } else {
            title = null;
        }
        if (!C123100dR.LIZ(title)) {
            title = null;
        }
        if (title == null) {
            if (c1035880d3y != null && (awemeRawAd = c1035880d3y.getAwemeRawAd()) != null) {
                title2 = awemeRawAd.getTitle();
            }
            if (title2 == null) {
                return "";
            }
            return title2;
        }
        return title;
    }
}
