package X;

import android.media.AudioManager;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0lJ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352720lJ0 implements AudioManager.OnAudioFocusChangeListener {
    public static final C1352720lJ0 LL = new C1352720lJ0();

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (i == -3 || i == -2 || i != -1) {
        }
        Iterator<AudioManager.OnAudioFocusChangeListener> it2 = C19393310u3.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onAudioFocusChange(i);
        }
    }
}
