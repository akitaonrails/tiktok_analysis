package X;

import Y.AObjectS246S0100000_25;
import Y.AfS194S0100000_25;
import Y.AkS486S0100000_25;
import android.graphics.Bitmap;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.creative.model.FeedPropPinModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.shortvideo.recordcontrol.e0;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import ge.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS265S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0sRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627150sRd extends i<InterfaceC1627200sRi, C1630020sWG, C1628300sTU, C1627130sRb> implements InterfaceC1627200sRi, InterfaceC379610EuV, InterfaceC1626500sQa, InterfaceC1626510sQb {
    public static final C1627190sRh LLJL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public static final int LLJLILLLLZIIL;
    public final C19A3 LLJILJILJ;
    public final InterfaceC1626500sQa LLJILLL;
    public final InterfaceC1626510sQb LLJJ;
    public final C1DRG LLJJI;
    public final InterfaceC332600D2c LLJJIII;
    public final C11NJ LLJJIJI;
    public List<InterfaceC1626470sQX> LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C01GW LLJJJ;
    public int LLJJJIL;
    public InterfaceC1626470sQX LLJJJJ;
    public final C1631190sY9 LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1627270sRp LLJJLIIIJLLLLLLLZ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0sRh] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1627150sRd.class, "idleReportingApiComponent", "getIdleReportingApiComponent()Lcom/ss/android/ugc/slideslip/SlideSlipIdleReportingApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1627150sRd.class, "carouselMetricComponent", "getCarouselMetricComponent()Lcom/ss/android/ugc/slideslip/CarouselInitialShowMetricsApiComponent;", 0)};
        LLJL = new Object() { // from class: X.0sRh
        };
        LLJLILLLLZIIL = 8;
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<AbstractC789580UyC> A0() {
        return this.LLJJ.A0();
    }

    @Override // X.InterfaceC1626510sQb
    public h0<Boolean> A3() {
        return this.LLJJ.A3();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<AbstractC1626950sRJ> C() {
        return this.LLJJ.C();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1650930t3z Cp() {
        return this.LLJILLL.Cp();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1623680sM2 Ep() {
        return this.LLJILLL.Ep();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1649820t2C Eq() {
        return this.LLJILLL.Eq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC579050MnP Gp() {
        return this.LLJILLL.Gp();
    }

    @Override // X.InterfaceC1626500sQa
    public l0 Hq() {
        return this.LLJILLL.Hq();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<Boolean> I0() {
        return this.LLJJ.I0();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1448860no4 Ip() {
        return this.LLJILLL.Ip();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1625000sOA Iq() {
        return this.LLJILLL.Iq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1646220swO Kp() {
        return this.LLJILLL.Kp();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<AbstractC1626710sQv> LJJJJJL() {
        return this.LLJJ.LJJJJJL();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<Boolean> LJJJJZI() {
        return this.LLJJ.LJJJJZI();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<EnumC995040c06> LJJLIIIJ() {
        return this.LLJJ.LJJLIIIJ();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<AbstractC789580UyC> LLILZ() {
        return this.LLJJ.LLILZ();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<AbstractC1626710sQv> LLJILJILJ() {
        return this.LLJJ.LLJILJILJ();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<AbstractC1626790sR3> LLLF() {
        return this.LLJJ.LLLF();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1650620t3U Lp() {
        return this.LLJILLL.Lp();
    }

    @Override // X.InterfaceC1626500sQa
    public q Mq() {
        return this.LLJILLL.Mq();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1648020szI Op() {
        return this.LLJILLL.Op();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<Boolean> P0() {
        return this.LLJJ.P0();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1628180sTI Pp() {
        return this.LLJILLL.Pp();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<AbstractC1626950sRJ> W() {
        return this.LLJJ.W();
    }

    @Override // X.InterfaceC1626500sQa
    public long Xp() {
        return this.LLJILLL.Xp();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1647520syU aq() {
        return this.LLJILLL.aq();
    }

    @Override // X.InterfaceC1626510sQb
    public h0<Boolean> bh() {
        return this.LLJJ.bh();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<Effect> d0() {
        return this.LLJJ.d0();
    }

    @Override // X.InterfaceC1626510sQb
    public C11NZ<Boolean> g1() {
        return this.LLJJ.g1();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1650230t2r getCameraApiComponent() {
        return this.LLJILLL.getCameraApiComponent();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1648510t05 getGestureApiComponent() {
        return this.LLJILLL.getGestureApiComponent();
    }

    @Override // X.InterfaceC1626500sQa
    public a getPlanCUIApiComponent() {
        return this.LLJILLL.getPlanCUIApiComponent();
    }

    @Override // X.InterfaceC1626500sQa
    public ShortVideoContext getShortVideoContext() {
        return this.LLJILLL.getShortVideoContext();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1638550sk1 gq() {
        return this.LLJILLL.gq();
    }

    @Override // X.InterfaceC1626510sQb
    public InterfaceC332260D0u<Collection<C1007420cK4>> i0() {
        return this.LLJJ.i0();
    }

    @Override // X.InterfaceC1626500sQa
    public e0 iq() {
        return this.LLJILLL.iq();
    }

    @Override // X.InterfaceC1626510sQb
    public C05YD<Collection<C1007420cK4>> j0() {
        return this.LLJJ.j0();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1625000sOA nq() {
        return this.LLJILLL.nq();
    }

    @Override // X.InterfaceC1626510sQb
    public C11PQ<AbstractC1626790sR3> o1() {
        return this.LLJJ.o1();
    }

    @Override // X.InterfaceC1626500sQa
    public InterfaceC1625220sOW uq() {
        return this.LLJILLL.uq();
    }

    @Override // X.InterfaceC1626510sQb
    public h0<Boolean> wd() {
        return this.LLJJ.wd();
    }

    @Override // X.InterfaceC1626500sQa
    public q yq() {
        return this.LLJILLL.yq();
    }

    private final InterfaceC1649550t1l O4() {
        return (InterfaceC1649550t1l) this.LLJJJ.getValue();
    }

    private final void v5() {
        l0 l0VarHq;
        C560530Lyd<Pair<Effect, Boolean>> c560530Lyd;
        if (!((Boolean) C297960Bm6.LIZ.getValue()).booleanValue() || (l0VarHq = Hq()) == null || (c560530Lyd = l0VarHq.LLLLZLLLI) == null) {
            return;
        }
        c560530Lyd.LIZ(this, new AObjectS246S0100000_25(this, 671));
    }

    public final InterfaceC1627140sRc H4() {
        return (InterfaceC1627140sRc) this.LLJJL.getValue(this, LLJLIL[1]);
    }

    public final InterfaceC1626890sRD K4() {
        return (InterfaceC1626890sRD) this.LLJJJJLIIL.getValue(this, LLJLIL[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1628300sTU> o2() {
        return AFwS214S0000000_25.get$arr$(342);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1627130sRb> w2() {
        return new AwS569S0100000_25(this, 701);
    }

    private final void C5() {
        C11NZ c11nzLJJJJZI = W().LJJIL(new InterfaceC19483011Ki() { // from class: X.0sRI
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C1627010sRP;
            }
        }).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0sRH
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return (AbstractC1626950sRJ) obj;
            }
        });
        boolean z = !C097T.LIZ();
        C1627010sRP c1627010sRP = new C1627010sRP(C1697810uHb.LJIIJJI(C1626260sQC.LIZ, new C1880707Yf(), new C1880707Yf()), 0, false);
        if (z) {
            c11nzLJJJJZI = c11nzLJJJJZI.LJJLIL(c1627010sRP);
        }
        this.LLJJIJI.LIZ(c11nzLJJJJZI.LJJII(new InterfaceC1627390sS1() { // from class: X.0sRF
            @Override // X.InterfaceC1627390sS1
            public final boolean test(Object obj, Object obj2) {
                C1627010sRP c1627010sRP2 = (C1627010sRP) obj;
                C1627010sRP c1627010sRP3 = (C1627010sRP) obj2;
                List<InterfaceC1626470sQX> list = c1627010sRP2.LIZ;
                List<InterfaceC1626470sQX> list2 = c1627010sRP3.LIZ;
                if (c1627010sRP2.LIZIZ == c1627010sRP3.LIZIZ && list.size() == list2.size()) {
                    ArrayList<Pair> arrayList = (ArrayList) C13LP.LLIILII(list, list2);
                    if (!arrayList.isEmpty()) {
                        for (Pair pair : arrayList) {
                            if (!Intrinsics.LJFF(C1629110sUn.LIZ((InterfaceC1626470sQX) pair.getFirst()).getEffectId(), C1629110sUn.LIZ((InterfaceC1626470sQX) pair.getSecond()).getEffectId())) {
                            }
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 73)));
    }

    private final void F4() {
        this.LLJJIJI.LIZ(LJJJJJL().LJJIL(new C1698300uIO(this, 0)).LJJJJZI(new AkS486S0100000_25(this, 3)).LJJIFFI().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 74)));
    }

    private final void T4() {
        this.LLJJIJI.LIZ(C11NZ.LJIIJ(P0(), g1(), new InterfaceC500500Jk0<T1, T2, R>() { // from class: X.0sRe
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC500500Jk0
            public final R apply(T1 t1, T2 t2) {
                boolean z;
                boolean zBooleanValue = ((Boolean) t2).booleanValue();
                if (((Boolean) t1).booleanValue() && zBooleanValue) {
                    z = true;
                } else {
                    z = false;
                }
                return (R) Boolean.valueOf(z);
            }
        }).LJJIFFI().LJJLJLI(new AfS194S0100000_25(new AwS604S0100000_25(this, 440), 135)));
    }

    private final void Z4() {
        this.LLJJIJI.LIZ(LJJLIIIJ().LJJLJLI(new AfS194S0100000_25(this, 75)));
    }

    private final void d5() {
        gq().jP0().LIZ(this, new AObjectS246S0100000_25(this, 668));
    }

    private final void k5() {
        getDiContainer();
        if (C343070Dcf.LIZIZ() && C1631200sYA.LIZ(this.LLJJJJJIL)) {
            getPlanCUIApiComponent().Ap1().LIZ(this, new AObjectS246S0100000_25(this, 669));
        } else {
            getPlanCUIApiComponent().va().LIZ(this, new AObjectS246S0100000_25(this, 670));
        }
    }

    private final void n5() {
        this.LLJJIJI.LIZ(LLLF().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 76)));
    }

    private final void x5() {
        MutableLiveData<Boolean> mutableLiveData;
        if (C297970Bm7.LIZ()) {
            F4();
        } else {
            this.LLJJIJI.LIZ(LJJJJJL().LJJIL(new C1698300uIO(this, 1)).LJJJJZI(new AkS486S0100000_25(this, 4)).LJJIFFI().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 77)));
        }
        this.LLJJIJI.LIZ(LJJJJZI().LJJIFFI().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 78)));
        l0 l0VarHq = Hq();
        if (l0VarHq == null || (mutableLiveData = l0VarHq.LLJZ) == null) {
            return;
        }
        mutableLiveData.postValue(Boolean.TRUE);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        super.hide();
        if (C1631200sYA.LIZ(this.LLJJJJJIL)) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1649820t2C.class, new AwS265S0000000_25(19));
        } else {
            InterfaceC1649820t2C interfaceC1649820t2CEq = Eq();
            if (interfaceC1649820t2CEq != null) {
                interfaceC1649820t2CEq.tq2(false, false);
            }
        }
        A3().LJII(Boolean.FALSE);
        getPlanCUIApiComponent().OU1(O4());
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC1627140sRc interfaceC1627140sRcH4 = H4();
        if (interfaceC1627140sRcH4 != null) {
            interfaceC1627140sRcH4.es0();
        }
        super.onCreate();
        v5();
        k5();
        Z4();
        d5();
        T4();
        C5();
        n5();
        x5();
        FeedPropPinModel feedPropPinModel = this.LLJILLL.getShortVideoContext().creativeModel.feedPropPinModel;
        if (feedPropPinModel.effectId.length() > 0) {
            i3(new AwS604S0100000_25(feedPropPinModel, 441));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        MutableLiveData<Boolean> mutableLiveData;
        super.onDestroy();
        this.LLJJIJI.dispose();
        l0 l0VarHq = Hq();
        if (l0VarHq == null || (mutableLiveData = l0VarHq.LLJZ) == null) {
            return;
        }
        mutableLiveData.postValue(Boolean.FALSE);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        EnumC995040c06 enumC995040c06LJLZ;
        super.show();
        if (C1443960ngA.LJIIL(getShortVideoContext())) {
            enumC995040c06LJLZ = EnumC995040c06.WHITE;
        } else if (getShortVideoContext().shootMode == 24) {
            enumC995040c06LJLZ = LJJLIIIJ().LJLZ();
            if (enumC995040c06LJLZ == null) {
                enumC995040c06LJLZ = EnumC995040c06.WHITE;
            }
        } else {
            enumC995040c06LJLZ = EnumC995040c06.RED;
        }
        i3(new AwS604S0100000_25(enumC995040c06LJLZ, 442));
        if (C1631200sYA.LIZ(this.LLJJJJJIL)) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1649820t2C.class, new AwS265S0000000_25(20));
        } else {
            InterfaceC1649820t2C interfaceC1649820t2CEq = Eq();
            if (interfaceC1649820t2CEq != null) {
                interfaceC1649820t2CEq.tq2(true, false);
            }
        }
        A3().LJII(Boolean.TRUE);
        getPlanCUIApiComponent().oL0(O4());
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJI;
    }

    public final boolean P4(InterfaceC1626470sQX interfaceC1626470sQX) {
        if (interfaceC1626470sQX == null) {
            return false;
        }
        return this.LLJILLL.yq().C0().getStickerRepository().LJI().LIZ(C1629110sUn.LIZ(interfaceC1626470sQX));
    }

    public final <T> C11NZ<T> t5(C11NZ<T> c11nz, boolean z, T t) {
        if (z) {
            return c11nz.LJJLIL(t);
        }
        return c11nz;
    }

    public C1627150sRd(C19A3 c19a3, InterfaceC1626500sQa interfaceC1626500sQa, InterfaceC1626510sQb interfaceC1626510sQb, C1DRG c1drg, InterfaceC332600D2c interfaceC332600D2c) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = interfaceC1626500sQa;
        this.LLJJ = interfaceC1626510sQb;
        this.LLJJI = c1drg;
        this.LLJJIII = interfaceC332600D2c;
        this.LLJJIJI = new C11NJ();
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, OppoPermissionPopupMaskDelayExp.DEFAULT));
        this.LLJJJJJIL = (C1631190sY9) getDiContainer().LJIIL("lazyControlProgressConfig", C1631190sY9.class);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1626890sRD.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1627140sRc.class, null);
        this.LLJJLIIIJLLLLLLLZ = new InterfaceC1627270sRp() { // from class: X.0sRf
            @Override // X.InterfaceC1627270sRp
            public final void LIZ(InterfaceC1875007Wa interfaceC1875007Wa) {
                C1973007o8 c1973007o8;
                Bitmap bitmap;
                InterfaceC332600D2c interfaceC332600D2c2;
                if ((interfaceC1875007Wa instanceof C1973007o8) && (c1973007o8 = (C1973007o8) interfaceC1875007Wa) != null && (bitmap = c1973007o8.LIZ) != null && (interfaceC332600D2c2 = this.LIZ.LLJJIII) != null) {
                    interfaceC332600D2c2.tb2(((C1973007o8) interfaceC1875007Wa).LIZIZ, bitmap);
                }
            }
        };
    }
}
