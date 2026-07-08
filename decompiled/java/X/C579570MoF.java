package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.editorpro.n;
import com.ss.android.ugc.aweme.shortvideo.p1;
import mn3.e0;

/* JADX INFO: renamed from: X.0MoF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579570MoF extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final C05YF LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C579570MoF.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C579570MoF.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C579570MoF.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C579570MoF.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLIZLLLIL = 8;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getRecordControlApi().KA0(C579080MnS.class, new p1(this, getActivity(), getCameraApiComponent(), getRecordControlApi(), getShortVideoContext(), getDiContainer()));
        getRecordControlApi().kZ1(C579080MnS.class, new n(getShortVideoContext(), getActivity(), (C580090Mp5) getDiContainer().LJII(C580090Mp5.class, null), (InterfaceC1647420syK) getDiContainer().LJII(InterfaceC1647420syK.class, null), getCameraApiComponent(), getDiContainer()));
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILZIL.getValue(this, LLIZ[2]);
    }

    private final e0 getCameraApiComponent() {
        return (e0) this.LLILLL.getValue(this, LLIZ[0]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZ.getValue(this, LLIZ[1]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZLL.getValue(this, LLIZ[3]);
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C579570MoF(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
