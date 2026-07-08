package X;

import Y.ARunnableS103S0100000_3;
import com.bytedance.platform.godzilla.sysopt.PthreadCreateHook;

/* JADX INFO: renamed from: X.089D, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C089D extends C089C {
    @Override // X.AnonymousClass0894
    public final void LIZLLL() {
        if (((Boolean) C07OX.LJFF.getValue()).booleanValue()) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS103S0100000_3(this, 53));
        } else {
            PthreadCreateHook.start(this.LIZ);
        }
    }

    public static void LJFF(C089D c089d) {
        c089d.getClass();
        C1C7U.LIZ("PthreadCreateHookAsyncPlugin@7588.start$1L");
        PthreadCreateHook.start(c089d.LIZ);
        C1C7U.LIZIZ("PthreadCreateHookAsyncPlugin@7588.start$1L");
    }
}
