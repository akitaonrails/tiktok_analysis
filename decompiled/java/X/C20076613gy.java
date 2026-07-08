package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS609S0100000_30;
import p2.j1;

/* JADX INFO: renamed from: X.13gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20076613gy extends AbstractC20055413dY implements InterfaceC1697480uH4, InterfaceC20076713gz, InterfaceC20056813dm {
    public static final /* synthetic */ int LLJJJ = 0;
    public final Function2<Object, ? super C1378605aS, Unit> LLJJ;
    public final Function1<C20078813hK, InterfaceC20076713gz> LLJJI;
    public final C20079213hO LLJJIII;
    public C20076613gy LLJJIJI;
    public InterfaceC20076713gz LLJJIJIIJIL;
    public long LLJJIJIL;

    public C20076613gy() {
        this(0);
    }

    @Override // X.InterfaceC20056813dm
    public final /* synthetic */ void LLFF(j1 j1Var) {
    }

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        this.LLJJIJIIJIL = null;
        this.LLJJIJI = null;
    }

    @Override // X.InterfaceC1697480uH4
    public final Object LJJIJLIJ() {
        return this.LLJJIII;
    }

    public C20076613gy(int i) {
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = C20079213hO.LIZ;
        this.LLJJIJIL = 0L;
    }

    @Override // X.InterfaceC20076713gz
    public final void LJJJI(C20078813hK c20078813hK) {
        InterfaceC20076713gz interfaceC20076713gz = this.LLJJIJIIJIL;
        if (interfaceC20076713gz != null) {
            interfaceC20076713gz.LJJJI(c20078813hK);
        }
        C20076613gy c20076613gy = this.LLJJIJI;
        if (c20076613gy != null) {
            c20076613gy.LJJJI(c20078813hK);
        }
        this.LLJJIJI = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    @Override // X.InterfaceC20076713gz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLL(X.C20078813hK r5) {
        /*
            r4 = this;
            X.13gy r3 = r4.LLJJIJI
            if (r3 == 0) goto L56
            long r0 = X.C20077013h2.LIZ(r5)
            boolean r1 = X.C20075213gk.LIZ(r3, r0)
            r0 = 1
            if (r1 != r0) goto L56
            r0 = r3
        L10:
            if (r0 == 0) goto L24
            if (r3 != 0) goto L34
            r0.LLIIIL(r5)
            r0.LJJJLL(r5)
            X.13gz r1 = r4.LLJJIJIIJIL
            if (r1 == 0) goto L21
            r1.LJJJI(r5)
        L21:
            r4.LLJJIJI = r0
            return
        L24:
            if (r3 == 0) goto L34
            X.13gz r1 = r4.LLJJIJIIJIL
            if (r1 == 0) goto L30
            r1.LLIIIL(r5)
            r1.LJJJLL(r5)
        L30:
            r3.LJJJI(r5)
            goto L21
        L34:
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r1 != 0) goto L48
            if (r0 == 0) goto L42
            r0.LLIIIL(r5)
            r0.LJJJLL(r5)
        L42:
            if (r3 == 0) goto L21
            r3.LJJJI(r5)
            goto L21
        L48:
            if (r0 == 0) goto L4e
            r0.LJJJLL(r5)
            goto L21
        L4e:
            X.13gz r1 = r4.LLJJIJIIJIL
            if (r1 == 0) goto L21
            r1.LJJJLL(r5)
            goto L21
        L56:
            X.13dY r0 = r4.LL
            boolean r0 = r0.LLJILLL
            if (r0 != 0) goto L60
            r0 = 0
        L5d:
            X.13gy r0 = (X.C20076613gy) r0
            goto L10
        L60:
            X.00zU r2 = new X.00zU
            r2.<init>()
            kotlin.jvm.internal.AwS239S0300000_30 r1 = new kotlin.jvm.internal.AwS239S0300000_30
            r0 = 15
            r1.<init>(r2, r4, r5, r0)
            X.C20050913cp.LIZJ(r4, r1)
            T r0 = r2.element
            X.0uH4 r0 = (X.InterfaceC1697480uH4) r0
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20076613gy.LJJJLL(X.13hK):void");
    }

    @Override // X.InterfaceC20056813dm
    public final void LJJLJ(long j) {
        this.LLJJIJIL = j;
    }

    @Override // X.InterfaceC20076713gz
    public final void LJJZ(C20078813hK c20078813hK) {
        AwS609S0100000_30 awS609S0100000_30 = new AwS609S0100000_30(c20078813hK, 303);
        if (awS609S0100000_30.invoke(this) == EnumC20045413bw.ContinueTraversal) {
            C20050913cp.LIZJ(this, awS609S0100000_30);
        }
    }

    @Override // X.InterfaceC20076713gz
    public final boolean LJJZZIII(C20078813hK c20078813hK) {
        C20076613gy c20076613gy = this.LLJJIJI;
        if (c20076613gy == null) {
            InterfaceC20076713gz interfaceC20076713gz = this.LLJJIJIIJIL;
            if (interfaceC20076713gz != null) {
                return interfaceC20076713gz.LJJZZIII(c20078813hK);
            }
            return false;
        }
        return c20076613gy.LJJZZIII(c20078813hK);
    }

    @Override // X.InterfaceC20076713gz
    public final void LJLL(C20078813hK c20078813hK) {
        InterfaceC20076713gz interfaceC20076713gz = this.LLJJIJIIJIL;
        if (interfaceC20076713gz == null) {
            C20076613gy c20076613gy = this.LLJJIJI;
            if (c20076613gy != null) {
                c20076613gy.LJLL(c20078813hK);
                return;
            }
            return;
        }
        interfaceC20076713gz.LJLL(c20078813hK);
    }

    @Override // X.InterfaceC20076713gz
    public final void LLIIIL(C20078813hK c20078813hK) {
        InterfaceC20076713gz interfaceC20076713gz = this.LLJJIJIIJIL;
        if (interfaceC20076713gz == null) {
            C20076613gy c20076613gy = this.LLJJIJI;
            if (c20076613gy != null) {
                c20076613gy.LLIIIL(c20078813hK);
                return;
            }
            return;
        }
        interfaceC20076713gz.LLIIIL(c20078813hK);
    }
}
