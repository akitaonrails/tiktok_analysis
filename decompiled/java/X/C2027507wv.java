package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.PlaceholderInfoModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS247S0300000_3;
import kotlin.jvm.internal.AwS369S0200000_3;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07wv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2027507wv extends C09AY implements Function2<PlaceholderInfoModel, CharSequence, CharSequence> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ Typeface LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2027507wv(Context context, Typeface typeface, Integer num, Map<String, String> map) {
        super(2);
        this.LL = context;
        this.LLILLJJLI = typeface;
        this.LLILLL = num;
        this.LLILZ = map;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CharSequence invoke(PlaceholderInfoModel placeholderInfoModel, CharSequence charSequence) {
        PlaceholderInfoModel placeholderInfoModel2 = placeholderInfoModel;
        CharSequence charSequence2 = charSequence;
        C2027407wu c2027407wu = C2027407wu.LIZ;
        Context context = this.LL;
        Typeface typeface = this.LLILLJJLI;
        Integer num = this.LLILLL;
        Map<String, String> map = this.LLILZ;
        c2027407wu.getClass();
        int iIntValue = 0;
        int iLJJJ = a0.LJJJ(charSequence2, placeholderInfoModel2.transValue, 0, false, 6);
        boolean zLIZ = C07Q4.LIZ();
        int iIntValue2 = R.attr.a1n;
        if (zLIZ) {
            SpannableString spannableString = new SpannableString(charSequence2);
            int length = placeholderInfoModel2.transValue.length() + iLJJJ;
            if (num != null) {
                iIntValue2 = num.intValue();
            }
            Integer numLIZ = C1308910kAL.LIZ(iIntValue2, context);
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            }
            C1857690yRT.LIZJ(spannableString, iLJJJ, length, Integer.valueOf(iIntValue), typeface, new AwS369S0200000_3(placeholderInfoModel2, (PlaceholderInfoModel) map, (Map<String, String>) 0));
            return spannableString;
        }
        SpannableString spannableString2 = new SpannableString(charSequence2);
        int length2 = placeholderInfoModel2.transValue.length() + iLJJJ;
        if (num != null) {
            iIntValue2 = num.intValue();
        }
        Integer numLIZ2 = C1308910kAL.LIZ(iIntValue2, context);
        if (numLIZ2 != null) {
            iIntValue = numLIZ2.intValue();
        }
        C1857690yRT.LJ(spannableString2, iLJJJ, length2, Integer.valueOf(iIntValue), typeface, new AwS247S0300000_3(context, (Context) placeholderInfoModel2, (PlaceholderInfoModel) map, (Map<String, String>) 1));
        return spannableString2;
    }
}
