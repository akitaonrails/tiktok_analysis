package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666950tTp implements InterfaceC1672520tco, InterfaceC1688160u22 {
    public final float LIZ;
    public final boolean LIZIZ;
    public final Function2<Integer, EnumC1671200tag, Integer> LIZJ;
    public final float LIZLLL;

    public C1666950tTp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1666950tTp)) {
            return false;
        }
        C1666950tTp c1666950tTp = (C1666950tTp) obj;
        return C1668650tWZ.LIZJ(this.LIZ, c1666950tTp.LIZ) && this.LIZIZ == c1666950tTp.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1666950tTp.LIZJ);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        Function2<Integer, EnumC1671200tag, Integer> function2 = this.LIZJ;
        return iFloatToIntBits + (function2 == null ? 0 : function2.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ ? "" : "Absolute");
        sbLIZ.append("Arrangement#spacedAligned(");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZ));
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1672520tco, X.InterfaceC1688160u22
    public final float LIZ() {
        return this.LIZLLL;
    }

    public C1666950tTp(float f, boolean z, Function2 function2) {
        this.LIZ = f;
        this.LIZIZ = z;
        this.LIZJ = function2;
        this.LIZLLL = f;
    }

    @Override // X.InterfaceC1688160u22
    public final void LIZJ(InterfaceC1690500u5o interfaceC1690500u5o, int i, int[] iArr, int[] iArr2) {
        LIZIZ(interfaceC1690500u5o, i, iArr, EnumC1671200tag.Ltr, iArr2);
    }

    @Override // X.InterfaceC1672520tco
    public final void LIZIZ(InterfaceC1690500u5o interfaceC1690500u5o, int i, int[] iArr, EnumC1671200tag enumC1671200tag, int[] iArr2) {
        boolean z;
        int i2;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iLJLLJ = interfaceC1690500u5o.LJLLJ(this.LIZ);
        if (this.LIZIZ && enumC1671200tag == EnumC1671200tag.Rtl) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int length = iArr.length;
            int i3 = 0;
            i2 = 0;
            iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int i5 = iArr[i3];
                int iMin2 = Math.min(i2, i - i5);
                iArr2[i4] = iMin2;
                iMin = Math.min(iLJLLJ, (i - iMin2) - i5);
                i2 = iArr2[i4] + i5 + iMin;
                i3++;
                i4++;
            }
        } else {
            i2 = 0;
            iMin = 0;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                int iMin3 = Math.min(i2, i - i6);
                iArr2[length2] = iMin3;
                iMin = Math.min(iLJLLJ, (i - iMin3) - i6);
                i2 = iArr2[length2] + i6 + iMin;
            }
        }
        int i7 = i2 - iMin;
        Function2<Integer, EnumC1671200tag, Integer> function2 = this.LIZJ;
        if (function2 != null && i7 < i) {
            int iIntValue = function2.invoke(Integer.valueOf(i - i7), enumC1671200tag).intValue();
            int length3 = iArr2.length;
            for (int i8 = 0; i8 < length3; i8++) {
                iArr2[i8] = iArr2[i8] + iIntValue;
            }
        }
    }
}
