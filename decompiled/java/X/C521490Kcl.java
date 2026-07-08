package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.CustomTabMainActivity;
import com.ss.android.ugc.aweme.live.livehostimpl.BgBroadcastService;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.0Kcl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521490Kcl extends BroadcastReceiver {
    public final int $t;
    public Object l0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
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
            default:
                super.onReceive(context, intent);
                break;
        }
    }

    public final void LIZ$0(Intent intent) {
        C0IEB c0ieb;
        if (intent != null && "media_control".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("control_type", 0);
            if (intExtra != 1) {
                if (intExtra == 2 && (c0ieb = ((LivePlayFragment) this.l0).LLLFZ) != null) {
                    c0ieb.setMute(false, "pip");
                    C464170IId.LIZ().LIZIZ = false;
                    C784440Upu.LIZ().LIZIZ(new C463510IFp(false, false));
                    return;
                }
                return;
            }
            C0IEB c0ieb2 = ((LivePlayFragment) this.l0).LLLFZ;
            if (c0ieb2 == null) {
                return;
            }
            c0ieb2.setMute(true, "pip");
            C464170IId.LIZ().LIZIZ = true;
            C784440Upu.LIZ().LIZIZ(new C463510IFp(true, false));
        }
    }

    public final void LIZ$1(Intent intent) throws Throwable {
        String stringExtra;
        Intent intent2 = new Intent((CustomTabMainActivity) this.l0, (Class<?>) CustomTabMainActivity.class);
        intent2.setAction(CustomTabMainActivity.LLIZLLLIL);
        String str = CustomTabMainActivity.LLILZLL;
        try {
            stringExtra = intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        intent2.putExtra(str, stringExtra);
        intent2.addFlags(603979776);
        Activity activity = (CustomTabMainActivity) this.l0;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent2, "Context_startActivity_1");
        C1701330uNH.LIZ(intent2, activity);
        C0WZX c0wzx = new C0WZX("dzBzEgQ7XM/eWlgqCzGRdYUQ8nFIuLj3nLdFsCAYNNOYgQ==", new String[]{"019e5"});
        C0WST c0wst = new C0WST();
        Object[] objArr = {intent2};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "com/facebook/CustomTabMainActivity", "startActivity", activity, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11098, "com/facebook/CustomTabMainActivity", "startActivity", null, objArr, activity, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                activity = (Activity) obj;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            }
        }
        activity.startActivity(intent2);
        c0wst.LIZ(11098, "com/facebook/CustomTabMainActivity", "startActivity", null, objArr, activity, c0wzw, true);
    }

    public C521490Kcl(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onReceive$0(C521490Kcl c521490Kcl, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c521490Kcl.LIZ$0(intent);
        } else {
            C2408409cA.LIZ();
            c521490Kcl.LIZ$0(intent);
        }
    }

    public static final void onReceive$1(C521490Kcl c521490Kcl, Context context, Intent intent) throws Throwable {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            c521490Kcl.LIZ$1(intent);
        } else {
            C2408409cA.LIZ();
            c521490Kcl.LIZ$1(intent);
        }
    }

    public static final void onReceive$2(C521490Kcl c521490Kcl, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            Map<String, Object> map = C1338270kvh.LIZ;
            ((BgBroadcastService) c521490Kcl.l0).startForegroundWrapper();
        } else {
            C2408409cA.LIZ();
            Map<String, Object> map2 = C1338270kvh.LIZ;
            ((BgBroadcastService) c521490Kcl.l0).startForegroundWrapper();
        }
    }

    public static final void onReceive$3(C521490Kcl c521490Kcl, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            try {
                ((IntentSender) c521490Kcl.l0).sendIntent(context, 0, null, null, null);
                return;
            } catch (IntentSender.SendIntentException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C2408409cA.LIZ();
        try {
            ((IntentSender) c521490Kcl.l0).sendIntent(context, 0, null, null, null);
        } catch (IntentSender.SendIntentException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static final void onReceive$4(C521490Kcl c521490Kcl, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ((AbstractC789800UyY) c521490Kcl.l0).LJI(intent);
        } else {
            C2408409cA.LIZ();
            ((AbstractC789800UyY) c521490Kcl.l0).LJI(intent);
        }
    }

    public static final void onReceive$5(C521490Kcl c521490Kcl, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LocalBroadcastManager.LIZ(context).LIZLLL(c521490Kcl);
            ((C442840HYc) c521490Kcl.l0).LIZ.finish();
        } else {
            C2408409cA.LIZ();
            LocalBroadcastManager.LIZ(context).LIZLLL(c521490Kcl);
            ((C442840HYc) c521490Kcl.l0).LIZ.finish();
        }
    }
}
