package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09dz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2419709dz extends BroadcastReceiver {
    public final Function0<Unit> LIZ;

    public C2419709dz(Function0<Unit> function0) {
        this.LIZ = function0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (Intrinsics.LJFF(intent.getAction(), "android.media.AUDIO_BECOMING_NOISY")) {
                this.LIZ.invoke();
            }
        } else {
            C2408409cA.LIZ();
            if (!Intrinsics.LJFF(intent.getAction(), "android.media.AUDIO_BECOMING_NOISY")) {
                return;
            }
            this.LIZ.invoke();
        }
    }
}
