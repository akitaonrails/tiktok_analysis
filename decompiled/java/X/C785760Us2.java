package X;

import Y.ARunnableS81S0200000_12;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.android.livesdk.comp.api.game.GameBroadcastStateChannel;
import com.bytedance.android.livesdk.comp.api.game.GameOrientationChangeEvent;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Us2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C785760Us2 extends BroadcastReceiver {
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
            default:
                super.onReceive(context, intent);
                break;
        }
    }

    public final void LIZ$0(Intent intent) {
        GameBroadcastFragment gameBroadcastFragment;
        String action = intent.getAction();
        if (Intrinsics.LJFF("android.intent.action.SCREEN_ON", action)) {
            C776300Ucm c776300Ucm = (C776300Ucm) this.l0;
            if (!c776300Ucm.LLJI) {
                DataChannel dataChannel = c776300Ucm.LLILLJJLI;
                if (dataChannel != null) {
                    dataChannel.zW(GameBroadcastStateChannel.class, C0TD3.STATE_RESUMING);
                }
                C776300Ucm c776300Ucm2 = (C776300Ucm) this.l0;
                c776300Ucm2.LIZLLL(2002, c776300Ucm2.LLILZLL);
                return;
            }
        }
        if (Intrinsics.LJFF("android.intent.action.SCREEN_OFF", action) && (gameBroadcastFragment = ((C776300Ucm) this.l0).LL) != null) {
            C774940Uaa c774940Uaa = gameBroadcastFragment.LLJJIJIIJIL;
            if (c774940Uaa == null) {
                c774940Uaa = null;
            }
            c774940Uaa.LJ();
        }
    }

    public final void LIZ$2(Intent intent) {
        String action = intent.getAction();
        if (((C774940Uaa) this.l0).LLILZ == null) {
            return;
        }
        if ("android.intent.action.SCREEN_ON".equals(action)) {
            C774940Uaa c774940Uaa = (C774940Uaa) this.l0;
            if (!c774940Uaa.LLIZLLLIL) {
                c774940Uaa.LJFF();
                return;
            }
        }
        if (!"android.intent.action.SCREEN_OFF".equals(action)) {
            return;
        }
        ((C774940Uaa) this.l0).LJ();
    }

    public final void LIZ$3(Intent intent) {
        String action;
        String action2 = null;
        if (intent != null) {
            action = intent.getAction();
        } else {
            action = null;
        }
        if (Intrinsics.LJFF(action, "android.intent.action.ACTION_POWER_CONNECTED")) {
            if (Intrinsics.LJFF(((C775180Uay) this.l0).LJII, "android.intent.action.ACTION_POWER_CONNECTED")) {
                return;
            }
            C775180Uay c775180Uay = (C775180Uay) this.l0;
            c775180Uay.LJII = "android.intent.action.ACTION_POWER_CONNECTED";
            if (c775180Uay.LJFF <= 0) {
                c775180Uay.LIZLLL();
            }
            ((C775180Uay) this.l0).LJ(true);
            return;
        }
        if (intent != null) {
            action2 = intent.getAction();
        }
        if (!Intrinsics.LJFF(action2, "android.intent.action.ACTION_POWER_DISCONNECTED") || Intrinsics.LJFF(((C775180Uay) this.l0).LJII, "android.intent.action.ACTION_POWER_DISCONNECTED")) {
            return;
        }
        C775180Uay c775180Uay2 = (C775180Uay) this.l0;
        c775180Uay2.LJII = "android.intent.action.ACTION_POWER_DISCONNECTED";
        c775180Uay2.LIZ();
        ((C775180Uay) this.l0).LJ(false);
    }

    public C785760Us2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public final void LIZ$1(Context context, Intent intent) {
        boolean z;
        Window window;
        View decorView;
        if (!TextUtils.equals(intent.getAction(), "android.intent.action.CONFIGURATION_CHANGED")) {
            return;
        }
        int iLIZLLL = C779350Uhh.LIZLLL();
        int iLIZJ = C779350Uhh.LIZJ();
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(C786410Ut5.N3(context), "window");
        Point point = new Point();
        try {
            C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5Kt9lP0Hf23rV1vA77nf4Wj+MIwLVVugJd4w=", null)).getSize(point);
            iLIZLLL = point.x;
            iLIZJ = point.y;
            z = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5Kt9lP0Hf23rV1vA77nf4Wj+MIwLVVugJd4w=", null)).getRotation() != 1) {
            z = false;
        }
        if (iLIZLLL > iLIZJ && z && Build.VERSION.SDK_INT >= 28) {
            C776870Udh c776870Udh = (C776870Udh) this.l0;
            C19EG activity = c776870Udh.LIZIZ.getActivity();
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                HandlerHook.viewPost(decorView, new ARunnableS81S0200000_12(c776870Udh, decorView, 134));
            }
        } else {
            C776870Udh c776870Udh2 = (C776870Udh) this.l0;
            c776870Udh2.getClass();
            EnumC779790UiP enumC779790UiP = EnumC779790UiP.CMD_ORIENTATION_CHANGED;
            enumC779790UiP.setParam(new C779230UhV());
            c776870Udh2.LJJII(enumC779790UiP);
        }
        C776870Udh c776870Udh3 = (C776870Udh) this.l0;
        if (c776870Udh3.LJIIJJI) {
            c776870Udh3.LIZJ.LC0(GameOrientationChangeEvent.class, Boolean.FALSE);
        }
        C474500IjA c474500IjALJIIZILJ = ((C776870Udh) this.l0).LJIIZILJ();
        ((C776870Udh) this.l0).LJJIIJ(context, "orientation_changed", c474500IjALJIIZILJ);
        ((C776870Udh) this.l0).LJJI(c474500IjALJIIZILJ, false);
    }

    public static final void onReceive$0(C785760Us2 c785760Us2, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c785760Us2.LIZ$0(intent);
        } else {
            C2408409cA.LIZ();
            c785760Us2.LIZ$0(intent);
        }
    }

    public static final void onReceive$1(C785760Us2 c785760Us2, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c785760Us2.LIZ$1(context, intent);
        } else {
            C2408409cA.LIZ();
            c785760Us2.LIZ$1(context, intent);
        }
    }

    public static final void onReceive$2(C785760Us2 c785760Us2, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c785760Us2.LIZ$2(intent);
        } else {
            C2408409cA.LIZ();
            c785760Us2.LIZ$2(intent);
        }
    }

    public static final void onReceive$3(C785760Us2 c785760Us2, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c785760Us2.LIZ$3(intent);
        } else {
            C2408409cA.LIZ();
            c785760Us2.LIZ$3(intent);
        }
    }
}
