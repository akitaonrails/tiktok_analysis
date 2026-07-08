package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0uLK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700120uLK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, C1875510yuD c1875510yuD) {
        String str3;
        C1700060uLE.LIZIZ.getValue().getClass();
        List listLIZ = C1700060uLE.LIZ(str, str2);
        if (listLIZ != null) {
            Iterator it2 = ((ArrayList) listLIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1700130uLL) it2.next()).LIZIZ();
            }
            if (c1875510yuD != null) {
                c1875510yuD.LIZIZ();
                return;
            }
            return;
        }
        if (str2 != null) {
            str3 = "The socketTaskID doesn't exist";
        } else {
            str3 = "The containerID doesn't exist";
        }
        if (c1875510yuD != null) {
            c1875510yuD.LIZ(str3);
        }
    }
}
