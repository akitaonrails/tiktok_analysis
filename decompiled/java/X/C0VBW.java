package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VBW {
    public final byte[] LIZ;

    public final String toString() {
        try {
            return C786410Ut5.J3(new JSONObject(new String(this.LIZ)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public C0VBW(byte[] bArr) {
        this.LIZ = bArr;
    }
}
