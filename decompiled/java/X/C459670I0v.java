package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0I0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459670I0v extends C09AY implements Function2<String, Context, SpannableString> {
    public final /* synthetic */ C459680I0w LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C459670I0v(C459680I0w c459680I0w) {
        super(2);
        this.LL = c459680I0w;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ SpannableString invoke(String str, Context context) {
        String lowerCase;
        String str2 = str;
        Context context2 = context;
        if (str2 == null || (lowerCase = str2.toLowerCase(Locale.ROOT)) == null) {
            lowerCase = "";
        }
        this.LL.getClass();
        SpannableString spannableString = new SpannableString(str2);
        int iLJJJ = a0.LJJJ(lowerCase, "", 0, false, 6);
        if (iLJJJ >= 0 && iLJJJ < spannableString.length()) {
            this.LL.getClass();
            int i = 0 + iLJJJ;
            int length = spannableString.length();
            if (i > length) {
                i = length;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context2);
            if (numLIZJ != null) {
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), iLJJJ, i, 33);
            }
        }
        return spannableString;
    }
}
