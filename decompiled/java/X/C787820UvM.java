package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0UvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787820UvM {
    public static volatile BPEAHandler LIZ;

    static {
        new HashSet();
        LIZ = new BPEAHandler(Looper.getMainLooper());
    }
}
