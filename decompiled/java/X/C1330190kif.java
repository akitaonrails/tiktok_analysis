package X;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0kif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330190kif {
    public static int LIZ(InputStream inputStream, int i, boolean z) throws IOException {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = inputStream.read();
            if (i5 != -1) {
                if (z) {
                    i2 = (i5 & 255) << (i4 * 8);
                } else {
                    i3 <<= 8;
                    i2 = i5 & 255;
                }
                i3 |= i2;
            } else {
                throw new IOException("no more bytes");
            }
        }
        return i3;
    }
}
