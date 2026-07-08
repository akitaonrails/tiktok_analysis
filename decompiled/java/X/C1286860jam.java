package X;

import java.text.Normalizer;
import java.util.Comparator;

/* JADX INFO: renamed from: X.0jam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286860jam<T> implements Comparator {
    public static final C1286860jam<T> LL = new C1286860jam<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int iCompareTo = Normalizer.normalize(str, Normalizer.Form.NFC).compareTo(Normalizer.normalize(str2, Normalizer.Form.NFC));
        if (iCompareTo == 0) {
            return str.compareTo(str2);
        }
        return iCompareTo;
    }
}
