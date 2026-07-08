package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.0kf4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327960kf4 {
    public final InterfaceC1330410kj1 LIZ;

    public C1327960kf4(InterfaceC1330410kj1 interfaceC1330410kj1) {
        this.LIZ = interfaceC1330410kj1;
    }

    public final void LIZ(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = this.LIZ.get(16384);
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, 16384);
                if (i != -1) {
                    outputStream.write(bArr, 0, i);
                } else {
                    this.LIZ.LIZ(bArr);
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ.LIZ(bArr);
                throw th;
            }
        }
    }
}
