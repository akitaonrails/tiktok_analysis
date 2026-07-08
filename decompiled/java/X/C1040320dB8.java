package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0dB8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1040320dB8 {
    public static final C1040320dB8 LIZ = new C1040320dB8();

    public static void LIZ(C1035880d3y c1035880d3y, EnumC1040330dB9 enumC1040330dB9) {
        new AdWebEventLogger(c1035880d3y).logAd(C1040340dBA.LIZ, c1035880d3y.getAwemeRawAd(), new AwS595S0100000_16(enumC1040330dB9, 374));
    }

    public static void LIZIZ(C444910HcX c444910HcX, int i, int i2, Context context, final Function1 function1) {
        int iIntValue;
        C786410Ut5.s2(c444910HcX, new AbstractC426530Gnz() { // from class: X.0dB7
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                function1.invoke(view);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, i, i2, 33);
        C786410Ut5.s2(c444910HcX, new C444920HcY(62, true), i, i2, 33);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        C786410Ut5.s2(c444910HcX, new ForegroundColorSpan(iIntValue), i, i2, 33);
    }
}
