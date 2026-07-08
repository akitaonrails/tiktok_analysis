package X;

/* JADX INFO: renamed from: X.0XRT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XRT {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(byte[] bArr) {
        String str = C0XRU.LIZ;
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append(str.charAt((i >>> 4) & 15));
            sb.append(str.charAt((i >>> 0) & 15));
        }
        return sb.toString();
    }
}
