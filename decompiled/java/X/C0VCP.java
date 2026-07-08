package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VCP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VCP {
    public final long LIZ;
    public final long LIZIZ;
    public final byte[] LIZJ;

    public final String toString() {
        try {
            return C786410Ut5.J3(new JSONObject(new String(this.LIZJ)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public C0VCP(byte[] bArr, long j, long j2) {
        this.LIZJ = bArr;
        this.LIZ = j2;
        this.LIZIZ = j;
    }
}
