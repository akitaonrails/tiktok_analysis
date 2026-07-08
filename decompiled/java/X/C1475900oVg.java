package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475900oVg implements InterfaceC1476030oVt {
    public final String LIZ;
    public long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1475900oVg)) {
            return false;
        }
        C1475900oVg c1475900oVg = (C1475900oVg) obj;
        return Intrinsics.LJFF(this.LIZ, c1475900oVg.LIZ) && this.LIZIZ == c1475900oVg.LIZIZ && this.LIZJ == c1475900oVg.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimpleCacheInfo(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fileSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cacheSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1476030oVt
    public final float LJ() {
        return C1476050oVv.LIZ(this);
    }

    @Override // X.InterfaceC1476030oVt
    public final List<InterfaceC1476030oVt> LIZ() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1476030oVt
    public final long LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1476030oVt
    public final long LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1476030oVt
    public final String key() {
        return this.LIZ;
    }

    public C1475900oVg(String str, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
