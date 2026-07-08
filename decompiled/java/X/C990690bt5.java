package X;

import java.util.Set;

/* JADX INFO: renamed from: X.0bt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990690bt5 {
    public static int LIZ(Set set) {
        int iHashCode;
        int i = 0;
        for (Object obj : set) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i += iHashCode;
        }
        return i;
    }
}
