package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.top.TopStatusBarVM;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qYA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554320qYA extends BroadcastReceiver {
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
            default:
                super.onReceive(context, intent);
                break;
        }
    }

    public final void LIZ$0(Intent intent) {
        int intExtra;
        int intExtra2;
        int intExtra3;
        boolean z;
        if (intent != null) {
            intExtra = intent.getIntExtra("level", -1);
            intExtra2 = intent.getIntExtra("scale", -1);
            intExtra3 = intent.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1);
        } else {
            intExtra = -1;
            intExtra2 = -1;
            intExtra3 = -1;
        }
        TopStatusBarVM topStatusBarVM = (TopStatusBarVM) this.l0;
        if (intExtra3 == 2) {
            z = true;
        } else {
            z = false;
        }
        topStatusBarVM.getClass();
        topStatusBarVM.setState(new AwS41S0010000_29(z, 89));
        if (intExtra != -1 && intExtra2 != -1) {
            TopStatusBarVM topStatusBarVM2 = (TopStatusBarVM) this.l0;
            topStatusBarVM2.getClass();
            topStatusBarVM2.setState(new AwS41S0001000_29((int) ((intExtra * 100) / intExtra2), 41));
        }
    }

    public final void LIZ$1(Intent intent) {
        String action;
        if (intent != null) {
            action = intent.getAction();
        } else {
            action = null;
        }
        if (Intrinsics.LJFF(action, "android.media.AUDIO_BECOMING_NOISY")) {
            ((C1351810lHX) this.l0).LIZ.LIZ();
        } else {
            if (!Intrinsics.LJFF(action, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") || intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0) != 0) {
                return;
            }
            ((C1351810lHX) this.l0).LIZ.LIZ();
        }
    }

    public C1554320qYA(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LIZ$2(Context context, Intent intent) {
        boolean z;
        C1487390ooD c1487390ooD = (C1487390ooD) this.l0;
        if (context == null || intent == null) {
            return;
        }
        try {
            boolean z2 = c1487390ooD.LIZ;
            String action = intent.getAction();
            boolean z3 = false;
            if (action != null) {
                switch (action.hashCode()) {
                    case -1676458352:
                        if (action.equals("android.intent.action.HEADSET_PLUG")) {
                            if (intent.getIntExtra("state", 0) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            c1487390ooD.LIZ = z;
                            if (!z && c1487390ooD.LIZLLL) {
                                c1487390ooD.LIZLLL = false;
                                z3 = true;
                            }
                        }
                        break;
                    case -1530327060:
                        if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED") && intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0) == 10 && c1487390ooD.LJ) {
                            c1487390ooD.LIZ = false;
                        }
                        break;
                    case -549244379:
                        if (action.equals("android.media.AUDIO_BECOMING_NOISY")) {
                            c1487390ooD.LIZ = false;
                            c1487390ooD.LJ = false;
                            z3 = true;
                        }
                        break;
                    case 545516589:
                        if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
                            if (intExtra != 0) {
                                if (intExtra == 2) {
                                    c1487390ooD.LIZ = true;
                                }
                            } else {
                                c1487390ooD.LIZ = false;
                            }
                        }
                        break;
                }
            }
            boolean z4 = c1487390ooD.LIZ;
            if ((z2 != z4 && !z4) || z3) {
                C1487370ooB c1487370ooB = C1487370ooB.LIZ;
                C1487360ooA c1487360ooA = C1487370ooB.LJI;
                if (c1487360ooA.isPlaying()) {
                    c1487360ooA.LIZJ(3);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final void onReceive$0(C1554320qYA c1554320qYA, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c1554320qYA.LIZ$0(intent);
        } else {
            C2408409cA.LIZ();
            c1554320qYA.LIZ$0(intent);
        }
    }

    public static final void onReceive$1(C1554320qYA c1554320qYA, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c1554320qYA.LIZ$1(intent);
        } else {
            C2408409cA.LIZ();
            c1554320qYA.LIZ$1(intent);
        }
    }

    public static final void onReceive$2(C1554320qYA c1554320qYA, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c1554320qYA.LIZ$2(context, intent);
        } else {
            C2408409cA.LIZ();
            c1554320qYA.LIZ$2(context, intent);
        }
    }
}
