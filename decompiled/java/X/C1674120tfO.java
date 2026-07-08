package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AwS4S2101000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tfO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674120tfO {
    public static final C1674120tfO LIZ = new C1674120tfO();

    public final void LIZ(String str, String str2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1224896151);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(this)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Uri uri = UriProtector.parse(str2);
            if (Intrinsics.LJFF(uri.getScheme(), "aweme") && Intrinsics.LJFF(uri.getHost(), "pgc_m10n")) {
                String path = uri.getPath();
                if (path != null && path.hashCode() == 472040178 && path.equals("/series_refund_access")) {
                    EnumC1616740sAq[] enumC1616740sAqArrValues = EnumC1616740sAq.values();
                    int length = enumC1616740sAqArrValues.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        EnumC1616740sAq enumC1616740sAq = enumC1616740sAqArrValues[i6];
                        if (Intrinsics.LJFF(enumC1616740sAq.getMode(), str)) {
                            C1666940tTo.LIZ(enumC1616740sAq, c13zcLJIIJ, 0);
                            break;
                        }
                        i6++;
                    }
                }
            } else {
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS4S2101000_25(this, str, str2, i, 0);
                    return;
                }
                return;
            }
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS4S2101000_25(this, str, str2, i, 1);
        }
    }
}
