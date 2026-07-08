package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0J9Y, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J9Y extends BroadcastReceiver {
    public WeakReference<Context> LIZ;
    public EnumC804620VhM LIZIZ = EnumC804620VhM.NONE;
    public final List<WeakReference<InterfaceC473790Ii1>> LIZJ = new ArrayList();
    public final Map<String, InterfaceC473790Ii1> LIZLLL = new ConcurrentHashMap();

    public final void LJ() {
        WeakReference<Context> weakReference = this.LIZ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        try {
            C786410Ut5.LJJIFFI(this.LIZ.get(), this);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ(InterfaceC473790Ii1 interfaceC473790Ii1) {
        ((ArrayList) this.LIZJ).add(new WeakReference(interfaceC473790Ii1));
    }

    public final void LIZIZ(Context context) {
        this.LIZ = new WeakReference<>(context);
        if (context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            C786410Ut5.LJIJJ(context, this, intentFilter);
        }
        this.LIZIZ = C804420Vh2.LJ(GlobalContext.getApplicationContext());
    }

    public final void LIZJ(Intent intent) {
        InterfaceC473790Ii1 interfaceC473790Ii1;
        if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            EnumC804620VhM enumC804620VhM = this.LIZIZ;
            EnumC804620VhM enumC804620VhMLJ = C804420Vh2.LJ(GlobalContext.getApplicationContext());
            this.LIZIZ = enumC804620VhMLJ;
            if (enumC804620VhM != enumC804620VhMLJ) {
                List<WeakReference<InterfaceC473790Ii1>> list = this.LIZJ;
                if (list != null) {
                    for (Reference reference : (ArrayList) list) {
                        if (reference != null && (interfaceC473790Ii1 = (InterfaceC473790Ii1) reference.get()) != null) {
                            interfaceC473790Ii1.LIZ(this.LIZIZ);
                        }
                    }
                }
                Iterator it2 = ((ConcurrentHashMap) this.LIZLLL).entrySet().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC473790Ii1) ((Map.Entry) it2.next()).getValue()).LIZ(this.LIZIZ);
                }
            }
        }
    }

    public final void LIZLLL(InterfaceC473790Ii1 interfaceC473790Ii1) {
        for (Reference reference : (ArrayList) this.LIZJ) {
            if (reference != null && reference.get() == interfaceC473790Ii1) {
                ((ArrayList) this.LIZJ).remove(reference);
                return;
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
            LIZJ(intent);
        } else {
            C2408409cA.LIZ();
            LIZJ(intent);
        }
    }
}
