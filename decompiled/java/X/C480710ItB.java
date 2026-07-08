package X;

import android.media.AudioManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.0ItB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480710ItB {
    public static final AudioManager LIZ = (AudioManager) C786410Ut5.H2(C01AB.LIZ(), "audio");
    public static final C480720ItC LIZIZ = new AudioManager.OnAudioFocusChangeListener() { // from class: X.0ItC
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i) {
            Iterator it2 = new HashSet(C480710ItB.LIZJ).iterator();
            while (it2.hasNext()) {
                ((AudioManager.OnAudioFocusChangeListener) it2.next()).onAudioFocusChange(i);
            }
        }
    };
    public static final Set<AudioManager.OnAudioFocusChangeListener> LIZJ = new HashSet();
}
