package X;

import Y.AObjectS246S0100000_25;
import com.bytedance.als.LiveEvent;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0swJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646170swJ extends AbstractC2255721DQs<InterfaceC1646010sw3> implements InterfaceC1646010sw3, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1649820t2C.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1646220swO.class, null);
    public final InterfaceC1650230t2r LLILZIL = (InterfaceC1650230t2r) getDiContainer().LJII(InterfaceC1650230t2r.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(211));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 402));
    public final InterfaceC1441305kZ<C1646150swH> LLIZLLLIL = new AObjectS246S0100000_25(this, 283);
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(210));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 403));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1646170swJ.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1646170swJ.class, "changeCameraSpecApiComponent", "getChangeCameraSpecApiComponent()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJILJIL = 8;
    }

    public C1646170swJ W1() {
        return this;
    }

    private final InterfaceC1646220swO Kp() {
        return (InterfaceC1646220swO) this.LLILZ.getValue(this, LLJIJIL[1]);
    }

    public final InterfaceC1649820t2C Eq() {
        return (InterfaceC1649820t2C) this.LLILLL.getValue(this, LLJIJIL[0]);
    }

    public final Scene G2() {
        return (Scene) this.LLJI.getValue();
    }

    public final String X1() {
        return (String) this.LLJ.getValue();
    }

    public final InterfaceC1441305kZ<Boolean> o2() {
        return (InterfaceC1441305kZ) this.LLIZ.getValue();
    }

    public final Keva w2() {
        return (Keva) this.LLILZLL.getValue();
    }

    public final boolean Z1() {
        return w2().getBoolean(X1(), false);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (Z1()) {
            return;
        }
        this.LL.add(R.id.mj7, G2(), "PhotoSwapEducationScene");
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        w2().storeBoolean(X1(), true);
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        LiveEvent<C1646150swH> liveEventMr1;
        C385670FAf<Boolean> c385670FAfJR0;
        super.onPause();
        InterfaceC1649820t2C interfaceC1649820t2CEq = Eq();
        if (interfaceC1649820t2CEq != null) {
            interfaceC1649820t2CEq.W9(true);
        }
        InterfaceC1649820t2C interfaceC1649820t2CEq2 = Eq();
        if (interfaceC1649820t2CEq2 != null && (c385670FAfJR0 = interfaceC1649820t2CEq2.JR0()) != null) {
            c385670FAfJR0.LIZIZ(o2());
        }
        InterfaceC1646220swO interfaceC1646220swOKp = Kp();
        if (interfaceC1646220swOKp == null || (liveEventMr1 = interfaceC1646220swOKp.Mr1()) == null) {
            return;
        }
        liveEventMr1.LIZIZ(this.LLIZLLLIL);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        LiveEvent<C1646150swH> liveEventMr1;
        C385670FAf<Boolean> c385670FAfJR0;
        super.onResume();
        if (Z1()) {
            return;
        }
        InterfaceC1649820t2C interfaceC1649820t2CEq = Eq();
        if (interfaceC1649820t2CEq != null) {
            interfaceC1649820t2CEq.W9(false);
        }
        InterfaceC1649820t2C interfaceC1649820t2CEq2 = Eq();
        if (interfaceC1649820t2CEq2 != null && (c385670FAfJR0 = interfaceC1649820t2CEq2.JR0()) != null) {
            c385670FAfJR0.LIZ(this, o2());
        }
        InterfaceC1646220swO interfaceC1646220swOKp = Kp();
        if (interfaceC1646220swOKp == null || (liveEventMr1 = interfaceC1646220swOKp.Mr1()) == null) {
            return;
        }
        liveEventMr1.LIZ(this, this.LLIZLLLIL);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C1646170swJ(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }
}
