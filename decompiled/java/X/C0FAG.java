package X;

import com.bytedance.als.h0;
import ge.i;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FAG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FAG extends i<C0FAH, C0FAC, C0FAE, C0FAF> implements InterfaceC379610EuV, C0FAH {
    public static final int LLJJIJIIJIL = 8;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final h0<C385490F9n> LLJJ;
    public final C385670FAf<C385490F9n> LLJJI;
    public final Function0<C0FAE> LLJJIII;
    public final Function0<C0FAF> LLJJIJI;

    @Override // X.C0FAH
    public C385670FAf<C385490F9n> g31() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0FAE> o2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0FAF> w2() {
        return this.LLJJIJI;
    }

    @Override // X.C0FAH
    public void oO2(List<C385490F9n> list) {
        i3(new AwS584S0100000_5(list, (List<Pair<Long, Float>>) 1221));
    }

    public C0FAG(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        h0<C385490F9n> h0Var = new h0<>(null);
        this.LLJJ = h0Var;
        this.LLJJI = h0Var;
        this.LLJJIII = AFwS191S0000000_5.get$arr$(427);
        this.LLJJIJI = new AwS549S0100000_5(this, 1687);
    }
}
