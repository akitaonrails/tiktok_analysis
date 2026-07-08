package X;

import com.bytedance.als.LiveEvent;
import com.bytedance.als.ui.state.LiveState;
import ge.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12CD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12CD extends i<InterfaceC19714512Bj, C12C6, C12CA, C12CG> {
    public static final int LLJJI = 8;
    public final Function0<C12CA> LLJILJILJ;
    public final Function0<C12CG> LLJILLL;
    public final InterfaceC19714512Bj LLJJ;

    public final void H4() {
        C560530Lyd c560530Lyd;
        LiveEvent<Unit> liveEventAk = this.LLJJ.ak();
        if (!(liveEventAk instanceof C560530Lyd) || (c560530Lyd = (C560530Lyd) liveEventAk) == null) {
            return;
        }
        c560530Lyd.LJIIJ(Unit.LIZ);
    }

    public final void K4() {
        if (T2().LIZ) {
            i3(new AwS608S0100000_29(this, 244));
        } else {
            i3(new AwS608S0100000_29(this, 245));
        }
    }

    public InterfaceC19714512Bj F4() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12CA> o2() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12CG> w2() {
        return this.LLJILLL;
    }

    public C12CD(C19A3 c19a3) {
        super(c19a3);
        this.LLJILJILJ = AFwS218S0000000_29.get$arr$(186);
        this.LLJILLL = new AwS573S0100000_29(this, 288);
        this.LLJJ = new InterfaceC19714512Bj() { // from class: X.12CC
            public final LiveEvent<Unit> LL = new C560530Lyd();

            @Override // X.InterfaceC19714512Bj
            public LiveState<Boolean> isFullScreen() {
                return this.LLILLJJLI.Z1(new C2217381BqS() { // from class: X.12CB
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C12CA) obj).LIZ);
                    }
                });
            }

            @Override // X.InterfaceC19714512Bj
            public LiveEvent<Unit> ak() {
                return this.LL;
            }
        };
    }
}
