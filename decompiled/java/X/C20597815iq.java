package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20597815iq {
    public static volatile BPEAHandler LIZ;

    public static Handler LIZJ() {
        if (LIZ == null) {
            synchronized (C20597815iq.class) {
                try {
                    if (LIZ == null) {
                        if (C2213981Bky.LIZIZ.LIZLLL() || (((Number) C276970AtL.LIZ.getValue()).intValue() & 4) != 4) {
                            LIZ = new BPEAHandler(Looper.getMainLooper());
                        } else {
                            HandlerThread handlerThread = new HandlerThread("ImageStopLossLanect");
                            handlerThread.start();
                            LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:9:0x001c, B:11:0x0022, B:13:0x002c, B:15:0x0030, B:17:0x0036, B:19:0x003a, B:27:0x0063, B:29:0x0078, B:31:0x0084, B:34:0x0089, B:36:0x0098, B:20:0x004f, B:22:0x0053, B:25:0x005d), top: B:41:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.Object r7) {
        /*
            X.01GW r0 = X.C276970AtL.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L12
            return
        L12:
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            boolean r0 = r7 instanceof X.C1290900jhI
            if (r0 != 0) goto Laa
            boolean r0 = r7 instanceof X.C417500GYq
            if (r0 != 0) goto Laa
            android.graphics.drawable.Drawable r0 = r7.getDrawable()     // Catch: java.lang.Exception -> La6
            if (r0 == 0) goto Laa
            android.content.Context r0 = r7.getContext()     // Catch: java.lang.Exception -> La6
            android.app.Activity r6 = LIZIZ(r0)     // Catch: java.lang.Exception -> La6
            if (r6 == 0) goto Laa
            boolean r0 = r6 instanceof X.C19EG     // Catch: java.lang.Exception -> La6
            if (r0 == 0) goto L5d
            boolean r0 = X.C294780Bgy.LIZ()     // Catch: java.lang.Exception -> La6
            if (r0 == 0) goto L4f
            boolean r0 = r6 instanceof X.InterfaceC214897198d     // Catch: java.lang.Exception -> La6
            if (r0 == 0) goto L5d
        L3a:
            r2 = r6
            androidx.lifecycle.LifecycleOwner r2 = (androidx.lifecycle.LifecycleOwner) r2     // Catch: java.lang.Exception -> La6
            X.0QpW r1 = X.EnumC682280QpW.IS_DESTROY     // Catch: java.lang.Exception -> La6
            X.0TAd r0 = new X.0TAd     // Catch: java.lang.Exception -> La6
            r0.<init>(r6)     // Catch: java.lang.Exception -> La6
            java.lang.Object r0 = X.C1563370qml.LIZ(r2, r1, r0)     // Catch: java.lang.Exception -> La6
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> La6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> La6
            goto L61
        L4f:
            boolean r0 = r6 instanceof X.InterfaceC214897198d     // Catch: java.lang.Exception -> La6
            if (r0 == 0) goto L5d
            r0 = r6
            X.198d r0 = (X.InterfaceC214897198d) r0     // Catch: java.lang.Exception -> La6
            boolean r0 = r0.getEnableSAF()     // Catch: java.lang.Exception -> La6
            if (r0 == 0) goto L5d
            goto L3a
        L5d:
            boolean r0 = r6.isDestroyed()     // Catch: java.lang.Exception -> La6
        L61:
            if (r0 == 0) goto Laa
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> La6
            r5.<init>(r7)     // Catch: java.lang.Exception -> La6
            X.01GW r0 = X.C258800ACg.LIZ     // Catch: java.lang.Exception -> La6
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> La6
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> La6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> La6
            r3 = 2000(0x7d0, double:9.88E-321)
            if (r0 == 0) goto L98
            X.01GW r0 = X.C20597915ir.LIZIZ     // Catch: java.lang.Exception -> La6
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> La6
            com.ss.android.ugc.aweme.experiment.PreloadWidgetsData r0 = (com.ss.android.ugc.aweme.experiment.PreloadWidgetsData) r0     // Catch: java.lang.Exception -> La6
            boolean r0 = r0.disableRecycleImage     // Catch: java.lang.Exception -> La6
            if (r0 == 0) goto L89
            boolean r0 = r6 instanceof X.InterfaceC480050Is7     // Catch: java.lang.Exception -> La6
            if (r0 == 0) goto L89
            return
        L89:
            android.os.Handler r2 = LIZJ()     // Catch: java.lang.Exception -> La6
            Y.ARunnableS106S0100000_6 r1 = new Y.ARunnableS106S0100000_6     // Catch: java.lang.Exception -> La6
            r0 = 82
            r1.<init>(r5, r0)     // Catch: java.lang.Exception -> La6
            X.C786410Ut5.LJLIIL(r3, r2, r1)     // Catch: java.lang.Exception -> La6
            return
        L98:
            android.os.Handler r2 = LIZJ()     // Catch: java.lang.Exception -> La6
            Y.ARunnableS64S0300000_31 r1 = new Y.ARunnableS64S0300000_31     // Catch: java.lang.Exception -> La6
            r0 = 2
            r1.<init>(r6, r7, r5, r0)     // Catch: java.lang.Exception -> La6
            X.C786410Ut5.LJLIIL(r3, r2, r1)     // Catch: java.lang.Exception -> La6
            return
        La6:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20597815iq.LIZ(java.lang.Object):void");
    }

    public static Activity LIZIZ(Context context) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            return activityLIZ;
        }
        if (context instanceof ContextWrapper) {
            return LIZIZ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
