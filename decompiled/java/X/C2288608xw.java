package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;

/* JADX INFO: renamed from: X.08xw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2288608xw {
    public static volatile Pair<? extends UploadImageConfig, String> LIZIZ;
    public static volatile String LIZJ;
    public static volatile long LIZLLL;
    public static volatile long LJ;
    public static WeakReference<InterfaceC2273608vW> LJIIJ;
    public static final C2288608xw LIZ = new C2288608xw();
    public static final ReentrantReadWriteLock LJFF = new ReentrantReadWriteLock();
    public static final C054G LJI = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final CopyOnWriteArrayList<C2290408yE> LJII = new CopyOnWriteArrayList<>();
    public static final int LJIIIIZZ = ((Number) C2291308yN.LIZ.getValue()).intValue();
    public static final long LJIIIZ = ((Number) C2291208yM.LIZ.getValue()).longValue();

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C1458410o3T.LIZ.getClass();
        sbLIZ.append(C570490MZb.LIZJ((String) C1458410o3T.LIZJ.getValue()));
        sbLIZ.append(SystemClock.elapsedRealtime());
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists()) {
            c0vsj.mkdir();
        }
        return c0vsj.getAbsolutePath();
    }

    public static String LIZJ() {
        String str = LIZJ;
        if (str == null || str.length() == 0) {
            LIZJ = LIZIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ame-extract-frames-");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".zip");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LIZJ);
        sbLIZ2.append(File.separator);
        sbLIZ2.append(strLIZIZ);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
        File parentFile = c0vsj.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("createUploadFile: ");
        sbLIZ3.append(c0vsj.getAbsolutePath());
        C201955140j.LJIILIIL("AIMusicConfigOptHelper", C2188811AlT.LIZIZ(sbLIZ3));
        return c0vsj.getAbsolutePath();
    }

    public static void LIZLLL() {
        boolean z = true;
        if (LIZLLL != 0 && LIZ() && (!LJII.isEmpty())) {
            z = false;
        }
        if (!z || System.currentTimeMillis() - LJ <= 1000) {
            C201955140j.LJIILIIL("AIMusicConfigOptHelper", "initAuthConfigASyncWithCheck noop------");
            return;
        }
        LJ = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initAuthConfigASync isGetConfigOpt:");
        sbLIZ.append(C2290508yF.LIZ());
        sbLIZ.append(", longSide:");
        sbLIZ.append(C2264908u7.LIZ());
        sbLIZ.append(" ,uploadResOpt:");
        sbLIZ.append(C2290708yH.LIZ());
        sbLIZ.append(" , musicInCapsule:");
        sbLIZ.append(C2296708zF.LIZ());
        sbLIZ.append(",  cache_time:");
        sbLIZ.append(C2290608yG.LIZ());
        C201955140j.LJIILIIL("AIMusicConfigOptHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (C2290508yF.LIZ()) {
            if (!C297690Blf.LIZ() || C0CHQ.LIZ().getAccountService().isLogin()) {
                C23250099c.LIZLLL(LJI, null, null, new C2273808vY(null), 3);
            }
        }
    }

    public static void LJI() {
        int i = LJIIIIZZ;
        CopyOnWriteArrayList<C2290408yE> copyOnWriteArrayList = LJII;
        int size = i - copyOnWriteArrayList.size();
        if (!(!copyOnWriteArrayList.isEmpty())) {
            C23250099c.LIZLLL(LJI, null, null, new C2288708xx(size, null), 3);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scheduleGenerateTasksIfNeeded return uploaderTasks size:");
        sbLIZ.append(copyOnWriteArrayList.size());
        C201955140j.LJFF("AIMusicConfigOptHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static boolean LIZ() {
        long jCurrentTimeMillis = (System.currentTimeMillis() - LIZLLL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        long jLIZ = C2290608yG.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkAuthKeyCacheValid deltaSeconds:");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", expiredSeconds:");
        sbLIZ.append(jLIZ);
        sbLIZ.append(", markAuthKeyTime:");
        sbLIZ.append(LIZLLL);
        C201955140j.LJIILIIL("AIMusicConfigOptHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (LIZLLL > 0 && jCurrentTimeMillis < jLIZ) {
            return true;
        }
        LJFF(Boolean.FALSE);
        C201955140j.LJIILIIL("AIMusicConfigOptHelper", "reset");
        return false;
    }

    public static void LJFF(Boolean bool) {
        int readHoldCount;
        LIZIZ = null;
        LIZLLL = 0L;
        for (C2290408yE c2290408yE : LJII) {
            try {
                ReentrantReadWriteLock reentrantReadWriteLock = LJFF;
                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                int i = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                    for (int i2 = 0; i2 < readHoldCount; i2++) {
                        lock.unlock();
                    }
                } else {
                    readHoldCount = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                if (c2290408yE != null) {
                    try {
                        c2290408yE.LIZ = null;
                        c2290408yE.LIZIZ = null;
                        C2207811Bb1 c2207811Bb1 = c2290408yE.LIZLLL;
                        if (c2207811Bb1 != null) {
                            c2207811Bb1.LIZJ();
                        }
                        c2290408yE.LIZLLL = null;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        while (i < readHoldCount) {
                            lock.lock();
                            i++;
                        }
                        writeLock.unlock();
                        throw th;
                    }
                }
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            } catch (C564610MCl e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJIILIIL("AIMusicConfigOptHelper", "resetUploaderPairs occur IOException");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resetUploaderPairs Unexpected error msg: ");
                sbLIZ.append(e2.getMessage());
                C201955140j.LJIILIIL("AIMusicConfigOptHelper", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        LJII.clear();
        C201955140j.LJIILIIL("AIMusicConfigOptHelper", "resetPreload");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("resetAuthKey isFail:");
        sbLIZ2.append(bool);
        C201955140j.LJIILIIL("AIMusicConfigOptHelper", C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super kotlin.Pair<? extends com.ss.android.ugc.aweme.publish.model.UploadImageConfig, java.lang.String>> r9) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2288608xw.LJ(X.05Vn):java.lang.Object");
    }
}
