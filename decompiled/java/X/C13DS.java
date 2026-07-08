package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13DS, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13DS {
    public static final /* synthetic */ int LIZ = 0;

    public static byte[] LIZ(byte[] bArr) {
        byte[] bArrLJII = C13DL.LJII(new byte[]{0, -92, 4, 0, (byte) bArr.length}, bArr);
        int length = bArrLJII.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrLJII, length + 1);
        bArrCopyOf[length] = 0;
        return bArrCopyOf;
    }
}
