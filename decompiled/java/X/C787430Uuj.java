package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0Uuj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C787430Uuj extends BroadcastReceiver {
    public final WeakReference<AudioManager> LIZ;

    public C787430Uuj(AudioManager audioManager) {
        this.LIZ = new WeakReference<>(audioManager);
    }

    public final void LIZ(Intent intent) {
        int streamVolume;
        try {
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && this.LIZ.get() != null && (streamVolume = this.LIZ.get().getStreamVolume(3)) >= 0) {
                C0V12.LIZIZ = streamVolume;
                C0V12.LIZLLL++;
                C0V12.LIZ(streamVolume);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0V12.LIZIZ = -1;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C2408409cA.LIZ();
            LIZ(intent);
        }
    }
}
