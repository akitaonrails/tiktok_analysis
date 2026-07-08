package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.09k1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2457109k1 {
    public final C2458409kE LIZ;
    public final IntentFilter LIZIZ;
    public final Context LIZJ;
    public final Set LIZLLL = new HashSet();
    public C2456909jz LJ = null;
    public volatile boolean LJFF = false;

    public final synchronized void LIZ() {
        C2458209kC c2458209kC = C2458209kC.LIZ;
        synchronized (this) {
            this.LIZ.LIZLLL("registerListener", new Object[0]);
            ((HashSet) this.LIZLLL).add(c2458209kC);
            LIZJ();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.09jz, android.content.BroadcastReceiver] */
    public final void LIZJ() throws Exception {
        C2456909jz c2456909jz;
        if ((this.LJFF || !((HashSet) this.LIZLLL).isEmpty()) && this.LJ == null) {
            ?? r3 = new BroadcastReceiver() { // from class: X.09jz
                public final void LIZ(final Context context, final Intent intent) {
                    final C2457009k0 c2457009k0 = (C2457009k0) this.LIZ;
                    c2457009k0.getClass();
                    Bundle bundleG3 = C786410Ut5.g3(intent, "session_state");
                    if (bundleG3 != null) {
                        final C2458109kB c2458109kBLJIIL = AbstractC2457909k9.LJIIL(bundleG3);
                        c2457009k0.LIZ.LIZ("ListenerRegistryBroadcastReceiver.onReceive: %s", c2458109kBLJIIL);
                        InterfaceC2424509el interfaceC2424509elZza = ((EnumC2121908Sz) c2457009k0.LJII).zza();
                        if (c2458109kBLJIIL.LIZIZ == 3 && interfaceC2424509elZza != null) {
                            interfaceC2424509elZza.LIZ(c2458109kBLJIIL.LJIIIIZZ, new InterfaceC2121108Sr() { // from class: X.09k2
                                @Override // X.InterfaceC2121108Sr
                                public final void LIZIZ() throws Throwable {
                                    if (intent.getBooleanExtra("triggered_from_app_after_verification", false)) {
                                        c2457009k0.LIZ.LIZIZ("Splits copied and verified more than once.", new Object[0]);
                                    } else {
                                        intent.putExtra("triggered_from_app_after_verification", true);
                                        C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Byp57XuyfVlZixpfIbNzG9/9o7TreipzoH0e", new String[]{"016a9"}));
                                    }
                                }

                                @Override // X.InterfaceC2121108Sr
                                public final void zza() {
                                    C2457009k0 c2457009k02 = c2457009k0;
                                    C786410Ut5.LJJZZIII(c2457009k02.LJI, new RunnableC2457809k8(c2457009k02, c2458109kBLJIIL, 5, 0));
                                }

                                @Override // X.InterfaceC2121108Sr
                                public final void LIZ(int i) {
                                    C2457009k0 c2457009k02 = c2457009k0;
                                    C786410Ut5.LJJZZIII(c2457009k02.LJI, new RunnableC2457809k8(c2457009k02, c2458109kBLJIIL, 6, i));
                                }
                            });
                        } else {
                            c2457009k0.LJ(c2458109kBLJIIL);
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
                        LIZ(context, intent);
                    } else {
                        C2408409cA.LIZ();
                        LIZ(context, intent);
                    }
                }
            };
            this.LJ = r3;
            if (Build.VERSION.SDK_INT >= 33) {
                C786410Ut5.LJIJJLI(this.LIZJ, r3, this.LIZIZ, 2);
            } else {
                C786410Ut5.LJIJJ(this.LIZJ, r3, this.LIZIZ);
            }
        }
        if (this.LJFF || !((HashSet) this.LIZLLL).isEmpty() || (c2456909jz = this.LJ) == null) {
            return;
        }
        C786410Ut5.LJJIFFI(this.LIZJ, c2456909jz);
        this.LJ = null;
    }

    public final synchronized void LIZIZ(C2458109kB c2458109kB) {
        Iterator it2 = new HashSet(this.LIZLLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2425409eu) it2.next()).LIZ(c2458109kB);
        }
    }

    public AbstractC2457109k1(C2458409kE c2458409kE, IntentFilter intentFilter, Context context) {
        this.LIZ = c2458409kE;
        this.LIZIZ = intentFilter;
        Context contextN3 = C786410Ut5.N3(context);
        this.LIZJ = contextN3 != null ? contextN3 : context;
    }
}
