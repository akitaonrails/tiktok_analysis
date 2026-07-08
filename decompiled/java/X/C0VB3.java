package X;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0VB3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VB3 {
    public static volatile C0VB3 LJ = new C0VB3();
    public C0V6K LIZIZ;
    public final Set<C0VB7> LIZ = new HashSet();
    public int LIZJ = 80;
    public int LIZLLL = 5;

    public final synchronized void LIZ(C0VB7 c0vb7) {
        if (c0vb7 == null) {
            return;
        }
        ((HashSet) this.LIZ).add(c0vb7);
    }

    public final void LIZIZ(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.LIZJ = i;
            this.LIZLLL = i2;
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("weed out config:maxSizeMB:");
                sbLIZ.append(i);
                sbLIZ.append(" keepDays:");
                sbLIZ.append(i2);
                C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
