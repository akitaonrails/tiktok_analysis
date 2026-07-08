package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0bqu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989340bqu {
    public final List<Integer> LIZ;
    public final int LIZIZ;

    public C989340bqu(List<Integer> list) {
        this.LIZ = list;
        if (!list.isEmpty()) {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().intValue() <= 0) {
                    String str = "All group sizes must be > 0: " + this.LIZ;
                    str.toString();
                    throw new IllegalArgumentException(str);
                }
            }
        }
        this.LIZIZ = C13LP.LJZI(this.LIZ);
    }
}
