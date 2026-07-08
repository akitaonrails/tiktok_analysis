package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dIH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044750dIH {
    public static final C1044750dIH LIZ = new C1044750dIH();
    public static final ConcurrentHashMap<String, C1044760dII> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str) {
        C1044760dII c1044760dIIRemove;
        if (str != null && !a0.LJJJIL(str) && (c1044760dIIRemove = LIZIZ.remove(str)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clear manager, containerId=");
            sbLIZ.append(str);
            C1022620cia.LIZ("ShoppingTaskReportHelper", C2188811AlT.LIZIZ(sbLIZ));
            c1044760dIIRemove.LIZIZ();
        }
    }
}
