package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382110EyX {
    public final EnumC382100EyW LIZ;
    public final List<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382110EyX)) {
            return false;
        }
        C382110EyX c382110EyX = (C382110EyX) obj;
        return this.LIZ == c382110EyX.LIZ && Intrinsics.LJFF(this.LIZIZ, c382110EyX.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CurQuotaRequest(modelType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", queriesReqKeys=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C382110EyX(EnumC382100EyW enumC382100EyW, List<String> list) {
        this.LIZ = enumC382100EyW;
        this.LIZIZ = list;
    }
}
