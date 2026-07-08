package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2183208gw {
    public String LIZ;
    public boolean LIZIZ;
    public long LIZJ;

    public C2183208gw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2183208gw)) {
            return false;
        }
        C2183208gw c2183208gw = (C2183208gw) obj;
        return Intrinsics.LJFF(this.LIZ, c2183208gw.LIZ) && this.LIZIZ == c2183208gw.LIZIZ && this.LIZJ == c2183208gw.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceTrackingSession(enterMethod=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasUsedLocker=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalDurationMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2183208gw(int i) {
        this.LIZ = "tap";
        this.LIZIZ = false;
        this.LIZJ = 0L;
    }
}
