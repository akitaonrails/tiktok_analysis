package X;

import com.bytedance.android.alog.Alog;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.comp.api.logger.service.LoggerServiceDummy;

/* JADX INFO: renamed from: X.14yg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20441214yg {
    public static final InterfaceC20441114yf LIZ;

    static {
        ILoggerService loggerServiceDummy = (ILoggerService) C1161920gLG.LIZJ(ILoggerService.class);
        if (loggerServiceDummy == null) {
            loggerServiceDummy = new LoggerServiceDummy();
        }
        LIZ = loggerServiceDummy.Rp2();
    }

    public static boolean LIZJ() {
        return LIZ.LIZ();
    }

    public static void LIZ(String str) {
        LIZ.d("ALogger", str);
    }

    public static void LIZLLL(String str) {
        LIZ.e("ALogger", str);
        Alog alogLIZ = C827610WdL.LIZ().LIZ();
        if (alogLIZ != null) {
            alogLIZ.LJIILL(4, "ALogger", str);
        }
    }

    public static void LJII(Throwable th) {
        LIZ.e("ALogger", null, th);
    }

    public static void LJIIIIZZ(String str) {
        LIZ.i("ALogger", str);
        Alog alogLIZ = C827610WdL.LIZ().LIZ();
        if (alogLIZ != null) {
            alogLIZ.LJIILL(2, "ALogger", str);
        }
    }

    public static void LIZIZ(String str, String str2) {
        LIZ.d(str, str2);
    }

    public static void LJ(String str, String str2) {
        LIZ.e(str, str2);
        Alog alogLIZ = C827610WdL.LIZ().LIZ();
        if (alogLIZ != null) {
            alogLIZ.LJIILL(4, str, str2);
        }
    }

    public static void LJI(String str, Throwable th) {
        LIZ.e(str, null, th);
    }

    public static void LJIIIZ(String str, String str2) {
        LIZ.i(str, str2);
        Alog alogLIZ = C827610WdL.LIZ().LIZ();
        if (alogLIZ != null) {
            alogLIZ.LJIILL(2, str, str2);
        }
    }

    public static void LJIIJJI(String str, String str2) {
        LIZ.v(str, str2);
    }

    public static void LJIIL(String str, String str2) {
        LIZ.w(str, str2);
        Alog alogLIZ = C827610WdL.LIZ().LIZ();
        if (alogLIZ != null) {
            alogLIZ.LJIILL(3, str, str2);
        }
    }

    public static void LJFF(String str, String str2, Throwable th) {
        LIZ.e(str, str2, th);
    }

    public static void LJIIJ(int i, String str, StackTraceElement[] stackTraceElementArr) {
        LIZ.LIZIZ(i, str, stackTraceElementArr);
    }

    public static void LJIILIIL(String str, String str2, Throwable th) {
        LIZ.w(str, str2, th);
    }
}
