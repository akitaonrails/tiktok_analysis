package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0miG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406820miG extends AbstractC1406870miL {
    public final String LIZ;
    public final int LIZIZ;
    public final Function1<Integer, Object> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406820miG)) {
            return false;
        }
        C1406820miG c1406820miG = (C1406820miG) obj;
        return Intrinsics.LJFF(this.LIZ, c1406820miG.LIZ) && this.LIZIZ == c1406820miG.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1406820miG.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DescriptionScroll(pageName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", getItem=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1406820miG(int i, String str, Function1 function1) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = function1;
    }
}
