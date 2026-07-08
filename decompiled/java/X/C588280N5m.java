package X;

import Y.ARunnableS109S0100000_9;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0N5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C588280N5m {
    public final Set<WeakReference<InterfaceC586790Mzt>> LIZ = Collections.synchronizedSet(new HashSet());
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final Context LIZJ;

    public C588280N5m(Context context) {
        this.LIZJ = context;
    }

    public final synchronized void LIZ(InterfaceC586790Mzt interfaceC586790Mzt) {
        this.LIZ.add(new WeakReference<>(interfaceC586790Mzt));
        if (this.LIZIZ.compareAndSet(false, true)) {
            try {
                C786410Ut5.LJIJJ(this.LIZJ, new BroadcastReceiver() { // from class: X.0WUw
                    public boolean LIZ = true;

                    public final void LIZ(Intent intent) {
                        if (this.LIZ) {
                            this.LIZ = false;
                            return;
                        }
                        if (intent == null) {
                            C844830XCf.LIZ("intent is null when receive net change event");
                            return;
                        }
                        if (intent.getBooleanExtra("noConnectivity", false)) {
                            C844830XCf.LIZ("no connectivity");
                        } else if (C2106408Na.LIZ(this.LIZIZ.LIZJ)) {
                            C588280N5m c588280N5m = this.LIZIZ;
                            synchronized (c588280N5m) {
                                C824170WUt.LJ(new ARunnableS109S0100000_9(c588280N5m, 221), C824170WUt.LIZ(C824170WUt.LIZLLL));
                            }
                        }
                    }

                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context, Intent intent) {
                        if (!C2214201BlK.LJIIJJI && intent != null) {
                            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                                C2188191AkT.LIZIZ();
                            }
                        }
                        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                            LIZ(intent);
                        } else {
                            C2408409cA.LIZ();
                            LIZ(intent);
                        }
                    }
                }, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZIZ(X.InterfaceC586790Mzt r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Set<java.lang.ref.WeakReference<X.0Mzt>> r0 = r2.LIZ     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L26
        L7:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L24
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L26
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L19
            r1.remove()     // Catch: java.lang.Throwable -> L26
            goto L7
        L19:
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L26
            X.0Mzt r0 = (X.InterfaceC586790Mzt) r0     // Catch: java.lang.Throwable -> L26
            if (r0 != r3) goto L7
            r1.remove()     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r2)
            return
        L26:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C588280N5m.LIZIZ(X.0Mzt):void");
    }
}
