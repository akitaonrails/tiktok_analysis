package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.10u3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19393310u3 {
    public static final CopyOnWriteArraySet<AudioManager.OnAudioFocusChangeListener> LIZ = new CopyOnWriteArraySet<>();
    public static final C1352720lJ0 LIZIZ = C1352720lJ0.LL;
    public static AudioManager LIZJ;
    public static AudioFocusRequest LIZLLL;
    public static boolean LJ;

    public static void LIZ(Context context, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        Object objH2;
        if (!LJ) {
            LJ = true;
            Context context2 = (Context) new WeakReference(C786410Ut5.N3(context)).get();
            AudioManager audioManager = null;
            if (context2 != null) {
                objH2 = C786410Ut5.H2(context2, "audio");
            } else {
                objH2 = null;
            }
            if (objH2 instanceof AudioManager) {
                audioManager = (AudioManager) objH2;
            }
            LIZJ = audioManager;
            if (Build.VERSION.SDK_INT >= 26) {
                LIZLLL = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(LIZIZ).build();
            }
        }
        if (onAudioFocusChangeListener != null) {
            LIZ.add(onAudioFocusChangeListener);
        }
        AudioManager audioManager2 = LIZJ;
        if (audioManager2 == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequest = LIZLLL;
            if (audioFocusRequest != null) {
                C786410Ut5.p4(audioManager2, audioFocusRequest);
                return;
            }
            return;
        }
        C786410Ut5.q4(audioManager2, LIZIZ, 3, 1);
    }
}
