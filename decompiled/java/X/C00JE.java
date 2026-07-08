package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.00JE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00JE {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZ(int i, int i2, int i3) {
        if (i2 > 0) {
            return i2;
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i3));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            if (((Number) obj).intValue() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        return ((Number) Collections.min(arrayList)).intValue();
    }
}
