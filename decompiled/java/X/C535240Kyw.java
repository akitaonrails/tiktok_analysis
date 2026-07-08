package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535240Kyw {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final List<C535230Kyv> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C535240Kyw)) {
            return false;
        }
        C535240Kyw c535240Kyw = (C535240Kyw) obj;
        return this.LIZ == c535240Kyw.LIZ && this.LIZIZ == c535240Kyw.LIZIZ && Intrinsics.LJFF(this.LIZJ, c535240Kyw.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiSelfResultResp(anyInProcess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", aiSelfResultList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C535240Kyw(boolean z, boolean z2, List<C535230Kyv> list) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = list;
    }
}
