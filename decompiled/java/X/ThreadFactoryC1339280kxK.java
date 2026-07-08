package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.0kxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class ThreadFactoryC1339280kxK implements ThreadFactory {
    public final int $t;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.$t) {
            case 0:
                return newThread$0(this, runnable);
            case 1:
                return newThread$1(this, runnable);
            case 2:
                return newThread$2(this, runnable);
            default:
                return null;
        }
    }

    public ThreadFactoryC1339280kxK(int i) {
        this.$t = i;
    }

    public static final Thread newThread$0(ThreadFactoryC1339280kxK threadFactoryC1339280kxK, Runnable runnable) {
        return new BPEAThread(runnable, "lx_context_wrapper");
    }

    public static final Thread newThread$1(ThreadFactoryC1339280kxK threadFactoryC1339280kxK, Runnable runnable) {
        return new BPEAThread(runnable, "image-net-requests-monitor");
    }

    public static final Thread newThread$2(ThreadFactoryC1339280kxK threadFactoryC1339280kxK, Runnable runnable) {
        return new BPEAThread(runnable, "image-net-requests-monitor");
    }
}
