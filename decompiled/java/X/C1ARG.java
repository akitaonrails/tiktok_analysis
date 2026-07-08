package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ARG, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ARG extends C1ARJ implements InterfaceC2179311AQv {
    public static final String LLIZ = C1ARG.class.getSimpleName();
    public final Context LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 335));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 334));
    public C1ARH LLILZIL;
    public long LLILZLL;

    @Override // X.InterfaceC2179311AQv
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC2179311AQv
    public final C2179231AQn LJIJJ(C2179231AQn c2179231AQn) {
        return c2179231AQn;
    }

    public final void LJIJJLI() {
        try {
            C1ARH c1arh = this.LLILZIL;
            if (c1arh != null) {
                ((AudioManager) this.LLILZ.getValue()).abandonAudioFocus(c1arh);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2178901APg.LIZ(LLIZ, th.getMessage());
        }
    }

    public final boolean LJIL() {
        C1ARH c1arh = this.LLILZIL;
        return c1arh != null && C786410Ut5.q4((AudioManager) this.LLILZ.getValue(), c1arh, 3, 1) == 1;
    }

    @Override // X.C1ARN
    public final void onDetach() {
        C1ARR c1arr;
        LJIJJLI();
        C1ARL c1arl = this.LL;
        if (c1arl != null && (c1arr = c1arl.LIZIZ) != null) {
            c1arr.LJIILLIIL(this);
        }
        this.LLILZIL = null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.1ARH] */
    public C1ARG(Context context) {
        this.LLILLJJLI = C786410Ut5.N3(context);
        final WeakReference weakReference = new WeakReference(this);
        this.LLILZIL = new AudioManager.OnAudioFocusChangeListener(weakReference) { // from class: X.1ARH
            public final WeakReference<C1ARG> LL;

            {
                this.LL = weakReference;
            }

            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                C1ARK c1ark;
                String str;
                C1ARG c1arg = this.LL.get();
                if (c1arg == null) {
                    return;
                }
                boolean z = true;
                if (i != -2 && i != -1) {
                    if (i == 1) {
                        C2178901APg.LIZIZ(C1ARG.LLIZ, "AUDIOFOCUS_GAIN, and resume the play");
                        C1ARL c1arl = c1arg.LL;
                        if (c1arl != null && (c1ark = c1arl.LIZJ) != null) {
                            if (c1ark.LIZJ() != C1ANF.PLAYBACK_STATE_PAUSED) {
                                z = false;
                            }
                            C0NIR c0nirLJIIL = c1ark.LJIIL();
                            if (c0nirLJIIL != null) {
                                str = c0nirLJIIL.LIZ;
                            } else {
                                str = null;
                            }
                            boolean zLJFF = Intrinsics.LJFF(str, "PAUSE_FROM_LOSS_FOCUS");
                            if (z && zLJFF) {
                                c1ark.LJIIJ(null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (System.currentTimeMillis() > c1arg.LLILZLL) {
                    ((Handler) c1arg.LLILLL.getValue()).sendEmptyMessageDelayed(1, 1000L);
                } else {
                    c1arg.LJIL();
                }
            }
        };
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LIZLLL(C0NIR c0nir) {
        if (((Handler) this.LLILLL.getValue()).hasMessages(1)) {
            ((Handler) this.LLILLL.getValue()).removeMessages(1);
            C2178901APg.LIZIZ(LLIZ, "Found pending execute pause task when stop invoked, remove this task immediate.");
        }
        this.LLILZLL = System.currentTimeMillis() + 1000;
        LJIJJLI();
        return false;
    }

    @Override // X.C1ARJ, X.InterfaceC2179191AQj
    public final void LJFF(C1AN0 c1an0) {
        LJIJJLI();
        String str = LLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("abandon focus because of onError: ");
        sbLIZ.append(c1an0);
        C2178901APg.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LJII(C0NIR c0nir) {
        if (LJIL()) {
            return false;
        }
        C2178901APg.LIZJ(LLIZ, "Request audio focus failed, we intercept this play operation.");
        return true;
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LJIIIIZZ(C0NIR c0nir) {
        String str;
        if (c0nir != null) {
            str = c0nir.LIZ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "PAUSE_FROM_LOSS_FOCUS")) {
            C2178901APg.LIZIZ(LLIZ, "Pause reason is loss focus, we needn't release audio focus for help us can retrieve focus again.");
            return false;
        }
        LJIJJLI();
        return false;
    }

    @Override // X.InterfaceC2179311AQv
    public final boolean LJIIJ(C0NIR c0nir) {
        if (LJIL()) {
            return false;
        }
        C2178901APg.LIZIZ(LLIZ, "Request audio focus failed, we intercept this resume operation.");
        return true;
    }

    @Override // X.C1ARJ, X.InterfaceC2179191AQj
    public final void LJIILLIIL(C1ANF c1anf) {
        if (c1anf == C1ANF.PLAYBACK_STATE_ERROR || c1anf == C1ANF.PLAYBACK_STATE_STOPPED) {
            LJIJJLI();
            String str = LLIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("abandon focus because of: ");
            sbLIZ.append(c1anf);
            C2178901APg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.C1ARJ, X.C1ARN
    public final void LJIJI(C1ARL c1arl) {
        this.LL = c1arl;
        C1ARR c1arr = c1arl.LIZIZ;
        if (c1arr != null) {
            c1arr.LJIIJJI(this);
        }
    }
}
