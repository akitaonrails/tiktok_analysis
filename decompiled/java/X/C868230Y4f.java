package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868230Y4f {
    public final String LIZ;
    public final InterfaceC868420Y4y LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C868230Y4f)) {
            return false;
        }
        C868230Y4f c868230Y4f = (C868230Y4f) obj;
        return Intrinsics.LJFF(this.LIZ, c868230Y4f.LIZ) && Intrinsics.LJFF(this.LIZIZ, c868230Y4f.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConvMessageObserver(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", observer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C868230Y4f(String str, InterfaceC868420Y4y interfaceC868420Y4y) {
        this.LIZ = str;
        this.LIZIZ = interfaceC868420Y4y;
    }
}
