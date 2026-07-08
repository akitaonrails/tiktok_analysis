package X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;

/* JADX INFO: renamed from: X.0pFO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504240pFO implements InterfaceC1504270pFR {
    public final C1495520p1K LIZ;
    public final C1495520p1K LIZIZ;

    public C1504240pFO() {
        C1495510p1J c1495510p1J = new C1495510p1J();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c1495510p1J.connectTimeout(10L, timeUnit);
        c1495510p1J.readTimeout(10L, timeUnit);
        c1495510p1J.writeTimeout(10L, timeUnit);
        this.LIZ = C2204961BRm.k0(c1495510p1J, new C0WZX("dzBzEgAjS8/YVFkiQFyDY7Lowj2EV72e1NdYm4earz2VNF2Zhvph", null));
        C1495510p1J c1495510p1J2 = new C1495510p1J();
        c1495510p1J2.connectTimeout(10L, timeUnit);
        c1495510p1J2.readTimeout(30L, timeUnit);
        c1495510p1J2.writeTimeout(30L, timeUnit);
        this.LIZIZ = C2204961BRm.k0(c1495510p1J2, new C0WZX("dzBzEgAjS8/YVFkiQFyDY7Lowj2EV72e1NdYm4earz2VNF2Zhvph", null));
    }

    public static void LIZLLL(Map<String, String> map, C0X33 c0x33) {
        if (map != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                c0x33.LIZ((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    @Override // X.InterfaceC1504290pFT
    public final C1551140qT2 LIZJ(String str, String str2) {
        return doPost(str, str2, null);
    }

    @Override // X.InterfaceC1504270pFR
    public final C1551140qT2 doPost(String str, String str2, Map<String, String> map) throws Throwable {
        HashMap map2;
        C842540X3k c842540X3kLIZJ = AbstractC842530X3j.LIZJ(C0X0P.LIZJ("application/json; charset=utf-8"), str2);
        C0X33 c0x33 = new C0X33();
        c0x33.LJII(str);
        c0x33.LIZLLL("POST", c842540X3kLIZJ);
        LIZLLL(map, c0x33);
        Request requestLIZIZ = c0x33.LIZIZ();
        C1495520p1K c1495520p1K = this.LIZ;
        c1495520p1K.getClass();
        String strString = null;
        C0XLY c0xlyJ0 = C2204961BRm.j0(C1495500p1I.LIZJ(c1495520p1K, requestLIZIZ, false), new C0WZX("dzBzEgAjS8/YVFkiQFyDY7Lowj2EV72e1NdYm4earz2VNF2Zhvph", null));
        C0X1V c0x1v = c0xlyJ0.LLILZLL;
        if (c0x1v == null) {
            map2 = null;
        } else {
            map2 = new HashMap();
            for (String str3 : c0x1v.LJFF()) {
                map2.put(str3, c0x1v.LIZLLL(str3));
            }
        }
        if (c0xlyJ0.LLILLL == 200) {
            strString = c0xlyJ0.LLIZ.string();
        }
        return new C1551140qT2(map2, strString, c0xlyJ0.LLILLL, c0xlyJ0.LLILZ);
    }

    @Override // X.InterfaceC1504290pFT
    public final void LIZIZ(String str, long j, C1504280pFS c1504280pFS, C1551680qTu c1551680qTu) throws Throwable {
        LIZ(str, j, c1504280pFS, null, 0L, c1551680qTu);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4 A[Catch: Exception -> 0x00d7, all -> 0x0122, TryCatch #14 {Exception -> 0x00d7, all -> 0x0122, blocks: (B:33:0x00bb, B:34:0x00bd, B:36:0x00c4, B:38:0x00ca), top: B:83:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5 A[Catch: all -> 0x011f, TryCatch #13 {all -> 0x011f, blocks: (B:7:0x0032, B:59:0x00ee, B:61:0x00f5, B:62:0x00fc, B:63:0x00fd, B:64:0x011e), top: B:80:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fd A[Catch: all -> 0x011f, TryCatch #13 {all -> 0x011f, blocks: (B:7:0x0032, B:59:0x00ee, B:61:0x00f5, B:62:0x00fc, B:63:0x00fd, B:64:0x011e), top: B:80:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ce A[EDGE_INSN: B:91:0x00ce->B:39:0x00ce BREAK  A[LOOP:0: B:34:0x00bd->B:93:0x00bd], SYNTHETIC] */
    @Override // X.InterfaceC1504270pFR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r16, long r17, X.C1504280pFS r19, java.util.Map<java.lang.String, java.lang.String> r20, long r21, X.C1551680qTu r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1504240pFO.LIZ(java.lang.String, long, X.0pFS, java.util.Map, long, X.0qTu):boolean");
    }
}
