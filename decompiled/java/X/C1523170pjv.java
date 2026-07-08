package X;

import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: renamed from: X.0pjv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523170pjv {
    public final long LIZ;
    public final String LIZIZ;

    public final String toString() {
        String str = ((DateFormat) C1523190pjx.LIZJ.getValue()).format(new Date(this.LIZ));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1523170pjv(long j, String str) {
        this.LIZ = j;
        this.LIZIZ = str;
    }
}
