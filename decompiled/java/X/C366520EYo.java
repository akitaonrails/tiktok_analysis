package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366520EYo extends AbstractC366540EYq {
    public final String LIZIZ;
    public final Pair<List<C0EQL>, C05WK> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C366520EYo)) {
            return false;
        }
        C366520EYo c366520EYo = (C366520EYo) obj;
        return Intrinsics.LJFF(this.LIZIZ, c366520EYo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c366520EYo.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZIZ.hashCode() * 31;
        Pair<List<C0EQL>, C05WK> pair = this.LIZJ;
        return iHashCode + (pair == null ? 0 : pair.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(resId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", miniDraftResult=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC366540EYq
    public final String LIZ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C366520EYo(String str, Pair<? extends List<C0EQL>, C05WK> pair) {
        super(str);
        this.LIZIZ = str;
        this.LIZJ = pair;
    }
}
