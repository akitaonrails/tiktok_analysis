package X;

import com.ss.android.ttve.vealgorithm.params.VEAlgorithmParam;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782370wTz extends VEAlgorithmParam {
    public final String LIZ;
    public final C2229251CMx LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782370wTz)) {
            return false;
        }
        C1782370wTz c1782370wTz = (C1782370wTz) obj;
        return Intrinsics.LJFF(this.LIZ, c1782370wTz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1782370wTz.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicLightWaveParams(sourcePath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", videoMetaDataInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1782370wTz() {
        this("", new C2229251CMx(0, 0, 0, 0, 0, 0, 0, 0, null, null));
    }

    public C1782370wTz(String str, C2229251CMx c2229251CMx) {
        this.LIZ = str;
        this.LIZIZ = c2229251CMx;
    }
}
