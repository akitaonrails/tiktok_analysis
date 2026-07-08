package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0foj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141750foj {
    public static final ConcurrentHashMap<String, InterfaceC1142460fps> LIZ = new ConcurrentHashMap<>();
    public static String LIZIZ = "";
    public static C1141750foj LIZJ;

    public static String LIZ(int i, C1141100fng c1141100fng) {
        String str;
        List<String> list = c1141100fng.LJ;
        if (list != null && list.size() > 1) {
            str = "support_multi_res";
        } else {
            str = "not_support_multi_res";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
