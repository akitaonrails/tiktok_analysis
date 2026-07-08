package X;

import Y.AObjectS246S0100000_25;
import Y.AObjectS306S0200000_25;
import Y.AObjectS82S0400000_25;
import Y.AObserverS227S0100000_25;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoStickerHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.childeffectpanel.ChildEffectButtonHandler;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionListHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;
import lnn.q;
import nv7.c0;
import r1k.a;

/* JADX INFO: renamed from: X.0shh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1637110shh extends AbstractC1637220shs {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C19EG LLJJIJI;
    public final C1664750tQH LLJJIJIIJIL;
    public final InterfaceC1624950sO5 LLJJIJIL;
    public final InterfaceC1648510t05 LLJJJ;
    public final C1664740tQG LLJJJIL;
    public final C1664740tQG LLJJJJ;
    public final C01GW LLJJJJJIL;
    public C09AY LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1637110shh.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1637110shh.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1637110shh.class, "stickerLogicComponent", "getStickerLogicComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final a c3() {
        EnumC1448590nnd enumC1448590nndLIZJ;
        C385670FAf<EnumC1448590nnd> c385670FAfDk;
        InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) this.LLJJJIL.getValue(this, LLJJL[1]);
        if (interfaceC1646220swO == null || (c385670FAfDk = interfaceC1646220swO.dk()) == null || (enumC1448590nndLIZJ = c385670FAfDk.LIZJ()) == null) {
            enumC1448590nndLIZJ = EnumC1448590nnd.RATIO_9_16;
        }
        if (enumC1448590nndLIZJ == EnumC1448590nnd.RATIO_9_16) {
            return new a(getCameraApiComponent().St2().getEffectController(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) getCameraApiComponent().fF2().getLayoutParams()));
        }
        int screenWidth = ScreenUtils.getScreenWidth(this.LLJJIJI);
        int i = (screenWidth * 16) / 9;
        return new a(getCameraApiComponent().St2().getEffectController(), screenWidth, i, c0.LIZ.t2(screenWidth, i).getMarginStart(), C578100Mls.LIZJ(this.LLJJIJI) - ((screenWidth * 2) / 9));
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLJJIJIIJIL.getValue(this, LLJJL[0]);
    }

    public final void q3() {
        InterfaceC1625000sOA interfaceC1625000sOAG2;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        if (((Boolean) C262920ASc.LIZ.getValue()).booleanValue() || (interfaceC1625000sOAG2 = G2()) == null || (interfaceC1624480sNKC0 = interfaceC1625000sOAG2.C0()) == null) {
            return;
        }
        InterfaceC1627350sRx stickerRepository = interfaceC1624480sNKC0.getStickerRepository();
        InterfaceC1633140sbI interfaceC1633140sbILJFF = stickerRepository.LJFF();
        interfaceC1633140sbILJFF.LJIJJLI("sticker_category:favorite", null, true, false).observe(this, new AObjectS82S0400000_25(interfaceC1633140sbILJFF, this, interfaceC1624480sNKC0, stickerRepository, 0));
    }

    @Override // X.AbstractC1637220shs
    public final void T2() {
        if (!C298060BmG.LIZ()) {
            super.T2();
            return;
        }
        if (C1637850sit.LIZIZ(this)) {
            ((C1453870nw9) this.LLIZ.LJII(C1453870nw9.class, null)).LIZLLL(EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END).LIZ(this, new AObjectS246S0100000_25(this, 34));
            return;
        }
        InterfaceC1642740sqm interfaceC1642740sqm = (InterfaceC1642740sqm) this.LLIZ.LJIIL(null, InterfaceC1642740sqm.class);
        if (interfaceC1642740sqm != null) {
            interfaceC1642740sqm.aa1().LIZ(this, new AObjectS246S0100000_25(this, 35));
        } else {
            super.T2();
        }
    }

    public final InterfaceC1625880sPa i3() {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1627350sRx stickerRepository;
        InterfaceC1625000sOA interfaceC1625000sOAG2 = G2();
        if (interfaceC1625000sOAG2 == null || (interfaceC1624480sNKC0 = interfaceC1625000sOAG2.C0()) == null || (stickerRepository = interfaceC1624480sNKC0.getStickerRepository()) == null) {
            return null;
        }
        return stickerRepository.LJFF();
    }

    @Override // X.AbstractC1637220shs, X.AbstractC1643600ssA
    public final void o2() {
        super.o2();
        C1637140shk c1637140shk = (C1637140shk) this.LLJJJJJIL.getValue();
        if (c1637140shk == null || c1637140shk.LIZIZ) {
            return;
        }
        c1637140shk.LIZIZ = true;
        C1641640sp0 c1641640sp0 = (C1641640sp0) c1637140shk.LIZ.C0().getStickerRepository().LJFF().LJIIJ(null, false, true, false).getValue();
        if ((c1641640sp0 != null ? c1641640sp0.LIZIZ : null) != EnumC1641550sor.SUCCESS) {
            InterfaceC1625000sOA interfaceC1625000sOA = c1637140shk.LIZ;
            C1637130shj c1637130shj = new C1637130shj(interfaceC1625000sOA);
            c1637130shj.LIZ().observe(interfaceC1625000sOA.getLifecycleOwner(), new AObjectS306S0200000_25((Object) c1637130shj, (Object) new AwS569S0100000_25(c1637140shk, 1118), (InterfaceC1648570t0B) 37));
            return;
        }
        if (c1637140shk.LIZJ == null) {
            c1637140shk.LIZJ = new C1637120shi(c1637140shk.LIZ);
        }
        if (c1637140shk.LIZLLL == null) {
            c1637140shk.LIZLLL = new C1629400sVG(c1637140shk.LIZ);
        }
        C1637120shi c1637120shi = c1637140shk.LIZJ;
        if (c1637120shi != null) {
            c1637120shi.LIZIZ();
        }
        C1629400sVG c1629400sVG = c1637140shk.LIZLLL;
        if (c1629400sVG != null) {
            c1629400sVG.LIZ();
        }
    }

    @Override // X.AbstractC1637220shs, X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC1625000sOA interfaceC1625000sOAG2;
        LiveData liveDataLJIIJ;
        LiveEvent<C1646150swH> liveEventMr1;
        LiveEvent<Boolean> liveEventDN1;
        LiveEvent<AbstractC1881107Yj> liveEventWh2;
        LiveEvent<AbstractC1627380sS0> liveEventMa2;
        LiveEvent<Boolean> liveEventDN12;
        InterfaceC1625000sOA interfaceC1625000sOAG22;
        InterfaceC1625000sOA interfaceC1625000sOAG23;
        super.onCreate();
        if (C297310Bl3.LIZ() && (interfaceC1625000sOAG23 = G2()) != null) {
            interfaceC1625000sOAG23.sk(new OptionListHandler(this, this.LLIZ));
        }
        if (C1444560nh8.LIZ() && (interfaceC1625000sOAG22 = G2()) != null) {
            interfaceC1625000sOAG22.sk(new ChildEffectButtonHandler(this, this.LLIZ));
        }
        if ((((Boolean) C1637150shl.LIZ.getValue()).booleanValue() || C1647240sy2.LIZ().lazyLoadComponentV2) && (interfaceC1625000sOAG2 = G2()) != null) {
            interfaceC1625000sOAG2.sk(new EffectInfoStickerHandler(this, this.LLIZ));
        }
        InterfaceC1648510t05 interfaceC1648510t05 = this.LLJJJ;
        if (interfaceC1648510t05 != null) {
            InterfaceC1625000sOA interfaceC1625000sOAG24 = G2();
            if (interfaceC1625000sOAG24 != null && (liveEventDN12 = interfaceC1625000sOAG24.dN1()) != null) {
                liveEventDN12.LIZ(this, new AObjectS246S0100000_25(interfaceC1648510t05, 29));
            }
            InterfaceC1625000sOA interfaceC1625000sOAG25 = G2();
            if (interfaceC1625000sOAG25 != null && (liveEventMa2 = interfaceC1625000sOAG25.Ma2()) != null) {
                liveEventMa2.LIZ(this, new AObjectS306S0200000_25((Object) this, (Object) interfaceC1648510t05, (InterfaceC1648570t0B) 1));
            }
            InterfaceC1624950sO5 interfaceC1624950sO5 = this.LLJJIJIL;
            if (interfaceC1624950sO5 != null && (liveEventWh2 = interfaceC1624950sO5.Wh2()) != null) {
                liveEventWh2.LIZ(this, new AObjectS246S0100000_25(interfaceC1648510t05, 30));
            }
        }
        InterfaceC1625000sOA interfaceC1625000sOAG26 = G2();
        if (interfaceC1625000sOAG26 != null && (liveEventDN1 = interfaceC1625000sOAG26.dN1()) != null) {
            liveEventDN1.LIZ(this, new AObjectS246S0100000_25(this, 31));
        }
        InterfaceC1646220swO interfaceC1646220swO = (InterfaceC1646220swO) this.LLJJJIL.getValue(this, LLJJL[1]);
        if (interfaceC1646220swO != null && (liveEventMr1 = interfaceC1646220swO.Mr1()) != null) {
            liveEventMr1.LIZ(this, new AObjectS246S0100000_25(this, 32));
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_first_frame_network_api_delay", true, false)) {
            getCameraApiComponent().qF1().observe(this, new AObserverS227S0100000_25(this, 6));
            return;
        }
        InterfaceC1625880sPa interfaceC1625880sPaI3 = i3();
        if (interfaceC1625880sPaI3 == null || (liveDataLJIIJ = interfaceC1625880sPaI3.LJIIJ(null, false, true, false)) == null) {
            return;
        }
        liveDataLJIIJ.observe(this, new AObjectS246S0100000_25(this, 33));
    }

    @Override // X.AbstractC1637220shs, X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
    }

    public final void m3(Effect effect, InterfaceC1648510t05 interfaceC1648510t05) {
        AbstractC21664519qV c1637100shg;
        if (effect != null && (effect.getTypes().contains("TouchGes") || C1624200sMs.LJFF(effect))) {
            c1637100shg = c3();
        } else {
            c1637100shg = new C1637100shg();
        }
        interfaceC1648510t05.IQ0(c1637100shg);
    }

    public C1637110shh(C1DRG c1drg, C19A3 c19a3, int i, Function1<? super C1637230sht, Unit> function1) {
        super(c1drg, c19a3, i, function1);
        this.LLJJIJI = (C19EG) this.LLIZ.LJII(C19EG.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(this.LLIZ, InterfaceC1650230t2r.class, null);
        this.LLJJIJIL = (InterfaceC1624950sO5) this.LLIZ.LJIIL(null, InterfaceC1624950sO5.class);
        this.LLJJJ = (InterfaceC1648510t05) this.LLIZ.LJIIL(null, InterfaceC1648510t05.class);
        this.LLJJJIL = C1664770tQJ.LIZIZ(this.LLIZ, InterfaceC1646220swO.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(this.LLIZ, q.class, null);
        this.LLJJJJJIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS569S0100000_25(this, 91));
    }
}
