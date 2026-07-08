package X;

import java.util.List;

/* JADX INFO: renamed from: X.0iyq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263340iyq extends AbstractC1263470iz3 {
    public boolean LIZ = true;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Dynamic(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1263470iz3
    public final C1263310iyn LIZ(C1263310iyn c1263310iyn, C1263310iyn c1263310iyn2) {
        if (this.LIZ) {
            return C1263150iyX.LIZ.LIZ(c1263310iyn, c1263310iyn2);
        }
        return new AbstractC1263470iz3() { // from class: X.0iyx
            public final String toString() {
                return "OverrideMerge";
            }

            @Override // X.AbstractC1263470iz3
            public final C1263310iyn LIZ(C1263310iyn c1263310iyn3, C1263310iyn c1263310iyn4) {
                List listLIZ = C1263100iyS.LIZ(c1263310iyn4.LIZIZ);
                if (c1263310iyn3 != null && listLIZ != null && listLIZ.isEmpty()) {
                    return c1263310iyn3;
                }
                return c1263310iyn4;
            }
        }.LIZ(c1263310iyn, c1263310iyn2);
    }
}
