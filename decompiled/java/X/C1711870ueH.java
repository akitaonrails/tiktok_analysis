package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichText;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoRichTextAttribute;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.richtext.PipoTextAttribute;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ueH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1711870ueH {
    public static final String LIZ(PipoRichText pipoRichText) {
        String strLJJIFFI;
        PipoRichTextAttribute pipoRichTextAttribute;
        PipoTextAttribute pipoTextAttribute;
        String str;
        if (pipoRichText == null || (strLJJIFFI = pipoRichText.template) == null || !(!a0.LJJJIL(strLJJIFFI))) {
            return null;
        }
        Map<String, PipoRichTextAttribute> mapLJ = pipoRichText.arguments;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Iterator<T> it2 = mapLJ.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            if (!(!a0.LJJJIL((String) key))) {
                key = null;
            }
            String str2 = (String) key;
            if (str2 != null && (pipoRichTextAttribute = (PipoRichTextAttribute) entry.getValue()) != null && (pipoTextAttribute = pipoRichTextAttribute.textAttribute) != null && (str = pipoTextAttribute.text) != null && (!a0.LJJJIL(str))) {
                strLJJIFFI = u.LJJIFFI(strLJJIFFI, str2, str, false);
            }
        }
        return strLJJIFFI;
    }
}
