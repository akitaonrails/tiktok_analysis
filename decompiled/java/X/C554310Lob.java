package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Lob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554310Lob extends AbstractC2255721DQs<InterfaceC554330Lod> implements InterfaceC554330Lod, InterfaceC379610EuV {
    public static final C554320Loc LLILZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final ICrashReportService LLILLL = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).provideErrorReporter();

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Loc] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C554310Lob.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = new Object() { // from class: X.0Loc
        };
        LLILZLL = 8;
    }

    public InterfaceC554330Lod W1() {
        return this;
    }

    private final VideoPublishEditModel X1() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLILZIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLILLL.setCustomTag("creative_content_type", C1428470nHB.LJIILL(X1()));
        this.LLILLL.setCustomTag("creative_content_source", C1428470nHB.LJIILIIL(X1()));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLILLL.setCustomTag("creative_content_type", "");
        this.LLILLL.setCustomTag("creative_content_source", "");
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

    public C554310Lob(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
