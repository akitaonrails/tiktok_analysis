package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Naf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596630Naf extends AbstractC596640Nag {
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C596630Naf) && Intrinsics.LJFF(this.LIZIZ, ((C596630Naf) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C596630Naf() {
        super("error");
        this.LIZIZ = "Unknown error";
    }
}
