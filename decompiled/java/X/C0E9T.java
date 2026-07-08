package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0E9T, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E9T extends AbstractC2255721DQs<C0E9U> implements C0E9U, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final C0E9U LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E9T.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = 8;
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLILZIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C19576911iZ.LIZJ = getEditModel().getCreationId();
    }

    public C0E9U W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final C19A3 getParentScene() {
        return this.LL;
    }

    public C0E9T(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }
}
