package X;

import Y.AObserverS212S0100000_8;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;

/* JADX INFO: renamed from: X.0LzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560880LzC extends AbstractC2255721DQs<InterfaceC560900LzE> implements InterfaceC560900LzE, InterfaceC379610EuV {
    public static final C560890LzD LLILZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final ICrashReportService LLILLJJLI = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideErrorReporter();
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0LzD] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C560880LzC.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = new Object() { // from class: X.0LzD
        };
        LLILZLL = 8;
    }

    public InterfaceC560900LzE W1() {
        return this;
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getCameraApiComponent().qF1().observe(this, new AObserverS212S0100000_8(this, 41));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLILLJJLI.setCustomTag("creative_content_user_action", "");
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

    public C560880LzC(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
