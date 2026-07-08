package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.103v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191853103v {
    public static C191852103u LIZIZ(C104A[] c104aArr) {
        C191852103u c191852103u = new C191852103u();
        c191852103u.LIZLLL = null;
        C19719612Di.LJJII(c191852103u.LJ, c104aArr);
        return c191852103u;
    }

    public static C191852103u LIZ(CharSequence charSequence, List list, C103N c103n, int i) {
        if ((i & 4) != 0) {
            c103n = null;
        }
        C191852103u c191852103u = new C191852103u();
        if (charSequence != null) {
            c191852103u.LIZLLL = new C103N(charSequence);
        }
        c191852103u.LJI = c103n;
        ((ArrayList) c191852103u.LJ).addAll(list);
        return c191852103u;
    }
}
