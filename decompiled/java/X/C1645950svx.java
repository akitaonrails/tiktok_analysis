package X;

import Y.AObjectS246S0100000_25;
import android.view.ScaleGestureDetector;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0;
import lnn.q;
import r1k.a;

/* JADX INFO: renamed from: X.0svx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645950svx extends AbstractC2255721DQs<InterfaceC1631280sYI> implements InterfaceC1631280sYI, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1DRG LL;
    public final InterfaceC1631280sYI LLILLJJLI = this;
    public final int LLILLL = 15000;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648510t05.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1645950svx.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1645950svx.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1645950svx.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1645950svx.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1645950svx.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    private final InterfaceC1648510t05 getGestureApiComponent() {
        return (InterfaceC1648510t05) this.LLIZ.getValue(this, LLJ[3]);
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZ.getValue(this, LLJ[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZLLLIL.getValue(this, LLJ[4]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLILZLL.getValue(this, LLJ[2]);
    }

    public final e0 iq() {
        return (e0) this.LLILZIL.getValue(this, LLJ[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<AbstractC1645970svz> liveEventSi;
        super.onCreate();
        if (C1621950sJF.LIZ()) {
            iq().kZ1(C579080MnS.class, new InterfaceC579700MoS() { // from class: X.0svy
                @Override // X.InterfaceC579700MoS
                public final boolean LIZ(C0LZD c0lzd) {
                    if (this.LIZ.getCameraApiComponent().pw0().LIZJ() >= this.LIZ.getCameraApiComponent().pw0().LIZLLL()) {
                        q stickerApiComponent = this.LIZ.getStickerApiComponent();
                        if (stickerApiComponent != null) {
                            stickerApiComponent.pp2(false, "");
                        }
                        this.LIZ.iq().Sf0(new C0LZD("record_full"));
                    }
                    return false;
                }
            });
        }
        iq().Vt0().LIZ(this, new AObjectS246S0100000_25(this, 177));
        iq().lC2().LIZ(this, new AObjectS246S0100000_25(this, 178));
        getCameraApiComponent().yj1().LIZ(this, new AObjectS246S0100000_25(this, 179));
        if (getShortVideoContext().cameraComponentModel.isRetakeMode && getShortVideoContext().LJIIZILJ() != null && getShortVideoContext().LJIIZILJ().stitchParams != null) {
            getShortVideoContext().LJJII(getShortVideoContext().LJIIZILJ().stitchParams);
        }
        iq().yI2((!getShortVideoContext().LJJJJLL() || getShortVideoContext().stitchContext.stitchClip == null) ? C1649650t1v.LIZ(getShortVideoContext().LJII(), getShortVideoContext().LJI(), true) : C1649650t1v.LIZIZ(getShortVideoContext().LJI(), getShortVideoContext().LJII(), getShortVideoContext().stitchContext.stitchClip));
        if (getShortVideoContext().mIsFromDraft && C1697810uHb.LJIIJJI(15, 24, 17, 16, 20, 23).contains(Integer.valueOf(getShortVideoContext().shootMode))) {
            iq().xP1(true, false, true);
        }
        iq().pU1().LIZ(this, new AObjectS246S0100000_25(this, 180));
        iq().fx().LIZ(this, new AObjectS246S0100000_25(this, 181));
        InterfaceC1648510t05 gestureApiComponent = getGestureApiComponent();
        if (gestureApiComponent != null) {
            gestureApiComponent.IQ0(new AbstractC21664519qV() { // from class: X.0svw
                public boolean LL = true;
                public boolean LLILLJJLI = true;

                @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
                public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                    Boolean boolLIZJ = this.LLILLL.iq().isRecording().LIZJ();
                    if ((boolLIZJ.booleanValue() && this.LLILLJJLI) || (!boolLIZJ.booleanValue() && this.LL)) {
                        C1403170mcN.LIZIZ(boolLIZJ.booleanValue() ? 1 : 0, this.LLILLL.getShortVideoContext().getCreationId(), this.LLILLL.getShortVideoContext().shootWay, "pinch");
                        if (boolLIZJ.booleanValue()) {
                            this.LLILLJJLI = false;
                        } else {
                            this.LL = false;
                        }
                    }
                    return this instanceof a;
                }
            });
        }
        InterfaceC1648510t05 gestureApiComponent2 = getGestureApiComponent();
        if (gestureApiComponent2 == null || (liveEventSi = gestureApiComponent2.Si()) == null) {
            return;
        }
        liveEventSi.LIZ(this, new AObjectS246S0100000_25(this, 182));
    }

    public InterfaceC1631280sYI W1() {
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

    public C1645950svx(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
