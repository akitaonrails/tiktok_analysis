package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dVQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1052900dVQ extends AbstractC1052910dVR {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1052900dVQ) && Intrinsics.LJFF(this.LIZ, ((C1052900dVQ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Translated(translatedText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1052900dVQ(String str) {
        this.LIZ = str;
    }
}
