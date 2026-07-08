package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0o1j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457330o1j extends AbstractC2255721DQs<InterfaceC1457340o1k> implements InterfaceC1457340o1k, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final int LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), C0LI4.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1457330o1j.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1457330o1j.class, "pugcTemplateAutoSaveDraftApi", "getPugcTemplateAutoSaveDraftApi()Lcom/ss/android/ugc/aweme/shortvideo/pugc/PUGCTemplateAutoSaveDraftComponetApi;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLILZIL = 8;
    }

    public InterfaceC1457340o1k W1() {
        return this;
    }

    private final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLILZ[0]);
    }

    private final C0LI4 X1() {
        return (C0LI4) this.LLILLL.getValue(this, LLILZ[1]);
    }

    private final void Z1() {
        if (C1454440nx4.LIZ() && C1428470nHB.LJJJLIIL(LJJJLIIL()) && LJJJLIIL().isFromRestoreRecover()) {
            boolean zLJJIJLIJ = C140D.LIZ.LJJIJLIJ(LJJJLIIL().getCreativeInfo());
            LJJJLIIL().creativeModel.commonMobModel.c2paReadRecoverType = zLJJIJLIJ ? 2 : C1436990nUv.LIZLLL(LJJJLIIL()) == 2 ? 1 : 0;
        }
    }

    private final void init() {
        if (C1454440nx4.LIZ()) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        Z1();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        init();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        super.onDestroy();
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

    public C1457330o1j(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @C14EU(sticky = true, threadMode = ThreadMode.MAIN)
    public final void handleReadC2PAFinishEvent(C2037007yS c2037007yS) {
        C140D c140d = C140D.LIZ;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        c140d.getClass();
        C140D.LJJIIZ(videoPublishEditModelLJJJLIIL);
        C0LI4 c0li4X1 = X1();
        if (c0li4X1 != null) {
            c0li4X1.Qk(false);
        }
        C140D.LJIIIIZZ(LJJJLIIL().getCreativeInfo().getCreationId(), c2037007yS.LIZ);
    }
}
