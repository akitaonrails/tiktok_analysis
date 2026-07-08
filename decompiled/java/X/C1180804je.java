package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.04je, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1180804je {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForeignKey{referenceTable='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", onDelete='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", onUpdate='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", columnNames=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", referenceColumnNames=");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1180804je)) {
            return false;
        }
        C1180804je c1180804je = (C1180804je) obj;
        if (!this.LIZ.equals(c1180804je.LIZ) || !this.LIZIZ.equals(c1180804je.LIZIZ) || !this.LIZJ.equals(c1180804je.LIZJ) || !this.LIZLLL.equals(c1180804je.LIZLLL)) {
            return false;
        }
        return this.LJ.equals(c1180804je.LJ);
    }

    public C1180804je(String str, String str2, String str3, List<String> list, List<String> list2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = Collections.unmodifiableList(list);
        this.LJ = Collections.unmodifiableList(list2);
    }
}
