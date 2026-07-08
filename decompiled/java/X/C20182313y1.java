package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13y1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20182313y1 {
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static boolean LJI;
    public static boolean LJII;
    public static InterfaceC20182813y6 LJIIIIZZ;
    public final String LIZ;
    public final Map<String, C20182413y2> LIZIZ = new LinkedHashMap();
    public final Map<String, C20182413y2> LIZJ = new LinkedHashMap();
    public final List<String> LIZLLL = new ArrayList();
    public final List<C20182413y2> LJ = new ArrayList();

    public final synchronized void LJFF() {
        ((ArrayList) this.LIZLLL).add("endSection");
        ((ArrayList) this.LJ).add(LIZLLL("endSection"));
    }

    public final synchronized void LJII() {
        List<C20182413y2> list;
        StringBuilder sb;
        InterfaceC20182813y6 interfaceC20182813y6;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        try {
            if (LJII) {
                sb = new StringBuilder();
                C20181413xs.LIZ("", sb);
                C20181413xs.LIZ("┌────────────────────────────────────────────────────────────────────────────────────────────────────", sb);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("│ ");
                sbLIZ.append(this.LIZ);
                C20181413xs.LIZ(C2188811AlT.LIZIZ(sbLIZ), sb);
                C20181413xs.LIZ("├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄", sb);
            } else {
                sb = null;
            }
            Iterator it2 = ((ArrayList) this.LJ).iterator();
            if (it2.hasNext()) {
                C20182413y2 c20182413y2 = (C20182413y2) it2.next();
                while (it2.hasNext()) {
                    C20182413y2 c20182413y22 = (C20182413y2) it2.next();
                    if (!c20182413y2.LIZ.equals("endSection")) {
                        String str = c20182413y2.LIZ;
                        long j = c20182413y22.LIZIZ - c20182413y2.LIZIZ;
                        c20182413y2.LIZIZ = j;
                        long j2 = c20182413y22.LIZJ - c20182413y2.LIZJ;
                        c20182413y2.LIZJ = j2;
                        LIZIZ(j, j2, str, jSONObject);
                        String str2 = c20182413y2.LIZ;
                        long j3 = c20182413y2.LIZLLL;
                        long j4 = c20182413y22.LIZLLL;
                        c20182413y2.LJ = j4;
                        arrayList.add(new C20182513y3(str2, j3, j4));
                        if (LJII && sb != null) {
                            C20181413xs.LIZ("│__/ " + c20182413y2.LIZ + ": wall duration = " + c20182413y2.LIZIZ + "ms, cpu duration = " + c20182413y2.LIZJ + "ms", sb);
                        }
                        LJI(1, sb, c20182413y2, jSONObject, arrayList);
                    }
                    c20182413y2 = c20182413y22;
                }
            }
            Iterator it3 = ((LinkedHashMap) this.LIZJ).entrySet().iterator();
            while (it3.hasNext()) {
                C20182413y2 c20182413y23 = (C20182413y2) ((Map.Entry) it3.next()).getValue();
                LIZIZ(c20182413y23.LIZIZ, c20182413y23.LIZJ, c20182413y23.LIZ, jSONObject);
                arrayList.add(new C20182513y3(c20182413y23.LIZ, c20182413y23.LIZLLL, c20182413y23.LJ));
                if (LJII && sb != null) {
                    C20181413xs.LIZ("│__/ " + c20182413y23.LIZ + ": wall duration = " + c20182413y23.LIZIZ + "ms, cpu duration = " + c20182413y23.LIZJ + "ms", sb);
                }
            }
            if (LJI && (interfaceC20182813y6 = LJIIIIZZ) != null) {
                C20182713y5.LIZ(this.LIZ, arrayList, jSONObject);
            }
            if (LJII) {
                C20181413xs.LIZ("└────────────────────────────────────────────────────────────────────────────────────────────────────", sb);
            }
            ((LinkedHashMap) this.LIZIZ).clear();
            ((LinkedHashMap) this.LIZJ).clear();
            ((ArrayList) this.LIZLLL).clear();
            list = this.LJ;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                ((LinkedHashMap) this.LIZIZ).clear();
                ((LinkedHashMap) this.LIZJ).clear();
                ((ArrayList) this.LIZLLL).clear();
                list = this.LJ;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                ((LinkedHashMap) this.LIZIZ).clear();
                ((LinkedHashMap) this.LIZJ).clear();
                ((ArrayList) this.LIZLLL).clear();
                ((ArrayList) this.LJ).clear();
                throw th2;
            }
        }
        ((ArrayList) list).clear();
    }

    public C20182313y1(String str) {
        this.LIZ = str;
    }

    public static C20182313y1 LIZJ(String str) {
        if (LJFF.get()) {
            return new C20182313y1(str);
        }
        throw new IllegalStateException("Initialize the TimeLogger first");
    }

    public static C20182413y2 LIZLLL(String str) {
        return new C20182413y2(str, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis(), System.currentTimeMillis());
    }

    public final synchronized C20182413y2 LIZ(String str) {
        if (((ArrayList) this.LIZLLL).contains(str)) {
            return (C20182413y2) ListProtector.get(this.LJ, ((ArrayList) this.LIZLLL).indexOf(str));
        }
        C20182413y2 c20182413y2LIZLLL = LIZLLL(str);
        ((ArrayList) this.LIZLLL).add(str);
        ((ArrayList) this.LJ).add(c20182413y2LIZLLL);
        return c20182413y2LIZLLL;
    }

    public static void LIZIZ(long j, long j2, String str, JSONObject jSONObject) throws JSONException {
        jSONObject.put(str, j);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(cpu)");
        sbLIZ.append(str);
        jSONObject.put(C2188811AlT.LIZIZ(sbLIZ), j2);
    }

    public final synchronized void LJ(long j, long j2, long j3, String str) {
        if (!this.LIZJ.containsKey(str)) {
            C20182413y2 c20182413y2LIZLLL = LIZLLL(str);
            c20182413y2LIZLLL.LIZIZ = j;
            c20182413y2LIZLLL.LIZJ = 0L;
            c20182413y2LIZLLL.LIZLLL = j2;
            c20182413y2LIZLLL.LJ = j3;
            this.LIZJ.put(str, c20182413y2LIZLLL);
        }
    }

    public static void LJI(int i, StringBuilder sb, C20182413y2 c20182413y2, JSONObject jSONObject, List list) throws JSONException {
        Iterator it2 = ((ArrayList) c20182413y2.LJI).iterator();
        if (it2.hasNext()) {
            C20182413y2 c20182413y22 = (C20182413y2) it2.next();
            while (it2.hasNext()) {
                C20182413y2 c20182413y23 = (C20182413y2) it2.next();
                if (!c20182413y22.LIZ.equals("endSubphase")) {
                    String str = c20182413y22.LIZ;
                    long j = c20182413y23.LIZIZ - c20182413y22.LIZIZ;
                    c20182413y22.LIZIZ = j;
                    long j2 = c20182413y23.LIZJ - c20182413y22.LIZJ;
                    c20182413y22.LIZJ = j2;
                    LIZIZ(j, j2, str, jSONObject);
                    String str2 = c20182413y22.LIZ;
                    long j3 = c20182413y22.LIZLLL;
                    long j4 = c20182413y23.LIZLLL;
                    c20182413y22.LJ = j4;
                    ((ArrayList) list).add(new C20182513y3(str2, j3, j4));
                    if (LJII && sb != null) {
                        StringBuilder sb2 = new StringBuilder();
                        for (int i2 = 0; i2 < i; i2++) {
                            sb2.append("____");
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append((char) 9474);
                        sbLIZ.append(sb2.toString());
                        sbLIZ.append("__/ ");
                        sbLIZ.append(c20182413y22.LIZ);
                        sbLIZ.append(":");
                        sbLIZ.append("wall duration = ");
                        sbLIZ.append(c20182413y22.LIZIZ);
                        sbLIZ.append("ms, cpu duration = ");
                        sbLIZ.append(c20182413y22.LIZJ);
                        sbLIZ.append("ms");
                        C20181413xs.LIZ(C2188811AlT.LIZIZ(sbLIZ), sb);
                    }
                    LJI(i + 1, sb, c20182413y22, jSONObject, list);
                }
                c20182413y22 = c20182413y23;
            }
        }
    }
}
