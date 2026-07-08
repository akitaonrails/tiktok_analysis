package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157240gDi {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157240gDi)) {
            return false;
        }
        C1157240gDi c1157240gDi = (C1157240gDi) obj;
        return Intrinsics.LJFF(this.LIZ, c1157240gDi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1157240gDi.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionNotice(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", color=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157240gDi() {
        this("", "");
    }

    public C1157240gDi(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
