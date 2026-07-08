package X;

import Y.ARunnableS3S0500000_4;
import android.text.TextUtils;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0yoa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872020yoa {
    public static final C1872020yoa LIZ = new C1872020yoa();

    public static LinkedHashMap LIZIZ(InterfaceC1107590evd interfaceC1107590evd) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC1107590evd != null) {
            InterfaceC1107470evR interfaceC1107470evRLIZIZ = interfaceC1107590evd.LIZIZ();
            while (interfaceC1107470evRLIZIZ.hasNextKey()) {
                String strNextKey = interfaceC1107470evRLIZIZ.nextKey();
                String strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, strNextKey, "");
                if (strLJFF.length() > 0) {
                    linkedHashMap.put(strNextKey, strLJFF);
                }
            }
        }
        return linkedHashMap;
    }

    public static String LIZLLL(LinkedHashMap linkedHashMap) {
        String str;
        if (!linkedHashMap.containsKey("x-tt-logid") || (str = (String) linkedHashMap.get("x-tt-logid")) == null) {
            return "";
        }
        return str;
    }

    public static String LIZ(String str, InterfaceC1107590evd interfaceC1107590evd, EnumC1059790dgX enumC1059790dgX) {
        String str2;
        C018K c018k = new C018K(str);
        if (interfaceC1107590evd != null) {
            InterfaceC1107470evR interfaceC1107470evRLIZIZ = interfaceC1107590evd.LIZIZ();
            while (interfaceC1107470evRLIZIZ.hasNextKey()) {
                String strNextKey = interfaceC1107470evRLIZIZ.nextKey();
                InterfaceC1871820yoG interfaceC1871820yoG = interfaceC1107590evd.get(strNextKey);
                switch (C1323940kYa.LIZ[interfaceC1871820yoG.getType().ordinal()]) {
                    case 1:
                        c018k.LIZ(strNextKey, String.valueOf(interfaceC1871820yoG.asInt()));
                        break;
                    case 2:
                        c018k.LIZ(strNextKey, String.valueOf(interfaceC1871820yoG.asBoolean()));
                        break;
                    case 3:
                        c018k.LIZ(strNextKey, String.valueOf(interfaceC1871820yoG.asDouble()));
                        break;
                    case 4:
                        c018k.LIZ(strNextKey, interfaceC1871820yoG.asString());
                        break;
                    case 5:
                        C1872780ypo c1872780ypo = C1872780ypo.LIZ;
                        InterfaceC1107590evd interfaceC1107590evdAsMap = interfaceC1871820yoG.asMap();
                        c1872780ypo.getClass();
                        c018k.LIZ(strNextKey, C786410Ut5.J3(C1872780ypo.LIZIZ(interfaceC1107590evdAsMap)));
                        break;
                    case 6:
                        C1872780ypo c1872780ypo2 = C1872780ypo.LIZ;
                        InterfaceC1871920yoQ interfaceC1871920yoQAsArray = interfaceC1871820yoG.asArray();
                        c1872780ypo2.getClass();
                        c018k.LIZ(strNextKey, C1872780ypo.LIZ(interfaceC1871920yoQAsArray).toString());
                        break;
                }
            }
        }
        if (enumC1059790dgX == EnumC1059790dgX.WEB) {
            str2 = "h5";
        } else if (enumC1059790dgX == EnumC1059790dgX.LYNX) {
            str2 = "lynx";
        } else {
            str2 = "";
        }
        c018k.LIZ("request_tag_from", str2);
        return c018k.LIZIZ();
    }

    public static void LJ(C1506420pIu c1506420pIu, C0C9A c0c9a, boolean z) {
        String strLJ = c1506420pIu.LJ();
        if (strLJ == null || strLJ.length() <= 0) {
            strLJ = null;
        }
        if (strLJ == null) {
            if (!LJFF(c0c9a, c1506420pIu.LIZLLL(), c1506420pIu.LIZ(), c1506420pIu.LIZIZ(), c1506420pIu.LIZJ())) {
                LJII(c0c9a, c1506420pIu.LIZLLL(), c1506420pIu.LIZ(), strLJ, c1506420pIu.LIZ, z);
                return;
            }
            return;
        }
        if (!LJFF(c0c9a, c1506420pIu.LIZLLL(), c1506420pIu.LIZ(), c1506420pIu.LIZIZ(), c1506420pIu.LIZJ())) {
            LJII(c0c9a, c1506420pIu.LIZLLL(), c1506420pIu.LIZ(), strLJ, c1506420pIu.LIZ, z);
        }
    }

    public static boolean LJFF(final C0C9A c0c9a, final Integer num, final Integer num2, final String str, final Throwable th) {
        if (th == null && TextUtils.isEmpty(str)) {
            return false;
        }
        if ((str == null || str.length() <= 0) && (th == null || (str = th.getMessage()) == null)) {
            str = "";
        }
        C786410Ut5.LJJZZIII(C1870470ym5.LIZ(), new Runnable() { // from class: X.0C99
            public final void LIZ() {
                C0C9A c0c9a2 = c0c9a;
                Integer num3 = num;
                Integer num4 = num2;
                Throwable th2 = th;
                String str2 = str;
                if (th2 == null) {
                    try {
                        th2 = new Throwable(str2);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        C189200o6.m2constructorimpl(new C098200Yq(th3));
                        return;
                    }
                }
                c0c9a2.LIZ(num3, num4, th2);
                C189200o6.m2constructorimpl(Unit.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("XBridgeAPIRequestUtils@6430.handleError$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("XBridgeAPIRequestUtils@6430.handleError$1");
            }
        });
        return true;
    }

    public static void LJI(String str, String str2, InterfaceC1872030yob interfaceC1872030yob, C1879450z0Z c1879450z0Z, C1872130yol c1872130yol) {
        byte[] bArrLIZIZ;
        InputStream inputStreamLIZLLL = c1879450z0Z.LIZLLL();
        if (inputStreamLIZLLL != null && (bArrLIZIZ = C2106208My.LIZIZ(inputStreamLIZLLL)) != null) {
            if (!LJFF(c1872130yol, Integer.valueOf(c1879450z0Z.LIZIZ.element), Integer.valueOf(c1879450z0Z.LIZJ.element), c1879450z0Z.LIZIZ(), c1879450z0Z.LIZJ())) {
                C786410Ut5.LJJZZIII(C1870470ym5.LIZ(), new ARunnableS3S0500000_4(c1872130yol, interfaceC1872030yob.LIZIZ(str, str2, bArrLIZIZ), c1879450z0Z.LIZ, Integer.valueOf(c1879450z0Z.LIZIZ.element), Integer.valueOf(c1879450z0Z.LIZJ.element), 0));
            }
        } else if (!LJFF(c1872130yol, Integer.valueOf(c1879450z0Z.LIZIZ.element), Integer.valueOf(c1879450z0Z.LIZJ.element), c1879450z0Z.LIZIZ(), c1879450z0Z.LIZJ())) {
            LJII(c1872130yol, Integer.valueOf(c1879450z0Z.LIZIZ.element), Integer.valueOf(c1879450z0Z.LIZJ.element), null, c1879450z0Z.LIZ, false);
        }
    }

    public static void LJII(final C0C9A c0c9a, final Integer num, final Integer num2, final String str, final LinkedHashMap linkedHashMap, final boolean z) {
        C786410Ut5.LJJZZIII(C1870470ym5.LIZ(), new Runnable() { // from class: X.0yom
            /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00e7 A[PHI: r4 r10 r13
              0x00e7: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v6 java.lang.String) binds: [B:16:0x00de, B:18:0x00e4] A[DONT_GENERATE, DONT_INLINE]
              0x00e7: PHI (r10v5 org.json.JSONObject) = (r10v4 org.json.JSONObject), (r10v8 org.json.JSONObject) binds: [B:16:0x00de, B:18:0x00e4] A[DONT_GENERATE, DONT_INLINE]
              0x00e7: PHI (r13v2 'th' java.lang.Throwable) = (r13v1 'th' java.lang.Throwable), (r13v7 'th' java.lang.Throwable) binds: [B:16:0x00de, B:18:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 293
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1872140yom.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("XBridgeAPIRequestUtils@6430.handleSuccess$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("XBridgeAPIRequestUtils@6430.handleSuccess$1");
            }
        });
    }

    public static void LJIIJJI(C1872020yoa c1872020yoa, String str, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, Map map, C1872010yoZ c1872010yoZ, IHostNetworkDepend iHostNetworkDepend) {
        c1872020yoa.getClass();
        C1502850pD9 c1502850pD9 = new C1502850pD9(str);
        c1502850pD9.LIZIZ = linkedHashMap;
        c1502850pD9.LJIIIIZZ = linkedHashMap2;
        c1502850pD9.LJ = map;
        c1502850pD9.LIZJ = true;
        c1502850pD9.LJII = null;
        C1502840pD8 c1502840pD8 = C1502840pD8.LIZ;
        EnumC1503380pE0 enumC1503380pE0 = EnumC1503380pE0.POST;
        c1502840pD8.getClass();
        LJ(C1502840pD8.LJFF(enumC1503380pE0, c1502850pD9, iHostNetworkDepend), c1872010yoZ, false);
    }

    public static void LJIIJ(String str, Map map, String str2, boolean z, Boolean bool, byte[] bArr, InterfaceC1871560ynq interfaceC1871560ynq, IHostNetworkDepend iHostNetworkDepend, C1872040yoc c1872040yoc) {
        boolean zBooleanValue;
        Long l;
        try {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.putAll(map);
            C1502850pD9 c1502850pD9 = new C1502850pD9(str);
            c1502850pD9.LIZIZ = linkedHashMap;
            c1502850pD9.LJI = str2;
            if (bool == null) {
                zBooleanValue = true;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            c1502850pD9.LIZJ = zBooleanValue;
            c1502850pD9.LJFF = bArr;
            c1502850pD9.LIZLLL = z;
            if (c1872040yoc == null) {
                l = null;
            } else {
                l = c1872040yoc.LIZ;
            }
            c1502850pD9.LJII = l;
            C1502840pD8 c1502840pD8 = C1502840pD8.LIZ;
            EnumC1503380pE0 enumC1503380pE0 = EnumC1503380pE0.POST;
            c1502840pD8.getClass();
            interfaceC1871560ynq.LIZ(C1502840pD8.LJ(enumC1503380pE0, c1502850pD9, iHostNetworkDepend));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZJ(String str, Map map, boolean z, Boolean bool, C0C9A c0c9a, IHostNetworkDepend iHostNetworkDepend, C1872110yoj c1872110yoj, C1872120yok c1872120yok, C1872040yoc c1872040yoc, boolean z2) {
        boolean zBooleanValue;
        Long l;
        C1502850pD9 c1502850pD9 = new C1502850pD9(str);
        c1502850pD9.LIZIZ = (LinkedHashMap) map;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        c1502850pD9.LIZJ = zBooleanValue;
        c1502850pD9.LIZLLL = z;
        if (c1872040yoc != null) {
            l = c1872040yoc.LIZ;
        } else {
            l = null;
        }
        c1502850pD9.LJII = l;
        if (c1872110yoj != null && c1872110yoj.LIZ) {
            if (c1872120yok != null) {
                C1502840pD8 c1502840pD8 = C1502840pD8.LIZ;
                EnumC1503380pE0 enumC1503380pE0 = EnumC1503380pE0.GET;
                c1502840pD8.getClass();
                c1872120yok.LIZ(C1502840pD8.LJ(enumC1503380pE0, c1502850pD9, iHostNetworkDepend));
                return;
            }
            return;
        }
        C1502840pD8 c1502840pD82 = C1502840pD8.LIZ;
        EnumC1503380pE0 enumC1503380pE02 = EnumC1503380pE0.GET;
        c1502840pD82.getClass();
        LJ(C1502840pD8.LJFF(enumC1503380pE02, c1502850pD9, iHostNetworkDepend), c0c9a, z2);
    }

    public static void LJIIIZ(String str, Map map, String str2, boolean z, Boolean bool, byte[] bArr, C0C9A c0c9a, IHostNetworkDepend iHostNetworkDepend, C1872110yoj c1872110yoj, C1872120yok c1872120yok, C1872040yoc c1872040yoc, boolean z2) {
        boolean zBooleanValue;
        Long l;
        try {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.putAll(map);
            C1502850pD9 c1502850pD9 = new C1502850pD9(str);
            c1502850pD9.LIZIZ = linkedHashMap;
            c1502850pD9.LJI = str2;
            if (bool == null) {
                zBooleanValue = true;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            c1502850pD9.LIZJ = zBooleanValue;
            c1502850pD9.LJFF = bArr;
            if (c1872040yoc == null) {
                l = null;
            } else {
                l = c1872040yoc.LIZ;
            }
            c1502850pD9.LJII = l;
            c1502850pD9.LIZLLL = z;
            if (c1872110yoj != null && c1872110yoj.LIZ) {
                if (c1872120yok != null) {
                    C1502840pD8 c1502840pD8 = C1502840pD8.LIZ;
                    EnumC1503380pE0 enumC1503380pE0 = EnumC1503380pE0.POST;
                    c1502840pD8.getClass();
                    c1872120yok.LIZ(C1502840pD8.LJ(enumC1503380pE0, c1502850pD9, iHostNetworkDepend));
                    return;
                }
                return;
            }
            C1502840pD8 c1502840pD82 = C1502840pD8.LIZ;
            EnumC1503380pE0 enumC1503380pE02 = EnumC1503380pE0.POST;
            c1502840pD82.getClass();
            LJ(C1502840pD8.LJFF(enumC1503380pE02, c1502850pD9, iHostNetworkDepend), c0c9a, z2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJIILJJIL(String str, String str2, String str3, Map map, String str4, boolean z, Boolean bool, byte[] bArr, C1872130yol c1872130yol, IHostNetworkDepend iHostNetworkDepend, InterfaceC1872030yob interfaceC1872030yob, C1872040yoc c1872040yoc) {
        boolean zBooleanValue;
        try {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.putAll(map);
            C1502850pD9 c1502850pD9 = new C1502850pD9(str3);
            c1502850pD9.LIZIZ = linkedHashMap;
            c1502850pD9.LJI = str4;
            if (bool == null) {
                zBooleanValue = true;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            c1502850pD9.LIZJ = zBooleanValue;
            c1502850pD9.LJFF = bArr;
            c1502850pD9.LIZLLL = z;
            c1502850pD9.LJII = c1872040yoc.LIZ;
            C1502840pD8 c1502840pD8 = C1502840pD8.LIZ;
            EnumC1503380pE0 enumC1503380pE0 = EnumC1503380pE0.POST;
            c1502840pD8.getClass();
            LJI(str, str2, interfaceC1872030yob, C1502840pD8.LJ(enumC1503380pE0, c1502850pD9, iHostNetworkDepend), c1872130yol);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:2:0x0000, B:6:0x0016, B:12:0x0022, B:14:0x0028, B:16:0x002e, B:17:0x003a, B:22:0x0056, B:23:0x005a, B:36:0x009a, B:37:0x009c, B:39:0x00a2, B:43:0x00aa, B:45:0x00b9, B:18:0x0044, B:24:0x0061, B:25:0x006a, B:27:0x0070, B:28:0x0080, B:32:0x008e, B:33:0x0092), top: B:50:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(java.lang.String r7, java.util.Map r8, java.lang.String r9, boolean r10, java.lang.Boolean r11, org.json.JSONObject r12, X.C0C9A r13, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend r14, java.lang.Integer r15, X.C1872110yoj r16, X.C1872120yok r17, X.C1872040yoc r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1872020yoa.LJIIIIZZ(java.lang.String, java.util.Map, java.lang.String, boolean, java.lang.Boolean, org.json.JSONObject, X.0C9A, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend, java.lang.Integer, X.0yoj, X.0yok, X.0yoc, boolean):void");
    }
}
