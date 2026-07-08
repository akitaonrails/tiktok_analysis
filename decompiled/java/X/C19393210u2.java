package X;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.10u2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19393210u2 implements AudioManager.OnAudioFocusChangeListener {
    public static final C19393210u2 LL;
    public static final C01GW LLILLJJLI;
    public static final Object LLILLL;
    public static boolean LLILZ;
    public static boolean LLILZIL;
    public static boolean LLILZLL;
    public static AudioFocusRequest LLIZ;
    public static AudioManager.OnAudioFocusChangeListener LLIZLLLIL;
    public static final String LLJ;

    static {
        C19393210u2 c19393210u2 = new C19393210u2();
        LL = c19393210u2;
        LLILLJJLI = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(239));
        LLILLL = new Object();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19393210u2.getClass().getSimpleName());
        sbLIZ.append(c19393210u2.hashCode());
        LLJ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ() {
        int iAbandonAudioFocus;
        if (Build.VERSION.SDK_INT >= 26) {
            AudioManager audioManager = (AudioManager) LLILLJJLI.getValue();
            AudioFocusRequest audioFocusRequest = LLIZ;
            if (audioFocusRequest == null) {
                audioFocusRequest = null;
            }
            iAbandonAudioFocus = audioManager.abandonAudioFocusRequest(audioFocusRequest);
        } else {
            iAbandonAudioFocus = ((AudioManager) LLILLJJLI.getValue()).abandonAudioFocus(LLIZLLLIL);
        }
        synchronized (LLILLL) {
            if (iAbandonAudioFocus == 1) {
                try {
                    LLILZ = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C582130MsN.LIZ().LJ();
        C1476910oXJ.LJ(true, LLJ);
    }

    public static void LIZIZ() {
        C19393210u2 c19393210u2 = LL;
        C582130MsN.LIZ().LJ();
        C1476910oXJ.LJ(false, LLJ);
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = LLIZLLLIL;
        if (LLILZ) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            LIZJ();
            return;
        }
        int iQ4 = C786410Ut5.q4((AudioManager) LLILLJJLI.getValue(), c19393210u2, 3, 1);
        synchronized (LLILLL) {
            try {
                if (iQ4 == 0) {
                    LLILZ = false;
                } else if (iQ4 == 1) {
                    LLILZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZJ() {
        AudioManager audioManager = (AudioManager) LLILLJJLI.getValue();
        AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(1);
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        builder2.setUsage(1);
        builder2.setContentType(2);
        builder.setAudioAttributes(builder2.build());
        builder.setAcceptsDelayedFocusGain(true);
        builder.setOnAudioFocusChangeListener(LL);
        AudioFocusRequest audioFocusRequestBuild = builder.build();
        Object obj = LLILLL;
        synchronized (obj) {
            try {
                LLIZ = audioFocusRequestBuild;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        int iP4 = C786410Ut5.p4(audioManager, audioFocusRequestBuild);
        synchronized (obj) {
            try {
                if (iP4 == 0) {
                    LLILZ = false;
                } else if (iP4 == 1) {
                    LLILZ = true;
                } else if (iP4 != 2) {
                    LLILZ = false;
                } else {
                    LLILZ = false;
                    LLILZIL = true;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = LLIZLLLIL;
        if (onAudioFocusChangeListener != null) {
            onAudioFocusChangeListener.onAudioFocusChange(i);
        }
        if (i != -2) {
            if (i != -1) {
                if (i == 1) {
                    synchronized (LLILLL) {
                        try {
                            LLILZIL = false;
                            LLILZLL = false;
                            LLILZ = true;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    return;
                }
                return;
            }
            synchronized (LLILLL) {
                try {
                    LLILZLL = false;
                    LLILZIL = false;
                    LLILZ = false;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            return;
        }
        synchronized (LLILLL) {
            try {
                LLILZLL = true;
                LLILZIL = false;
                LLILZ = false;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
    }
}
