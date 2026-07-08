package X;

import Y.ARunnableS109S0100000_9;
import Y.ARunnableS27S0101000_16;
import Y.ARunnableS85S0200000_16;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0dKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1046310dKn extends BroadcastReceiver {
    public static int LIZIZ = -1;
    public final C583560Mug LIZ;

    public C1046310dKn(C583560Mug c583560Mug) {
        int i;
        this.LIZ = c583560Mug;
        if (C073T.LIZ()) {
            C823050WQl.LJFF().submit(new ARunnableS109S0100000_9(c583560Mug, 219));
        } else {
            LIZIZ = (!C073T.LIZ() || (i = LIZIZ) == -1) ? c583560Mug.LIZ() : i;
        }
    }

    public final void LIZ(Intent intent) {
        C583560Mug c583560Mug;
        try {
            if ((("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) || "android.media.STREAM_MUTE_CHANGED_ACTION".equals(intent.getAction())) && (c583560Mug = this.LIZ) != null) {
                ARunnableS27S0101000_16 aRunnableS27S0101000_16 = new ARunnableS27S0101000_16(LIZIZ, c583560Mug.LIZLLL, 23);
                if (C073T.LIZ()) {
                    C823050WQl.LJFF().submit(new ARunnableS85S0200000_16(c583560Mug, aRunnableS27S0101000_16, 63));
                } else {
                    LIZIZ = c583560Mug.LIZ();
                    aRunnableS27S0101000_16.run();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
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
            LIZ(intent);
        } else {
            C2408409cA.LIZ();
            LIZ(intent);
        }
    }
}
