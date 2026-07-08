package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1945807jk {
    public static final LinkedHashMap<String, String> LIZ(Uri uri) {
        String encodedQuery;
        String string;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (uri.isOpaque() || (encodedQuery = uri.getEncodedQuery()) == null) {
            return linkedHashMap;
        }
        Iterator<Object> it2 = new C1957407lc(new C1421605hO(encodedQuery, '&', null)).iterator();
        while (true) {
            C2152008bu c2152008bu = (C2152008bu) it2;
            if (c2152008bu.hasNext()) {
                CharSequence charSequence = (CharSequence) c2152008bu.next();
                int iLJJIZ = a0.LJJIZ(charSequence, '=', 0, false, 6);
                if (iLJJIZ == -1) {
                    iLJJIZ = charSequence.length();
                }
                if (iLJJIZ != 0) {
                    String string2 = charSequence.subSequence(0, iLJJIZ).toString();
                    if (iLJJIZ < charSequence.length()) {
                        string = charSequence.subSequence(iLJJIZ + 1, charSequence.length()).toString();
                    } else {
                        string = "";
                    }
                    linkedHashMap.put(Uri.decode(string2), Uri.decode(string));
                }
            } else {
                return linkedHashMap;
            }
        }
    }
}
