package X;

import android.text.Editable;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0I1I, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I1I {
    public static final C0I10 LIZ(int i, Editable editable) {
        C0I1K c0i1k;
        C531650Kt9 it2 = C13LZ.LJIILJJIL(0, i).iterator();
        Object obj = null;
        while (it2.LLILLL) {
            Object next = it2.next();
            if (editable.charAt(((Number) next).intValue()) == '@') {
                obj = next;
            }
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return new C0I10(null, true);
        }
        Object[] spans = editable.getSpans(num.intValue(), i, C0I1K.class);
        if (spans != null && (c0i1k = (C0I1K) C13LQ.LJJJJIZL(spans)) != null) {
            C0I1L c0i1l = c0i1k.LIZLLL;
            if (c0i1l != null && c0i1l.LIZIZ <= i) {
                return new C0I10(LIZIZ(i, num.intValue(), editable), true);
            }
            return new C0I10(null, false);
        }
        String strLIZIZ = LIZIZ(i, num.intValue(), editable);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        return new C0I10(strLIZIZ, false);
    }

    public static final String LIZIZ(int i, int i2, Editable editable) {
        String string = editable.subSequence(i2 + 1, i).toString();
        if (a0.LJJIIZI(string, "  ", false) || a0.LJJIJ(string, '\n')) {
            return null;
        }
        return string;
    }
}
