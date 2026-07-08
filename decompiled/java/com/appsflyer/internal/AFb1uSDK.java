package com.appsflyer.internal;

import X.C786410Ut5;
import android.adservices.measurement.MeasurementManager;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* JADX INFO: loaded from: classes31.dex */
public final class AFb1uSDK {
    public static boolean AFInAppEventParameterName() {
        return Build.BRAND.equals("OPPO");
    }

    public static Application AFInAppEventParameterName(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        try {
            return (Application) C786410Ut5.N3(context);
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLog("Application or Activity Context should be used", new IllegalStateException(), true, true);
            return null;
        }
    }

    public static boolean AFKeystoreWrapper(Context context) {
        String message;
        if (context != null && Build.VERSION.SDK_INT >= 33) {
            try {
                if (((MeasurementManager) C786410Ut5.N3(context).getSystemService(MeasurementManager.class)) == null) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (th.getMessage() != null) {
                    message = th.getMessage();
                } else {
                    message = "";
                }
                AFLogger.INSTANCE.e(AFg1aSDK.PRIVACY_SANDBOX, message, th, false, false);
            }
        }
        return false;
    }

    public static String AFInAppEventParameterName(PackageManager packageManager, String str) throws NoSuchAlgorithmException, CertificateException {
        Signature[] signatureArr = C786410Ut5.Y3(packageManager, str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(certificateGenerateCertificate.getEncoded());
        return C786410Ut5.j4("%032X", new Object[]{new BigInteger(1, messageDigest.digest())});
    }

    public static String AFInAppEventType(Context context, String str) {
        try {
            return C786410Ut5.Y3(context.getPackageManager(), str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLog(e.getMessage(), e);
            return "";
        }
    }

    public static long values(Context context, String str) {
        try {
            PackageInfo packageInfoY3 = C786410Ut5.Y3(context.getPackageManager(), str, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfoY3.getLongVersionCode();
            }
            return packageInfoY3.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            AFLogger.afErrorLog(e.getMessage(), e);
            return 0L;
        }
    }

    public static boolean AFInAppEventParameterName(Context context, String str) {
        if (context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
            return true;
        }
        return false;
    }

    public static boolean values(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentServices(intent, 0).size() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> AFInAppEventParameterName(android.content.Context r8, java.util.Map<java.lang.String, java.lang.String> r9, android.net.Uri r10) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1uSDK.AFInAppEventParameterName(android.content.Context, java.util.Map, android.net.Uri):java.util.Map");
    }
}
