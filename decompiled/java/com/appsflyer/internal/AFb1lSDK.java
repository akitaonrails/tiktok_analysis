package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public final class AFb1lSDK {
    public static String AFInAppEventParameterName(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }

    public static String AFKeystoreWrapper(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return AFInAppEventParameterName(messageDigest.digest());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static byte[] values(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(Charset.defaultCharset()));
            return messageDigest.digest();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String AFKeystoreWrapper(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            return AFInAppEventParameterName(mac.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLog(e.getMessage(), e, true);
            return e.getMessage();
        }
    }

    public static boolean AFInAppEventParameterName(Map<String, Object> map, String[] strArr, AFd1sSDK aFd1sSDK) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        Object objRemove = map.remove("sig");
        if (objRemove == null) {
            return false;
        }
        return AFKeystoreWrapper(new JSONObject(map) + AFd1sSDK.registerClient(), AFb1kSDK.valueOf(aFd1sSDK.valueOf, aFd1sSDK.AFKeystoreWrapper)).equals(objRemove);
    }
}
