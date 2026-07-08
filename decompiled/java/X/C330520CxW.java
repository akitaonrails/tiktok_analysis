package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330520CxW {
    public final String LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C330520CxW)) {
            return false;
        }
        C330520CxW c330520CxW = (C330520CxW) obj;
        return Intrinsics.LJFF(this.LIZ, c330520CxW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c330520CxW.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryViewerPayloadWrapper(clazz=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C330520CxW(String str, Object obj) {
        this.LIZ = str;
        this.LIZIZ = obj;
    }
}
