package X;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767670U9l<T> implements Comparator {
    public static final C767670U9l<T> LL = new C767670U9l<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C767640U9i c767640U9i = (C767640U9i) obj;
        C767640U9i c767640U9i2 = (C767640U9i) obj2;
        if (c767640U9i2.LJ.getPriority() > c767640U9i.LJ.getPriority()) {
            return 1;
        }
        if (c767640U9i2.LJ.getPriority() >= c767640U9i.LJ.getPriority()) {
            EnumC767650U9j enumC767650U9j = c767640U9i.LJ;
            EnumC767650U9j enumC767650U9j2 = EnumC767650U9j.CO_HOST_SAME;
            if (enumC767650U9j == enumC767650U9j2 && c767640U9i2.LJ == enumC767650U9j2) {
                return Intrinsics.LJII(c767640U9i2.LIZJ, c767640U9i.LIZJ);
            }
            if (enumC767650U9j != enumC767650U9j2) {
                return 1;
            }
            return -1;
        }
        return -1;
    }
}
