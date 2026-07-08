package X;

import com.ss.lyrax.video.TTLHVideoFrameAdjustmentConfig;

/* JADX INFO: renamed from: X.0j7W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268720j7W implements InterfaceC1272840jEA {
    public static final /* synthetic */ int LLILLL = 0;
    public final C1271260jBc LL;
    public InterfaceC1267650j5n LLILLJJLI;

    @Override // X.InterfaceC1272840jEA
    public final void onRelease() {
        InterfaceC1267650j5n interfaceC1267650j5n = this.LLILLJJLI;
        if (interfaceC1267650j5n != null) {
            this.LL.LJIIJ.remove(interfaceC1267650j5n);
            this.LLILLJJLI = null;
        }
        C1271260jBc c1271260jBc = this.LL;
        TTLHVideoFrameAdjustmentConfig tTLHVideoFrameAdjustmentConfig = c1271260jBc.LJJ;
        if (tTLHVideoFrameAdjustmentConfig != null) {
            tTLHVideoFrameAdjustmentConfig.enable = false;
        }
        c1271260jBc.LJI(false);
        c1271260jBc.LJIILL = false;
        c1271260jBc.LIZLLL = false;
    }

    public C1268720j7W(C1271260jBc c1271260jBc) {
        this.LL = c1271260jBc;
    }
}
