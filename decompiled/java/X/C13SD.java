package X;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: X.13SD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13SD implements C13SE {
    public FileOutputStream LIZ;

    public void LIZ() throws IOException {
        FileOutputStream fileOutputStream = this.LIZ;
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
    }

    @Override // X.C13SE
    public void close() throws IOException {
        FileOutputStream fileOutputStream = this.LIZ;
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
    }

    public void LIZIZ(byte[] bArr, int i) throws IOException {
        FileOutputStream fileOutputStream = this.LIZ;
        if (fileOutputStream != null) {
            fileOutputStream.write(bArr, 0, i);
        }
    }
}
