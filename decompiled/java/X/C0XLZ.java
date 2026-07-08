package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import xlp.c;

/* JADX INFO: renamed from: X.0XLZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XLZ extends RuntimeException {
    public final IOException LL;
    public IOException LLILLJJLI;

    public IOException getFirstConnectException() {
        return this.LL;
    }

    public IOException getLastConnectException() {
        return this.LLILLJJLI;
    }

    public C0XLZ(IOException iOException) {
        super(iOException);
        this.LL = iOException;
        this.LLILLJJLI = iOException;
    }

    public void addConnectException(IOException iOException) {
        IOException iOException2 = this.LL;
        Method method = c.LJIILL;
        if (method != null) {
            try {
                C2204961BRm.a0(method, iOException2, new Object[]{iOException}, new C0WZX("ezR2SBYqDITVW0MkVxyFal/zgg34", null));
            } catch (IllegalAccessException | InvocationTargetException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LLILLJJLI = iOException;
    }
}
