package X;

import android.graphics.Typeface;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NUV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NUV {
    public final C0NUT LIZ;

    public C0NUV() {
        this.LIZ = Build.VERSION.SDK_INT >= 28 ? new C0NUT() { // from class: X.0NUX
            @Override // X.C0NUT
            public final Typeface LIZ(C1680190tpB c1680190tpB, int i) {
                return LIZJ(null, c1680190tpB, i);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static android.graphics.Typeface LIZJ(java.lang.String r3, X.C1680190tpB r4, int r5) {
                /*
                    r2 = 1
                    r1 = 0
                    if (r5 != 0) goto L17
                    X.0tpB r0 = X.C1680190tpB.LLILZLL
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
                    if (r0 == 0) goto L17
                    if (r3 == 0) goto L14
                    int r0 = r3.length()
                    if (r0 != 0) goto L25
                L14:
                    android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
                    return r0
                L17:
                    if (r3 != 0) goto L25
                    android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
                L1b:
                    int r0 = r4.LL
                    if (r5 == r2) goto L20
                    r2 = 0
                L20:
                    android.graphics.Typeface r0 = android.graphics.Typeface.create(r1, r0, r2)
                    return r0
                L25:
                    android.graphics.Typeface r1 = android.graphics.Typeface.create(r3, r1)
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0NUX.LIZJ(java.lang.String, X.0tpB, int):android.graphics.Typeface");
            }

            @Override // X.C0NUT
            public final Typeface LIZIZ(C1696430uFN c1696430uFN, C1680190tpB c1680190tpB, int i) {
                return LIZJ(c1696430uFN.LLILLJJLI, c1680190tpB, i);
            }
        } : new C0NUT() { // from class: X.0NUY
            @Override // X.C0NUT
            public final Typeface LIZ(C1680190tpB c1680190tpB, int i) {
                return LIZJ(null, c1680190tpB, i);
            }

            public static Typeface LIZJ(String str, C1680190tpB c1680190tpB, int i) {
                if (i == 0 && Intrinsics.LJFF(c1680190tpB, C1680190tpB.LLILZLL) && (str == null || str.length() == 0)) {
                    return Typeface.DEFAULT;
                }
                int iLIZ = C0NUZ.LIZ(c1680190tpB, i);
                if (str != null && str.length() != 0) {
                    return Typeface.create(str, iLIZ);
                }
                return Typeface.defaultFromStyle(iLIZ);
            }

            @Override // X.C0NUT
            public final Typeface LIZIZ(C1696430uFN c1696430uFN, C1680190tpB c1680190tpB, int i) {
                String strLIZIZ = c1696430uFN.LLILLJJLI;
                int i2 = c1680190tpB.LL / 100;
                if (i2 >= 0) {
                    if (i2 < 2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append("-thin");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else if (2 <= i2) {
                        if (i2 < 4) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append("-light");
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        } else if (i2 != 4) {
                            if (i2 == 5) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(strLIZIZ);
                                sbLIZ3.append("-medium");
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                            } else if (6 <= i2 && i2 >= 8 && i2 < 11) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(strLIZIZ);
                                sbLIZ4.append("-black");
                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                            }
                        }
                    }
                }
                if (strLIZIZ.length() != 0 && 0 == 0) {
                    Typeface typefaceLIZJ = LIZJ(strLIZIZ, c1680190tpB, i);
                    if (!Intrinsics.LJFF(typefaceLIZJ, Typeface.create(Typeface.DEFAULT, C0NUZ.LIZ(c1680190tpB, i))) && !Intrinsics.LJFF(typefaceLIZJ, LIZJ(null, c1680190tpB, i)) && typefaceLIZJ != null) {
                        return typefaceLIZJ;
                    }
                }
                return LIZJ(c1696430uFN.LLILLJJLI, c1680190tpB, i);
            }
        };
    }
}
