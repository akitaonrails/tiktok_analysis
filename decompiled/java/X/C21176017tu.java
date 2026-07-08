package X;

import Y.ARunnableS132S0100000_32;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS147S1200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17tu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21176017tu implements InterfaceC606320NqI {
    public WeakReference<InterfaceC1773310wFN> LJI;
    public final C01GW LJIIIZ;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(189));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(191));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(190));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(192));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(188));
    public final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());
    public final C21176217tw LJII = new C21176217tw();
    public volatile long LJIIIIZZ = 60000;

    public final ConcurrentHashMap<String, C21175817ts> LJIILIIL() {
        return (ConcurrentHashMap) this.LIZJ.getValue();
    }

    public final ConcurrentHashMap<String, InterfaceC21176417ty> LJIILJJIL() {
        return (ConcurrentHashMap) this.LIZIZ.getValue();
    }

    public C21176017tu() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 584));
        this.LJIIIZ = c01gwLIZIZ;
        if (C1773900wGK.LIZ()) {
            List<InterfaceC687370Qxj> list = C687360Qxi.LIZ;
            C687360Qxi.LIZ((C21176517tz) c01gwLIZIZ.getValue());
        }
    }

    public final void LJIILL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LJIIIIZZ;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C21176617u0 c21176617u0 : (CopyOnWriteArrayList) this.LIZLLL.getValue()) {
            if (Math.abs(jCurrentTimeMillis - c21176617u0.LIZIZ) > j) {
                linkedHashSet.add(c21176617u0);
            }
        }
        ((CopyOnWriteArrayList) this.LIZLLL.getValue()).removeAll(linkedHashSet);
    }

    @Override // X.InterfaceC606320NqI
    public final void LIZ(C1775130wIJ c1775130wIJ) {
        List list = (List) ((ConcurrentHashMap) this.LIZ.getValue()).get(c1775130wIJ.LIZ);
        if (list != null) {
            synchronized (list) {
                try {
                    list.remove(c1775130wIJ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC606320NqI
    public final void LIZIZ(C1775130wIJ c1775130wIJ) {
        if (Intrinsics.LJFF(LJIILJJIL().get(c1775130wIJ.LIZ), c1775130wIJ)) {
            LJIILJJIL().remove(c1775130wIJ.LIZ);
        }
    }

    public final Map<String, Object> LJIIL(Map<String, ? extends Object> map) {
        InterfaceC1773310wFN interfaceC1773310wFN;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        WeakReference<InterfaceC1773310wFN> weakReference = this.LJI;
        if (weakReference != null && (interfaceC1773310wFN = weakReference.get()) != null) {
            linkedHashMap.put("bridge_center_extra_page_context", interfaceC1773310wFN);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (linkedHashMap.isEmpty()) {
            return C2097608Jq.LJ();
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC606320NqI
    public final C1775130wIJ LJFF(String str, InterfaceC1775150wIL interfaceC1775150wIL) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        C1775130wIJ c1775130wIJ = new C1775130wIJ(str, interfaceC1775150wIL);
        if (LJIILJJIL().put(str, c1775130wIJ) != null) {
            C1771980wDE.LJ(EnumC599620NfU.METHOD, EnumC993140bx2.REGISTER_METHOD, EnumC993160bx4.REPEAT_REGISTER_SAME_METHOD, str, null);
        }
        return c1775130wIJ;
    }

    @Override // X.InterfaceC606320NqI
    public final C1775130wIJ LJIIIIZZ(String str, InterfaceC606370NqN interfaceC606370NqN) {
        Object objPutIfAbsent;
        if (str.length() == 0) {
            return null;
        }
        C1775130wIJ c1775130wIJ = new C1775130wIJ(str, interfaceC606370NqN);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LIZ.getValue();
        Object arrayList = concurrentHashMap.get(str);
        if (arrayList == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (arrayList = new ArrayList()))) != null) {
            arrayList = objPutIfAbsent;
        }
        List list = (List) arrayList;
        synchronized (list) {
            try {
                list.add(c1775130wIJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIILLIIL(str, c1775130wIJ);
        return c1775130wIJ;
    }

    @Override // X.InterfaceC606320NqI
    public final C1775130wIJ LJIIJ(InterfaceC634840OvC interfaceC634840OvC, String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        C1775130wIJ c1775130wIJ = new C1775130wIJ(interfaceC634840OvC, str);
        if (LJIILJJIL().put(str, c1775130wIJ) != null) {
            C1771980wDE.LJ(EnumC599620NfU.METHOD, EnumC993140bx2.REGISTER_METHOD, EnumC993160bx4.REPEAT_REGISTER_SAME_METHOD, str, null);
        }
        return c1775130wIJ;
    }

    @Override // X.InterfaceC606320NqI
    public final C1775130wIJ LJIIJJI(InterfaceC634840OvC interfaceC634840OvC, String str) {
        boolean z;
        Object objPutIfAbsent;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        C1775130wIJ c1775130wIJ = new C1775130wIJ(interfaceC634840OvC, str);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LIZ.getValue();
        Object arrayList = concurrentHashMap.get(str);
        if (arrayList == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (arrayList = new ArrayList()))) != null) {
            arrayList = objPutIfAbsent;
        }
        List list = (List) arrayList;
        synchronized (list) {
            try {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    InterfaceC21176417ty interfaceC21176417ty = (InterfaceC21176417ty) next;
                    if (Intrinsics.LJFF(str, interfaceC21176417ty.getName()) && interfaceC21176417ty.LIZJ(interfaceC634840OvC)) {
                        obj = next;
                        break;
                    }
                }
                if (((InterfaceC21176417ty) obj) == null) {
                    list.add(c1775130wIJ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIILLIIL(str, c1775130wIJ);
        return c1775130wIJ;
    }

    public final void LJIILLIIL(String str, C1775130wIJ c1775130wIJ) {
        if (((CopyOnWriteArrayList) this.LIZLLL.getValue()).isEmpty()) {
            return;
        }
        AwS147S1200000_32 awS147S1200000_32 = new AwS147S1200000_32(this, str, c1775130wIJ, 12);
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(this.LJFF, new ARunnableS132S0100000_32(awS147S1200000_32, 65));
        } else {
            awS147S1200000_32.invoke();
        }
    }

    @Override // X.InterfaceC606320NqI
    public final void LIZJ(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        Long l;
        Long l2;
        InterfaceC634840OvC interfaceC634840OvC;
        LynxView lynxView;
        AbstractC1773210wFD abstractC1773210wFD;
        C21175817ts c21175817ts = LJIILIIL().get(str);
        if (c21175817ts != null) {
            C21176217tw c21176217tw = this.LJII;
            C21176317tx c21176317tx = c21175817ts.LIZIZ;
            c21176217tw.getClass();
            c21176317tx.LJI = EnumC21166117sJ.FE;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
            Object obj = linkedHashMap.get("bridge_center_extra_lynx_item_vo");
            String templateUrl = null;
            if ((obj instanceof AbstractC1773210wFD) && (abstractC1773210wFD = (AbstractC1773210wFD) obj) != null) {
                c21176317tx.LJFF = abstractC1773210wFD.LJIIJJI();
            }
            Object obj2 = linkedHashMap.get("bridge_center_extra_bridge_center_context");
            if ((obj2 instanceof InterfaceC634840OvC) && (interfaceC634840OvC = (InterfaceC634840OvC) obj2) != null) {
                View view = interfaceC634840OvC.getView();
                if ((view instanceof LynxView) && (lynxView = (LynxView) view) != null) {
                    templateUrl = lynxView.getTemplateUrl();
                }
                c21176317tx.LJFF = templateUrl;
            }
            Object obj3 = linkedHashMap.get("t_handler_lynx_start");
            if ((obj3 instanceof Long) && (l2 = (Long) obj3) != null) {
                c21176317tx.LJIILLIIL = Long.valueOf(l2.longValue());
            }
            Object obj4 = linkedHashMap.get("t_handler_lynx_end");
            if ((obj4 instanceof Long) && (l = (Long) obj4) != null) {
                c21176317tx.LJIIZILJ = Long.valueOf(l.longValue());
            }
            c21175817ts.LIZIZ.LJIILL = Long.valueOf(System.currentTimeMillis());
            LJIILIIL().put(str, new C21175817ts(c21175817ts.LIZ, c21175817ts.LIZIZ, true));
            c21175817ts.LIZIZ.LJIJ = Long.valueOf(System.currentTimeMillis());
            c21175817ts.LIZ.LIZ(1, "success", map);
            c21175817ts.LIZIZ.LJII = 1;
            C21176317tx c21176317tx2 = c21175817ts.LIZIZ;
            c21176317tx2.LJIIIIZZ = "success";
            c21176317tx2.LJIJI = Long.valueOf(System.currentTimeMillis());
            C21176117tv c21176117tv = C21176117tv.LIZ;
            C21176317tx c21176317tx3 = c21175817ts.LIZIZ;
            EnumC21165817sG enumC21165817sG = EnumC21165817sG.METHOD;
            c21176117tv.getClass();
            C21176117tv.LIZ(c21176317tx3, enumC21165817sG);
        }
    }

    @Override // X.InterfaceC606320NqI
    public final void LJ(C1775140wIK c1775140wIK, Map map, C606330NqJ c606330NqJ) {
        LJII(c1775140wIK, 2000L, map, c606330NqJ, new C21176317tx());
    }

    @Override // X.InterfaceC606320NqI
    public final void LIZLLL(String str, Map map, Map map2, boolean z) {
        LinkedHashMap linkedHashMap;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        LJIIIZ(new C1775140wIK(str, linkedHashMap), z, map2, new C21176317tx());
    }

    @Override // X.InterfaceC606320NqI
    public final void LJIIIZ(C1775140wIK c1775140wIK, boolean z, Map<String, ? extends Object> map, C21176317tx c21176317tx) {
        int iValueOf;
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publishEvent, name=");
        sbLIZ.append(c1775140wIK.LIZ);
        sbLIZ.append(", isSticky=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZLLL();
        C21176217tw c21176217tw = this.LJII;
        EnumC21165817sG enumC21165817sG = EnumC21165817sG.EVENT;
        c21176217tw.getClass();
        C21176217tw.LIZ(c1775140wIK, enumC21165817sG, map, c21176317tx);
        if (c1775140wIK.LIZ.length() == 0) {
            return;
        }
        if (z) {
            ((CopyOnWriteArrayList) this.LIZLLL.getValue()).add(new C21176617u0(c1775140wIK, System.currentTimeMillis()));
        }
        Map<String, ? extends Object> mapLJIIL = LJIIL(map);
        c21176317tx.LJIL = Long.valueOf(System.currentTimeMillis());
        List list = (List) ((ConcurrentHashMap) this.LIZ.getValue()).get(c1775140wIK.LIZ);
        c21176317tx.LJJ = Long.valueOf(System.currentTimeMillis());
        if (list != null) {
            iValueOf = Integer.valueOf(list.size());
        } else {
            iValueOf = 0;
        }
        c21176317tx.LJIJJ = iValueOf;
        if (list != null) {
            synchronized (list) {
                try {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC21176417ty) it2.next()).LIZLLL(c1775140wIK, mapLJIIL);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        c21176317tx.LJJI = Long.valueOf(System.currentTimeMillis());
        C21176117tv c21176117tv = C21176117tv.LIZ;
        EnumC21165817sG enumC21165817sG2 = EnumC21165817sG.EVENT;
        c21176117tv.getClass();
        C21176117tv.LIZ(c21176317tx, enumC21165817sG2);
    }

    @Override // X.InterfaceC606320NqI
    public final void LJI(String str, Map<String, ? extends Object> map, C0NOB c0nob, Long l, Map<String, ? extends Object> map2) {
        LinkedHashMap linkedHashMap;
        long jLongValue;
        C0NOB c0nob2 = c0nob;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        C1775140wIK c1775140wIK = new C1775140wIK(str, linkedHashMap);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 2000;
        }
        if (c0nob2 == null) {
            c0nob2 = new C0NOB() { // from class: X.0w7E
                @Override // X.C0NOB
                public final void LIZ(int i, String str2, Map<String, ? extends Object> map3) {
                }
            };
        }
        LJII(c1775140wIK, jLongValue, map2, c0nob2, new C21176317tx());
    }

    @Override // X.InterfaceC606320NqI
    public final void LJII(C1775140wIK c1775140wIK, long j, Map<String, ? extends Object> map, C0NOB c0nob, C21176317tx c21176317tx) {
        boolean z;
        Object c098200Yq;
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invokeMethod, method=");
        sbLIZ.append(c1775140wIK.LIZ);
        sbLIZ.append(" timeout=");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZLLL();
        C21176217tw c21176217tw = this.LJII;
        EnumC21165817sG enumC21165817sG = EnumC21165817sG.METHOD;
        c21176217tw.getClass();
        C21176217tw.LIZ(c1775140wIK, enumC21165817sG, map, c21176317tx);
        if (c1775140wIK.LIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (z) {
            c0nob.LIZ(0, "empty method name", null);
            this.LJII.getClass();
            c21176317tx.LJII = 0;
            c21176317tx.LJIIIIZZ = "empty method name";
            C21176117tv.LIZ.getClass();
            C21176117tv.LIZ(c21176317tx, enumC21165817sG);
            return;
        }
        c21176317tx.LJIIL = Long.valueOf(System.currentTimeMillis());
        InterfaceC21176417ty interfaceC21176417ty = LJIILJJIL().get(c1775140wIK.LIZ);
        if (interfaceC21176417ty == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("no subscriber when invoking method = ");
            sbLIZ2.append(c1775140wIK.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c0nob.LIZ(0, strLIZIZ, null);
            this.LJII.getClass();
            c21176317tx.LJII = 0;
            c21176317tx.LJIIIIZZ = strLIZIZ;
            C21176117tv.LIZ.getClass();
            C21176117tv.LIZ(c21176317tx, enumC21165817sG);
            EnumC599620NfU enumC599620NfU = EnumC599620NfU.METHOD;
            EnumC993140bx2 enumC993140bx2 = EnumC993140bx2.CALL_METHOD;
            EnumC993160bx4 enumC993160bx4 = EnumC993160bx4.CALL_A_UNREGISTER_METHOD;
            String str = c1775140wIK.LIZ;
            try {
                c098200Yq = C1741890vQh.LJIIIIZZ(c1775140wIK.LIZIZ);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            C1771980wDE.LJ(enumC599620NfU, enumC993140bx2, enumC993160bx4, str, (String) obj);
            return;
        }
        c21176317tx.LJIILIIL = Long.valueOf(System.currentTimeMillis());
        String string = UUID.randomUUID().toString();
        C21175817ts c21175817ts = new C21175817ts(c0nob, c21176317tx, false);
        LJIILIIL().put(string, c21175817ts);
        C1775140wIK c1775140wIK2 = new C1775140wIK(c1775140wIK.LIZ, c1775140wIK.LIZIZ, C2097908Jt.LIZJ(new Pair("callbackId", string)));
        Map<String, ? extends Object> mapLJIIL = LJIIL(map);
        c21176317tx.LJIILJJIL = Long.valueOf(System.currentTimeMillis());
        if (interfaceC21176417ty.LJ()) {
            interfaceC21176417ty.LIZLLL(c1775140wIK2, mapLJIIL);
        } else if (interfaceC21176417ty.LIZ()) {
            interfaceC21176417ty.LIZIZ(c1775140wIK2, mapLJIIL, new C21175917tt(c21176317tx, this, string, c21175817ts, c0nob));
        }
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C21175717tr(j, this, string, c1775140wIK, c1775140wIK2, c21176317tx, null), 3);
    }
}
