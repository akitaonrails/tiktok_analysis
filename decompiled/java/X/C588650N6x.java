package X;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588650N6x {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public String LIZLLL;
    public final Set<String> LJ;

    public C588650N6x() {
        this(null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C588650N6x)) {
            return false;
        }
        C588650N6x c588650N6x = (C588650N6x) obj;
        return Intrinsics.LJFF(this.LIZ, c588650N6x.LIZ) && Intrinsics.LJFF(this.LIZIZ, c588650N6x.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c588650N6x.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c588650N6x.LIZLLL) && Intrinsics.LJFF(this.LJ, c588650N6x.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OmsdkSessionState(uniqueId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", omsdkAdType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", creativeType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lastEmittedEvent=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", emittedEvents=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C588650N6x(String str, String str2, int i) {
        String string;
        Set<String> setSynchronizedSet;
        if ((i & 1) != 0) {
            string = UUID.randomUUID().toString();
        } else {
            string = null;
        }
        str = (i & 2) != 0 ? "unknown" : str;
        str2 = (i & 4) != 0 ? "" : str2;
        if ((i & 16) != 0) {
            setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        } else {
            setSynchronizedSet = null;
        }
        this.LIZ = string;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = null;
        this.LJ = setSynchronizedSet;
    }
}
