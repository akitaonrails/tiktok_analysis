package X;

import android.util.Base64;

/* JADX INFO: renamed from: X.0ons, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487180ons {
    public static final String LIZ(boolean[] zArr) {
        int length = zArr.length;
        if (length == 0) {
            return "";
        }
        byte[] bArr = new byte[(length + 7) / 8];
        int i = 0;
        do {
            if (zArr[i]) {
                int i2 = i / 8;
                bArr[i2] = (byte) ((1 << (i % 8)) | bArr[i2]);
            }
            i++;
        } while (i < length);
        return Base64.encodeToString(bArr, 2);
    }
}
