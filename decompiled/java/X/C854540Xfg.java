package X;

import Y.ARunnableS113S0100000_13;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.util.AnimaXLog;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ui.assem.MainPagePerformanceAssem;
import com.ss.optimizer.live.sdk.dns.DnsOptimizer;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854540Xfg extends BroadcastReceiver {
    public final int $t;
    public Object l0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.$t) {
            case 0:
                onReceive$0(this, context, intent);
                break;
            case 1:
                onReceive$1(this, context, intent);
                break;
            case 2:
                onReceive$2(this, context, intent);
                break;
            case 3:
                onReceive$3(this, context, intent);
                break;
            case 4:
                onReceive$4(this, context, intent);
                break;
            case 5:
                onReceive$5(this, context, intent);
                break;
            case 6:
                onReceive$6(this, context, intent);
                break;
            case 7:
                onReceive$7(this, context, intent);
                break;
            case 8:
                onReceive$8(this, context, intent);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onReceive$9(this, context, intent);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onReceive$10(this, context, intent);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onReceive$11(this, context, intent);
                break;
            default:
                super.onReceive(context, intent);
                break;
        }
    }

    public final void LIZ$0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("detect screen unlock, force redraw ");
        sbLIZ.append(this);
        C1288370jdD.LIZJ("KryptonCanvasView", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS113S0100000_13(this, 0));
    }

    public final void LIZ$7() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("detect screen unlock, force redraw ");
        sbLIZ.append(this);
        AnimaXLog.LIZIZ("AnimaXView", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJJZZIII(C787470Uun.LIZ(), new ARunnableS113S0100000_13(this, 295));
    }

    public C854540Xfg(int i) {
        this.$t = i;
        this.l0 = C1045550dJZ.LJ;
    }

    public final void LIZ$1(Intent intent) {
        String action;
        if (intent != null) {
            action = intent.getAction();
        } else {
            action = null;
        }
        if (Intrinsics.LJFF("android.intent.action.SCREEN_OFF", action)) {
            MainPagePerformanceAssem mainPagePerformanceAssem = (MainPagePerformanceAssem) this.l0;
            mainPagePerformanceAssem.LLILLL.removeCallbacks(mainPagePerformanceAssem.LLILZIL);
            MainPagePerformanceAssem mainPagePerformanceAssem2 = (MainPagePerformanceAssem) this.l0;
            C786410Ut5.LJLIIL(10L, mainPagePerformanceAssem2.LLILLL, mainPagePerformanceAssem2.LLILZIL);
        }
    }

    public final void LIZ$6(Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            try {
                C848120XOw c848120XOw = (C848120XOw) this.l0;
                c848120XOw.LIZIZ = C804680VhS.LIZ(c848120XOw.LIZ);
                C1519760peQ<InterfaceC848130XOx> c1519760peQ = ((C848120XOw) this.l0).LIZJ;
                if (c1519760peQ != null) {
                    for (InterfaceC848130XOx interfaceC848130XOx : c1519760peQ) {
                        if (interfaceC848130XOx != null) {
                            interfaceC848130XOx.LIZ();
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LIZ$8(Intent intent) {
        if (intent == null) {
            return;
        }
        ((C787580Uuy) this.l0).LIZ = intent.getIntExtra("temperature", 0) / 10.0f;
        ((C787580Uuy) this.l0).LIZIZ = intent.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
        C787580Uuy c787580Uuy = (C787580Uuy) this.l0;
        intent.getIntExtra("plugged", -1);
        c787580Uuy.getClass();
    }

    public C854540Xfg(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public final void LIZ$2(Context context, Intent intent) {
        EnumC804620VhM enumC804620VhMLJ = C804420Vh2.LJ(context);
        EnumC807700VmK enumC807700VmK = (EnumC807700VmK) this.l0;
        if (enumC807700VmK.networkType != enumC804620VhMLJ) {
            enumC807700VmK.networkType = enumC804620VhMLJ;
            if (enumC807700VmK.currentVideoContext != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onNetWorkChanged networkType:");
                sbLIZ.append(enumC804620VhMLJ);
                C2188811AlT.LIZIZ(sbLIZ);
                ((EnumC807700VmK) this.l0).currentVideoContext.LJJLI(new C790900V0u() { // from class: X.0V0t
                });
                Iterator it2 = ((ConcurrentHashMap) ((EnumC807700VmK) this.l0).currentVideoContext.LLJ).entrySet().iterator();
                while (it2.hasNext()) {
                    C807710VmL c807710VmL = (C807710VmL) ((Map.Entry) it2.next()).getValue();
                    if (c807710VmL != null) {
                        c807710VmL.onNetWorkChanged(enumC804620VhMLJ, ((EnumC807700VmK) this.l0).currentVideoContext, context, intent);
                    }
                }
            }
        }
    }

    public final void LIZ$3(Context context, Intent intent) {
        NetworkInfo networkInfoLJIJ;
        if (isInitialStickyBroadcast() || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        boolean z = false;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
            if (connectivityManager != null && (networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager)) != null) {
                if (networkInfoLJIJ.isConnected()) {
                    z = true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!z) {
            ((DnsOptimizer) this.l0).LIZJ.removeMessages(1024);
            ((DnsOptimizer) this.l0).LJ();
        } else {
            ((DnsOptimizer) this.l0).LIZJ.removeMessages(1024);
            ((DnsOptimizer) this.l0).LJ();
            ((DnsOptimizer) this.l0).LJFF();
        }
    }

    public final void LIZ$4(Context context, Intent intent) {
        if (context != null && intent != null) {
            try {
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    try {
                        if (C036E.LIZ.LIZIZ()) {
                            C809310Vov c809310Vov = (C809310Vov) this.l0;
                            if (c809310Vov.LL) {
                                c809310Vov.LLILZ.sendEmptyMessage(0);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LIZ$5(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent == null) {
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            ((C1045550dJZ) this.l0).LIZ(true);
            return;
        }
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            ((C1045550dJZ) this.l0).LIZ(false);
        } else {
            if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) C786410Ut5.H2(context, "keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
                return;
            }
            ((C1045550dJZ) this.l0).LIZ(false);
        }
    }

    public static final void onReceive$0(C854540Xfg c854540Xfg, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c854540Xfg.LIZ$0();
        } else {
            C2408409cA.LIZ();
            c854540Xfg.LIZ$0();
        }
    }

    public static final void onReceive$1(C854540Xfg c854540Xfg, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ((AbstractC787190UuL) c854540Xfg.l0).LIZLLL();
        } else {
            C2408409cA.LIZ();
            ((AbstractC787190UuL) c854540Xfg.l0).LIZLLL();
        }
    }

    public static final void onReceive$10(C854540Xfg c854540Xfg, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c854540Xfg.LIZ$7();
        } else {
            C2408409cA.LIZ();
            c854540Xfg.LIZ$7();
        }
    }

    public static final void onReceive$11(C854540Xfg c854540Xfg, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c854540Xfg.LIZ$8(intent);
        } else {
            C2408409cA.LIZ();
            c854540Xfg.LIZ$8(intent);
        }
    }

    public static final void onReceive$2(C854540Xfg c854540Xfg, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c854540Xfg.LIZ$1(intent);
        } else {
            C2408409cA.LIZ();
            c854540Xfg.LIZ$1(intent);
        }
    }

    public static final void onReceive$3(C854540Xfg c854540Xfg, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c854540Xfg.LIZ$2(context, intent);
        } else {
            C2408409cA.LIZ();
            c854540Xfg.LIZ$2(context, intent);
        }
    }

    public static final void onReceive$4(C854540Xfg c854540Xfg, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c854540Xfg.LIZ$3(context, intent);
        } else {
            C2408409cA.LIZ();
            c854540Xfg.LIZ$3(context, intent);
        }
    }

    public static final void onReceive$5(C854540Xfg c854540Xfg, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ((C0VGM) c854540Xfg.l0).getClass();
            C0VGM c0vgm = (C0VGM) c854540Xfg.l0;
            c0vgm.LJ = false;
            c0vgm.LIZ(intent);
            return;
        }
        C2408409cA.LIZ();
        ((C0VGM) c854540Xfg.l0).getClass();
        C0VGM c0vgm2 = (C0VGM) c854540Xfg.l0;
        c0vgm2.LJ = false;
        c0vgm2.LIZ(intent);
    }

    public static final void onReceive$6(C854540Xfg c854540Xfg, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c854540Xfg.LIZ$4(context, intent);
        } else {
            C2408409cA.LIZ();
            c854540Xfg.LIZ$4(context, intent);
        }
    }

    public static final void onReceive$7(C854540Xfg c854540Xfg, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c854540Xfg.LIZ$5(context, intent);
        } else {
            C2408409cA.LIZ();
            c854540Xfg.LIZ$5(context, intent);
        }
    }

    public static final void onReceive$8(C854540Xfg c854540Xfg, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (Intrinsics.LJFF(intent.getAction(), "android.net.wifi.SCAN_RESULTS")) {
                ((C1798470wtx) c854540Xfg.l0).LIZIZ(true, false);
            }
        } else {
            C2408409cA.LIZ();
            if (!Intrinsics.LJFF(intent.getAction(), "android.net.wifi.SCAN_RESULTS")) {
                return;
            }
            ((C1798470wtx) c854540Xfg.l0).LIZIZ(true, false);
        }
    }

    public static final void onReceive$9(C854540Xfg c854540Xfg, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c854540Xfg.LIZ$6(intent);
        } else {
            C2408409cA.LIZ();
            c854540Xfg.LIZ$6(intent);
        }
    }
}
