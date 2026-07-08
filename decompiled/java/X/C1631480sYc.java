package X;

import Y.AObjectS244S0100000_18;
import Y.AObjectS246S0100000_25;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.childeffectpanel.ChildEffectButtonHandler;
import com.ss.android.ugc.gamora.recorder.sticker.childeffectpanel.g;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import java.util.Collections;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631480sYc extends AbstractC2255721DQs<InterfaceC1624540sNQ> implements InterfaceC379610EuV, InterfaceC1624540sNQ, InterfaceC1631520sYg {
    public static final C1631500sYe LLJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1625000sOA.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC577400Mkk.class, null);
    public final g LLJI = new g(getDiContainer(), this);
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public Effect LLJILJILJ;
    public Effect LLJILLL;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0sYe] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1631480sYc.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1631480sYc.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1631480sYc.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0), new C2217381BqS(C1631480sYc.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0), new C2217381BqS(C1631480sYc.class, "recordBottomTabComponent", "getRecordBottomTabComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C2217381BqS(C1631480sYc.class, "slideComponent", "getSlideComponent()Lcom/ss/android/ugc/slideslip/SlideSlipEffectApiComponent;", 0)};
        LLJJ = new Object() { // from class: X.0sYe
        };
        LLJJIII = 8;
    }

    private final void G2() {
        this.LLJIJIL = false;
        Effect effectLIZIZ = C1624010sMZ.LIZIZ(nq());
        if (effectLIZIZ != null) {
            i3(effectLIZIZ);
        }
    }

    private final void c3() {
        this.LLJILJIL = false;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1170070gYP(this, null), 3);
    }

    public InterfaceC1624540sNQ Z1() {
        return this;
    }

    private final InterfaceC1638550sk1 gq() {
        return (InterfaceC1638550sk1) this.LLIZ.getValue(this, LLJJI[3]);
    }

    private final e0 iq() {
        return (e0) this.LLILZ.getValue(this, LLJJI[0]);
    }

    private final InterfaceC1648020szI o2() {
        return (InterfaceC1648020szI) this.LLIZLLLIL.getValue(this, LLJJI[4]);
    }

    public final void W2() {
        if (this.LLJIJIL) {
            G2();
        } else if (this.LLJILJIL) {
            c3();
        }
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZIL.getValue(this, LLJJI[1]);
    }

    public final InterfaceC1625000sOA nq() {
        return (InterfaceC1625000sOA) this.LLILZLL.getValue(this, LLJJI[2]);
    }

    public final InterfaceC577400Mkk w2() {
        return (InterfaceC577400Mkk) this.LLJ.getValue(this, LLJJI[5]);
    }

    @Override // X.InterfaceC1631520sYg
    public void LIZIZ() {
        Effect effectLIZIZ = C1624010sMZ.LIZIZ(nq());
        if (effectLIZIZ != null) {
            this.LLJILJILJ = effectLIZIZ;
            this.LLJIJIL = true;
            if (getShortVideoContext().shootMode != 16 || C2176808fu.LIZ()) {
                if (Intrinsics.LJFF(nq().dN1().LJI(), Boolean.TRUE)) {
                    i3(effectLIZIZ);
                    return;
                } else {
                    nq().pp2(true, "");
                    return;
                }
            }
            this.LLJILJIL = true;
            if (Intrinsics.LJFF(nq().dN1().LJI(), Boolean.TRUE)) {
                nq().pp2(false, "");
            } else {
                i3(effectLIZIZ);
            }
            if (getShortVideoContext().shootMode == 16 || !C2176808fu.LIZ()) {
                C1389890mGx c1389890mGx = new C1389890mGx(C1664590tQ1.LJII(this));
                c1389890mGx.LJIIIZ(2131833274);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    public final void T2() {
        Effect effectLIZIZ;
        if (getShortVideoContext().shootMode == 16 && this.LLJILJIL && (effectLIZIZ = C1624010sMZ.LIZIZ(nq())) != null) {
            i3(effectLIZIZ);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C560530Lyd<C1647390syH> c560530LydHb1;
        super.onCreate();
        if (!C297310Bl3.LIZ()) {
            nq().sk(new ChildEffectButtonHandler(this, getDiContainer()));
        }
        iq().cJ0().LIZ(this, new AObjectS246S0100000_25(this, 564));
        whenReady(this, InterfaceC577400Mkk.class, new AwS604S0100000_25(this, 378));
        iq().xM2().LIZ(this, new AObjectS246S0100000_25(this, 565));
        o2().getBottomTabIndexChangeEvent().LIZ(this, new AObjectS246S0100000_25(this, 566));
        nq().Iq0().LIZ(this, new AObjectS244S0100000_18(this, 23));
        InterfaceC1638550sk1 interfaceC1638550sk1Gq = gq();
        if (interfaceC1638550sk1Gq != null && (c560530LydHb1 = interfaceC1638550sk1Gq.hb1()) != null) {
            c560530LydHb1.LIZ(this, new AObjectS246S0100000_25(this, 567));
        }
        if (this.LLILLJJLI.isAdded(this.LLJI)) {
            return;
        }
        this.LLILLJJLI.add(this.LLILLL, this.LLJI, "ChildEffectButtonScene");
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    private final void X1(String str) {
        nq().C0().LIZIZ(str, null, new C1698220uIG(this, 0));
    }

    private final void i3(Effect effect) {
        String strLJ = DiyPropParser.LJ(effect);
        this.LLJIJIL = false;
        X1(strLJ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void H2(Effect effect) {
        String strLIZ = C1449600npG.LIZ(effect);
        switch (strLIZ.hashCode()) {
            case 1151385704:
                if (strLIZ.equals("video_15")) {
                    InterfaceC1638550sk1 interfaceC1638550sk1Gq = gq();
                    if (interfaceC1638550sk1Gq == null) {
                        return;
                    }
                    C1631530sYh.LIZ.getClass();
                    interfaceC1638550sk1Gq.gj(C1631530sYh.LIZIZ, true);
                    return;
                }
                break;
            case 1151385854:
                if (strLIZ.equals("video_60")) {
                    InterfaceC1638550sk1 interfaceC1638550sk1Gq2 = gq();
                    if (interfaceC1638550sk1Gq2 == null) {
                        return;
                    }
                    C1631530sYh.LIZ.getClass();
                    interfaceC1638550sk1Gq2.gj(C1631530sYh.LIZJ, true);
                    return;
                }
                break;
            case 1333218597:
                if (strLIZ.equals("video_180")) {
                    InterfaceC1638550sk1 interfaceC1638550sk1Gq3 = gq();
                    if (interfaceC1638550sk1Gq3 == null) {
                        return;
                    }
                    C1631530sYh.LIZ.getClass();
                    interfaceC1638550sk1Gq3.gj(C1631530sYh.LIZLLL, true);
                    return;
                }
                break;
            case 1333223154:
                if (strLIZ.equals("video_600")) {
                    InterfaceC1638550sk1 interfaceC1638550sk1Gq4 = gq();
                    if (interfaceC1638550sk1Gq4 == null) {
                        return;
                    }
                    C1631530sYh.LIZ.getClass();
                    interfaceC1638550sk1Gq4.gj(C1631530sYh.LJ, true);
                    return;
                }
                break;
        }
        InterfaceC1638550sk1 interfaceC1638550sk1Gq5 = gq();
        if (interfaceC1638550sk1Gq5 != null) {
            C1631530sYh.LIZ.getClass();
            interfaceC1638550sk1Gq5.gj(C1631530sYh.LIZJ, true);
        }
    }

    @Override // X.InterfaceC1624540sNQ
    public void LJJJJLL(boolean z) {
        this.LLJI.hide();
    }

    public final void m3(Effect effect) {
        C1624010sMZ.LIZLLL(nq(), Collections.singletonList(effect), false, true, new InterfaceC1625550sP3() { // from class: X.0sYd
            @Override // X.InterfaceC1625550sP3
            public final void LJII(int i, Effect effect2) {
            }

            @Override // X.InterfaceC1625550sP3
            public final void LJIIIIZZ(Effect effect2) {
            }

            @Override // X.InterfaceC1625550sP3
            public final void onSuccess(Effect effect2) {
                if (effect2 != null) {
                    C1631480sYc c1631480sYc = this.LL;
                    c1631480sYc.LLJILLL = effect2;
                    InterfaceC1623190sLF interfaceC1623190sLFU = c1631480sYc.nq().U();
                    if (interfaceC1623190sLFU != null) {
                        interfaceC1623190sLFU.YL("create", true);
                        interfaceC1623190sLFU.qB(effect2);
                    }
                    c1631480sYc.nq().pp2(true, "");
                }
            }

            @Override // X.InterfaceC1625550sP3
            public final void LJIILLIIL(Effect effect2, ExceptionResult exceptionResult) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Exception: ");
                sbLIZ.append(exceptionResult.getException());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }, false, null, null, null, 32744);
    }

    @Override // X.InterfaceC1624540sNQ
    public void s(Effect effect) {
        this.LLJI.show();
    }

    public final void W1(Effect effect, Effect effect2) {
        String effectId;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", getShortVideoContext().enterFrom);
        c0lab.LJ("creation_id", getShortVideoContext().getCreationId());
        c0lab.LJ("shoot_way", getShortVideoContext().shootWay);
        if (effect != null) {
            effectId = effect.getEffectId();
        } else {
            effectId = null;
        }
        c0lab.LJ("child_effect_id", effectId);
        c0lab.LJ("parent_template_name", effect2.getName());
        c0lab.LJ("parent_template_id", effect2.getResource_id());
        C1449260noi.LJ("click_customize_this_effect", c0lab.LIZ);
    }

    public C1631480sYc(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
    }
}
