package Y;

import X.C1268550j7F;
import X.C1274830jHN;
import X.C1315680kLG;
import X.C1C7U;
import X.C2188811AlT;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS2S0120000_20 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (this.z1) {
            if (this.z2) {
                ((C1274830jHN) this.l0).LJIJI++;
                return;
            } else {
                ((C1274830jHN) this.l0).LJIJJLI++;
                return;
            }
        }
        if (this.z2) {
            ((C1274830jHN) this.l0).LJIJJ++;
        } else {
            ((C1274830jHN) this.l0).LJIL++;
        }
    }

    public final void LIZ$1() {
        if (!this.z1) {
            if (this.z2) {
            }
            ((C1268550j7F) this.l0).mADM.startRecording();
            AVLog.iod(C1268550j7F.LLJJIJIIJIL, "start recording.");
            ((C1268550j7F) this.l0).LLJJI = true;
        }
        ((C1268550j7F) this.l0).mADM.setMicMute(true);
        if (this.z2) {
            C1268550j7F c1268550j7F = (C1268550j7F) this.l0;
            c1268550j7F.mADM.disableLocalAudioStream(c1268550j7F.LLILLJJLI == 4);
            ((C1268550j7F) this.l0).mADM.pause();
        }
        String str = C1268550j7F.LLJJIJIIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startOnBackgroundOrMute: paused ");
        sbLIZ.append(this.z2);
        sbLIZ.append(", muted ");
        sbLIZ.append(this.z1);
        AVLog.iod(str, C2188811AlT.LIZIZ(sbLIZ));
        ((C1268550j7F) this.l0).mADM.startRecording();
        AVLog.iod(C1268550j7F.LLJJIJIIJIL, "start recording.");
        ((C1268550j7F) this.l0).LLJJI = true;
    }

    public static final void run$0(ARunnableS2S0120000_20 aRunnableS2S0120000_20) {
        C1315680kLG c1315680kLG = (C1315680kLG) aRunnableS2S0120000_20.l0;
        boolean z = aRunnableS2S0120000_20.z1;
        boolean z2 = aRunnableS2S0120000_20.z2;
        c1315680kLG.getClass();
        C1C7U.LIZ("LynxImageManager@1fa4.updateRedirectCheckResult$1L$1L");
        if (z) {
            c1315680kLG.LL |= 2;
        }
        if (z2) {
            c1315680kLG.LL |= 4;
        }
        c1315680kLG.LJIIJJI();
        C1C7U.LIZIZ("LynxImageManager@1fa4.updateRedirectCheckResult$1L$1L");
    }

    public static final void run$1(ARunnableS2S0120000_20 aRunnableS2S0120000_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractLogService@7e74.addVideoFramesReport$1");
        try {
            aRunnableS2S0120000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractLogService@7e74.addVideoFramesReport$1");
    }

    public static final void run$2(ARunnableS2S0120000_20 aRunnableS2S0120000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStreamAudioCaptureFromADM@ad4b.startOnBackgroundOrMute$1");
        try {
            aRunnableS2S0120000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStreamAudioCaptureFromADM@ad4b.startOnBackgroundOrMute$1");
    }

    public static final void run$3(ARunnableS2S0120000_20 aRunnableS2S0120000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStreamVideoCapture@20b1.enableMirror$1");
        try {
            if (aRunnableS2S0120000_20.z1) {
                ((LiveStreamVideoCapture) aRunnableS2S0120000_20.l0).LLJLLIL = aRunnableS2S0120000_20.z2;
            } else {
                ((LiveStreamVideoCapture) aRunnableS2S0120000_20.l0).LLJLLL = aRunnableS2S0120000_20.z2;
            }
            ((LiveStreamVideoCapture) aRunnableS2S0120000_20.l0).LLJJIJIL();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStreamVideoCapture@20b1.enableMirror$1");
    }

    public ARunnableS2S0120000_20(C1274830jHN c1274830jHN, boolean z, int i) {
        this.$t = i;
        this.l0 = c1274830jHN;
        this.z1 = false;
        this.z2 = z;
    }

    public ARunnableS2S0120000_20(Object obj, boolean z, boolean z2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
        this.z2 = z2;
    }
}
