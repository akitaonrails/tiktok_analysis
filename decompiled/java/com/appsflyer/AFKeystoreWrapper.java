package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes31.dex */
public class AFKeystoreWrapper {
    public KeyStore AFInAppEventParameterName;
    public Context values;
    public final Object valueOf = new Object();
    public String AFKeystoreWrapper = "";
    public int AFInAppEventType = 0;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        r5 = r1.split(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r5.length != 3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        r6 = true;
        r4 = r5[1].trim().split("=");
        r1 = r5[2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r4.length != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r1.length != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r7.AFKeystoreWrapper = r4[1].trim();
        r7.AFInAppEventType = java.lang.Integer.parseInt(r1[1].trim());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFInAppEventParameterName() {
        /*
            r7 = this;
            java.lang.Object r3 = r7.valueOf
            monitor-enter(r3)
            java.security.KeyStore r0 = r7.AFInAppEventParameterName     // Catch: java.lang.Throwable -> L65
            r6 = 0
            if (r0 == 0) goto L63
            java.util.Enumeration r2 = r0.aliases()     // Catch: java.lang.Throwable -> L5f
        Lc:
            boolean r0 = r2.hasMoreElements()     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L63
            java.lang.Object r1 = r2.nextElement()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto Lc
            boolean r0 = values(r1)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto Lc
            java.lang.String r0 = ","
            java.lang.String[] r5 = r1.split(r0)     // Catch: java.lang.Throwable -> L5f
            int r1 = r5.length     // Catch: java.lang.Throwable -> L5f
            r0 = 3
            if (r1 != r0) goto L63
            r6 = 1
            r0 = r5[r6]     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "="
            java.lang.String[] r4 = r1.split(r0)     // Catch: java.lang.Throwable -> L5f
            r2 = 2
            r0 = r5[r2]     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = "="
            java.lang.String[] r1 = r1.split(r0)     // Catch: java.lang.Throwable -> L5f
            int r0 = r4.length     // Catch: java.lang.Throwable -> L5f
            if (r0 != r2) goto L63
            int r0 = r1.length     // Catch: java.lang.Throwable -> L5f
            if (r0 != r2) goto L63
            r0 = r4[r6]     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L5f
            r7.AFKeystoreWrapper = r0     // Catch: java.lang.Throwable -> L5f
            r0 = r1[r6]     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L5f
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L5f
            r7.AFInAppEventType = r0     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L65
        L63:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L65
            return r6
        L65:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.AFInAppEventParameterName():boolean");
    }

    public final String AFInAppEventType() {
        String str;
        synchronized (this.valueOf) {
            try {
                str = this.AFKeystoreWrapper;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return str;
    }

    public final String AFKeystoreWrapper() {
        StringBuilder sb = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.valueOf) {
            try {
                sb.append(this.AFKeystoreWrapper);
                sb.append(",KSAppsFlyerRICounter=");
                sb.append(this.AFInAppEventType);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return sb.toString();
    }

    public final int values() {
        int i;
        synchronized (this.valueOf) {
            try {
                i = this.AFInAppEventType;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    public AFKeystoreWrapper(Context context) {
        this.values = context;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.AFInAppEventParameterName = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean values(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final void AFInAppEventParameterName(String str) {
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.valueOf) {
                try {
                    if (!this.AFInAppEventParameterName.containsAlias(str)) {
                        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        keyPairGenerator.initialize(keyGenParameterSpecBuild);
                        keyPairGenerator.generateKeyPair();
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th) {
        }
    }
}
