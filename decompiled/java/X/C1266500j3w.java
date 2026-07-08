package X;

import Y.ARunnableS6S0100001_20;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;

/* JADX INFO: renamed from: X.0j3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266500j3w implements InterfaceC1283880jVy {
    public final /* synthetic */ C1266350j3h LIZ;

    @Override // X.InterfaceC1283880jVy
    public final int[] LJLJLLL() {
        return new int[]{this.LIZ.LLILZLL.LJJIL(0), this.LIZ.LLILZLL.LJJIJIIJIL(0)};
    }

    @Override // X.InterfaceC1283880jVy
    public final int LJLJJLL() {
        LiveStreamVideoCapture liveStreamVideoCapture = this.LIZ.LLJJIJIL;
        if (liveStreamVideoCapture == null) {
            return -1;
        }
        int i = liveStreamVideoCapture.LLJIJIL;
        if (i == 1) {
            return 0;
        }
        return i == 2 ? 1 : -1;
    }

    @Override // X.InterfaceC1283880jVy
    public final int LJLJL() {
        InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI = this.LIZ.LJIJJLI();
        if (interfaceC1268690j7TLJIJJLI != null) {
            return (int) interfaceC1268690j7TLJIJJLI.LLILZ();
        }
        return -1;
    }

    public C1266500j3w(C1266350j3h c1266350j3h) {
        this.LIZ = c1266350j3h;
    }

    @Override // X.InterfaceC1283880jVy
    public final void LJLJLJ(int i) {
        this.LIZ.LLLZIIL(i, -1, true, false);
    }

    @Override // X.InterfaceC1283880jVy
    public final void LJLL(float f) {
        C786410Ut5.LJJZZIII(this.LIZ.LL, new ARunnableS6S0100001_20(f, this, 3));
    }
}
