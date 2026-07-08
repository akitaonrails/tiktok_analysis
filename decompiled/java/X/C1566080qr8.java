package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566080qr8 {
    public static void LIZJ(final String str, C0RJN c0rjn) {
        Fragment fragment;
        if (!C2550809z8.LIZ) {
            return;
        }
        C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
        String strValueOf = String.valueOf(System.currentTimeMillis());
        if (c0rjn != null) {
            fragment = c0rjn.LJ;
        } else {
            fragment = null;
        }
        final String strValueOf2 = String.valueOf(fragment);
        c1566110qrB.LIZJ(strValueOf, new Object(str, strValueOf2) { // from class: X.00I2
            public final String LIZ;
            public final String LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C00I2)) {
                    return false;
                }
                C00I2 c00i2 = (C00I2) obj;
                return Intrinsics.LJFF(this.LIZ, c00i2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00i2.LIZIZ);
            }

            public final int hashCode() {
                int iHashCode = this.LIZ.hashCode() * 31;
                String str2 = this.LIZIZ;
                return iHashCode + (str2 == null ? 0 : str2.hashCode());
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(this.LIZ);
                sbLIZ.append("],[");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(']');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = str;
                this.LIZIZ = strValueOf2;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C0RJN c0rjn, Function1 function1, boolean z) {
        Object obj;
        C1566100qrA<T> c1566100qrA;
        if (!C2550809z8.LIZ || c0rjn == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("immutable_scene_");
        sbLIZ.append(c0rjn.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1566070qr7 c1566070qr7 = new C1566070qr7(c0rjn, function1, z);
        C1566110qrB<C1566060qr6> c1566110qrB = C1566090qr9.LIZIZ;
        if (c1566110qrB.LIZIZ.containsKey(strLIZIZ) && (c1566100qrA = (C1566100qrA) c1566110qrB.LIZIZ.get(strLIZIZ)) != 0) {
            C1566100qrA<T> c1566100qrA2 = c1566100qrA.LIZJ;
            C1566100qrA<T> c1566100qrA3 = c1566100qrA.LIZLLL;
            if (c1566100qrA2 != 0 && c1566100qrA3 != 0) {
                c1566100qrA3.LIZJ = c1566100qrA2;
                c1566100qrA2.LIZLLL = c1566100qrA3;
            }
            C1566100qrA c1566100qrA4 = c1566110qrB.LIZLLL;
            C1566100qrA<T> c1566100qrA5 = c1566100qrA4.LIZLLL;
            if (c1566100qrA5 != 0) {
                c1566100qrA5.LIZJ = c1566100qrA;
                c1566100qrA.LIZLLL = c1566100qrA5;
                c1566100qrA.LIZJ = c1566100qrA4;
                c1566100qrA4.LIZLLL = c1566100qrA;
            }
            obj = c1566100qrA.LIZIZ;
        } else {
            obj = null;
        }
        c1566070qr7.invoke(obj);
    }
}
