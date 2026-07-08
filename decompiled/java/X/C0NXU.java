package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0NXU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NXU implements C0NXS {
    public final C595450NXb LIZ;
    public final ConcurrentHashMap<String, C0NYK> LIZIZ = new ConcurrentHashMap<>();
    public final C01GW LIZJ = C452501pT.LIZIZ(new C595520NXi(this));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C595560NXm(this));
    public final C01GW LJ = C452501pT.LIZIZ(new C595580NXo(this));
    public final C01GW LJFF = C452501pT.LIZIZ(new C595470NXd(this));
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final AtomicInteger LJIIJ;
    public final String LJIIJJI;

    public final C0NX1 LIZIZ() {
        return (C0NX1) this.LIZLLL.getValue();
    }

    public final C0NXT LIZLLL() {
        return (C0NXT) this.LJFF.getValue();
    }

    public final void LJ() {
        C0NX1 c0nx1LIZIZ = LIZIZ();
        C0NXT c0nxt = c0nx1LIZIZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init external datasource, size ");
        List list = (List) c0nx1LIZIZ.LJIIJJI.getValue();
        sbLIZ.append(list != null ? Integer.valueOf(list.size()) : null);
        C0NXR.LIZLLL(c0nx1LIZIZ, c0nxt, C2188811AlT.LIZIZ(sbLIZ));
        List<C0NY2> list2 = (List) c0nx1LIZIZ.LJIIJJI.getValue();
        if (list2 != null) {
            for (C0NY2 c0ny2 : list2) {
                C23250099c.LIZLLL(c0nx1LIZIZ.LJIIL, C0PEM.LIZ, null, new C595270NWj(c0ny2.LJ(), c0nx1LIZIZ, c0ny2.LIZIZ(), c0ny2, null), 2);
            }
        }
    }

    public final void LJI() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int size = this.LIZIZ.size();
        C0NX1 c0nx1LIZIZ = LIZIZ();
        c0nx1LIZIZ.LJFF().LIZLLL.LJIIJJI(null);
        C592050NJz c592050NJzLJFF = c0nx1LIZIZ.LJFF();
        c592050NJzLJFF.LJIIJ.set(false);
        AnonymousClass0956 anonymousClass0956 = c592050NJzLJFF.LJIIJJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = c592050NJzLJFF.LJIIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        C2296808zG.LIZJ(c0nx1LIZIZ.LJIIL, null);
        C0NXA c0nxa = c0nx1LIZIZ.LIZIZ;
        C0NXT c0nxt = c0nxa.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0nxa.LIZIZ.LIZ);
        sbLIZ.append(" clear all data");
        c0nxa.LIZ(c0nxt, C2188811AlT.LIZIZ(sbLIZ), null);
        c0nxa.LIZIZ().clear();
        c0nxa.LJI().evictAll();
        c0nxa.LJFF().evictAll();
        C0NXR.LIZLLL(c0nx1LIZIZ, c0nx1LIZIZ.LIZ, "cancel polling");
        AnonymousClass0956 anonymousClass09563 = c0nx1LIZIZ.LJIIJ;
        if (anonymousClass09563 != null) {
            anonymousClass09563.LIZIZ(null);
        }
        c0nx1LIZIZ.LJIIJ = null;
        C0NXT c0nxt2 = c0nx1LIZIZ.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onClear(");
        sbLIZ2.append("account_logout");
        sbLIZ2.append(')');
        C0NXR.LIZLLL(c0nx1LIZIZ, c0nxt2, C2188811AlT.LIZIZ(sbLIZ2));
        C0NYA c0nya = (C0NYA) this.LJ.getValue();
        C0NXT c0nxt3 = c0nya.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onClear(");
        sbLIZ3.append("account_logout");
        sbLIZ3.append(')');
        C0NXR.LIZLLL(c0nya, c0nxt3, C2188811AlT.LIZIZ(sbLIZ3));
        c0nya.LJ.LIZIZ.set(false);
        c0nya.LIZ("account_logout");
        C2296808zG.LIZJ(c0nya.LJI, null);
        for (C0NYK c0nyk : this.LIZIZ.values()) {
            C0NXR.LIZLLL(c0nyk, c0nyk.LJIILJJIL(), "onClear");
            c0nyk.destroy();
        }
        this.LIZIZ.clear();
        C0NXT c0nxtLIZLLL = LIZLLL();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("onClear, client count ");
        sbLIZ4.append(size);
        sbLIZ4.append(", duration ");
        sbLIZ4.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C0NXR.LIZLLL(this, c0nxtLIZLLL, C2188811AlT.LIZIZ(sbLIZ4));
    }

    @Override // X.C0NXS
    public final String getTag() {
        return this.LJIIJJI;
    }

    public C0NXU(C595450NXb c595450NXb) {
        this.LIZ = c595450NXb;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C595610NXr(this));
        this.LJI = c01gwLIZIZ;
        this.LJII = C452501pT.LIZIZ(new C595550NXl(this));
        this.LJIIIIZZ = C452501pT.LIZIZ(new C595570NXn(this));
        this.LJIIIZ = C452501pT.LIZIZ(new C595590NXp(this));
        this.LJIIJ = new AtomicInteger(0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Instance][");
        sbLIZ.append(((C0NY7) c01gwLIZIZ.getValue()).LIZ);
        sbLIZ.append(']');
        this.LJIIJJI = C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJFF(EnumC595840NYo enumC595840NYo) {
        boolean z;
        C0NXT c0nxtLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init module, ability is ");
        sbLIZ.append(enumC595840NYo);
        C0NXR.LIZLLL(this, c0nxtLIZLLL, C2188811AlT.LIZIZ(sbLIZ));
        if (enumC595840NYo != EnumC595840NYo.FETCH && enumC595840NYo != EnumC595840NYo.ALL) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C0NX1 c0nx1LIZIZ = LIZIZ();
            C0NXR.LIZLLL(c0nx1LIZIZ, c0nx1LIZIZ.LIZ, "init module");
            if (c0nx1LIZIZ.LJIIIIZZ.getAndSet(true)) {
                c0nx1LIZIZ.LIZIZ(c0nx1LIZIZ.LIZ, "module has already been initialized", null);
            } else {
                C23250099c.LIZLLL(c0nx1LIZIZ.LJIIL, null, null, new C595210NWd(c0nx1LIZIZ, null), 3);
                if (C595320NWo.LIZ(c0nx1LIZIZ.LIZJ).LJIJ) {
                    c0nx1LIZIZ.LJIIIIZZ();
                    c0nx1LIZIZ.LJFF().LIZ();
                }
            }
        }
        if (enumC595840NYo == EnumC595840NYo.REPORT || enumC595840NYo == EnumC595840NYo.ALL) {
            C0NYA c0nya = (C0NYA) this.LJ.getValue();
            C0NXR.LIZLLL(c0nya, c0nya.LIZ, "init module");
        }
    }

    @Override // X.C0NXS
    public final void LIZJ(C0NXT c0nxt, String str) {
        C0NXR.LIZ(this, c0nxt, str);
    }

    public final void LIZ(C0NXT c0nxt, String str, Throwable th) {
        C0NXR.LIZJ(this, c0nxt, str, th);
    }
}
