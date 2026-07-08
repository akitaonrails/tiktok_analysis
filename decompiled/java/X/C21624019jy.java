package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.19jy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21624019jy extends AbstractC21624319k1 {
    @Override // X.AbstractC21622619jk
    public final boolean[] LIZJ(String str) {
        int length = str.length();
        if (length != 12) {
            if (length == 13) {
                try {
                    if (!AbstractC21624219k0.LIZ(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (C21628719kj e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
        } else {
            try {
                int iLIZIZ = AbstractC21624219k0.LIZIZ(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(iLIZIZ);
                str = C2188811AlT.LIZIZ(sbLIZ);
            } catch (C21628719kj e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new IllegalArgumentException(e2);
            }
        }
        int i = C21624419k2.LJFF[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iLIZIZ2 = AbstractC21622619jk.LIZIZ(zArr, 0, AbstractC21624219k0.LIZ, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit += 10;
            }
            iLIZIZ2 += AbstractC21622619jk.LIZIZ(zArr, iLIZIZ2, AbstractC21624219k0.LJ[iDigit], false);
        }
        int iLIZIZ3 = iLIZIZ2 + AbstractC21622619jk.LIZIZ(zArr, iLIZIZ2, AbstractC21624219k0.LIZIZ, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            iLIZIZ3 += AbstractC21622619jk.LIZIZ(zArr, iLIZIZ3, AbstractC21624219k0.LIZLLL[Character.digit(str.charAt(i3), 10)], true);
        }
        AbstractC21622619jk.LIZIZ(zArr, iLIZIZ3, AbstractC21624219k0.LIZ, true);
        return zArr;
    }

    @Override // X.AbstractC21622619jk, X.InterfaceC21622519jj
    public final C21621919jd LIZ(String str, EnumC21623519jt enumC21623519jt, int i, int i2, Map<EnumC21624519k3, ?> map) {
        if (enumC21623519jt == EnumC21623519jt.EAN_13) {
            return super.LIZ(str, enumC21623519jt, 200, 200, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(enumC21623519jt)));
    }
}
