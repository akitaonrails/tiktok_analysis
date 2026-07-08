package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09JF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09JF extends C09JG {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C09JF) && Intrinsics.LJFF(this.LIZ, ((C09JF) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RetryDownloadTaskInput(downloadUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C09JF(String str) {
        this.LIZ = str;
    }
}
