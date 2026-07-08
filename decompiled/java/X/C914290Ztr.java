package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Ztr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C914290Ztr {
    public static final C914290Ztr LIZ = new C914290Ztr();
    public static final List<String> LIZIZ = new ArrayList();

    public static String LIZIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final synchronized boolean LIZ(String str, String str2) {
        return ((ArrayList) LIZIZ).contains(LIZIZ(str, str2));
    }
}
