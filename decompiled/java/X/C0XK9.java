package X;

import Y.ARunnableS2S1101000_13;
import android.app.Activity;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0XK9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XK9 extends C0XK0 {
    public final AtomicBoolean LIZJ;

    public C0XK9(C846830XJx c846830XJx) {
        super(c846830XJx);
        this.LIZJ = new AtomicBoolean(false);
    }

    @Override // X.C0XK0
    public final C0XK1 LIZ(C0XK5 c0xk5, Request request, C0X52<?> c0x52) {
        String url;
        C0XK8 c0xk8 = c0xk5.LIZ;
        if (c0xk8 != null && ((c0xk8.LIZ == 3070 || c0xk8.LIZ == 3071 || c0xk8.LIZ == 3072) && this.LIZJ.compareAndSet(false, true))) {
            int i = c0xk5.LIZ.LIZ;
            if (request != null) {
                url = request.getUrl();
            } else {
                url = null;
            }
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS2S1101000_13(i, url, this, 2));
            return new C0XK1(true, false);
        }
        return C0XK0.LIZIZ;
    }

    public final void LIZJ(int i, Activity activity, final String str) {
        switch (i) {
            case 3070:
            case 3072:
                ((ISecApi) ServiceManager.get().getService(ISecApi.class)).popCaptcha(activity, i, new C149A(this) { // from class: X.0XKA
                    public final /* synthetic */ C0XK9 LIZIZ;

                    @Override // X.C149A
                    public final void LIZ() {
                        this.LIZIZ.LIZJ.set(false);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // X.C149A
                    public final void LIZIZ(int i2, boolean z) {
                        if (z) {
                            C1440005kM.LIZ(new C0XKC(str));
                        }
                        this.LIZIZ.LIZJ.set(false);
                    }
                });
                break;
            case 3071:
                C21566919al c21566919al = new C21566919al(activity);
                if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    c21566919al.LJFF(2131836793);
                    c21566919al.LIZ(2131836792);
                    c21566919al.LJIIJ(2131830645, new DialogInterfaceOnClickListenerC854600Xfm(this, 4), false);
                } else {
                    c21566919al.LIZ(2131829382);
                    c21566919al.LJII(2131828217, new DialogInterfaceOnClickListenerC854600Xfm(this, 5), false);
                    c21566919al.LJIIJ(2131829300, new DialogInterfaceOnClickListenerC854610Xfn(activity, str, this, 1), false);
                }
                c21566919al.LJII = false;
                new C21566519ah(c21566919al).LIZLLL();
                break;
        }
    }
}
