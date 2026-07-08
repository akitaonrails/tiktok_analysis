package X;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0MvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583920MvG {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Map map) {
        Set<Map.Entry> setEntrySet;
        InterfaceC1602960roc interfaceC1602960rocLIZ = C0VWN.LIZ(str, false);
        if (map != null && (setEntrySet = ((HashMap) map).entrySet()) != null) {
            for (Map.Entry entry : setEntrySet) {
                interfaceC1602960rocLIZ.LIZ((String) entry.getKey(), (String) entry.getValue());
            }
        }
        interfaceC1602960rocLIZ.LIZJ(2000L);
    }
}
