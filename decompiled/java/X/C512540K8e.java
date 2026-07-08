package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512540K8e extends C09AY implements Function1<SpannableStringBuilder, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C512540K8e(int i, int i2, Context context, String str, Map<String, String> map, String str2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = map;
        this.LLILZLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SpannableStringBuilder spannableStringBuilder) {
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        C510740K1g.LIZLLL(spannableStringBuilder2, this.LL, this.LLILLJJLI, 52, false, 33);
        final String str = this.LLILZ;
        final Map<String, String> map = this.LLILZIL;
        final Context context = this.LLILLL;
        final String str2 = this.LLILZLL;
        C510740K1g.LIZJ(spannableStringBuilder2, new ClickableSpan() { // from class: X.0K8f
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                C0KDQ c0kdq = C0KDQ.LIZ;
                String str3 = str;
                Map<String, String> map2 = map;
                c0kdq.getClass();
                C511970K5z c511970K5z = new C511970K5z("migration_alert_click");
                C0K61.LIZ(c511970K5z, null);
                c511970K5z.LIZIZ(str3, "enter_from");
                c511970K5z.LIZJ(map2);
                c511970K5z.LIZLLL();
                C0KC9 c0kc9 = C0KC9.LIZ;
                Context context2 = context;
                String str4 = str2;
                c0kc9.getClass();
                C0KC9.LJ(context2, str4, false, -1);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, this.LL, this.LLILLJJLI, 33);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.fa8, this.LLILLL);
        if (numLIZJ != null) {
            C510740K1g.LIZJ(spannableStringBuilder2, new ForegroundColorSpan(numLIZJ.intValue()), this.LL, this.LLILLJJLI, 33);
        }
        return Unit.LIZ;
    }
}
