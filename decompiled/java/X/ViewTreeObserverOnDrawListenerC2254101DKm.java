package X;

import Y.ARunnableS135S0100000_35;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.1DKm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class ViewTreeObserverOnDrawListenerC2254101DKm implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ C2254071DKj LL;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        C2254071DKj c2254071DKj = this.LL;
        if (c2254071DKj.LLLLIL <= 0) {
            c2254071DKj.LLLLIL = System.currentTimeMillis();
        }
        C2254071DKj c2254071DKj2 = this.LL;
        c2254071DKj2.LLJILJIL.LJIIIZ(Long.valueOf(c2254071DKj2.LLLLIL));
        C2254071DKj c2254071DKj3 = this.LL;
        c2254071DKj3.LLJILJILJ.LJFF(Long.valueOf(c2254071DKj3.LLLLIL));
        InterfaceC2254081DKk interfaceC2254081DKk = this.LL.LLLIIL;
        if (interfaceC2254081DKk != null) {
            HandlerHook.viewPost(interfaceC2254081DKk.getViewFunction().getView(), new ARunnableS135S0100000_35(this, 13));
        }
    }

    public ViewTreeObserverOnDrawListenerC2254101DKm(C2254071DKj c2254071DKj) {
        this.LL = c2254071DKj;
    }
}
