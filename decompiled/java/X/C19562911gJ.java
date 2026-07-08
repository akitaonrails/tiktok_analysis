package X;

import Y.AObserverS231S0100000_29;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.story.homepage.StoryHomepageService;
import com.ss.android.vesdk.VEEditor;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.11gJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19562911gJ extends AbstractC2255721DQs<InterfaceC1454670nxR> implements InterfaceC1454670nxR, InterfaceC379610EuV {
    public static final C19563011gK LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final C19562911gJ LLILLL = this;
    public final File LLILZ;
    public AtomicBoolean LLILZIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.11gK] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19562911gJ.class, "editApi", "getEditApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = new Object() { // from class: X.11gK
        };
        LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)));
        LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(400));
    }

    private final InterfaceC1455860nzM Z1() {
        return (InterfaceC1455860nzM) this.LLILLJJLI.getValue(this, LLIZ[0]);
    }

    public final void W1() {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        InterfaceC1455860nzM interfaceC1455860nzMZ1 = Z1();
        if (interfaceC1455860nzMZ1 == null || (liveDataG = interfaceC1455860nzMZ1.g()) == null || (value = liveDataG.getValue()) == null) {
            return;
        }
        value.lg(new int[]{value.getDuration() - 1}, LLIZLLLIL, LLJ, VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT, new InterfaceC1464140oCi() { // from class: X.01tN
            @Override // X.InterfaceC1464140oCi
            public final int onGetImageData(byte[] bArr, int i, int i2, int i3, float f) {
                if (bArr != null && i2 > 0 && i3 > 0) {
                    C23250099c.LIZLLL(C817503Hh.LL, null, null, new C476601tM(i2, i3, bArr, this.LIZ, null), 3);
                    return 0;
                }
                return 0;
            }
        });
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<Void> liveDataWw2;
        super.onCreate();
        InterfaceC1455860nzM interfaceC1455860nzMZ1 = Z1();
        if (interfaceC1455860nzMZ1 == null || (liveDataWw2 = interfaceC1455860nzMZ1.ww2()) == null) {
            return;
        }
        liveDataWw2.observe(this, new AObserverS231S0100000_29(this, 93));
    }

    public C19562911gJ X1() {
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

    public C19562911gJ(C1DRG c1drg) {
        this.LL = c1drg;
        StoryHomepageService storyHomepageServiceLJJJJZ = C1618440sDa.LIZIZ.LJJJJZ();
        this.LLILZ = storyHomepageServiceLJJJJZ != null ? storyHomepageServiceLJJJJZ.LIZLLL() : null;
        this.LLILZIL = new AtomicBoolean(false);
    }
}
