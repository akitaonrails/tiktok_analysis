package X;

import android.app.Application;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.WindowManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1BUQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BUQ {
    public static final C1046020dKK LIZ = new C1046020dKK();

    /* JADX WARN: Type inference failed for: r2v0, types: [X.1BUr] */
    public static void LIZ(Context context) {
        C1046020dKK c1046020dKK = LIZ;
        Context contextN3 = C786410Ut5.N3(context);
        C1045780dJw.LIZ(contextN3, "Application Context cannot be null");
        if (!c1046020dKK.LIZ) {
            c1046020dKK.LIZ = true;
            C1BUX c1buxLIZ = C1BUX.LIZ();
            c1buxLIZ.LIZJ.getClass();
            ?? r2 = new Object() { // from class: X.1BUr
            };
            C2205811BUt c2205811BUt = c1buxLIZ.LIZIZ;
            BPEAHandler bPEAHandler = new BPEAHandler();
            c2205811BUt.getClass();
            c1buxLIZ.LIZLLL = new C1BUR(bPEAHandler, contextN3, r2, c1buxLIZ);
            C1BUS c1bus = C1BUS.LLILZ;
            boolean z = contextN3 instanceof Application;
            if (z) {
                ((Application) contextN3).registerActivityLifecycleCallbacks(c1bus);
            }
            C21689819ua.LIZ = (UiModeManager) C786410Ut5.H2(contextN3, "uimode");
            WindowManager windowManager = C1287890jcR.LIZ;
            C1287890jcR.LIZJ = contextN3.getResources().getDisplayMetrics().density;
            C1287890jcR.LIZ = (WindowManager) C786410Ut5.H2(contextN3, "window");
            C786410Ut5.LJIJJ(contextN3, new BroadcastReceiver() { // from class: X.0UyJ
                public static void LIZ(Intent intent) {
                    EnumC792980V8u enumC792980V8u;
                    if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                        int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                        if (intExtra == 0) {
                            enumC792980V8u = EnumC792980V8u.NOT_DETECTED;
                        } else if (intExtra != 1) {
                            return;
                        } else {
                            enumC792980V8u = EnumC792980V8u.UNKNOWN;
                        }
                        C789660UyK.LIZ = enumC792980V8u;
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
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
            }, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
            C1BUO.LIZIZ.LIZ = C786410Ut5.N3(contextN3);
            C1BUU c1buu = C1BUU.LJFF;
            if (!c1buu.LIZJ) {
                C2205671BUf c2205671BUf = c1buu.LIZLLL;
                c2205671BUf.getClass();
                if (z) {
                    ((Application) contextN3).registerActivityLifecycleCallbacks(c2205671BUf);
                }
                C2205671BUf c2205671BUf2 = c1buu.LIZLLL;
                c2205671BUf2.LLILLL = c1buu;
                c2205671BUf2.LL = true;
                boolean zLIZ = c2205671BUf2.LIZ();
                c2205671BUf2.LLILLJJLI = zLIZ;
                c2205671BUf2.LIZJ(zLIZ);
                c1buu.LJ = c1buu.LIZLLL.LLILLJJLI;
                c1buu.LIZJ = true;
            }
            C1BUT.LIZLLL.LIZ = new WeakReference<>(contextN3);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            C786410Ut5.LJIJJ(contextN3, new BroadcastReceiver() { // from class: X.0Uyp
                public final /* synthetic */ C1BUT LIZ = C1BUT.LIZLLL;

                public final void LIZ(Intent intent) {
                    C1BUT c1but;
                    boolean z2;
                    boolean z3;
                    if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                        c1but = this.LIZ;
                        z2 = c1but.LIZJ;
                        z3 = true;
                    } else {
                        if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                            return;
                        }
                        c1but = this.LIZ;
                        z2 = c1but.LIZJ;
                        z3 = false;
                    }
                    c1but.LIZ(z3, z2);
                    this.LIZ.LIZIZ = z3;
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
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
            }, intentFilter);
        }
    }
}
