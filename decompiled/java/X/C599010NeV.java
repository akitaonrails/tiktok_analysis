package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS158S1100000_9;

/* JADX INFO: renamed from: X.0NeV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599010NeV implements InterfaceC600380Ngi {
    public final C599380Nf6 LIZ;
    public final C054G LIZIZ;
    public final ConcurrentHashMap<String, C598950NeP> LIZJ;
    public final ConcurrentHashMap<String, Set<C09AE>> LIZLLL;
    public final ConcurrentHashMap<String, InterfaceC598990NeT> LJ;
    public final Map<Object, C599030NeX> LJFF;
    public final C2252331DDr LJI;
    public final AnonymousClass0950 LJII;

    @Override // X.InterfaceC600380Ngi
    public final void LIZLLL() {
        C2296808zG.LIZJ(this.LIZIZ, null);
        for (Object obj : C13LP.LLIIII(((LinkedHashMap) this.LJFF).keySet())) {
            C599030NeX c599030NeX = (C599030NeX) ((LinkedHashMap) this.LJFF).get(obj);
            if (c599030NeX != null) {
                Iterator it2 = ((ConcurrentHashMap) c599030NeX.LIZIZ).values().iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((Set) it2.next()).iterator();
                    while (it3.hasNext()) {
                        ((C598560Ndm) it3.next()).LIZIZ.LIZIZ(null);
                    }
                }
                for (Object obj2 : c599030NeX.LIZLLL) {
                    this.LIZJ.remove(obj2);
                    Set<C09AE> set = this.LIZLLL.get(obj2);
                    if (set != null) {
                        Iterator<T> it4 = set.iterator();
                        while (it4.hasNext()) {
                            ((C09AE) it4.next()).LIZIZ(null);
                        }
                    }
                    this.LIZLLL.remove(obj2);
                }
            }
            this.LJFF.remove(obj);
        }
        this.LIZJ.clear();
        this.LIZLLL.clear();
        ((LinkedHashMap) this.LJFF).clear();
        this.LJ.clear();
    }

    public C599010NeV(C599380Nf6 c599380Nf6) {
        this.LIZ = c599380Nf6;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
        this.LIZJ = new ConcurrentHashMap<>();
        this.LIZLLL = new ConcurrentHashMap<>();
        this.LJ = new ConcurrentHashMap<>();
        this.LJFF = new LinkedHashMap();
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 64, null, 4);
        this.LJI = c2252331DDrLIZIZ;
        this.LJII = C09IC.LIZ(c2252331DDrLIZIZ);
    }

    @Override // X.InterfaceC600380Ngi
    public final void LIZIZ(InterfaceC634840OvC interfaceC634840OvC, String str) {
        C599030NeX c599030NeX = (C599030NeX) ((LinkedHashMap) this.LJFF).get(interfaceC634840OvC);
        if (c599030NeX == null || !c599030NeX.LIZLLL.contains(str)) {
            return;
        }
        Set<C09AE> set = this.LIZLLL.get(str);
        if (set != null) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                ((C09AE) it2.next()).LIZIZ(null);
            }
        }
        this.LIZLLL.remove(str);
        this.LIZJ.remove(str);
        Set<String> set2 = c599030NeX.LIZLLL;
        if (C19719512Dh.LJIIIIZZ(set2) && set2 != null) {
            set2.remove(str);
        }
        if (((ConcurrentHashMap) c599030NeX.LIZIZ).isEmpty() && c599030NeX.LIZLLL.isEmpty()) {
            this.LJFF.remove(interfaceC634840OvC);
        }
    }

    @Override // X.InterfaceC600380Ngi
    public final void LIZJ(Object obj, C599020NeW c599020NeW) {
        IECommerceHostService iECommerceHostService;
        Object obj2;
        long jCurrentTimeMillis;
        Number number;
        Long lValueOf;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("publishEvent: component=");
            sbLIZ.append(c599020NeW.LIZ);
            sbLIZ.append(" params=");
            sbLIZ.append(c599020NeW.LJLIIIL());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
        }
        Map<String, Object> map = c599020NeW.LIZJ;
        if (map != null) {
            obj2 = map.get("paap_start_time");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Number) && (number = (Number) obj2) != null && (lValueOf = Long.valueOf(number.longValue())) != null) {
            jCurrentTimeMillis = lValueOf.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        c599020NeW.LIZLLL = jCurrentTimeMillis;
        C599380Nf6 c599380Nf6 = this.LIZ;
        String str = c599020NeW.LIZ;
        EnumC599530NfL enumC599530NfL = EnumC599530NfL.EVENT;
        EnumC598910NeL enumC598910NeL = EnumC598910NeL.START;
        EnumC599040NeY enumC599040NeY = EnumC599040NeY.PUBLISH;
        c599380Nf6.getClass();
        C599380Nf6.LIZIZ(str, enumC599530NfL, enumC598910NeL, enumC599040NeY, obj, null, null, 0L);
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C01K5(new C598570Ndn(this, c599020NeW, null), null), 3);
    }

    @Override // X.InterfaceC600380Ngi
    public final void Q(InterfaceC634840OvC interfaceC634840OvC, String str) {
        Pd(interfaceC634840OvC, str, new AwS158S1100000_9(interfaceC634840OvC, str, 22));
    }

    @Override // X.InterfaceC600380Ngi
    public final void U0(Object obj, String str) {
        Set set;
        ConcurrentHashMap concurrentHashMap;
        Set set2;
        C599030NeX c599030NeX = (C599030NeX) ((LinkedHashMap) this.LJFF).get(obj);
        if (c599030NeX == null || (set = (Set) ((ConcurrentHashMap) c599030NeX.LIZIZ).get(str)) == null) {
            return;
        }
        Iterator it2 = C13LP.LLIIJI(set).iterator();
        while (it2.hasNext()) {
            ((C598560Ndm) it2.next()).LIZIZ.LIZIZ(null);
        }
        Map<String, Set<C598560Ndm>> map = c599030NeX.LIZIZ;
        if ((map instanceof ConcurrentHashMap) && (concurrentHashMap = (ConcurrentHashMap) map) != null && (set2 = (Set) concurrentHashMap.get(str)) != null) {
            set2.clear();
        }
        if (((ConcurrentHashMap) c599030NeX.LIZIZ).isEmpty() && c599030NeX.LIZLLL.isEmpty()) {
            this.LJFF.remove(obj);
        }
    }

    @Override // X.InterfaceC600380Ngi
    public final void LIZ(String str, Function2 function2, Object obj) {
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(this.LIZIZ, null, null, new C598860NeG(this, str, obj, function2, null), 3);
        C599030NeX c599030NeX = (C599030NeX) ((LinkedHashMap) this.LJFF).get(obj);
        if (c599030NeX == null) {
            c599030NeX = new C599030NeX();
            this.LJFF.put(obj, c599030NeX);
        }
        Set<C598560Ndm> setNewSetFromMap = c599030NeX.LIZ.get(str);
        if (setNewSetFromMap == null) {
            setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            c599030NeX.LIZ.put(str, setNewSetFromMap);
            if (setNewSetFromMap == null) {
                return;
            }
        }
        setNewSetFromMap.add(new C598560Ndm(function2, anonymousClass0956LIZLLL));
    }

    @Override // X.InterfaceC600380Ngi
    public final void Pd(Object obj, String str, Function0<? extends InterfaceC599000NeU> function0) {
        ConcurrentHashMap<String, C598950NeP> concurrentHashMap = this.LIZJ;
        C1DFH c1dfh = C0PEM.LIZ;
        concurrentHashMap.put(str, new C598950NeP(obj, function0, C2107308Nj.LIZ.LLIILII()));
        C599030NeX c599030NeX = (C599030NeX) ((LinkedHashMap) this.LJFF).get(obj);
        if (c599030NeX == null) {
            c599030NeX = new C599030NeX();
            this.LJFF.put(obj, c599030NeX);
        } else if (c599030NeX.LIZLLL.contains(str)) {
            C599380Nf6 c599380Nf6 = this.LIZ;
            EnumC599530NfL enumC599530NfL = EnumC599530NfL.ACTION;
            EnumC598910NeL enumC598910NeL = EnumC598910NeL.ERROR;
            EnumC599040NeY enumC599040NeY = EnumC599040NeY.REGISTER;
            String message = EnumC598920NeM.REPEAT_REGISTER_SAME_ACTION.getMessage();
            EnumC598920NeM enumC598920NeM = EnumC598920NeM.UNKNOWN_ERROR;
            c599380Nf6.getClass();
            C599380Nf6.LIZIZ(str, enumC599530NfL, enumC598910NeL, enumC599040NeY, obj, message, enumC598920NeM, 0L);
        }
        c599030NeX.LIZJ.add(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059 A[PHI: r1
      0x0059: PHI (r1v3 java.util.Set<X.09AE>) = (r1v2 java.util.Set<X.09AE>), (r1v5 java.util.Set<X.09AE>) binds: [B:7:0x0047, B:9:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC600380Ngi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r11, java.util.Map r12, java.util.Map r13, X.C600290NgZ r14) {
        /*
            r10 = this;
            r3 = r10
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0NeP> r0 = r3.LIZJ
            r4 = r11
            java.lang.Object r5 = r0.get(r4)
            X.0NeP r5 = (X.C598950NeP) r5
            r9 = 0
            r6 = r14
            if (r5 != 0) goto L2d
            X.0Nec r2 = new X.0Nec
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Action '"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "' not found"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = -1
            r2.<init>(r0, r1, r9)
            r6.LIZ(r2)
            return
        L2d:
            X.1DEx r0 = r5.LIZJ
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.0NeN r2 = new X.0NeN
            r8 = r13
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0 = 3
            X.0956 r2 = X.C23250099c.LIZLLL(r1, r9, r9, r2, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Set<X.09AE>> r0 = r3.LIZLLL
            java.lang.Object r1 = r0.get(r4)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 != 0) goto L59
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Set<X.09AE>> r0 = r3.LIZLLL
            r0.put(r4, r1)
            if (r1 == 0) goto L5c
        L59:
            r1.add(r2)
        L5c:
            kotlin.jvm.internal.AwS94S1200000_9 r1 = new kotlin.jvm.internal.AwS94S1200000_9
            r0 = 4
            r1.<init>(r3, r4, r2, r0)
            r2.LJII(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C599010NeV.LJ(java.lang.String, java.util.Map, java.util.Map, X.0NgZ):void");
    }

    @Override // X.InterfaceC600380Ngi
    public final void q2(int i, String str, String str2, Map map) {
        InterfaceC598990NeT interfaceC598990NeT = this.LJ.get(str);
        if (interfaceC598990NeT == null) {
            return;
        }
        if (i == 0) {
            interfaceC598990NeT.LIZIZ(new C599060Nea(map, 2));
        } else {
            if (str2 == null) {
                str2 = "Lynx action failed";
            }
            interfaceC598990NeT.LIZ(new C599080Nec(i, str2, map));
        }
        this.LJ.remove(str);
    }
}
