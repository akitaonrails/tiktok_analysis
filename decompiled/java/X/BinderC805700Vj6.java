package X;

import android.app.Notification;
import android.os.Binder;
import com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.session.MediaSessionService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;

/* JADX INFO: renamed from: X.0Vj6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class BinderC805700Vj6 extends Binder {
    public final MediaSessionService LL;

    public BinderC805700Vj6(MediaSessionService mediaSessionService) {
        this.LL = mediaSessionService;
    }

    public final void LIZ(Notification notification) {
        try {
            MediaSessionService mediaSessionService = this.LL;
            if (C294840Bh4.LIZ() && mediaSessionService != null) {
                PrintStream printStream = System.err;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("service info---->:");
                sbLIZ.append(mediaSessionService.getClass().getCanonicalName());
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            }
            mediaSessionService.startForeground(2131858564, notification);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
