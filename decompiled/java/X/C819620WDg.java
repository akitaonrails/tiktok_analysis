package X;

import java.util.Set;

/* JADX INFO: renamed from: X.0WDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819620WDg extends C0WEG {
    public Long LIZ;
    public Long LIZIZ;
    public Set<EnumC819580WDc> LIZJ;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0WDe] */
    public final C819600WDe LIZ() {
        String strLIZIZ = "";
        if (this.LIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(" delta");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (this.LIZIZ == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" maxAllowedDelay");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (this.LIZJ == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" flags");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (strLIZIZ.isEmpty()) {
            final long jLongValue = this.LIZ.longValue();
            final long jLongValue2 = this.LIZIZ.longValue();
            final Set<EnumC819580WDc> set = this.LIZJ;
            return new AbstractC819590WDd(jLongValue, jLongValue2, set) { // from class: X.0WDe
                public final long LIZ;
                public final long LIZIZ;
                public final Set<EnumC819580WDc> LIZJ;

                public final int hashCode() {
                    long j = this.LIZ;
                    int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
                    long j2 = this.LIZIZ;
                    return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.LIZJ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("ConfigValue{delta=");
                    sbLIZ4.append(this.LIZ);
                    sbLIZ4.append(", maxAllowedDelay=");
                    sbLIZ4.append(this.LIZIZ);
                    sbLIZ4.append(", flags=");
                    sbLIZ4.append(this.LIZJ);
                    sbLIZ4.append("}");
                    return C2188811AlT.LIZIZ(sbLIZ4);
                }

                @Override // X.AbstractC819590WDd
                public final long LIZ() {
                    return this.LIZ;
                }

                @Override // X.AbstractC819590WDd
                public final Set<EnumC819580WDc> LIZIZ() {
                    return this.LIZJ;
                }

                @Override // X.AbstractC819590WDd
                public final long LIZJ() {
                    return this.LIZIZ;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof AbstractC819590WDd)) {
                        return false;
                    }
                    AbstractC819590WDd abstractC819590WDd = (AbstractC819590WDd) obj;
                    if (this.LIZ == abstractC819590WDd.LIZ() && this.LIZIZ == abstractC819590WDd.LIZJ() && this.LIZJ.equals(abstractC819590WDd.LIZIZ())) {
                        return true;
                    }
                    return false;
                }

                {
                    this.LIZ = jLongValue;
                    this.LIZIZ = jLongValue2;
                    this.LIZJ = set;
                }
            };
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Missing required properties:");
        sbLIZ4.append(strLIZIZ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ4));
    }
}
