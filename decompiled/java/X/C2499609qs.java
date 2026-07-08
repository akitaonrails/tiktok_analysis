package X;

import Y.ARunnableS103S0100000_3;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.CustomTabActivity;
import com.ss.android.ugc.aweme.lifecycle.task.KeepWarmJobService;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09qs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2499609qs extends BroadcastReceiver {
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
            default:
                super.onReceive(context, intent);
                break;
        }
    }

    public final void LIZ$0(Intent intent) {
        String stringExtra;
        if (intent != null) {
            try {
                try {
                    stringExtra = intent.getStringExtra("PROCESS_NAME");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
                Context context = C792400V6o.LIZ;
                String strLIZ = C08MX.LIZ();
                C792400V6o.LJIIIIZZ();
                if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(strLIZ) && !stringExtra.equals(strLIZ)) {
                    C787900UvU.LIZ.LIZJ(new ARunnableS103S0100000_3(this, 82));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LIZ$1(Intent intent) {
        int iIntValue;
        String action = intent.getAction();
        Integer numLJLZ = ((C743070TCv) this.l0).LLJIJIL.LJLZ();
        if (numLJLZ != null) {
            iIntValue = numLJLZ.intValue();
        } else {
            iIntValue = 0;
        }
        if (Intrinsics.LJFF("android.intent.action.SCREEN_ON", action)) {
            ((C743070TCv) this.l0).LLJIJIL.onNext(Integer.valueOf(iIntValue & (-3)));
        } else {
            if (!Intrinsics.LJFF("android.intent.action.SCREEN_OFF", action)) {
                return;
            }
            ((C743070TCv) this.l0).LLJIJIL.onNext(Integer.valueOf(iIntValue | 2));
        }
    }

    public C2499609qs(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onReceive$0(C2499609qs c2499609qs, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ((CustomTabActivity) c2499609qs.l0).finish();
        } else {
            C2408409cA.LIZ();
            ((CustomTabActivity) c2499609qs.l0).finish();
        }
    }

    public static final void onReceive$1(C2499609qs c2499609qs, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (((KeepWarmJobService) c2499609qs.l0).LLILLL != null) {
                ((KeepWarmJobService) c2499609qs.l0).LIZIZ();
            }
        } else {
            C2408409cA.LIZ();
            if (((KeepWarmJobService) c2499609qs.l0).LLILLL == null) {
                return;
            }
            ((KeepWarmJobService) c2499609qs.l0).LIZIZ();
        }
    }

    public static final void onReceive$2(C2499609qs c2499609qs, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c2499609qs.LIZ$0(intent);
        } else {
            C2408409cA.LIZ();
            c2499609qs.LIZ$0(intent);
        }
    }

    public static final void onReceive$3(C2499609qs c2499609qs, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (Intrinsics.LJFF(intent.getAction(), "android.media.AUDIO_BECOMING_NOISY")) {
                ((Function0) c2499609qs.l0).invoke();
            }
        } else {
            C2408409cA.LIZ();
            if (!Intrinsics.LJFF(intent.getAction(), "android.media.AUDIO_BECOMING_NOISY")) {
                return;
            }
            ((Function0) c2499609qs.l0).invoke();
        }
    }

    public static final void onReceive$4(C2499609qs c2499609qs, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c2499609qs.LIZ$1(intent);
        } else {
            C2408409cA.LIZ();
            c2499609qs.LIZ$1(intent);
        }
    }
}
