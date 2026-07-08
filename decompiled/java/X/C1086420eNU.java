package X;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.LiveBottomLikeAnimationMergeSetting;

/* JADX INFO: renamed from: X.0eNU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086420eNU {
    public InterfaceC1086410eNT LIZIZ;
    public InterfaceC1086410eNT LIZJ;
    public long LIZLLL;
    public final int LIZ = LiveBottomLikeAnimationMergeSetting.INSTANCE.getValue();
    public final long LJ = 300;

    public final boolean LIZ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.LIZLLL;
        if (j != 0 && jElapsedRealtime - j <= this.LJ) {
            return false;
        }
        this.LIZLLL = jElapsedRealtime;
        return true;
    }

    public final void LIZIZ(boolean z, Bitmap bitmap, int i, int i2) {
        InterfaceC1086410eNT interfaceC1086410eNT;
        InterfaceC1086410eNT interfaceC1086410eNT2;
        int i3 = this.LIZ;
        if (i3 == LiveBottomLikeAnimationMergeSetting.INSTANCE.getDEFAULT()) {
            if (z) {
                InterfaceC1086410eNT interfaceC1086410eNT3 = this.LIZIZ;
                if (interfaceC1086410eNT3 != null) {
                    interfaceC1086410eNT3.LLLZZ(i, i2, bitmap);
                    return;
                }
                return;
            }
            InterfaceC1086410eNT interfaceC1086410eNT4 = this.LIZJ;
            if (interfaceC1086410eNT4 == null) {
                return;
            }
            interfaceC1086410eNT4.LLLZZ(i, i2, bitmap);
            return;
        }
        if (i3 == 1) {
            InterfaceC1086410eNT interfaceC1086410eNT5 = this.LIZJ;
            if (interfaceC1086410eNT5 != null) {
                if (!LIZ()) {
                    return;
                }
                interfaceC1086410eNT5.LLLZZ(i, i2, bitmap);
                return;
            } else {
                if (!z || !LIZ() || (interfaceC1086410eNT2 = this.LIZIZ) == null) {
                    return;
                }
                interfaceC1086410eNT2.LLLZZ(i, i2, bitmap);
                return;
            }
        }
        if (i3 != 2) {
            return;
        }
        InterfaceC1086410eNT interfaceC1086410eNT6 = this.LIZJ;
        if (interfaceC1086410eNT6 != null) {
            interfaceC1086410eNT6.LLLZZ(i, i2, bitmap);
        } else {
            if (!z || (interfaceC1086410eNT = this.LIZIZ) == null) {
                return;
            }
            interfaceC1086410eNT.LLLZZ(i, i2, bitmap);
        }
    }
}
