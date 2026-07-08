package X;

import X.AbstractC1664490tPr;
import X.C05YF;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import ge.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0tOV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1663650tOV<API_COMPONENT extends C05YF, SCENE extends AbstractC1664490tPr<STATE, ACTION>, STATE, ACTION> extends i<API_COMPONENT, SCENE, STATE, ACTION> implements InterfaceC379610EuV, InterfaceC1652230t65 {
    public static final C1663740tOe LLJZ = new Object() { // from class: X.0tOe
    };
    public static final int LLJZIJLIL = 8;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final String LLJJ;
    public InterfaceC1648570t0B LLJJI;
    public InterfaceC1650230t2r LLJJIII;
    public a LLJJIJI;
    public InterfaceC1628590sTx LLJJIJIIJIL;
    public InterfaceC1648870t0f LLJJIJIL;
    public InterfaceC1648020szI LLJJJ;
    public ShortVideoContext LLJJJIL;
    public q LLJJJJ;
    public InterfaceC1642740sqm LLJJJJJIL;
    public InterfaceC1648510t05 LLJJJJLIIL;
    public l0 LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    public void Xi() {
    }

    public void k5() {
    }

    public final void v5(String str, Throwable th) {
    }

    private final void D5() {
        if (this.LLJLL) {
            return;
        }
        InterfaceC524950KiL interfaceC524950KiLO4 = O4();
        if (interfaceC524950KiLO4 != null) {
            interfaceC524950KiLO4.kF(F4());
        }
        this.LLJLL = true;
    }

    private final InterfaceC362610EJn F4() {
        return (InterfaceC362610EJn) this.LLJLLL.getValue();
    }

    private final InterfaceC524950KiL O4() {
        return (InterfaceC524950KiL) this.LLJLLIL.getValue();
    }

    private final C560530Lyd<C1650900t3w> T4() {
        return (C560530Lyd) this.LLJLILLLLZIIL.getValue();
    }

    public final InterfaceC1628590sTx H4() {
        InterfaceC1628590sTx interfaceC1628590sTx = this.LLJJIJIIJIL;
        if (interfaceC1628590sTx != null) {
            return interfaceC1628590sTx;
        }
        return null;
    }

    public final InterfaceC1648870t0f K4() {
        InterfaceC1648870t0f interfaceC1648870t0f = this.LLJJIJIL;
        if (interfaceC1648870t0f != null) {
            return interfaceC1648870t0f;
        }
        return null;
    }

    public final InterfaceC1648020szI Op() {
        InterfaceC1648020szI interfaceC1648020szI = this.LLJJJ;
        if (interfaceC1648020szI != null) {
            return interfaceC1648020szI;
        }
        return null;
    }

    public final InterfaceC1642740sqm P4() {
        InterfaceC1642740sqm interfaceC1642740sqm = this.LLJJJJJIL;
        if (interfaceC1642740sqm != null) {
            return interfaceC1642740sqm;
        }
        return null;
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        InterfaceC1650230t2r interfaceC1650230t2r = this.LLJJIII;
        if (interfaceC1650230t2r != null) {
            return interfaceC1650230t2r;
        }
        return null;
    }

    public final a getPlanCUIApiComponent() {
        a aVar = this.LLJJIJI;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        InterfaceC1648570t0B interfaceC1648570t0B = this.LLJJI;
        if (interfaceC1648570t0B != null) {
            return interfaceC1648570t0B;
        }
        return null;
    }

    public final ShortVideoContext getShortVideoContext() {
        ShortVideoContext shortVideoContext = this.LLJJJIL;
        if (shortVideoContext != null) {
            return shortVideoContext;
        }
        return null;
    }

    public final q getStickerApiComponent() {
        q qVar = this.LLJJJJ;
        if (qVar != null) {
            return qVar;
        }
        return null;
    }

    private final void J6() {
        InterfaceC524950KiL interfaceC524950KiLO4 = O4();
        if (interfaceC524950KiLO4 != null) {
            interfaceC524950KiLO4.b8(F4());
        }
        this.LLJLL = false;
    }

    public LiveEvent<C1650900t3w> Ab0() {
        return T4();
    }

    public boolean C5() {
        if (!Fh()) {
            return false;
        }
        Ub("");
        return true;
    }

    public final boolean Z4() {
        return C5();
    }

    public void d5() {
        S5((InterfaceC1648570t0B) getDiContainer().LJII(InterfaceC1648570t0B.class, null));
        H5((InterfaceC1650230t2r) getDiContainer().LJII(InterfaceC1650230t2r.class, null));
        xJ0((a) getDiContainer().LJII(a.class, null));
        n72((InterfaceC1628590sTx) getDiContainer().LJII(InterfaceC1628590sTx.class, null));
        GM1((InterfaceC1648870t0f) getDiContainer().LJII(InterfaceC1648870t0f.class, null));
        eH1((InterfaceC1648020szI) getDiContainer().LJII(InterfaceC1648020szI.class, null));
        m6((ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null));
        u6((q) getDiContainer().LJII(q.class, null));
        U5((InterfaceC1642740sqm) getDiContainer().LJII(InterfaceC1642740sqm.class, null));
        this.LLJJJJLIIL = (InterfaceC1648510t05) getDiContainer().LJIIL(null, InterfaceC1648510t05.class);
        this.LLJJL = (l0) getDiContainer().LJIIL(null, l0.class);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public final void hide() {
        super.hide();
        this.LLJJLIIIJLLLLLLLZ = false;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        d5();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJLIL = true;
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        this.LLJL = true;
        J6();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        this.LLJL = false;
        D5();
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public final void show() {
        super.show();
        this.LLJJLIIIJLLLLLLLZ = true;
    }

    public boolean Fh() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final InterfaceC1648510t05 getGestureApiComponent() {
        return this.LLJJJJLIIL;
    }

    public final l0 getRecordStickerLogicComponent() {
        return this.LLJJL;
    }

    public final boolean n5() {
        return this.LLJLIL;
    }

    public final boolean t5() {
        return this.LLJL;
    }

    public final void E5(Function1<? super STATE, ? extends STATE> function1) {
        if (C371410EhH.LIZ()) {
            i3(function1);
        } else {
            c3(function1);
        }
    }

    public final void GM1(InterfaceC1648870t0f interfaceC1648870t0f) {
        this.LLJJIJIL = interfaceC1648870t0f;
    }

    public final void H5(InterfaceC1650230t2r interfaceC1650230t2r) {
        this.LLJJIII = interfaceC1650230t2r;
    }

    public final void M5(InterfaceC1648510t05 interfaceC1648510t05) {
        this.LLJJJJLIIL = interfaceC1648510t05;
    }

    public final void N5(boolean z) {
        this.LLJLIL = z;
    }

    public final void R5(boolean z) {
        this.LLJL = z;
    }

    public final void S5(InterfaceC1648570t0B interfaceC1648570t0B) {
        this.LLJJI = interfaceC1648570t0B;
    }

    public final void U5(InterfaceC1642740sqm interfaceC1642740sqm) {
        this.LLJJJJJIL = interfaceC1642740sqm;
    }

    @Override // X.InterfaceC1652230t65
    public void Ub(String str) {
        hide();
    }

    public final void d6(l0 l0Var) {
        this.LLJJL = l0Var;
    }

    public final void eH1(InterfaceC1648020szI interfaceC1648020szI) {
        this.LLJJJ = interfaceC1648020szI;
    }

    public final void m6(ShortVideoContext shortVideoContext) {
        this.LLJJJIL = shortVideoContext;
    }

    public final void n72(InterfaceC1628590sTx interfaceC1628590sTx) {
        this.LLJJIJIIJIL = interfaceC1628590sTx;
    }

    public final void u6(q qVar) {
        this.LLJJJJ = qVar;
    }

    public final void xJ0(a aVar) {
        this.LLJJIJI = aVar;
    }

    public AbstractC1663650tOV(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("zxzzz_");
        sbLIZ.append(getClass().getSimpleName());
        this.LLJJ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(329));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS569S0100000_25((AbstractC1663650tOV) this, 677));
        this.LLJLLL = C452501pT.LIZIZ(new AwS569S0100000_25((AbstractC1663650tOV) this, 676));
    }

    @Override // X.InterfaceC1652230t65
    public void yo(String str, String str2) {
        show();
    }

    public static /* synthetic */ void x5(AbstractC1663650tOV abstractC1663650tOV, String str, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                th = null;
            }
            abstractC1663650tOV.v5(str, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logD");
    }
}
