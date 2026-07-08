package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0a0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918560a0k {
    public final InterfaceC918550a0j LIZ;
    public final InterfaceC918590a0n LIZIZ;
    public final Function1<C918350a0P, Unit> LIZJ;
    public final Function1<C918350a0P, Unit> LIZLLL;

    public static void LIZ(C918350a0P c918350a0P, C918610a0p c918610a0p) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invite precheck state=");
        sbLIZ.append(c918610a0p.LIZ);
        sbLIZ.append(" reason=");
        sbLIZ.append(c918610a0p.LIZIZ);
        sbLIZ.append(" entryType=");
        sbLIZ.append(c918350a0P.LIZIZ());
        sbLIZ.append("，preChecker.size ");
        sbLIZ.append(c918350a0P.LIZLLL.LIZ.size());
        C20441214yg.LIZIZ("MultiGuestInviteRouterAdapter", C2188811AlT.LIZIZ(sbLIZ));
        Function1<C918610a0p, Unit> function1 = c918350a0P.LIZJ.LIZIZ;
        if (function1 != null) {
            function1.invoke(c918610a0p);
        }
    }

    public final void LIZJ(C918350a0P c918350a0P, List<? extends InterfaceC918590a0n> list, int i) {
        if (i >= list.size()) {
            LIZ(c918350a0P, new C918610a0p(EnumC918840a1C.PASSED));
            Function0<Unit> function0 = c918350a0P.LIZJ.LIZ;
            if (function0 != null) {
                function0.invoke();
            }
            C918350a0P c918350a0PLIZ = C918350a0P.LIZ(c918350a0P, null, C918360a0Q.LIZ(c918350a0P.LIZJ, new AwS381S0200000_15(this, c918350a0P, 146)), null, 11);
            int i2 = C918570a0l.LIZIZ[this.LIZ.LIZ(c918350a0PLIZ).ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    this.LIZLLL.invoke(c918350a0PLIZ);
                    return;
                }
                throw new C1954807lC();
            }
            this.LIZJ.invoke(c918350a0PLIZ);
            return;
        }
        InterfaceC918590a0n interfaceC918590a0n = (InterfaceC918590a0n) ListProtector.get(list, i);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C918610a0p c918610a0pLIZ = interfaceC918590a0n.LIZ(new C918580a0m(atomicBoolean, this, c918350a0P, list, i));
        int i3 = C918570a0l.LIZ[c918610a0pLIZ.LIZ.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 == 3) {
                if (atomicBoolean.get()) {
                    return;
                }
                LIZ(c918350a0P, c918610a0pLIZ);
                return;
            }
            throw new C1954807lC();
        }
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        LIZIZ(c918350a0P, list, i, c918610a0pLIZ);
    }

    public C918560a0k(C918540a0i c918540a0i, C918670a0v c918670a0v, AwS594S0100000_15 awS594S0100000_15, AwS594S0100000_15 awS594S0100000_152) {
        this.LIZ = c918540a0i;
        this.LIZIZ = c918670a0v;
        this.LIZJ = awS594S0100000_15;
        this.LIZLLL = awS594S0100000_152;
    }

    public final void LIZIZ(C918350a0P c918350a0P, List<? extends InterfaceC918590a0n> list, int i, C918610a0p c918610a0p) {
        int i2 = C918570a0l.LIZ[c918610a0p.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new C1954807lC();
            }
            LIZ(c918350a0P, c918610a0p);
            return;
        }
        LIZJ(c918350a0P, list, i + 1);
    }
}
