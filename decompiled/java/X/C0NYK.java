package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0NYK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NYK implements InterfaceC897330ZId, C0NXS {
    public final String LIZ;
    public final C595450NXb LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final Function0<Unit> LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new C595620NXs(this));
    public final C01GW LJFF = C452501pT.LIZIZ(new C595530NXj(this));
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final CopyOnWriteArrayList<C0NYZ> LJIIIZ;
    public final ConcurrentHashMap<String, AbstractC595720NYc> LJIIJ;
    public volatile boolean LJIIJJI;
    public final AtomicBoolean LJIIL;
    public final Object LJIILIIL;
    public final C01GW LJIILJJIL;
    public AnonymousClass0956 LJIILL;
    public final String LJIILLIIL;

    @Override // X.InterfaceC897330ZId
    public final String LIZ() {
        return ((C0NY7) this.LJI.getValue()).LIZ;
    }

    @Override // X.InterfaceC897330ZId
    public final Map<String, C595660NXw> LIZLLL() {
        Map mapLJIIZILJ;
        synchronized (this.LJIILIIL) {
            try {
                mapLJIIZILJ = C2097608Jq.LJIIZILJ(this.LJIIJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        List<C0NXK> listLJ = LJIILIIL().LIZIZ.LJ(C0NYU.LIZ(mapLJIIZILJ));
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJ, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : (ArrayList) listLJ) {
            linkedHashMap.put(((C0NXK) obj).LIZ, obj);
        }
        Collection collectionValues = mapLJIIZILJ.values();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(LJIIL((AbstractC595720NYc) it2.next(), linkedHashMap));
        }
        int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ2 >= 16 ? iLIZIZ2 : 16);
        for (Object obj2 : arrayList) {
            linkedHashMap2.put(((C595660NXw) obj2).LIZ, obj2);
        }
        return linkedHashMap2;
    }

    @Override // X.InterfaceC897330ZId
    public final void LJ() {
        if (!this.LJIIL.get()) {
            LJIIZILJ(new C0NYQ(this, null));
        } else {
            ((C0NXN) this.LJII.getValue()).LIZ("activity_status_client_error", new AwS588S0100000_9(this, 597));
            LJIIJJI(LJIILJJIL(), "activate after destroy", null);
        }
    }

    @Override // X.InterfaceC897330ZId
    public final void LJI() {
        if (this.LJIIL.get()) {
            return;
        }
        LJIIZILJ(new C0NYO(this, null));
    }

    @Override // X.InterfaceC897330ZId
    public final void LJII() {
        if (this.LJIIL.get()) {
            return;
        }
        LJIIZILJ(new C0NYR(this, null));
    }

    public final C0NX1 LJIILIIL() {
        return (C0NX1) this.LJ.getValue();
    }

    public final C0NXT LJIILJJIL() {
        return (C0NXT) this.LJFF.getValue();
    }

    @Override // X.InterfaceC897330ZId
    public final void destroy() {
        if (this.LJIIL.getAndSet(true)) {
            return;
        }
        this.LIZLLL.invoke();
        this.LJIIIZ.clear();
        LJIIZILJ(new C0NYP(this, null));
    }

    @Override // X.C0NXS
    public final String getTag() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC897330ZId
    public final void LJFF(List<? extends AbstractC595720NYc> list) {
        if (this.LJIIL.get()) {
            return;
        }
        LJIIZILJ(new C0NYM(this, list, null));
    }

    @Override // X.InterfaceC897330ZId
    public final void LJIIIIZZ(List<? extends AbstractC595720NYc> list) {
        if (this.LJIIL.get()) {
            return;
        }
        LJIIZILJ(new C0NYL(this, list, null));
    }

    @Override // X.InterfaceC897330ZId
    public final void LJIIIZ(List<String> list) {
        if (this.LJIIL.get()) {
            return;
        }
        LJIIZILJ(new C0NYN(this, list, null));
    }

    @Override // X.InterfaceC897330ZId
    public final void LJIIJ(C0NYY c0nyy) {
        List listLLIIII = C13LP.LLIIII(this.LJIIIZ);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLLIIII) {
            if (((C0NYZ) obj).LIZIZ.get() == c0nyy) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.LJIIIZ.remove(it2.next());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, X.C595660NXw> LJIILLIIL(java.util.List<X.C0NXK> r10) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NYK.LJIILLIIL(java.util.List):java.util.Map");
    }

    public final AnonymousClass0956 LJIIZILJ(Function1 function1) {
        return C23250099c.LIZLLL((InterfaceC497601wk) this.LJIILJJIL.getValue(), null, null, new C320001Ly(function1, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static C595660NXw LJIIL(AbstractC595720NYc abstractC595720NYc, Map map) {
        ?? arrayList;
        C595700NYa c595700NYa;
        List<String> list;
        String str = abstractC595720NYc.LIZ;
        if (abstractC595720NYc instanceof C595710NYb) {
            return new C595660NXw(str, (C0NXK) ((LinkedHashMap) map).get(((C595710NYb) abstractC595720NYc).LIZIZ), null, 4);
        }
        if ((abstractC595720NYc instanceof C595700NYa) && (c595700NYa = (C595700NYa) abstractC595720NYc) != null && (list = c595700NYa.LIZJ) != null) {
            arrayList = new ArrayList();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                Object obj = ((LinkedHashMap) map).get(it2.next());
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return new C595660NXw(str, null, arrayList, 2);
    }

    @Override // X.InterfaceC897330ZId
    public final void LIZIZ(boolean z, C0NYY c0nyy) {
        if (this.LJIIL.get()) {
            return;
        }
        CopyOnWriteArrayList<C0NYZ> copyOnWriteArrayList = this.LJIIIZ;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            Iterator<C0NYZ> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZIZ.get() == c0nyy) {
                    return;
                }
            }
        }
        this.LJIIIZ.add(new C0NYZ(new WeakReference(c0nyy), z));
    }

    @Override // X.C0NXS
    public final void LIZJ(C0NXT c0nxt, String str) {
        C0NXR.LIZ(this, c0nxt, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(kotlin.jvm.functions.Function0<? extends java.util.Map<java.lang.String, X.C595660NXw>> r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C0NYV
            if (r0 == 0) goto L82
            r6 = r12
            X.0NYV r6 = (X.C0NYV) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r1 = r6.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r5 = 1
            if (r0 == 0) goto L5e
            if (r0 != r5) goto L8b
            java.lang.Object r9 = r6.LLILLJJLI
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r2 = r6.LL
            java.util.Map r2 = (java.util.Map) r2
            X.C155000ia.LIZIZ(r1)
        L2a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r9.next()
            X.0NYZ r0 = (X.C0NYZ) r0
            java.lang.ref.WeakReference<X.0NYY> r8 = r0.LIZIZ
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L49
            X.01wk r4 = r10.LIZJ
            X.0NYS r3 = new X.0NYS
            r1 = 0
            r3.<init>(r8, r2, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r4, r1, r1, r3, r0)
            goto L2a
        L49:
            java.lang.Object r0 = r8.get()
            X.0NYY r0 = (X.C0NYY) r0
            if (r0 == 0) goto L2a
            r6.LL = r2
            r6.LLILLJJLI = r9
            r6.LLILZIL = r5
            java.lang.Object r0 = r0.k3(r2, r6)
            if (r0 != r7) goto L2a
            return r7
        L5e:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r11.invoke()
            java.util.Map r2 = (java.util.Map) r2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L70
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L70:
            X.0NXT r1 = r10.LJIILJJIL()
            java.lang.String r0 = r2.toString()
            X.C0NXR.LIZLLL(r10, r1, r0)
            java.util.concurrent.CopyOnWriteArrayList<X.0NYZ> r0 = r10.LJIIIZ
            java.util.Iterator r9 = r0.iterator()
            goto L2a
        L82:
            X.0NYV r6 = new X.0NYV
            r6.<init>(r10, r12)
            goto L12
        L88:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NYK.LJIILL(kotlin.jvm.functions.Function0, X.05Vn):java.lang.Object");
    }

    public final void LJIIJJI(C0NXT c0nxt, String str, Throwable th) {
        C0NXR.LIZJ(this, c0nxt, str, th);
    }

    public C0NYK(String str, C595450NXb c595450NXb, InterfaceC497601wk interfaceC497601wk, C595340NWq c595340NWq) {
        this.LIZ = str;
        this.LIZIZ = c595450NXb;
        this.LIZJ = interfaceC497601wk;
        this.LIZLLL = c595340NWq;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C0NY1(this));
        this.LJI = c01gwLIZIZ;
        this.LJII = C452501pT.LIZIZ(new C595630NXt(this));
        this.LJIIIIZZ = C452501pT.LIZIZ(new C595600NXq(this));
        this.LJIIIZ = new CopyOnWriteArrayList<>();
        this.LJIIJ = new ConcurrentHashMap<>();
        this.LJIIL = new AtomicBoolean(false);
        this.LJIILIIL = new Object();
        this.LJIILJJIL = C452501pT.LIZIZ(new C05MX());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Client][");
        sbLIZ.append(str);
        sbLIZ.append("][");
        sbLIZ.append(((C0NY7) c01gwLIZIZ.getValue()).LIZ);
        sbLIZ.append(']');
        this.LJIILLIIL = C2188811AlT.LIZIZ(sbLIZ);
        C0NXT c0nxtLJIILJJIL = LJIILJJIL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("create ActivityStatusClient(");
        sbLIZ2.append(str);
        sbLIZ2.append(") instance");
        C0NXR.LIZLLL(this, c0nxtLJIILJJIL, C2188811AlT.LIZIZ(sbLIZ2));
    }
}
