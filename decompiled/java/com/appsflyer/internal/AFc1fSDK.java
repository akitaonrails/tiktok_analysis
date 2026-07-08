package com.appsflyer.internal;

import X.C0WZX;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class AFc1fSDK {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    public static int $10 = 0;
    public static int $11 = 1;
    public static Object AFLogger$LogLevel;
    public static Object AFPurchaseDetails;
    public static final Map<Integer, Object> afDebugLog;
    public static byte[] afErrorLogForExcManagerOnly;
    public static final Map<String, Object> afLogForce;
    public static long getCurrency;
    public static byte[] getLevel;
    public static int getPrice;
    public static byte[] getPurchaseToken;
    public static int getPurchaseType;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0070 -> B:12:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String $$c(byte r8, short r9, short r10) {
        /*
            int r2 = com.appsflyer.internal.AFc1fSDK.$10
            r1 = r2 & 45
            r0 = r2 | 45
            int r1 = r1 + r0
            int r0 = r1 % 128
            com.appsflyer.internal.AFc1fSDK.$11 = r0
            int r0 = -r8
            r1 = r0 & 36
            r0 = r0 | 36
            int r1 = r1 + r0
            int r8 = r9 + 41
            int r0 = -r10
            r9 = r0 & 950(0x3b6, float:1.331E-42)
            r0 = r0 | 950(0x3b6, float:1.331E-42)
            int r9 = r9 + r0
            byte[] r10 = com.appsflyer.internal.AFc1fSDK.$$a
            byte[] r7 = new byte[r1]
            int r6 = ~r1
            r4 = 1
            int r1 = r1 << r4
            int r6 = r6 + r1
            r1 = 28
            if (r10 != 0) goto L89
            r0 = 80
        L27:
            r5 = 0
            if (r0 == r1) goto L87
            int r0 = r2 + 63
            int r1 = r0 % 128
            com.appsflyer.internal.AFc1fSDK.$11 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L85
            r0 = 0
        L35:
            if (r0 == 0) goto L8d
            int r0 = r1 + 13
            int r0 = r0 % 128
            com.appsflyer.internal.AFc1fSDK.$10 = r0
            r0 = r9
            r3 = 0
        L3f:
            r1 = r9 ^ r8
            r8 = r8 & r9
            int r8 = r8 << r4
            int r1 = r1 + r8
            int r9 = r0 + 1
            int r8 = r1 + 1
            int r0 = com.appsflyer.internal.AFc1fSDK.$11
            int r0 = r0 + 103
            int r0 = r0 % 128
            com.appsflyer.internal.AFc1fSDK.$10 = r0
        L50:
            byte r0 = (byte) r8
            r7[r3] = r0
            if (r3 != r6) goto L70
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7, r5)
            int r0 = com.appsflyer.internal.AFc1fSDK.$11
            r1 = r0 ^ 45
            r0 = r0 & 45
            int r0 = r0 << r4
            int r1 = r1 + r0
            int r0 = r1 % 128
            com.appsflyer.internal.AFc1fSDK.$10 = r0
            int r0 = r1 % 2
            if (r0 == 0) goto L6e
            r0 = 1
        L6b:
            if (r0 == r4) goto L8c
            return r2
        L6e:
            r0 = 0
            goto L6b
        L70:
            int r3 = r3 + 2
            int r3 = r3 - r4
            r2 = r10[r9]
            int r0 = com.appsflyer.internal.AFc1fSDK.$10
            r1 = r0 ^ 9
            r0 = r0 & 9
            int r0 = r0 << r4
            int r1 = r1 + r0
            int r0 = r1 % 128
            com.appsflyer.internal.AFc1fSDK.$11 = r0
            r0 = r9
            r9 = r8
            r8 = r2
            goto L3f
        L85:
            r0 = 1
            goto L35
        L87:
            r3 = 0
            goto L50
        L89:
            r0 = 28
            goto L27
        L8c:
            return r2
        L8d:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L8f
        L8f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1fSDK.$$c(byte, short, short):java.lang.String");
    }

    public static int AFInAppEventType(int i) throws Throwable {
        int i2 = $11;
        int i3 = (i2 + 70) - 1;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Object obj = AFLogger$LogLevel;
        $10 = (i2 + 67) % 128;
        try {
            int iIntValue = ((Integer) C2204961BRm.a0(Class.forName($$c(r7[113], r7[33], (short) 307), true, (ClassLoader) AFPurchaseDetails).getMethod($$c(r7[36], (byte) (-$$a[342]), (short) 405), Integer.TYPE), obj, new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bZsbuleyw==", new String[]{"01c45"}))).intValue();
            $11 = (($10 + 88) - 1) % 128;
            return iIntValue;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static void init$0() {
        int i;
        int i2 = $11;
        int i3 = (i2 ^ 43) + ((i2 & 43) << 1);
        $10 = i3 % 128;
        if ((i3 % 2 != 0 ? '\'' : '*') != '\'') {
            byte[] bArr = new byte[968];
            System.arraycopy("qÁ\u008163\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ4Èö\u0014êÌ:\u0005¾\u00132ðÿþ\fòþä$\u0001\u0004þÞ ýòû\u000bö\u0014êÌ=ô\føÆ$%ù\u0000ð\u0007\u0011üÿò\b\u0005Ì.ÿûüùý\u0012ô\u0005þö\u0014êÌ?ú\u0005¾\u00136úðÜ2ðÿþ\f\fõ\rüùúÉ@\u0003º\u00132ó\u0002÷¿1î\f\u0000õ\u0005þö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Ï$\u0001\u0004þÞ ýòû\u000bü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u001a$Þ\u0017\u0007\u0001\u0002\u0006Ê \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fòû\u0002á.öÿ\f\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ4ìð\u0006ØUý\u000eÑ\"\u0002ø\rÐ$\b\u0004õ\u0000\u0012Ö\u0016úö\nðý\u000eÎ\u001d\u0001\u0004üÞ$\bòû\u0002ü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0015 \u0012Í\"\u0002ø\u000bô\u0000ù\u0003ý\u0001\u0004üü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0013\u001e\u0011ñÞ \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fý\u000eÎ+ô\u0000Ý\u001d\u0001\u0004üÞ$\b\u0005ôôê\u0006è\u0007E\u0000°Eú\nÿõþ\u0001\u0007\u0007¬Kø\u0000\r´ê\u0005é\u0007ê\u0003ë\u0007ê\u0007ç\u0007\u0004\u0002$Ò.ÿÔ0î\b\u0005Û\u0010\u0010î\u000b÷\u000eð\fÛ\u0012\u000b÷ö\u0014êÌ=ô\føÆ\u0014(ô\u0011ÿØ\"ñ\u0002\u0000\f\fõ\rüùúÉ2\u000eÿ½\u0012.ÿÖ$\u0002òþ\n\u0006ñ\u000eÝ\u0012û\u0002ê\u001eý\fö\u0014êÌ:\u0005¾\u0015\u001c\u0012ìç$\u0001\u0004þÞ ýòû\u000b\u0002ñ\u0002ß \u0012ö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Õ%þû\u0004þÞ ýòû\u000bê\n\bï\r÷ý\u0006ý\u000eÎ(ô\u0011ÿØ\"ñ\u0002\u0000\f4ü\u0012ìÍ4ü\u0012ìÍ\u0000\u0006ø\u000eðý\u000eÑý\u0004\u0004\u0019\u0013ù\u0000ú\u0002òñ\u001aî\u000eÿô\fð\u0006\u0013é\u0004\u0005ò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ö\u0010\u0012óÜ&ø\u0007÷\b\u0005þ\b\u0002\u0003ñ3\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ3Éö\u0014êÌ:\u0005¾Eø\u0002ó\u0004\bý\u000eÛ!ü\u0000ô\f\u0001\u0004\u000býÀ2\u000eÿ\u0002ò\u0005\fë\f»:\u0004\u0005ð\fûò\nÁ\u0012\u0004\u001cÍ3íð\u0006Øÿý\u000eÌ \u0010ûü\bþðê\u0010\u0012ó\fõ\rüùúÉ2\u000eÿ½\u0012!\u0010ô\fò\n\u0004Ú\u0013\tòû\u0002\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ3íð\u0006Øÿö\u0014êÌ:\u0005¾\u0017\"\u0002øé%þû\u0004þÞ ýòû\u000bý\fè\u001aö\nðö\u0014êÌ:\u0005¾\u001a\u0005õ2ê\u0001\n\u0003ô\u0005þ\fõ\rüùúÉEð\u0012û¹%\u0010\u0012ûà\u001eô\u0002\u0006ð\u0012óã\u001c\t\u0000ý\u000eÔ$ú\nô÷\nÔ.ÿûüùý\u0012ô\u0005þö\u0014êÌ:\u0005¾\u0017\"\u0002øê\u0002ì\u0007\u0011üÿò\b\u0005ß\u0014\u0003÷ç\u001b\u0002ÿü\tö\u0014êÌ:\u0005¾\u0017\"\u0002øÞ \rï\u000eö\u0006\u0003ú\u0002úÒ6úðÛ0ÿî\u0017\u0002ñ\u0002Þ(ô\u0011ÿ\u000býÀ2\u000eÿ\u0002ò\u0005\fë\fúî\u000eò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ê$\bòý\u0010ú\u0002öû\rö\u0014êÌ:\u0005¾\u001a$\u0001\u0004þÞ ýòû\u000b".getBytes("ISO-8859-1"), 0, bArr, 0, 968);
            $$a = bArr;
            i = 143;
        } else {
            byte[] bArr2 = new byte[968];
            System.arraycopy("qÁ\u008163\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ4Èö\u0014êÌ:\u0005¾\u00132ðÿþ\fòþä$\u0001\u0004þÞ ýòû\u000bö\u0014êÌ=ô\føÆ$%ù\u0000ð\u0007\u0011üÿò\b\u0005Ì.ÿûüùý\u0012ô\u0005þö\u0014êÌ?ú\u0005¾\u00136úðÜ2ðÿþ\f\fõ\rüùúÉ@\u0003º\u00132ó\u0002÷¿1î\f\u0000õ\u0005þö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Ï$\u0001\u0004þÞ ýòû\u000bü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u001a$Þ\u0017\u0007\u0001\u0002\u0006Ê \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fòû\u0002á.öÿ\f\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ4ìð\u0006ØUý\u000eÑ\"\u0002ø\rÐ$\b\u0004õ\u0000\u0012Ö\u0016úö\nðý\u000eÎ\u001d\u0001\u0004üÞ$\bòû\u0002ü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0015 \u0012Í\"\u0002ø\u000bô\u0000ù\u0003ý\u0001\u0004üü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0013\u001e\u0011ñÞ \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fý\u000eÎ+ô\u0000Ý\u001d\u0001\u0004üÞ$\b\u0005ôôê\u0006è\u0007E\u0000°Eú\nÿõþ\u0001\u0007\u0007¬Kø\u0000\r´ê\u0005é\u0007ê\u0003ë\u0007ê\u0007ç\u0007\u0004\u0002$Ò.ÿÔ0î\b\u0005Û\u0010\u0010î\u000b÷\u000eð\fÛ\u0012\u000b÷ö\u0014êÌ=ô\føÆ\u0014(ô\u0011ÿØ\"ñ\u0002\u0000\f\fõ\rüùúÉ2\u000eÿ½\u0012.ÿÖ$\u0002òþ\n\u0006ñ\u000eÝ\u0012û\u0002ê\u001eý\fö\u0014êÌ:\u0005¾\u0015\u001c\u0012ìç$\u0001\u0004þÞ ýòû\u000b\u0002ñ\u0002ß \u0012ö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Õ%þû\u0004þÞ ýòû\u000bê\n\bï\r÷ý\u0006ý\u000eÎ(ô\u0011ÿØ\"ñ\u0002\u0000\f4ü\u0012ìÍ4ü\u0012ìÍ\u0000\u0006ø\u000eðý\u000eÑý\u0004\u0004\u0019\u0013ù\u0000ú\u0002òñ\u001aî\u000eÿô\fð\u0006\u0013é\u0004\u0005ò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ö\u0010\u0012óÜ&ø\u0007÷\b\u0005þ\b\u0002\u0003ñ3\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ3Éö\u0014êÌ:\u0005¾Eø\u0002ó\u0004\bý\u000eÛ!ü\u0000ô\f\u0001\u0004\u000býÀ2\u000eÿ\u0002ò\u0005\fë\f»:\u0004\u0005ð\fûò\nÁ\u0012\u0004\u001cÍ3íð\u0006Øÿý\u000eÌ \u0010ûü\bþðê\u0010\u0012ó\fõ\rüùúÉ2\u000eÿ½\u0012!\u0010ô\fò\n\u0004Ú\u0013\tòû\u0002\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ3íð\u0006Øÿö\u0014êÌ:\u0005¾\u0017\"\u0002øé%þû\u0004þÞ ýòû\u000bý\fè\u001aö\nðö\u0014êÌ:\u0005¾\u001a\u0005õ2ê\u0001\n\u0003ô\u0005þ\fõ\rüùúÉEð\u0012û¹%\u0010\u0012ûà\u001eô\u0002\u0006ð\u0012óã\u001c\t\u0000ý\u000eÔ$ú\nô÷\nÔ.ÿûüùý\u0012ô\u0005þö\u0014êÌ:\u0005¾\u0017\"\u0002øê\u0002ì\u0007\u0011üÿò\b\u0005ß\u0014\u0003÷ç\u001b\u0002ÿü\tö\u0014êÌ:\u0005¾\u0017\"\u0002øÞ \rï\u000eö\u0006\u0003ú\u0002úÒ6úðÛ0ÿî\u0017\u0002ñ\u0002Þ(ô\u0011ÿ\u000býÀ2\u000eÿ\u0002ò\u0005\fë\fúî\u000eò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ê$\bòý\u0010ú\u0002öû\rö\u0014êÌ:\u0005¾\u001a$\u0001\u0004þÞ ýòû\u000b".getBytes("ISO-8859-1"), 0, bArr2, 0, 968);
            $$a = bArr2;
            i = 12074;
        }
        $$b = i;
    }

    public static int valueOf(Object obj) throws Throwable {
        int i = $11;
        $10 = (((i | 1) << 1) - (i ^ 1)) % 128;
        Object obj2 = AFLogger$LogLevel;
        $10 = ((i & 87) + (i | 87)) % 128;
        try {
            int iIntValue = ((Integer) C2204961BRm.a0(Class.forName($$c(r7[113], r7[33], (short) 307), true, (ClassLoader) AFPurchaseDetails).getMethod($$c(r7[5], (byte) (-$$a[342]), (short) 576), Object.class), obj2, new Object[]{obj}, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bZsbuleyw==", new String[]{"01c45"}))).intValue();
            int i2 = $11;
            $10 = ((i2 & 87) + (i2 | 87)) % 128;
            return iIntValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object valueOf(int i, int i2, char c) throws Throwable {
        int i3 = $11;
        $10 = (i3 + 81) % 128;
        Object obj = AFLogger$LogLevel;
        int i4 = ((i3 + 116) - 1) % 128;
        $10 = i4;
        $11 = ((i4 & 77) + (i4 | 77)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c(bArr[113], bArr[33], (short) 307), true, (ClassLoader) AFPurchaseDetails);
            String str$$c = $$c(bArr[5], (byte) (-bArr[342]), (short) 576);
            Class<?> cls2 = Integer.TYPE;
            Object objA0 = C2204961BRm.a0(cls.getMethod(str$$c, cls2, cls2, Character.TYPE), obj, objArr, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bZsbuleyw==", new String[]{"01c45"}));
            int i5 = ($11 + 108) - 1;
            $10 = i5 % 128;
            if ((i5 % 2 != 0 ? 'V' : (char) 29) == 29) {
                return objA0;
            }
            try {
                throw null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:458|793|481|709|482|705|483|484|694|485|853|486) */
    /* JADX WARN: Can't wrap try/catch for region: R(34:700|3|(1:5)(1:6)|7|(2:716|8)|(1:10)(22:673|13|(0)(2:20|(6:22|752|(1:24)(1:25)|26|711|31)(2:29|(2:711|31)(1:34)))|35|(1:(1:38)(3:41|749|42))|(6:40|43|727|44|718|45)|(4:58|59|815|60)|66|813|67|(1:69)(12:70|(1:75)|809|76|(1:78)(1:79)|80|(1:82)(1:84)|83|85|91|(2:92|(3:94|(6:96|836|97|(2:99|101)(1:100)|102|(2:104|(14:106|701|107|698|108|(16:110|(9:829|134|821|135|819|136|817|137|(3:138|(7:139|811|140|(2:(6:142|757|143|(1:145)(1:146)|147|149)(1:148)|150)|152|(2:661|154)(1:(2:665|156)(1:(2:675|158)(6:756|159|692|160|680|161)))|(1:(2:(3:875|165|881)(2:874|(3:877|167|880)(3:876|168|879))|878))(1:872))|873))(1:221)|222|832|223|823|224|805|225|796|226|(7:227|228|229|785|230|231|(13:233|(1:235)(1:236)|237|741|238|737|239|751|240|243|771|244|(2:246|(3:848|378|379)(9:723|249|(3:251|253|254)(1:252)|255|688|256|686|257|(44:259|760|260|261|682|262|(10:678|263|264|671|265|669|266|667|267|(3:269|677|270)(1:663))|663|273|657|274|842|275|840|276|838|277|834|278|773|279|827|280|825|281|282|807|283|284|798|285|286|722|287|(4:289|777|290|291)|831|292|293|787|294|783|295|296|(2:298|(13:354|355|(1:357)(1:358)|359|764|360|758|361|747|362|745|363|364)(1:851))(1:849))(41:261|682|262|(10:678|263|264|671|265|669|266|667|267|(0)(0))|663|273|657|274|842|275|840|276|838|277|834|278|773|279|827|280|825|281|282|807|283|284|798|285|286|722|287|(0)|831|292|293|787|294|783|295|296|(0)(0))))(33:768|299|762|300|754|301|302|(6:303|743|304|739|305|(3:307|308|(1:864)(8:312|731|313|729|314|725|315|865))(1:862))|316|733|317|659|318|713|326|334|720|335|336|707|337|338|684|339|(3:341|(3:868|343|871)(3:867|344|870)|869)|866|345|346|(2:348|(1:350)(3:850|512|513))|351|703|352|(0)(0)))(8:781|241|775|242|243|771|244|(0)(0)))|537|(1:539)(1:540)|541|638)|803|120|801|121|789|122|123|846)(8:803|120|801|121|789|122|123|846))(15:(0)(0)|222|832|223|823|224|805|225|796|226|(8:227|228|229|785|230|231|(0)(0)|364)|537|(0)(0)|541|638))|635)(2:845|648))|884)|74|809|76|(0)(0)|80|(0)(0)|83|85|91|(2:92|(0)(0))|884)|690|15|22|752|(0)(0)|26|711|31|35|(0)|(0)|(4:58|59|815|60)|66|813|67|(0)(0)|74|809|76|(0)(0)|80|(0)(0)|83|85|91|(2:92|(0)(0))|884|(2:(1:736)|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(36:0|2|700|3|(1:5)(1:6)|7|(2:716|8)|(1:10)(22:673|13|(0)(2:20|(6:22|752|(1:24)(1:25)|26|711|31)(2:29|(2:711|31)(1:34)))|35|(1:(1:38)(3:41|749|42))|(6:40|43|727|44|718|45)|(4:58|59|815|60)|66|813|67|(1:69)(12:70|(1:75)|809|76|(1:78)(1:79)|80|(1:82)(1:84)|83|85|91|(2:92|(3:94|(6:96|836|97|(2:99|101)(1:100)|102|(2:104|(14:106|701|107|698|108|(16:110|(9:829|134|821|135|819|136|817|137|(3:138|(7:139|811|140|(2:(6:142|757|143|(1:145)(1:146)|147|149)(1:148)|150)|152|(2:661|154)(1:(2:665|156)(1:(2:675|158)(6:756|159|692|160|680|161)))|(1:(2:(3:875|165|881)(2:874|(3:877|167|880)(3:876|168|879))|878))(1:872))|873))(1:221)|222|832|223|823|224|805|225|796|226|(7:227|228|229|785|230|231|(13:233|(1:235)(1:236)|237|741|238|737|239|751|240|243|771|244|(2:246|(3:848|378|379)(9:723|249|(3:251|253|254)(1:252)|255|688|256|686|257|(44:259|760|260|261|682|262|(10:678|263|264|671|265|669|266|667|267|(3:269|677|270)(1:663))|663|273|657|274|842|275|840|276|838|277|834|278|773|279|827|280|825|281|282|807|283|284|798|285|286|722|287|(4:289|777|290|291)|831|292|293|787|294|783|295|296|(2:298|(13:354|355|(1:357)(1:358)|359|764|360|758|361|747|362|745|363|364)(1:851))(1:849))(41:261|682|262|(10:678|263|264|671|265|669|266|667|267|(0)(0))|663|273|657|274|842|275|840|276|838|277|834|278|773|279|827|280|825|281|282|807|283|284|798|285|286|722|287|(0)|831|292|293|787|294|783|295|296|(0)(0))))(33:768|299|762|300|754|301|302|(6:303|743|304|739|305|(3:307|308|(1:864)(8:312|731|313|729|314|725|315|865))(1:862))|316|733|317|659|318|713|326|334|720|335|336|707|337|338|684|339|(3:341|(3:868|343|871)(3:867|344|870)|869)|866|345|346|(2:348|(1:350)(3:850|512|513))|351|703|352|(0)(0)))(8:781|241|775|242|243|771|244|(0)(0)))|537|(1:539)(1:540)|541|638)|803|120|801|121|789|122|123|846)(8:803|120|801|121|789|122|123|846))(15:(0)(0)|222|832|223|823|224|805|225|796|226|(8:227|228|229|785|230|231|(0)(0)|364)|537|(0)(0)|541|638))|635)(2:845|648))|884)|74|809|76|(0)(0)|80|(0)(0)|83|85|91|(2:92|(0)(0))|884)|690|15|22|752|(0)(0)|26|711|31|35|(0)|(0)|(4:58|59|815|60)|66|813|67|(0)(0)|74|809|76|(0)(0)|80|(0)(0)|83|85|91|(2:92|(0)(0))|884|(2:(1:736)|(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(37:0|2|700|3|(1:5)(1:6)|7|716|8|(1:10)(22:673|13|(0)(2:20|(6:22|752|(1:24)(1:25)|26|711|31)(2:29|(2:711|31)(1:34)))|35|(1:(1:38)(3:41|749|42))|(6:40|43|727|44|718|45)|(4:58|59|815|60)|66|813|67|(1:69)(12:70|(1:75)|809|76|(1:78)(1:79)|80|(1:82)(1:84)|83|85|91|(2:92|(3:94|(6:96|836|97|(2:99|101)(1:100)|102|(2:104|(14:106|701|107|698|108|(16:110|(9:829|134|821|135|819|136|817|137|(3:138|(7:139|811|140|(2:(6:142|757|143|(1:145)(1:146)|147|149)(1:148)|150)|152|(2:661|154)(1:(2:665|156)(1:(2:675|158)(6:756|159|692|160|680|161)))|(1:(2:(3:875|165|881)(2:874|(3:877|167|880)(3:876|168|879))|878))(1:872))|873))(1:221)|222|832|223|823|224|805|225|796|226|(7:227|228|229|785|230|231|(13:233|(1:235)(1:236)|237|741|238|737|239|751|240|243|771|244|(2:246|(3:848|378|379)(9:723|249|(3:251|253|254)(1:252)|255|688|256|686|257|(44:259|760|260|261|682|262|(10:678|263|264|671|265|669|266|667|267|(3:269|677|270)(1:663))|663|273|657|274|842|275|840|276|838|277|834|278|773|279|827|280|825|281|282|807|283|284|798|285|286|722|287|(4:289|777|290|291)|831|292|293|787|294|783|295|296|(2:298|(13:354|355|(1:357)(1:358)|359|764|360|758|361|747|362|745|363|364)(1:851))(1:849))(41:261|682|262|(10:678|263|264|671|265|669|266|667|267|(0)(0))|663|273|657|274|842|275|840|276|838|277|834|278|773|279|827|280|825|281|282|807|283|284|798|285|286|722|287|(0)|831|292|293|787|294|783|295|296|(0)(0))))(33:768|299|762|300|754|301|302|(6:303|743|304|739|305|(3:307|308|(1:864)(8:312|731|313|729|314|725|315|865))(1:862))|316|733|317|659|318|713|326|334|720|335|336|707|337|338|684|339|(3:341|(3:868|343|871)(3:867|344|870)|869)|866|345|346|(2:348|(1:350)(3:850|512|513))|351|703|352|(0)(0)))(8:781|241|775|242|243|771|244|(0)(0)))|537|(1:539)(1:540)|541|638)|803|120|801|121|789|122|123|846)(8:803|120|801|121|789|122|123|846))(15:(0)(0)|222|832|223|823|224|805|225|796|226|(8:227|228|229|785|230|231|(0)(0)|364)|537|(0)(0)|541|638))|635)(2:845|648))|884)|74|809|76|(0)(0)|80|(0)(0)|83|85|91|(2:92|(0)(0))|884)|690|15|22|752|(0)(0)|26|711|31|35|(0)|(0)|(4:58|59|815|60)|66|813|67|(0)(0)|74|809|76|(0)(0)|80|(0)(0)|83|85|91|(2:92|(0)(0))|884|(2:(1:736)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0105, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0106, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x016f, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x019d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x019e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x15db, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x03d7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03d9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x03da, code lost:
    
        r32 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x03dc, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0b29  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0120 A[Catch: Exception -> 0x016e, TRY_ENTER, TryCatch #51 {Exception -> 0x016e, blocks: (B:24:0x0120, B:26:0x0169, B:25:0x0146), top: B:752:0x011e, outer: #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0146 A[Catch: Exception -> 0x016e, TryCatch #51 {Exception -> 0x016e, blocks: (B:24:0x0120, B:26:0x0169, B:25:0x0146), top: B:752:0x011e, outer: #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0c4e  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0eab  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0f66 A[Catch: all -> 0x1807, TRY_LEAVE, TryCatch #96 {all -> 0x1807, blocks: (B:292:0x0ecc, B:296:0x0f55, B:298:0x0f66, B:355:0x1376, B:359:0x13ab, B:364:0x1488, B:517:0x169b, B:519:0x16a4, B:520:0x16a5, B:522:0x16a7, B:524:0x16b0, B:525:0x16b1, B:527:0x16b3, B:529:0x16bc, B:530:0x16bd, B:537:0x16cd, B:541:0x16ea, B:404:0x14d9, B:406:0x14e2, B:407:0x14e3, B:308:0x104b, B:508:0x1689, B:510:0x1692, B:511:0x1693, B:336:0x11a5, B:338:0x1233, B:339:0x123e, B:343:0x12de, B:344:0x12ee, B:345:0x1303, B:346:0x1309, B:350:0x131d, B:512:0x1694, B:513:0x1697, B:351:0x131f, B:352:0x1356, B:532:0x16bf, B:533:0x16c2, B:534:0x16c8, B:536:0x16ca, B:543:0x16fa, B:547:0x1766, B:549:0x176f, B:550:0x1770, B:552:0x1772, B:554:0x177b, B:555:0x177c, B:557:0x177e, B:559:0x1787, B:560:0x1788, B:328:0x1175, B:330:0x117e, B:331:0x117f, B:333:0x1181, B:320:0x112b, B:322:0x1134, B:323:0x1135, B:325:0x1137, B:562:0x178a, B:564:0x1793, B:565:0x1794, B:569:0x1798, B:571:0x17a1, B:572:0x17a2, B:574:0x17a4, B:576:0x17ad, B:577:0x17ae, B:579:0x17b0, B:581:0x17b9, B:582:0x17ba, B:586:0x17be, B:588:0x17c7, B:589:0x17c8, B:591:0x17ca, B:593:0x17d3, B:594:0x17d4, B:598:0x17d8, B:600:0x17e1, B:601:0x17e2, B:603:0x17e4, B:605:0x17ed, B:606:0x17ee, B:608:0x17f0, B:610:0x17f9, B:611:0x17fa, B:613:0x17fc, B:615:0x1805, B:616:0x1806, B:318:0x10f7, B:544:0x1734, B:545:0x1764, B:337:0x11f0, B:326:0x113a, B:335:0x1186, B:317:0x10b8, B:301:0x0fd7, B:361:0x1410, B:300:0x0f9a, B:360:0x13d4, B:244:0x0ad8, B:242:0x0a5c, B:230:0x091d, B:226:0x08ae, B:227:0x08ee, B:225:0x086e, B:224:0x082f), top: B:831:0x0ecc, inners: #1, #14, #20, #25, #27, #30, #34, #41, #52, #55, #57, #58, #61, #64, #66, #71, #76, #77, #79, #83, #92 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0172 A[PHI: r7 r14
      0x0172: PHI (r7v5 java.lang.Object) = (r7v4 java.lang.Object), (r7v11 java.lang.Object) binds: [B:21:0x010f, B:28:0x016f] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r14v1 java.lang.Object) = (r14v0 java.lang.Object), (r14v17 java.lang.Object) binds: [B:21:0x010f, B:28:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x12d0  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x130d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a1 A[PHI: r13 r14
      0x01a1: PHI (r13v1 java.lang.Object) = (r13v0 java.lang.Object), (r13v18 java.lang.Object) binds: [B:30:0x0173, B:33:0x019e] A[DONT_GENERATE, DONT_INLINE]
      0x01a1: PHI (r14v2 java.lang.Object) = (r14v1 java.lang.Object), (r14v16 java.lang.Object) binds: [B:30:0x0173, B:33:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x136c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x16e7  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x16e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0293 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x1814  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0ca6 A[EDGE_INSN: B:663:0x0ca6->B:273:0x0ca6 BREAK  A[LOOP:3: B:678:0x0be5->B:272:0x0ca4], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:768:0x0f90 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:781:0x0a19 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x04ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:845:0x189c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:849:0x16cd A[EDGE_INSN: B:849:0x16cd->B:537:0x16cd BREAK  A[LOOP:2: B:227:0x08ee->B:364:0x1488, LOOP_LABEL: LOOP:0: B:92:0x03e3->B:637:0x183f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:851:0x16cd A[EDGE_INSN: B:851:0x16cd->B:537:0x16cd BREAK  A[LOOP:2: B:227:0x08ee->B:364:0x1488, LOOP_LABEL: LOOP:0: B:92:0x03e3->B:637:0x183f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03f4 A[Catch: Exception -> 0x18a9, TRY_ENTER, TryCatch #22 {Exception -> 0x18a9, blocks: (B:3:0x0024, B:5:0x003c, B:41:0x01ac, B:650:0x189e, B:652:0x18a7, B:653:0x18a8, B:43:0x01f6, B:47:0x027a, B:49:0x0283, B:50:0x0284, B:52:0x0286, B:54:0x028f, B:55:0x0290, B:59:0x02a1, B:62:0x02f5, B:64:0x02fe, B:65:0x02ff, B:66:0x0300, B:67:0x0373, B:76:0x03b5, B:80:0x03be, B:85:0x03d4, B:94:0x03f4, B:622:0x180c, B:628:0x1823, B:633:0x182c, B:634:0x1832, B:631:0x1828, B:640:0x184c, B:644:0x1891, B:646:0x189a, B:647:0x189b, B:635:0x1835, B:90:0x03dc, B:33:0x019e, B:28:0x016f, B:17:0x0106, B:19:0x010b, B:12:0x009a, B:13:0x009e, B:15:0x00dd, B:31:0x0175, B:8:0x0054, B:45:0x0251, B:44:0x020a, B:641:0x185f, B:642:0x188f, B:42:0x01ce, B:24:0x0120, B:26:0x0169, B:25:0x0146, B:60:0x02b5), top: B:700:0x0024, inners: #8, #17, #29, #32, #33, #38, #42, #49, #51, #88 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:793:0x15dc -> B:480:0x15db). Please report as a decompilation issue!!! */
    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    static {
        /*
            Method dump skipped, instruction units count: 6323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1fSDK.<clinit>():void");
    }
}
