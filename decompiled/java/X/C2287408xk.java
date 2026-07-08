package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08xk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2287408xk implements InterfaceC1416920myY {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(509));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(510));
    public final Map<EnumC2288308xt, C2287508xl> LIZJ = new LinkedHashMap();
    public final LinkedHashMap<String, String> LIZLLL = new LinkedHashMap<>();
    public final C2267108uT LJ = new C2267108uT(this);

    @Override // X.InterfaceC1416920myY
    public final synchronized void LIZ() {
        this.LIZLLL.clear();
        C23250099c.LJ(C0PEM.LIZJ, new C2287208xi(this, null));
    }

    public final String LJ() {
        return (String) this.LIZ.getValue();
    }

    @Override // X.InterfaceC1416920myY
    public final void destroy() {
        Iterator it2 = ((LinkedHashMap) this.LIZJ).values().iterator();
        while (it2.hasNext()) {
            C2296808zG.LIZJ(((C2287508xl) it2.next()).LJIIIZ, null);
        }
        C2286708xd.LJIJJ(LJ(), new InterfaceC2287108xh() { // from class: X.08xm
            @Override // X.InterfaceC2287108xh
            public final Object apply(Object obj) {
                return Boolean.TRUE;
            }
        });
        C2286708xd.LJIIZILJ(LJ());
    }

    @Override // X.InterfaceC1416920myY
    public final C19475711Hn LIZIZ(EnumC2288308xt enumC2288308xt) {
        C2287508xl c2287508xl;
        if (!this.LIZJ.containsKey(enumC2288308xt) || (c2287508xl = (C2287508xl) ((LinkedHashMap) this.LIZJ).get(enumC2288308xt)) == null) {
            return null;
        }
        switch (C2288008xq.LIZ[c2287508xl.LIZIZ.ordinal()]) {
            case 1:
                c2287508xl.LIZ();
                return c2287508xl.LJII;
            case 2:
            case 3:
            case 4:
                return c2287508xl.LJII;
            case 5:
            case 6:
                return null;
            default:
                throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC1416920myY
    public final String LIZJ(EnumC2288308xt enumC2288308xt) {
        C2287508xl c2287508xl;
        if (!this.LIZJ.containsKey(enumC2288308xt) || (c2287508xl = (C2287508xl) ((LinkedHashMap) this.LIZJ).get(enumC2288308xt)) == null) {
            return null;
        }
        switch (C2288008xq.LIZ[c2287508xl.LIZIZ.ordinal()]) {
            case 1:
                c2287508xl.LIZ();
                return c2287508xl.LJI;
            case 2:
                return c2287508xl.LJI;
            case 3:
            case 4:
            case 5:
            case 6:
                return null;
            default:
                throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC1416920myY
    public final void LIZLLL(EnumC2288308xt enumC2288308xt, AbstractC1921407fo abstractC1921407fo, C2267408uW c2267408uW, C2267208uU c2267208uU, C2288508xv c2288508xv, C2288408xu c2288408xu) {
        this.LIZJ.put(enumC2288308xt, new C2287508xl(this, abstractC1921407fo, EnumC2288108xr.PREPARED, c2267408uW, c2267208uU, c2288408xu));
        C2287508xl c2287508xl = (C2287508xl) ((LinkedHashMap) this.LIZJ).get(enumC2288308xt);
        if (c2287508xl != null) {
            c2287508xl.LIZ();
        }
    }
}
