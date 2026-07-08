package X;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Uyn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789950Uyn extends BroadcastReceiver {
    public final Context LIZ;
    public final KeyguardManager LIZIZ;
    public final PowerManager LIZJ;
    public final WeakReference<InterfaceC789960Uyo> LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final void LIZIZ() {
        try {
            if (this.LJFF) {
                return;
            }
            this.LJFF = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C786410Ut5.LJIJJ(this.LIZ, this, intentFilter);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LJFF = false;
        }
    }

    public final void LIZ(Intent intent) {
        InterfaceC789960Uyo interfaceC789960Uyo = this.LIZLLL.get();
        if (interfaceC789960Uyo == null) {
            return;
        }
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_OFF".equals(action)) {
            this.LJ = false;
            interfaceC789960Uyo.onScreenOff();
            return;
        }
        if ("android.intent.action.SCREEN_ON".equals(action)) {
            interfaceC789960Uyo.onScreenOn();
            if (this.LJ) {
                return;
            }
            try {
                KeyguardManager keyguardManager = this.LIZIZ;
                if (keyguardManager != null) {
                    if (keyguardManager.isKeyguardLocked()) {
                        return;
                    }
                }
                this.LJ = true;
                interfaceC789960Uyo.onScreenUserPresent(true);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        if (!"android.intent.action.USER_PRESENT".equals(action) || this.LJ) {
            return;
        }
        this.LJ = true;
        interfaceC789960Uyo.onScreenUserPresent(false);
    }

    public C789950Uyn(Context context, InterfaceC789960Uyo interfaceC789960Uyo) {
        this.LIZ = C786410Ut5.N3(context);
        this.LIZJ = (PowerManager) C786410Ut5.H2(context, "power");
        this.LIZIZ = (KeyguardManager) C786410Ut5.H2(context, "keyguard");
        this.LIZLLL = new WeakReference<>(interfaceC789960Uyo);
        LIZIZ();
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
}
