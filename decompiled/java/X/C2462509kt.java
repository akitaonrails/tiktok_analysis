package X;

import java.util.Date;

/* JADX INFO: renamed from: X.09kt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2462509kt extends AbstractC2462609ku {
    public Integer LIZ;
    public Integer LIZIZ;
    public Integer LIZJ;
    public Date LIZLLL;
    public String LJ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.10W8] */
    public final C10W8 LIZ() {
        final Integer num = this.LIZ;
        final Integer num2 = this.LIZIZ;
        final Integer num3 = this.LIZJ;
        final Date date = this.LIZLLL;
        final String str = this.LJ;
        return new C10WA(num, num2, num3, date, str) { // from class: X.10W8
            public final Integer LIZ;
            public final Integer LIZIZ;
            public final Integer LIZJ;
            public final Date LIZLLL;
            public final String LJ;

            {
                this.LIZ = num;
                this.LIZIZ = num2;
                this.LIZJ = num3;
                this.LIZLLL = date;
                this.LJ = str;
            }

            @Override // X.C10WA
            public final Integer LIZ() {
                return this.LIZIZ;
            }

            @Override // X.C10WA
            public final Integer LIZIZ() {
                return this.LIZJ;
            }

            @Override // X.C10WA
            public final String LIZJ() {
                return this.LJ;
            }

            @Override // X.C10WA
            public final Date LIZLLL() {
                return this.LIZLLL;
            }

            @Override // X.C10WA
            public final Integer LJ() {
                return this.LIZ;
            }

            public final int hashCode() {
                Integer num4 = this.LIZ;
                int iHashCode = num4 == null ? 0 : num4.hashCode();
                Integer num5 = this.LIZIZ;
                int iHashCode2 = num5 == null ? 0 : num5.hashCode();
                int i = iHashCode ^ 1000003;
                Integer num6 = this.LIZJ;
                int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (num6 == null ? 0 : num6.hashCode())) * 1000003;
                Date date2 = this.LIZLLL;
                int iHashCode4 = (iHashCode3 ^ (date2 == null ? 0 : date2.hashCode())) * 1000003;
                String str2 = this.LJ;
                return iHashCode4 ^ (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                String strValueOf = String.valueOf(this.LIZLLL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AgeSignalsResult{userStatus=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", ageLower=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", ageUpper=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", mostRecentApprovalDate=");
                sbLIZ.append(strValueOf);
                sbLIZ.append(", installId=");
                sbLIZ.append(this.LJ);
                sbLIZ.append("}");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof C10WA) {
                    C10WA c10wa = (C10WA) obj;
                    Integer num4 = this.LIZ;
                    if (num4 != null ? num4.equals(c10wa.LJ()) : c10wa.LJ() == null) {
                        Integer num5 = this.LIZIZ;
                        if (num5 != null ? num5.equals(c10wa.LIZ()) : c10wa.LIZ() == null) {
                            Integer num6 = this.LIZJ;
                            if (num6 != null ? num6.equals(c10wa.LIZIZ()) : c10wa.LIZIZ() == null) {
                                Date date2 = this.LIZLLL;
                                if (date2 != null ? date2.equals(c10wa.LIZLLL()) : c10wa.LIZLLL() == null) {
                                    String str2 = this.LJ;
                                    if (str2 != null ? str2.equals(c10wa.LIZJ()) : c10wa.LIZJ() == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }
        };
    }
}
