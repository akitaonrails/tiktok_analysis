package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QWD, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QWD {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QWD)) {
            return false;
        }
        C0QWD c0qwd = (C0QWD) obj;
        return Intrinsics.LJFF(this.LIZ, c0qwd.LIZ) && this.LIZIZ == c0qwd.LIZIZ && this.LIZJ == c0qwd.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputState(keyword=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFocus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromAIMode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QWD(String str, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
