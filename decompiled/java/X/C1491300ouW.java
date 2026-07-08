package X;

import com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeClient;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.AwS60S1300000_23;
import kotlin.jvm.internal.AwS73S1000000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ouW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491300ouW implements InterfaceC1491580ouy {
    public static final String[] LJI = {"page_bid_from_app", "page_bid_from_url", "page_bid_from_native"};
    public static final String[] LJII = {"page_pid_from_app", "page_pid_from_url"};
    public SparkTracingNativeClient LIZJ;
    public C1491330ouZ LIZLLL;
    public final C1491260ouS<String, C1491290ouV> LIZ = new C1491260ouS<>();
    public final List<C1491350oub> LIZIZ = new ArrayList();
    public final Set<String> LJ = new LinkedHashSet();
    public boolean LJFF = true;

    @Override // X.InterfaceC1491580ouy
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1491580ouy
    public final void LJI(String str, boolean z) {
    }

    @Override // X.InterfaceC1491580ouy
    public final void LJIIIIZZ(String str) {
    }

    public final Set<String> LJIJJ() {
        Object c098200Yq;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1491260ouS<String, C1491290ouV> c1491260ouS = this.LIZ;
        c1491260ouS.getClass();
        try {
            c1491260ouS.LIZJ.readLock().tryLock(100L, TimeUnit.MILLISECONDS);
            try {
                boolean zIsEmpty = c1491260ouS.LIZIZ.isEmpty();
                c1491260ouS.LIZJ.readLock().unlock();
                c098200Yq = Boolean.valueOf(zIsEmpty);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1491260ouS.LIZJ.readLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.TRUE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        if (((Boolean) c098200Yq).booleanValue()) {
            return linkedHashSet;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ.LIZ(new AwS389S0200000_23(this, (C1491300ouW) linkedHashMap, (Map<String, Boolean>) 14));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            if (!((Boolean) entry.getValue()).booleanValue()) {
                linkedHashSet.add(key);
            }
        }
        return linkedHashSet;
    }

    @Override // X.InterfaceC1491580ouy
    public final String snapshot() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        this.LIZ.LIZ(new AwS602S0100000_23(jSONObject3, 37));
        jSONObject2.putOpt("instances", jSONObject3);
        jSONObject.putOpt("REPOSITORY", jSONObject2);
        return C786410Ut5.J3(jSONObject);
    }

    @Override // X.InterfaceC1491580ouy
    public final Map<String, Object> LIZIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            LJIJ(str, linkedHashMap, new LinkedHashSet(), 1);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linkedHashMap;
        }
    }

    @Override // X.InterfaceC1491580ouy
    public final String[] LIZLLL(String str) {
        Map map;
        C1491260ouS<String, C1491290ouV> c1491260ouS = this.LIZ;
        AwS73S1000000_23 awS73S1000000_23 = new AwS73S1000000_23(str, 9);
        c1491260ouS.getClass();
        try {
            c1491260ouS.LIZJ.readLock().tryLock(100L, TimeUnit.MILLISECONDS);
            try {
                C1491270ouT c1491270ouT = c1491260ouS.LIZIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Object, Object> entry : c1491270ouT.entrySet()) {
                    if (((Boolean) awS73S1000000_23.invoke(entry)).booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                c1491260ouS.LIZJ.readLock().unlock();
                map = linkedHashMap;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1491260ouS.LIZJ.readLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            Object c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
            Object linkedHashMap2 = new LinkedHashMap();
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = linkedHashMap2;
            }
            map = (Map) c098200Yq;
        }
        Object[] array = map.keySet().toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final C1491290ouV LJIIZILJ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // X.InterfaceC1491580ouy
    public final void LIZ(final String str, final boolean z) {
        C1491570oux c1491570oux = C1491570oux.LIZ;
        Runnable runnable = new Runnable() { // from class: X.0ouY
            /* JADX WARN: Removed duplicated region for block: B:30:0x0161 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:3:0x0011, B:5:0x0017, B:7:0x001b, B:9:0x001f, B:11:0x00ea, B:13:0x00ee, B:15:0x00f6, B:16:0x00fe, B:18:0x0104, B:20:0x0110, B:23:0x0119, B:24:0x012c, B:26:0x0132, B:27:0x0146, B:29:0x014a, B:34:0x017b, B:30:0x0161, B:31:0x0169, B:33:0x016f), top: B:39:0x0011 }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x016f A[Catch: all -> 0x0181, LOOP:2: B:31:0x0169->B:33:0x016f, LOOP_END, TryCatch #0 {all -> 0x0181, blocks: (B:3:0x0011, B:5:0x0017, B:7:0x001b, B:9:0x001f, B:11:0x00ea, B:13:0x00ee, B:15:0x00f6, B:16:0x00fe, B:18:0x0104, B:20:0x0110, B:23:0x0119, B:24:0x012c, B:26:0x0132, B:27:0x0146, B:29:0x014a, B:34:0x017b, B:30:0x0161, B:31:0x0169, B:33:0x016f), top: B:39:0x0011 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 401
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1491320ouY.run():void");
            }
        };
        c1491570oux.getClass();
        BPEAHandler bPEAHandler = C1491570oux.LJII;
        if (bPEAHandler != null) {
            C786410Ut5.LJLIIL(1500L, bPEAHandler, runnable);
        }
    }

    @Override // X.InterfaceC1491580ouy
    public final C1491690ov9 LJFF(String str, String str2) {
        return new C1491690ov9(28, 0L, str, str2, false, false);
    }

    @Override // X.InterfaceC1491580ouy
    public final String LJIIIZ(String str, String str2) {
        return C786410Ut5.J3(new JSONObject());
    }

    @Override // X.InterfaceC1491580ouy
    public final boolean LJIIJ(String str, EnumC1491540ouu enumC1491540ouu) {
        if (!this.LJFF) {
            return true;
        }
        return this.LJ.contains(str);
    }

    @Override // X.InterfaceC1491580ouy
    public final String LJIIJJI(String str, String str2) {
        return C786410Ut5.J3(new JSONObject());
    }

    public final boolean LJIJJLI(String str, Map<String, Boolean> map) {
        Boolean bool = map.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        C013C c013c = new C013C();
        C1491290ouV c1491290ouVLIZIZ = this.LIZ.LIZIZ(str);
        if (c1491290ouVLIZIZ != null) {
            if (!c1491290ouVLIZIZ.LIZJ && !c1491290ouVLIZIZ.LIZLLL) {
                this.LIZ.LIZ(new AwS60S1300000_23(str, (String) this, (C1491300ouW) map, (Map<String, Boolean>) c013c, (C013C) 0));
            } else {
                c013c.element = true;
            }
        }
        map.put(str, Boolean.valueOf(c013c.element));
        return c013c.element;
    }

    @Override // X.InterfaceC1491580ouy
    public final void LJII(String str, String str2, EnumC1491500ouq enumC1491500ouq) {
        C1491290ouV c1491290ouVLJIIZILJ;
        int i = C1491490oup.LIZ[enumC1491500ouq.ordinal()];
        if (i != 1) {
            if (i == 2 && (c1491290ouVLJIIZILJ = LJIIZILJ(str)) != null) {
                c1491290ouVLJIIZILJ.LJ.remove(str2);
                return;
            }
            return;
        }
        C1491290ouV c1491290ouVLJIIZILJ2 = LJIIZILJ(str);
        if (c1491290ouVLJIIZILJ2 == null) {
            return;
        }
        c1491290ouVLJIIZILJ2.LJ.add(str2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|(2:36|2)|(10:6|(3:7|(4:9|(2:12|10)|38|13)|(1:15)(0))|16|19|(1:21)|22|(1:(2:26|(1:28)(1:39)))(0)|29|32|33)(0)|34|16|19|(0)|22|(2:24|(3:26|(0)(0)|28))(0)|29|32|33) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r4 = new X.C098200Yq(r0);
        X.C189200o6.m2constructorimpl(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c A[LOOP:2: B:26:0x008f->B:28:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e A[EDGE_INSN: B:39:0x009e->B:29:0x009e BREAK  A[LOOP:2: B:26:0x008f->B:28:0x009c], SYNTHETIC] */
    @Override // X.InterfaceC1491580ouy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.C1491510our r9, X.C1491770ovH r10, X.C1491760ovG r11) {
        /*
            r8 = this;
            boolean r0 = r9.LIZ     // Catch: java.lang.Throwable -> La7
            r8.LJFF = r0     // Catch: java.lang.Throwable -> La7
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> La7
            r2.<init>(r0)     // Catch: java.lang.Throwable -> La7
            X.0ouZ r1 = new X.0ouZ     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = "bid_allow_list"
            java.lang.Object r0 = r2.opt(r0)     // Catch: java.lang.Throwable -> La7
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La7
            r8.LIZLLL = r1     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = "mdms"
            org.json.JSONArray r7 = r2.optJSONArray(r0)     // Catch: java.lang.Throwable -> La7
            r5 = 0
            if (r7 == 0) goto L65
            int r6 = r7.length()     // Catch: java.lang.Throwable -> La7
            if (r6 <= 0) goto L65
            r0 = 0
        L28:
            int r4 = r0 + 1
            org.json.JSONObject r0 = r7.optJSONObject(r0)     // Catch: java.lang.Throwable -> La7
            X.0oub r3 = X.C1491340oua.LIZ(r0)     // Catch: java.lang.Throwable -> La7
            X.0ouc r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> La7
            java.util.List<java.lang.String> r0 = r0.LIZ     // Catch: java.lang.Throwable -> La7
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> La7
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> La7
            r0 = r0 ^ 1
            if (r0 != 0) goto L61
            X.0ouc r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> La7
            java.util.Set<java.lang.String> r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> La7
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> La7
        L48:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L5a
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> La7
            java.util.Set<java.lang.String> r0 = r8.LJ     // Catch: java.lang.Throwable -> La7
            r0.add(r1)     // Catch: java.lang.Throwable -> La7
            goto L48
        L5a:
            java.util.List<X.0oub> r0 = r8.LIZIZ     // Catch: java.lang.Throwable -> La7
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> La7
            r0.add(r3)     // Catch: java.lang.Throwable -> La7
        L61:
            if (r4 >= r6) goto L65
            r0 = r4
            goto L28
        L65:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L72
            java.lang.String r0 = r9.getReferencesUsed()     // Catch: java.lang.Throwable -> L72
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L72
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> L72
            goto L7e
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La7
            X.00Yq r4 = new X.00Yq     // Catch: java.lang.Throwable -> La7
            r4.<init>(r0)     // Catch: java.lang.Throwable -> La7
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> La7
        L7e:
            boolean r0 = X.C189200o6.m7isFailureimpl(r4)     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L85
            r4 = 0
        L85:
            org.json.JSONArray r4 = (org.json.JSONArray) r4     // Catch: java.lang.Throwable -> La7
            if (r4 == 0) goto L9e
            int r3 = r4.length()     // Catch: java.lang.Throwable -> La7
            if (r3 <= 0) goto L9e
        L8f:
            int r2 = r5 + 1
            java.util.Set<java.lang.String> r1 = r8.LJ     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = r4.optString(r5)     // Catch: java.lang.Throwable -> La7
            r1.add(r0)     // Catch: java.lang.Throwable -> La7
            if (r2 >= r3) goto L9e
            r5 = r2
            goto L8f
        L9e:
            r11.onInit()     // Catch: java.lang.Throwable -> La7
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> La7
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> La7
            goto Lb3
        La7:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        Lb3:
            r8.LIZJ = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1491300ouW.LJIIL(X.0our, X.0ovH, X.0ovG):void");
    }

    @Override // X.InterfaceC1491580ouy
    public final Object LJIILL(String str, String str2, boolean z) {
        Object c098200Yq;
        try {
            c098200Yq = LJIJI(str, str2, z, new LinkedHashSet(), 1);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return null;
        }
        return c098200Yq;
    }

    public static String LJIILLIIL(String str, String str2, Map map, String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str3 = strArr[i];
            i++;
            Object obj = ((LinkedHashMap) map).get(str3);
            if (map.containsKey(str3) && obj != null && (obj instanceof String) && !Intrinsics.LJFF(obj, str)) {
                return (String) obj;
            }
        }
        return str2;
    }

    @Override // X.InterfaceC1491580ouy
    public final void LJ(String str, Map<?, ?> map, EnumC1491540ouu enumC1491540ouu, EnumC1491530out enumC1491530out) {
        C1491290ouV c1491290ouVLJIIZILJ;
        if (!map.isEmpty() && (c1491290ouVLJIIZILJ = LJIIZILJ(str)) != null) {
            Map<String, Object> map2 = c1491290ouVLJIIZILJ.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(C1955407lI.LIZJ(String.valueOf(entry.getKey())), entry.getValue());
            }
            map2.putAll(linkedHashMap);
        }
    }

    @Override // X.InterfaceC1491580ouy
    public final void LJIILJJIL(long j, String str, boolean z, boolean z2) {
        C1491290ouV c1491290ouVLJIIZILJ = LJIIZILJ(str);
        if (c1491290ouVLJIIZILJ == null) {
            this.LIZ.LIZJ(str, new C1491290ouV(new ConcurrentHashMap(), z2, z));
        } else {
            c1491290ouVLJIIZILJ.LIZIZ = z2;
            this.LIZ.LIZJ(str, c1491290ouVLJIIZILJ);
        }
    }

    public final void LJIJ(String str, Map<String, Object> map, Set<String> set, int i) {
        if (i <= 8 && !set.contains(str)) {
            set.add(str);
            C1491290ouV c1491290ouVLJIIZILJ = LJIIZILJ(str);
            if (c1491290ouVLJIIZILJ == null) {
                return;
            }
            Iterator<String> it2 = c1491290ouVLJIIZILJ.LJ.iterator();
            while (it2.hasNext()) {
                LJIJ(it2.next(), map, set, i + 1);
            }
            map.putAll(c1491290ouVLJIIZILJ.LIZ);
        }
    }

    @Override // X.InterfaceC1491580ouy
    public final void LJIILIIL(String str, String str2, Object obj, EnumC1491540ouu enumC1491540ouu, EnumC1491530out enumC1491530out) {
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            String str3 = (String) obj;
            if (str3.length() > 4096) {
                obj = str3.substring(0, 4095);
            }
        }
        C1491290ouV c1491290ouVLIZIZ = this.LIZ.LIZIZ(str);
        if (c1491290ouVLIZIZ != null && c1491290ouVLIZIZ.LIZ.size() < 256) {
            c1491290ouVLIZIZ.LIZ.put(C1955407lI.LIZJ(str2), obj);
        }
    }

    public final Object LJIJI(String str, String str2, boolean z, Set<String> set, int i) {
        if (i > 8 || set.contains(str)) {
            return null;
        }
        set.add(str);
        C1491290ouV c1491290ouVLJIIZILJ = LJIIZILJ(str);
        if (c1491290ouVLJIIZILJ == null) {
            return null;
        }
        Object obj = c1491290ouVLJIIZILJ.LIZ.get(str2);
        if (z && obj == null) {
            Iterator<String> it2 = c1491290ouVLJIIZILJ.LJ.iterator();
            while (it2.hasNext()) {
                Object objLJIJI = LJIJI(it2.next(), str2, z, set, i + 1);
                if (objLJIJI != null) {
                    return objLJIJI;
                }
            }
            return null;
        }
        return obj;
    }
}
