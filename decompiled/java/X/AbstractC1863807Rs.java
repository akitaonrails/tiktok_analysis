package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07Rs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1863807Rs implements InterfaceC844930XCp {
    public abstract String LIZLLL();

    @Override // X.InterfaceC844930XCp
    public final Map<String, String> LIZ() {
        String strLIZLLL = LIZLLL();
        HashMap map = new HashMap();
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        map.put("x-tt-dt", strLIZLLL);
        return map;
    }
}
