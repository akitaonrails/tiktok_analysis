package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.bytedance.android.livesdk.broadcast.record.service.LiveBroadcastRecordLiveService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS169S1100000_20;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0Van, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800550Van {
    public final Context LIZ;
    public final Function0<Unit> LIZIZ;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 173));

    public final void LIZ() {
        if (this.LIZJ.get()) {
            C20441214yg.LIZIZ("LiveRecord", "RecordServiceController, stopRecord");
            Context context = this.LIZ;
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context, (Class<?>) LiveBroadcastRecordLiveService.class));
            this.LIZ.unbindService((ServiceConnection) this.LIZLLL.getValue());
            this.LIZ.stopService(intent);
            this.LIZJ.set(false);
        }
    }

    public C800550Van(Context context, AwS169S1100000_20 awS169S1100000_20) {
        this.LIZ = context;
        this.LIZIZ = awS169S1100000_20;
    }
}
