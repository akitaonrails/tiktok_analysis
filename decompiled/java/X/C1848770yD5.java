package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yD5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1848770yD5 {
    public C1848840yDC LIZ;
    public final C054G LIZIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));

    public final C1848740yD2 LIZIZ() {
        C1848840yDC c1848840yDC = this.LIZ;
        if (c1848840yDC != null) {
            return c1848840yDC.LIZ;
        }
        return null;
    }

    public final C2220181Buy LIZ() {
        C2220221Bv2 c2220221Bv2LIZJ;
        C1848740yD2 c1848740yD2LIZIZ = LIZIZ();
        if (c1848740yD2LIZIZ == null) {
            return C2220181Buy.LIZJ;
        }
        synchronized (c1848740yD2LIZIZ) {
            C1848720yD0 c1848720yD0 = c1848740yD2LIZIZ.LIZJ;
            c1848720yD0.LIZ.clear();
            c1848720yD0.LIZIZ.clear();
            c1848720yD0.LIZJ = 0;
            C1848750yD3 c1848750yD3 = c1848740yD2LIZIZ.LIZIZ;
            ((ConcurrentHashMap) c1848750yD3.LIZLLL).clear();
            c1848750yD3.LJ = 0L;
            c1848740yD2LIZIZ.LIZIZ.LIZ();
            c2220221Bv2LIZJ = C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("data", "")));
        }
        return c2220221Bv2LIZJ.LIZ();
    }

    public final C2220181Buy LIZJ() {
        C2220221Bv2 c2220221Bv2LIZJ;
        C1848740yD2 c1848740yD2LIZIZ = LIZIZ();
        if (c1848740yD2LIZIZ == null) {
            return C2220181Buy.LIZJ;
        }
        synchronized (c1848740yD2LIZIZ) {
            c2220221Bv2LIZJ = C2220251Bv5.LIZJ(null, C2097608Jq.LJIIIIZZ(new Pair("keys", new JSONArray(C15442062u.LJIIIZ(c1848740yD2LIZIZ.LIZJ.LIZ.keySet(), ((ConcurrentHashMap) c1848740yD2LIZIZ.LIZIZ.LIZLLL).keySet()).toArray(new String[0]))), new Pair("currentSize", Long.valueOf((((long) c1848740yD2LIZIZ.LIZJ.LIZJ) + c1848740yD2LIZIZ.LIZIZ.LJ) / ((long) 1024))), new Pair("limitSize", 10240)));
        }
        return c2220221Bv2LIZJ.LIZ();
    }

    public final C2220181Buy LIZLLL(JSONObject jSONObject) {
        String str;
        Pair pair;
        Object c098200Yq;
        C2220221Bv2 c2220221Bv2LIZJ;
        Object objOpt = jSONObject.opt("key");
        if ((objOpt instanceof String) && (str = (String) objOpt) != null && (!a0.LJJJIL(str))) {
            C1848740yD2 c1848740yD2LIZIZ = LIZIZ();
            if (c1848740yD2LIZIZ != null) {
                synchronized (c1848740yD2LIZIZ) {
                    if (a0.LJJJIL(str)) {
                        c2220221Bv2LIZJ = C2220251Bv5.LIZ(EnumC2221121BwU.INVALID_ARG, "empty key");
                    } else {
                        C1848720yD0 c1848720yD0 = c1848740yD2LIZIZ.LIZJ;
                        C1848730yD1 c1848730yD1 = c1848720yD0.LIZ.get(str);
                        if (c1848730yD1 == null) {
                            pair = (Pair) ((ConcurrentHashMap) c1848740yD2LIZIZ.LIZIZ.LIZLLL).get(str);
                            if (pair == null) {
                                c2220221Bv2LIZJ = C2220251Bv5.LIZ(EnumC2221121BwU.NO_SUCH_FILE, "no such key");
                            }
                        } else {
                            c1848720yD0.LIZIZ.remove(str);
                            c1848720yD0.LIZIZ.add(str);
                            pair = new Pair(c1848730yD1.LIZ, c1848730yD1.LIZIZ);
                        }
                        String str2 = (String) pair.getFirst();
                        try {
                            C1849000yDS c1849000yDS = C1849000yDS.LIZ;
                            JSONObject jSONObject2 = new JSONObject(str2);
                            c1849000yDS.getClass();
                            c098200Yq = C1849000yDS.LIZ(jSONObject2);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Object obj = str2;
                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
                            obj = c098200Yq;
                        }
                        if (obj == null) {
                            obj = "";
                        }
                        c2220221Bv2LIZJ = C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("data", obj)));
                    }
                }
                return c2220221Bv2LIZJ.LIZ();
            }
            return C2220181Buy.LIZJ;
        }
        return C2220181Buy.LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[Catch: all -> 0x01b4, TryCatch #0 {, blocks: (B:17:0x003b, B:19:0x0041, B:22:0x0047, B:24:0x004b, B:26:0x0058, B:85:0x01a0, B:28:0x005e, B:30:0x0062, B:32:0x006f, B:35:0x0077, B:37:0x007b, B:39:0x007f, B:41:0x0083, B:43:0x0087, B:45:0x008b, B:47:0x008f, B:49:0x0093, B:50:0x009d, B:52:0x00a1, B:54:0x00ac, B:56:0x00b7, B:59:0x00c2, B:61:0x00df, B:64:0x00fe, B:66:0x010a, B:68:0x0125, B:69:0x0129, B:71:0x013e, B:79:0x0177, B:81:0x0186, B:82:0x0189, B:72:0x015a, B:74:0x0168, B:76:0x0170, B:88:0x01aa), top: B:105:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015a A[Catch: all -> 0x01b4, TryCatch #0 {, blocks: (B:17:0x003b, B:19:0x0041, B:22:0x0047, B:24:0x004b, B:26:0x0058, B:85:0x01a0, B:28:0x005e, B:30:0x0062, B:32:0x006f, B:35:0x0077, B:37:0x007b, B:39:0x007f, B:41:0x0083, B:43:0x0087, B:45:0x008b, B:47:0x008f, B:49:0x0093, B:50:0x009d, B:52:0x00a1, B:54:0x00ac, B:56:0x00b7, B:59:0x00c2, B:61:0x00df, B:64:0x00fe, B:66:0x010a, B:68:0x0125, B:69:0x0129, B:71:0x013e, B:79:0x0177, B:81:0x0186, B:82:0x0189, B:72:0x015a, B:74:0x0168, B:76:0x0170, B:88:0x01aa), top: B:105:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0 A[Catch: all -> 0x01b4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:17:0x003b, B:19:0x0041, B:22:0x0047, B:24:0x004b, B:26:0x0058, B:85:0x01a0, B:28:0x005e, B:30:0x0062, B:32:0x006f, B:35:0x0077, B:37:0x007b, B:39:0x007f, B:41:0x0083, B:43:0x0087, B:45:0x008b, B:47:0x008f, B:49:0x0093, B:50:0x009d, B:52:0x00a1, B:54:0x00ac, B:56:0x00b7, B:59:0x00c2, B:61:0x00df, B:64:0x00fe, B:66:0x010a, B:68:0x0125, B:69:0x0129, B:71:0x013e, B:79:0x0177, B:81:0x0186, B:82:0x0189, B:72:0x015a, B:74:0x0168, B:76:0x0170, B:88:0x01aa), top: B:105:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01aa A[Catch: all -> 0x01b4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:17:0x003b, B:19:0x0041, B:22:0x0047, B:24:0x004b, B:26:0x0058, B:85:0x01a0, B:28:0x005e, B:30:0x0062, B:32:0x006f, B:35:0x0077, B:37:0x007b, B:39:0x007f, B:41:0x0083, B:43:0x0087, B:45:0x008b, B:47:0x008f, B:49:0x0093, B:50:0x009d, B:52:0x00a1, B:54:0x00ac, B:56:0x00b7, B:59:0x00c2, B:61:0x00df, B:64:0x00fe, B:66:0x010a, B:68:0x0125, B:69:0x0129, B:71:0x013e, B:79:0x0177, B:81:0x0186, B:82:0x0189, B:72:0x015a, B:74:0x0168, B:76:0x0170, B:88:0x01aa), top: B:105:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2220181Buy LJ(int r13, org.json.JSONObject r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1848770yD5.LJ(int, org.json.JSONObject):X.1Buy");
    }
}
