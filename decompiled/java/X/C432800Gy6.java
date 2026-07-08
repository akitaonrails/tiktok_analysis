package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gy6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C432800Gy6 {
    public final EnumC430090Gtj LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;
    public final C432770Gy3 LJ;
    public final float LJFF;
    public final C432810Gy7 LJI;
    public final EnumC432940GyK LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C432800Gy6)) {
            return false;
        }
        C432800Gy6 c432800Gy6 = (C432800Gy6) obj;
        return this.LIZ == c432800Gy6.LIZ && Intrinsics.LJFF(this.LIZIZ, c432800Gy6.LIZIZ) && this.LIZJ == c432800Gy6.LIZJ && Float.compare(this.LIZLLL, c432800Gy6.LIZLLL) == 0 && Intrinsics.LJFF(this.LJ, c432800Gy6.LJ) && Float.compare(this.LJFF, c432800Gy6.LJFF) == 0 && Intrinsics.LJFF(this.LJI, c432800Gy6.LJI) && this.LJII == c432800Gy6.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordFieldUiState(recordBtnUiState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", chatType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isShow=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", textViewTranslation=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", liveRecordingData=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", liveRecordingRatio=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", wavePlaybackData=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", playbackState=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode();
    }

    public C432800Gy6(EnumC430090Gtj enumC430090Gtj, String str, boolean z, float f, C432770Gy3 c432770Gy3, float f2, C432810Gy7 c432810Gy7, EnumC432940GyK enumC432940GyK) {
        this.LIZ = enumC430090Gtj;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = f;
        this.LJ = c432770Gy3;
        this.LJFF = f2;
        this.LJI = c432810Gy7;
        this.LJII = enumC432940GyK;
    }

    public static C432800Gy6 LIZ(C432800Gy6 c432800Gy6, EnumC430090Gtj enumC430090Gtj, boolean z, float f, C432770Gy3 c432770Gy3, float f2, C432810Gy7 c432810Gy7, EnumC432940GyK enumC432940GyK, int i) {
        String str;
        EnumC432940GyK enumC432940GyK2 = enumC432940GyK;
        C432810Gy7 c432810Gy72 = c432810Gy7;
        float f3 = f2;
        C432770Gy3 c432770Gy32 = c432770Gy3;
        float f4 = f;
        boolean z2 = z;
        EnumC430090Gtj enumC430090Gtj2 = enumC430090Gtj;
        if ((i & 1) != 0) {
            enumC430090Gtj2 = c432800Gy6.LIZ;
        }
        if ((i & 2) != 0) {
            str = c432800Gy6.LIZIZ;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            z2 = c432800Gy6.LIZJ;
        }
        if ((i & 8) != 0) {
            f4 = c432800Gy6.LIZLLL;
        }
        if ((i & 16) != 0) {
            c432770Gy32 = c432800Gy6.LJ;
        }
        if ((i & 32) != 0) {
            f3 = c432800Gy6.LJFF;
        }
        if ((i & 64) != 0) {
            c432810Gy72 = c432800Gy6.LJI;
        }
        if ((i & 128) != 0) {
            enumC432940GyK2 = c432800Gy6.LJII;
        }
        c432800Gy6.getClass();
        return new C432800Gy6(enumC430090Gtj2, str, z2, f4, c432770Gy32, f3, c432810Gy72, enumC432940GyK2);
    }
}
