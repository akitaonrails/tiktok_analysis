package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YOb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873390YOb implements C0YOZ {
    public final C0YEM LIZ;
    public final C0Y3J LIZIZ;
    public final C0YOW LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1628));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1627));

    public final InterfaceC873460YOi LJII() {
        return this.LIZ.LJIIZILJ().getDomain().LIZLLL().LIZLLL();
    }

    public final C054G LJIIIIZZ() {
        CoroutineContext coroutineContext = this.LIZ.LIZJ().getCoroutineContext();
        return C2296808zG.LIZ(coroutineContext.plus(new C23119094b((C09AE) coroutineContext.get(C09AE.LJJLJ))));
    }

    @Override // X.C0YOZ
    public final InterfaceC603530Nln LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.C0YOZ
    public final InterfaceC1441505kb LIZLLL() {
        return this.LIZJ;
    }

    public C873390YOb(C0YEM c0yem) {
        this.LIZ = c0yem;
        this.LIZIZ = new C0Y3J(c0yem);
        this.LIZJ = new C0YOW(c0yem);
    }

    @Override // X.C0YOZ
    public final C0Y6Q<C00FC> LIZ(C873450YOh c873450YOh, C0IC5 c0ic5, C0YOY c0yoy) {
        C873490YOl c873490YOl = (C873490YOl) this.LJ.getValue();
        InterfaceC497601wk interfaceC497601wkLIZ = c873490YOl.LIZ.LLJLL().LIZ();
        if (interfaceC497601wkLIZ == null) {
            C0YPY c0ypy = new C0YPY(-1041, "No active session", null, null);
            c0yoy.onEvent(new C0YQ0(null, null, c0ypy, c873450YOh.LIZ));
            return C865670Xxd.LIZIZ(c0ypy);
        }
        C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C873400YOc(c873490YOl, c873450YOh, c0yoy, c0ic5, null), 3);
        return C865670Xxd.LIZJ(new C00FC(c873450YOh.LIZ));
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.0YP8] */
    @Override // X.C0YOZ
    public final C0Y6Q<List<C00FC>> LIZJ(List<C0YP2> list, C0IC5 c0ic5, final C0YOY c0yoy) {
        if (list.isEmpty()) {
            C0YEM c0yem = this.LIZ;
            C13BV c13bv = C13BV.INSTANCE;
            C0YOU.LIZ(c0yem, c0yoy, new C0YPX(c13bv, c13bv));
            return C865670Xxd.LIZJ(c13bv);
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C0YP2> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next();
            arrayList.add(UUID.randomUUID().toString());
        }
        final C0YEM c0yem2 = this.LIZ;
        final int size = list.size();
        ?? r8 = new C0YOY(c0yem2, c0yoy, size) { // from class: X.0YP8
            public final C0YEM LIZ;
            public final C0YOY LIZIZ;
            public final int LIZJ;
            public final List<C869590Y9l> LIZLLL = Collections.synchronizedList(new ArrayList());
            public final List<C0YQ0> LJ = Collections.synchronizedList(new ArrayList());
            public final AtomicInteger LJFF = new AtomicInteger(0);

            public final void LIZ() {
                List listLLIIII;
                List listLLIIII2;
                if (this.LJFF.incrementAndGet() != this.LIZJ) {
                    return;
                }
                synchronized (this.LIZLLL) {
                    try {
                        listLLIIII = C13LP.LLIIII(this.LIZLLL);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                synchronized (this.LJ) {
                    try {
                        listLLIIII2 = C13LP.LLIIII(this.LJ);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
                C0YOU.LIZ(this.LIZ, this.LIZIZ, new C0YPX(listLLIIII, listLLIIII2));
            }

            @Override // X.C0YOY
            public void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                C0YOU.LIZ(this.LIZ, this.LIZIZ, interfaceC873750YPl);
                if (interfaceC873750YPl instanceof C0YPL) {
                    this.LIZLLL.add(((C0YPL) interfaceC873750YPl).LIZIZ);
                    LIZ();
                } else {
                    if (!(interfaceC873750YPl instanceof C0YQ0)) {
                        return;
                    }
                    this.LJ.add(interfaceC873750YPl);
                    LIZ();
                }
            }

            {
                this.LIZ = c0yem2;
                this.LIZIZ = c0yoy;
                this.LIZJ = size;
            }
        };
        int i = C873470YOj.LIZ[c0ic5.LIZIZ.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                for (C0YP2 c0yp2 : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        String str = (String) ListProtector.get(arrayList, i2);
                        C23250099c.LIZLLL(LJIIIIZZ(), this.LIZ.LJIIIIZZ().LIZIZ(), null, new C873430YOf(this, new C873530YOp(new C0YP4(c0yp2, str), c0ic5.LIZ), r8, null), 2);
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C0YP2 c0yp22 : list) {
                int i4 = i2 + 1;
                if (i2 >= 0) {
                    arrayList2.add(new C0YP5(c0yp22, (String) ListProtector.get(arrayList, i2)));
                    i2 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            C23250099c.LIZLLL(LJIIIIZZ(), this.LIZ.LJIIIIZZ().LIZIZ(), null, new C873440YOg(this, new C873520YOo(arrayList2, c0ic5.LIZ), r8, null), 2);
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new C00FC((String) it3.next()));
        }
        return C865670Xxd.LIZJ(arrayList3);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f1  */
    @Override // X.C0YOZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0Y6Q<X.C00FC> LJ(X.C873410YOd r31, X.C0IC5 r32, X.C0YOY r33) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C873390YOb.LJ(X.0YOd, X.0IC5, X.0YOY):X.0Y6Q");
    }

    @Override // X.C0YOZ
    public final Object LJFF(C0YP2 c0yp2, C0IC5 c0ic5, InterfaceC1364105Vn<? super C0Y6Q<C0YPS>> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        LJI(c0yp2, c0ic5, new C0YOY() { // from class: X.0YPE
            @Override // X.C0YOY
            public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                if (interfaceC873750YPl instanceof C0YPL) {
                    if (c2252611DEt.isActive()) {
                        InterfaceC20236714Gf<C0Y6Q<C0YPS>> interfaceC20236714Gf = c2252611DEt;
                        C0YPL c0ypl = (C0YPL) interfaceC873750YPl;
                        C0Y6Q c0y6qLIZJ = C865670Xxd.LIZJ(new C0YPS(c0ypl.LIZ, c0ypl.LIZIZ, c0ypl.LIZJ));
                        C189200o6.m2constructorimpl(c0y6qLIZJ);
                        interfaceC20236714Gf.resumeWith(c0y6qLIZJ);
                        return;
                    }
                    return;
                }
                if (!(interfaceC873750YPl instanceof C0YQ0) || !c2252611DEt.isActive()) {
                    return;
                }
                InterfaceC20236714Gf<C0Y6Q<C0YPS>> interfaceC20236714Gf2 = c2252611DEt;
                C0Y6Q c0y6qLIZIZ = C865670Xxd.LIZIZ(((C0YQ0) interfaceC873750YPl).LIZJ);
                C189200o6.m2constructorimpl(c0y6qLIZIZ);
                interfaceC20236714Gf2.resumeWith(c0y6qLIZIZ);
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    @Override // X.C0YOZ
    public final C0Y6Q<C00FC> LJI(C0YP2 c0yp2, C0IC5 c0ic5, C0YOY c0yoy) {
        String string = UUID.randomUUID().toString();
        C23250099c.LIZLLL(LJIIIIZZ(), this.LIZ.LJIIIIZZ().LIZIZ(), null, new C873420YOe(this, new C873530YOp(new C0YP4(c0yp2, string), c0ic5.LIZ), c0yoy, null), 2);
        return C865670Xxd.LIZJ(new C00FC(string));
    }
}
