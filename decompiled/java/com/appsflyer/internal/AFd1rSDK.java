package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class AFd1rSDK extends HashMap<String, Object> {
    public static int $10 = 0;
    public static int $11 = 1;
    public static char[] AFInAppEventParameterName = null;
    public static int AFKeystoreWrapper = 0;
    public static int AFLogger = 0;
    public static boolean e = false;
    public static boolean registerClient = false;
    public static int unregisterClient = 1;
    public static long valueOf;
    public final Context AFInAppEventType;
    public final Map<String, Object> values;

    static {
        valueOf();
        Color.rgb(0, 0, 0);
        ViewConfiguration.getEdgeSlop();
        Process.myTid();
        AudioTrack.getMinVolume();
        View.resolveSizeAndState(0, 0, 0);
        View.getDefaultSize(0, 0);
        MotionEvent.axisFromString("");
        unregisterClient = (AFLogger + 55) % 128;
    }

    public static void valueOf() {
        valueOf = -603186298485624951L;
        registerClient = true;
        e = true;
        AFKeystoreWrapper = 928696761;
        AFInAppEventParameterName = new char[]{51311, 51304, 51288, 51323, 51307, 51322, 51317, 51609, 51280, 51286, 51269, 51303, 51595, 51308, 51266, 51287, 51290, 51282, 51277, 51285, 51279, 51275, 51276, 51264, 51281, 51586, 51591, 51599, 51594, 51589, 51593, 51598, 51284, 51603, 51270, 51271, 51272, 51301, 51318, 51298, 51316, 51313, 51312, 51265, 51585, 51268, 51291, 51607, 51274, 51273, 51278};
    }

    private String AFInAppEventParameterName() throws UnsupportedEncodingException {
        String str;
        unregisterClient = (AFLogger + 109) % 128;
        try {
            String string = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.values;
            Object[] objArr = new Object[1];
            a("۾掄찺㚜錂ﶃ昔삇ⴃ鞛\uf010媰", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25980, objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.values;
            Object[] objArr2 = new Object[1];
            a("۽좖騈涀㼗", Color.green(0) + 52859, objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (string3 == null) {
                int i = AFLogger + 117;
                unregisterClient = i % 128;
                if (i % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    b((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, null, null, "\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
                    str = (String) objArr3[0];
                } else {
                    Object[] objArr4 = new Object[1];
                    b(81 / (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1)), null, null, "\u0087\u0081\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
                    str = (String) objArr4[0];
                }
                string3 = str.intern();
            }
            StringBuilder sb = new StringBuilder(string2);
            sb.reverse();
            StringBuilder sbAFKeystoreWrapper = AFKeystoreWrapper(string, string3, sb.toString());
            int length = sbAFKeystoreWrapper.length();
            if (!(length <= 4)) {
                int i2 = AFLogger + 35;
                unregisterClient = i2 % 128;
                if (!(i2 % 2 == 0)) {
                    sbAFKeystoreWrapper.delete(4, length);
                } else {
                    sbAFKeystoreWrapper.delete(5, length);
                }
            } else {
                while (length < 4) {
                    unregisterClient = (AFLogger + 25) % 128;
                    length++;
                    sbAFKeystoreWrapper.append('1');
                }
            }
            Object[] objArr5 = new Object[1];
            a("۴ﮫﱛ", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 64849, objArr5);
            sbAFKeystoreWrapper.insert(0, ((String) objArr5[0]).intern());
            return sbAFKeystoreWrapper.toString();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            Object[] objArr6 = new Object[1];
            b(128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), null, null, "\u0099\u008b\u0092\u0098\u0088\u008f\u008a\u0097\u0088\u0090\u008a\u0097\u0088\u0089\u0095\u0092\u008b\u0091\u0096\u008a\u0095\u008a\u0089\u0088\u0094\u008a\u0093\u0092\u0091\u0090\u0088\u008f\u008a\u008e\u008d\u008c\u008b\u008a\u0089\u0088", objArr6);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e2);
            Object[] objArr7 = new Object[1];
            b((ViewConfiguration.getWindowTouchSlop() >> 8) + 127, null, null, "\u009a\u009a\u009a\u009a\u0090\u008a\u0097", objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String AFInAppEventType() throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1rSDK.AFInAppEventType():java.lang.String");
    }

    public static class AFa1tSDK {
        public static byte[] AFInAppEventType(String str) {
            return str.getBytes(Charset.defaultCharset());
        }

        public static byte[] AFKeystoreWrapper(byte[] bArr) {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
            }
            return bArr;
        }
    }

    public static StringBuilder AFKeystoreWrapper(String... strArr) {
        char c;
        Integer numValueOf;
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < 3) {
            arrayList.add(Integer.valueOf(strArr[i].length()));
            i++;
            AFLogger = (unregisterClient + 117) % 128;
        }
        Collections.sort(arrayList);
        int iIntValue = ((Integer) ListProtector.get(arrayList, 0)).intValue();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            if (i2 < iIntValue) {
                c = 18;
            } else {
                c = '@';
            }
            if (c != 18) {
                return sb;
            }
            AFLogger = (unregisterClient + 101) % 128;
            int i3 = 0;
            numValueOf = null;
            while (true) {
                if (i3 < 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    break;
                }
                int iCharAt = strArr[i3].charAt(i2);
                if (numValueOf == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    int i4 = unregisterClient + 29;
                    AFLogger = i4 % 128;
                    if (i4 % 2 != 0) {
                        try {
                            throw null;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                } else {
                    iCharAt ^= numValueOf.intValue();
                }
                numValueOf = Integer.valueOf(iCharAt);
                i3++;
            }
            sb.append(Integer.toHexString(numValueOf.intValue()));
            i2++;
            unregisterClient = (AFLogger + 25) % 128;
        }
    }

    public AFd1rSDK(Map<String, Object> map, Context context) {
        this.values = map;
        this.AFInAppEventType = context;
        put(AFInAppEventParameterName(), AFInAppEventType());
    }

    public static void a(String str, int i, Object[] objArr) {
        Object charArray = str;
        if (str != null) {
            int i2 = $10 + 63;
            $11 = i2 % 128;
            if (i2 % 2 != 0) {
                charArray = str.toCharArray();
            } else {
                str.toCharArray();
                try {
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        char[] cArr = (char[]) charArray;
        AFj1bSDK aFj1bSDK = new AFj1bSDK();
        aFj1bSDK.AFInAppEventParameterName = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        aFj1bSDK.valueOf = 0;
        while (true) {
            int i3 = aFj1bSDK.valueOf;
            if (i3 >= cArr.length) {
                break;
            }
            $10 = ($11 + 101) % 128;
            jArr[i3] = (((long) cArr[i3]) ^ (((long) i3) * ((long) aFj1bSDK.AFInAppEventParameterName))) ^ (valueOf ^ 53874021866711318L);
            aFj1bSDK.valueOf = i3 + 1;
        }
        char[] cArr2 = new char[length];
        aFj1bSDK.valueOf = 0;
        while (true) {
            int i4 = aFj1bSDK.valueOf;
            if (i4 < cArr.length) {
                $10 = ($11 + 59) % 128;
                cArr2[i4] = (char) jArr[i4];
                aFj1bSDK.valueOf = i4 + 1;
            } else {
                objArr[0] = new String(cArr2);
                return;
            }
        }
    }

    public static void b(int i, int[] iArr, String str, String str2, Object[] objArr) throws UnsupportedEncodingException {
        char c;
        char[] cArr;
        int i2;
        $11 = ($10 + 87) % 128;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        AFk1xSDK aFk1xSDK = new AFk1xSDK();
        char[] cArr3 = AFInAppEventParameterName;
        if (cArr3 != null) {
            c = '8';
        } else {
            c = 'U';
        }
        if (c != 'U') {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr4[i3] = (char) (((long) cArr3[i3]) ^ (-8139745211550348932L));
            }
            cArr3 = cArr4;
        }
        int i4 = (int) (((long) AFKeystoreWrapper) ^ (-8139745211550348932L));
        if (e) {
            int length2 = bArr.length;
            aFk1xSDK.values = length2;
            char[] cArr5 = new char[length2];
            aFk1xSDK.AFInAppEventType = 0;
            while (true) {
                int i5 = aFk1xSDK.AFInAppEventType;
                int i6 = aFk1xSDK.values;
                if (i5 < i6) {
                    int i7 = $11;
                    int i8 = i7 + 13;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        cArr5[i5] = (char) (cArr3[bArr[(i6 >> 1) + i5] << i] >>> i4);
                        i2 = i5 / 1;
                    } else {
                        cArr5[i5] = (char) (cArr3[bArr[(i6 - 1) - i5] + i] - i4);
                        i2 = i5 + 1;
                    }
                    aFk1xSDK.AFInAppEventType = i2;
                    $10 = (i7 + 93) % 128;
                } else {
                    objArr[0] = new String(cArr5);
                    return;
                }
            }
        } else if (registerClient) {
            int i9 = $10 + 53;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                int length3 = cArr2.length;
                aFk1xSDK.values = length3;
                cArr = new char[length3];
                aFk1xSDK.AFInAppEventType = 1;
            } else {
                int length4 = cArr2.length;
                aFk1xSDK.values = length4;
                cArr = new char[length4];
                aFk1xSDK.AFInAppEventType = 0;
            }
            while (true) {
                int i10 = aFk1xSDK.AFInAppEventType;
                int i11 = aFk1xSDK.values;
                if (i10 < i11) {
                    int i12 = $10 + 15;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        cArr[i10] = (char) (cArr3[cArr2[(i11 >> 0) >> i10] * i] - i4);
                    } else {
                        cArr[i10] = (char) (cArr3[cArr2[(i11 - 1) - i10] - i] - i4);
                    }
                    aFk1xSDK.AFInAppEventType = i10 + 1;
                } else {
                    objArr[0] = new String(cArr);
                    return;
                }
            }
        } else {
            int length5 = iArr.length;
            aFk1xSDK.values = length5;
            char[] cArr6 = new char[length5];
            aFk1xSDK.AFInAppEventType = 0;
            $10 = ($11 + 59) % 128;
            while (true) {
                int i13 = aFk1xSDK.AFInAppEventType;
                int i14 = aFk1xSDK.values;
                if (i13 < i14) {
                    cArr6[i13] = (char) (cArr3[iArr[(i14 - 1) - i13] - i] - i4);
                    aFk1xSDK.AFInAppEventType = i13 + 1;
                } else {
                    objArr[0] = new String(cArr6);
                    return;
                }
            }
        }
    }
}
