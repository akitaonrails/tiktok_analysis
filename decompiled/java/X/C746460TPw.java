package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746460TPw extends AbstractC746450TPv {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ = 3;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C746460TPw)) {
            return false;
        }
        C746460TPw c746460TPw = (C746460TPw) obj;
        return Intrinsics.LJFF(this.LIZ, c746460TPw.LIZ) && this.LIZIZ == c746460TPw.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewAllItem(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sectionType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC746450TPv
    public final int LIZ() {
        return this.LIZJ;
    }

    public C746460TPw(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
