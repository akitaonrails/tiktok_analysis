package X;

import android.content.Context;
import com.ss.android.ugc.aweme.compliance.business.contentpreferences.nonpersonalized.NonPersonalizedBannerVM;
import kotlin.jvm.internal.AwS319S0300000_25;
import kotlin.jvm.internal.AwS6S0302000_25;

/* JADX INFO: renamed from: X.0tX0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668920tX0 {
    public static final void LIZ(Context context, NonPersonalizedBannerVM nonPersonalizedBannerVM, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(771210645);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(nonPersonalizedBannerVM)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i7 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            C1676630tjR.LJI(((C2002507st) C1244280iU6.LIZ(nonPersonalizedBannerVM, null, c13zcLJIIJ, (i3 >> 3) & 14, 7).getValue()).LL, null, null, C1676510tjF.LJI(0.0f, C1671550tbF.LIZJ(0.0f, 400.0f, null, 5)), null, C13Z4.LIZJ(-215223187, new AwS319S0300000_25(context, interfaceC1685750ty92, nonPersonalizedBannerVM, 7), c13zcLJIIJ), c13zcLJIIJ, 199680, 22);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS6S0302000_25(context, nonPersonalizedBannerVM, interfaceC1685750ty92, i, i2, 16);
        }
    }
}
