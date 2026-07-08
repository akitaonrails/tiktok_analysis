package X;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: renamed from: X.0Wmy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833580Wmy {
    public static final SecureRandom LIZ = new SecureRandom();

    public static String LIZ() {
        byte[] bArr = new byte[16];
        LIZ.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
