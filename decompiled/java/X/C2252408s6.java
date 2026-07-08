package X;

import Y.ACallableS411S0100000_3;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08s6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2252408s6 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C2252508s7());

    public static final boolean LJI() {
        return C786410Ut5.u3() == Looper.getMainLooper().getThread();
    }

    public static final void LIZ(final Function0 function0) {
        C15O7.LIZIZ(new Callable() { // from class: X.087O
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("PerfExtKt@17a.asyncCall$1");
                try {
                    function0.invoke();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LIZIZ("PerfExt", "asyncCall error", th);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PerfExtKt@17a.asyncCall$1");
                return unit;
            }
        }, C15O7.LJI, null);
    }

    public static final int LIZIZ(Throwable th) {
        if (!(th instanceof C0XIR)) {
            return -1;
        }
        return ((C23112093u) th).getErrorCode();
    }

    public static final String LIZJ(Throwable th) {
        BaseResponse baseResponse;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        String str;
        if (!(th instanceof C0XIR)) {
            return "";
        }
        Object rawResponse = ((C0XIR) th).getRawResponse();
        if (!(rawResponse instanceof BaseResponse) || (baseResponse = (BaseResponse) rawResponse) == null || (serverTimeExtra = baseResponse.extra) == null || (str = serverTimeExtra.logid) == null) {
            return "";
        }
        return str;
    }

    public static final BaseResponse.ServerTimeExtra LIZLLL(Throwable th) {
        BaseResponse baseResponse;
        if (!(th instanceof C0XIR)) {
            return null;
        }
        Object rawResponse = ((C0XIR) th).getRawResponse();
        if (!(rawResponse instanceof BaseResponse) || (baseResponse = (BaseResponse) rawResponse) == null) {
            return null;
        }
        return baseResponse.extra;
    }

    public static final int LJ(Throwable th) {
        BaseResponse baseResponse;
        if (!(th instanceof C0XIR)) {
            return -1;
        }
        Object rawResponse = ((C0XIR) th).getRawResponse();
        if (!(rawResponse instanceof BaseResponse) || (baseResponse = (BaseResponse) rawResponse) == null) {
            return -1;
        }
        return baseResponse.status_code;
    }

    public static final String LJFF(Throwable th) {
        BaseResponse baseResponse;
        String str;
        if (!(th instanceof C0XIR)) {
            return "";
        }
        Object rawResponse = ((C0XIR) th).getRawResponse();
        if (!(rawResponse instanceof BaseResponse) || (baseResponse = (BaseResponse) rawResponse) == null || (str = baseResponse.status_msg) == null) {
            return "";
        }
        return str;
    }

    public static final void LJII(Function0<Unit> function0) {
        if (LJI()) {
            function0.invoke();
        } else {
            LJIIIIZZ(function0);
        }
    }

    public static final void LJIIIIZZ(Function0 function0) {
        C15O7.LIZIZ(new ACallableS411S0100000_3(function0, 37), C15O7.LJIIIIZZ, null);
    }

    public static final C15O7<Unit> LJIIIZ(final Function0<Unit> function0) {
        return C15O7.LIZIZ(new Callable() { // from class: X.087S
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("PerfExtKt@17a.serialCall$1");
                try {
                    function0.invoke();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LIZIZ("PerfExt", "serialCall error", th);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PerfExtKt@17a.serialCall$1");
                return unit;
            }
        }, (Executor) LIZ.getValue(), null);
    }

    public static final void LJIIJ(final String str, final Function0 function0) {
        final long jUptimeMillis = SystemClock.uptimeMillis();
        C15O7.LIZIZ(new Callable() { // from class: X.087V
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("PerfExtKt@17a.serialCall$2");
                try {
                    final String str2 = str;
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    long j = jUptimeMillis;
                    final long j2 = jUptimeMillis2 - j;
                    if (((Number) C087W.LIZ.getValue()).intValue() == 1) {
                        long j3 = C1618800sEA.LIZ;
                        final long j4 = j3 == 0 ? -1L : j - j3;
                        C15O7.LIZJ(new Callable() { // from class: X.05X7
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C1C7U.LIZ("InboxBadgePerfTracker@a867.reportSerialCallAsync$1");
                                JSONObject jSONObject = new JSONObject();
                                String str3 = str2;
                                long j5 = j2;
                                long j6 = j4;
                                try {
                                    jSONObject.put("task_name", str3);
                                    jSONObject.put("queue_latency_ms", j5);
                                    C189200o6.m2constructorimpl(jSONObject.put("commit_after_boot_ms", j6));
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                                int i = C2187451AjH.LIZ;
                                C1720106oR.LJI("InboxBadgeTracker", "report inbox_serial_call_monitor:" + jSONObject);
                                C20684815ws.LJIJ("inbox_serial_call_monitor", jSONObject);
                                Unit unit = Unit.LIZ;
                                C1C7U.LIZIZ("InboxBadgePerfTracker@a867.reportSerialCallAsync$1");
                                return unit;
                            }
                        });
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LIZIZ("PerfExt", "serialCall monitor error", th);
                }
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    int i2 = C2187451AjH.LIZ;
                    C1720106oR.LIZIZ("PerfExt", "serialCall error", th2);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PerfExtKt@17a.serialCall$2");
                return unit;
            }
        }, (Executor) LIZ.getValue(), null);
    }
}
