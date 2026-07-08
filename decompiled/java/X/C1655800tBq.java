package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0tBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1655800tBq implements InterfaceC2183551Acz {
    public final /* synthetic */ C1655760tBm LIZ;
    public final /* synthetic */ InterfaceC1656000tCA LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ int LJ;

    public /* synthetic */ C1655800tBq(C1655760tBm c1655760tBm, InterfaceC1656000tCA interfaceC1656000tCA, String str, String str2, int i) {
        this.LIZ = c1655760tBm;
        this.LIZIZ = interfaceC1656000tCA;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = i;
    }

    @Override // X.InterfaceC2183551Acz
    public final void onDone(int i) {
        final C1655760tBm c1655760tBm = this.LIZ;
        final InterfaceC1656000tCA interfaceC1656000tCA = this.LIZIZ;
        final String str = this.LIZJ;
        final String str2 = this.LIZLLL;
        final int i2 = this.LJ;
        c1655760tBm.getClass();
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0tBv
            @Override // java.lang.Runnable
            public final void run() {
                C1655760tBm c1655760tBm2 = c1655760tBm;
                InterfaceC1656000tCA interfaceC1656000tCA2 = interfaceC1656000tCA;
                String str3 = str;
                String str4 = str2;
                int i3 = i2;
                c1655760tBm2.getClass();
                C1C7U.LIZ("CameraVideoRecorder$VideoConcatenationTask@cbff.lambda$releaseGPUResource$4$1L");
                interfaceC1656000tCA2.LIZ(i3, str3, str4, c1655760tBm2.LIZJ);
                C1C7U.LIZIZ("CameraVideoRecorder$VideoConcatenationTask@cbff.lambda$releaseGPUResource$4$1L");
            }
        });
    }
}
