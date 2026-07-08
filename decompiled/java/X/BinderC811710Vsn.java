package X;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Vsn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class BinderC811710Vsn extends Binder {
    public final InterfaceC811780Vsu LL;

    public BinderC811710Vsn(C811700Vsm c811700Vsm) {
        this.LL = c811700Vsm;
    }

    public final void LIZ(final C811740Vsq c811740Vsq) {
        if (Binder.getCallingUid() == Process.myUid()) {
            InterfaceC811780Vsu interfaceC811780Vsu = this.LL;
            ((C811700Vsm) interfaceC811780Vsu).LIZ.processIntent(c811740Vsq.LIZ).LIZJ(new Executor() { // from class: X.0Vst
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new InterfaceC834580Woa() { // from class: X.0Vsr
                @Override // X.InterfaceC834580Woa
                public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                    c811740Vsq.LIZIZ.LIZLLL(null);
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
