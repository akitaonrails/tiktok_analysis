package com.appsflyer.internal;

import android.util.Base64;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes31.dex */
public final class AFb1qSDK {
    public String AFInAppEventParameterName;
    public byte[] AFInAppEventType;
    public String AFKeystoreWrapper;
    public String valueOf;
    public AFf1zSDK values;

    public final int hashCode() {
        String str = this.AFKeystoreWrapper;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.AFInAppEventType)) * 31;
        String str2 = this.valueOf;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.AFInAppEventParameterName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFf1zSDK aFf1zSDK = this.values;
        return iHashCode3 + (aFf1zSDK != null ? aFf1zSDK.hashCode() : 0);
    }

    public final byte[] AFInAppEventType() {
        return this.AFInAppEventType;
    }

    public AFb1qSDK(char[] cArr) {
        byte[] bArrDecode;
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String strNextLine = scanner.nextLine();
            if (strNextLine.startsWith("url=")) {
                this.valueOf = strNextLine.substring(4).trim();
            } else if (strNextLine.startsWith("version=")) {
                this.AFKeystoreWrapper = strNextLine.substring(8).trim();
                Matcher matcher = PatternProtector.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFKeystoreWrapper);
                if (matcher.matches()) {
                    i = CastIntegerProtector.parseInt(matcher.group(1));
                    i2 = CastIntegerProtector.parseInt(matcher.group(2));
                }
            } else if (strNextLine.startsWith("data=")) {
                String strTrim = strNextLine.substring(5).trim();
                if (i <= 4 && i2 < 11) {
                    bArrDecode = strTrim.getBytes(Charset.defaultCharset());
                } else {
                    bArrDecode = Base64.decode(strTrim, 2);
                }
                this.AFInAppEventType = bArrDecode;
            } else if (strNextLine.startsWith("type=")) {
                try {
                    this.values = AFf1zSDK.valueOf(strNextLine.substring(5).trim());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        scanner.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFb1qSDK.class == obj.getClass()) {
            AFb1qSDK aFb1qSDK = (AFb1qSDK) obj;
            String str = this.AFKeystoreWrapper;
            if (str != null) {
                if (!str.equals(aFb1qSDK.AFKeystoreWrapper)) {
                    return false;
                }
            } else if (aFb1qSDK.AFKeystoreWrapper != null) {
                return false;
            }
            if (!Arrays.equals(this.AFInAppEventType, aFb1qSDK.AFInAppEventType)) {
                return false;
            }
            String str2 = this.valueOf;
            if (str2 != null) {
                if (!str2.equals(aFb1qSDK.valueOf)) {
                    return false;
                }
            } else if (aFb1qSDK.valueOf != null) {
                return false;
            }
            String str3 = this.AFInAppEventParameterName;
            if (str3 != null) {
                if (!str3.equals(aFb1qSDK.AFInAppEventParameterName)) {
                    return false;
                }
            } else if (aFb1qSDK.AFInAppEventParameterName != null) {
                return false;
            }
            if (this.values == aFb1qSDK.values) {
                return true;
            }
        }
        return false;
    }

    public AFb1qSDK(String str, byte[] bArr, String str2, AFf1zSDK aFf1zSDK) {
        this.valueOf = str;
        this.AFInAppEventType = bArr;
        this.AFKeystoreWrapper = str2;
        this.values = aFf1zSDK;
    }
}
