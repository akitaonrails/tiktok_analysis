package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0lVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360590lVh {
    public static final List<String> LIZIZ(String str) {
        ArrayList arrayList = new ArrayList();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
        characterInstance.setText(str);
        int iFirst = characterInstance.first();
        int next = characterInstance.next();
        while (true) {
            int i = iFirst;
            iFirst = next;
            if (next != -1) {
                arrayList.add(str.substring(i, next));
                next = characterInstance.next();
            } else {
                return arrayList;
            }
        }
    }

    public static final int LIZ(int i, List list) {
        int i2 = 0;
        while (i > 0 && i2 < ((ArrayList) list).size()) {
            i -= ((String) ListProtector.get(list, i2)).length();
            i2++;
        }
        return i2;
    }
}
