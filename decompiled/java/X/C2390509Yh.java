package X;

import android.content.Context;
import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.MinisPkg;
import com.ss.android.ugc.aweme.minis.model.MinisPkgConfig;
import com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Yh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2390509Yh {
    public static final C2390509Yh LIZ = new C2390509Yh();
    public static final ConcurrentHashMap<String, C2391409Yq> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C2391409Yq> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<InterfaceC2391909Yv>> LIZLLL = new ConcurrentHashMap<>();
    public static final Object LJ = new Object();
    public static final C1DEV LJFF = C2191201ApK.LIZ();
    public static final C1DEV LJI = C2191201ApK.LIZ();

    public static List LJIJJLI() {
        C0VSJ c0vsj = new C0VSJ(LJIILL());
        if (!c0vsj.exists() || !c0vsj.isDirectory()) {
            return C13BV.INSTANCE;
        }
        File[] fileArrListFiles = c0vsj.listFiles();
        return fileArrListFiles == null ? C13BV.INSTANCE : C09RB.LJJII(new C08LY(C09RB.LJIIIZ(C09RB.LJIIIZ(C13LQ.LJIIJJI(fileArrListFiles), AFwS231S0000000_3.get$arr$(174)), AFwS231S0000000_3.get$arr$(175)), AFwS231S0000000_3.get$arr$(176)));
    }

    public static JSONObject LJJIFFI() {
        Reader bufferedReader;
        C0VSJ c0vsj = new C0VSJ(C09Z0.LJI());
        Throwable th = null;
        if (!MinisTtmgConfigSettings.LIZ().enableMinisPkgsConfigReadFallback) {
            JSONObject jSONObject = new JSONObject();
            if (c0vsj.exists()) {
                Reader inputStreamReader = new InputStreamReader(new C0VSP(c0vsj), Charsets.UTF_8);
                if (!(inputStreamReader instanceof BufferedReader)) {
                    inputStreamReader = new BufferedReader(inputStreamReader, 8192);
                }
                try {
                    jSONObject = new JSONObject(C08KC.LIZJ(bufferedReader));
                    C2107108Nh.LIZ(bufferedReader, null);
                } finally {
                    try {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            while (true) {
                            }
                        }
                    } catch (Throwable th3) {
                    }
                }
            }
            return jSONObject;
        }
        if (!c0vsj.exists() || c0vsj.length() == 0) {
            return new JSONObject();
        }
        try {
            Reader inputStreamReader2 = new InputStreamReader(new C0VSP(c0vsj), Charsets.UTF_8);
            bufferedReader = inputStreamReader2 instanceof BufferedReader ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
            try {
                String strLIZJ = C08KC.LIZJ(bufferedReader);
                C2107108Nh.LIZ(bufferedReader, null);
                return a0.LJJJIL(strLIZJ) ? new JSONObject() : new JSONObject(strLIZJ);
            } finally {
                try {
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    while (true) {
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    public static String LJIILL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C09Z0.LJFF());
        sbLIZ.append('/');
        sbLIZ.append(C09Z0.LJ ? "MinisNativeRuntime/Library/Caches/minis_debug" : "MinisNativeRuntime/Library/Caches/minis");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIILLIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C09Z0.LJFF());
        sbLIZ.append('/');
        sbLIZ.append(C09Z0.LJ ? "MinisNativeRuntime/Library/Caches/minis_debug_pkgs" : "MinisNativeRuntime/Library/Caches/minis_pkgs");
        sbLIZ.append("/history.json");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIZILJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C09Z0.LJFF());
        sbLIZ.append('/');
        sbLIZ.append(C09Z0.LJ ? "MinisNativeRuntime/Library/Caches/minis_debug_pkgs" : "MinisNativeRuntime/Library/Caches/minis_pkgs");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C09Z0.LJFF());
        sbLIZ.append('/');
        sbLIZ.append(C09Z0.LJ ? "MinisNativeRuntime/Library/Caches/minis_debug_pkgs" : "MinisNativeRuntime/Library/Caches/minis_pkgs");
        sbLIZ.append("/plugin_history.json");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(java.lang.String r5) {
        /*
            com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings$MinisTtmgConfigModel r0 = com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings.LIZ()
            boolean r0 = r0.minisDownloaderNew
            if (r0 != 0) goto L12
            X.09Yi r0 = X.C2390609Yi.LIZ
            r0.getClass()
            boolean r0 = X.C2390609Yi.LIZ(r5)
            return r0
        L12:
            X.0VSJ r2 = new X.0VSJ
            r2.<init>(r5)
            boolean r0 = r2.exists()
            r1 = 0
            if (r0 == 0) goto L58
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L58
            java.io.File[] r5 = r2.listFiles()
            r0 = 1
            if (r5 != 0) goto L2c
            return r0
        L2c:
            int r4 = r5.length
            r3 = 1
            r2 = 0
        L2f:
            if (r2 >= r4) goto L57
            r1 = r5[r2]
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L4c
            java.lang.String r0 = r1.getAbsolutePath()
            boolean r0 = LIZJ(r0)
            r1.delete()
            if (r3 == 0) goto L55
            if (r0 == 0) goto L55
        L48:
            r3 = 1
        L49:
            int r2 = r2 + 1
            goto L2f
        L4c:
            boolean r0 = r1.delete()
            if (r3 == 0) goto L55
            if (r0 == 0) goto L55
            goto L48
        L55:
            r3 = 0
            goto L49
        L57:
            return r3
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2390509Yh.LIZJ(java.lang.String):boolean");
    }

    public static void LJIIL(String str) {
        File parentFile;
        if (str.length() != 0 && (parentFile = new C0VSJ(str).getParentFile()) != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
    }

    public static String LJIILJJIL(String str) {
        C844470XAv.LIZ.getClass();
        return C09Z0.LIZJ(C844470XAv.LIZ(), str);
    }

    public static boolean LJIJI(String str) {
        File[] fileArrListFiles;
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || !c0vsj.isDirectory() || (fileArrListFiles = c0vsj.listFiles()) == null || fileArrListFiles.length == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJJ(String str) {
        JSONObject jSONObjectOptJSONObject;
        if (LJIJI(C09Z0.LJII())) {
            return true;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        JSONObject jSONObjectOptJSONObject2 = LJJIFFI().optJSONObject("plugins");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("packages")) == null || jSONObjectOptJSONObject.optJSONObject(str) == null) {
            return true;
        }
        return false;
    }

    public static void LJJIIJZLJL(List list) throws Throwable {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                jSONArray.put((String) it2.next());
            }
            jSONObject.put("open_order_history", jSONArray);
            LJIIL(LJIILLIIL());
            C09BH.LJIIIZ(new C0VSJ(LJIILLIIL()), C786410Ut5.J3(jSONObject), Charsets.UTF_8);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJJIIZ(List list) throws Throwable {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                jSONArray.put((String) it2.next());
            }
            jSONObject.put("plugin_order_history", jSONArray);
            LJIIL(LJIJ());
            C09BH.LJIIIZ(new C0VSJ(LJIJ()), C786410Ut5.J3(jSONObject), Charsets.UTF_8);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:16:0x003f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJJIIZI(org.json.JSONObject r4) {
        /*
            java.lang.String r0 = X.C09Z0.LJI()
            LJIIL(r0)
            X.0VSJ r2 = new X.0VSJ
            java.lang.String r0 = X.C09Z0.LJI()
            r2.<init>(r0)
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> L47
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch: java.lang.Exception -> L47
            X.0VSV r0 = new X.0VSV     // Catch: java.lang.Exception -> L47
            r0.<init>(r2)     // Catch: java.lang.Exception -> L47
            r3.<init>(r0, r1)     // Catch: java.lang.Exception -> L47
            boolean r0 = r3 instanceof java.io.BufferedWriter     // Catch: java.lang.Exception -> L47
            if (r0 == 0) goto L23
            java.io.BufferedWriter r3 = (java.io.BufferedWriter) r3     // Catch: java.lang.Exception -> L47
            goto L2b
        L23:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch: java.lang.Exception -> L47
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L47
            r3 = r1
        L2b:
            r2 = 0
            java.lang.String r0 = X.C786410Ut5.J3(r4)     // Catch: java.lang.Throwable -> L37
            r3.write(r0)     // Catch: java.lang.Throwable -> L37
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Exception -> L47
            return
        L37:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L3f
            throw r1     // Catch: java.lang.Throwable -> L3c
        L3c:
            r0 = move-exception
            r2 = r1
            goto L40
        L3f:
            r0 = move-exception
        L40:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3f
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Exception -> L47
            throw r0     // Catch: java.lang.Exception -> L47
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2390509Yh.LJJIIZI(org.json.JSONObject):void");
    }

    public final synchronized void LIZLLL(String str) {
        String strOptString;
        JSONObject jSONObjectLJJIFFI = LJJIFFI();
        JSONObject jSONObjectOptJSONObject = jSONObjectLJJIFFI.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("packages");
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject3 != null) {
                strOptString = jSONObjectOptJSONObject3.optString("md5");
            } else {
                strOptString = null;
            }
            if (C123100dR.LIZ(strOptString)) {
                LIZ.getClass();
                C0VSJ c0vsj = new C0VSJ(LJIIZILJ(), strOptString);
                if (c0vsj.exists()) {
                    c0vsj.delete();
                }
            }
        }
        jSONObjectLJJIFFI.remove(str);
        LJJIIZI(jSONObjectLJJIFFI);
        C0VSJ c0vsj2 = new C0VSJ(LJIILL(), str);
        LIZJ(c0vsj2.getAbsolutePath());
        if (c0vsj2.exists()) {
            c0vsj2.delete();
        }
    }

    public final synchronized void LJ(String str) {
        String strOptString;
        JSONObject jSONObjectLJJIFFI = LJJIFFI();
        JSONObject jSONObjectOptJSONObject = jSONObjectLJJIFFI.optJSONObject("plugins");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("packages");
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
        while (itKeys.hasNext()) {
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(itKeys.next());
            if (jSONObjectOptJSONObject3 != null) {
                strOptString = jSONObjectOptJSONObject3.optString("md5");
            } else {
                strOptString = null;
            }
            if (C123100dR.LIZ(strOptString)) {
                LIZ.getClass();
                C0VSJ c0vsj = new C0VSJ(LJIIZILJ(), strOptString);
                if (c0vsj.exists()) {
                    c0vsj.delete();
                }
            }
        }
        jSONObjectOptJSONObject2.remove(str);
        LJJIIZI(jSONObjectLJJIFFI);
        C0VSJ c0vsj2 = new C0VSJ(C09Z0.LJII(), str);
        LIZJ(c0vsj2.getAbsolutePath());
        if (c0vsj2.exists()) {
            c0vsj2.delete();
        }
    }

    public final synchronized void LJJIIJ(String str) {
        if (!MinisTtmgConfigSettings.LIZ().minisDownloaderNew) {
            C2390609Yi.LIZ.getClass();
            if (str != null && str.length() != 0) {
                JSONObject jSONObjectLJ = C2390609Yi.LJ();
                jSONObjectLJ.remove(str);
                C2390609Yi.LJI(jSONObjectLJ);
            }
            return;
        }
        if (str != null && str.length() != 0) {
            JSONObject jSONObjectLJJIFFI = LJJIFFI();
            jSONObjectLJJIFFI.remove(str);
            LJJIIZI(jSONObjectLJJIFFI);
        }
    }

    public static boolean LJIL(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        if (LJIJI(LJIILJJIL(str))) {
            return true;
        }
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        JSONObject jSONObjectOptJSONObject2 = LJJIFFI().optJSONObject(str);
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("packages")) == null || jSONObjectOptJSONObject.optJSONObject(str2) == null) {
            return true;
        }
        return false;
    }

    public final boolean LJIILIIL(String str, Map<String, MinisPkg> map) {
        boolean z;
        String strOptString;
        String str2;
        String strOptString2;
        String str3;
        String str4;
        if (str == null || str.length() == 0 || map == null || map.isEmpty()) {
            return false;
        }
        if (!MinisTtmgConfigSettings.LIZ().minisDownloaderNew) {
            C2390609Yi.LIZ.getClass();
            JSONObject jSONObjectOptJSONObject = C2390609Yi.LJ().optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("packages");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
            z = false;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(next);
                if (jSONObjectOptJSONObject3 != null) {
                    strOptString2 = jSONObjectOptJSONObject3.optString("md5");
                } else {
                    strOptString2 = null;
                }
                MinisPkg minisPkg = map.get(next);
                if (minisPkg != null) {
                    str3 = minisPkg.md5;
                } else {
                    str3 = null;
                }
                if (!Intrinsics.LJFF(strOptString2, str3)) {
                    if (C123100dR.LIZ(strOptString2)) {
                        C2390609Yi.LIZ.getClass();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(C09Z0.LJFF());
                        sbLIZ.append('/');
                        if (C09Z0.LJ) {
                            str4 = "MinisNativeRuntime/Library/Caches/minis_debug_pkgs";
                        } else {
                            str4 = "MinisNativeRuntime/Library/Caches/minis_pkgs";
                        }
                        sbLIZ.append(str4);
                        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ), strOptString2);
                        if (c0vsj.exists()) {
                            c0vsj.delete();
                        }
                    }
                    z = true;
                }
            }
        } else {
            JSONObject jSONObjectOptJSONObject4 = LJJIFFI().optJSONObject(str);
            if (jSONObjectOptJSONObject4 == null) {
                jSONObjectOptJSONObject4 = new JSONObject();
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject("packages");
            if (jSONObjectOptJSONObject5 == null) {
                jSONObjectOptJSONObject5 = new JSONObject();
            }
            Iterator<String> itKeys2 = jSONObjectOptJSONObject5.keys();
            z = false;
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject(next2);
                if (jSONObjectOptJSONObject6 != null) {
                    strOptString = jSONObjectOptJSONObject6.optString("md5");
                } else {
                    strOptString = null;
                }
                MinisPkg minisPkg2 = map.get(next2);
                if (minisPkg2 != null) {
                    str2 = minisPkg2.md5;
                } else {
                    str2 = null;
                }
                if (!Intrinsics.LJFF(strOptString, str2)) {
                    if (C123100dR.LIZ(strOptString)) {
                        LIZ.getClass();
                        C0VSJ c0vsj2 = new C0VSJ(LJIIZILJ(), strOptString);
                        if (c0vsj2.exists()) {
                            c0vsj2.delete();
                        }
                    }
                    z = true;
                }
            }
        }
        if (!z) {
            return false;
        }
        LJJIIJ(str);
        LIZJ(LJIILJJIL(str));
        return true;
    }

    public final synchronized void LJJIII(String str, String str2) {
        if (str != null) {
            if (str.length() != 0 && str2 != null && str2.length() != 0) {
                JSONObject jSONObjectLJJIFFI = LJJIFFI();
                JSONObject jSONObjectOptJSONObject = jSONObjectLJJIFFI.optJSONObject("plugins");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("packages");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                }
                jSONObjectOptJSONObject2.put(str, new JSONObject(str2));
                jSONObjectOptJSONObject.put("packages", jSONObjectOptJSONObject2);
                jSONObjectLJJIFFI.put("plugins", jSONObjectOptJSONObject);
                LJJIIZI(jSONObjectLJJIFFI);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIJJ(java.lang.String r7, com.ss.android.ugc.aweme.minis.model.MinisPkgConfig r8, java.lang.String r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2390509Yh.LJIJJ(java.lang.String, com.ss.android.ugc.aweme.minis.model.MinisPkgConfig, java.lang.String):boolean");
    }

    public static void LJJI(Context context, SchemaParserData schemaParserData, MinisMetaResp minisMetaResp) {
        MinisPkg minisPkg;
        String str;
        String str2;
        MinisPkg minisPkg2;
        String str3;
        String str4;
        String str5 = "__GAME__";
        if (!MinisTtmgConfigSettings.LIZ().minisDownloaderNew) {
            C2390609Yi.LIZ.getClass();
            if (MinisTtmgConfigSettings.LIZ().enablePreload && schemaParserData != null && minisMetaResp != null) {
                TiktokMinisQueryParams tiktokMinisQueryParams = schemaParserData.tiktokMinisParams;
                if (tiktokMinisQueryParams != null && (str4 = tiktokMinisQueryParams.ttmgInitModule) != null && str4.length() != 0) {
                    str5 = str4;
                }
                C1227904rF c1227904rF = C1227904rF.LIZ;
                String str6 = minisMetaResp.packageConfig;
                c1227904rF.getClass();
                MinisPkgConfig minisPkgConfig = (MinisPkgConfig) C1227904rF.LIZIZ(str6, MinisPkgConfig.class);
                Map<String, MinisPkg> map = minisPkgConfig.packages;
                if (map != null && (minisPkg2 = map.get(str5)) != null && (str3 = schemaParserData.clientKey) != null) {
                    C2390609Yi.LIZIZ(context, str3, str5, minisPkg2, schemaParserData, minisPkgConfig, false, true, true, new InterfaceC2392009Yw() { // from class: X.09Yx
                        @Override // X.InterfaceC2392009Yw
                        public final void LIZ(C2391409Yq c2391409Yq, boolean z) {
                        }

                        @Override // X.InterfaceC2392009Yw
                        public final void LIZIZ(C2391409Yq c2391409Yq, int i) {
                        }

                        @Override // X.InterfaceC2392009Yw
                        public final void LIZJ(C2391409Yq c2391409Yq, Exception exc) {
                        }

                        @Override // X.InterfaceC2392009Yw
                        public final void LIZLLL(C2391409Yq c2391409Yq) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (MinisTtmgConfigSettings.LIZ().enablePreload && schemaParserData != null && minisMetaResp != null) {
            TiktokMinisQueryParams tiktokMinisQueryParams2 = schemaParserData.tiktokMinisParams;
            if (tiktokMinisQueryParams2 != null && (str2 = tiktokMinisQueryParams2.ttmgInitModule) != null && str2.length() != 0) {
                str5 = str2;
            }
            C1227904rF c1227904rF2 = C1227904rF.LIZ;
            String str7 = minisMetaResp.packageConfig;
            c1227904rF2.getClass();
            MinisPkgConfig minisPkgConfig2 = (MinisPkgConfig) C1227904rF.LIZIZ(str7, MinisPkgConfig.class);
            Map<String, MinisPkg> map2 = minisPkgConfig2.packages;
            if (map2 != null && (minisPkg = map2.get(str5)) != null && (str = schemaParserData.clientKey) != null) {
                C2390509Yh c2390509Yh = LIZ;
                InterfaceC2391909Yv interfaceC2391909Yv = new InterfaceC2391909Yv() { // from class: X.09Ys
                    @Override // X.InterfaceC2391909Yv
                    public final void LIZ(C2391409Yq c2391409Yq, boolean z) {
                    }

                    @Override // X.InterfaceC2391909Yv
                    public final void LIZIZ(C2391409Yq c2391409Yq, int i) {
                    }

                    @Override // X.InterfaceC2391909Yv
                    public final void LIZJ(C2391409Yq c2391409Yq, Exception exc) {
                    }

                    @Override // X.InterfaceC2391909Yv
                    public final void LIZLLL(C2391409Yq c2391409Yq) {
                    }
                };
                c2390509Yh.getClass();
                LJI(context, str, str5, minisPkg, schemaParserData, minisPkgConfig2, false, true, true, interfaceC2391909Yv);
            }
        }
    }

    public final synchronized void LJJII(String str, String str2, String str3) {
        if (str2 != null) {
            if (str2.length() != 0 && str3 != null && str3.length() != 0) {
                JSONObject jSONObjectLJJIFFI = LJJIFFI();
                JSONObject jSONObjectOptJSONObject = jSONObjectLJJIFFI.optJSONObject(str);
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("packages");
                if (jSONObjectOptJSONObject2 == null) {
                    jSONObjectOptJSONObject2 = new JSONObject();
                }
                jSONObjectOptJSONObject2.put(str2, new JSONObject(str3));
                jSONObjectOptJSONObject.put("packages", jSONObjectOptJSONObject2);
                jSONObjectLJJIFFI.put(str, jSONObjectOptJSONObject);
                LJJIIZI(jSONObjectLJJIFFI);
            }
        }
    }

    public static void LJIIJJI(int i, String str, String str2, String str3, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", str3);
        jSONObject.put("name", str2);
        jSONObject.put("taskId", str);
        jSONObject.put("progress", i);
        jSONObject.put("totalBytesWritten", 0);
        jSONObject.put("totalBytesExpectedWrite", 0);
        jSONObject.put("isStartup", z);
        IMiniGameRuntimeAPI iMiniGameRuntimeAPILJI = C2195221Avo.LJI();
        if (iMiniGameRuntimeAPILJI != null) {
            iMiniGameRuntimeAPILJI.emitJSAPIEvent("onLoadSubPackageTaskStateChange", jSONObject);
        }
    }

    public static boolean LJII(Context context, String str, MinisPkgConfig minisPkgConfig, String str2, MinisPkg minisPkg, SchemaParserData schemaParserData, boolean z) {
        String str3;
        String str4 = minisPkg.url;
        if (str4 == null || str4.length() == 0 || (str3 = minisPkg.md5) == null || str3.length() == 0 || str2.length() == 0 || str.length() == 0) {
            return false;
        }
        return ((Boolean) C23250099c.LJ(C0PEM.LIZJ, new C2172108f9(context, str, str2, minisPkgConfig, minisPkg, schemaParserData, false, z, null))).booleanValue();
    }

    public final synchronized boolean LIZIZ(Context context, String str, String str2, String str3, String str4, String str5, boolean z) {
        boolean z2;
        if (context == null) {
            return false;
        }
        try {
            if (!MinisTtmgConfigSettings.LIZ().disableDecompressStreamMode && C0C64.LJIILLIIL().LJIJ(31744, 0, "minis_enable_decompress_stream_mode", true) != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C1293930jmB.LIZ.getClass();
            C1293930jmB.LIZ(str2, str3, z2);
            if (z) {
                LIZ.LJJIII(str4, str5);
            } else {
                LIZ.LJJII(str, str4, str5);
                if (C123100dR.LIZ(str)) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C08X5(str, null), 3);
                }
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0135, code lost:
    
        if (r1 != r3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:13:0x004e, B:21:0x0083, B:23:0x0089, B:25:0x0091, B:31:0x009e, B:33:0x00a2, B:35:0x00aa, B:37:0x00b4, B:40:0x00c9, B:44:0x00d2, B:48:0x00f6, B:50:0x00fe, B:54:0x0106, B:56:0x0130, B:38:0x00be, B:47:0x00f3, B:18:0x0079, B:20:0x007f), top: B:67:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:13:0x004e, B:21:0x0083, B:23:0x0089, B:25:0x0091, B:31:0x009e, B:33:0x00a2, B:35:0x00aa, B:37:0x00b4, B:40:0x00c9, B:44:0x00d2, B:48:0x00f6, B:50:0x00fe, B:54:0x0106, B:56:0x0130, B:38:0x00be, B:47:0x00f3, B:18:0x0079, B:20:0x007f), top: B:67:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:13:0x004e, B:21:0x0083, B:23:0x0089, B:25:0x0091, B:31:0x009e, B:33:0x00a2, B:35:0x00aa, B:37:0x00b4, B:40:0x00c9, B:44:0x00d2, B:48:0x00f6, B:50:0x00fe, B:54:0x0106, B:56:0x0130, B:38:0x00be, B:47:0x00f3, B:18:0x0079, B:20:0x007f), top: B:67:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:13:0x004e, B:21:0x0083, B:23:0x0089, B:25:0x0091, B:31:0x009e, B:33:0x00a2, B:35:0x00aa, B:37:0x00b4, B:40:0x00c9, B:44:0x00d2, B:48:0x00f6, B:50:0x00fe, B:54:0x0106, B:56:0x0130, B:38:0x00be, B:47:0x00f3, B:18:0x0079, B:20:0x007f), top: B:67:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:13:0x004e, B:21:0x0083, B:23:0x0089, B:25:0x0091, B:31:0x009e, B:33:0x00a2, B:35:0x00aa, B:37:0x00b4, B:40:0x00c9, B:44:0x00d2, B:48:0x00f6, B:50:0x00fe, B:54:0x0106, B:56:0x0130, B:38:0x00be, B:47:0x00f3, B:18:0x0079, B:20:0x007f), top: B:67:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106 A[Catch: Exception -> 0x013c, TryCatch #0 {Exception -> 0x013c, blocks: (B:13:0x004e, B:21:0x0083, B:23:0x0089, B:25:0x0091, B:31:0x009e, B:33:0x00a2, B:35:0x00aa, B:37:0x00b4, B:40:0x00c9, B:44:0x00d2, B:48:0x00f6, B:50:0x00fe, B:54:0x0106, B:56:0x0130, B:38:0x00be, B:47:0x00f3, B:18:0x0079, B:20:0x007f), top: B:67:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009c -> B:60:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a0 -> B:60:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a8 -> B:60:0x0136). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Context r19, java.lang.String r20, com.ss.android.ugc.aweme.minis.model.MinisPkgConfig r21, com.ss.android.ugc.aweme.minis.model.MinisPkg r22, com.ss.android.ugc.aweme.minis.common.SchemaParserData r23, boolean r24, boolean r25, X.InterfaceC1364105Vn r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2390509Yh.LIZ(android.content.Context, java.lang.String, com.ss.android.ugc.aweme.minis.model.MinisPkgConfig, com.ss.android.ugc.aweme.minis.model.MinisPkg, com.ss.android.ugc.aweme.minis.common.SchemaParserData, boolean, boolean, X.05Vn):java.lang.Object");
    }

    public static Object LJFF(Context context, String str, final String str2, MinisPkg minisPkg, SchemaParserData schemaParserData, boolean z, boolean z2, boolean z3, C2391109Yn c2391109Yn) {
        String strLJII;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c2391109Yn));
        c2252611DEt.LJIJJ();
        if (z3) {
            LIZ.getClass();
            strLJII = LJIILJJIL(str);
        } else {
            LIZ.getClass();
            strLJII = C09Z0.LJII();
        }
        LIZ.getClass();
        LJIIJ(context, str, str2, minisPkg, LJIIZILJ(), strLJII, !z3, schemaParserData, z, z2, new InterfaceC2391909Yv() { // from class: X.08fB
            @Override // X.InterfaceC2391909Yv
            public final void LIZIZ(C2391409Yq c2391409Yq, int i) {
            }

            @Override // X.InterfaceC2391909Yv
            public final void LIZLLL(C2391409Yq c2391409Yq) {
            }

            @Override // X.InterfaceC2391909Yv
            public final void LIZ(C2391409Yq c2391409Yq, boolean z4) {
                if (!c2252611DEt.isCancelled()) {
                    Boolean boolValueOf = Boolean.valueOf(z4);
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    C189200o6.m2constructorimpl(boolValueOf);
                    interfaceC20236714Gf.resumeWith(boolValueOf);
                }
            }

            @Override // X.InterfaceC2391909Yv
            public final void LIZJ(C2391409Yq c2391409Yq, Exception exc) {
                if (!c2252611DEt.isCancelled()) {
                    InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = c2252611DEt;
                    if (exc == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Download failed: ");
                        sbLIZ.append(str2);
                        exc = new Exception(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    C098200Yq c098200Yq = new C098200Yq(exc);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf.resumeWith(c098200Yq);
                }
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c2391109Yn);
        }
        return objLJIJ;
    }

    public static String LJIIIIZZ(String str, final MinisPkg minisPkg, boolean z, Context context, String str2, SchemaParserData schemaParserData, MinisPkgConfig minisPkgConfig, final boolean z2, final Function0 function0) {
        if (context != null && str2 != null && str2.length() != 0) {
            return LJI(context, str2, str, minisPkg, schemaParserData, minisPkgConfig, z2, false, z, new InterfaceC2391909Yv() { // from class: X.09Yo
                @Override // X.InterfaceC2391909Yv
                public final void LIZLLL(C2391409Yq c2391409Yq) {
                    if (z2) {
                        System.currentTimeMillis();
                        c2391409Yq.getClass();
                    }
                }

                @Override // X.InterfaceC2391909Yv
                public final void LIZ(C2391409Yq c2391409Yq, boolean z3) throws JSONException {
                    if (!Intrinsics.LJFF(c2391409Yq.LIZIZ, minisPkg.md5)) {
                        return;
                    }
                    if (z2) {
                        System.currentTimeMillis();
                    }
                    if (z3) {
                        C2390509Yh c2390509Yh = C2390509Yh.LIZ;
                        String str3 = c2391409Yq.LJ;
                        String str4 = c2391409Yq.LJFF;
                        boolean z4 = z2;
                        c2390509Yh.getClass();
                        C2390509Yh.LJIIJJI(100, str3, str4, "success", z4);
                        return;
                    }
                    C2390509Yh c2390509Yh2 = C2390509Yh.LIZ;
                    String str5 = c2391409Yq.LJ;
                    String str6 = c2391409Yq.LJFF;
                    boolean z5 = z2;
                    c2390509Yh2.getClass();
                    C2390509Yh.LJIIJJI(0, str5, str6, "fail", z5);
                }

                @Override // X.InterfaceC2391909Yv
                public final void LIZIZ(C2391409Yq c2391409Yq, int i) throws JSONException {
                    if (!Intrinsics.LJFF(c2391409Yq.LIZIZ, minisPkg.md5)) {
                        return;
                    }
                    C2390509Yh c2390509Yh = C2390509Yh.LIZ;
                    String str3 = c2391409Yq.LJ;
                    String str4 = c2391409Yq.LJFF;
                    boolean z3 = z2;
                    c2390509Yh.getClass();
                    C2390509Yh.LJIIJJI(i, str3, str4, "progressUpdaate", z3);
                }

                @Override // X.InterfaceC2391909Yv
                public final void LIZJ(C2391409Yq c2391409Yq, Exception exc) throws JSONException {
                    if (!Intrinsics.LJFF(c2391409Yq.LIZIZ, minisPkg.md5)) {
                        return;
                    }
                    if (z2) {
                        System.currentTimeMillis();
                    }
                    C2390509Yh c2390509Yh = C2390509Yh.LIZ;
                    String str3 = c2391409Yq.LJ;
                    String str4 = c2391409Yq.LJFF;
                    boolean z3 = z2;
                    if (exc != null) {
                        exc.getMessage();
                    }
                    c2390509Yh.getClass();
                    C2390509Yh.LJIIJJI(0, str3, str4, "fail", z3);
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            });
        }
        return "";
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.09Yq] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, X.09Yq, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static String LJI(Context context, String str, String str2, MinisPkg minisPkg, SchemaParserData schemaParserData, MinisPkgConfig minisPkgConfig, boolean z, boolean z2, boolean z3, final InterfaceC2391909Yv interfaceC2391909Yv) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ConcurrentHashMap<String, C2391409Yq> concurrentHashMap;
        CopyOnWriteArrayList<InterfaceC2391909Yv> copyOnWriteArrayListPutIfAbsent;
        if (!MinisTtmgConfigSettings.LIZ().minisDownloaderNew) {
            C2390609Yi c2390609Yi = C2390609Yi.LIZ;
            InterfaceC2392009Yw interfaceC2392009Yw = new InterfaceC2392009Yw() { // from class: X.09Yp
                @Override // X.InterfaceC2392009Yw
                public final void LIZLLL(C2391409Yq c2391409Yq) {
                    interfaceC2391909Yv.LIZLLL(c2391409Yq);
                }

                @Override // X.InterfaceC2392009Yw
                public final void LIZ(C2391409Yq c2391409Yq, boolean z8) {
                    interfaceC2391909Yv.LIZ(c2391409Yq, z8);
                }

                @Override // X.InterfaceC2392009Yw
                public final void LIZIZ(C2391409Yq c2391409Yq, int i) {
                    interfaceC2391909Yv.LIZIZ(c2391409Yq, i);
                }

                @Override // X.InterfaceC2392009Yw
                public final void LIZJ(C2391409Yq c2391409Yq, Exception exc) {
                    interfaceC2391909Yv.LIZJ(c2391409Yq, exc);
                }
            };
            c2390609Yi.getClass();
            return C2390609Yi.LIZIZ(context, str, str2, minisPkg, schemaParserData, minisPkgConfig, z, z2, z3, interfaceC2392009Yw);
        }
        String str3 = minisPkg.url;
        boolean z8 = false;
        if (str3 != null && str3.length() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4) {
            String str4 = minisPkg.md5;
            if (str4 != null && str4.length() != 0) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5) {
                if (str2.length() == 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    if (str.length() == 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (!z7) {
                        String str5 = "";
                        C259800zU c259800zU = new C259800zU();
                        c259800zU.element = "";
                        C259800zU c259800zU2 = new C259800zU();
                        c259800zU2.element = new C2391409Yq(null, null, null, null, null, null, null, null, LJIILJJIL(str), null, false, 7167);
                        synchronized (LJ) {
                            try {
                                ConcurrentHashMap<String, CopyOnWriteArrayList<InterfaceC2391909Yv>> concurrentHashMap2 = LIZLLL;
                                String str6 = minisPkg.md5;
                                CopyOnWriteArrayList<InterfaceC2391909Yv> copyOnWriteArrayList = concurrentHashMap2.get(str6);
                                if (copyOnWriteArrayList == null && (copyOnWriteArrayListPutIfAbsent = concurrentHashMap2.putIfAbsent(str6, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
                                    copyOnWriteArrayList = copyOnWriteArrayListPutIfAbsent;
                                }
                                copyOnWriteArrayList.add(interfaceC2391909Yv);
                                LIZ.getClass();
                                if (!MinisTtmgConfigSettings.LIZ().minisDownloaderNew) {
                                    C2390609Yi.LIZ.getClass();
                                    concurrentHashMap = C2390609Yi.LIZIZ;
                                } else {
                                    concurrentHashMap = LIZIZ;
                                }
                                for (Map.Entry<String, C2391409Yq> entry : concurrentHashMap.entrySet()) {
                                    String key = entry.getKey();
                                    if (Intrinsics.LJFF(entry.getValue().LIZIZ, minisPkg.md5)) {
                                        str5 = key;
                                    }
                                }
                                if (str5.length() > 0) {
                                    z8 = true;
                                }
                                if (z8) {
                                    return str5;
                                }
                                c259800zU.element = UUID.randomUUID().toString();
                                String str7 = minisPkg.url;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                String str8 = minisPkg.md5;
                                LIZ.getClass();
                                String strLJIIZILJ = LJIIZILJ();
                                String str9 = (String) c259800zU.element;
                                C1227904rF.LIZ.getClass();
                                String strLJI = C1227904rF.LJI(minisPkg);
                                if (strLJI == null) {
                                    strLJI = "";
                                }
                                ?? c2391409Yq = new C2391409Yq(str7, str8, str8, strLJIIZILJ, str9, str2, strLJI, null, LJIILJJIL(str), null, false, 6912);
                                c259800zU2.element = c2391409Yq;
                                LIZIZ.put((String) c259800zU.element, (C2391409Yq) c2391409Yq);
                                if (z3) {
                                    LIZJ.put((String) c259800zU.element, (C2391409Yq) c259800zU2.element);
                                }
                                if (C123100dR.LIZ(str5)) {
                                    return str5;
                                }
                                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2390709Yj(str, minisPkgConfig, str2, schemaParserData, z, z2, context, minisPkg, c259800zU, z3, c259800zU2, null), 3);
                                return (String) c259800zU.element;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                }
            }
        }
        interfaceC2391909Yv.LIZJ(new C2391409Yq(null, null, null, null, null, null, null, null, LJIILJJIL(str), null, false, 7167), new Exception("invalid params"));
        return "";
    }

    public static void LJIIJ(final Context context, final String str, final String str2, MinisPkg minisPkg, final String str3, String str4, boolean z, final SchemaParserData schemaParserData, final boolean z2, final boolean z3, final InterfaceC2391909Yv interfaceC2391909Yv) {
        String str5;
        String str6 = minisPkg.url;
        if (str6 != null && str6.length() != 0 && (str5 = minisPkg.md5) != null && str5.length() != 0 && str2 != null && str2.length() != 0 && str != null && str.length() != 0) {
            String string = UUID.randomUUID().toString();
            String str7 = minisPkg.url;
            String str8 = "";
            if (str7 == null) {
                str7 = "";
            }
            String str9 = minisPkg.md5;
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(minisPkg);
            if (strLJI != null) {
                str8 = strLJI;
            }
            C2391409Yq c2391409Yq = new C2391409Yq(str7, str9, str9, str3, string, str2, str8, new InterfaceC2391809Yu() { // from class: X.09Ym
                @Override // X.InterfaceC2391809Yu
                public final void LIZIZ(C2391409Yq c2391409Yq2) {
                    JSONArray jSONArray = C2196361Axe.LIZ;
                    C2196361Axe.LIZJ(schemaParserData, str2, z2, z3, false);
                    interfaceC2391909Yv.LIZLLL(c2391409Yq2);
                }

                @Override // X.InterfaceC2391809Yu
                public final void LIZJ(C2391409Yq c2391409Yq2) throws JSONException {
                    boolean zLJIL;
                    boolean zLIZIZ;
                    if (c2391409Yq2.LJIIJ) {
                        C2390509Yh c2390509Yh = C2390509Yh.LIZ;
                        String str10 = c2391409Yq2.LJFF;
                        c2390509Yh.getClass();
                        zLJIL = C2390509Yh.LJJ(str10);
                    } else {
                        C2390509Yh c2390509Yh2 = C2390509Yh.LIZ;
                        String str11 = str;
                        String str12 = c2391409Yq2.LJFF;
                        c2390509Yh2.getClass();
                        zLJIL = C2390509Yh.LJIL(str11, str12);
                    }
                    if (zLJIL) {
                        C2390509Yh c2390509Yh3 = C2390509Yh.LIZ;
                        Context context2 = context;
                        String str13 = str;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str3);
                        sbLIZ.append('/');
                        sbLIZ.append(c2391409Yq2.LIZJ);
                        zLIZIZ = c2390509Yh3.LIZIZ(context2, str13, C2188811AlT.LIZIZ(sbLIZ), c2391409Yq2.LJIIIZ, c2391409Yq2.LJFF, c2391409Yq2.LJI, c2391409Yq2.LJIIJ);
                    } else {
                        zLIZIZ = true;
                    }
                    JSONArray jSONArray = C2196361Axe.LIZ;
                    C2196361Axe.LIZIZ(schemaParserData, str2, zLIZIZ, true, zLIZIZ, "", z2, z3);
                    interfaceC2391909Yv.LIZ(c2391409Yq2, zLIZIZ);
                }

                @Override // X.InterfaceC2391809Yu
                public final void LIZ(C2391409Yq c2391409Yq2, int i) {
                    interfaceC2391909Yv.LIZIZ(c2391409Yq2, i);
                }

                @Override // X.InterfaceC2391809Yu
                public final void LIZLLL(C2391409Yq c2391409Yq2, Exception exc) throws JSONException {
                    String message;
                    JSONArray jSONArray = C2196361Axe.LIZ;
                    SchemaParserData schemaParserData2 = schemaParserData;
                    String str10 = str2;
                    if (exc != null) {
                        message = exc.getMessage();
                    } else {
                        message = null;
                    }
                    C2196361Axe.LIZIZ(schemaParserData2, str10, false, false, false, String.valueOf(message), z2, z3);
                    interfaceC2391909Yv.LIZJ(c2391409Yq2, exc);
                }
            }, LJIILJJIL(str), str4, z, 768);
            C2391509Yr.LIZ.getClass();
            C2391509Yr.LIZ(c2391409Yq);
            return;
        }
        C2391409Yq c2391409Yq2 = new C2391409Yq(null, null, null, null, null, null, null, null, LJIILJJIL(str), null, false, 7167);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Download failed: ");
        sbLIZ.append(str2);
        interfaceC2391909Yv.LIZJ(c2391409Yq2, new Exception(C2188811AlT.LIZIZ(sbLIZ)));
    }
}
