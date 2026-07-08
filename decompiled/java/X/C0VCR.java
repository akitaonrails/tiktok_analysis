package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: X.0VCR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VCR {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static byte[] LIZ(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return str.getBytes("UTF-8");
                }
                return null;
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
                return str.getBytes();
            }
        }
        return null;
    }
}
