package X;

import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.TextAttribute;
import java.util.Map;

/* JADX INFO: renamed from: X.037d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7911037d {
    public static String LIZ(ECRichText eCRichText) {
        String str;
        TextAttribute textAttribute;
        String str2;
        if (eCRichText == null || (str = eCRichText.template) == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str3 = eCRichText.template;
        if (str3 != null) {
            sb.append(str3);
            Map<String, ECRichTextAttribute> map = eCRichText.arguments;
            if (map != null) {
                for (String str4 : map.keySet()) {
                    ECRichTextAttribute eCRichTextAttribute = map.get(str4);
                    if (eCRichTextAttribute != null && (textAttribute = eCRichTextAttribute.textAttribute) != null && (str2 = textAttribute.text) != null) {
                        C806503Db.LIZ(sb, str4, str2);
                    }
                }
            }
        }
        return sb.toString();
    }
}
