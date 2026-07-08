package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;

/* JADX INFO: renamed from: X.0oxz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1493450oxz extends C1493520oy6 {
    public static final InterfaceC1493600oyE LIZ() {
        C1493630oyH c1493630oyHLIZLLL = C1493630oyH.LIZLLL(TTNetInit.getTTNetDepend().getContext());
        if (C1493440oxy.LIZJ == null) {
            synchronized (C1493440oxy.class) {
                try {
                    if (C1493440oxy.LIZJ == null) {
                        C1493440oxy.LIZJ = new C1493440oxy(c1493630oyHLIZLLL);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C1493440oxy.LIZJ;
    }
}
