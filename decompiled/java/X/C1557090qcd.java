package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557090qcd extends AbstractC1557100qce {
    public final AbstractC1737400vJS LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557090qcd)) {
            return false;
        }
        C1557090qcd c1557090qcd = (C1557090qcd) obj;
        return Intrinsics.LJFF(this.LIZ, c1557090qcd.LIZ) && this.LIZIZ == c1557090qcd.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VERecorderStrategy(iconConfig=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", delayFrameCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1557100qce
    public final AbstractC1737400vJS LIZ() {
        return this.LIZ;
    }

    public C1557090qcd(final AbstractC1737400vJS abstractC1737400vJS, int i) {
        new Object(abstractC1737400vJS) { // from class: X.0qce
            public abstract AbstractC1737400vJS LIZ();
        };
        this.LIZ = abstractC1737400vJS;
        this.LIZIZ = i;
    }
}
