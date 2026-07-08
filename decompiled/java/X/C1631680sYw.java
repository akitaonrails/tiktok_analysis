package X;

import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.Pair;
import lnn.q;

/* JADX INFO: renamed from: X.0sYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631680sYw extends AbstractC2255721DQs<InterfaceC1631700sYy> implements InterfaceC1631700sYy, InterfaceC379610EuV {
    public static final C1631690sYx LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public static final Map<Integer, String> LLJJI;
    public final C1DRG LL;
    public final C1631680sYw LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1628590sTx.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), e0.class, null);
    public String LLJI;
    public String LLJIJIL;
    public Effect LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1631680sYw.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1631680sYw.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(C1631680sYw.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C2217381BqS(C1631680sYw.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0), new C2217381BqS(C1631680sYw.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C2217381BqS(C1631680sYw.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0), new C2217381BqS(C1631680sYw.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0)};
        LLJILJILJ = new C1631690sYx();
        LLJJ = 8;
        C1631530sYh.LIZ.getClass();
        LLJJI = C2097608Jq.LJIIIIZZ(new Pair(15, C1631530sYh.LIZIZ), new Pair(60, C1631530sYh.LIZJ), new Pair(180, C1631530sYh.LIZLLL), new Pair(600, C1631530sYh.LJ));
    }

    private final InterfaceC1628590sTx Z1() {
        return (InterfaceC1628590sTx) this.LLIZLLLIL.getValue(this, LLJILLL[5]);
    }

    public final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLIZ.getValue(this, LLJILLL[4]);
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZIL.getValue(this, LLJILLL[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLL.getValue(this, LLJILLL[0]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLILZ.getValue(this, LLJILLL[1]);
    }

    public final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLILZLL.getValue(this, LLJILLL[3]);
    }

    public final e0 iq() {
        return (e0) this.LLJ.getValue(this, LLJILLL[6]);
    }

    public final void o2() {
        String str = this.LLJIJIL;
        if (str != null) {
            gq().gj(str, false);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "game_effects_record_mode_switch_back", true, false)) {
            gq().hb1().LIZ(this, new AObjectS246S0100000_25(this, 568));
            this.LLJIJIL = gq().Wg();
        }
        getStickerApiComponent().C0().LJII().LIZ().observe(this, new AObserverS227S0100000_25(this, 61));
        getStickerApiComponent().C0().LJII().LJIILJJIL().observe(this, new AObserverS227S0100000_25(this, 62));
    }

    public C1631680sYw X1() {
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

    public C1631680sYw(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void W1(Effect effect) {
        C1631740sZ2 c1631740sZ2 = C1631740sZ2.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        c1631740sZ2.getClass();
        if (C1631740sZ2.LIZ(shortVideoContext) && C1624570sNT.LJII(effect)) {
            Z1().Ev();
        }
    }
}
