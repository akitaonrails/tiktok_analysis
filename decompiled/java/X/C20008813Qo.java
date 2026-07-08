package X;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.13Qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20008813Qo implements C13SE {
    public InputStream LIZ;

    public final InputStream LIZ() {
        InputStream inputStream = this.LIZ;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    @Override // X.C13SE
    public void close() throws IOException {
        LIZ().close();
    }

    public int LIZIZ(byte[] bArr, int i) {
        return LIZ().read(bArr, 0, i);
    }
}
