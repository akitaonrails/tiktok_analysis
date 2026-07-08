package X;

import Y.AfS194S0100000_25;
import androidx.lifecycle.LiveDataReactiveStreams;
import pyl.s;

/* JADX INFO: renamed from: X.0sjt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638470sjt extends AbstractC2255721DQs<InterfaceC577190MkP> implements InterfaceC577190MkP, InterfaceC379610EuV {
    public static final C1638490sjv LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1638550sk1.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1632360sa2.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1651080t4E.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1650930t3z.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576770Mjj.class, null);
    public final InterfaceC577190MkP LLJ = this;
    public final C11NJ LLJI = new C11NJ();
    public s LLJIJIL;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0sjv] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1638470sjt.class, "splitShootComponent", "getSplitShootComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1638470sjt.class, "recordGreenScreenUIComponent", "getRecordGreenScreenUIComponent()Lcom/ss/android/ugc/gamora/recorder/greenscreen/RecordGreenScreenUIApi;", 0), new C2217381BqS(C1638470sjt.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0), new C2217381BqS(C1638470sjt.class, "toolbarApi", "getToolbarApi()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/ToolbarApiComponent;", 0), new C2217381BqS(C1638470sjt.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C2217381BqS(C1638470sjt.class, "svcBottomAndPanelApiComponent", "getSvcBottomAndPanelApiComponent()Lcom/ss/android/ugc/gamora/recorder/voicechange/slideslip/SVCBottomAndPanelApiComponent;", 0), new C2217381BqS(C1638470sjt.class, "layoutStateComponent", "getLayoutStateComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutStateApiComponent;", 0)};
        LLJILJIL = new Object() { // from class: X.0sjv
        };
        LLJILLL = 8;
    }

    private final InterfaceC1650930t3z Cp() {
        return (InterfaceC1650930t3z) this.LLIZ.getValue(this, LLJILJILJ[5]);
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLILZLL.getValue(this, LLJILJILJ[4]);
    }

    private final InterfaceC576770Mjj X1() {
        return (InterfaceC576770Mjj) this.LLIZLLLIL.getValue(this, LLJILJILJ[6]);
    }

    private final InterfaceC1632360sa2 Z1() {
        return (InterfaceC1632360sa2) this.LLILLL.getValue(this, LLJILJILJ[1]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLILZ.getValue(this, LLJILJILJ[2]);
    }

    private final InterfaceC1651080t4E getToolbarApi() {
        return (InterfaceC1651080t4E) this.LLILZIL.getValue(this, LLJILJILJ[3]);
    }

    private final InterfaceC1638550sk1 o2() {
        return (InterfaceC1638550sk1) this.LLILLJJLI.getValue(this, LLJILJILJ[0]);
    }

    public final void Oa1() {
        InterfaceC1651490t4t interfaceC1651490t4tKY1;
        InterfaceC1638550sk1 interfaceC1638550sk1O2 = o2();
        if (interfaceC1638550sk1O2 != null) {
            interfaceC1638550sk1O2.JN0(false);
        }
        InterfaceC1638550sk1 interfaceC1638550sk1O22 = o2();
        if (interfaceC1638550sk1O22 != null) {
            interfaceC1638550sk1O22.mK(false);
        }
        InterfaceC1648020szI interfaceC1648020szIOp = Op();
        if (interfaceC1648020szIOp != null) {
            interfaceC1648020szIOp.showBottomTab(false);
        }
        InterfaceC1632360sa2 interfaceC1632360sa2Z1 = Z1();
        if (interfaceC1632360sa2Z1 != null) {
            interfaceC1632360sa2Z1.su0(EnumC993110bwz.LAYOUT_ON);
        }
        InterfaceC1649530t1j interfaceC1649530t1jLIZJ = getRecordAdapterApi().qR0().LIZJ();
        if (interfaceC1649530t1jLIZJ != null) {
            this.LLJIJIL = interfaceC1649530t1jLIZJ.R7().LJI();
            interfaceC1649530t1jLIZJ.jh(s.NORMAL);
            interfaceC1649530t1jLIZJ.Po0(false, EnumC993100bwy.LAYOUT_ON);
        } else {
            InterfaceC1651080t4E toolbarApi = getToolbarApi();
            if (toolbarApi != null && (interfaceC1651490t4tKY1 = toolbarApi.KY1()) != null) {
                C1651030t49.LIZ(interfaceC1651490t4tKY1, EnumC1651770t5L.SPEED, false);
            }
        }
        InterfaceC1650930t3z interfaceC1650930t3zCp = Cp();
        if (interfaceC1650930t3zCp != null) {
            interfaceC1650930t3zCp.Ub("");
        }
    }

    @Override // X.InterfaceC577190MkP
    public void b2() {
        InterfaceC1648020szI interfaceC1648020szIOp = Op();
        if (interfaceC1648020szIOp != null) {
            interfaceC1648020szIOp.showBottomTab(false);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C1628280sTS.LIZ("CameraLayoutCompatibilityComponent", "onCreate");
        this.LLJI.LIZ(C11NZ.LJJJJJ(LiveDataReactiveStreams.toPublisher(this, X1().r6())).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0sju
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return Boolean.valueOf(!(obj instanceof C579270Mnl));
            }
        }).LJJIFFI().LJJLJLI(new AfS194S0100000_25(this, 56)));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJI.dispose();
    }

    public final void qe() {
        InterfaceC1651490t4t interfaceC1651490t4tKY1;
        InterfaceC1638550sk1 interfaceC1638550sk1O2 = o2();
        if (interfaceC1638550sk1O2 != null) {
            interfaceC1638550sk1O2.mK(true);
        }
        InterfaceC1638550sk1 interfaceC1638550sk1O22 = o2();
        if (interfaceC1638550sk1O22 != null) {
            interfaceC1638550sk1O22.JN0(true);
        }
        InterfaceC1648020szI interfaceC1648020szIOp = Op();
        if (interfaceC1648020szIOp != null) {
            interfaceC1648020szIOp.showBottomTab(true);
        }
        InterfaceC1632360sa2 interfaceC1632360sa2Z1 = Z1();
        if (interfaceC1632360sa2Z1 != null) {
            interfaceC1632360sa2Z1.bu0(EnumC993110bwz.LAYOUT_ON);
        }
        InterfaceC1649530t1j interfaceC1649530t1jLIZJ = getRecordAdapterApi().qR0().LIZJ();
        if (interfaceC1649530t1jLIZJ != null) {
            interfaceC1649530t1jLIZJ.Po0(true, EnumC993100bwy.LAYOUT_ON);
            s sVar = this.LLJIJIL;
            if (sVar != null) {
                interfaceC1649530t1jLIZJ.jh(sVar);
                return;
            }
            return;
        }
        InterfaceC1651080t4E toolbarApi = getToolbarApi();
        if (toolbarApi == null || (interfaceC1651490t4tKY1 = toolbarApi.KY1()) == null) {
            return;
        }
        C1651030t49.LIZ(interfaceC1651490t4tKY1, EnumC1651770t5L.SPEED, true);
    }

    public InterfaceC577190MkP W1() {
        return this.LLJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1638470sjt(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
