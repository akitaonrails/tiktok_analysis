package X;

import com.bytedance.pia.core.tracing.EventName;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BPW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public /* synthetic */ class C1BPW {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EventName.values().length];
        LIZ = iArr;
        try {
            iArr[EventName.NavigateStart.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EventName.WorkerEnvironmentInitializeStart.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[EventName.WorkerEnvironmentInitializeEnd.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[EventName.WorkerScriptRequestStart.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            LIZ[EventName.WorkerScriptRequestEnd.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            LIZ[EventName.WorkerExecuteStart.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
    }
}
