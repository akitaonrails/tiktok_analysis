package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01sO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C470601sO {
    public static final C470601sO LIZ = new C470601sO();

    public static void LIZ(Throwable th) {
        Object c098200Yq;
        if (th instanceof CancellationException) {
            return;
        }
        C470501sN.LIZ.getClass();
        try {
            c098200Yq = C470501sN.LIZ(th);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String name = "";
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "";
        }
        String str = (String) c098200Yq;
        try {
            C0LX3 c0lx3 = C0LX3.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception caught, error_type=");
            sbLIZ.append(th.getClass().getName());
            sbLIZ.append(", error_msg=");
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            sbLIZ.append(message);
            sbLIZ.append(", stack_top=");
            sbLIZ.append(str);
            sbLIZ.append(", cause_type=");
            Throwable cause = th.getCause();
            if (cause != null) {
                name = cause.getClass().getName();
            }
            sbLIZ.append(name);
            C201955140j.LJIILL(c0lx3, "RunCatchUtils", C2188811AlT.LIZIZ(sbLIZ));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
        if (((Boolean) C470501sN.LIZIZ.getValue()).booleanValue()) {
            try {
                C189200o6.m2constructorimpl(C23250099c.LIZLLL(C470501sN.LIZJ, null, null, new C337001Sm(th, str, null), 3));
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                C189200o6.m2constructorimpl(new C098200Yq(th4));
            }
        }
        C844470XAv.LIZ.getClass();
        if (!Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
        } else {
            throw th;
        }
    }
}
