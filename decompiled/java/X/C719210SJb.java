package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0SJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719210SJb {
    public final CharSequence LIZ;
    public final int LIZIZ;
    public final Map<String, String> LIZJ;
    public int LIZLLL;
    public int LJ;

    public C719210SJb() {
        this((CharSequence) null, 0, 7);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MarkupObject(name=");
        sbLIZ.append((Object) this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", attributes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startOfMarkup=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", endOfMarkup=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C719210SJb(CharSequence charSequence, int i, int i2) {
        Map mapLJ;
        charSequence = (i2 & 1) != 0 ? "" : charSequence;
        i = (i2 & 2) != 0 ? -1 : i;
        if ((i2 & 4) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        this(charSequence, i, (Map<String, String>) mapLJ);
    }

    public C719210SJb(CharSequence charSequence, int i, Map<String, String> map) {
        this.LIZ = charSequence;
        this.LIZIZ = i;
        this.LIZJ = map;
    }
}
