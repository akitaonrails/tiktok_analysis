package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.android.ugc.playerkit.exp.model.ExtCacheRootPathConfigExp;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttvideoengine.TTVideoEngine;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0oUK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475060oUK {
    public final EnginePreloader LIZ;
    public final C1478300oZY LIZIZ = C1478190oZN.LIZ();
    public String LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<String[], long[]> LIZJ() {
        long sizeMB;
        ExtCacheRootPathConfigExp extCacheRootPathConfigExp;
        Map<String, Boolean> removeOldRootPath;
        File[] fileArrListFiles;
        HashMap map = new HashMap();
        C0NKA[] c0nkaArrValues = C0NKA.values();
        int length = c0nkaArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            String absolutePath = null;
            if (i2 >= length) {
                break;
            }
            C0NKA c0nka = c0nkaArrValues[i2];
            if (c0nka == null || TextUtils.isEmpty(c0nka.getCacheDir())) {
                sizeMB = -1;
            } else {
                Long l = this.LIZIZ.getExperiment().getExCacheDirSizeConfig().get(c0nka.getCacheDir());
                sizeMB = (l == null || l.longValue() <= 0) ? c0nka.getSizeMB() : l.longValue();
            }
            boolean z = !TextUtils.isEmpty(c0nka.getCacheDir());
            boolean z2 = sizeMB > 0;
            if (z && z2) {
                String strLIZLLL = LIZLLL(c0nka);
                map.put(strLIZLLL, Long.valueOf(sizeMB));
                if (!TextUtils.isEmpty(c0nka.getCacheDir())) {
                    C0VSJ c0vsj = new C0VSJ(C1470280oMc.LIZ(c0nka) == 1 ? C1472720oQY.LIZ() : LJ(), c0nka.getCacheDir());
                    if (!((Boolean) C1474810oTv.t1.getValue()).booleanValue()) {
                        if (!c0vsj.isDirectory()) {
                            c0vsj.delete();
                        }
                        if (c0vsj.exists()) {
                            absolutePath = c0vsj.getAbsolutePath();
                        }
                    } else if (c0vsj.exists() && c0vsj.isDirectory()) {
                        absolutePath = c0vsj.getAbsolutePath();
                    }
                }
                if (!TextUtils.isEmpty(absolutePath) && !absolutePath.equals(strLIZLLL)) {
                    if (TextUtils.isEmpty(c0nka.getCacheDir()) || (extCacheRootPathConfigExp = (ExtCacheRootPathConfigExp) C1474810oTv.LLJILJIL.getValue()) == null || (removeOldRootPath = extCacheRootPathConfigExp.getRemoveOldRootPath()) == null || !removeOldRootPath.containsKey(c0nka.getCacheDir()) || !removeOldRootPath.get(c0nka.getCacheDir()).booleanValue()) {
                        map.put(absolutePath, Long.valueOf(sizeMB));
                    } else if (!TextUtils.isEmpty(absolutePath)) {
                        C0VSJ c0vsj2 = new C0VSJ(absolutePath);
                        if (c0vsj2.exists() && c0vsj2.isDirectory() && (fileArrListFiles = c0vsj2.listFiles()) != null) {
                            for (File file : fileArrListFiles) {
                                if (file.isDirectory()) {
                                    C2354809Ko.LJII(file);
                                } else {
                                    file.delete();
                                }
                            }
                            c0vsj2.delete();
                        }
                    }
                }
            }
            i2++;
        }
        if (map.size() <= 0) {
            return null;
        }
        this.LIZ.LJIJ = map;
        String[] strArr = new String[map.size()];
        long[] jArr = new long[map.size()];
        for (Map.Entry entry : map.entrySet()) {
            strArr[i] = entry.getKey();
            jArr[i] = ((Long) entry.getValue()).longValue() * 1048576;
            i++;
        }
        return new Pair<>(strArr, jArr);
    }

    public final String LJ() throws Throwable {
        if (!TextUtils.isEmpty(this.LIZJ)) {
            return this.LIZJ;
        }
        Application application = C1475000oUE.LIZ;
        if (application == null) {
            return null;
        }
        File fileLIZ = LIZ(application);
        if (C1474810oTv.LLI()) {
            if (C1475000oUE.LIZIZ().isDebug()) {
                fileLIZ = C786410Ut5.y2(application, null);
            }
            if (TextUtils.equals("playback_simulator_test", C1475000oUE.LIZIZ().getChannel())) {
                fileLIZ = C786410Ut5.y2(application, null);
            }
        }
        if (fileLIZ == null && (fileLIZ = LIZ(application)) == null) {
            return null;
        }
        String absolutePath = fileLIZ.getAbsolutePath();
        this.LIZJ = absolutePath;
        return absolutePath;
    }

    public C1475060oUK(EnginePreloader enginePreloader) {
        this.LIZ = enginePreloader;
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

    public final String LIZLLL(C0NKA c0nka) throws Throwable {
        String strLIZ;
        if (c0nka != null && !TextUtils.isEmpty(c0nka.getCacheDir())) {
            if (C1470280oMc.LIZ(c0nka) == 1) {
                strLIZ = LJ();
            } else {
                strLIZ = C1472720oQY.LIZ();
            }
            C0VSJ c0vsj = new C0VSJ(strLIZ, c0nka.getCacheDir());
            if (!c0vsj.isDirectory()) {
                c0vsj.delete();
            }
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            return c0vsj.getAbsolutePath();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJFF(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r2 = 0
            if (r0 != 0) goto La0
            boolean r0 = X.C1474810oTv.LLJLLL()
            if (r0 != 0) goto L1a
            X.0oZY r0 = r6.LIZIZ
            com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment r0 = r0.getExperiment()
            boolean r0 = r0.getUSE_CALLBACK_CACHE_SIZE()
            if (r0 == 0) goto L32
        L1a:
            com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader r0 = r6.LIZ
            java.util.Map<java.lang.String, X.0oV3> r0 = r0.LJIJJ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r7)
            X.0oV3 r0 = (X.C1475510oV3) r0
            if (r0 == 0) goto L2b
            long r0 = r0.LIZIZ
            return r0
        L2b:
            boolean r0 = X.C1474810oTv.LLJZ()
            if (r0 == 0) goto L32
            return r2
        L32:
            X.01GW r0 = X.C1474810oTv.LLLZLZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L99
            X.0oZY r0 = r6.LIZIZ
            com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment r0 = r0.getExperiment()
            boolean r0 = r0.enableUseNewGetCacheMethod()
            if (r0 != 0) goto L99
            X.01GW r0 = X.C1474810oTv.o
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L92
            com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader r0 = r6.LIZ
            r0.getClass()
            X.01GW r0 = X.C1474810oTv.p
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L77
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r1 != r0) goto L92
        L77:
            com.ss.ttvideoengine.DataLoaderHelper r1 = X.C805420Vie.LIZ
            X.01GW r0 = X.C1474810oTv.q
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.0oUL r0 = r1.LJIJJ(r7, r0, r4)
        L8b:
            if (r0 == 0) goto L8f
            long r2 = r0.LIZIZ
        L8f:
            int r0 = (int) r2
            long r0 = (long) r0
            return r0
        L92:
            com.ss.ttvideoengine.DataLoaderHelper r0 = X.C805420Vie.LIZ
            X.0oUL r0 = r0.LJIJI(r7)
            goto L8b
        L99:
            com.ss.ttvideoengine.DataLoaderHelper r0 = X.C805420Vie.LIZ
            long r0 = r0.LJJJLL(r7)
            return r0
        La0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1475060oUK.LJFF(java.lang.String):long");
    }

    public final long LJI(SimVideoUrlModel simVideoUrlModel) {
        String fileHash;
        if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
            SimBitRate hitDashVideoBitrate = simVideoUrlModel.getHitDashVideoBitrate();
            SimAudioBitrate hitDashAudioBitrate = simVideoUrlModel.getHitDashAudioBitrate();
            String fileHash2 = "";
            if (hitDashVideoBitrate == null) {
                fileHash = "";
            } else {
                fileHash = hitDashVideoBitrate.getPlayAddr().getFileHash();
            }
            if (hitDashAudioBitrate != null && hitDashAudioBitrate.getAudioMeta() != null) {
                fileHash2 = hitDashAudioBitrate.getAudioMeta().getFileHash();
            }
            if (!TextUtils.isEmpty(fileHash) || !TextUtils.isEmpty(fileHash2)) {
                return (int) (LJII(fileHash) + LJII(fileHash2));
            }
        }
        C1470240oMY c1470240oMY = (C1470240oMY) C1470290oMd.LIZIZ.get((Object) simVideoUrlModel.getDashVideoId());
        long jLJJIZ = 0;
        if (C1474810oTv.LJZL()) {
            if (c1470240oMY == null) {
                return 0L;
            }
            if (c1470240oMY.LIZJ != null) {
                C1474520oTS c1474520oTSLJJIJLIJ = TTVideoEngine.LJJIJLIJ(c1470240oMY, 0);
                if (c1474520oTSLJJIJLIJ != null) {
                    jLJJIZ = 0 + C805420Vie.LIZ.LJJIIZ(c1474520oTSLJJIJLIJ.LIZ(15));
                }
                C1474520oTS c1474520oTSLJJIJLIJ2 = TTVideoEngine.LJJIJLIJ(c1470240oMY, 1);
                if (c1474520oTSLJJIJLIJ2 != null) {
                    jLJJIZ += C805420Vie.LIZ.LJJIIZ(c1474520oTSLJJIJLIJ2.LIZ(15));
                }
            }
            return (int) jLJJIZ;
        }
        if (c1470240oMY == null) {
            return 0L;
        }
        if (c1470240oMY.LIZJ != null) {
            jLJJIZ = TTVideoEngine.LJJIZ(c1470240oMY, TTVideoEngine.LJJIJL(c1470240oMY, C1470290oMd.LIZ, 1));
        }
        return (int) jLJJIZ;
    }

    public final long LJII(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        if (C1474810oTv.LLJLLL() || this.LIZIZ.getExperiment().getUSE_CALLBACK_CACHE_SIZE()) {
            C1475510oV3 c1475510oV3 = (C1475510oV3) ((ConcurrentHashMap) this.LIZ.LJIJJ).get(str);
            if (c1475510oV3 != null) {
                return c1475510oV3.LIZIZ;
            }
            if (C1474810oTv.LLJZ()) {
                return 0L;
            }
        }
        return C805420Vie.LIZ.LJJIIJ(str);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0oVY] */
    public final void LIZIZ(String str, String str2, boolean z, boolean z2, final InterfaceC1475840oVa interfaceC1475840oVa) {
        if (TextUtils.isEmpty(str)) {
            this.LIZ.getClass();
            EnginePreloader.LJLILLLLZI(2, interfaceC1475840oVa);
        } else {
            TTVideoEngine.LJIILJJIL(new C1469210oKt(str, str2, z, z2, (C1475820oVY) new InterfaceC1475890oVf() { // from class: X.0oVY
                @Override // X.InterfaceC1475890oVf
                public final void LIZ(C1475880oVe c1475880oVe) {
                    InterfaceC1475840oVa interfaceC1475840oVa2 = interfaceC1475840oVa;
                    if (interfaceC1475840oVa2 != null) {
                        interfaceC1475840oVa2.LIZ(c1475880oVe.LIZ, c1475880oVe.LIZIZ);
                    }
                }

                @Override // X.InterfaceC1475890oVf
                public final void onCopyComplete(boolean z3, int i, String str3) {
                    InterfaceC1475840oVa interfaceC1475840oVa2 = interfaceC1475840oVa;
                    if (interfaceC1475840oVa2 != null) {
                        interfaceC1475840oVa2.onCopyComplete(z3, i, str3);
                    }
                }
            }));
        }
    }
}
