package X;

import android.media.AudioManager;

/* JADX INFO: renamed from: X.0lHU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351780lHU implements AudioManager.OnAudioFocusChangeListener {
    public static final C1351780lHU LL = new C1351780lHU();

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (i != 1) {
            C1348320lBu.LIZ.LIZIZ("audio_focus_changed");
        } else {
            C1351800lHW.LIZ().LIZJ();
        }
    }
}
