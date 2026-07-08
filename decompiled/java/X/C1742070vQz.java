package X;

import android.text.TextUtils;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0vQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1742070vQz {
    public static String LIZ(Iterable<String> iterable) {
        if (iterable == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : iterable) {
            C20137213qk.LIZ("individual scopes cannot be null or empty", !TextUtils.isEmpty(str));
            linkedHashSet.add(str);
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(" ", linkedHashSet);
    }
}
