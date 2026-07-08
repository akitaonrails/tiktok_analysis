package X;

/* JADX INFO: renamed from: X.08E8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08E8 {
    public static final String LIZ(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr != null) {
            for (byte b : bArr) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
        }
        return sb.toString();
    }
}
