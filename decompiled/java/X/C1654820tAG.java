package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import ge.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS265S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tAG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654820tAG extends i<InterfaceC1654860tAK, C11AX, C1654870tAL, C19456311Ab> implements InterfaceC1654860tAK, C0F1U, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final Function0<C1654870tAL> LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final Set<InterfaceC1654890tAN> LLJJJJJIL;
    public final Function0<C19456311Ab> LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1654820tAG.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1654820tAG.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1654820tAG.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1654820tAG.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1654820tAG.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1654820tAG.class, "vtSlotBottomApi", "getVtSlotBottomApi()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/ugctemplate/v2t/IVideoTemplateSlotBottomApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1654820tAG.class, "vtFlowApi", "getVtFlowApi()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/ugctemplate/v2t/VideoTemplateFlowApi;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
        LLJJLIIIJLLLLLLLZ = 8;
    }

    public final void F4() {
        this.LLJJIJIL = false;
        hide();
        if (!this.LLJJJJJIL.isEmpty()) {
            Iterator<T> it2 = this.LLJJJJJIL.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1654890tAN) it2.next()).g0();
            }
        } else if (Z4()) {
            k5(3, 0L);
        } else {
            d5(3, getShortVideoContext().cameraComponentModel.mMaxDuration, getShortVideoContext().cameraComponentModel.mMaxDuration);
        }
    }

    private final InterfaceC1649820t2C Eq() {
        return (InterfaceC1649820t2C) this.LLJJIJI.getValue(this, LLJJL[2]);
    }

    private final C1631190sY9 O4() {
        return (C1631190sY9) this.LLJJIII.getValue(this, LLJJL[1]);
    }

    private final InterfaceC531050KsB P4() {
        return (InterfaceC531050KsB) this.LLJJJJ.getValue(this, LLJJL[6]);
    }

    private final C0LFR T4() {
        return (C0LFR) this.LLJJJIL.getValue(this, LLJJL[5]);
    }

    private final a getPlanCUIApiComponent() {
        return (a) this.LLJJJ.getValue(this, LLJJL[4]);
    }

    @Override // X.InterfaceC1654860tAK
    public void Dq0() {
        i3(AFwS266S0000000_25.get$arr$(146));
    }

    public final void K4() {
        if (this.LLJJIJIL) {
            return;
        }
        this.LLJJIJIL = true;
        if (!C1631200sYA.LIZ(O4())) {
            Eq().W9(false);
        } else if (getDiContainer().LIZJ(InterfaceC1649820t2C.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1649820t2C.class, new AwS265S0000000_25(8));
        }
        P4().wK2(false, null);
        if (!this.LLJJJJJIL.isEmpty()) {
            Iterator<T> it2 = this.LLJJJJJIL.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1654890tAN) it2.next()).LLJJJIL();
            }
        } else {
            getRecordControlApi().bz(true);
            this.LLJJIJIL = true;
            C11NJ c11nj = C1653040t7O.LIZ;
            System.currentTimeMillis();
        }
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJJIJIIJIL.getValue(this, LLJJL[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJJI.getValue(this, LLJJL[0]);
    }

    private final boolean Z4() {
        return getShortVideoContext().shootMode == 16;
    }

    public final void H4() {
        hide();
        this.LLJJIJIL = false;
        if (!this.LLJJJJJIL.isEmpty()) {
            Iterator<T> it2 = this.LLJJJJJIL.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1654890tAN) it2.next()).LLLLZ();
            }
        }
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        super.hide();
        this.LLJJIJIL = false;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1654870tAL> o2() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19456311Ab> w2() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1654860tAK
    public void oD1(long j) {
        show();
        i3(AFwS266S0000000_25.get$arr$(147));
        C0LFR c0lfrT4 = T4();
        if (c0lfrT4 != null) {
            c0lfrT4.Xf2(false);
        }
    }

    @Override // X.InterfaceC1654860tAK
    public void vg1(InterfaceC1654890tAN interfaceC1654890tAN) {
        this.LLJJJJJIL.remove(interfaceC1654890tAN);
    }

    public C1654820tAG(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = AFwS214S0000000_25.get$arr$(148);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), C1631190sY9.class, "lazyControlProgressConfig");
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1649820t2C.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), C0LFR.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC531050KsB.class, null);
        this.LLJJJJJIL = new LinkedHashSet();
        this.LLJJJJLIIL = new AwS569S0100000_25(this, 298);
    }

    private final void k5(int i, long j) {
        hide();
        getRecordControlApi().bz(false);
        if (C1631200sYA.LIZ(O4())) {
            if (getDiContainer().LIZJ(InterfaceC1649820t2C.class)) {
                whenReadyOrThrowInternal(getDiContainer(), InterfaceC1649820t2C.class, new AwS265S0000000_25(9));
            }
        } else {
            Eq().W9(true);
        }
        AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 299);
        if (getPlanCUIApiComponent().LJ2() && getPlanCUIApiComponent().X80() != null) {
            Function1<Function0<Unit>, Unit> function1X80 = getPlanCUIApiComponent().X80();
            if (function1X80 != null) {
                function1X80.invoke(awS569S0100000_25);
                return;
            }
            return;
        }
        awS569S0100000_25.invoke();
    }

    @Override // X.InterfaceC1654860tAK
    public void x91(InterfaceC1654890tAN interfaceC1654890tAN, boolean z) {
        if (z) {
            this.LLJJJJJIL.clear();
        }
        this.LLJJJJJIL.add(interfaceC1654890tAN);
    }

    private final void d5(int i, long j, long j2) {
        getRecordControlApi().bz(false);
        getRecordControlApi().l60(new C1448290nn9(EnumC1448830no1.COUNT_DOWN, 3, j2, 8));
        InterfaceC1649820t2C interfaceC1649820t2C = (InterfaceC1649820t2C) getDiContainer().LJIIL(null, InterfaceC1649820t2C.class);
        if (interfaceC1649820t2C != null) {
            interfaceC1649820t2C.W9(true);
            interfaceC1649820t2C.tv(1);
            interfaceC1649820t2C.dd(true);
            interfaceC1649820t2C.T5();
        }
        getRecordControlApi().z80(j);
    }
}
