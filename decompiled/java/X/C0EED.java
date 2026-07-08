package X;

import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.StylePrompt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EED, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EED extends C0ETZ<InterfaceC376280Ep8, C0EE2, C0EEA, C0EE9> implements InterfaceC376280Ep8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public final C19A3 LLJJI;
    public final C1DRG LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final Function0<C0EE2> LLJJIJIIJIL;
    public final Function0<C0EEA> LLJJIJIL;
    public final Function0<C0EE9> LLJJJ;
    public final h0<C0EEF> LLJJJIL;
    public final C01GW LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EED.class, "editingTextApi", "getEditingTextApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/edittext/EPAIGCEditTextApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJLIIL = 8;
    }

    public final void LIZLLL() {
        AE(false);
    }

    private final C0EE2 K4() {
        return (C0EE2) this.LLJJJJ.getValue();
    }

    public final InterfaceC379090Etf H4() {
        return (InterfaceC379090Etf) this.LLJJIJI.getValue(this, LLJJJJJIL[0]);
    }

    @Override // X.InterfaceC376280Ep8
    public C0EEF IR1() {
        return this.LLJJJIL.LIZJ();
    }

    @Override // X.InterfaceC376280Ep8
    public boolean D3() {
        if (!isShowing()) {
            return false;
        }
        LIZLLL();
        return true;
    }

    @Override // ge.i
    public Function0<C0EE2> E3() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIII;
    }

    public final C19A3 getParentScene() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EEA> o2() {
        return this.LLJJIJIL;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    @Override // X.InterfaceC376280Ep8
    public C385670FAf<C0EEF> rl0() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0EE9> w2() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC376280Ep8
    public void AE(boolean z) {
        if (z) {
            show();
        } else {
            H4().Tw2();
            hide();
        }
    }

    @Override // X.InterfaceC376280Ep8
    public void tK(C0EEF c0eef) {
        i3(new AwS584S0100000_5(c0eef, 284));
        this.LLJJJIL.LJII(c0eef);
    }

    public C0EED(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c19a3;
        this.LLJJIII = c1drg;
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379090Etf.class, null);
        this.LLJJIJIIJIL = AFwS191S0000000_5.get$arr$(99);
        this.LLJJIJIL = AFwS191S0000000_5.get$arr$(98);
        this.LLJJJ = new AwS549S0100000_5(this, 281);
        this.LLJJJIL = new h0<>(null);
        this.LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 280));
    }

    public final void O4(StylePrompt stylePrompt, String str, String str2, Integer num) {
        this.LLJJJIL.LJII(new C0EEF(stylePrompt, str, str2, num));
        i3(new AwS56S1000000_5(str, 8));
    }
}
