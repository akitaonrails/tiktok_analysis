package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS381S0200000_15;

/* JADX INFO: renamed from: X.0bD4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964640bD4 implements InterfaceC954190awD {
    public final InterfaceC497601wk LIZ;
    public final Function0<Long> LIZIZ;
    public final InterfaceC954310awP LIZJ;
    public final C956200azS<Boolean> LIZLLL;
    public InterfaceC964720bDC LJ;
    public final Map<C964650bD5, C964680bD8> LJFF;

    @Override // X.InterfaceC954190awD
    public final void LJ() {
        this.LJ = C964670bD7.LL;
        Iterator it2 = ((HashMap) this.LJFF).values().iterator();
        while (it2.hasNext()) {
            ((C964680bD8) it2.next()).LIZ();
        }
        ((HashMap) this.LJFF).clear();
    }

    @Override // X.InterfaceC954190awD
    public final void LIZ(InterfaceC964720bDC interfaceC964720bDC) {
        this.LJ = interfaceC964720bDC;
    }

    @Override // X.InterfaceC954190awD
    public final int LIZIZ(EnumC964700bDA enumC964700bDA) {
        Set setKeySet = ((HashMap) this.LJFF).keySet();
        int i = 0;
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator it2 = setKeySet.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (((C964650bD5) it2.next()).LIZ == enumC964700bDA && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    @Override // X.InterfaceC954190awD
    public final void LIZLLL(EnumC964700bDA enumC964700bDA, long j) {
        C964650bD5 c964650bD5 = new C964650bD5(enumC964700bDA);
        C964680bD8 c964680bD8 = (C964680bD8) ((HashMap) this.LJFF).get(c964650bD5);
        if (c964680bD8 == null) {
            InterfaceC954310awP interfaceC954310awP = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stop timer failed, timer does not exist, type=");
            sbLIZ.append(enumC964700bDA);
            interfaceC954310awP.w("TimerManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        c964680bD8.LIZ();
        if (((HashMap) this.LJFF).remove(c964650bD5) != null) {
            InterfaceC954310awP interfaceC954310awP2 = this.LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Stop timer. Timer ");
            sbLIZ2.append(c964650bD5);
            sbLIZ2.append(" is removed successfully");
            interfaceC954310awP2.d("TimerManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public C964640bD4(C054G c054g, AFwS189S0000000_3 aFwS189S0000000_3, C956200azS c956200azS) {
        C0TW8 c0tw8 = C0TW8.LIZ;
        this.LIZ = c054g;
        this.LIZIZ = aFwS189S0000000_3;
        this.LIZJ = c0tw8;
        this.LIZLLL = c956200azS;
        this.LJ = C964670bD7.LL;
        this.LJFF = new HashMap();
    }

    @Override // X.InterfaceC954190awD
    public final void LIZJ(EnumC964700bDA enumC964700bDA, long j, int i) {
        if (i <= 0) {
            this.LIZJ.w("TimerManager", "start timer failed, duration <= 0");
            return;
        }
        if (j <= 0) {
            this.LIZJ.w("TimerManager", "start timer failed, uid <= 0");
            return;
        }
        C964650bD5 c964650bD5 = new C964650bD5(enumC964700bDA);
        if (((HashMap) this.LJFF).containsKey(c964650bD5)) {
            InterfaceC954310awP interfaceC954310awP = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start timer failed, timer already exists, type=");
            sbLIZ.append(enumC964700bDA);
            interfaceC954310awP.w("TimerManager", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        InterfaceC964720bDC interfaceC964720bDC = this.LJ;
        Function0<Long> function0 = this.LIZIZ;
        C964680bD8 c964680bD8 = new C964680bD8(enumC964700bDA, j, i, interfaceC964720bDC, function0, this.LIZJ, this.LIZLLL);
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LIZ, null, null, new C01WW(function0.invoke().longValue() + (((long) i) * 1000), c964680bD8, null), 3);
        c964680bD8.LJI = anonymousClass0956LIZLLL;
        anonymousClass0956LIZLLL.LJII(new AwS381S0200000_15(this, c964650bD5, 197));
        ((HashMap) this.LJFF).put(c964650bD5, c964680bD8);
    }
}
