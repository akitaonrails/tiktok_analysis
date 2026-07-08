package X;

import Y.ARunnableS110S0100000_10;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0Peu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650220Peu implements InterfaceC469360Ias {
    public final /* synthetic */ C650210Pet LL;

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C650220Peu(C650210Pet c650210Pet) {
        this.LL = c650210Pet;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            C650230Pev.LIZ = false;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        HandlerHook.viewPost(this.LL, new ARunnableS110S0100000_10(this, 230));
    }
}
