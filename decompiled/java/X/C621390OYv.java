package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.0OYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621390OYv {
    public final Function0<Unit> LIZ;
    public final AudioManager LIZIZ;
    public final C604990No9 LIZJ;
    public AudioFocusRequest LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        Object c098200Yq;
        int iIntValue;
        Object c098200Yq2;
        AudioManager audioManager = this.LIZIZ;
        if (audioManager == null || this.LJ) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).setOnAudioFocusChangeListener(this.LIZJ).setWillPauseWhenDucked(true).build();
            this.LIZLLL = audioFocusRequestBuild;
            try {
                c098200Yq2 = Integer.valueOf(C786410Ut5.p4(audioManager, audioFocusRequestBuild));
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = 0;
            }
            iIntValue = ((Number) c098200Yq2).intValue();
        } else {
            try {
                c098200Yq = Integer.valueOf(C786410Ut5.q4(audioManager, this.LIZJ, 3, 1));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = 0;
            }
            iIntValue = ((Number) c098200Yq).intValue();
        }
        this.LJ = iIntValue == 1;
        C0OPX.LJII("AudioFocusHelper: request granted=" + this.LJ + " (result=" + iIntValue + ')');
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0No9] */
    public C621390OYv(AwS547S0100000_3 awS547S0100000_3) {
        Object c098200Yq;
        Object objH2;
        this.LIZ = awS547S0100000_3;
        try {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (contextLIZ != null) {
                objH2 = C786410Ut5.H2(contextLIZ, "audio");
            } else {
                objH2 = null;
            }
            if (objH2 instanceof AudioManager) {
                c098200Yq = (AudioManager) objH2;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LIZIZ = (AudioManager) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        this.LIZJ = new AudioManager.OnAudioFocusChangeListener() { // from class: X.0No9
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                Object c098200Yq2;
                if (i != -3 && i != -2 && i != -1) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AudioFocusHelper: lost (change=");
                sbLIZ.append(i);
                sbLIZ.append(") → pause");
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                try {
                    this.LL.LIZ.invoke();
                    c098200Yq2 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                if (thM5exceptionOrNullimpl == null) {
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AudioFocusHelper onLoss error: ");
                sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        };
    }
}
