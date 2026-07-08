package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Clz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323370Clz implements InterfaceC323640CmQ<String> {
    public final String LIZ;
    public final int LIZIZ;

    public C323370Clz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C323370Clz)) {
            return false;
        }
        C323370Clz c323370Clz = (C323370Clz) obj;
        return Intrinsics.LJFF(this.LIZ, c323370Clz.LIZ) && this.LIZIZ == c323370Clz.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaFVideoLoadParams(pageToken=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", loadCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C323370Clz(int i) {
        this("", 15);
    }

    public C323370Clz(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
