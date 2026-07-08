package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683600tug {
    public static final C1683600tug LIZLLL = new C1683600tug(0.0f, new C0F28(0.0f, 0.0f), 0);
    public final float LIZ;
    public final C13LY<Float> LIZIZ;
    public final int LIZJ;

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProgressBarRangeInfo(current=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", range=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", steps=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683600tug)) {
            return false;
        }
        C1683600tug c1683600tug = (C1683600tug) obj;
        if (this.LIZ == c1683600tug.LIZ && Intrinsics.LJFF(this.LIZIZ, c1683600tug.LIZIZ) && this.LIZJ == c1683600tug.LIZJ) {
            return true;
        }
        return false;
    }

    public C1683600tug(float f, C13LY<Float> c13ly, int i) {
        this.LIZ = f;
        this.LIZIZ = c13ly;
        this.LIZJ = i;
        if (!Float.isNaN(f)) {
            return;
        }
        "current must not be NaN".toString();
        throw new IllegalArgumentException("current must not be NaN");
    }
}
