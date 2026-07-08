package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.148U, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C148U implements InterfaceC846640XJe {
    public static int LIZIZ;
    public static BPEAHandler LIZLLL;
    public static C148X LJ;
    public static boolean LJIIIIZZ;
    public static final C148U LIZ = new C148U();
    public static JSONObject LIZJ = C148Y.LIZIZ;
    public static final List<InterfaceC846640XJe> LJFF = new LinkedList();
    public static final List<InterfaceC846640XJe> LJI = new LinkedList();
    public static final C148R LJII = new Runnable() { // from class: X.148R
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public static void LIZ() throws NoSuchAlgorithmException {
            String strLIZIZ;
            String string;
            HashMap map;
            C202178148y c202178148y;
            String strEncode;
            String strEncode2;
            byte[] bArrCopyOfRange;
            C148U c148u = C148U.LIZ;
            boolean zLJI = MethodIDManager.LJI(137795);
            HashMap map2 = new HashMap();
            C148X c148x = C148U.LJ;
            if (c148x == null) {
                c148x = null;
            }
            c148x.getClass();
            C202178148y c202178148y2 = C1498550p6D.LIZ;
            Pair pair = new Pair("aid", c202178148y2.LIZ.LIZIZ);
            map2.put(pair.getFirst(), pair.getSecond());
            C148X c148x2 = C148U.LJ;
            if (c148x2 == null) {
                c148x2 = null;
            }
            c148x2.getClass();
            Pair pair2 = new Pair("lang", c202178148y2.LIZ.LIZJ);
            map2.put(pair2.getFirst(), pair2.getSecond());
            C148X c148x3 = C148U.LJ;
            if (c148x3 == null) {
                c148x3 = null;
            }
            c148x3.getClass();
            Pair pair3 = new Pair("app_name", c202178148y2.LIZ.LIZLLL);
            map2.put(pair3.getFirst(), pair3.getSecond());
            C148X c148x4 = C148U.LJ;
            if (c148x4 == null) {
                c148x4 = null;
            }
            c148x4.getClass();
            Pair pair4 = new Pair("channel", c202178148y2.LIZ.LJ);
            map2.put(pair4.getFirst(), pair4.getSecond());
            C148X c148x5 = C148U.LJ;
            if (c148x5 == null) {
                c148x5 = null;
            }
            c148x5.getClass();
            Pair pair5 = new Pair("region", c202178148y2.LIZ.LIZ);
            map2.put(pair5.getFirst(), pair5.getSecond());
            Pair pair6 = new Pair("os_type", CardStruct.IStatusCode.DEFAULT);
            map2.put(pair6.getFirst(), pair6.getSecond());
            Pair pair7 = new Pair("datetime", String.valueOf(System.currentTimeMillis()));
            map2.put(pair7.getFirst(), pair7.getSecond());
            C148X c148x6 = C148U.LJ;
            if (c148x6 == null) {
                c148x6 = null;
            }
            c148x6.getClass();
            Pair pair8 = new Pair("sdk_version", "2.4.2.i18n");
            map2.put(pair8.getFirst(), pair8.getSecond());
            C148X c148x7 = C148U.LJ;
            if (c148x7 == null) {
                c148x7 = null;
            }
            c148x7.getClass();
            Pair pair9 = new Pair("iid", c202178148y2.LIZ.LJI);
            map2.put(pair9.getFirst(), pair9.getSecond());
            C148X c148x8 = C148U.LJ;
            if (c148x8 == null) {
                c148x8 = null;
            }
            c148x8.getClass();
            Pair pair10 = new Pair("app_version", c202178148y2.LIZ.LJII);
            map2.put(pair10.getFirst(), pair10.getSecond());
            Pair pair11 = new Pair("os_name", "Android");
            map2.put(pair11.getFirst(), pair11.getSecond());
            Pair pair12 = new Pair("os_version", String.valueOf(Build.VERSION.SDK_INT));
            map2.put(pair12.getFirst(), pair12.getSecond());
            C148X c148x9 = C148U.LJ;
            if (c148x9 == null) {
                c148x9 = null;
            }
            c148x9.getClass();
            Pair pair13 = new Pair("did", c202178148y2.LIZ.LJIIIIZZ);
            map2.put(pair13.getFirst(), pair13.getSecond());
            String strEncode3 = Build.BRAND;
            try {
                strEncode3 = URLEncoder.encode(strEncode3, "utf-8");
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
                C20221514Aj.LIZIZ();
            }
            Pair pair14 = new Pair("device_brand", strEncode3);
            map2.put(pair14.getFirst(), pair14.getSecond());
            String strLIZ = "";
            String strLIZJ = C148U.LIZJ("common", Intrinsics.LJIIJJI("host", ""));
            if (strLIZJ == null) {
                strLIZIZ = null;
            } else if (u.LJIIZILJ(strLIZJ, "/", false)) {
                strLIZIZ = Intrinsics.LJIIJJI("vc/setting", strLIZJ);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZJ);
                sbLIZ.append('/');
                sbLIZ.append("vc/setting");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (strLIZIZ != null) {
                StringBuilder sb = new StringBuilder(strLIZIZ);
                try {
                    if (a0.LJJIZ(strLIZIZ, '?', 0, false, 6) < 0) {
                        sb.append("?");
                    } else {
                        sb.append("&");
                    }
                    map = new HashMap();
                    C148X c148x10 = C148U.LJ;
                    if (c148x10 == null) {
                        c148x10 = null;
                    }
                    ((C148S) c148x10).getClass();
                    c202178148y = C1498550p6D.LIZ;
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    Pair pair15 = new Pair("aid", c202178148y.LIZ.LIZIZ);
                    map.put(pair15.getFirst(), pair15.getSecond());
                    C148X c148x11 = C148U.LJ;
                    if (c148x11 == null) {
                        c148x11 = null;
                    }
                    ((C148S) c148x11).getClass();
                    Pair pair16 = new Pair("app_name", c202178148y.LIZ.LIZLLL);
                    map.put(pair16.getFirst(), pair16.getSecond());
                    C148X c148x12 = C148U.LJ;
                    if (c148x12 == null) {
                        c148x12 = null;
                    }
                    ((C148S) c148x12).getClass();
                    Pair pair17 = new Pair("app_version", c202178148y.LIZ.LJII);
                    map.put(pair17.getFirst(), pair17.getSecond());
                    C148X c148x13 = C148U.LJ;
                    if (c148x13 == null) {
                        c148x13 = null;
                    }
                    ((C148S) c148x13).getClass();
                    Pair pair18 = new Pair("channel", c202178148y.LIZ.LJ);
                    map.put(pair18.getFirst(), pair18.getSecond());
                    C148X c148x14 = C148U.LJ;
                    if (c148x14 == null) {
                        c148x14 = null;
                    }
                    ((C148S) c148x14).getClass();
                    Pair pair19 = new Pair("lang", c202178148y.LIZ.LIZJ);
                    map.put(pair19.getFirst(), pair19.getSecond());
                    C148X c148x15 = C148U.LJ;
                    if (c148x15 == null) {
                        c148x15 = null;
                    }
                    c148x15.getClass();
                    Pair pair20 = new Pair("sdk_version", "2.4.2.i18n");
                    map.put(pair20.getFirst(), pair20.getSecond());
                    C148X c148x16 = C148U.LJ;
                    if (c148x16 == null) {
                        c148x16 = null;
                    }
                    ((C148S) c148x16).getClass();
                    Pair pair21 = new Pair("version_code", c202178148y.LIZ.LJII);
                    map.put(pair21.getFirst(), pair21.getSecond());
                    for (String str : map.keySet()) {
                        if (sb.length() > 0) {
                            sb.append("&");
                        }
                        C148U c148u2 = C148U.LIZ;
                        try {
                            strEncode = URLEncoder.encode(str, "UTF-8");
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            strEncode = "";
                        }
                        String str2 = (String) map.get(str);
                        if (str2 == null) {
                            strEncode2 = null;
                        } else {
                            try {
                                strEncode2 = URLEncoder.encode(str2, "UTF-8");
                            } catch (Exception e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                strEncode2 = "";
                            }
                        }
                        sb.append(strEncode);
                        sb.append("=");
                        sb.append(strEncode2);
                    }
                } catch (Exception e5) {
                    e = e5;
                    TryCatchGuardChecker.doCheck(e);
                }
                string = sb.toString();
            } else {
                if (C20221514Aj.LIZ()) {
                    RuntimeException runtimeException = new RuntimeException("url should not empty");
                    if (!zLJI) {
                        throw runtimeException;
                    }
                    MethodIDManager.LJ();
                    throw runtimeException;
                }
                string = null;
            }
            if (string == null) {
                string = "";
            }
            C148X c148x17 = C148U.LJ;
            if (c148x17 == null) {
                c148x17 = null;
            }
            c148x17.getClass();
            InterfaceC2202808k6 interfaceC2202808k6 = C1498550p6D.LIZ.LIZ.LJIIZILJ;
            C846630XJd c846630XJd = new C846630XJd(string, map2, interfaceC2202808k6);
            boolean zLJI2 = MethodIDManager.LJI(137796);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C19994613Lc c19994613LcLIZIZ = C19994513Lb.LIZIZ(System.nanoTime());
            Pair pair22 = new Pair(C19970013Bq.LIZJ(c19994613LcLIZIZ.nextInt()), C19970013Bq.LIZJ(c19994613LcLIZIZ.nextInt()));
            map2.put("key", pair22.getFirst());
            map2.put("iv", pair22.getSecond());
            String str3 = (String) pair22.getFirst();
            String str4 = (String) pair22.getSecond();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Charset charset = Charsets.UTF_8;
            if (str3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bArrDigest = messageDigest.digest(str3.getBytes(charset));
            MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
            if (str4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bArrDigest2 = messageDigest2.digest(str4.getBytes(charset));
            if (bArrDigest2 == null) {
                bArrCopyOfRange = null;
            } else {
                C1691430u7J.LIZ(12, bArrDigest2.length);
                bArrCopyOfRange = Arrays.copyOfRange(bArrDigest2, 0, 12);
            }
            Pair pair23 = new Pair(bArrDigest, bArrCopyOfRange);
            Object first = pair23.getFirst();
            Object second = pair23.getSecond();
            int i = -1;
            try {
                try {
                    String strJ3 = C786410Ut5.J3(new JSONObject(map2));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("Content-type", "application/json;tt-data=g");
                    byte[] bArr = interfaceC2202808k6.post(string, linkedHashMap, strJ3.getBytes(charset)).LIZ;
                    if (bArr.length > 0) {
                        i = 200;
                        strLIZ = C846630XJd.LIZ((byte[]) first, (byte[]) second, new ByteArrayInputStream(bArr));
                    } else {
                        i = 204;
                    }
                } catch (Exception e6) {
                    TryCatchGuardChecker.doCheck(e6);
                    i = 500;
                }
                c846630XJd.LIZIZ.LIZ(i, System.currentTimeMillis() - jCurrentTimeMillis, strLIZ);
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c846630XJd.LIZIZ.LIZ(i, System.currentTimeMillis() - jCurrentTimeMillis, strLIZ);
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("SettingsManager@f5c5.updateTask$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("SettingsManager@f5c5.updateTask$1");
        }
    };

    public static void LIZIZ() {
        C148W c148w = C148V.LIZ;
        List<InterfaceC846640XJe> list = LJFF;
        synchronized (list) {
            try {
                ((LinkedList) list).add(c148w);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static JSONObject LIZLLL(String str) {
        JSONObject jSONObjectOptJSONObject = LIZJ.optJSONObject(str);
        if (jSONObjectOptJSONObject == null && (jSONObjectOptJSONObject = C148Y.LIZIZ.optJSONObject(str)) == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        C148X c148x = LJ;
        if (c148x == null) {
            c148x = null;
        }
        c148x.getClass();
        C1498550p6D.LIZ.LIZ.getClass();
        return jSONObjectOptJSONObject;
    }

    public static long LJ(boolean z) {
        if (!z && LIZIZ < LIZLLL("common").optInt("retry_count", 0) && LIZLLL("common").optLong("retry_interval", 30000L) != 0) {
            LIZIZ++;
            return LIZLLL("common").optLong("retry_interval", 30000L);
        }
        return Math.max(Math.min(LIZJ.optLong("available_time") - System.currentTimeMillis(), LIZLLL("common").optLong("period", 30000L)), 30000L);
    }

    public static void LJFF(long j) {
        BPEAHandler bPEAHandler = LIZLLL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(LJII);
        }
        BPEAHandler bPEAHandler2 = LIZLLL;
        if (bPEAHandler2 != null) {
            C786410Ut5.LJLIIL(j, bPEAHandler2, LJII);
        }
    }

    public static void LJI(String str) {
        try {
            LIZJ = new JSONObject(str);
            LIZJ.put("available_time", System.currentTimeMillis() + LIZLLL("common").optLong("period", 30000L));
            C20188813z4.LIZ.LIZLLL(str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C20221514Aj.LIZIZ();
        }
    }

    public static String LIZJ(String str, String str2) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = LIZLLL(str).optJSONObject(str2);
        C148X c148x = null;
        if (jSONObjectOptJSONObject2 == null) {
            strOptString = null;
        } else {
            C148X c148x2 = LJ;
            if (c148x2 == null) {
                c148x2 = null;
            }
            c148x2.getClass();
            strOptString = jSONObjectOptJSONObject2.optString(C1498550p6D.LIZ.LIZ.LIZ);
        }
        if (!TextUtils.isEmpty(strOptString)) {
            return strOptString;
        }
        JSONObject jSONObjectOptJSONObject3 = C148Y.LIZIZ.optJSONObject(str);
        if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject(str2)) == null) {
            return null;
        }
        C148X c148x3 = LJ;
        if (c148x3 != null) {
            c148x = c148x3;
        }
        c148x.getClass();
        return jSONObjectOptJSONObject.optString(C1498550p6D.LIZ.LIZ.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[LOOP:0: B:10:0x001e->B:12:0x0024, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.InterfaceC846640XJe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r4, long r5, java.lang.String r7) {
        /*
            r3 = this;
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 0
            if (r4 != r0) goto L2e
            r2 = 1
            if (r7 == 0) goto L2f
            int r0 = r7.length()
            if (r0 == 0) goto L2f
            java.lang.String r0 = "pull settings success,"
            kotlin.jvm.internal.Intrinsics.LJIIJJI(r7, r0)
            LJI(r7)
            X.C148U.LIZIZ = r1
        L18:
            java.util.List<X.0XJe> r0 = X.C148U.LJFF
            java.util.Iterator r1 = r0.iterator()
        L1e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r1.next()
            X.0XJe r0 = (X.InterfaceC846640XJe) r0
            r0.LIZ(r4, r5, r7)
            goto L1e
        L2e:
            r2 = 0
        L2f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "pull settings fail,code:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ",content:"
            r1.append(r0)
            r1.append(r7)
            X.C2188811AlT.LIZIZ(r1)
            goto L18
        L47:
            monitor-enter(r3)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L74
            r1.<init>()     // Catch: java.lang.Throwable -> L74
            java.util.List<X.0XJe> r0 = X.C148U.LJI     // Catch: java.lang.Throwable -> L74
            r1.addAll(r0)     // Catch: java.lang.Throwable -> L74
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch: java.lang.Throwable -> L74
            r0.clear()     // Catch: java.lang.Throwable -> L74
            monitor-exit(r3)
            java.util.Iterator r1 = r1.iterator()
        L5c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r1.next()
            X.0XJe r0 = (X.InterfaceC846640XJe) r0
            r0.LIZ(r4, r5, r7)
            goto L5c
        L6c:
            long r0 = LJ(r2)
            LJFF(r0)
            return
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148U.LIZ(int, long, java.lang.String):void");
    }
}
