package X;

import com.ss.android.ugc.IFcpReduxService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0Rg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701860Rg0 {
    public InterfaceC703670Riv<C700730ReB> LIZ;
    public InterfaceC1449905lx<C700730ReB> LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(491));

    public final C700730ReB LIZIZ() {
        if (C299840Bp8.LIZ()) {
            InterfaceC1449905lx<C700730ReB> interfaceC1449905lx = this.LIZIZ;
            if (interfaceC1449905lx != null) {
                return interfaceC1449905lx.getState();
            }
            return null;
        }
        InterfaceC703670Riv<C700730ReB> interfaceC703670Riv = this.LIZ;
        if (interfaceC703670Riv != null) {
            return interfaceC703670Riv.getState();
        }
        return null;
    }

    public final void LIZ(final Object obj, final String str) {
        Function1<InterfaceC700750ReD, InterfaceC700750ReD> function1LIZ;
        Function1<InterfaceC1445905lJ, InterfaceC1445905lJ> function1LIZ2;
        if (C299840Bp8.LIZ()) {
            InterfaceC1449905lx<C700730ReB> interfaceC1449905lx = this.LIZIZ;
            if (interfaceC1449905lx != null && (function1LIZ2 = interfaceC1449905lx.LIZ()) != null) {
                function1LIZ2.invoke(new InterfaceC1452605mO(obj, str) { // from class: X.0Rh4
                    public final Object LIZ;
                    public final String LIZIZ;

                    @Override // X.InterfaceC1452705mP
                    public final Object getData() {
                        return this.LIZ;
                    }

                    @Override // X.InterfaceC1452505mN
                    public final /* bridge */ /* synthetic */ String getType() {
                        return this.LIZIZ;
                    }

                    {
                        this.LIZ = obj;
                        this.LIZIZ = str;
                    }
                });
                return;
            }
            return;
        }
        InterfaceC703670Riv<C700730ReB> interfaceC703670Riv = this.LIZ;
        if (interfaceC703670Riv == null || (function1LIZ = interfaceC703670Riv.LIZ()) == null) {
            return;
        }
        function1LIZ.invoke(new InterfaceC700750ReD(obj, str) { // from class: X.0Rh9
            public final Object LIZ;
            public final String LIZIZ;

            @Override // X.InterfaceC700750ReD
            public final Object getData() {
                return this.LIZ;
            }

            @Override // X.InterfaceC702480Rh0
            public final /* bridge */ /* synthetic */ String getType() {
                return this.LIZIZ;
            }

            {
                this.LIZ = obj;
                this.LIZIZ = str;
            }
        });
    }

    public final Function0 LIZJ(C2217381BqS c2217381BqS, Function0 function0, Function1 function1) {
        IFcpReduxService iFcpReduxService;
        if (C299840Bp8.LIZ()) {
            InterfaceC1449905lx<C700730ReB> interfaceC1449905lx = this.LIZIZ;
            if (interfaceC1449905lx != null && (iFcpReduxService = (IFcpReduxService) this.LIZJ.getValue()) != null) {
                return iFcpReduxService.LIZLLL(interfaceC1449905lx, new C2217481Bqc(c2217381BqS), function1);
            }
            return null;
        }
        InterfaceC703670Riv<C700730ReB> interfaceC703670Riv = this.LIZ;
        if (interfaceC703670Riv != null) {
            return C703690Rix.LIZ(interfaceC703670Riv, c2217381BqS, function0);
        }
        return null;
    }
}
