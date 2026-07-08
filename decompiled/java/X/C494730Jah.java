package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Jah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494730Jah {
    public final List<C755640TkY> LIZ;
    public final int LIZIZ;

    public C494730Jah(C494720Jag c494720Jag) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        arrayList.addAll(c494720Jag.LIZ);
        this.LIZIZ = c494720Jag.LIZIZ;
    }

    public final C755640TkY LIZ(int i) {
        List<C755640TkY> list = this.LIZ;
        if (list != null && !((ArrayList) list).isEmpty()) {
            for (C755640TkY c755640TkY : (ArrayList) this.LIZ) {
                if (c755640TkY.LIZ() == i) {
                    return c755640TkY;
                }
            }
        }
        return null;
    }
}
