package X;

import com.ss.android.ugc.IFcpReduxService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0Rim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703580Rim {
    public InterfaceC1449905lx<C703730Rj1> LIZ;
    public InterfaceC703670Riv<C703730Rj1> LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(526));

    public final C703730Rj1 LIZIZ() {
        C703730Rj1 state;
        if (C299840Bp8.LIZ()) {
            InterfaceC1449905lx<C703730Rj1> interfaceC1449905lx = this.LIZ;
            if (interfaceC1449905lx == null) {
                return null;
            }
            state = interfaceC1449905lx.getState();
        } else {
            InterfaceC703670Riv<C703730Rj1> interfaceC703670Riv = this.LIZIZ;
            if (interfaceC703670Riv == null) {
                return null;
            }
            state = interfaceC703670Riv.getState();
        }
        return state;
    }

    public final void LIZ(final InterfaceC703750Rj3 interfaceC703750Rj3, final String str) {
        Function1<InterfaceC700750ReD, InterfaceC700750ReD> function1LIZ;
        Function1<InterfaceC1445905lJ, InterfaceC1445905lJ> function1LIZ2;
        if (C299840Bp8.LIZ()) {
            InterfaceC1449905lx<C703730Rj1> interfaceC1449905lx = this.LIZ;
            if (interfaceC1449905lx != null && (function1LIZ2 = interfaceC1449905lx.LIZ()) != null) {
                function1LIZ2.invoke(new InterfaceC1452605mO(interfaceC703750Rj3, str) { // from class: X.0Rin
                    public final InterfaceC703750Rj3 LIZ;
                    public final String LIZIZ;

                    @Override // X.InterfaceC1452705mP
                    public final /* bridge */ /* synthetic */ Object getData() {
                        return this.LIZ;
                    }

                    @Override // X.InterfaceC1452505mN
                    public final /* bridge */ /* synthetic */ String getType() {
                        return this.LIZIZ;
                    }

                    {
                        this.LIZ = interfaceC703750Rj3;
                        this.LIZIZ = str;
                    }
                });
                return;
            }
            return;
        }
        InterfaceC703670Riv<C703730Rj1> interfaceC703670Riv = this.LIZIZ;
        if (interfaceC703670Riv == null || (function1LIZ = interfaceC703670Riv.LIZ()) == null) {
            return;
        }
        function1LIZ.invoke(new InterfaceC700750ReD(interfaceC703750Rj3, str) { // from class: X.0Rj4
            public final InterfaceC703750Rj3 LIZ;
            public final String LIZIZ;

            @Override // X.InterfaceC700750ReD
            public final /* bridge */ /* synthetic */ Object getData() {
                return this.LIZ;
            }

            @Override // X.InterfaceC702480Rh0
            public final /* bridge */ /* synthetic */ String getType() {
                return this.LIZIZ;
            }

            {
                this.LIZ = interfaceC703750Rj3;
                this.LIZIZ = str;
            }
        });
    }

    public final Function0 LIZJ(C2217371BqR c2217371BqR, Function0 function0, Function1 function1) {
        IFcpReduxService iFcpReduxService;
        if (C299840Bp8.LIZ()) {
            InterfaceC1449905lx<C703730Rj1> interfaceC1449905lx = this.LIZ;
            if (interfaceC1449905lx != null && (iFcpReduxService = (IFcpReduxService) this.LIZJ.getValue()) != null) {
                return iFcpReduxService.LIZLLL(interfaceC1449905lx, new C2217481Bqc(c2217371BqR), function1);
            }
            return null;
        }
        InterfaceC703670Riv<C703730Rj1> interfaceC703670Riv = this.LIZIZ;
        if (interfaceC703670Riv != null) {
            return C703690Rix.LIZ(interfaceC703670Riv, c2217371BqR, function0);
        }
        return null;
    }
}
