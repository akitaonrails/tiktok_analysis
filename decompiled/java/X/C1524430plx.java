package X;

import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0plx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524430plx {
    public final String LIZ;
    public final byte[] LIZIZ;

    public final byte[] LIZ() {
        byte[] bytes;
        byte[] bArr = this.LIZIZ;
        if (bArr != null) {
            return bArr;
        }
        String str = this.LIZ;
        return (str == null || (bytes = str.getBytes(Charsets.UTF_8)) == null) ? new byte[0] : bytes;
    }

    public C1524430plx() {
    }

    public C1524430plx(String str) {
        this.LIZ = str;
        this.LIZIZ = null;
    }

    public C1524430plx(byte[] bArr) {
        this.LIZ = null;
        this.LIZIZ = bArr;
    }

    public C1524430plx(String str, byte[] bArr) {
        this.LIZ = str;
        this.LIZIZ = bArr;
    }
}
