package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Lk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2102208Lk {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.081T, com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread, java.lang.Thread] */
    public static C081T LIZ(String str, final Function0 function0, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        int i2 = i & 16;
        ?? r0 = new BPEAThread() { // from class: X.081T
            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public final void run() {
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    function0.invoke();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
            }
        };
        if (str != null) {
            r0.setName(str);
        }
        if (z) {
            r0.start();
        }
        return r0;
    }
}
