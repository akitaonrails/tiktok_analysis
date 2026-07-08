package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Yp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885830Yp3 implements C0Y6L {
    public static boolean LLILLL;
    public static boolean LLILZ;
    public static boolean LLILZIL;
    public static boolean LLILZLL;
    public static boolean LLIZ;
    public static int LLIZLLLIL;
    public static int LLJ;
    public static int LLJI;
    public static boolean LLJIJIL;
    public static int LLJJIII;
    public static final C885830Yp3 LL = new C885830Yp3();
    public static final Map<String, Long> LLILLJJLI = new LinkedHashMap();
    public static String LLJILJIL = "";
    public static String LLJILJILJ = "";
    public static String LLJILLL = "";
    public static String LLJJ = "";
    public static String LLJJI = "false";
    public static final C01GW LLJJIJI = C452501pT.LIZIZ(new C886050YpP());

    @Override // X.C0Y6L
    public final synchronized void LIZ() {
        LJ(this, "start_query", null, 6);
        C884110YmH.LJ(C884110YmH.LIZ, "5");
    }

    @Override // X.C0Y6L
    @InterfaceC1294060jmO
    public final void LIZJ() {
    }

    public static boolean LIZIZ(String... strArr) {
        for (String str : strArr) {
            if (!LLILLJJLI.containsKey(str)) {
                return false;
            }
        }
        return true;
    }

    public static void LJII(C885830Yp3 c885830Yp3) {
        c885830Yp3.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C885860Yp6(false, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJI(boolean r15) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C885830Yp3.LJI(boolean):void");
    }

    @Override // X.C0Y6L
    public final synchronized void LIZLLL(C0Y6X c0y6x, C0Y69 c0y69) {
        C884110YmH.LIZ.LIZLLL(c0y6x);
        C885850Yp5.LIZ.getClass();
        if (C885850Yp5.LJII == -1) {
            C881500Yi4 c881500Yi4 = AbstractC883730Ylf.LJIIIIZZ;
            String str = c0y6x.LIZ.LIZ;
            c881500Yi4.getClass();
            if (C881500Yi4.LJFF(str)) {
                C885850Yp5.LJII = c0y6x.LIZIZ.size();
            }
        }
        if (c0y6x.LIZIZ.isEmpty()) {
            return;
        }
        LJ(this, "fast_load", new C885900YpA(c0y6x), 2);
        if (c0y6x.LJ < 0) {
            return;
        }
        LJ(this, "preloaded", new C886020YpM(c0y6x), 2);
    }

    public static void LJ(C885830Yp3 c885830Yp3, String str, Function0 function0, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        c885830Yp3.getClass();
        if (((Boolean) C07QT.LIZ.getValue()).booleanValue()) {
            if (z && LLILLJJLI.containsKey(str)) {
                return;
            }
            LLILLJJLI.put(str, Long.valueOf(SystemClock.uptimeMillis()));
            if (function0 == null) {
                return;
            }
            function0.invoke();
        }
    }

    public static void LJFF(C885830Yp3 c885830Yp3, String str, Map map, JSONObject jSONObject, int i) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        c885830Yp3.getClass();
        if (map != null) {
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL(str, map);
        } else {
            if (jSONObject == null) {
                return;
            }
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIJ(str, jSONObject);
        }
    }
}
