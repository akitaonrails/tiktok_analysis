package X;

import kotlin.jvm.internal.AFwS311S0000000_25;

/* JADX INFO: renamed from: X.0tol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679930tol {
    public static final C1679920tok LIZ = new InterfaceC1672520tco() { // from class: X.0tok
        @Override // X.InterfaceC1672520tco, X.InterfaceC1688160u22
        public final float LIZ() {
            return 0;
        }

        public final String toString() {
            return "Arrangement#Start";
        }

        @Override // X.InterfaceC1672520tco
        public final void LIZIZ(InterfaceC1690500u5o interfaceC1690500u5o, int i, int[] iArr, EnumC1671200tag enumC1671200tag, int[] iArr2) {
            if (enumC1671200tag == EnumC1671200tag.Ltr) {
                C1679930tol.LIZIZ(false, iArr, iArr2);
            } else {
                C1679930tol.LIZJ(i, iArr, iArr2, true);
            }
        }
    };
    public static final C1679910toj LIZIZ = new InterfaceC1672520tco() { // from class: X.0toj
        @Override // X.InterfaceC1672520tco, X.InterfaceC1688160u22
        public final float LIZ() {
            return 0;
        }

        public final String toString() {
            return "Arrangement#End";
        }

        @Override // X.InterfaceC1672520tco
        public final void LIZIZ(InterfaceC1690500u5o interfaceC1690500u5o, int i, int[] iArr, EnumC1671200tag enumC1671200tag, int[] iArr2) {
            if (enumC1671200tag == EnumC1671200tag.Ltr) {
                C1679930tol.LIZJ(i, iArr, iArr2, false);
            } else {
                C1679930tol.LIZIZ(true, iArr, iArr2);
            }
        }
    };
    public static final C1680030tov LIZJ = new InterfaceC1688160u22() { // from class: X.0tov
        @Override // X.InterfaceC1688160u22
        public final float LIZ() {
            return 0;
        }

        public final String toString() {
            return "Arrangement#Top";
        }

        @Override // X.InterfaceC1688160u22
        public final void LIZJ(InterfaceC1690500u5o interfaceC1690500u5o, int i, int[] iArr, int[] iArr2) {
            C1679930tol.LIZIZ(false, iArr, iArr2);
        }
    };
    public static final C1680020tou LIZLLL = new InterfaceC1688160u22() { // from class: X.0tou
        @Override // X.InterfaceC1688160u22
        public final float LIZ() {
            return 0;
        }

        public final String toString() {
            return "Arrangement#Bottom";
        }

        @Override // X.InterfaceC1688160u22
        public final void LIZJ(InterfaceC1690500u5o interfaceC1690500u5o, int i, int[] iArr, int[] iArr2) {
            C1679930tol.LIZJ(i, iArr, iArr2, false);
        }
    };
    public static final C1679940tom LJ = new C1679940tom();
    public static final C1679970top LJFF = new C1679970top();
    public static final C1679960too LJI = new C1679960too();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0tok] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0toj] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0tov] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0tou] */
    static {
        new C1679950ton();
    }

    public static C1666950tTp LJI(float f) {
        return new C1666950tTp(f, true, AFwS311S0000000_25.get$arr$(47));
    }

    public static void LIZIZ(boolean z, int[] iArr, int[] iArr2) {
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i5 = iArr[length2];
            iArr2[length2] = i;
            i += i5;
        }
    }

    public static void LIZ(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f);
            f += i7;
        }
    }

    public static void LIZJ(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i8 = iArr[length2];
            iArr2[length2] = i5;
            i5 += i8;
        }
    }

    public static void LIZLLL(int i, int[] iArr, int[] iArr2, boolean z) {
        float length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        if (iArr.length == 0) {
            length = 0.0f;
        } else {
            length = (i - i3) / iArr.length;
        }
        float f = length / 2;
        if (!z) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            iArr2[length3] = Math.round(f);
            f += i7 + length;
        }
    }

    public static void LJ(int i, int[] iArr, int[] iArr2, boolean z) {
        float f;
        int i2 = 0;
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float fMax = (i - i3) / Math.max(iArr.length - 1, 1);
        if (z && iArr.length == 1) {
            f = fMax;
        } else {
            f = 0.0f;
            if (!z) {
                int length = iArr.length;
                int i5 = 0;
                while (i2 < length) {
                    int i6 = iArr[i2];
                    iArr2[i5] = Math.round(f);
                    f += i6 + fMax;
                    i2++;
                    i5++;
                }
                return;
            }
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f);
            f += i7 + fMax;
        }
    }

    public static void LJFF(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (!z) {
            int length2 = iArr.length;
            float f = length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        float f2 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            iArr2[length3] = Math.round(f2);
            f2 += i7 + length;
        }
    }
}
