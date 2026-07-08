package X;

import com.bytedance.android.btm.impl.setting.FeatureModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.18EG, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EG {
    public static volatile long LIZ;
    public static final ConcurrentHashMap<Integer, Integer> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZIZ(final int i, final String str) {
        int iIntValue;
        FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
        featureModelLIZJ.getClass();
        Object objLIZIZ = C1972007ny.LIZIZ(featureModelLIZJ, "upload_alog_switch", Integer.valueOf(featureModelLIZJ.uploadALog));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = featureModelLIZJ.uploadALog;
        }
        featureModelLIZJ.uploadALog = iIntValue;
        if (iIntValue == 1) {
            FeatureModel featureModelLIZJ2 = C18CS.LIZ.LIZJ();
            featureModelLIZJ2.getClass();
            ArrayList arrayListLIZ = C1972007ny.LIZ(featureModelLIZJ2, featureModelLIZJ2.uploadALogErrorCodeList, Integer.TYPE, "upload_alog_errCode_list");
            featureModelLIZJ2.uploadALogErrorCodeList = arrayListLIZ;
            if (arrayListLIZ.contains(Integer.valueOf(i))) {
                C18GQ.LL.getClass();
                if (C18GQ.LLILLL) {
                    final long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    final long jLJIIZILJ = jCurrentTimeMillis - C18CS.LIZ.LIZJ().LJIIZILJ();
                    C18GU c18gu = C18GU.LIZ;
                    Runnable runnable = new Runnable() { // from class: X.18Gb
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            String str2 = str;
                            long j = jLJIIZILJ;
                            long j2 = jCurrentTimeMillis;
                            C1C7U.LIZ("ALogUploader@25d.upload$1L");
                            C18EG.LIZ(i2, j, j2, str2);
                            C1C7U.LIZIZ("ALogUploader@25d.upload$1L");
                        }
                    };
                    c18gu.getClass();
                    C18GU.LJ(runnable);
                    return;
                }
                final C238400w2 c238400w2 = new C238400w2();
                c238400w2.element = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                C18GU c18gu2 = C18GU.LIZ;
                Runnable runnable2 = new Runnable() { // from class: X.18Em
                    @Override // java.lang.Runnable
                    public final void run() {
                        C238400w2 c238400w22 = c238400w2;
                        int i2 = i;
                        String str2 = str;
                        C1C7U.LIZ("ALogUploader@25d.upload$2L");
                        long jCurrentTimeMillis2 = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        long jMin = Math.min(c238400w22.element, jCurrentTimeMillis2 - C18CS.LIZ.LIZJ().LJIIZILJ());
                        c238400w22.element = jMin;
                        C18EG.LIZ(i2, jMin, jCurrentTimeMillis2, str2);
                        C1C7U.LIZIZ("ALogUploader@25d.upload$2L");
                    }
                };
                long jLIZIZ = C18CS.LIZ.LIZLLL().LIZIZ();
                c18gu2.getClass();
                C18GU.LIZLLL(jLIZIZ, runnable2);
            }
        }
    }

    public static void LIZ(int i, long j, long j2, String str) {
        int iIntValue;
        if (j >= LIZ) {
            ConcurrentHashMap<Integer, Integer> concurrentHashMap = LIZIZ;
            Integer num = concurrentHashMap.get(Integer.valueOf(i));
            if (num != null) {
                if (num.intValue() > 0) {
                    iIntValue = num.intValue();
                } else {
                    return;
                }
            } else {
                FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
                featureModelLIZJ.getClass();
                Object objLIZIZ = C1972007ny.LIZIZ(featureModelLIZJ, "upload_times_per_err", Integer.valueOf(featureModelLIZJ.uploadTimesPerErr));
                if (!(objLIZIZ instanceof Integer)) {
                    objLIZIZ = null;
                }
                Integer num2 = (Integer) objLIZIZ;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = featureModelLIZJ.uploadTimesPerErr;
                }
                featureModelLIZJ.uploadTimesPerErr = iIntValue;
            }
            concurrentHashMap.put(Integer.valueOf(i), Integer.valueOf(iIntValue - 1));
            try {
                C18IP c18ip = C18IP.LIZ;
                c18ip.getClass();
                InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) C18IP.LJJIIJ.getValue(c18ip, C18IP.LIZIZ[23]);
                if (interfaceC1631620sYq != null) {
                    interfaceC1631620sYq.invoke(Long.valueOf(j), Long.valueOf(j2), str);
                }
                LIZ = j2;
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
