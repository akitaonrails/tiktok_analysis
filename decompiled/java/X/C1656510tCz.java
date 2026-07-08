package X;

import Y.AObjectS246S0100000_25;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel;
import java.util.List;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656510tCz extends AbstractC2255721DQs<InterfaceC1646870sxR> implements InterfaceC1646870sxR, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final C1656510tCz LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647520syU.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public LiveEventCountDownStickerModel LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1656510tCz.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1656510tCz.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/aweme/infinisticker/RecordInfiniStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1656510tCz.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLIZLLLIL = 8;
    }

    private final InterfaceC1647520syU getInfiniStickerApi() {
        return (InterfaceC1647520syU) this.LLILZ.getValue(this, LLIZ[1]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLL.getValue(this, LLIZ[0]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZIL.getValue(this, LLIZ[2]);
    }

    @Override // X.InterfaceC1646870sxR
    public void mK0() {
        InterfaceC1647520syU infiniStickerApi;
        List<C0FTJ<StickerModel>> listLLLLLZ;
        C0FTJ<? extends StickerModel> c0ftj;
        if (getShortVideoContext().cameraComponentModel.isRetakeMode || getShortVideoContext().cameraComponentModel.isEditorProRecordMode || (infiniStickerApi = getInfiniStickerApi()) == null || (listLLLLLZ = infiniStickerApi.LLLLLZ(EnumC1466150oFx.LIVE_EVENT_COUNTDOWN)) == null || (c0ftj = (C0FTJ) C13LP.LJJJLL(listLLLLLZ)) == null) {
            return;
        }
        c0ftj.setVisible(true);
        c0ftj.setAlpha(0.6f);
        InterfaceC1647520syU infiniStickerApi2 = getInfiniStickerApi();
        if (infiniStickerApi2 != null) {
            infiniStickerApi2.LJ0(false, "", c0ftj, null, null, null);
        }
    }

    public final LiveEventCountDownStickerModel o2() {
        return (LiveEventCountDownStickerModel) C13LP.LJJJLL(getShortVideoContext().creativeModel.stickerModel.liveEventCountDownStickerModel);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C1DRG diContainer = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC1647520syU.class, new AwS604S0100000_25(this, 104));
            return;
        }
        C05YF c05yf = (C05YF) diContainer.LJIIL(null, InterfaceC1647520syU.class);
        if (c05yf != null) {
            InterfaceC1647520syU interfaceC1647520syU = (InterfaceC1647520syU) c05yf;
            interfaceC1647520syU.LJJZZI(new C1656520tD0(this, LiveEventCountDownStickerModel.class));
            getRecordControlApi().lC2().LIZ(this, new AObjectS246S0100000_25(interfaceC1647520syU, 119));
            getRecordControlApi().Vt0().LIZ(this, new AObjectS246S0100000_25(interfaceC1647520syU, 120));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C1DRG diContainer = getDiContainer();
        if (C343070Dcf.LIZ()) {
            ((C0ETY) diContainer.LJII(C0ETY.class, null)).Sd(InterfaceC1647520syU.class, new AwS604S0100000_25(this, 105));
            return;
        }
        C05YF c05yf = (C05YF) diContainer.LJIIL(null, InterfaceC1647520syU.class);
        if (c05yf != null) {
            InterfaceC1647520syU interfaceC1647520syU = (InterfaceC1647520syU) c05yf;
            interfaceC1647520syU.mF(new AwS426S0200000_25(interfaceC1647520syU, this, 40));
        }
    }

    public C1656510tCz Z1() {
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

    public C1656510tCz(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void G2(LiveEventCountDownStickerModel liveEventCountDownStickerModel) {
        C0LAB c0lab = new C0LAB();
        X1(c0lab, liveEventCountDownStickerModel);
        C20684815ws.LJIILLIIL("livesdk_live_event_sticker_delete", c0lab.LIZ);
    }

    public final void H2(LiveEventCountDownStickerModel liveEventCountDownStickerModel) {
        getShortVideoContext().creativeModel.stickerModel.liveCountDownStickerModel.clear();
        G2(liveEventCountDownStickerModel);
    }

    public final void W1(StickerModel stickerModel) {
        InterfaceC1647520syU infiniStickerApi = getInfiniStickerApi();
        if (infiniStickerApi == null) {
            return;
        }
        infiniStickerApi.lJ(stickerModel, false);
        C0FTJ c0ftj = (C0FTJ) C13LP.LJJJLL(infiniStickerApi.LLLLLZ(EnumC1466150oFx.LIVE_EVENT_COUNTDOWN));
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1647490syR(c0ftj, this, stickerModel, null), 3);
    }

    public final void w2(LiveEventCountDownStickerModel liveEventCountDownStickerModel) {
        C0LAB c0lab = new C0LAB();
        X1(c0lab, liveEventCountDownStickerModel);
        C20684815ws.LJIILLIIL("livesdk_live_event_sticker_add_complete", c0lab.LIZ);
    }

    private final C0LAB X1(C0LAB c0lab, LiveEventCountDownStickerModel liveEventCountDownStickerModel) {
        c0lab.LJ("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LIZIZ(liveEventCountDownStickerModel.getEventId(), "live_event_id");
        c0lab.LJ("add_type", "add");
        c0lab.LJ("shoot_way", getShortVideoContext().shootWay);
        c0lab.LIZ(1, "is_free");
        return c0lab;
    }
}
