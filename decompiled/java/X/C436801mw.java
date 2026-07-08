package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.01mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C436801mw {
    public static void LIZ(int i, long j, String str, Integer num, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            num = null;
        }
        C786410Ut5.LJLIIL(j, new BPEAHandler(Looper.getMainLooper()), new RunnableC514001zO(num, i, str, 3));
    }
}
