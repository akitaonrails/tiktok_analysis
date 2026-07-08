package X;

import Y.ARunnableS116S0100000_16;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0c57, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998150c57 implements InterfaceC998200c5C<InterfaceC998250c5H> {
    public final InterfaceC998250c5H LL;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC998200c5C
    public final void l1() {
    }

    @Override // X.InterfaceC998200c5C
    public final void rk() {
    }

    @Override // X.InterfaceC998200c5C
    public final void LJLJL() {
        this.LL.LIZ().LLFZ("COMMERCE_LYNX_BUTTON_TASK");
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC998220c5E Mh() {
        return this.LL;
    }

    public C998150c57(C998180c5A c998180c5A) {
        this.LL = c998180c5A;
    }

    @Override // X.InterfaceC998200c5C
    public final void wv2(long j) {
        ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(this, 204);
        IVideoPlayTaskManager iVideoPlayTaskManagerLIZ = this.LL.LIZ();
        C988300bpE c988300bpE = new C988300bpE("COMMERCE_LYNX_BUTTON_TASK");
        c988300bpE.LIZIZ(j);
        c988300bpE.LIZJ = this.LL.LJ() * LSPassThroughRecordSizeConfig.DEFAULT;
        c988300bpE.LIZLLL = aRunnableS116S0100000_16;
        c988300bpE.LJ = false;
        iVideoPlayTaskManagerLIZ.LLIFFJFJJ(c988300bpE.LIZ());
    }
}
