package X;

import Y.AObjectS246S0100000_25;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.Set;
import mn3.e0;

/* JADX INFO: renamed from: X.0sUE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628760sUE extends AbstractC2255721DQs<InterfaceC1628770sUF> implements InterfaceC1628770sUF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public boolean LLILZLL = true;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1628760sUE.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1628760sUE.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1628760sUE.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1628760sUE.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLIZLLLIL = 8;
    }

    public InterfaceC1628770sUF W1() {
        return this;
    }

    public final Set<Integer> X1() {
        return C13LQ.LJLIIL(new Integer[]{10, 11, 14, 18});
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLILLJJLI.getValue(this, LLIZ[0]);
    }

    private final e0 getCameraApiComponent() {
        return (e0) this.LLILLL.getValue(this, LLIZ[1]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLILZIL.getValue(this, LLIZ[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZ.getValue(this, LLIZ[2]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getRecordAdapterApi().gP2(this);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        getRecordAdapterApi().gP2(null);
    }

    @Override // X.InterfaceC1628770sUF
    public boolean Hw2() {
        return this.LLILZLL;
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

    public C1628760sUE(C1DRG c1drg) {
        this.LL = c1drg;
        Op().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 328));
    }

    public final void Z1(String str) {
        C201955140j.LIZLLL(C201967140v.LIZIZ, "preview_downgrade", str);
    }

    public final void o2(boolean z) {
        if (this.LLILZLL == z) {
            return;
        }
        if (z) {
            getCameraApiComponent().St2().getCameraController().H4(true);
        } else {
            getCameraApiComponent().St2().getCameraController().H4(false);
        }
    }
}
