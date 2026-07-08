package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0VmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C807640VmE extends BroadcastReceiver {
    public static C807640VmE LIZIZ;
    public final Context LIZ;

    public static final /* synthetic */ C807640VmE LIZ() {
        if (C807660VmG.LIZ(C807640VmE.class)) {
            return null;
        }
        try {
            return LIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final void finalize() {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            if (C807660VmG.LIZ(this)) {
                return;
            }
            try {
                LocalBroadcastManager.LIZ(this.LIZ).LIZLLL(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public C807640VmE(Context context) {
        this.LIZ = C786410Ut5.N3(context);
    }

    public final void LIZIZ(Intent intent) {
        String stringExtra;
        Bundle bundleG3;
        Set<String> setKeySet;
        Object obj;
        if (C807660VmG.LIZ(this)) {
            return;
        }
        if (intent != null) {
            try {
                try {
                    stringExtra = intent.getStringExtra("event_name");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        } else {
            stringExtra = null;
        }
        Intrinsics.LJIIJJI(stringExtra, "bf_");
        if (intent == null) {
            bundleG3 = null;
        } else {
            bundleG3 = C786410Ut5.g3(intent, "event_args");
        }
        Bundle bundle = new Bundle();
        if (bundleG3 != null && (setKeySet = bundleG3.keySet()) != null) {
            for (String str : setKeySet) {
                String strReplace = new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(str, "-"), ""), "");
                try {
                    obj = bundleG3.get(str);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj = null;
                } catch (OutOfMemoryError e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    obj = null;
                }
                C786410Ut5.LJJJI(strReplace, (String) obj, bundle);
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
            LIZIZ(intent);
        } else {
            C2408409cA.LIZ();
            LIZIZ(intent);
        }
    }
}
