package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0W1K, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W1K implements C0W1P {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final byte[] LIZLLL;
    public final String LJ;

    @Override // X.C0W1P
    public final void LIZ(C0W1L c0w1l) {
        try {
            c0w1l.LIZ(("--" + this.LIZ + "\r\nContent-Disposition: form-data; name=\"" + this.LIZIZ + "\"\r\nContent-Type: text/plain; charset=" + this.LJ + "\r\n\r\n").getBytes());
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        byte[] bytes = this.LIZLLL;
        if (bytes == null) {
            bytes = this.LIZJ.getBytes();
        }
        try {
            c0w1l.LIZ(bytes);
            c0w1l.LIZ("\r\n".getBytes());
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public C0W1K(String str, String str2, byte[] bArr) {
        this.LIZ = str;
        this.LIZIZ = "json";
        this.LIZLLL = bArr;
        this.LJ = str2;
    }

    public C0W1K(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LJ = str4;
    }
}
