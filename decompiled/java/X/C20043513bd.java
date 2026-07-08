package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS465S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13bd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20043513bd {
    public final InterfaceC20043013bY LIZ;
    public final Function0<InterfaceC1690480u5m> LIZIZ;
    public final C19991913Kb<Object, C20043613be> LIZJ = C19992013Kc.LIZIZ();

    public final Object LIZIZ(Object obj) {
        if (obj == null) {
            return null;
        }
        C20043613be c20043613beLIZLLL = this.LIZJ.LIZLLL(obj);
        if (c20043613beLIZLLL != null) {
            return c20043613beLIZLLL.LIZIZ;
        }
        InterfaceC1690480u5m interfaceC1690480u5mInvoke = this.LIZIZ.invoke();
        int iLIZ = interfaceC1690480u5mInvoke.LIZ(obj);
        if (iLIZ == -1) {
            return null;
        }
        return interfaceC1690480u5mInvoke.LJ(iLIZ);
    }

    public C20043513bd(InterfaceC20043013bY interfaceC20043013bY, AwS574S0100000_30 awS574S0100000_30) {
        this.LIZ = interfaceC20043013bY;
        this.LIZIZ = awS574S0100000_30;
    }

    public final Function2<InterfaceC1680500tpg, Integer, Unit> LIZ(int i, Object obj, Object obj2) {
        C20043613be c20043613beLIZLLL = this.LIZJ.LIZLLL(obj);
        if (c20043613beLIZLLL != null && c20043613beLIZLLL.LIZJ == i && Intrinsics.LJFF(c20043613beLIZLLL.LIZIZ, obj2)) {
            Function2 function2 = c20043613beLIZLLL.LIZLLL;
            if (function2 == null) {
                C19719212De c19719212De = new C19719212De(1403994769, new AwS465S0200000_30(c20043613beLIZLLL.LJ, c20043613beLIZLLL, 19), true);
                c20043613beLIZLLL.LIZLLL = c19719212De;
                return c19719212De;
            }
            return function2;
        }
        C20043613be c20043613be = new C20043613be(this, i, obj, obj2);
        this.LIZJ.LJIIJJI(obj, c20043613be);
        Function2 function22 = c20043613be.LIZLLL;
        if (function22 != null) {
            return function22;
        }
        C19719212De c19719212De2 = new C19719212De(1403994769, new AwS465S0200000_30(this, c20043613be, 19), true);
        c20043613be.LIZLLL = c19719212De2;
        return c19719212De2;
    }
}
