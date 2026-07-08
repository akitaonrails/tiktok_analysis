package X;

import com.google.gson.o;
import com.google.gson.s;
import com.ss.android.ugc.aweme.music.cache.CacheManager;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.AwS94S1000000_9;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Oqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632130Oqp {
    public static final C632130Oqp LIZ = new C632130Oqp();
    public static String LIZIZ = "";
    public static String LIZJ;
    public static MusicDetail LIZLLL;
    public static Future<MusicDetail> LJ;
    public static MusicAwemeList LJFF;
    public static Future<MusicAwemeList> LJI;

    public static void LIZJ() {
        LJI = null;
        LJ = null;
        LJFF = null;
        LIZLLL = null;
    }

    static {
        CacheManager cacheManager = CacheManager.LIZ;
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 50, "creative_tools_mdp_api_cache_count", true);
        cacheManager.getClass();
        if (iLJIJ > 0) {
            CacheManager.LIZIZ = iLJIJ;
        }
        C632170Oqt.LIZ = new InterfaceC632180Oqu() { // from class: X.0Oqs
            @Override // X.InterfaceC632180Oqu
            public final void LIZIZ() {
                C632130Oqp.LIZ.getClass();
                C632130Oqp.LIZ();
            }
        };
    }

    public static void LIZ() {
        String str = LIZJ;
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_detail");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            CacheManager.LIZ.getClass();
            C0CNO.LIZ(C15O7.LJI, new AwS94S1000000_9(strLIZIZ, 5));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("_list");
            C0CNO.LIZ(C15O7.LJI, new AwS94S1000000_9(C2188811AlT.LIZIZ(sbLIZ2), 5));
        }
        LIZIZ = "";
        LIZLLL = null;
        LJ = null;
        LJFF = null;
        LJI = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.music.model.MusicAwemeList LIZIZ() {
        /*
            java.lang.String r0 = X.C632130Oqp.LIZIZ
            int r0 = r0.length()
            r6 = 1
            if (r0 != 0) goto Le
            r0 = 1
        La:
            r8 = 0
            if (r0 == 0) goto L10
            return r8
        Le:
            r0 = 0
            goto La
        L10:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = X.C632130Oqp.LIZJ
            r1.append(r0)
            java.lang.String r0 = "_list"
            r1.append(r0)
            java.lang.String r7 = X.C2188811AlT.LIZIZ(r1)
            long r3 = X.C306590C0b.LIZ()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L57
            boolean r0 = X.C297090Bkh.LIZ()
            if (r0 == 0) goto L57
            X.0Oqr r0 = new X.0Oqr
            r0.<init>()
            java.lang.reflect.Type r5 = r0.getType()
            com.ss.android.ugc.aweme.music.cache.CacheManager r4 = com.ss.android.ugc.aweme.music.cache.CacheManager.LIZ
            long r2 = X.C306590C0b.LIZ()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 * r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r0 = 246(0xf6, float:3.45E-43)
            kotlin.jvm.internal.AFwS195S0000000_9 r0 = kotlin.jvm.internal.AFwS195S0000000_9.get$arr$(r0)
            java.lang.Object r3 = com.ss.android.ugc.aweme.music.cache.CacheManager.LIZIZ(r4, r7, r1, r5, r0)
            com.ss.android.ugc.aweme.music.model.MusicAwemeList r3 = (com.ss.android.ugc.aweme.music.model.MusicAwemeList) r3
            if (r3 != 0) goto L72
        L57:
            com.ss.android.ugc.aweme.music.model.MusicAwemeList r0 = X.C632130Oqp.LJFF     // Catch: java.lang.Exception -> L6c
            if (r0 != 0) goto L6a
            java.util.concurrent.Future<com.ss.android.ugc.aweme.music.model.MusicAwemeList> r0 = X.C632130Oqp.LJI     // Catch: java.lang.Exception -> L6c
            if (r0 == 0) goto L68
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L6c
            com.ss.android.ugc.aweme.music.model.MusicAwemeList r0 = (com.ss.android.ugc.aweme.music.model.MusicAwemeList) r0     // Catch: java.lang.Exception -> L6c
        L65:
            X.C632130Oqp.LJFF = r0     // Catch: java.lang.Exception -> L6c
            goto L6a
        L68:
            r0 = r8
            goto L65
        L6a:
            r8 = r0
            goto L70
        L6c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L70:
            r6 = 0
            r3 = r8
        L72:
            boolean r0 = X.C297090Bkh.LIZ()
            if (r0 == 0) goto L83
            kotlin.jvm.internal.AwS10S1010000_9 r2 = new kotlin.jvm.internal.AwS10S1010000_9
            java.lang.String r1 = "mdp_list"
            r0 = 1
            r2.<init>(r1, r6, r0)
            X.C0CNO.LIZIZ(r2)
        L83:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C632130Oqp.LIZIZ():com.ss.android.ugc.aweme.music.model.MusicAwemeList");
    }

    public static String LIZLLL(Throwable th) {
        if (th instanceof ExecutionException) {
            Throwable cause = th.getCause();
            if (cause != null) {
                LIZ.getClass();
                String strLJ = LJ(cause);
                if (strLJ != null) {
                    return strLJ;
                }
            }
            return LJ(th);
        }
        return LJ(th);
    }

    public static String LJ(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnknownError[");
        sbLIZ.append(-1);
        sbLIZ.append(']');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (th instanceof C09HQ) {
            C09HQ c09hq = (C09HQ) th;
            int iCode = c09hq.code();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("HttpException[");
            sbLIZ2.append(iCode);
            sbLIZ2.append("][");
            sbLIZ2.append(c09hq.message());
            sbLIZ2.append(']');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (th instanceof EOFException) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("EOFException[");
            sbLIZ3.append(-10010);
            sbLIZ3.append(']');
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (th instanceof IllegalArgumentException) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("IllegalArgumentException[");
            sbLIZ4.append(-10011);
            sbLIZ4.append(']');
            return C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (th instanceof C0XIO) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("JSONParseException[");
            sbLIZ5.append(-10012);
            sbLIZ5.append(']');
            return C2188811AlT.LIZIZ(sbLIZ5);
        }
        if (th instanceof s) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("JsonSyntaxException[");
            sbLIZ6.append(-10013);
            sbLIZ6.append(']');
            return C2188811AlT.LIZIZ(sbLIZ6);
        }
        if (th instanceof o) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("JsonParseException[");
            sbLIZ7.append(-10015);
            sbLIZ7.append(']');
            return C2188811AlT.LIZIZ(sbLIZ7);
        }
        if (th instanceof JSONException) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("JSONException[");
            sbLIZ8.append(-10016);
            sbLIZ8.append(']');
            return C2188811AlT.LIZIZ(sbLIZ8);
        }
        if (th instanceof SSLHandshakeException) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("SSLHandshakeException[");
            sbLIZ9.append(-10017);
            sbLIZ9.append(']');
            return C2188811AlT.LIZIZ(sbLIZ9);
        }
        if (th instanceof ConnectException) {
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("ConnectException[");
            sbLIZ10.append(-10018);
            sbLIZ10.append(']');
            return C2188811AlT.LIZIZ(sbLIZ10);
        }
        if (th instanceof C23112093u) {
            int errorCode = ((C23112093u) th).getErrorCode();
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append("ApiException[");
            sbLIZ11.append(errorCode);
            sbLIZ11.append(']');
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ11);
            if (!(th instanceof C0XIR)) {
                return strLIZIZ2;
            }
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append("ApiServerException[");
            sbLIZ12.append(errorCode);
            sbLIZ12.append("][");
            sbLIZ12.append(((C0XIR) th).getErrorMsg());
            sbLIZ12.append(']');
            return C2188811AlT.LIZIZ(sbLIZ12);
        }
        if (th instanceof C1494690ozz) {
            C1494690ozz c1494690ozz = (C1494690ozz) th;
            if (c1494690ozz.getStatusCode() > 0) {
                c1494690ozz.getStatusCode();
            } else {
                c1494690ozz.getCronetInternalErrorCode();
            }
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append("CronetIOException[");
            sbLIZ13.append(c1494690ozz.getStatusCode());
            sbLIZ13.append("][");
            sbLIZ13.append(c1494690ozz.getCronetInternalErrorCode());
            sbLIZ13.append(']');
            return C2188811AlT.LIZIZ(sbLIZ13);
        }
        if (!(th instanceof IOException)) {
            return strLIZIZ;
        }
        StringBuilder sbLIZ14 = C2188811AlT.LIZ();
        sbLIZ14.append("IOException[");
        sbLIZ14.append(-10014);
        sbLIZ14.append(']');
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ14);
        if (!(th instanceof C1494450ozb)) {
            return strLIZIZ3;
        }
        StringBuilder sbLIZ15 = C2188811AlT.LIZ();
        sbLIZ15.append("NetworkNotAvailabeException[");
        sbLIZ15.append(-10019);
        sbLIZ15.append(']');
        return C2188811AlT.LIZIZ(sbLIZ15);
    }
}
