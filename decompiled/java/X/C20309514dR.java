package X;

import Y.ARunnableS99S0000000_24;
import android.os.Looper;
import com.bytedance.android.livesdk.internal.Live;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: renamed from: X.14dR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20309514dR extends C20309414dQ {
    public static C20309514dR LJ;
    public boolean LIZLLL;

    @Override // X.C20309414dQ, com.ss.android.ugc.aweme.live.ILiveOuterService
    public final ILiveOuterService q4() {
        return this;
    }

    @Override // X.C20309414dQ
    public final void LJII(boolean z) {
        if (!this.LIZLLL) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS99S0000000_24(2));
            if (Live.getLiteService() != null) {
                this.LIZLLL = true;
            }
        }
    }
}
