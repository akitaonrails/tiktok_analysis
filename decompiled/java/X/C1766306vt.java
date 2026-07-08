package X;

import java.util.Locale;

/* JADX INFO: renamed from: X.06vt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1766306vt {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getSimpleName().toUpperCase(Locale.ROOT));
        sbLIZ.append('_');
        sbLIZ.append(System.identityHashCode(obj));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
