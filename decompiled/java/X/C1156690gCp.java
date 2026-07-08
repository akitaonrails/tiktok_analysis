package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156690gCp extends AbstractC1156680gCo {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1156690gCp) && Intrinsics.LJFF(this.LIZ, ((C1156690gCp) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchTemplateSucceeded(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156690gCp(String str) {
        this.LIZ = str;
    }
}
