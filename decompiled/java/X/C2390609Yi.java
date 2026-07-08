package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisPkg;
import com.ss.android.ugc.aweme.minis.model.MinisPkgConfig;
import com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2390609Yi {
    public static final C2390609Yi LIZ = new C2390609Yi();
    public static final ConcurrentHashMap<String, C2391409Yq> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C2391409Yq> LIZJ = new ConcurrentHashMap<>();

    public static JSONObject LJ() {
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(java.lang.String r5) {
        /*
            X.0VSJ r2 = new X.0VSJ
            r2.<init>(r5)
            boolean r0 = r2.exists()
            r1 = 0
            if (r0 == 0) goto L46
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L46
            java.io.File[] r5 = r2.listFiles()
            r0 = 1
            if (r5 != 0) goto L1a
            return r0
        L1a:
            int r4 = r5.length
            r3 = 1
            r2 = 0
        L1d:
            if (r2 >= r4) goto L45
            r1 = r5[r2]
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L3a
            java.lang.String r0 = r1.getAbsolutePath()
            boolean r0 = LIZ(r0)
            r1.delete()
            if (r3 == 0) goto L43
            if (r0 == 0) goto L43
        L36:
            r3 = 1
        L37:
            int r2 = r2 + 1
            goto L1d
        L3a:
            boolean r0 = r1.delete()
            if (r3 == 0) goto L43
            if (r0 == 0) goto L43
            goto L36
        L43:
            r3 = 0
            goto L37
        L45:
            return r3
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2390609Yi.LIZ(java.lang.String):boolean");
    }

    public static boolean LIZJ(String str) {
        File[] fileArrListFiles;
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || !c0vsj.isDirectory() || (fileArrListFiles = c0vsj.listFiles()) == null || fileArrListFiles.length == 0) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x0035
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJI(org.json.JSONObject r4) throws java.lang.Throwable {
        /*
            X.0VSJ r2 = new X.0VSJ
            java.lang.String r0 = X.C09Z0.LJI()
            r2.<init>(r0)
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            X.0VSV r0 = new X.0VSV
            r0.<init>(r2)
            r3.<init>(r0, r1)
            boolean r0 = r3 instanceof java.io.BufferedWriter
            if (r0 != 0) goto L21
            java.io.BufferedWriter r1 = new java.io.BufferedWriter
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r3, r0)
            r3 = r1
        L21:
            r2 = 0
            java.lang.String r0 = X.C786410Ut5.J3(r4)     // Catch: java.lang.Throwable -> L2d
            r3.write(r0)     // Catch: java.lang.Throwable -> L2d
            X.C2107108Nh.LIZ(r3, r2)
            return
        L2d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L35
            throw r1     // Catch: java.lang.Throwable -> L32
        L32:
            r0 = move-exception
            r2 = r1
            goto L36
        L35:
            r0 = move-exception
        L36:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L35
            X.C2107108Nh.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2390609Yi.LJI(org.json.JSONObject):void");
    }

    public static boolean LIZLLL(String str, MinisPkgConfig minisPkgConfig, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        Map<String, MinisPkg> map;
        MinisPkg minisPkg;
        if (str == null || str.length() == 0) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        if (LIZJ(C09Z0.LIZJ(C844470XAv.LIZ(), str)) || str2.length() == 0) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(C09Z0.LJI());
        if (!c0vsj.exists()) {
            return false;
        }
        new JSONObject();
        Reader inputStreamReader = new InputStreamReader(new C0VSP(c0vsj), Charsets.UTF_8);
        if (!(inputStreamReader instanceof BufferedReader)) {
            inputStreamReader = new BufferedReader(inputStreamReader, 8192);
        }
        Throwable th = null;
        str = null;
        str = null;
        String str3 = null;
        try {
            JSONObject jSONObject = new JSONObject(C08KC.LIZJ(inputStreamReader));
            C2107108Nh.LIZ(inputStreamReader, null);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("packages")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str2)) == null) {
                return false;
            }
            String strOptString = jSONObjectOptJSONObject2.optString("md5");
            if (minisPkgConfig != null && (map = minisPkgConfig.packages) != null && (minisPkg = map.get(str2)) != null) {
                str3 = minisPkg.md5;
            }
            if (Intrinsics.LJFF(strOptString, str3)) {
                return true;
            }
            return false;
        } finally {
            try {
                try {
                } catch (Throwable th2) {
                    while (true) {
                    }
                }
            } catch (Throwable th3) {
            }
        }
    }

    public static void LJFF(String str, String str2, String str3) throws Throwable {
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            JSONObject jSONObjectLJ = LJ();
            JSONObject jSONObjectOptJSONObject = jSONObjectLJ.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("packages");
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            jSONObjectOptJSONObject2.put(str2, new JSONObject(str3));
            jSONObjectOptJSONObject.put("packages", jSONObjectOptJSONObject2);
            jSONObjectLJ.put(str, jSONObjectOptJSONObject);
            LJI(jSONObjectLJ);
        }
    }

    public static String LIZIZ(final Context context, final String str, final String str2, MinisPkg minisPkg, final SchemaParserData schemaParserData, MinisPkgConfig minisPkgConfig, final boolean z, final boolean z2, boolean z3, final InterfaceC2392009Yw interfaceC2392009Yw) {
        boolean z4;
        String str3;
        String str4;
        String str5 = minisPkg.url;
        if (str5 != null && str5.length() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        String str6 = "";
        if (z4 || (str3 = minisPkg.md5) == null || str3.length() == 0 || str2.length() == 0 || str.length() == 0 || LIZLLL(str, minisPkgConfig, str2)) {
            return "";
        }
        String string = UUID.randomUUID().toString();
        String str7 = minisPkg.url;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = minisPkg.md5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C09Z0.LJFF());
        sbLIZ.append('/');
        if (C09Z0.LJ) {
            str4 = "MinisNativeRuntime/Library/Caches/minis_debug_pkgs";
        } else {
            str4 = "MinisNativeRuntime/Library/Caches/minis_pkgs";
        }
        sbLIZ.append(str4);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(minisPkg);
        if (strLJI != null) {
            str6 = strLJI;
        }
        C844470XAv.LIZ.getClass();
        C2391409Yq c2391409Yq = new C2391409Yq(str7, str8, str8, strLIZIZ, string, str2, str6, new InterfaceC2391809Yu() { // from class: X.09Yk
            @Override // X.InterfaceC2391809Yu
            public final void LIZIZ(C2391409Yq c2391409Yq2) {
                JSONArray jSONArray = C2196361Axe.LIZ;
                C2196361Axe.LIZJ(schemaParserData, str2, z, z2, false);
                interfaceC2392009Yw.LIZLLL(c2391409Yq2);
            }

            @Override // X.InterfaceC2391809Yu
            public final void LIZJ(C2391409Yq c2391409Yq2) throws Throwable {
                String str9;
                boolean z5;
                JSONObject jSONObjectOptJSONObject;
                JSONObject jSONObjectOptJSONObject2;
                C2390609Yi c2390609Yi = C2390609Yi.LIZ;
                String str10 = str;
                String str11 = c2391409Yq2.LJFF;
                c2390609Yi.getClass();
                C844470XAv.LIZ.getClass();
                boolean z6 = true;
                if (C2390609Yi.LIZJ(C09Z0.LIZJ(C844470XAv.LIZ(), str10)) || (str11 != null && str11.length() != 0 && ((jSONObjectOptJSONObject = C2390609Yi.LJ().optJSONObject(str10)) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("packages")) == null || jSONObjectOptJSONObject2.optJSONObject(str11) == null))) {
                    Context context2 = context;
                    String str12 = str;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(C09Z0.LJFF());
                    sbLIZ3.append('/');
                    if (C09Z0.LJ) {
                        str9 = "MinisNativeRuntime/Library/Caches/minis_debug_pkgs";
                    } else {
                        str9 = "MinisNativeRuntime/Library/Caches/minis_pkgs";
                    }
                    sbLIZ3.append(str9);
                    sbLIZ2.append(C2188811AlT.LIZIZ(sbLIZ3));
                    sbLIZ2.append('/');
                    sbLIZ2.append(c2391409Yq2.LIZJ);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    String str13 = c2391409Yq2.LJIIIIZZ;
                    String str14 = c2391409Yq2.LJFF;
                    String str15 = c2391409Yq2.LJI;
                    if (context2 != null) {
                        try {
                            if (!MinisTtmgConfigSettings.LIZ().disableDecompressStreamMode && C0C64.LJIILLIIL().LJIJ(31744, 0, "minis_enable_decompress_stream_mode", true) != 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            C1293930jmB.LIZ.getClass();
                            C1293930jmB.LIZ(strLIZIZ2, str13, z5);
                            C2390609Yi.LJFF(str12, str14, str15);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            z6 = false;
                        }
                    } else {
                        z6 = false;
                    }
                }
                interfaceC2392009Yw.LIZ(c2391409Yq2, z6);
                C2390609Yi c2390609Yi2 = C2390609Yi.LIZ;
                String str16 = c2391409Yq2.LJ;
                c2390609Yi2.getClass();
                C2390609Yi.LIZIZ.remove(str16);
                C2390609Yi.LIZJ.remove(str16);
            }

            @Override // X.InterfaceC2391809Yu
            public final void LIZ(C2391409Yq c2391409Yq2, int i) {
                interfaceC2392009Yw.LIZIZ(c2391409Yq2, i);
            }

            @Override // X.InterfaceC2391809Yu
            public final void LIZLLL(C2391409Yq c2391409Yq2, Exception exc) {
                C2390609Yi c2390609Yi = C2390609Yi.LIZ;
                String str9 = c2391409Yq2.LJ;
                c2390609Yi.getClass();
                C2390609Yi.LIZIZ.remove(str9);
                C2390609Yi.LIZJ.remove(str9);
                interfaceC2392009Yw.LIZJ(c2391409Yq2, exc);
            }
        }, C09Z0.LIZJ(C844470XAv.LIZ(), str), null, false, 6912);
        LIZIZ.put(string, c2391409Yq);
        if (z3) {
            LIZJ.put(string, c2391409Yq);
        }
        C2391509Yr.LIZ.getClass();
        C2391509Yr.LIZ(c2391409Yq);
        return string;
    }
}
