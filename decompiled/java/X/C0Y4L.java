package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y4L, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y4L extends C0Y4K {
    public final C0Y8T LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Y4L)) {
            return false;
        }
        C0Y4L c0y4l = (C0Y4L) obj;
        return Intrinsics.LJFF(this.LIZ, c0y4l.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0y4l.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(fakeConversation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Y4L(C0Y8T c0y8t, String str) {
        int i = C0YIF.LIZ;
        this.LIZ = c0y8t;
        this.LIZIZ = str;
    }
}
