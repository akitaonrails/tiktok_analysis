package X;

import android.text.SpannableStringBuilder;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.wallet.LiveEmailIncentiveSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0x5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805720x5e {
    public final LinearLayout LIZ;
    public final C1805940x60 LIZIZ;
    public String LIZJ;
    public final C1864820ycy LIZLLL = new C1864820ycy(this, 2);

    public static SpannableStringBuilder LIZ(int i) {
        LiveEmailIncentiveSetting liveEmailIncentiveSetting = LiveEmailIncentiveSetting.INSTANCE;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C497740JfY.LJIJJ(i, String.valueOf(liveEmailIncentiveSetting.getValue().cashbackPercent), String.valueOf(liveEmailIncentiveSetting.getValue().cashbackMaxUsd)));
        MatchResult matchResultFind$default = Regex.find$default(new Regex("\\[.*?\\]"), spannableStringBuilder, 0, 2, null);
        if (matchResultFind$default != null) {
            int i2 = matchResultFind$default.LIZIZ().LL;
            int i3 = matchResultFind$default.LIZIZ().LLILLJJLI;
            try {
                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(13, true), i2, i3, 33);
                spannableStringBuilder.delete(i2, i2 + 1);
                spannableStringBuilder.delete(i3 - 1, i3);
                return spannableStringBuilder;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return spannableStringBuilder;
    }

    public C1805720x5e(LinearLayout linearLayout, C1805940x60 c1805940x60) {
        this.LIZ = linearLayout;
        this.LIZIZ = c1805940x60;
    }
}
