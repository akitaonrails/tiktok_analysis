package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0WS1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WS1 {
    public static final void LIZ(List<? extends C0WS2> list, C0WSB c0wsb) {
        C0WS7 c0ws7LJFF;
        for (C0WS2 c0ws2 : (ArrayList) list) {
            if (c0wsb != null) {
                c0ws7LJFF = c0wsb.LJFF(c0ws2.getName());
            } else {
                c0ws7LJFF = null;
            }
            try {
                if (C0WSD.LIZIZ(c0wsb, c0ws7LJFF)) {
                    if (c0ws7LJFF != null) {
                        c0ws7LJFF.stop();
                    }
                } else {
                    c0ws2.LIZ(c0ws7LJFF);
                    if (c0ws7LJFF != null) {
                        c0ws7LJFF.stop();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (c0ws7LJFF != null) {
                    c0ws7LJFF.stop();
                }
                throw th;
            }
        }
    }
}
