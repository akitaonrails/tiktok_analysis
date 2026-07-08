package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868220Y4e {
    public final String LIZ;
    public final InterfaceC868050Y3n LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C868220Y4e)) {
            return false;
        }
        C868220Y4e c868220Y4e = (C868220Y4e) obj;
        return Intrinsics.LJFF(this.LIZ, c868220Y4e.LIZ) && Intrinsics.LJFF(this.LIZIZ, c868220Y4e.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConvConversationObserver(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", observer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C868220Y4e(String str, InterfaceC868050Y3n interfaceC868050Y3n) {
        this.LIZ = str;
        this.LIZIZ = interfaceC868050Y3n;
    }
}
