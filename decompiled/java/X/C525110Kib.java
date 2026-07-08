package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;

/* JADX INFO: renamed from: X.0Kib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525110Kib extends AbstractC2255721DQs<InterfaceC525120Kic> implements InterfaceC525120Kic, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final boolean LLILLJJLI;
    public final InterfaceC525120Kic LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC525880Kjq.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), ShortVideoContext.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C525110Kib.class, "selectionDataApi", "getSelectionDataApi()Lcom/ss/android/ugc/aweme/shortvideo/album/selection/AlbumSelectionDataApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C525110Kib.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLIZ = 8;
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZIL.getValue(this, LLILZLL[1]);
    }

    public final InterfaceC525880Kjq X1() {
        return (InterfaceC525880Kjq) this.LLILZ.getValue(this, LLILZLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C526290KkV(this, null), 3);
    }

    public InterfaceC525120Kic W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final void Z1(TikTokMediaModel tikTokMediaModel) {
        C1458370o3P.LIZ.getClass();
        C1458730o3z c1458730o3zLIZJ = C1458370o3P.LIZJ(tikTokMediaModel, null);
        if (c1458730o3zLIZJ == null) {
            return;
        }
        C1458370o3P.LJJIIJ(c1458730o3zLIZJ, false, getShortVideoContext(), this.LLILLJJLI, false);
    }

    public C525110Kib(C1DRG c1drg, boolean z) {
        this.LL = c1drg;
        this.LLILLJJLI = z;
    }
}
