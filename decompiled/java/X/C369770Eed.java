package X;

import com.bytedance.als.h0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS1S0000001_3;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Eed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369770Eed extends C0ETX<InterfaceC371300Eh6, C369700EeW, C07WO, C369760Eec> implements InterfaceC371300Eh6 {
    public static final int LLJLLIL = 8;
    public final C1DRG LLJJJJJIL;
    public final C358490E3r LLJJJJLIIL;
    public final h0<C375830EoP<Long>> LLJJL;
    public final Function0<C07WO> LLJJLIIIJLLLLLLLZ;
    public final Function0<C369760Eec> LLJL;
    public C369700EeW LLJLIL;
    public final C385670FAf<C375830EoP<Long>> LLJLILLLLZIIL;
    public final C01GW LLJLL;

    private final C369850Eel E5() {
        return (C369850Eel) this.LLJLL.getValue();
    }

    @Override // ge.i
    public Function0<C369700EeW> E3() {
        return new AwS549S0100000_5(this, 1665);
    }

    @Override // X.InterfaceC371300Eh6
    public void Qc() {
        C0E55 player;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (player = c0e48F4.getPlayer()) == null) {
            return;
        }
        player.LJJIII(E5());
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        Qc();
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        wf();
    }

    @Override // X.InterfaceC371300Eh6
    public void wf() {
        C0E55 player;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (player = c0e48F4.getPlayer()) == null) {
            return;
        }
        player.LJJ(E5());
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C07WO> o2() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C369760Eec> w2() {
        return this.LLJL;
    }

    @Override // X.InterfaceC371300Eh6
    public C385670FAf<C375830EoP<Long>> za() {
        return this.LLJLILLLLZIIL;
    }

    public final void H5(float f) {
        i3(new AwS1S0000001_3(f, 1));
    }

    public C369770Eed(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = c1drg;
        this.LLJJJJLIIL = new C358490E3r(F4());
        h0<C375830EoP<Long>> h0Var = new h0<>(null);
        this.LLJJL = h0Var;
        this.LLJJLIIIJLLLLLLLZ = AFwS189S0000000_3.get$arr$(1658);
        this.LLJL = new AwS549S0100000_5(this, 1664);
        this.LLJLILLLLZIIL = h0Var;
        this.LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1666));
    }
}
