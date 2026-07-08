package X;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import com.bytedance.sliver.Sliver;

/* JADX INFO: renamed from: X.0XA7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XA7 {
    public static final C0XA7 LIZ = new C0XA7();
    public static volatile boolean LIZIZ;

    public static void LIZ(String str) {
        C0XAD c0xadLIZ = C0XAD.LIZ();
        if (str.equals(c0xadLIZ.LIZIZ)) {
            Sliver.stop(Looper.getMainLooper().getThread());
            if (C791390V2r.LJJIII.LJJIFFI) {
                C0XA8.LIZ(false);
            }
            c0xadLIZ.LIZIZ = null;
        }
    }

    public static void LIZIZ(Context context, String str, C0XAE c0xae) {
        if (!LIZIZ) {
            LIZIZ = true;
            Context contextN3 = null;
            if (context != null) {
                contextN3 = C786410Ut5.N3(context);
            }
            if ((contextN3 instanceof Application) && contextN3 != null) {
                C0XAB c0xab = new C0XAB();
                c0xab.LIZ = true;
                c0xab.LIZIZ = true;
                C2123408To c2123408To = new C2123408To(C0WQX.FIXED);
                c2123408To.LIZJ = 1;
                c2123408To.LIZIZ = "scalpel_scene_thread";
                c0xab.LIZJ = C823050WQl.LIZ(new C2123508Tp(c2123408To));
                if (!C0XAA.LIZIZ) {
                    C0XAA.LIZJ = new C0XAW();
                    C0XAA.LIZ = c0xab;
                    C0XAA.LIZIZ = true;
                }
            }
            Sliver.init(false);
        }
        C0XAD c0xadLIZ = C0XAD.LIZ();
        if (c0xadLIZ.LIZIZ == null) {
            c0xadLIZ.LIZIZ = str;
            c0xadLIZ.LIZ = c0xae;
            C0XA8.LIZ = true;
            C0VX6 c0vx6 = C0VX6.LIZIZ;
            Sliver.unRegisterSamplingListener(c0vx6);
            Sliver.registerSamplingListener(c0vx6);
            C0XA8.LIZIZ = new C0XA9(c0xae);
            Sliver.start(Looper.getMainLooper().getThread(), (int) c0xae.LIZIZ, 100000, EnumC795650VJb.RING);
            if (C791390V2r.LJJIII.LJJIFFI) {
                C0XA8.LIZ(true);
            }
        }
    }
}
