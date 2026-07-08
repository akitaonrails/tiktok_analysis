package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0FLI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FLI {
    public static final C0FLJ LIZ(int i, int i2, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C0FLJ c0flj = (C0FLJ) it2.next();
            if (c0flj.LIZ(i, i2)) {
                return c0flj;
            }
        }
        return null;
    }
}
