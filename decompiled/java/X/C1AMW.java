package X;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* JADX INFO: renamed from: X.1AMW, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AMW {
    public final AudioManager LIZ;
    public AudioFocusRequest LIZIZ;

    public C1AMW(Context context) {
        Object objH2 = C786410Ut5.H2(context, "audio");
        if (objH2 != null) {
            this.LIZ = (AudioManager) objH2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
    }
}
