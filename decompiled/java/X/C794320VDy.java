package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0VDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794320VDy {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final LruCache<String, Integer> LIZIZ = new LruCache<>(128);
    public static final LruCache<String, String> LIZJ = new LruCache<>(128);
    public static final C790410UzX LIZLLL = new BroadcastReceiver() { // from class: X.0UzX
        public final void LIZ(Intent intent) {
            String action;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("receive broadcast >> ");
            if (intent != null) {
                action = intent.getAction();
            } else {
                action = null;
            }
            sbLIZ.append(action);
            sbLIZ.append("  isInitialStickyBroadcast:");
            sbLIZ.append(isInitialStickyBroadcast());
            C2188811AlT.LIZIZ(sbLIZ);
            if (isInitialStickyBroadcast() && C837910Wtx.LIZLLL) {
                return;
            }
            C794320VDy.LIZIZ.evictAll();
            C794320VDy.LIZJ.evictAll();
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
    };
    public static C790420UzY LJ;
}
