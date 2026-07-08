package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0DQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339010DQt {
    public static final /* synthetic */ int LIZJ = 0;
    public final List<Integer> LIZ;
    public final int LIZIZ;

    public C339010DQt(List<Integer> list) {
        this.LIZ = list;
        if (!(list instanceof Collection) || !list.isEmpty()) {
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
