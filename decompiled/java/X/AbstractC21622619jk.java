package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: renamed from: X.19jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21622619jk implements InterfaceC21622519jj {
    public abstract boolean[] LIZJ(String str);

    public int LIZLLL() {
        return 10;
    }

    public static int LIZIZ(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    @Override // X.InterfaceC21622519jj
    public C21621919jd LIZ(String str, EnumC21623519jt enumC21623519jt, int i, int i2, Map<EnumC21624519k3, ?> map) {
        if (!str.isEmpty()) {
            int iLIZLLL = LIZLLL();
            EnumC21624519k3 enumC21624519k3 = EnumC21624519k3.MARGIN;
            EnumMap enumMap = (EnumMap) map;
            if (enumMap.containsKey(enumC21624519k3)) {
                iLIZLLL = CastIntegerProtector.parseInt(enumMap.get(enumC21624519k3).toString());
            }
            boolean[] zArrLIZJ = LIZJ(str);
            int length = zArrLIZJ.length;
            int i3 = iLIZLLL + length;
            int iMax = Math.max(200, i3);
            int iMax2 = Math.max(1, 200);
            int i4 = iMax / i3;
            int i5 = (iMax - (length * i4)) / 2;
            C21621919jd c21621919jd = new C21621919jd(iMax, iMax2);
            int i6 = 0;
            while (i6 < length) {
                if (zArrLIZJ[i6]) {
                    c21621919jd.LIZJ(i5, 0, i4, iMax2);
                }
                i6++;
                i5 += i4;
            }
            return c21621919jd;
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
