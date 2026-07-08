package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1379100lzY implements InterfaceC1380660m24 {
    public String LIZ;
    public final String LIZIZ;

    public C1379100lzY() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1379100lzY)) {
            return false;
        }
        C1379100lzY c1379100lzY = (C1379100lzY) obj;
        return Intrinsics.LJFF(this.LIZ, c1379100lzY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1379100lzY.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LongPressContainer(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nodeType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1380660m24
    public final String getNodeType() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1380660m24
    public final void setKey(String str) {
        this.LIZ = str;
    }

    public C1379100lzY(String str, int i) {
        str = (i & 1) != 0 ? null : str;
        String str2 = (i & 2) != 0 ? "container" : null;
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
