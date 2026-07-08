package X;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.tnc.TNCManager;
import java.net.MalformedURLException;

/* JADX INFO: renamed from: X.0oxy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1493440oxy implements InterfaceC1493600oyE {
    public static volatile C1493440oxy LIZJ;
    public final C1493630oyH LIZ;
    public volatile int LIZIZ;

    public C1493440oxy(C1493630oyH c1493630oyH) {
        this.LIZ = c1493630oyH;
    }

    @Override // X.InterfaceC1493760oyU
    public final InterfaceC1494830p0D LIZ(Request request) {
        try {
            return this.LIZ.LIZ(request);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!(th instanceof MalformedURLException) && (th.getMessage() == null || !th.getMessage().contains("MalformedURLException"))) {
                Logger.debug();
                EnumC1493300oxk enumC1493300oxk = C1497080p3q.LJ().LIZ;
                if (enumC1493300oxk == EnumC1493300oxk.PRE_INIT || enumC1493300oxk == EnumC1493300oxk.FORCE_INIT) {
                    int i = this.LIZIZ + 1;
                    this.LIZIZ = i;
                    if (i > 3) {
                        if (!C1490250osp.LJ.get()) {
                            Logger.debug();
                            C1493430oxx.LIZJ = true;
                        }
                        String strLIZIZ = C2211308lT.LIZIZ(th);
                        C1493430oxx.LJ = strLIZIZ;
                        if (strLIZIZ.length() > 256) {
                            C1493430oxx.LJ = C1493430oxx.LJ.substring(0, 256);
                        }
                    }
                }
            }
            TTNetInit.notifyColdStartFinish();
            if (request.getMetrics() != null) {
                String strLIZIZ2 = C2211308lT.LIZIZ(th);
                if (strLIZIZ2.length() > 1024) {
                    strLIZIZ2 = strLIZIZ2.substring(0, 1024);
                }
                request.getMetrics().LJIIIIZZ = strLIZIZ2;
                request.getMetrics().LJII = 10;
                Logger.debug();
            }
            Context context = TTNetInit.getTTNetDepend().getContext();
            C1493780oyW c1493780oyWLJII = C1493780oyW.LJII(context);
            if (C2104008Mc.LIZJ(context)) {
                TNCManager tNCManagerLJI = TNCManager.LJI();
                c1493780oyWLJII.getClass();
                C1493780oyW.LJIIJJI = tNCManagerLJI;
            }
            return c1493780oyWLJII.LIZ(request);
        }
    }
}
