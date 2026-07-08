package X;

import Y.AObjectS386S0100000_11;
import Y.AObjectS71S0201000_11;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0S2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714930S2p {
    public final InterfaceC715010S2x LIZ;
    public boolean LIZIZ;
    public AbstractC714940S2q LIZJ;
    public View LIZLLL;
    public final HashMap<String, ArrayList<AbstractC714940S2q>> LJ;
    public final HashMap<Class<?>, AbstractC714940S2q> LJFF;
    public C421550Gfx LJI;
    public C421550Gfx LJII;
    public final C01GW LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public C714930S2p(C715000S2w c715000S2w) {
        this.LIZ = c715000S2w;
        new C714990S2v();
        this.LJ = new HashMap<>();
        this.LJFF = new HashMap<>();
        this.LJIIIIZZ = C452501pT.LIZIZ(new AObjectS386S0100000_11(this, 28));
    }

    public static void LIZ(AbstractC714940S2q abstractC714940S2q) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        View view = abstractC714940S2q.LJII;
        if (view instanceof ViewStub) {
            ViewStub viewStub = (ViewStub) view;
            ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
            if (abstractC714940S2q.LJII.getParent() != null) {
                C714950S2r.LIZ((ViewGroup) abstractC714940S2q.LJII.getParent(), viewStub, layoutParams, abstractC714940S2q);
                return;
            }
            int i = abstractC714940S2q.LIZ;
            if (i != -1) {
                viewGroup2 = (ViewGroup) abstractC714940S2q.LJIIIIZZ.LJII.findViewById(i);
            } else {
                viewGroup2 = (ViewGroup) abstractC714940S2q.LJIIIIZZ.LJII;
            }
            C714950S2r.LIZ(viewGroup2, viewStub, layoutParams, abstractC714940S2q);
            return;
        }
        if (view.getParent() != null) {
            return;
        }
        int i2 = abstractC714940S2q.LIZ;
        if (i2 != -1) {
            viewGroup = (ViewGroup) abstractC714940S2q.LJIIIIZZ.LJII.findViewById(i2);
        } else {
            View view2 = abstractC714940S2q.LJIIIIZZ.LJII;
            if (view2 instanceof ViewGroup) {
                viewGroup = (ViewGroup) view2;
            } else {
                return;
            }
        }
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams2 = abstractC714940S2q.LIZIZ;
            if (layoutParams2 != null) {
                viewGroup.addView(abstractC714940S2q.LJII, layoutParams2);
                return;
            }
            try {
                viewGroup.addView(abstractC714940S2q.LJII);
            } catch (StackOverflowError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LJIIL(AbstractC714940S2q abstractC714940S2q) {
        InterfaceC714910S2n interfaceC714910S2n;
        InterfaceC714910S2n interfaceC714910S2n2 = abstractC714940S2q.LIZLLL;
        if (interfaceC714910S2n2 instanceof InterfaceC714920S2o) {
            ((InterfaceC714920S2o) interfaceC714910S2n2).LIZLLL();
        }
        if (abstractC714940S2q.LJFF && (interfaceC714910S2n = abstractC714940S2q.LIZLLL) != null) {
            interfaceC714910S2n.LIZ();
        }
        List<? extends AbstractC714940S2q> list = abstractC714940S2q.LJIIIZ;
        if (list != null) {
            Iterator<? extends AbstractC714940S2q> it2 = list.iterator();
            while (it2.hasNext()) {
                LJIIL(it2.next());
            }
        }
    }

    public final void LIZLLL(AbstractC714940S2q abstractC714940S2q) {
        EnumC714970S2t enumC714970S2t;
        abstractC714940S2q.LJ();
        System.currentTimeMillis();
        LJI(abstractC714940S2q).remove(abstractC714940S2q);
        if (!r0.isEmpty()) {
            enumC714970S2t = EnumC714970S2t.NONE;
        } else {
            enumC714970S2t = EnumC714970S2t.NONE;
        }
        int i = C714960S2s.LIZ[enumC714970S2t.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    abstractC714940S2q.LJII = LJFF(abstractC714940S2q);
                    Iterator<AbstractC714940S2q> it2 = LJI(abstractC714940S2q).iterator();
                    while (it2.hasNext()) {
                        LJIIIZ(it2.next(), 8);
                    }
                    LJI(abstractC714940S2q).clear();
                }
            } else if (!abstractC714940S2q.LJFF) {
                abstractC714940S2q.LJII = LJFF(abstractC714940S2q);
            }
        } else if (!abstractC714940S2q.LJFF) {
            abstractC714940S2q.LJII = LJFF(abstractC714940S2q);
        }
        if ("".length() > 0) {
            LJI(abstractC714940S2q).add(abstractC714940S2q);
        }
        List<? extends AbstractC714940S2q> list = abstractC714940S2q.LJIIIZ;
        if (list != null) {
            Iterator<? extends AbstractC714940S2q> it3 = list.iterator();
            while (it3.hasNext()) {
                LIZLLL(it3.next());
            }
        }
        abstractC714940S2q.LJ();
        LJIIIIZZ(abstractC714940S2q, 0);
    }

    public final View LJFF(AbstractC714940S2q abstractC714940S2q) {
        View viewLIZIZ;
        System.currentTimeMillis();
        View view = null;
        try {
            View view2 = this.LIZLLL;
            if (view2 == null) {
                view2 = null;
            }
            viewLIZIZ = abstractC714940S2q.LIZIZ(view2.getContext(), (ViewGroup) abstractC714940S2q.LJIIIIZZ.LJII);
        } catch (InflateException e) {
            TryCatchGuardChecker.doCheck(e);
            View view3 = this.LIZLLL;
            if (view3 == null) {
                view3 = null;
            }
            viewLIZIZ = abstractC714940S2q.LIZIZ(view3.getContext(), (ViewGroup) abstractC714940S2q.LJIIIIZZ.LJII);
        }
        if (viewLIZIZ instanceof ViewStub) {
            ViewStub viewStub = (ViewStub) viewLIZIZ;
            ViewGroup viewGroup = (ViewGroup) abstractC714940S2q.LJIIIIZZ.LJII;
            View view4 = this.LIZLLL;
            if (view4 != null) {
                view = view4;
            }
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(view.getContext()), viewStub.getLayoutResource(), viewGroup, false);
            if (viewStub.getInflatedId() != -1) {
                viewTd.setId(viewStub.getInflatedId());
            }
            viewStub.setTag(-2, viewTd);
        }
        return viewLIZIZ;
    }

    public final ArrayList<AbstractC714940S2q> LJI(AbstractC714940S2q abstractC714940S2q) {
        HashMap<String, ArrayList<AbstractC714940S2q>> map = this.LJ;
        abstractC714940S2q.getClass();
        if (map.get("") == null) {
            this.LJ.put("", new ArrayList<>());
        }
        return this.LJ.get("");
    }

    public final void LJIIJJI(AbstractC714940S2q abstractC714940S2q) {
        if (abstractC714940S2q.LJII == null) {
            LJ(abstractC714940S2q, true);
        } else {
            LJIIIZ(abstractC714940S2q, 0);
        }
        if ("".length() > 0) {
            LJI(abstractC714940S2q).add(abstractC714940S2q);
        }
    }

    public static void LJIIJ(AbstractC714940S2q abstractC714940S2q, C690380R6e c690380R6e) {
        abstractC714940S2q.LJ = true;
        abstractC714940S2q.LIZJ = c690380R6e;
        List<? extends AbstractC714940S2q> list = abstractC714940S2q.LJIIIZ;
        if (list != null) {
            Iterator<? extends AbstractC714940S2q> it2 = list.iterator();
            while (it2.hasNext()) {
                LJIIJ(it2.next(), c690380R6e);
            }
        }
    }

    public final void LIZIZ(AbstractC714940S2q abstractC714940S2q, C690380R6e c690380R6e) {
        List<? extends AbstractC714940S2q> list;
        abstractC714940S2q.LIZJ = c690380R6e;
        if (abstractC714940S2q.LJI != 8) {
            if (abstractC714940S2q.LJFF) {
                InterfaceC714910S2n interfaceC714910S2n = abstractC714940S2q.LIZLLL;
                if (interfaceC714910S2n != null) {
                    interfaceC714910S2n.LJ(c690380R6e, abstractC714940S2q.LJII, this.LIZ);
                }
            } else {
                abstractC714940S2q.LJII = LJFF(abstractC714940S2q);
                LIZ(abstractC714940S2q);
                abstractC714940S2q.LJFF = true;
                View view = abstractC714940S2q.LJII;
                InterfaceC714910S2n interfaceC714910S2n2 = abstractC714940S2q.LIZLLL;
                if (interfaceC714910S2n2 != null) {
                    interfaceC714910S2n2.LJ(c690380R6e, view, this.LIZ);
                }
            }
        } else {
            LJIIJ(abstractC714940S2q, c690380R6e);
        }
        if (abstractC714940S2q.LJFF) {
            int i = abstractC714940S2q.LJI;
            if (this.LIZIZ) {
                C421550Gfx c421550Gfx = this.LJII;
                if (c421550Gfx == null) {
                    c421550Gfx = null;
                }
                c421550Gfx.LIZ(new AObjectS71S0201000_11(i, this, abstractC714940S2q, 0));
            }
        }
        if (abstractC714940S2q.LJI != 8 && (list = abstractC714940S2q.LJIIIZ) != null) {
            Iterator<? extends AbstractC714940S2q> it2 = list.iterator();
            while (it2.hasNext()) {
                LIZIZ(it2.next(), c690380R6e);
            }
        }
    }

    public final void LIZJ(AbstractC714940S2q abstractC714940S2q, C690380R6e c690380R6e) {
        InterfaceC714910S2n interfaceC714910S2n = abstractC714940S2q.LIZLLL;
        if (interfaceC714910S2n instanceof InterfaceC714920S2o) {
            ((InterfaceC714920S2o) interfaceC714910S2n).LIZIZ(c690380R6e, this.LIZ);
        }
        List<? extends AbstractC714940S2q> list = abstractC714940S2q.LJIIIZ;
        if (list != null) {
            Iterator<? extends AbstractC714940S2q> it2 = list.iterator();
            while (it2.hasNext()) {
                LIZJ(it2.next(), c690380R6e);
            }
        }
    }

    public final void LJ(AbstractC714940S2q abstractC714940S2q, boolean z) {
        abstractC714940S2q.LJ();
        abstractC714940S2q.LJII = LJFF(abstractC714940S2q);
        List<? extends AbstractC714940S2q> list = abstractC714940S2q.LJIIIZ;
        if (list != null) {
            Iterator<? extends AbstractC714940S2q> it2 = list.iterator();
            while (it2.hasNext()) {
                LJ(it2.next(), false);
            }
        }
        LJIIIIZZ(abstractC714940S2q, 0);
    }

    public final void LJII(AbstractC714940S2q abstractC714940S2q, AbstractC714940S2q abstractC714940S2q2) {
        System.currentTimeMillis();
        this.LJFF.put(abstractC714940S2q.getClass(), abstractC714940S2q);
        abstractC714940S2q.getClass();
        abstractC714940S2q.LJIIIIZZ = abstractC714940S2q2;
        abstractC714940S2q.LIZLLL = abstractC714940S2q.LIZJ();
        List<AbstractC714940S2q> listLIZLLL = abstractC714940S2q.LIZLLL();
        abstractC714940S2q.LJIIIZ = listLIZLLL;
        if (listLIZLLL != null) {
            Iterator<AbstractC714940S2q> it2 = listLIZLLL.iterator();
            while (it2.hasNext()) {
                LJII(it2.next(), abstractC714940S2q);
            }
        }
    }

    public final void LJIIIIZZ(AbstractC714940S2q abstractC714940S2q, int i) {
        InterfaceC714910S2n interfaceC714910S2n;
        if (this.LJIIIZ) {
            if (!abstractC714940S2q.LJFF) {
                LIZ(abstractC714940S2q);
                abstractC714940S2q.LJFF = true;
            }
            if (abstractC714940S2q.LJ && (interfaceC714910S2n = abstractC714940S2q.LIZLLL) != null) {
                interfaceC714910S2n.LJ(abstractC714940S2q.LIZJ, abstractC714940S2q.LJII, this.LIZ);
            }
            if (!abstractC714940S2q.LIZ()) {
                C786410Ut5.LJLLLLLL(i, abstractC714940S2q.LJII);
                return;
            }
            return;
        }
        C421550Gfx c421550Gfx = this.LJI;
        if (c421550Gfx == null) {
            c421550Gfx = null;
        }
        c421550Gfx.LIZ(new AObjectS71S0201000_11(i, this, abstractC714940S2q, 2));
    }

    public final void LJIIIZ(AbstractC714940S2q abstractC714940S2q, int i) {
        C421550Gfx c421550Gfx = this.LJI;
        if (c421550Gfx == null) {
            c421550Gfx = null;
        }
        c421550Gfx.LIZ(new AObjectS71S0201000_11(i, this, abstractC714940S2q, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.AbstractC714940S2q r5, X.C690380R6e r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            r2 = 0
            if (r7 == 0) goto L40
            r5.getClass()
            r0 = 8
            r5.LJI = r0
        La:
            if (r8 == 0) goto L3e
            r5.getClass()
            android.view.View r0 = r5.LJII
            if (r0 != 0) goto L1d
            int r0 = r5.LJI
            if (r0 != 0) goto L1d
            android.view.View r0 = r4.LJFF(r5)
            r5.LJII = r0
        L1d:
            int r0 = r5.LJI
            r3 = 1
            if (r0 != 0) goto L3e
            android.view.View r0 = r5.LJII
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L3e
        L28:
            java.util.List<? extends X.0S2q> r0 = r5.LJIIIZ
            if (r0 == 0) goto L5c
            java.util.Iterator r1 = r0.iterator()
        L30:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r1.next()
            r0.getClass()
            goto L30
        L3e:
            r3 = 0
            goto L28
        L40:
            r5.LJ()
            r5.LJI = r2
            goto La
        L46:
            java.util.List<? extends X.0S2q> r0 = r5.LJIIIZ
            java.util.Iterator r1 = r0.iterator()
        L4c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r1.next()
            X.0S2q r0 = (X.AbstractC714940S2q) r0
            r4.LJIILIIL(r0, r6, r2, r3)
            goto L4c
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C714930S2p.LJIILIIL(X.0S2q, X.0R6e, boolean, boolean):void");
    }
}
