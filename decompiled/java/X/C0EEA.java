package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EEA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EEA {
    public final boolean LIZ;
    public final C0EEF LIZIZ;
    public final String LIZJ;

    public C0EEA() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EEA)) {
            return false;
        }
        C0EEA c0eea = (C0EEA) obj;
        return this.LIZ == c0eea.LIZ && Intrinsics.LJFF(this.LIZIZ, c0eea.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0eea.LIZJ);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        C0EEF c0eef = this.LIZIZ;
        int iHashCode = (iZ2 + (c0eef == null ? 0 : c0eef.hashCode())) * 31;
        String str = this.LIZJ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPAIGCStyleSelectState(showPanel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", initialStyleFromCache=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", selectedStyleEffectId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0EEA(int i) {
        this(false, null, null);
    }

    public C0EEA(boolean z, C0EEF c0eef, String str) {
        this.LIZ = z;
        this.LIZIZ = c0eef;
        this.LIZJ = str;
    }
}
