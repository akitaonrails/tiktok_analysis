package X;

import com.bytedance.als.h0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS3S0000001_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Eea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369740Eea extends C0ETZ<InterfaceC370450Efj, C369710EeX, C07WN, C369750Eeb> implements InterfaceC370450Efj {
    public static final int LLJJJJ = 8;
    public final C1DRG LLJJI;
    public final C358490E3r LLJJIII;
    public final h0<C375830EoP<Long>> LLJJIJI;
    public final Function0<C07WN> LLJJIJIIJIL;
    public final Function0<C369750Eeb> LLJJIJIL;
    public final C385670FAf<C375830EoP<Long>> LLJJJ;
    public final C01GW LLJJJIL;

    private final C369860Eem H4() {
        return (C369860Eem) this.LLJJJIL.getValue();
    }

    @Override // X.InterfaceC370450Efj
    public void Qc() {
        C0E55 player;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (player = c0e48F4.getPlayer()) == null) {
            return;
        }
        player.LJJIII(H4());
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        Qc();
    }

    @Override // X.InterfaceC370450Efj
    public void wf() {
        C0E55 player;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (player = c0e48F4.getPlayer()) == null) {
            return;
        }
        player.LJJ(H4());
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C07WN> o2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C369750Eeb> w2() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC370450Efj
    public C385670FAf<C375830EoP<Long>> za() {
        return this.LLJJJ;
    }

    public final void K4(float f) {
        i3(new AwS3S0000001_5(f, 19));
    }

    public C369740Eea(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c1drg;
        this.LLJJIII = new C358490E3r(F4());
        h0<C375830EoP<Long>> h0Var = new h0<>(null);
        this.LLJJIJI = h0Var;
        this.LLJJIJIIJIL = AFwS191S0000000_5.get$arr$(297);
        this.LLJJIJIL = new AwS549S0100000_5(this, 1070);
        this.LLJJJ = h0Var;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1071));
    }
}
