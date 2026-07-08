package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC787340Uua {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C787320UuY LIZ;
    public final LocalBroadcastManager LIZIZ;
    public boolean LIZJ;

    public abstract void LIZ();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0UuY, android.content.BroadcastReceiver] */
    public AbstractC787340Uua() {
        C0W7K.LJFF();
        ?? r3 = new BroadcastReceiver() { // from class: X.0UuY
            public final void LIZ(Intent intent) {
                if (Intrinsics.LJFF("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction())) {
                    intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN");
                    intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN");
                    this.LIZ.LIZ();
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
        };
        this.LIZ = r3;
        LocalBroadcastManager localBroadcastManagerLIZ = LocalBroadcastManager.LIZ(FacebookSdk.LIZJ());
        this.LIZIZ = localBroadcastManagerLIZ;
        if (this.LIZJ) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        localBroadcastManagerLIZ.LIZIZ(r3, intentFilter);
        this.LIZJ = true;
    }
}
