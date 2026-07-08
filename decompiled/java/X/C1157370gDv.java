package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157370gDv {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final EnumC1153700g80 LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157370gDv)) {
            return false;
        }
        C1157370gDv c1157370gDv = (C1157370gDv) obj;
        return Intrinsics.LJFF(this.LIZ, c1157370gDv.LIZ) && this.LIZIZ == c1157370gDv.LIZIZ && this.LIZJ == c1157370gDv.LIZJ && this.LIZLLL == c1157370gDv.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        EnumC1153700g80 enumC1153700g80 = this.LIZLLL;
        return iHashCode + (enumC1153700g80 == null ? 0 : enumC1153700g80.hashCode());
    }

    public /* synthetic */ C1157370gDv(String str) {
        this(str, false, false, null);
    }

    public C1157370gDv(String str, boolean z, boolean z2, EnumC1153700g80 enumC1153700g80) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = enumC1153700g80;
    }
}
