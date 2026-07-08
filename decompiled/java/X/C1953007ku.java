package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.07ku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1953007ku {
    public static final String LIZ(Object obj) {
        String simpleName;
        if (obj.getClass().isAnonymousClass()) {
            simpleName = obj.getClass().getName();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(simpleName);
        sbLIZ.append('@');
        sbLIZ.append(C786410Ut5.j4("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
