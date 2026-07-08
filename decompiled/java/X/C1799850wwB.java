package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799850wwB {
    public final C07ZA LIZ;
    public final EnumC1800020wwS LIZIZ;

    public C1799850wwB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1799850wwB)) {
            return false;
        }
        C1799850wwB c1799850wwB = (C1799850wwB) obj;
        return Intrinsics.LJFF(this.LIZ, c1799850wwB.LIZ) && this.LIZIZ == c1799850wwB.LIZIZ;
    }

    public final int hashCode() {
        C07ZA c07za = this.LIZ;
        return ((c07za == null ? 0 : c07za.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRevisitEntrySurfaceState(currentMission=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entryVariant=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1799850wwB(int i) {
        this(null, EnumC1800020wwS.INVISIBLE);
    }

    public C1799850wwB(C07ZA c07za, EnumC1800020wwS enumC1800020wwS) {
        this.LIZ = c07za;
        this.LIZIZ = enumC1800020wwS;
    }
}
