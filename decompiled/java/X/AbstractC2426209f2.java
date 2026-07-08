package X;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: X.09f2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2426209f2 {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09f0] */
    public final C2426009f0 LIZ() {
        C2426309f3 c2426309f3 = (C2426309f3) this;
        Map map = c2426309f3.LIZIZ;
        if (map == null) {
            throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        if (mapUnmodifiableMap == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        c2426309f3.LIZIZ = mapUnmodifiableMap;
        final Integer num = c2426309f3.LIZ;
        final Map map2 = c2426309f3.LIZIZ;
        return new AbstractC2426109f1(num, map2) { // from class: X.09f0
            public final Integer LIZIZ;
            public final Map LIZJ;

            {
                this.LIZIZ = num;
                this.LIZJ = map2;
            }

            @Override // X.AbstractC2426109f1
            public final Integer LIZ() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC2426109f1
            public final Map LIZIZ() {
                return this.LIZJ;
            }

            public final int hashCode() {
                Integer num2 = this.LIZIZ;
                return (((num2 == null ? 0 : num2.hashCode()) ^ 1000003) * 1000003) ^ this.LIZJ.hashCode();
            }

            public final String toString() {
                Integer num2 = this.LIZIZ;
                String strValueOf = String.valueOf(this.LIZJ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LocalTestingConfig{defaultSplitInstallErrorCode=");
                sbLIZ.append(num2);
                sbLIZ.append(", splitInstallErrorCodeByModule=");
                sbLIZ.append(strValueOf);
                sbLIZ.append("}");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof AbstractC2426109f1) {
                    AbstractC2426109f1 abstractC2426109f1 = (AbstractC2426109f1) obj;
                    Integer num2 = this.LIZIZ;
                    if (num2 != null ? num2.equals(abstractC2426109f1.LIZ()) : abstractC2426109f1.LIZ() == null) {
                        if (this.LIZJ.equals(abstractC2426109f1.LIZIZ())) {
                            return true;
                        }
                    }
                }
                return false;
            }
        };
    }
}
