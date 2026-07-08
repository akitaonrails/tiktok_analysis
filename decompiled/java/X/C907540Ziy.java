package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: renamed from: X.0Ziy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907540Ziy implements InterfaceC689080R1e {
    public static final C907540Ziy LJI = new C907540Ziy(0);
    public final C1231704rr LIZ;
    public final ConcurrentHashMap<String, C907600Zj4> LIZIZ;
    public final Function0<String> LIZJ;
    public final Function0<Boolean> LIZLLL;
    public final Function1<String, C907600Zj4> LJ;
    public final Function0<Unit> LJFF;

    @Override // X.InterfaceC689080R1e
    public final void LIZ() {
        this.LIZ.LIZIZ();
        for (C907600Zj4 c907600Zj4 : this.LIZIZ.values()) {
            C1231704rr c1231704rr = c907600Zj4.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clear ");
            sbLIZ.append(c907600Zj4.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            c1231704rr.LIZIZ();
            C01GW c01gw = C296710Bk5.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 2) {
                C23250099c.LIZLLL(c907600Zj4.LIZIZ(), null, null, new C907570Zj1(c907600Zj4, null), 3);
            } else {
                C2296808zG.LIZJ(c907600Zj4.LIZIZ(), null);
            }
            if (((Number) c01gw.getValue()).intValue() > 0 && !((ExecutorService) c907600Zj4.LIZLLL.getValue()).isShutdown()) {
                ((ExecutorService) c907600Zj4.LIZLLL.getValue()).shutdown();
            }
            C2296808zG.LIZJ((InterfaceC497601wk) c907600Zj4.LJI.getValue(), null);
            C907410Zil c907410Zil = c907600Zj4.LJIIIZ;
            if (c907410Zil != null) {
                c907410Zil.LJI.LIZIZ();
                ((C876310YZh) c907410Zil.LIZJ).LIZ.LJIJI().LIZ(c907410Zil);
            }
        }
        this.LIZIZ.clear();
    }

    @Override // X.InterfaceC689080R1e
    public final Boolean LIZIZ() {
        C907310Zib c907310ZibLIZ;
        this.LIZ.LIZIZ();
        String strInvoke = this.LIZJ.invoke();
        LJ();
        C907600Zj4 c907600Zj4 = this.LIZIZ.get(strInvoke);
        if (c907600Zj4 == null || (c907310ZibLIZ = c907600Zj4.LIZ()) == null) {
            return null;
        }
        boolean zLIZLLL = c907310ZibLIZ.LIZ.LIZLLL();
        if (zLIZLLL) {
            c907310ZibLIZ.LIZIZ.storeLong("last_refresh_time", System.currentTimeMillis());
            c907310ZibLIZ.LIZIZ.storeLong("cold_message_create_time_cursor", -1L);
        }
        return Boolean.valueOf(zLIZLLL);
    }

    public final void LJ() {
        String strInvoke = this.LIZJ.invoke();
        if (!this.LIZIZ.containsKey(strInvoke) && this.LIZLLL.invoke().booleanValue()) {
            this.LIZ.LIZIZ();
            this.LJFF.invoke();
            this.LIZIZ.put(strInvoke, this.LJ.invoke(strInvoke));
        }
    }

    public C907540Ziy(int i) {
        C1231704rr c1231704rr = new C1231704rr("update_supervisor", "search", 4);
        ConcurrentHashMap<String, C907600Zj4> concurrentHashMap = new ConcurrentHashMap<>();
        AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(477);
        AFwS189S0000000_3 aFwS189S0000000_3 = AFwS189S0000000_3.get$arr$(1317);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(475);
        AFwS226S0000000_35 aFwS226S0000000_35 = AFwS226S0000000_35.get$arr$(554);
        this.LIZ = c1231704rr;
        this.LIZIZ = concurrentHashMap;
        this.LIZJ = aFwS201S0000000_14;
        this.LIZLLL = aFwS189S0000000_3;
        this.LJ = aFwS248S0000000_14;
        this.LJFF = aFwS226S0000000_35;
    }

    @Override // X.InterfaceC689080R1e
    public final void LIZJ(InterfaceC497601wk interfaceC497601wk) {
        String strInvoke = this.LIZJ.invoke();
        C1231704rr c1231704rr = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSearchContentManually ");
        sbLIZ.append(strInvoke);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        LJ();
        C907600Zj4 c907600Zj4 = this.LIZIZ.get(strInvoke);
        if (c907600Zj4 != null) {
            synchronized (c907600Zj4) {
                try {
                    if (!c907600Zj4.LJIIL) {
                        c907600Zj4.LIZIZ.LIZIZ();
                        c907600Zj4.LJII = new C907530Zix((InterfaceC497601wk) c907600Zj4.LJI.getValue(), (InterfaceC907650Zj9) c907600Zj4.LIZJ.getValue());
                        C907490Zit c907490Zit = new C907490Zit((InterfaceC497601wk) c907600Zj4.LJI.getValue(), (InterfaceC907650Zj9) c907600Zj4.LIZJ.getValue());
                        c907600Zj4.LJIIIIZZ = c907490Zit;
                        C09IC.LJJI(c907490Zit.LIZ, new C861640Xr8(new C597150NbV(c907490Zit, null), C09IC.LJJIFFI(C1697810uHb.LJIIJJI(c907490Zit.LJIIJJI, c907490Zit.LJIILIIL))));
                        c907600Zj4.LJIIIZ = new C907410Zil((InterfaceC497601wk) c907600Zj4.LJI.getValue(), (InterfaceC907650Zj9) c907600Zj4.LIZJ.getValue());
                        c907600Zj4.LJIIL = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C907530Zix c907530Zix = c907600Zj4.LJII;
            if (c907530Zix != null) {
                ((C05YC) c907530Zix.LJIIJJI.getValue()).LIZJ(new C597380Nbs(EnumC597350Nbp.LL, ""));
            }
            C907410Zil c907410Zil = c907600Zj4.LJIIIZ;
            if (c907410Zil != null) {
                C23250099c.LIZLLL(c907410Zil.LIZ, C0PEM.LIZJ, null, new C907400Zik(c907410Zil, null), 2);
            }
            C907310Zib c907310ZibLIZ = c907600Zj4.LIZ();
            if (c907310ZibLIZ != null) {
                C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C907330Zid(c907310ZibLIZ, null), 2);
            }
        }
    }

    public final void LIZLLL(List<? extends C869590Y9l> list) {
        String strInvoke = this.LIZJ.invoke();
        LJ();
        C907600Zj4 c907600Zj4 = this.LIZIZ.get(strInvoke);
        if (c907600Zj4 != null && list != null && !list.isEmpty()) {
            C23250099c.LIZLLL(c907600Zj4.LIZIZ(), null, null, new C907620Zj6(c907600Zj4, list, null), 3);
        }
    }
}
