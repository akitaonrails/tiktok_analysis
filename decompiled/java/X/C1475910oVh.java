package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0oVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475910oVh {
    public static C1475880oVe LIZ(String str) {
        C1475880oVe c1475880oVe = null;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length >= 4) {
            c1475880oVe = new C1475880oVe();
            if (!TextUtils.isEmpty(strArrSplit[0])) {
                c1475880oVe.LIZIZ = CastLongProtector.valueOf(strArrSplit[0]).longValue();
            }
            if (!TextUtils.isEmpty(strArrSplit[1])) {
                c1475880oVe.LIZ = CastLongProtector.valueOf(strArrSplit[1]).longValue();
            }
        }
        return c1475880oVe;
    }

    public static void LIZIZ(DataLoaderHelper dataLoaderHelper) {
        if (dataLoaderHelper.LIZIZ != 0) {
            return;
        }
        dataLoaderHelper.LJJ.LIZJ(1);
        try {
            AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIIZZ;
            if (aVMDLDataLoader == null) {
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZIZ("DataLoaderHelper", "mInnerDataLoader == null");
            } else {
                aVMDLDataLoader.clearAllCaches();
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        dataLoaderHelper.LJJ.LJFF(1);
    }

    public static C1475880oVe LIZJ(String str, DataLoaderHelper dataLoaderHelper) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        dataLoaderHelper.LJJ.LIZJ(1);
        try {
            if (dataLoaderHelper.LJIIIIZZ != null && dataLoaderHelper.LIZIZ == 0) {
                C1475880oVe c1475880oVeLIZ = LIZ(dataLoaderHelper.LJIIIIZZ.getStringCacheInfo(str));
                dataLoaderHelper.LJJ.LJFF(1);
                return c1475880oVeLIZ;
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        dataLoaderHelper.LJJ.LJFF(1);
        return null;
    }

    public static long LJ(String str, DataLoaderHelper dataLoaderHelper) {
        long j = 0;
        if (dataLoaderHelper.LIZIZ != 0) {
            return 0L;
        }
        dataLoaderHelper.LJJ.LIZJ(1);
        try {
            AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIIZZ;
            if (aVMDLDataLoader != null) {
                long cacheSize = aVMDLDataLoader.getCacheSize(str);
                if (cacheSize > 0) {
                    j = cacheSize;
                }
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        dataLoaderHelper.LJJ.LJFF(1);
        return j;
    }

    public static C1475880oVe LIZLLL(String str, long j, TimeUnit timeUnit, DataLoaderHelper dataLoaderHelper) {
        C1475880oVe c1475880oVeLIZ = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("****try get cacheinfo lock timeout");
            sbLIZ.append(j);
            TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (dataLoaderHelper.LJJ.LJ(j, timeUnit)) {
                TTVideoEngineLog.d("DataLoaderHelper", "####get cacheinfo lock suc");
                try {
                    if (dataLoaderHelper.LJIIIIZZ != null && dataLoaderHelper.LIZIZ == 0) {
                        c1475880oVeLIZ = LIZ(dataLoaderHelper.LJIIIIZZ.getStringCacheInfo(str));
                        TTVideoEngineLog.d("DataLoaderHelper", "get cacheinfo native end");
                        dataLoaderHelper.LJJ.LJFF(1);
                    } else {
                        TTVideoEngineLog.d("DataLoaderHelper", "get cacheinfo fail mdl not start");
                        dataLoaderHelper.LJJ.LJFF(1);
                        return null;
                    }
                } catch (Throwable th) {
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            int i2 = C2187451AjH.LIZ;
                            TTVideoEngineLog.d(th);
                            dataLoaderHelper.LJJ.LJFF(1);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            dataLoaderHelper.LJJ.LJFF(1);
                            throw th2;
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("get cacheinfo interrupt exception:");
                        sbLIZ2.append(e.getLocalizedMessage());
                        TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("####not get cacheinfo lock timeout");
                sbLIZ3.append(j);
                TTVideoEngineLog.d("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ3));
            }
        } catch (InterruptedException e2) {
            e = e2;
        }
        TTVideoEngineLog.d("DataLoaderHelper", "get cacheinfo all end");
        return c1475880oVeLIZ;
    }
}
