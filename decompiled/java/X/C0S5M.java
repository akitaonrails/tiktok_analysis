package X;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S5M, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S5M implements C164G {
    public final HashMap<String, String> LIZ;
    public final boolean LIZIZ;

    @Override // X.C164G
    public final boolean LIZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S5M)) {
            return false;
        }
        C0S5M c0s5m = (C0S5M) obj;
        return Intrinsics.LJFF(this.LIZ, c0s5m.LIZ) && this.LIZIZ == c0s5m.LIZIZ;
    }

    public final int hashCode() {
        HashMap<String, String> map = this.LIZ;
        return ((map == null ? 0 : map.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerData(stickerTranslation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", translated=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0S5M(HashMap<String, String> map, boolean z) {
        this.LIZ = map;
        this.LIZIZ = z;
    }
}
