package X;

import java.util.List;

/* JADX INFO: renamed from: X.0GrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428570GrH {
    public static final /* synthetic */ int LIZ = 0;

    public static AnonymousClass0956 LIZ(C054G c054g, C0H0C c0h0c, List list, int i, Integer num, boolean z, int i2) {
        boolean z2 = z;
        Integer num2 = num;
        int i3 = i;
        if ((i2 & 8) != 0) {
            i3 = 12;
        }
        if ((i2 & 32) != 0) {
            num2 = null;
        }
        if ((i2 & 64) != 0) {
            z2 = false;
        }
        if (list == null) {
            return null;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        return C23250099c.LIZLLL(c054g, C2107308Nj.LIZ, null, new C433960Gzy(list, c054g, i3, z2, num2, c0h0c, null), 2);
    }
}
