package X;

import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0WpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835170WpX {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) throws NoSuchAlgorithmException, InvalidKeyException {
        Charset charset = Charsets.UTF_8;
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(charset), "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        byte[] bArrDoFinal = mac.doFinal("slardar".getBytes(charset));
        Formatter formatter = new Formatter();
        for (byte b : bArrDoFinal) {
            formatter.format("%02x", Byte.valueOf(b));
        }
        return formatter.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(java.lang.String r4) {
        /*
            if (r4 == 0) goto L9
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L37
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L37
            X.0Wpe r0 = X.C835240Wpe.LIZ     // Catch: java.lang.Throwable -> L3d
            r0.getClass()     // Catch: java.lang.Throwable -> L3d
            com.bytedance.ies.abmock.SettingsManager r3 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L3d
            java.lang.Class<com.bytedance.pns.scopedid.ScopedDeviceIdModel> r2 = com.bytedance.pns.scopedid.ScopedDeviceIdModel.class
            com.bytedance.pns.scopedid.ScopedDeviceIdModel r1 = X.C835240Wpe.LIZIZ     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = "pns_scoped_device_id_settings"
            java.lang.Object r0 = r3.LJIIIIZZ(r0, r2, r1)     // Catch: java.lang.Throwable -> L3d
            com.bytedance.pns.scopedid.ScopedDeviceIdModel r0 = (com.bytedance.pns.scopedid.ScopedDeviceIdModel) r0     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L2e
            r1 = r0
        L2e:
            boolean r0 = r1.enabled     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L37
            java.lang.String r0 = LIZ(r4)     // Catch: java.lang.Throwable -> L3d
            return r0
        L37:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L3d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L3d
            goto L49
        L3d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L49:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C835170WpX.LIZIZ(java.lang.String):java.lang.String");
    }
}
