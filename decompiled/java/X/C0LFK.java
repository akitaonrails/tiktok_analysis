package X;

import Y.AObjectS241S0100000_8;
import android.content.ComponentCallbacks2;
import android.widget.FrameLayout;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceRecorderService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0LFK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LFK extends AbstractC2255721DQs<C0LFM> implements InterfaceC379610EuV, C0LFM {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public static final int LLILZ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0LFK.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = 8;
    }

    public C0LFM W1() {
        return this;
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILLJJLI.getValue(this, LLILLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        InterfaceC535600KzW interfaceC535600KzWLIZ;
        FrameLayout frameLayoutLJLLLL;
        IEcommerceRecorderService iEcommerceRecorderService;
        super.onStart();
        Scene scene = (Scene) getDiContainer().LJIIL(null, AbstractC214814194y.class);
        if (scene != null) {
            interfaceC535600KzWLIZ = C535500KzM.LIZ(scene);
        } else {
            ComponentCallbacks2 componentCallbacks2LJII = C1664590tQ1.LJII(this);
            if (!(componentCallbacks2LJII instanceof InterfaceC535600KzW)) {
                return;
            } else {
                interfaceC535600KzWLIZ = (InterfaceC535600KzW) componentCallbacks2LJII;
            }
        }
        if (interfaceC535600KzWLIZ == null || (frameLayoutLJLLLL = interfaceC535600KzWLIZ.LJLLLL()) == null || (iEcommerceRecorderService = (IEcommerceRecorderService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IEcommerceRecorderService.class))) == null) {
            return;
        }
        C0LFL c0lflLIZ = iEcommerceRecorderService.LIZ(this, frameLayoutLJLLLL, scene != null ? scene.mArguments : null);
        if (c0lflLIZ != null) {
            getRecordControlApi().isRecording().LIZ(this, new AObjectS241S0100000_8(c0lflLIZ, 65));
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0LFK(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
