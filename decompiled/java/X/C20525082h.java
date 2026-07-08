package X;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.082h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20525082h {
    public static boolean LIZ;
    public static final ConcurrentHashMap<Integer, Throwable> LIZIZ = new ConcurrentHashMap<>();

    public static Throwable LIZ(String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mock_");
        sbLIZ.append(C19970013Bq.LIZJ(str.hashCode()));
        StackTraceElement stackTraceElement = new StackTraceElement("com.lynx.tasm.LynxView", C2188811AlT.LIZIZ(sbLIZ), "LynxView.java", 0);
        StackTraceElement[] stackTrace = th.getStackTrace();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + 1];
        stackTraceElementArr[0] = stackTraceElement;
        System.arraycopy(stackTrace, 0, stackTraceElementArr, 1, stackTrace.length);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(th.getMessage());
        sbLIZ2.append('_');
        sbLIZ2.append(str);
        RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
        runtimeException.setStackTrace((StackTraceElement[]) ((ArrayList) C13LQ.LJIJI(stackTraceElementArr)).toArray(new StackTraceElement[0]));
        return runtimeException;
    }
}
