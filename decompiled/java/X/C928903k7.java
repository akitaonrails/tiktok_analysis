package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeRichText;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.03k7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C928903k7 {
    public final String LIZ;

    public C928903k7(String str) {
        this.LIZ = str;
    }

    public static void LIZIZ(Map map, StringBuilder sb) {
        String str;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                ExtraFeeRichText extraFeeRichText = (ExtraFeeRichText) entry.getValue();
                int iIndexOf = sb.indexOf(str2);
                if (iIndexOf >= 0) {
                    int length = str2.length() + iIndexOf;
                    if (extraFeeRichText == null || (str = extraFeeRichText.text) == null) {
                        str = "these banks";
                    }
                    sb.replace(iIndexOf, length, str);
                } else {
                    EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR17;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PaymentRichTextHelper: ");
                    sbLIZ.append(str2);
                    sbLIZ.append(" starling key not found");
                    C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), null);
                }
            }
        }
    }

    public final SpannableStringBuilder LIZ(View view, StringBuilder sb, Map<String, ExtraFeeRichText> map) {
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
        if (map != null && (!map.isEmpty())) {
            Iterator<Map.Entry<String, ExtraFeeRichText>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                ExtraFeeRichText value = it2.next().getValue();
                if (value != null && (str = value.text) != null) {
                    int iIndexOf = sb.indexOf(str);
                    int length = value.text.length() + iIndexOf;
                    if (iIndexOf < 0 || length >= sb.length()) {
                        break;
                    }
                    C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iIndexOf, length, 17);
                    C786410Ut5.q2(spannableStringBuilder, new C04J5(view, this, value, 0), iIndexOf, length, 17);
                }
            }
        }
        return spannableStringBuilder;
    }
}
