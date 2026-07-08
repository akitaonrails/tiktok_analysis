package X;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* JADX INFO: renamed from: X.1ASr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2179791ASr {
    public static Bundle LIZ(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    public static void LIZIZ(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}
