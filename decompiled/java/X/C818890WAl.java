package X;

import X.C830490Whz;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0WAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C818890WAl extends BroadcastReceiver {
    public static final AtomicReference<C818890WAl> LIZIZ = new AtomicReference<>();
    public final Context LIZ;

    public final void LIZ() {
        synchronized (C818880WAk.LJIIIZ) {
            try {
                Iterator it2 = ((C830490Whz.e) C818880WAk.LJIIJJI.values()).iterator();
                while (it2.hasNext()) {
                    ((C818880WAk) it2.next()).LIZLLL();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C786410Ut5.LJJIFFI(this.LIZ, this);
    }

    public C818890WAl(Context context) {
        this.LIZ = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ();
        } else {
            C2408409cA.LIZ();
            LIZ();
        }
    }
}
