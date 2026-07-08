package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04vZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1254704vZ implements InterfaceC949240aoE {
    public final String LIZ;
    public final Map<String, String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1254704vZ)) {
            return false;
        }
        C1254704vZ c1254704vZ = (C1254704vZ) obj;
        return Intrinsics.LJFF(this.LIZ, c1254704vZ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1254704vZ.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("External(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1254704vZ(String str, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = map;
    }
}
