package X;

import android.view.View;
import android.view.Window;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.1A6T, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C1A6T extends C1A6X {
    public final Window LIZ;
    public final C1A6Q LIZIZ;

    @Override // X.C1A6X
    public final void LJ() {
        LJII(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        LJI(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
    }

    @Override // X.C1A6X
    public final void LIZ(int i) {
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 8) {
                            this.LIZIZ.LIZ.LIZ();
                        }
                    } else {
                        LJI(2);
                    }
                } else {
                    LJI(4);
                }
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }

    @Override // X.C1A6X
    public final void LJFF(int i) {
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 8) {
                            this.LIZIZ.LIZ();
                        }
                    } else {
                        LJII(2);
                    }
                } else {
                    LJII(4);
                    this.LIZ.clearFlags(1024);
                }
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }

    public final void LJI(int i) {
        View decorView = this.LIZ.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void LJII(int i) {
        View decorView = this.LIZ.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    public C1A6T(Window window, C1A6Q c1a6q) {
        this.LIZ = window;
        this.LIZIZ = c1a6q;
    }
}
