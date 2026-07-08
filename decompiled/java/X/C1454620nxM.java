package X;

import Y.AObserverS225S0100000_22;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454620nxM extends AbstractC2255721DQs<InterfaceC1454610nxL> implements InterfaceC1454610nxL, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1454610nxL LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1454620nxM.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1454620nxM.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public final InterfaceC1455860nzM X1() {
        return (InterfaceC1455860nzM) this.LLILZ.getValue(this, LLILZIL[1]);
    }

    public final VideoPublishEditModel Z1() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        X1().ww2().observe(this, new AObserverS225S0100000_22(this, 3));
    }

    public InterfaceC1454610nxL W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1454620nxM(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
