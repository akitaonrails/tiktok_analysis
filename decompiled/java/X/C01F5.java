package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01F5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01F5 implements InterfaceC951240arS<Object> {
    public static final C01F5 LJIIIIZZ;
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public final float LJ;
    public final float LJFF;
    public float LJI;
    public boolean LJII;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C01F5() {
        String str = null;
        this(str, str, 0, 0 == true ? 1 : 0, 0.0f, 0 == true ? 1 : 0, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01F5)) {
            return false;
        }
        C01F5 c01f5 = (C01F5) obj;
        return Intrinsics.LJFF(this.LIZ, c01f5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c01f5.LIZIZ) && this.LIZJ == c01f5.LIZJ && this.LIZLLL == c01f5.LIZLLL && Float.compare(this.LJ, c01f5.LJ) == 0 && Float.compare(this.LJFF, c01f5.LJFF) == 0 && Float.compare(this.LJI, c01f5.LJI) == 0 && this.LJII == c01f5.LJII;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextHeaderRichTextStyle(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fontResourceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", color=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", stroke=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", lineHeight=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", minTextSize=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", maxTextSize=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", recommendEnable=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str = null;
        LJIIIIZZ = new C01F5(str, str, 0, 0 == true ? 1 : 0, 0.0f, 0 == true ? 1 : 0, 255);
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (!(obj instanceof C01F5)) {
            return false;
        }
        return Intrinsics.LJFF(obj, this);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C01F5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C01F5(String str, String str2, int i, boolean z, float f, boolean z2, int i2) {
        float f2;
        int iIntValue = i;
        boolean z3 = z2;
        float f3 = f;
        boolean z4 = z;
        String str3 = (i2 & 1) != 0 ? "" : str;
        String str4 = (i2 & 2) == 0 ? str2 : "";
        if ((i2 & 4) != 0) {
            Integer num = (Integer) C13LP.LJJJLL(C1EAR.LIZ());
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
        }
        z4 = (i2 & 8) != 0 ? false : z4;
        if ((i2 & 32) != 0) {
            f2 = 14.0f;
        } else {
            f2 = 0.0f;
        }
        this(str3, str4, iIntValue, z4, 0.0f, f2, (i2 & 64) != 0 ? 16.0f : f3, (i2 & 128) != 0 ? C931810aM7.LIZLLL() : z3);
    }

    public static C01F5 LIZ(C01F5 c01f5, String str, String str2, int i, boolean z, float f, int i2) {
        float f2;
        float f3;
        boolean z2;
        float f4 = f;
        boolean z3 = z;
        int i3 = i;
        String str3 = str2;
        String str4 = str;
        if ((i2 & 1) != 0) {
            str4 = c01f5.LIZ;
        }
        if ((i2 & 2) != 0) {
            str3 = c01f5.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            i3 = c01f5.LIZJ;
        }
        if ((i2 & 8) != 0) {
            z3 = c01f5.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            f2 = c01f5.LJ;
        } else {
            f2 = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f3 = c01f5.LJFF;
        } else {
            f3 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            f4 = c01f5.LJI;
        }
        if ((i2 & 128) != 0) {
            z2 = c01f5.LJII;
        } else {
            z2 = false;
        }
        c01f5.getClass();
        return new C01F5(str4, str3, i3, z3, f2, f3, f4, z2);
    }

    public C01F5(String str, String str2, int i, boolean z, float f, float f2, float f3, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = f;
        this.LJFF = f2;
        this.LJI = f3;
        this.LJII = z2;
    }
}
