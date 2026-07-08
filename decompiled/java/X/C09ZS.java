package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.minis.settings.TtmgCoreConfigModel;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.09ZS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09ZS {
    public static final C09ZS LIZ = new C09ZS();
    public static final C0VSJ LIZIZ;
    public static final C0VSJ LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final C0VSJ LJFF;
    public static final C0VSJ LJI;
    public static final String LJII;
    public static File LJIIIIZZ;
    public static final Regex LJIIIZ;
    public static final Regex LJIIJ;
    public static C09ZW LJIIJJI;

    static {
        File fileLIZ;
        File fileLIZ2;
        File fileLIZ3;
        C844470XAv.LIZ.getClass();
        File fileY2 = C786410Ut5.y2(C844470XAv.LIZ(), null);
        if (fileY2 == null) {
            fileY2 = null;
        }
        LIZIZ = new C0VSJ(fileY2, "__debug_tag__");
        LIZJ = new C0VSJ(fileY2, "ttmg-core.js");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Context contextLIZ = C844470XAv.LIZ();
        sbLIZ.append((contextLIZ == null || (fileLIZ3 = LIZ(contextLIZ)) == null) ? null : fileLIZ3.getAbsolutePath());
        sbLIZ.append("/MinisNativeRuntime/Library/Caches/jssdk");
        LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        Context contextLIZ2 = C844470XAv.LIZ();
        sbLIZ2.append((contextLIZ2 == null || (fileLIZ2 = LIZ(contextLIZ2)) == null) ? null : fileLIZ2.getAbsolutePath());
        sbLIZ2.append("/MinisNativeRuntime/Library/Caches/jssdk/ttmg-core.js");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        Context contextLIZ3 = C844470XAv.LIZ();
        sbLIZ3.append((contextLIZ3 == null || (fileLIZ = LIZ(contextLIZ3)) == null) ? null : fileLIZ.getAbsolutePath());
        sbLIZ3.append("/MinisNativeRuntime/Library/Caches/jssdk/ttmg-core.js.zip");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        LJ = strLIZIZ2;
        LJFF = new C0VSJ(strLIZIZ2);
        LJI = new C0VSJ(strLIZIZ);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        File fileLIZ4 = LIZ(C844470XAv.LIZ());
        sbLIZ4.append(fileLIZ4 != null ? fileLIZ4.getAbsolutePath() : null);
        sbLIZ4.append("/MinisNativeRuntime/Library/Caches/jssdk/ttmg-core_online.js");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
        LJII = strLIZIZ3;
        LJIIIIZZ = new C0VSJ(strLIZIZ3);
        EnumC688760Qzy enumC688760Qzy = EnumC688760Qzy.IGNORE_CASE;
        EnumC688760Qzy enumC688760Qzy2 = EnumC688760Qzy.MULTILINE;
        LJIIIZ = new Regex("^\\s*\\*\\s*Version:\\s*([\\w\\.-]+)", (Set<? extends EnumC688760Qzy>) C13LQ.LJLIIL(new EnumC688760Qzy[]{enumC688760Qzy, enumC688760Qzy2}));
        LJIIJ = new Regex("^\\s*\\*\\s*CommitId:\\s*([\\w]+)", (Set<? extends EnumC688760Qzy>) C13LQ.LJLIIL(new EnumC688760Qzy[]{enumC688760Qzy, enumC688760Qzy2}));
    }

    public static C09ZW LIZJ() {
        if (LJIIJJI == null) {
            if (LJIIIIZZ.exists()) {
                LJIIJJI = LIZLLL(C09BH.LJI(LJIIIIZZ, Charsets.UTF_8));
            } else {
                C0VSJ c0vsj = LJI;
                if (c0vsj.exists()) {
                    LJIIJJI = LIZLLL(C09BH.LJI(c0vsj, Charsets.UTF_8));
                }
            }
        }
        return LJIIJJI;
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static C09ZW LIZLLL(String str) {
        String str2;
        List<String> listLIZ;
        String str3;
        List<String> listLIZ2;
        MatchResult matchResultFind$default = Regex.find$default(LJIIIZ, str, 0, 2, null);
        String str4 = "";
        if (matchResultFind$default == null || (listLIZ2 = matchResultFind$default.LIZ()) == null || (str2 = (String) ListProtector.get(listLIZ2, 1)) == null) {
            str2 = "";
        }
        MatchResult matchResultFind$default2 = Regex.find$default(LJIIJ, str, 0, 2, null);
        if (matchResultFind$default2 != null && (listLIZ = matchResultFind$default2.LIZ()) != null && (str3 = (String) ListProtector.get(listLIZ, 1)) != null) {
            str4 = str3;
        }
        return new C09ZW(str2, str4);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:19:0x0044
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJ(X.C09ZV r4) {
        /*
            X.0VSJ r0 = X.C09ZS.LIZIZ     // Catch: java.lang.Exception -> L50
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L4c
            X.0VSJ r2 = X.C09ZS.LIZJ     // Catch: java.lang.Exception -> L50
            boolean r0 = r2.exists()     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L4c
            java.lang.String r0 = "loadCoreJS from externalSourceFile"
            LJII(r4, r0)     // Catch: java.lang.Exception -> L50
            X.0VSP r1 = new X.0VSP     // Catch: java.lang.Exception -> L50
            r1.<init>(r2)     // Catch: java.lang.Exception -> L50
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> L50
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L50
            r3.<init>(r1, r0)     // Catch: java.lang.Exception -> L50
            boolean r0 = r3 instanceof java.io.BufferedReader     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L28
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3     // Catch: java.lang.Exception -> L50
            goto L30
        L28:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L50
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L50
            r3 = r1
        L30:
            r2 = 0
            java.lang.String r0 = X.C08KC.LIZJ(r3)     // Catch: java.lang.Throwable -> L3c
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Exception -> L50
            LJIIIIZZ(r4, r0)     // Catch: java.lang.Exception -> L50
            return
        L3c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L44
            throw r1     // Catch: java.lang.Throwable -> L41
        L41:
            r0 = move-exception
            r2 = r1
            goto L45
        L44:
            r0 = move-exception
        L45:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L44
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Exception -> L50
            throw r0     // Catch: java.lang.Exception -> L50
        L4c:
            LJI(r4)     // Catch: java.lang.Exception -> L50
            return
        L50:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "loadCoreJS"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LJII(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09ZS.LJ(X.09ZV):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:3:0x0009, B:6:0x0013, B:12:0x0051, B:19:0x0060, B:23:0x0069, B:28:0x0084, B:25:0x006f, B:27:0x007c, B:11:0x003a, B:29:0x00a8, B:31:0x00b0, B:33:0x00b6, B:34:0x00b9, B:35:0x00c8, B:9:0x0023), top: B:40:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJFF(X.C09ZV r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09ZS.LJFF(X.09ZV):java.lang.String");
    }

    public static void LJI(final C09ZV c09zv) {
        String strLIZ;
        C09ZU.LIZ.getClass();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        TtmgCoreConfigModel ttmgCoreConfigModel = C09ZU.LIZIZ;
        TtmgCoreConfigModel ttmgCoreConfigModel2 = (TtmgCoreConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ttmg_core_config", TtmgCoreConfigModel.class, ttmgCoreConfigModel);
        if (ttmgCoreConfigModel2 == null) {
            ttmgCoreConfigModel2 = ttmgCoreConfigModel;
        }
        String str = ttmgCoreConfigModel2.url;
        TtmgCoreConfigModel ttmgCoreConfigModel3 = (TtmgCoreConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("ttmg_core_config", TtmgCoreConfigModel.class, ttmgCoreConfigModel);
        if (ttmgCoreConfigModel3 == null) {
            ttmgCoreConfigModel3 = ttmgCoreConfigModel;
        }
        String str2 = ttmgCoreConfigModel3.md5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadOnlineTTMGCoreJSonlineTTMGCoreJSSettingMD5:");
        sbLIZ.append(str2);
        LJII(c09zv, C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            if (!LJIIIIZZ.exists() || (strLIZ = C2084408Eo.LIZ(LJIIIIZZ)) == null) {
                strLIZ = "";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadOnlineTTMGCoreJS onlineTtmgCoreJSFileMd5:");
            sbLIZ2.append(strLIZ);
            LJII(c09zv, C2188811AlT.LIZIZ(sbLIZ2));
            if (strLIZ.length() > 0 && str2.length() > 0 && Intrinsics.LJFF(strLIZ, str2)) {
                LJII(c09zv, "loadOnlineTTMGCoreJS onlineTtmgCoreJSFileMd5 == onlineTTMGCoreJSSettingMD5");
                LJIIIIZZ(c09zv, C09BH.LJI(LJIIIIZZ, Charsets.UTF_8));
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fetchOnlineTTMGCoreJs\nmd5:");
            sbLIZ3.append(str2);
            LJII(c09zv, C2188811AlT.LIZIZ(sbLIZ3));
            if (LJIIIIZZ.exists()) {
                LJIIIIZZ.delete();
                LJII(c09zv, "fetchOnlineTTMGCoreJs delete onlineTtmgCoreJSFile");
            }
            C2391409Yq c2391409Yq = new C2391409Yq(str, str2, "ttmg-core_online.js", LIZLLL, UUID.randomUUID().toString(), null, null, new InterfaceC2391809Yu() { // from class: X.09ZT
                @Override // X.InterfaceC2391809Yu
                public final void LIZIZ(C2391409Yq c2391409Yq2) {
                    C09ZS c09zs = C09ZS.LIZ;
                    C09ZV c09zv2 = c09zv;
                    c09zs.getClass();
                    C09ZS.LJII(c09zv2, "fetchOnlineTTMGCoreJs onTaskStart");
                }

                @Override // X.InterfaceC2391809Yu
                public final void LIZJ(C2391409Yq c2391409Yq2) throws Throwable {
                    String strLJI;
                    C09ZS c09zs = C09ZS.LIZ;
                    C09ZV c09zv2 = c09zv;
                    c09zs.getClass();
                    C09ZS.LJII(c09zv2, "fetchOnlineTTMGCoreJs onTaskFinish");
                    try {
                        C0VSJ c0vsj = new C0VSJ(C09ZS.LJII);
                        C09ZS.LJIIIIZZ = c0vsj;
                        if (c0vsj.exists()) {
                            strLJI = C09BH.LJI(C09ZS.LJIIIIZZ, Charsets.UTF_8);
                            if (strLJI != null) {
                            }
                            C09ZS.LJII(c09zv, "fetchOnlineTTMGCoreJs onlineTtmgCoreJSString isNullOrEmpty");
                            C09ZV c09zv3 = c09zv;
                            C09ZS.LJIIIIZZ(c09zv3, C09ZS.LJFF(c09zv3));
                        }
                        strLJI = "";
                        if (strLJI.length() != 0) {
                            C09ZS.LJIIIIZZ(c09zv, strLJI);
                            return;
                        }
                        C09ZS.LJII(c09zv, "fetchOnlineTTMGCoreJs onlineTtmgCoreJSString isNullOrEmpty");
                        C09ZV c09zv32 = c09zv;
                        C09ZS.LJIIIIZZ(c09zv32, C09ZS.LJFF(c09zv32));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C09ZS c09zs2 = C09ZS.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("fetchOnlineTTMGCoreJs onTaskFinish: ");
                        sbLIZ4.append(e);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                        C09ZV c09zv4 = c09zv;
                        c09zs2.getClass();
                        C09ZS.LJII(c09zv4, strLIZIZ);
                        C09ZV c09zv5 = c09zv;
                        C09ZS.LJIIIIZZ(c09zv5, C09ZS.LJFF(c09zv5));
                    }
                }

                @Override // X.InterfaceC2391809Yu
                public final void LIZ(C2391409Yq c2391409Yq2, int i) {
                    C09ZS c09zs = C09ZS.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("fetchOnlineTTMGCoreJs onTaskProgress, ");
                    sbLIZ4.append(i);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                    C09ZV c09zv2 = c09zv;
                    c09zs.getClass();
                    C09ZS.LJII(c09zv2, strLIZIZ);
                }

                @Override // X.InterfaceC2391809Yu
                public final void LIZLLL(C2391409Yq c2391409Yq2, Exception exc) {
                    C09ZS c09zs = C09ZS.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("fetchOnlineTTMGCoreJs onTaskError: ");
                    sbLIZ4.append(exc);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                    C09ZV c09zv2 = c09zv;
                    c09zs.getClass();
                    C09ZS.LJII(c09zv2, strLIZIZ);
                    C09ZV c09zv3 = c09zv;
                    C09ZS.LJIIIIZZ(c09zv3, C09ZS.LJFF(c09zv3));
                }
            }, "", null, false, 7008);
            C2391509Yr.LIZ.getClass();
            C2391509Yr.LIZ(c2391409Yq);
            return;
        }
        if (LJIIIIZZ.exists()) {
            LJIIIIZZ.delete();
            LJII(c09zv, "loadOnlineTTMGCoreJS delete onlineTtmgCoreJSFile");
        }
        LJIIIIZZ(c09zv, LJFF(c09zv));
    }

    public static void LIZIZ(String str, C09ZV c09zv) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("copyAssetFilePath assetZipFileName:");
        sbLIZ.append("native_runtime_server/game/scripts/ttmg-core.js.zip");
        sbLIZ.append(" \ntargetFilePath:");
        sbLIZ.append(str);
        LJII(c09zv, C2188811AlT.LIZIZ(sbLIZ));
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists() && c0vsj.length() > 0) {
            LJII(c09zv, "copyAssetFilePath file exists");
            c0vsj.getAbsolutePath();
            return;
        }
        C844470XAv.LIZ.getClass();
        InputStream inputStreamOpen = C844470XAv.LIZ().getAssets().open("native_runtime_server/game/scripts/ttmg-core.js.zip");
        Throwable th = null;
        try {
            C0VSV c0vsv = new C0VSV(c0vsj);
            try {
                byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                while (true) {
                    int i = inputStreamOpen.read(bArr);
                    if (i != -1) {
                        c0vsv.write(bArr, 0, i);
                    } else {
                        c0vsv.flush();
                        C2107108Nh.LIZ(c0vsv, null);
                        C2107108Nh.LIZ(inputStreamOpen, null);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("copyAssetFilePath copy success, file path: ");
                        sbLIZ2.append(c0vsj.getAbsolutePath());
                        LJII(c09zv, C2188811AlT.LIZIZ(sbLIZ2));
                        c0vsj.getAbsolutePath();
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(c0vsv, th);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th = null;
                }
            }
        } catch (Throwable th6) {
            try {
                TryCatchGuardChecker.doCheck(th6);
            } catch (Throwable th7) {
                th = th7;
            }
            try {
                throw th6;
            } catch (Throwable th8) {
                th = th8;
                th = th6;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(inputStreamOpen, th);
                        throw th;
                    } catch (Throwable th9) {
                        th = th9;
                    }
                }
            }
        }
    }

    public static void LJII(C09ZV c09zv, String str) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("MinisNativeTTMGCoreJSManager", str);
        if (c09zv != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MinisNativeTTMGCoreJSManager:  ");
            sbLIZ.append(str);
            c09zv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJIIIIZZ(C09ZV c09zv, String str) {
        LJIIJJI = LIZLLL(str);
        if (c09zv != null) {
            c09zv.LIZ(str);
        }
    }
}
