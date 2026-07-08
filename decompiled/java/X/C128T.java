package X;

import com.bytedance.als.LiveEvent;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.128T, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C128T extends i<C0EOZ, C128M, C128Q, C128R> implements InterfaceC379610EuV, C0EOZ {
    public static final int LLJJIJI = 8;
    public final C1DRG LLJILJILJ;
    public final Function0<C128Q> LLJILLL;
    public final Function0<C128R> LLJJ;
    public final C385670FAf<Boolean> LLJJI;
    public LiveEvent<Boolean> LLJJIII;

    @Override // X.C0EOZ
    public void Rx2() {
        i3(AFwS273S0000000_29.get$arr$(3));
    }

    @Override // X.C0EOZ
    public void gK2() {
        i3(AFwS273S0000000_29.get$arr$(4));
    }

    @Override // X.C0EOZ
    public boolean e9() {
        return T2().LIZJ;
    }

    @Override // X.C0EOZ
    public void li() {
        show();
        i3(AFwS273S0000000_29.get$arr$(5));
    }

    @Override // X.C0EOZ
    public LiveEvent<Boolean> Zg0() {
        return this.LLJJIII;
    }

    @Override // X.C0EOZ
    public C385670FAf<Boolean> dU0() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C128Q> o2() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C128R> w2() {
        return this.LLJJ;
    }

    public void F4(LiveEvent<Boolean> liveEvent) {
        this.LLJJIII = liveEvent;
    }

    @Override // X.C0EOZ
    public void Ui0(boolean z) {
        i3(AFwS273S0000000_29.get$arr$(6));
    }

    public C128T(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = AFwS218S0000000_29.get$arr$(11);
        this.LLJJ = new AwS573S0100000_29(this, 14);
        this.LLJJI = Z1(new C2217381BqS() { // from class: X.128S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C128Q) obj).LIZJ);
            }
        });
        this.LLJJIII = new C560530Lyd();
    }
}
