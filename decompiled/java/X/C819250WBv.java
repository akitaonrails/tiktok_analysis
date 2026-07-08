package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0WBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819250WBv extends C0WC8 {
    public String LIZ;
    public Integer LIZIZ;
    public C0WCB LIZJ;
    public Long LIZLLL;
    public Long LJ;
    public Map<String, String> LJFF;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0WCF] */
    public final C0WCF LIZIZ() {
        String strLIZIZ = "";
        if (this.LIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(" transportName");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LIZJ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" encodedPayload");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (this.LIZLLL == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" eventMillis");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (this.LJ == null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(" uptimeMillis");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (this.LJFF == null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append(" autoMetadata");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
        }
        if (!strLIZIZ.isEmpty()) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("Missing required properties:");
            sbLIZ6.append(strLIZIZ);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ6));
        }
        final String str = this.LIZ;
        final Integer num = this.LIZIZ;
        final C0WCB c0wcb = this.LIZJ;
        final long jLongValue = this.LIZLLL.longValue();
        final long jLongValue2 = this.LJ.longValue();
        final Map<String, String> map = this.LJFF;
        return new C0WCG(str, num, c0wcb, jLongValue, jLongValue2, map) { // from class: X.0WCF
            public final String LIZ;
            public final Integer LIZIZ;
            public final C0WCB LIZJ;
            public final long LIZLLL;
            public final long LJ;
            public final Map<String, String> LJFF;

            public final int hashCode() {
                int iHashCode = (this.LIZ.hashCode() ^ 1000003) * 1000003;
                Integer num2 = this.LIZIZ;
                int iHashCode2 = (((iHashCode ^ (num2 == null ? 0 : num2.hashCode())) * 1000003) ^ this.LIZJ.hashCode()) * 1000003;
                long j = this.LIZLLL;
                int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
                long j2 = this.LJ;
                return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.LJFF.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("EventInternal{transportName=");
                sbLIZ7.append(this.LIZ);
                sbLIZ7.append(", code=");
                sbLIZ7.append(this.LIZIZ);
                sbLIZ7.append(", encodedPayload=");
                sbLIZ7.append(this.LIZJ);
                sbLIZ7.append(", eventMillis=");
                sbLIZ7.append(this.LIZLLL);
                sbLIZ7.append(", uptimeMillis=");
                sbLIZ7.append(this.LJ);
                sbLIZ7.append(", autoMetadata=");
                sbLIZ7.append(this.LJFF);
                sbLIZ7.append("}");
                return C2188811AlT.LIZIZ(sbLIZ7);
            }

            @Override // X.C0WCG
            public final Map<String, String> LIZIZ() {
                return this.LJFF;
            }

            @Override // X.C0WCG
            public final Integer LIZJ() {
                return this.LIZIZ;
            }

            @Override // X.C0WCG
            public final C0WCB LIZLLL() {
                return this.LIZJ;
            }

            @Override // X.C0WCG
            public final long LJ() {
                return this.LIZLLL;
            }

            @Override // X.C0WCG
            public final String LJI() {
                return this.LIZ;
            }

            @Override // X.C0WCG
            public final long LJII() {
                return this.LJ;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof C0WCG)) {
                    return false;
                }
                C0WCG c0wcg = (C0WCG) obj;
                if (this.LIZ.equals(c0wcg.LJI())) {
                    Integer num2 = this.LIZIZ;
                    if (num2 == null) {
                        if (c0wcg.LIZJ() != null) {
                            return false;
                        }
                    } else if (!num2.equals(c0wcg.LIZJ())) {
                        return false;
                    }
                    if (this.LIZJ.equals(c0wcg.LIZLLL()) && this.LIZLLL == c0wcg.LJ() && this.LJ == c0wcg.LJII() && this.LJFF.equals(c0wcg.LIZIZ())) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            {
                this.LIZ = str;
                this.LIZIZ = num;
                this.LIZJ = c0wcb;
                this.LIZLLL = jLongValue;
                this.LJ = jLongValue2;
                this.LJFF = map;
            }
        };
    }

    public final C819250WBv LIZJ(C0WCB c0wcb) {
        if (c0wcb != null) {
            this.LIZJ = c0wcb;
            return this;
        }
        throw new NullPointerException("Null encodedPayload");
    }

    public final C819250WBv LIZLLL(String str) {
        if (str != null) {
            this.LIZ = str;
            return this;
        }
        throw new NullPointerException("Null transportName");
    }
}
