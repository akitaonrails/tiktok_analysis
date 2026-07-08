package X;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: X.0f0U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110600f0U implements InterfaceC1110610f0V {
    public final /* synthetic */ C1110580f0S LIZ;
    public final /* synthetic */ InterfaceC1110610f0V LIZIZ;

    @Override // X.InterfaceC1110610f0V
    public final void invalidate() {
        C1110580f0S c1110580f0S = this.LIZ;
        C1110620f0W c1110620f0W = c1110580f0S.LJJLIIIJLJLI;
        c1110580f0S.LIZIZ = c1110620f0W != null ? c1110620f0W.LIZIZ : -1;
        if (c1110620f0W != null) {
            c1110620f0W.LJJL = 0;
            ((ValueAnimator) c1110620f0W.LJJLIIIJJI.getValue()).start();
        }
        InterfaceC1110610f0V interfaceC1110610f0V = this.LIZIZ;
        if (interfaceC1110610f0V != null) {
            interfaceC1110610f0V.invalidate();
        }
    }

    public C1110600f0U(C1110580f0S c1110580f0S, InterfaceC1110610f0V interfaceC1110610f0V) {
        this.LIZ = c1110580f0S;
        this.LIZIZ = interfaceC1110610f0V;
    }
}
