package X;

import com.google.gson.n;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0ueh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712130ueh {
    public static final C1712130ueh LIZ = new C1712130ueh();
    public static InterfaceC902903fv LIZIZ;
    public static EnumC1712120ueg LIZJ;

    public static void LIZ(Integer num, String str, HashMap map) {
        n nVar = new n();
        nVar.LJJIIJ("nfc_status", str);
        if (map != null) {
            n nVar2 = new n();
            for (String str2 : map.keySet()) {
                nVar2.LJJIIJ(str2, (String) map.get(str2));
            }
            nVar.LJJIFFI("scan_result", nVar2);
        }
        if (num != null) {
            nVar.LJJIII(Integer.valueOf(num.intValue()), "error_code");
        }
        new C1548870qPN().LJ("pipo_nfc_scan_result", nVar.toString());
    }
}
