package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596610Nad extends AbstractC596640Nag {
    public final C00C2 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C596610Nad) && Intrinsics.LJFF(this.LIZIZ, ((C596610Nad) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(result=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C596610Nad(C00C2 c00c2) {
        super("success");
        this.LIZIZ = c00c2;
    }
}
