package X;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingFrontFragment;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xaE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824680xaE extends C09AY implements Function0<SpannableString> {
    public final /* synthetic */ PcsOnboardingFrontFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824680xaE(PcsOnboardingFrontFragment pcsOnboardingFrontFragment) {
        super(0);
        this.LL = pcsOnboardingFrontFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SpannableString invoke() {
        String string = this.LL.getString(2131855960);
        String string2 = this.LL.getString(2131855959);
        PcsOnboardingFrontFragment pcsOnboardingFrontFragment = this.LL;
        final C1823840xYs c1823840xYs = new C1823840xYs(pcsOnboardingFrontFragment);
        pcsOnboardingFrontFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<b><a href=\"action://policy\">");
        sbLIZ.append(string);
        sbLIZ.append("</a></b>");
        SpannableString spannableString = new SpannableString(C19298910ep.LIZ(C786410Ut5.j4(string2, Arrays.copyOf(new Object[]{C2188811AlT.LIZIZ(sbLIZ)}, 1)), 0));
        for (Object obj : spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(obj);
            int spanEnd = spannableString.getSpanEnd(obj);
            int spanFlags = spannableString.getSpanFlags(obj);
            spannableString.removeSpan(obj);
            C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0xaS
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    c1823840xYs.invoke();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setFakeBoldText(true);
                    textPaint.setUnderlineText(false);
                }
            }, spanStart, spanEnd, spanFlags);
        }
        return spannableString;
    }
}
