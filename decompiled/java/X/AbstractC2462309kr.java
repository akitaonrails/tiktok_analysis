package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.play.core.install.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.09kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2462309kr {
    public final C2461909kn LIZ;
    public final IntentFilter LIZIZ;
    public final Context LIZJ;
    public final Set LIZLLL = new HashSet();
    public C2462209kq LJ = null;

    public final synchronized void LIZ() {
        C19262110Xj c19262110Xj = C19262110Xj.LIZ;
        synchronized (this) {
            this.LIZ.LIZJ("registerListener", new Object[0]);
            ((HashSet) this.LIZLLL).add(c19262110Xj);
            LIZJ();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.09kq, android.content.BroadcastReceiver] */
    public final void LIZJ() throws Exception {
        C2462209kq c2462209kq;
        if (!((HashSet) this.LIZLLL).isEmpty() && this.LJ == null) {
            ?? r3 = new BroadcastReceiver() { // from class: X.09kq
                public final void LIZ(Context context, Intent intent) {
                    String stringExtra;
                    Bundle extras;
                    Bundle extras2;
                    Object obj;
                    AbstractC2462309kr abstractC2462309kr = this.LIZ;
                    abstractC2462309kr.getClass();
                    String packageName = context.getPackageName();
                    String stringExtra2 = null;
                    try {
                        stringExtra = intent.getStringExtra("package.name");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        stringExtra = null;
                    }
                    if (!packageName.equals(stringExtra)) {
                        C2461909kn c2461909kn = abstractC2462309kr.LIZ;
                        Object[] objArr = new Object[1];
                        try {
                            stringExtra2 = intent.getStringExtra("package.name");
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        objArr[0] = stringExtra2;
                        c2461909kn.LIZ("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", objArr);
                        return;
                    }
                    abstractC2462309kr.LIZ.LIZ("List of extras in received intent:", new Object[0]);
                    try {
                        extras = intent.getExtras();
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        extras = null;
                    }
                    for (String str : extras.keySet()) {
                        C2461909kn c2461909kn2 = abstractC2462309kr.LIZ;
                        Object[] objArr2 = new Object[2];
                        objArr2[0] = str;
                        try {
                            extras2 = intent.getExtras();
                        } catch (Exception e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            extras2 = null;
                        }
                        try {
                            obj = extras2.get(str);
                        } catch (Exception e5) {
                            TryCatchGuardChecker.doCheck(e5);
                            obj = null;
                        } catch (OutOfMemoryError e6) {
                            TryCatchGuardChecker.doCheck(e6);
                            obj = null;
                        }
                        objArr2[1] = obj;
                        c2461909kn2.LIZ("Key: %s; value: %s", objArr2);
                    }
                    C2461909kn c2461909kn3 = abstractC2462309kr.LIZ;
                    c2461909kn3.LIZ("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                    c2461909kn3.LIZ("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                    c2461909kn3.LIZ("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                    int intExtra = intent.getIntExtra("install.status", 0);
                    long longExtra = intent.getLongExtra("bytes.downloaded", 0L);
                    long longExtra2 = intent.getLongExtra("total.bytes.to.download", 0L);
                    int intExtra2 = intent.getIntExtra("error.code", 0);
                    try {
                        stringExtra2 = intent.getStringExtra("package.name");
                    } catch (Exception e7) {
                        TryCatchGuardChecker.doCheck(e7);
                    }
                    b bVar = new b(intExtra, longExtra, longExtra2, intExtra2, stringExtra2);
                    abstractC2462309kr.LIZ.LIZ("ListenerRegistryBroadcastReceiver.onReceive: %s", bVar);
                    synchronized (abstractC2462309kr) {
                        Iterator it2 = new HashSet(abstractC2462309kr.LIZLLL).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC2425409eu) it2.next()).LIZ(bVar);
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
        if (!((HashSet) this.LIZLLL).isEmpty() || (c2462209kq = this.LJ) == null) {
            return;
        }
        C786410Ut5.LJJIFFI(this.LIZJ, c2462209kq);
        this.LJ = null;
    }

    public final synchronized void LIZIZ(C19262110Xj c19262110Xj) {
        this.LIZ.LIZJ("unregisterListener", new Object[0]);
        ((HashSet) this.LIZLLL).remove(c19262110Xj);
        LIZJ();
    }

    public AbstractC2462309kr(C2461909kn c2461909kn, IntentFilter intentFilter, Context context) {
        this.LIZ = c2461909kn;
        this.LIZIZ = intentFilter;
        Context contextN3 = C786410Ut5.N3(context);
        this.LIZJ = contextN3 != null ? contextN3 : context;
    }
}
