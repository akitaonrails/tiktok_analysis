package X;

import java.util.HashSet;

/* JADX INFO: renamed from: X.0C4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C307720C4k {
    public final C307760C4o LIZ = C307760C4o.LIZJ;

    public static final boolean LIZ(String str) {
        boolean zContains = ((HashSet) C307700C4i.LIZ.getValue()).contains(str);
        if (!zContains && !C307700C4i.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("launch_key:");
            sbLIZ.append(str);
            C0C46.LIZIZ("IConfigRepo", new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
        }
        return zContains;
    }
}
