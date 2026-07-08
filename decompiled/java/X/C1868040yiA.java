package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yiA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868040yiA {
    public final String LIZ;
    public final Aweme LIZIZ;
    public final boolean LIZJ;

    public C1868040yiA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868040yiA)) {
            return false;
        }
        C1868040yiA c1868040yiA = (C1868040yiA) obj;
        return Intrinsics.LJFF(this.LIZ, c1868040yiA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1868040yiA.LIZIZ) && this.LIZJ == c1868040yiA.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Aweme aweme = this.LIZIZ;
        return ((iHashCode + (aweme != null ? aweme.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ControlBarContext(currentEventType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentAweme=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", commentsPanelOpen=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1868040yiA(int i) {
        this(null, null, false);
    }

    public C1868040yiA(Aweme aweme, String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = aweme;
        this.LIZJ = z;
    }

    public static C1868040yiA LIZ(C1868040yiA c1868040yiA, String str, Aweme aweme, boolean z, int i) {
        if ((i & 1) != 0) {
            str = c1868040yiA.LIZ;
        }
        if ((i & 2) != 0) {
            aweme = c1868040yiA.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c1868040yiA.LIZJ;
        }
        return new C1868040yiA(aweme, str, z);
    }
}
