package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jkp.j;

/* JADX INFO: renamed from: X.0to8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679540to8 {
    public final Locale LIZ;
    public List<String> LIZIZ;
    public long[] LIZJ;
    public long LIZLLL;
    public final C05P0 LJ;
    public final C05P0 LJFF;

    public C1679540to8() {
        this(0);
    }

    public C1679540to8(int i) {
        this.LIZ = Locale.getDefault();
        this.LIZIZ = C13BV.INSTANCE;
        this.LIZJ = new long[0];
        this.LJ = C20028913Yh.LJI("");
        this.LJFF = C20028913Yh.LJI(j.LLILLL);
    }

    public final List<String> LIZIZ(String str) {
        if (str.length() == 0) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        BreakIterator wordInstance = BreakIterator.getWordInstance(this.LIZ);
        wordInstance.setText(str);
        int iFirst = wordInstance.first();
        int next = wordInstance.next();
        while (true) {
            int i = iFirst;
            iFirst = next;
            if (next != -1) {
                arrayList.add(str.substring(i, next));
                next = wordInstance.next();
            } else {
                return arrayList;
            }
        }
    }

    public static String LIZ(int i, int i2, List list) {
        StringBuilder sb = new StringBuilder();
        while (i < i2) {
            sb.append((String) ListProtector.get(list, i));
            i++;
        }
        return sb.toString();
    }
}
