package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.03kI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C930003kI implements InterfaceC930603kO {
    public static C922003j0 LIZIZ(C930103kJ c930103kJ) {
        C922003j0 c922003j0 = new C922003j0();
        c922003j0.LIZ = true;
        if (c930103kJ.LIZLLL == null) {
            c930103kJ.LIZLLL = new ArrayList();
        }
        Iterator it2 = ((ArrayList) c930103kJ.LIZLLL).iterator();
        if (!it2.hasNext()) {
            if (TextUtils.equals(c930103kJ.LJ, "R") && TextUtils.isEmpty(c930103kJ.LJI)) {
                c922003j0.LIZ = false;
                c922003j0.LIZIZ("empty_content", new String[0]);
            }
            return c922003j0;
        }
        Object next = it2.next();
        new C922003j0();
        next.getClass();
        throw null;
    }

    @Override // X.InterfaceC930603kO
    public final C922003j0 LIZ(C930103kJ... c930103kJArr) {
        C922003j0 c922003j0LIZIZ = LIZIZ(c930103kJArr[0]);
        if (c930103kJArr.length > 1) {
            for (C930103kJ c930103kJ : c930103kJArr) {
                C922003j0 c922003j0LIZIZ2 = LIZIZ(c930103kJ);
                if (c922003j0LIZIZ.LJ == null) {
                    c922003j0LIZIZ.LJ = new ArrayList();
                }
                ((ArrayList) c922003j0LIZIZ.LJ).add(c922003j0LIZIZ2);
            }
        }
        return c922003j0LIZIZ;
    }
}
