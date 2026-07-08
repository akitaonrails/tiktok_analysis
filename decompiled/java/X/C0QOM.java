package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QOM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QOM {
    public static final C0QOM LIZ = new C0QOM();
    public static final Gson LIZIZ = C7740030o.LIZ().getGson();
    public static final HashSet<C0QRS> LIZJ = new HashSet<>();
    public static final HashSet<C0QOL> LIZLLL;
    public static final HashSet<String> LJ;
    public static final AtomicBoolean LJFF;
    public static final Object LJI;

    static {
        HashSet<C0QOL> hashSetLIZJ = C093Y.LIZJ(C0QOJ.LIZ, C0QOK.LIZ, C670360QRe.LIZ, C686520QwM.LIZ, C663620Q1g.LIZ);
        LIZLLL = hashSetLIZJ;
        if (C287880BQc.LIZ()) {
            hashSetLIZJ.add(C670370QRf.LIZ);
        }
        LJ = new HashSet<>();
        LJFF = new AtomicBoolean(false);
        LJI = new Object();
    }

    public static void LIZJ(Function1 function1) {
        C0QRS c0qrs = new C0QRS();
        function1.invoke(c0qrs);
        LIZJ.add(c0qrs);
        try {
            LJ.addAll(c0qrs.LIZ.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static String LIZ(LinkedList linkedList, Gson gson) {
        C0Q3E.LJI().yY1().LIZ(new C682600Qq2(linkedList));
        InterfaceC1618170sD9 interfaceC1618170sD9LIZJ = C0Q3E.LJI().yY1().LIZJ();
        interfaceC1618170sD9LIZJ.getClass();
        try {
            return gson.LJIILL(interfaceC1618170sD9LIZJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static void LIZIZ(C0QOM c0qom, final String str, JSONObject jSONObject, Map map, int i) {
        final JSONObject jSONObject2 = jSONObject;
        final Map map2 = null;
        if ((i & 2) != 0) {
            jSONObject2 = null;
        }
        if ((i & 4) == 0) {
            map2 = map;
        }
        c0qom.getClass();
        if (Intrinsics.LJFF("search", str)) {
            if (jSONObject2 != null) {
                boolean z = C0PYW.LIZ;
                jSONObject2.put("launch_duration", String.valueOf(System.currentTimeMillis() - C0PYW.LIZIZ));
                jSONObject2.put("search_count", String.valueOf(C0PYW.LIZJ));
            }
            if (map2 != null) {
                boolean z2 = C0PYW.LIZ;
                map2.put("launch_duration", String.valueOf(System.currentTimeMillis() - C0PYW.LIZIZ));
                map2.put("search_count", String.valueOf(C0PYW.LIZJ));
            }
        }
        AtomicBoolean atomicBoolean = LJFF;
        if (!atomicBoolean.get()) {
            synchronized (LJI) {
                try {
                    if (!atomicBoolean.get()) {
                        Iterator<C0QOL> it2 = LIZLLL.iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZ();
                        }
                        LJFF.set(true);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (LJ.contains(str)) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0QRO
                public final void LIZ() {
                    String strLIZJ;
                    HashSet<C0QRS> hashSet = C0QOM.LIZJ;
                    String str2 = str;
                    JSONObject jSONObject3 = jSONObject2;
                    Map<String, String> map3 = map2;
                    long j = jCurrentTimeMillis;
                    for (C0QRS c0qrs : hashSet) {
                        if (c0qrs.LIZ.LIZ.contains(str2)) {
                            if (jSONObject3 == null || (strLIZJ = C0QRR.LIZLLL(jSONObject3)) == null) {
                                strLIZJ = map3 != null ? C0QRR.LIZJ(map3) : null;
                            }
                            C0QRP c0qrp = c0qrs.LIZ;
                            if (!c0qrp.LIZIZ || C13LP.LJJJJ(strLIZJ, c0qrp.LIZJ)) {
                                EnumC686550QwP enumC686550QwPInvoke = c0qrs.LIZJ.invoke(str2, jSONObject3, map3);
                                C0QRW c0qrwInvoke = c0qrs.LIZIZ.invoke(enumC686550QwPInvoke, str2, jSONObject3, map3);
                                if ((jSONObject3 == null || C0QRR.LIZIZ(jSONObject3) == null) && map3 != null) {
                                    C0QRR.LIZ(map3);
                                }
                                c0qrs.LIZLLL.invoke(str2, new C0QRQ(j, enumC686550QwPInvoke, c0qrwInvoke), jSONObject3, map3);
                            }
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SearchBehaviorSignalProcessor@78b7.handleLancetEventV3$3");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SearchBehaviorSignalProcessor@78b7.handleLancetEventV3$3");
                }
            });
        }
    }
}
