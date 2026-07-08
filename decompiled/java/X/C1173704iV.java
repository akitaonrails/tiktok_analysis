package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04iV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1173704iV {
    public String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1173704iV) && Intrinsics.LJFF(this.LIZ, ((C1173704iV) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollTopicContent(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1173704iV(String str) {
        this.LIZ = str;
    }
}
