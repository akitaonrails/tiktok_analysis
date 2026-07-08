package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.10g7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19306910g7 implements Serializable {
    public final float fiveScreen;
    public final float nineScreen;
    public final float sevenScreen;

    public final C19306910g7 copy(float f, float f2, float f3) {
        return new C19306910g7(f, f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19306910g7)) {
            return false;
        }
        C19306910g7 c19306910g7 = (C19306910g7) obj;
        return Float.compare(this.nineScreen, c19306910g7.nineScreen) == 0 && Float.compare(this.sevenScreen, c19306910g7.sevenScreen) == 0 && Float.compare(this.fiveScreen, c19306910g7.fiveScreen) == 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomSheetRatios(nineScreen=");
        sbLIZ.append(this.nineScreen);
        sbLIZ.append(", sevenScreen=");
        sbLIZ.append(this.sevenScreen);
        sbLIZ.append(", fiveScreen=");
        sbLIZ.append(this.fiveScreen);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.nineScreen) * 31) + Float.floatToIntBits(this.sevenScreen)) * 31) + Float.floatToIntBits(this.fiveScreen);
    }

    public final C19306910g7 normalized() {
        return copy(C13LZ.LIZLLL(this.nineScreen, 0.0f, 1.0f), C13LZ.LIZLLL(this.sevenScreen, 0.0f, 1.0f), C13LZ.LIZLLL(this.fiveScreen, 0.0f, 1.0f));
    }

    public C19306910g7() {
        this(0.2f, 0.1f, 0.2f);
    }

    public C19306910g7(float f, float f2, float f3) {
        this.nineScreen = f;
        this.sevenScreen = f2;
        this.fiveScreen = f3;
    }
}
