package X;

import X.C161R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ykl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869650ykl<DATA extends C161R> implements C164B {
    public final DATA LIZ;
    public final Integer LIZIZ;
    public final boolean LIZJ = false;
    public final String LIZLLL = "";

    @Override // X.C164B
    public final String b5() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1869650ykl)) {
            return false;
        }
        C1869650ykl c1869650ykl = (C1869650ykl) obj;
        return Intrinsics.LJFF(this.LIZ, c1869650ykl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1869650ykl.LIZIZ) && this.LIZJ == c1869650ykl.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1869650ykl.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExternalElementTranslationCacheValue(cacheValue=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", translationSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isPreload=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", variant=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C164B
    public final boolean a5() {
        return this.LIZJ;
    }

    @Override // X.C164B
    public final Integer c5() {
        return this.LIZIZ;
    }

    @Override // X.C164B
    public final String getVariant() {
        return this.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1869650ykl(C161R c161r, Integer num) {
        this.LIZ = c161r;
        this.LIZIZ = num;
    }
}
