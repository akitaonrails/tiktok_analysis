package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897700ZJo {
    public static SpannableString LIZ(final Context context, String str, String str2, final String str3, final AwS415S0200000_14 awS415S0200000_14) {
        int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
        int length = str2.length() + iLJJJ;
        SpannableString spannableString = new SpannableString(str);
        if (iLJJJ >= 0) {
            C786410Ut5.p2(spannableString, new AbstractC426530Gnz(context, str3, awS415S0200000_14) { // from class: X.0ZJn
                public static final /* synthetic */ int LLILZ = 0;
                public final Context LL;
                public final String LLILLJJLI;
                public final Function0<Unit> LLILLL;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    if (TextUtils.isEmpty(this.LLILLJJLI)) {
                        return;
                    }
                    IMContactApi.LIZ.getClass();
                    C069P.LIZ().LIZLLL().LIZIZ(this.LLILLJJLI);
                    C879350Yeb c879350Yeb = C879350Yeb.LIZ;
                    String str4 = this.LLILLJJLI;
                    c879350Yeb.getClass();
                    C879350Yeb.LIZ(str4, null, null);
                    Function0<Unit> function0 = this.LLILLL;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, this.LL);
                    if (numLIZJ != null) {
                        textPaint.setColor(numLIZJ.intValue());
                        textPaint.setUnderlineText(false);
                    }
                }

                {
                    this.LL = context;
                    this.LLILLJJLI = str3;
                    this.LLILLL = awS415S0200000_14;
                }
            }, iLJJJ, length, 0);
            C786410Ut5.p2(spannableString, new C444920HcY(62, false), iLJJJ, length, 0);
        }
        return spannableString;
    }
}
