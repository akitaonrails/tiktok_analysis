package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes31.dex */
public final class AFg1ySDK {
    public static int $10 = 0;
    public static int $11 = 1;
    public static int[] AFInAppEventParameterName = null;
    public static int AFKeystoreWrapper = 1;
    public static int values;

    static {
        values();
        View.combineMeasuredStates(0, 0);
        int i = AFKeystoreWrapper + 95;
        values = i % 128;
        if (i % 2 != 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void values() {
        AFInAppEventParameterName = new int[]{1213806282, 1275305172, -814371242, -760648375, -213905805, -2014879378, 1244466732, -783583104, 268932788, 1857211705, 829810270, -537596973, -732745973, -1113432519, 703870563, 652249806, -382230026, -703903398};
    }

    public static void a(int[] iArr, int i, Object[] objArr) {
        boolean z;
        int length;
        int[] iArr2;
        int i2;
        AFj1iSDK aFj1iSDK = new AFj1iSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AFInAppEventParameterName;
        if (iArr3 != null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            $11 = ($10 + 59) % 128;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                $10 = ($11 + 81) % 128;
                iArr4[i3] = (int) (((long) iArr3[i3]) ^ (-7136628868752028300L));
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = AFInAppEventParameterName;
        if (iArr6 != null) {
            int i4 = $10 + 89;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                iArr2[i2] = (int) (((long) iArr6[i2]) ^ (-7136628868752028300L));
                i2++;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        aFj1iSDK.values = 0;
        while (true) {
            int i5 = aFj1iSDK.values;
            if (i5 < iArr.length) {
                int i6 = iArr[i5];
                char c = (char) (i6 >> 16);
                cArr[0] = c;
                char c2 = (char) i6;
                cArr[1] = c2;
                char c3 = (char) (iArr[i5 + 1] >> 16);
                cArr[2] = c3;
                char c4 = (char) iArr[i5 + 1];
                cArr[3] = c4;
                aFj1iSDK.AFInAppEventParameterName = (c << 16) + c2;
                aFj1iSDK.AFKeystoreWrapper = (c3 << 16) + c4;
                AFj1iSDK.valueOf(iArr5);
                int i7 = 0;
                do {
                    int i8 = aFj1iSDK.AFInAppEventParameterName ^ iArr5[i7];
                    aFj1iSDK.AFInAppEventParameterName = i8;
                    int iValues = AFj1iSDK.values(i8) ^ aFj1iSDK.AFKeystoreWrapper;
                    int i9 = aFj1iSDK.AFInAppEventParameterName;
                    aFj1iSDK.AFInAppEventParameterName = iValues;
                    aFj1iSDK.AFKeystoreWrapper = i9;
                    i7++;
                } while (i7 < 16);
                int i10 = aFj1iSDK.AFInAppEventParameterName;
                int i11 = aFj1iSDK.AFKeystoreWrapper;
                int i12 = i10 ^ iArr5[16];
                aFj1iSDK.AFKeystoreWrapper = i12;
                int i13 = i11 ^ iArr5[17];
                aFj1iSDK.AFInAppEventParameterName = i13;
                cArr[0] = (char) (i13 >>> 16);
                cArr[1] = (char) i13;
                cArr[2] = (char) (i12 >>> 16);
                cArr[3] = (char) i12;
                AFj1iSDK.valueOf(iArr5);
                int i14 = aFj1iSDK.values;
                cArr2[i14 * 2] = cArr[0];
                cArr2[(i14 * 2) + 1] = cArr[1];
                cArr2[(i14 * 2) + 2] = cArr[2];
                cArr2[(i14 * 2) + 3] = cArr[3];
                aFj1iSDK.values = i14 + 2;
            } else {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
        }
    }

    public static AFh1dSDK AFInAppEventType(AFi1zSDK aFi1zSDK, String str, String str2, String str3) {
        String string;
        AFh1bSDK aFh1bSDK;
        boolean z = true;
        if (str == null) {
            if (aFi1zSDK.AFInAppEventType != AFh1iSDK.DEFAULT) {
                z = false;
            }
            return new AFh1dSDK(z, AFh1bSDK.NA);
        }
        Object[] objArr = new Object[1];
        a(new int[]{155612361, -264507320, -480867464, 640943933, 125938683, -1285380429, -1310089634, -24116072, -1426973647, 61852708, -883492046, 633032705, -461693357, -1167246624, -991432257, -903948349, 112336305, 226747336, 1063402250, -701101021, 1164970240, -2019838721, -1456121518, -1109521690, -591345139, 1400474182, -20382683, 1268870639, -616322629, -1950372554, 1580005321, -26712274}, 64 - View.combineMeasuredStates(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFi1zSDK.AFInAppEventType == AFh1iSDK.CUSTOM) {
            StringBuilder sb = new StringBuilder(str2);
            sb.reverse();
            string = sb.toString();
        } else {
            string = "";
            str3 = strIntern;
        }
        String str4 = aFi1zSDK.values;
        StringBuilder sb2 = new StringBuilder(str3);
        sb2.reverse();
        boolean zEquals = AFKeystoreWrapper(sb2.toString(), str4, "android", "v1", string).equals(str);
        if (zEquals) {
            aFh1bSDK = AFh1bSDK.SUCCESS;
        } else {
            aFh1bSDK = AFh1bSDK.FAILURE;
        }
        return new AFh1dSDK(zEquals, aFh1bSDK);
    }

    public final AFh1dSDK valueOf(AFi1zSDK aFi1zSDK, String str, String str2, String str3) {
        int i = AFKeystoreWrapper;
        values = (i + 49) % 128;
        if (aFi1zSDK != null && str2 != null) {
            values = (i + 19) % 128;
            if (str3 != null) {
                return AFInAppEventType(aFi1zSDK, str, str2, str3);
            }
        }
        return new AFh1dSDK(false, AFh1bSDK.INTERNAL_ERROR);
    }

    public static String AFKeystoreWrapper(String str, String str2, String str3, String str4, String str5) {
        char c;
        char c2;
        values = (AFKeystoreWrapper + 23) % 128;
        String strAFKeystoreWrapper = AFb1lSDK.AFKeystoreWrapper(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (strAFKeystoreWrapper.length() < 12) {
            c = 'I';
        } else {
            c = 31;
        }
        if (c != 31) {
            int i = values + 123;
            AFKeystoreWrapper = i % 128;
            if (i % 2 == 0) {
                c2 = 'H';
            } else {
                c2 = '1';
            }
            if (c2 != 'H') {
                return strAFKeystoreWrapper;
            }
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return strAFKeystoreWrapper.substring(0, 12);
    }
}
