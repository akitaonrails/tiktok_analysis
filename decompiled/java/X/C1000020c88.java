package X;

import Y.ARunnableS116S0100000_16;
import android.os.Looper;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0c88, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000020c88 implements InterfaceC987630bo9 {
    public final ViewStub LIZ;
    public Aweme LIZIZ;
    public int LIZJ;
    public FrameLayout LIZLLL;
    public C1000030c89 LJ;
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());

    public final boolean LIZLLL() {
        Aweme aweme = this.LIZIZ;
        return aweme != null && AwemeExtKt.isAdTraffic(aweme) && C1017070cZd.LLILZIL(this.LIZIZ);
    }

    @Override // X.InterfaceC987630bo9
    public final void LIZ() {
        if (LIZLLL()) {
            C1000030c89 c1000030c89 = this.LJ;
            if (c1000030c89 != null) {
                C622680Oba.LIZLLL(c1000030c89);
                c1000030c89.LIZIZ();
            }
            Aweme aweme = this.LIZIZ;
            if (aweme != null) {
                AwemeBizExtKt.setAdDescMaxLines(aweme, 4);
            }
        }
    }

    @Override // X.InterfaceC987630bo9
    public final void LIZIZ() {
        if (LIZLLL()) {
            Aweme aweme = this.LIZIZ;
            if (aweme != null) {
                AwemeBizExtKt.setAdDescMaxLines(aweme, 2);
            }
            ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(this, 101);
            int i = this.LIZJ;
            C786410Ut5.LJLIIL(i > 0 ? ((long) i) * 1000 : 0L, this.LJFF, aRunnableS116S0100000_16);
        }
    }

    @Override // X.InterfaceC987630bo9
    public final void LIZJ() {
        if (LIZLLL()) {
            this.LJFF.removeCallbacksAndMessages(null);
            FrameLayout frameLayout = this.LIZLLL;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
        }
    }

    public C1000020c88(ViewStub viewStub) {
        this.LIZ = viewStub;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // X.InterfaceC987630bo9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1000020c88.LJI(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
