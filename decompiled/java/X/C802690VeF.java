package X;

import Y.ARunnableS113S0100000_13;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.crash.ICommonParams;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0VeF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802690VeF extends C802790VeP {
    public final ICommonParams LJIILLIIL;
    public String LJIJJ;
    public boolean LJIJJLI;
    public final RunnableC802960Veg LJJ;
    public final C803310VfF LJIIZILJ = new C803310VfF();
    public final C803310VfF LJIJ = new C803310VfF();
    public final C803310VfF LJIJI = new C803310VfF();
    public int LJIL = 3;

    @Override // X.C802680VeE, com.bytedance.crash.monitor.f
    public final String LIZ() {
        if (this.LIZLLL == null) {
            LJJ();
        }
        return super.LIZ();
    }

    @Override // X.C802680VeE, com.bytedance.crash.monitor.f
    public final String LIZIZ() {
        if (this.LJI == null) {
            LJJ();
        }
        return super.LIZIZ();
    }

    @Override // X.C802790VeP, com.bytedance.crash.monitor.f
    public final Map<String, Object> LIZJ() {
        ICommonParams iCommonParams = this.LJIILLIIL;
        HashMap map = null;
        if (iCommonParams != null) {
            Map<String, Object> commonParams = iCommonParams.getCommonParams();
            if (commonParams != null) {
                map = new HashMap(commonParams);
                if (map.containsKey("version_name")) {
                    try {
                        if (!map.containsKey("app_version")) {
                            map.put("app_version", map.get("version_name"));
                            map.put("app_version_from_name", "1");
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                map.remove("release_build");
            }
            String sessionId = this.LJIILLIIL.getSessionId();
            long userId = this.LJIILLIIL.getUserId();
            if (sessionId != null || userId > 0) {
                if (map == null) {
                    map = new HashMap();
                }
                if (sessionId != null) {
                    map.put("session_id", sessionId);
                }
                if (userId > 0) {
                    map.put("user_id", Long.valueOf(userId));
                }
            }
        }
        return map;
    }

    @Override // X.C802680VeE, com.bytedance.crash.monitor.f
    public final long LJFF() {
        if (this.LJII == null || this.LJIIIIZZ == 0) {
            LJJ();
        }
        return super.LJFF();
    }

    @Override // X.C802680VeE, com.bytedance.crash.monitor.f
    public final long LJI() {
        if (this.LJ == 0) {
            if (C0VXF.LIZIZ() == C786410Ut5.u3()) {
                LJIJJLI();
            } else {
                C0VXF.post(new ARunnableS113S0100000_13(this, 65));
                this.LJIJI.LIZ(200L);
            }
        }
        return super.LJI();
    }

    @Override // X.C802680VeE, com.bytedance.crash.monitor.f
    public final C803540Vfc LJII() {
        if (this.LJII == null || this.LJIIIIZZ == 0) {
            LJJ();
        }
        return super.LJII();
    }

    @Override // X.C802680VeE, com.bytedance.crash.monitor.f
    public final long LJIIIIZZ() {
        if (this.LJII == null || this.LJIIIIZZ == 0) {
            LJJ();
        }
        return super.LJIIIIZZ();
    }

    @Override // X.C802680VeE, com.bytedance.crash.monitor.f
    public final String LJIIIZ() {
        if (this.LJII == null || this.LJIIIIZZ == 0) {
            LJJ();
        }
        return super.LJIIIZ();
    }

    @Override // X.C802680VeE
    public final long LJIILJJIL() {
        if (this.LJII == null || this.LJIIIIZZ == 0) {
            LJJ();
        }
        return super.LJIILJJIL();
    }

    public final void LJIJJ() {
        try {
            String deviceId = this.LJIILLIIL.getDeviceId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("doUpdateDeviceId:");
            sbLIZ.append(deviceId);
            C2188811AlT.LIZIZ(sbLIZ);
            if (deviceId != null) {
                LJIIL(deviceId);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C801940Vd2.LIZJ(th);
        }
    }

    public final void LJIJJLI() {
        try {
            long userId = this.LJIILLIIL.getUserId();
            if (userId != 0) {
                LJIILLIIL(userId);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C801940Vd2.LIZJ(th);
        }
    }

    public final void LJIJI() {
        Object objValueOf;
        Object obj;
        try {
            Map<String, Object> commonParams = this.LJIILLIIL.getCommonParams();
            if (this.LIZLLL == null && (obj = commonParams.get("aid")) != null) {
                String strValueOf = String.valueOf(obj);
                this.LIZLLL = strValueOf;
                this.LJIIL.LJII(strValueOf);
            }
            LJIJ(commonParams);
            if (this.LJI == null) {
                Object obj2 = commonParams.get("channel");
                if (obj2 instanceof String) {
                    LJIIJJI((String) obj2);
                }
            }
            if (this.LJII == null || this.LJIIIIZZ == 0 || this.LJIJJ == null) {
                Object obj3 = commonParams.get("app_version");
                Object objValueOf2 = commonParams.get("version_code");
                Object obj4 = commonParams.get("version_name");
                if (obj4 instanceof String) {
                    this.LJIJJ = (String) obj4;
                }
                String str = this.LJIJJ;
                if (str != null) {
                    obj3 = str;
                }
                if (obj3 instanceof String) {
                    PackageInfo packageInfoY3 = null;
                    if (objValueOf2 == null) {
                        packageInfoY3 = C786410Ut5.Y3(C0VX9.LJ().getPackageManager(), C0VX9.LJ().getPackageName(), 128);
                        objValueOf2 = Integer.valueOf(packageInfoY3.versionCode);
                    }
                    long jLJIL = LJIL(commonParams.get("manifest_version_code"));
                    long jLJIL2 = LJIL(commonParams.get("update_version_code"));
                    if (jLJIL2 == 0) {
                        if (packageInfoY3 == null) {
                            try {
                                packageInfoY3 = C786410Ut5.Y3(C0VX9.LJ().getPackageManager(), C0VX9.LJ().getPackageName(), 128);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        Bundle bundle = packageInfoY3.applicationInfo.metaData;
                        if (bundle != null) {
                            try {
                                try {
                                    objValueOf = bundle.get("UPDATE_VERSION_CODE");
                                } catch (OutOfMemoryError e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                            if (objValueOf == null) {
                                objValueOf = Long.valueOf(LJIL(commonParams.get("version_code")));
                            }
                            jLJIL2 = LJIL(objValueOf);
                        } else {
                            objValueOf = Long.valueOf(LJIL(commonParams.get("version_code")));
                            jLJIL2 = LJIL(objValueOf);
                        }
                    }
                    if ((objValueOf2 instanceof Long) || (objValueOf2 instanceof Integer) || (objValueOf2 instanceof String)) {
                        try {
                            long jLJIL3 = LJIL(objValueOf2);
                            if (jLJIL <= 0) {
                                jLJIL = jLJIL3;
                            }
                            String str2 = (String) obj3;
                            this.LJIIJ = jLJIL2;
                            this.LJIIIIZZ = jLJIL3;
                            this.LJII = str2;
                            this.LJIIIZ = jLJIL;
                            this.LJIIL.LJIIIIZZ(jLJIL3, jLJIL2, jLJIL, str2);
                            C0VX9.LJII(jLJIL3, jLJIL2, jLJIL, str2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            C801940Vd2.LIZJ(th2);
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    public final void LJJ() {
        if (C0VXF.LIZIZ() == C786410Ut5.u3()) {
            LJIJI();
        } else {
            C0VXF.post(new ARunnableS113S0100000_13(this, 63));
            this.LJIIZILJ.LIZ(200L);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Veg, java.lang.Runnable] */
    public C802690VeF(ICommonParams iCommonParams) {
        ?? r2 = new Runnable() { // from class: X.0Veg
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("InnerAppMonitor@cd10.<field>$1");
                try {
                    r1.LJIL--;
                    if (this.LL.LJ == 0) {
                        this.LL.LJIJJLI();
                    }
                    C802690VeF c802690VeF = this.LL;
                    if (c802690VeF.LJIL > 0 && c802690VeF.LJ == 0) {
                        C0VXF.postDelayed(this.LL.LJJ, 3000L);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("InnerAppMonitor@cd10.<field>$1");
            }
        };
        this.LJJ = r2;
        this.LJIILLIIL = iCommonParams;
        C0VXF.post(new Runnable() { // from class: X.0VeX
            public int LL;

            public final void LIZ() {
                if (this.LLILLJJLI.LJFF == null) {
                    this.LLILLJJLI.LJIJJ();
                }
                if (this.LLILLJJLI.LIZLLL == null || this.LLILLJJLI.LJI == null || this.LLILLJJLI.LJII == null || this.LLILLJJLI.LJIIIIZZ == 0 || this.LLILLJJLI.LJIJJ == null) {
                    this.LLILLJJLI.LJIJI();
                }
                if (this.LLILLJJLI.LJFF != null && this.LLILLJJLI.LIZLLL != null && this.LLILLJJLI.LJI != null) {
                    C802690VeF c802690VeF = this.LLILLJJLI;
                    if (c802690VeF.LJIJJ != null && c802690VeF.LJII != null && this.LLILLJJLI.LJIIIIZZ != 0) {
                        return;
                    }
                }
                int i = this.LL + 1;
                this.LL = i;
                if (i <= 120) {
                    C0VXF.postDelayed(this, i < 30 ? 2000L : i < 60 ? Mp4ScreenVideoLoadTimeout.CONTROL : 600000L);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("InnerAppMonitor$InitParamsUpdateTask@bf5f.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("InnerAppMonitor$InitParamsUpdateTask@bf5f.run");
            }
        });
        C0VXF.postDelayed(r2, 3000L);
    }

    public static long LJIL(Object obj) {
        if (obj == null) {
            return 0L;
        }
        try {
            return CastLongProtector.parseLong(String.valueOf(obj));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    @Override // X.C802680VeE, com.bytedance.crash.monitor.f
    public final String LIZLLL(String str) {
        if (TextUtils.isEmpty(this.LJFF)) {
            if (C0VXF.LIZIZ() == C786410Ut5.u3()) {
                LJIJJ();
            } else {
                C0VXF.post(new ARunnableS113S0100000_13(this, 64));
                this.LJIJ.LIZ(100L);
            }
        }
        return super.LIZLLL(str);
    }

    public final void LJIJ(Map<String, Object> map) {
        Object obj;
        long jLongValue;
        try {
            if (this.LJIJJLI || (obj = map.get("app_start_time")) == null) {
                return;
            }
            long jLJIL = LJIL(obj);
            if (jLJIL > 0) {
                this.LJIJJLI = true;
                Long lValueOf = Long.valueOf(jLJIL);
                C0VX9 c0vx9LIZIZ = C0VX9.LIZIZ();
                if (lValueOf.longValue() < C0VX9.LIZIZ().LIZLLL) {
                    jLongValue = lValueOf.longValue();
                } else {
                    jLongValue = C0VX9.LIZIZ().LIZLLL;
                }
                c0vx9LIZIZ.LIZLLL = jLongValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
